package es.usj.raspduino.generator.arduino

import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.Model

class TimeAlarmsLibraries {
	
	// Procedimiento principal desde donde se llama al resto de procedimiento, uno por archivo generado.
	def generateCode(Model model, Util util){		
		// Comprobamos si existen declaraciones de timer o alarms antes de generar las librerias
		if(!model.timers.empty)
			generateTimeH(util);
			generateTimeCpp(util);
			generateTimeAlarmsH(util);
			generateTimeAlarmsCpp(util);
	}
	
	def generateTimeH(Util util){
		// String donde iremos generando el codigo
		var String code = "";
		
		code = "
/*
  time.h - low level time and date functions
*/

/*
  July 3 2011 - fixed elapsedSecsThisWeek macro (thanks Vincent Valdy for this)
              - fixed  daysToTime_t macro (thanks maniacbug)
*/     

#ifndef _Time_h
#ifdef __cplusplus
#define _Time_h

#include <inttypes.h>
#ifndef __AVR__
#include <sys/types.h> // for __time_t_defined, but avr libc lacks sys/types.h
#endif


#if !defined(__time_t_defined) // avoid conflict with newlib or other posix libc
typedef unsigned long time_t;
#endif


// This ugly hack allows us to define C++ overloaded functions, when included
// from within an extern \"C\", as newlib's sys/stat.h does.  Actually it is
// intended to include \"time.h\" from the C library (on ARM, but AVR does not
// have that file at all).  On Mac and Windows, the compiler will find this
// \"Time.h\" instead of the C library \"time.h\", so we may cause other weird
// and unpredictable effects by conflicting with the C library header \"time.h\",
// but at least this hack lets us define C++ functions as intended.  Hopefully
// nothing too terrible will result from overriding the C library header?!
extern \"C++\" {
typedef enum {timeNotSet, timeNeedsSync, timeSet
}  timeStatus_t ;

typedef enum {
    dowInvalid, dowSunday, dowMonday, dowTuesday, dowWednesday, dowThursday, dowFriday, dowSaturday
} timeDayOfWeek_t;

typedef enum {
    tmSecond, tmMinute, tmHour, tmWday, tmDay,tmMonth, tmYear, tmNbrFields
} tmByteFields;	   

typedef struct  { 
  uint8_t Second; 
  uint8_t Minute; 
  uint8_t Hour; 
  uint8_t Wday;   // day of week, sunday is day 1
  uint8_t Day;
  uint8_t Month; 
  uint8_t Year;   // offset from 1970; 
} 	tmElements_t, TimeElements, *tmElementsPtr_t;

//convenience macros to convert to and from tm years 
#define  tmYearToCalendar(Y) ((Y) + 1970)  // full four digit year 
#define  CalendarYrToTm(Y)   ((Y) - 1970)
#define  tmYearToY2k(Y)      ((Y) - 30)    // offset is from 2000
#define  y2kYearToTm(Y)      ((Y) + 30)   

typedef time_t(*getExternalTime)();
//typedef void  (*setExternalTime)(const time_t); // not used in this version


/*==============================================================================*/
/* Useful Constants */
#define SECS_PER_MIN  (60UL)
#define SECS_PER_HOUR (3600UL)
#define SECS_PER_DAY  (SECS_PER_HOUR * 24UL)
#define DAYS_PER_WEEK (7UL)
#define SECS_PER_WEEK (SECS_PER_DAY * DAYS_PER_WEEK)
#define SECS_PER_YEAR (SECS_PER_WEEK * 52UL)
#define SECS_YR_2000  (946684800UL) // the time at the start of y2k
 
/* Useful Macros for getting elapsed time */
#define numberOfSeconds(_time_) (_time_ % SECS_PER_MIN)  
#define numberOfMinutes(_time_) ((_time_ / SECS_PER_MIN) % SECS_PER_MIN) 
#define numberOfHours(_time_) (( _time_% SECS_PER_DAY) / SECS_PER_HOUR)
#define dayOfWeek(_time_)  ((( _time_ / SECS_PER_DAY + 4)  % DAYS_PER_WEEK)+1) // 1 = Sunday
#define elapsedDays(_time_) ( _time_ / SECS_PER_DAY)  // this is number of days since Jan 1 1970
#define elapsedSecsToday(_time_)  (_time_ % SECS_PER_DAY)   // the number of seconds since last midnight 
// The following macros are used in calculating alarms and assume the clock is set to a date later than Jan 1 1971
// Always set the correct time before settting alarms
#define previousMidnight(_time_) (( _time_ / SECS_PER_DAY) * SECS_PER_DAY)  // time at the start of the given day
#define nextMidnight(_time_) ( previousMidnight(_time_)  + SECS_PER_DAY )   // time at the end of the given day 
#define elapsedSecsThisWeek(_time_)  (elapsedSecsToday(_time_) +  ((dayOfWeek(_time_)-1) * SECS_PER_DAY) )   // note that week starts on day 1
#define previousSunday(_time_)  (_time_ - elapsedSecsThisWeek(_time_))      // time at the start of the week for the given time
#define nextSunday(_time_) ( previousSunday(_time_)+SECS_PER_WEEK)          // time at the end of the week for the given time


/* Useful Macros for converting elapsed time to a time_t */
#define minutesToTime_t ((M)) ( (M) * SECS_PER_MIN)  
#define hoursToTime_t   ((H)) ( (H) * SECS_PER_HOUR)  
#define daysToTime_t    ((D)) ( (D) * SECS_PER_DAY) // fixed on Jul 22 2011
#define weeksToTime_t   ((W)) ( (W) * SECS_PER_WEEK)   

/*============================================================================*/
/*  time and date functions   */
int     hour();            // the hour now 
int     hour(time_t t);    // the hour for the given time
int     hourFormat12();    // the hour now in 12 hour format
int     hourFormat12(time_t t); // the hour for the given time in 12 hour format
uint8_t isAM();            // returns true if time now is AM
uint8_t isAM(time_t t);    // returns true the given time is AM
uint8_t isPM();            // returns true if time now is PM
uint8_t isPM(time_t t);    // returns true the given time is PM
int     minute();          // the minute now 
int     minute(time_t t);  // the minute for the given time
int     second();          // the second now 
int     second(time_t t);  // the second for the given time
int     day();             // the day now 
int     day(time_t t);     // the day for the given time
int     weekday();         // the weekday now (Sunday is day 1) 
int     weekday(time_t t); // the weekday for the given time 
int     month();           // the month now  (Jan is month 1)
int     month(time_t t);   // the month for the given time
int     year();            // the full four digit year: (2009, 2010 etc) 
int     year(time_t t);    // the year for the given time

time_t now();              // return the current time as seconds since Jan 1 1970 
void    setTime(time_t t);
void    setTime(int hr,int min,int sec,int day, int month, int yr);
void    adjustTime(long adjustment);

/* date strings */ 
#define dt_MAX_STRING_LEN 9 // length of longest date string (excluding terminating null)
char* monthStr(uint8_t month);
char* dayStr(uint8_t day);
char* monthShortStr(uint8_t month);
char* dayShortStr(uint8_t day);
	
/* time sync functions	*/
timeStatus_t timeStatus(); // indicates if time has been set and recently synchronized
void    setSyncProvider( getExternalTime getTimeFunction); // identify the external time provider
void    setSyncInterval(time_t interval); // set the number of seconds between re-sync

/* low level functions to convert to and from system time                     */
void breakTime(time_t time, tmElements_t &tm);  // break time_t into elements
time_t makeTime(tmElements_t &tm);  // convert time elements into time_t

} // extern \"C++\"
#endif // __cplusplus
#endif /* _Time_h */
";	
		// Generamos el archivo
		util.genFile("Time","h",code)
	}
	
	def generateTimeCpp(Util util){
		// String donde iremos generando el codigo
		var String code = "";
		
		code = "
/*
  time.c - low level time and date functions
  Copyright (c) Michael Margolis 2009

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public
  License along with this library; if not, write to the Free Software
  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
  
  6  Jan 2010 - initial release 
  12 Feb 2010 - fixed leap year calculation error
  1  Nov 2010 - fixed setTime bug (thanks to Korman for this)
  24 Mar 2012 - many edits by Paul Stoffregen: fixed timeStatus() to update
                status, updated examples for Arduino 1.0, fixed ARM
                compatibility issues, added TimeArduinoDue and TimeTeensy3
                examples, add error checking and messages to RTC examples,
                add examples to DS1307RTC library.
*/

#if ARDUINO >= 100
#include <Arduino.h> 
#else
#include <WProgram.h> 
#endif

#include  \"Time.h\"

static tmElements_t tm;          // a cache of time elements
static time_t cacheTime;   // the time the cache was updated
static uint32_t syncInterval = 300;  // time sync will be attempted after this many seconds

void refreshCache(time_t t) {
  if (t != cacheTime) {
    breakTime(t, tm); 
    cacheTime = t; 
  }
}

int hour() { // the hour now 
  return hour(now()); 
}

int hour(time_t t) { // the hour for the given time
  refreshCache(t);
  return tm.Hour;  
}

int hourFormat12() { // the hour now in 12 hour format
  return hourFormat12(now()); 
}

int hourFormat12(time_t t) { // the hour for the given time in 12 hour format
  refreshCache(t);
  if( tm.Hour == 0 )
    return 12; // 12 midnight
  else if( tm.Hour  > 12)
    return tm.Hour - 12 ;
  else
    return tm.Hour ;
}

uint8_t isAM() { // returns true if time now is AM
  return !isPM(now()); 
}

uint8_t isAM(time_t t) { // returns true if given time is AM
  return !isPM(t);  
}

uint8_t isPM() { // returns true if PM
  return isPM(now()); 
}

uint8_t isPM(time_t t) { // returns true if PM
  return (hour(t) >= 12); 
}

int minute() {
  return minute(now()); 
}

int minute(time_t t) { // the minute for the given time
  refreshCache(t);
  return tm.Minute;  
}

int second() {
  return second(now()); 
}

int second(time_t t) {  // the second for the given time
  refreshCache(t);
  return tm.Second;
}

int day(){
  return(day(now())); 
}

int day(time_t t) { // the day for the given time (0-6)
  refreshCache(t);
  return tm.Day;
}

int weekday() {   // Sunday is day 1
  return  weekday(now()); 
}

int weekday(time_t t) {
  refreshCache(t);
  return tm.Wday;
}
   
int month(){
  return month(now()); 
}

int month(time_t t) {  // the month for the given time
  refreshCache(t);
  return tm.Month;
}

int year() {  // as in Processing, the full four digit year: (2009, 2010 etc) 
  return year(now()); 
}

int year(time_t t) { // the year for the given time
  refreshCache(t);
  return tmYearToCalendar(tm.Year);
}

/*============================================================================*/	
/* functions to convert to and from system time */
/* These are for interfacing with time serivces and are not normally needed in a sketch */

// leap year calulator expects year argument as years offset from 1970
#define LEAP_YEAR(Y)     ( ((1970+Y)>0) && !((1970+Y)%4) && ( ((1970+Y)%100) || !((1970+Y)%400) ) )

static  const uint8_t monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31}; // API starts months from 1, this array starts from 0
 
void breakTime(time_t timeInput, tmElements_t &tm){
// break the given time_t into time components
// this is a more compact version of the C library localtime function
// note that year is offset from 1970 !!!

  uint8_t year;
  uint8_t month, monthLength;
  uint32_t time;
  unsigned long days;

  time = (uint32_t)timeInput;
  tm.Second = time % 60;
  time /= 60; // now it is minutes
  tm.Minute = time % 60;
  time /= 60; // now it is hours
  tm.Hour = time % 24;
  time /= 24; // now it is days
  tm.Wday = ((time + 4) % 7) + 1;  // Sunday is day 1 
  
  year = 0;  
  days = 0;
  while((unsigned)(days += (LEAP_YEAR(year) ? 366 : 365)) <= time) {
    year++;
  }
  tm.Year = year; // year is offset from 1970 
  
  days -= LEAP_YEAR(year) ? 366 : 365;
  time  -= days; // now it is days in this year, starting at 0
  
  days=0;
  month=0;
  monthLength=0;
  for (month=0; month<12; month++) {
    if (month==1) { // february
      if (LEAP_YEAR(year)) {
        monthLength=29;
      } else {
        monthLength=28;
      }
    } else {
      monthLength = monthDays[month];
    }
    
    if (time >= monthLength) {
      time -= monthLength;
    } else {
        break;
    }
  }
  tm.Month = month + 1;  // jan is month 1  
  tm.Day = time + 1;     // day of month
}

time_t makeTime(tmElements_t &tm){   
// assemble time elements into time_t 
// note year argument is offset from 1970 (see macros in time.h to convert to other formats)
// previous version used full four digit year (or digits since 2000),i.e. 2009 was 2009 or 9
  
  int i;
  uint32_t seconds;

  // seconds from 1970 till 1 jan 00:00:00 of the given year
  seconds= tm.Year*(SECS_PER_DAY * 365);
  for (i = 0; i < tm.Year; i++) {
    if (LEAP_YEAR(i)) {
      seconds +=  SECS_PER_DAY;   // add extra days for leap years
    }
  }
  
  // add days for this year, months start from 1
  for (i = 1; i < tm.Month; i++) {
    if ( (i == 2) && LEAP_YEAR(tm.Year)) { 
      seconds += SECS_PER_DAY * 29;
    } else {
      seconds += SECS_PER_DAY * monthDays[i-1];  //monthDay array starts from 0
    }
  }
  seconds+= (tm.Day-1) * SECS_PER_DAY;
  seconds+= tm.Hour * SECS_PER_HOUR;
  seconds+= tm.Minute * SECS_PER_MIN;
  seconds+= tm.Second;
  return (time_t)seconds; 
}
/*=====================================================*/	
/* Low level system time functions  */

static uint32_t sysTime = 0;
static uint32_t prevMillis = 0;
static uint32_t nextSyncTime = 0;
static timeStatus_t Status = timeNotSet;

getExternalTime getTimePtr;  // pointer to external sync function
//setExternalTime setTimePtr; // not used in this version

#ifdef TIME_DRIFT_INFO   // define this to get drift data
time_t sysUnsyncedTime = 0; // the time sysTime unadjusted by sync  
#endif


time_t now() {
  while (millis() - prevMillis >= 1000){      
    sysTime++;
    prevMillis += 1000;	
#ifdef TIME_DRIFT_INFO
    sysUnsyncedTime++; // this can be compared to the synced time to measure long term drift     
#endif
  }
  if (nextSyncTime <= sysTime) {
    if (getTimePtr != 0) {
      time_t t = getTimePtr();
      if (t != 0) {
        setTime(t);
      } else {
        nextSyncTime = sysTime + syncInterval;
        Status = (Status == timeNotSet) ?  timeNotSet : timeNeedsSync;
      }
    }
  }  
  return (time_t)sysTime;
}

void setTime(time_t t) { 
#ifdef TIME_DRIFT_INFO
 if(sysUnsyncedTime == 0) 
   sysUnsyncedTime = t;   // store the time of the first call to set a valid Time   
#endif

  sysTime = (uint32_t)t;  
  nextSyncTime = (uint32_t)t + syncInterval;
  Status = timeSet;
  prevMillis = millis();  // restart counting from now (thanks to Korman for this fix)
} 

void setTime(int hr,int min,int sec,int dy, int mnth, int yr){
 // year can be given as full four digit year or two digts (2010 or 10 for 2010);  
 //it is converted to years since 1970
  if( yr > 99)
      yr = yr - 1970;
  else
      yr += 30;  
  tm.Year = yr;
  tm.Month = mnth;
  tm.Day = dy;
  tm.Hour = hr;
  tm.Minute = min;
  tm.Second = sec;
  setTime(makeTime(tm));
}

void adjustTime(long adjustment) {
  sysTime += adjustment;
}

// indicates if time has been set and recently synchronized
timeStatus_t timeStatus() {
  now(); // required to actually update the status
  return Status;
}

void setSyncProvider( getExternalTime getTimeFunction){
  getTimePtr = getTimeFunction;  
  nextSyncTime = sysTime;
  now(); // this will sync the clock
}

void setSyncInterval(time_t interval){ // set the number of seconds between re-sync
  syncInterval = (uint32_t)interval;
  nextSyncTime = sysTime + syncInterval;
}

";	
		// Generamos el archivo
		util.genFile("Time","cpp",code)
	}
	
	def generateTimeAlarmsH(Util util){
		// String donde iremos generando el codigo
		var String code = "";
		
		code = "
//  TimeAlarms.h - Arduino Time alarms header for use with Time library

#ifndef TimeAlarms_h
#define TimeAlarms_h

#include <inttypes.h>

#include \"Time.h\"

#define dtNBR_ALARMS 6   // max is 255

#define USE_SPECIALIST_METHODS  // define this for testing

typedef enum { dtMillisecond, dtSecond, dtMinute, dtHour, dtDay } dtUnits_t;

typedef struct  {
	uint8_t alarmType              :4 ;  // enumeration of daily/weekly (in future: biweekly/semimonthly/monthly/annual)
	                                     // note that the current API only supports daily or weekly alarm periods
    uint8_t isEnabled              :1 ;  // the timer is only actioned if isEnabled is true 
    uint8_t isOneShot              :1 ;  // the timer will be de-allocated after trigger is processed 
										 }
    AlarmMode_t   ;
	
// new time based alarms should be added just before dtLastAlarmType
typedef enum  {dtNotAllocated, dtTimer, dtExplicitAlarm, dtDailyAlarm, dtWeeklyAlarm, dtLastAlarmType } dtAlarmPeriod_t ; // in future: dtBiweekly, dtMonthly, dtAnnual

// macro to return true if the given type is a time based alarm, false if timer or not allocated
#define dtIsAlarm(_type_)  (_type_ >= dtExplicitAlarm && _type_ < dtLastAlarmType) 

typedef uint8_t AlarmID_t;
typedef AlarmID_t AlarmId;  // Arduino friendly name

#define dtINVALID_ALARM_ID 255
#define dtINVALID_TIME     0L

class AlarmClass;  // forward reference
typedef void (*OnTick_t)();  // alarm callback function typedef 

// class defining an alarm instance, only used by dtAlarmsClass
class AlarmClass
{  
private:

public:
  AlarmClass(); 
  OnTick_t onTickHandler; 
  void updateNextTrigger();
  time_t value;
  time_t nextTrigger;
  AlarmMode_t Mode;
};

// class containing the collection of alarms
class TimeAlarmsClass
{
private:
   AlarmClass Alarm[dtNBR_ALARMS];
   void serviceAlarms();
   uint8_t isServicing;
   uint8_t servicedAlarmId; // the alarm currently being serviced
   AlarmID_t create( time_t value, OnTick_t onTickHandler, uint8_t isOneShot, dtAlarmPeriod_t alarmType, uint8_t isEnabled=true);
   
public:
  TimeAlarmsClass();
  // functions to create alarms and timers

  AlarmID_t triggerOnce(time_t value, OnTick_t onTickHandler);   // trigger once at the given time_t

  AlarmID_t alarmRepeat(time_t value, OnTick_t onTickHandler);                    // trigger daily at given time of day
  AlarmID_t alarmRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with hms arguments
  AlarmID_t alarmRepeat(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with day of week 
 
  AlarmID_t alarmOnce(time_t value, OnTick_t onTickHandler);                     // trigger once at given time of day
  AlarmID_t alarmOnce( const int H,  const int M,  const int S, OnTick_t onTickHandler);  // as above, with hms arguments
  AlarmID_t alarmOnce(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with day of week 
  
  AlarmID_t timerOnce(time_t value, OnTick_t onTickHandler);   // trigger once after the given number of seconds 
  AlarmID_t timerOnce(const int H,  const int M,  const int S, OnTick_t onTickHandler);   // As above with HMS arguments
  
  AlarmID_t timerRepeat(time_t value, OnTick_t onTickHandler); // trigger after the given number of seconds continuously
  AlarmID_t timerRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler);   // As above with HMS arguments
  
  void delay(unsigned long ms);
   
  // utility methods
  uint8_t getDigitsNow( dtUnits_t Units);         // returns the current digit value for the given time unit
  void waitForDigits( uint8_t Digits, dtUnits_t Units);  
  void waitForRollover(dtUnits_t Units);
 
  // low level methods 
  void enable(AlarmID_t ID);                // enable the alarm to trigger
  void disable(AlarmID_t ID);               // prevent the alarm from triggering   
  AlarmID_t getTriggeredAlarmId();          // returns the currently triggered  alarm id
  void write(AlarmID_t ID, time_t value);   // write the value (and enable) the alarm with the given ID  
  time_t read(AlarmID_t ID);                // return the value for the given timer  
  dtAlarmPeriod_t readType(AlarmID_t ID);   // return the alarm type for the given alarm ID 
  
#ifndef USE_SPECIALIST_METHODS  
private:  // the following methods are for testing and are not documented as part of the standard library
#endif
  void free(AlarmID_t ID);                  // free the id to allow its reuse 
  uint8_t count();                          // returns the number of allocated timers
  time_t getNextTrigger();                  // returns the time of the next scheduled alarm
  bool isAllocated(AlarmID_t ID);           // returns true if this id is allocated  
  bool isAlarm(AlarmID_t ID);               // returns true if id is for a time based alarm, false if its a timer or not allocated
};

extern TimeAlarmsClass Alarm;  // make an instance for the user

/*==============================================================================
 * MACROS
 *============================================================================*/

/* public */
#define waitUntilThisSecond(_val_) waitForDigits( _val_, dtSecond)
#define waitUntilThisMinute(_val_) waitForDigits( _val_, dtMinute)
#define waitUntilThisHour(_val_)   waitForDigits( _val_, dtHour)
#define waitUntilThisDay(_val_)    waitForDigits( _val_, dtDay)
#define waitMinuteRollover() waitForRollover(dtSecond)
#define waitHourRollover()   waitForRollover(dtMinute)
#define waitDayRollover()    waitForRollover(dtHour)

#define AlarmHMS(_hr_, _min_, _sec_) (_hr_ * SECS_PER_HOUR + _min_ * SECS_PER_MIN + _sec_)


#endif /* TimeAlarms_h */
";	
			// Generamos el archivo
		util.genFile("TimeAlarms","h",code)
	}
	
	def generateTimeAlarmsCpp(Util util){
		// String donde iremos generando el codigo
		var String code = "";
		
		code = "
/*
  TimeAlarms.cpp - Arduino Time alarms for use with Time library   
  Copyright (c) 208-2011 Michael Margolis. 
  
  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.
 */
 
 /*
  2 July 2011 - replaced alarm types implied from alarm value with enums to make trigger logic more robust
              - this fixes bug in repeating weekly alarms - thanks to Vincent Valdy and draythomp for testing
*/

extern \"C\" {
#include <string.h> // for memset
}

#include \"Arduino.h\"
#include \"TimeAlarms.h\"
#include \"Time.h\"

#define IS_ONESHOT  true   // constants used in arguments to create method
#define IS_REPEAT   false 


//**************************************************************
//* Alarm Class Constructor

AlarmClass::AlarmClass()
{
  Mode.isEnabled = Mode.isOneShot = 0;
  Mode.alarmType = dtNotAllocated;
  value = nextTrigger = 0;
  onTickHandler = NULL;  // prevent a callback until this pointer is explicitly set 
}

//**************************************************************
//* Private Methods

 
void AlarmClass::updateNextTrigger()
{  
  if( (value != 0) && Mode.isEnabled )
  {
    time_t time = now();
    if( dtIsAlarm(Mode.alarmType) && nextTrigger <= time )   // update alarm if next trigger is not yet in the future
    {      
      if(Mode.alarmType == dtExplicitAlarm ) // is the value a specific date and time in the future
      {
        nextTrigger = value;  // yes, trigger on this value   
      }
      else if(Mode.alarmType == dtDailyAlarm)  //if this is a daily alarm
      {
        if( value + previousMidnight(now()) <= time)
        {
          nextTrigger = value + nextMidnight(time); // if time has passed then set for tomorrow
        }
        else
        {
          nextTrigger = value + previousMidnight(time);  // set the date to today and add the time given in value   
        }
      }
      else if(Mode.alarmType == dtWeeklyAlarm)  // if this is a weekly alarm
      {
        if( (value + previousSunday(now())) <= time)
        {
          nextTrigger = value + nextSunday(time); // if day has passed then set for the next week.
        }
        else
        {
          nextTrigger = value + previousSunday(time);  // set the date to this week today and add the time given in value 
        } 
      }
      else  // its not a recognized alarm type - this should not happen 
      {
        Mode.isEnabled = 0;  // Disable the alarm
      }	  
    }
    if( Mode.alarmType == dtTimer)
    {
      // its a timer
      nextTrigger = time + value;  // add the value to previous time (this ensures delay always at least Value seconds)
    }
  }
  else
  {
    Mode.isEnabled = 0;  // Disable if the value is 0
  }
}

//**************************************************************
//* Time Alarms Public Methods

TimeAlarmsClass::TimeAlarmsClass()
{
  isServicing = false;
  for(uint8_t id = 0; id < dtNBR_ALARMS; id++)
     free(id);   // ensure  all Alarms are cleared and available for allocation  
}

// this method creates a trigger at the given absolute time_t
// it replaces the call to alarmOnce with values greater than a week   
AlarmID_t TimeAlarmsClass::triggerOnce(time_t value, OnTick_t onTickHandler){   // trigger once at the given time_t
     if( value > 0)
        return create( value, onTickHandler, IS_ONESHOT, dtExplicitAlarm );
     else
        return dtINVALID_ALARM_ID; // dont't allocate if the time is greater than one day 	  
}

// this method will now return an error if the value is greater than one day - use DOW methods for weekly alarms   
AlarmID_t TimeAlarmsClass::alarmOnce(time_t value, OnTick_t onTickHandler){   // trigger once at the given time of day
     if( value <= SECS_PER_DAY)
        return create( value, onTickHandler, IS_ONESHOT, dtDailyAlarm );
     else
        return dtINVALID_ALARM_ID; // dont't allocate if the time is greater than one day 	  
}

AlarmID_t TimeAlarmsClass::alarmOnce(const int H,  const int M,  const int S,OnTick_t onTickHandler){   // as above with HMS arguments
   return create( AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtDailyAlarm );
}

AlarmID_t TimeAlarmsClass::alarmOnce(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler){  // as above, with day of week 
   return create( (DOW-1) * SECS_PER_DAY + AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtWeeklyAlarm );   
}
   
// this method will now return an error if the value is greater than one day - use DOW methods for weekly alarms   
AlarmID_t TimeAlarmsClass::alarmRepeat(time_t value, OnTick_t onTickHandler){ // trigger daily at the given time
    if( value <= SECS_PER_DAY)
       return create( value, onTickHandler, IS_REPEAT, dtDailyAlarm );
    else
       return dtINVALID_ALARM_ID; // dont't allocate if the time is greater than one day 	  
    }
    
    AlarmID_t TimeAlarmsClass::alarmRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler){ // as above with HMS arguments
         return create( AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtDailyAlarm );
    }
    
    AlarmID_t TimeAlarmsClass::alarmRepeat(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler){  // as above, with day of week 
       return create( (DOW-1) * SECS_PER_DAY + AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtWeeklyAlarm );      
    }
      
    AlarmID_t TimeAlarmsClass::timerOnce(time_t value, OnTick_t onTickHandler){   // trigger once after the given number of seconds 
         return create( value, onTickHandler, IS_ONESHOT, dtTimer );
    }
    
    AlarmID_t TimeAlarmsClass::timerOnce(const int H,  const int M,  const int S, OnTick_t onTickHandler){   // As above with HMS arguments
      return create( AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtTimer );
    }
      
    AlarmID_t TimeAlarmsClass::timerRepeat(time_t value, OnTick_t onTickHandler){ // trigger after the given number of seconds continuously
         return create( value, onTickHandler, IS_REPEAT, dtTimer);
    }
    
    AlarmID_t TimeAlarmsClass::timerRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler){ // trigger after the given number of seconds continuously
         return create( AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtTimer);
    }
    
    void TimeAlarmsClass::enable(AlarmID_t ID)
    {
      if(isAllocated(ID)) {
        Alarm[ID].Mode.isEnabled = (Alarm[ID].value != 0) && (Alarm[ID].onTickHandler != 0) ;  // only enable if value is non zero and a tick handler has been set
        Alarm[ID].updateNextTrigger(); // trigger is updated whenever  this is called, even if already enabled	 
      }
    }
    
    void TimeAlarmsClass::disable(AlarmID_t ID)
    {
      if(isAllocated(ID))
        Alarm[ID].Mode.isEnabled = false;
    }
      
    // write the given value to the given alarm
    void TimeAlarmsClass::write(AlarmID_t ID, time_t value)
    {
      if(isAllocated(ID))
      {
        Alarm[ID].value = value;
        enable(ID);  // update trigger time
      }
    }
    
    // return the value for the given alarm ID
    time_t TimeAlarmsClass::read(AlarmID_t ID)
    {
      if(isAllocated(ID))
        return Alarm[ID].value ;
      else 	
        return dtINVALID_TIME;  
    }
    
    // return the alarm type for the given alarm ID
    dtAlarmPeriod_t TimeAlarmsClass::readType(AlarmID_t ID)
    {
      if(isAllocated(ID))
        return (dtAlarmPeriod_t)Alarm[ID].Mode.alarmType ;
      else 	
        return dtNotAllocated;  
    }

    void TimeAlarmsClass::free(AlarmID_t ID)
    {
      if(isAllocated(ID))
      {
        Alarm[ID].Mode.isEnabled = false;
    	Alarm[ID].Mode.alarmType = dtNotAllocated;
        Alarm[ID].onTickHandler = 0;
    	Alarm[ID].value = 0;
    	Alarm[ID].nextTrigger = 0;   	
      }
    }
    
    // returns the number of allocated timers
    uint8_t TimeAlarmsClass::count()
    {
       uint8_t c = 0; 
       for(uint8_t id = 0; id < dtNBR_ALARMS; id++)
       {
          if(isAllocated(id))
            c++;
       }
       return c;
    }
    
    // returns true only if id is allocated and the type is a time based alarm, returns false if not allocated or if its a timer
     bool TimeAlarmsClass::isAlarm(AlarmID_t ID)
     {
        return( isAllocated(ID) && dtIsAlarm(Alarm[ID].Mode.alarmType) );
     }
     
     // returns true if this id is allocated
     bool TimeAlarmsClass::isAllocated(AlarmID_t ID)
     {
        return( ID < dtNBR_ALARMS && Alarm[ID].Mode.alarmType != dtNotAllocated );
     }
     
    
    AlarmID_t TimeAlarmsClass::getTriggeredAlarmId()  //returns the currently triggered  alarm id
    // returns  dtINVALID_ALARM_ID if not invoked from within an alarm handler
    {
      if(isServicing)
           return  servicedAlarmId;  // new private data member used instead of local loop variable i in serviceAlarms();
      else
         return dtINVALID_ALARM_ID; // valid ids only available when servicing a callback
    }
     
    // following functions are not Alarm ID specific.
    void TimeAlarmsClass::delay(unsigned long ms)
    {
      unsigned long start = millis();
      while( millis() - start  <= ms)
        serviceAlarms();
    }
    		
    void TimeAlarmsClass::waitForDigits( uint8_t Digits, dtUnits_t Units)
    {
      while(Digits != getDigitsNow(Units) )
      {
        serviceAlarms();
      }
    }
    
    void TimeAlarmsClass::waitForRollover( dtUnits_t Units)
    {
      while(getDigitsNow(Units) == 0  ) // if its just rolled over than wait for another rollover	                            
        serviceAlarms();
      waitForDigits(0, Units);
    }
    
    uint8_t TimeAlarmsClass::getDigitsNow( dtUnits_t Units)
    {
      time_t time = now();
      if(Units == dtSecond) return numberOfSeconds(time);
      if(Units == dtMinute) return numberOfMinutes(time); 
      if(Units == dtHour) return numberOfHours(time);
      if(Units == dtDay) return dayOfWeek(time);
      return 255;  // This should never happen 
    }
    
    //***********************************************************
    //* Private Methods
    
    void TimeAlarmsClass::serviceAlarms()
    {
      if(! isServicing)
      {
        isServicing = true;
        for( servicedAlarmId = 0; servicedAlarmId < dtNBR_ALARMS; servicedAlarmId++)
        {
          if( Alarm[servicedAlarmId].Mode.isEnabled && (now() >= Alarm[servicedAlarmId].nextTrigger)  )
          {
            OnTick_t TickHandler = Alarm[servicedAlarmId].onTickHandler;
            if(Alarm[servicedAlarmId].Mode.isOneShot)
               free(servicedAlarmId);  // free the ID if mode is OnShot		
            else   
               Alarm[servicedAlarmId].updateNextTrigger();
            if( TickHandler != NULL) {        
              (*TickHandler)();     // call the handler  
            }
          }
        }
        isServicing = false;
      }
    }
    
    // returns the absolute time of the next scheduled alarm, or 0 if none
     time_t TimeAlarmsClass::getNextTrigger()
     {
     time_t nextTrigger = 0xffffffff;  // the max time value
     
        for(uint8_t id = 0; id < dtNBR_ALARMS; id++)
        {
          if(isAllocated(id) )
          {
        	if(Alarm[id].nextTrigger <  nextTrigger)
    		   nextTrigger = Alarm[id].nextTrigger;	
          }      
    	}
        return nextTrigger == 0xffffffff ? 0 : nextTrigger;  	
     }
    
    // attempt to create an alarm and return true if successful
    AlarmID_t TimeAlarmsClass::create( time_t value, OnTick_t onTickHandler, uint8_t isOneShot, dtAlarmPeriod_t alarmType, uint8_t isEnabled) 
    {
      if( ! (dtIsAlarm(alarmType) && now() < SECS_PER_YEAR)) // only create alarm ids if the time is at least Jan 1 1971
      {  
    	for(uint8_t id = 0; id < dtNBR_ALARMS; id++)
        {
          if( Alarm[id].Mode.alarmType == dtNotAllocated )
    	  {
    	  // here if there is an Alarm id that is not allocated
      	    Alarm[id].onTickHandler = onTickHandler;
    	    Alarm[id].Mode.isOneShot = isOneShot;
    	    Alarm[id].Mode.alarmType = alarmType;
    	    Alarm[id].value = value;
    	    isEnabled ?  enable(id) : disable(id);   
            return id;  // alarm created ok
    	  }  
        }
      }
      return dtINVALID_ALARM_ID; // no IDs available or time is invalid
    }
    
    // make one instance for the user to use
    TimeAlarmsClass Alarm = TimeAlarmsClass() ;
    
    

";	
			// Generamos el archivo
		util.genFile("TimeAlarms","cpp",code)
	}
	
}