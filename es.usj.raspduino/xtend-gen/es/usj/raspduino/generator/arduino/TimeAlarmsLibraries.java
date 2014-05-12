package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.Alarm;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.Timer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class TimeAlarmsLibraries {
  public boolean generateCode(final Model model, final Util util) {
    boolean _xblockexpression = false;
    {
      boolean firstOccurrence = true;
      EList<Timer> _timers = model.getTimers();
      for (final Timer dev : _timers) {
        this.generateTimeH(util);
      }
      this.generateTimeCpp(util);
      this.generateTimeAlarmsH(util);
      this.generateTimeAlarmsCpp(util);
      firstOccurrence = false;
      boolean _xifexpression = false;
      if (firstOccurrence) {
        boolean _xblockexpression_1 = false;
        {
          EList<Alarm> _alarms = model.getAlarms();
          for (final Alarm dev_1 : _alarms) {
            this.generateTimeH(util);
          }
          this.generateTimeCpp(util);
          this.generateTimeAlarmsH(util);
          this.generateTimeAlarmsCpp(util);
          _xblockexpression_1 = firstOccurrence = false;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void generateTimeH(final Util util) {
    String code = "";
    code = "\r\n/*\r\n  time.h - low level time and date functions\r\n*/\r\n\r\n/*\r\n  July 3 2011 - fixed elapsedSecsThisWeek macro (thanks Vincent Valdy for this)\r\n              - fixed  daysToTime_t macro (thanks maniacbug)\r\n*/     \r\n\r\n#ifndef _Time_h\r\n#ifdef __cplusplus\r\n#define _Time_h\r\n\r\n#include <inttypes.h>\r\n#ifndef __AVR__\r\n#include <sys/types.h> // for __time_t_defined, but avr libc lacks sys/types.h\r\n#endif\r\n\r\n\r\n#if !defined(__time_t_defined) // avoid conflict with newlib or other posix libc\r\ntypedef unsigned long time_t;\r\n#endif\r\n\r\n\r\n// This ugly hack allows us to define C++ overloaded functions, when included\r\n// from within an extern \"C\", as newlib\'s sys/stat.h does.  Actually it is\r\n// intended to include \"time.h\" from the C library (on ARM, but AVR does not\r\n// have that file at all).  On Mac and Windows, the compiler will find this\r\n// \"Time.h\" instead of the C library \"time.h\", so we may cause other weird\r\n// and unpredictable effects by conflicting with the C library header \"time.h\",\r\n// but at least this hack lets us define C++ functions as intended.  Hopefully\r\n// nothing too terrible will result from overriding the C library header?!\r\nextern \"C++\" {\r\ntypedef enum {timeNotSet, timeNeedsSync, timeSet\r\n}  timeStatus_t ;\r\n\r\ntypedef enum {\r\n    dowInvalid, dowSunday, dowMonday, dowTuesday, dowWednesday, dowThursday, dowFriday, dowSaturday\r\n} timeDayOfWeek_t;\r\n\r\ntypedef enum {\r\n    tmSecond, tmMinute, tmHour, tmWday, tmDay,tmMonth, tmYear, tmNbrFields\r\n} tmByteFields;\t   \r\n\r\ntypedef struct  { \r\n  uint8_t Second; \r\n  uint8_t Minute; \r\n  uint8_t Hour; \r\n  uint8_t Wday;   // day of week, sunday is day 1\r\n  uint8_t Day;\r\n  uint8_t Month; \r\n  uint8_t Year;   // offset from 1970; \r\n} \ttmElements_t, TimeElements, *tmElementsPtr_t;\r\n\r\n//convenience macros to convert to and from tm years \r\n#define  tmYearToCalendar(Y) ((Y) + 1970)  // full four digit year \r\n#define  CalendarYrToTm(Y)   ((Y) - 1970)\r\n#define  tmYearToY2k(Y)      ((Y) - 30)    // offset is from 2000\r\n#define  y2kYearToTm(Y)      ((Y) + 30)   \r\n\r\ntypedef time_t(*getExternalTime)();\r\n//typedef void  (*setExternalTime)(const time_t); // not used in this version\r\n\r\n\r\n/*==============================================================================*/\r\n/* Useful Constants */\r\n#define SECS_PER_MIN  (60UL)\r\n#define SECS_PER_HOUR (3600UL)\r\n#define SECS_PER_DAY  (SECS_PER_HOUR * 24UL)\r\n#define DAYS_PER_WEEK (7UL)\r\n#define SECS_PER_WEEK (SECS_PER_DAY * DAYS_PER_WEEK)\r\n#define SECS_PER_YEAR (SECS_PER_WEEK * 52UL)\r\n#define SECS_YR_2000  (946684800UL) // the time at the start of y2k\r\n \r\n/* Useful Macros for getting elapsed time */\r\n#define numberOfSeconds(_time_) (_time_ % SECS_PER_MIN)  \r\n#define numberOfMinutes(_time_) ((_time_ / SECS_PER_MIN) % SECS_PER_MIN) \r\n#define numberOfHours(_time_) (( _time_% SECS_PER_DAY) / SECS_PER_HOUR)\r\n#define dayOfWeek(_time_)  ((( _time_ / SECS_PER_DAY + 4)  % DAYS_PER_WEEK)+1) // 1 = Sunday\r\n#define elapsedDays(_time_) ( _time_ / SECS_PER_DAY)  // this is number of days since Jan 1 1970\r\n#define elapsedSecsToday(_time_)  (_time_ % SECS_PER_DAY)   // the number of seconds since last midnight \r\n// The following macros are used in calculating alarms and assume the clock is set to a date later than Jan 1 1971\r\n// Always set the correct time before settting alarms\r\n#define previousMidnight(_time_) (( _time_ / SECS_PER_DAY) * SECS_PER_DAY)  // time at the start of the given day\r\n#define nextMidnight(_time_) ( previousMidnight(_time_)  + SECS_PER_DAY )   // time at the end of the given day \r\n#define elapsedSecsThisWeek(_time_)  (elapsedSecsToday(_time_) +  ((dayOfWeek(_time_)-1) * SECS_PER_DAY) )   // note that week starts on day 1\r\n#define previousSunday(_time_)  (_time_ - elapsedSecsThisWeek(_time_))      // time at the start of the week for the given time\r\n#define nextSunday(_time_) ( previousSunday(_time_)+SECS_PER_WEEK)          // time at the end of the week for the given time\r\n\r\n\r\n/* Useful Macros for converting elapsed time to a time_t */\r\n#define minutesToTime_t ((M)) ( (M) * SECS_PER_MIN)  \r\n#define hoursToTime_t   ((H)) ( (H) * SECS_PER_HOUR)  \r\n#define daysToTime_t    ((D)) ( (D) * SECS_PER_DAY) // fixed on Jul 22 2011\r\n#define weeksToTime_t   ((W)) ( (W) * SECS_PER_WEEK)   \r\n\r\n/*============================================================================*/\r\n/*  time and date functions   */\r\nint     hour();            // the hour now \r\nint     hour(time_t t);    // the hour for the given time\r\nint     hourFormat12();    // the hour now in 12 hour format\r\nint     hourFormat12(time_t t); // the hour for the given time in 12 hour format\r\nuint8_t isAM();            // returns true if time now is AM\r\nuint8_t isAM(time_t t);    // returns true the given time is AM\r\nuint8_t isPM();            // returns true if time now is PM\r\nuint8_t isPM(time_t t);    // returns true the given time is PM\r\nint     minute();          // the minute now \r\nint     minute(time_t t);  // the minute for the given time\r\nint     second();          // the second now \r\nint     second(time_t t);  // the second for the given time\r\nint     day();             // the day now \r\nint     day(time_t t);     // the day for the given time\r\nint     weekday();         // the weekday now (Sunday is day 1) \r\nint     weekday(time_t t); // the weekday for the given time \r\nint     month();           // the month now  (Jan is month 1)\r\nint     month(time_t t);   // the month for the given time\r\nint     year();            // the full four digit year: (2009, 2010 etc) \r\nint     year(time_t t);    // the year for the given time\r\n\r\ntime_t now();              // return the current time as seconds since Jan 1 1970 \r\nvoid    setTime(time_t t);\r\nvoid    setTime(int hr,int min,int sec,int day, int month, int yr);\r\nvoid    adjustTime(long adjustment);\r\n\r\n/* date strings */ \r\n#define dt_MAX_STRING_LEN 9 // length of longest date string (excluding terminating null)\r\nchar* monthStr(uint8_t month);\r\nchar* dayStr(uint8_t day);\r\nchar* monthShortStr(uint8_t month);\r\nchar* dayShortStr(uint8_t day);\r\n\t\r\n/* time sync functions\t*/\r\ntimeStatus_t timeStatus(); // indicates if time has been set and recently synchronized\r\nvoid    setSyncProvider( getExternalTime getTimeFunction); // identify the external time provider\r\nvoid    setSyncInterval(time_t interval); // set the number of seconds between re-sync\r\n\r\n/* low level functions to convert to and from system time                     */\r\nvoid breakTime(time_t time, tmElements_t &tm);  // break time_t into elements\r\ntime_t makeTime(tmElements_t &tm);  // convert time elements into time_t\r\n\r\n} // extern \"C++\"\r\n#endif // __cplusplus\r\n#endif /* _Time_h */\r\n";
    util.genFile("Time", "h", code);
  }
  
  public void generateTimeCpp(final Util util) {
    String code = "";
    code = "\r\n/*\r\n  time.c - low level time and date functions\r\n  Copyright (c) Michael Margolis 2009\r\n\r\n  This library is free software; you can redistribute it and/or\r\n  modify it under the terms of the GNU Lesser General Public\r\n  License as published by the Free Software Foundation; either\r\n  version 2.1 of the License, or (at your option) any later version.\r\n\r\n  This library is distributed in the hope that it will be useful,\r\n  but WITHOUT ANY WARRANTY; without even the implied warranty of\r\n  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU\r\n  Lesser General Public License for more details.\r\n\r\n  You should have received a copy of the GNU Lesser General Public\r\n  License along with this library; if not, write to the Free Software\r\n  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA\r\n  \r\n  6  Jan 2010 - initial release \r\n  12 Feb 2010 - fixed leap year calculation error\r\n  1  Nov 2010 - fixed setTime bug (thanks to Korman for this)\r\n  24 Mar 2012 - many edits by Paul Stoffregen: fixed timeStatus() to update\r\n                status, updated examples for Arduino 1.0, fixed ARM\r\n                compatibility issues, added TimeArduinoDue and TimeTeensy3\r\n                examples, add error checking and messages to RTC examples,\r\n                add examples to DS1307RTC library.\r\n*/\r\n\r\n#if ARDUINO >= 100\r\n#include <Arduino.h> \r\n#else\r\n#include <WProgram.h> \r\n#endif\r\n\r\n#include  \"Time.h\"\r\n\r\nstatic tmElements_t tm;          // a cache of time elements\r\nstatic time_t cacheTime;   // the time the cache was updated\r\nstatic uint32_t syncInterval = 300;  // time sync will be attempted after this many seconds\r\n\r\nvoid refreshCache(time_t t) {\r\n  if (t != cacheTime) {\r\n    breakTime(t, tm); \r\n    cacheTime = t; \r\n  }\r\n}\r\n\r\nint hour() { // the hour now \r\n  return hour(now()); \r\n}\r\n\r\nint hour(time_t t) { // the hour for the given time\r\n  refreshCache(t);\r\n  return tm.Hour;  \r\n}\r\n\r\nint hourFormat12() { // the hour now in 12 hour format\r\n  return hourFormat12(now()); \r\n}\r\n\r\nint hourFormat12(time_t t) { // the hour for the given time in 12 hour format\r\n  refreshCache(t);\r\n  if( tm.Hour == 0 )\r\n    return 12; // 12 midnight\r\n  else if( tm.Hour  > 12)\r\n    return tm.Hour - 12 ;\r\n  else\r\n    return tm.Hour ;\r\n}\r\n\r\nuint8_t isAM() { // returns true if time now is AM\r\n  return !isPM(now()); \r\n}\r\n\r\nuint8_t isAM(time_t t) { // returns true if given time is AM\r\n  return !isPM(t);  \r\n}\r\n\r\nuint8_t isPM() { // returns true if PM\r\n  return isPM(now()); \r\n}\r\n\r\nuint8_t isPM(time_t t) { // returns true if PM\r\n  return (hour(t) >= 12); \r\n}\r\n\r\nint minute() {\r\n  return minute(now()); \r\n}\r\n\r\nint minute(time_t t) { // the minute for the given time\r\n  refreshCache(t);\r\n  return tm.Minute;  \r\n}\r\n\r\nint second() {\r\n  return second(now()); \r\n}\r\n\r\nint second(time_t t) {  // the second for the given time\r\n  refreshCache(t);\r\n  return tm.Second;\r\n}\r\n\r\nint day(){\r\n  return(day(now())); \r\n}\r\n\r\nint day(time_t t) { // the day for the given time (0-6)\r\n  refreshCache(t);\r\n  return tm.Day;\r\n}\r\n\r\nint weekday() {   // Sunday is day 1\r\n  return  weekday(now()); \r\n}\r\n\r\nint weekday(time_t t) {\r\n  refreshCache(t);\r\n  return tm.Wday;\r\n}\r\n   \r\nint month(){\r\n  return month(now()); \r\n}\r\n\r\nint month(time_t t) {  // the month for the given time\r\n  refreshCache(t);\r\n  return tm.Month;\r\n}\r\n\r\nint year() {  // as in Processing, the full four digit year: (2009, 2010 etc) \r\n  return year(now()); \r\n}\r\n\r\nint year(time_t t) { // the year for the given time\r\n  refreshCache(t);\r\n  return tmYearToCalendar(tm.Year);\r\n}\r\n\r\n/*============================================================================*/\t\r\n/* functions to convert to and from system time */\r\n/* These are for interfacing with time serivces and are not normally needed in a sketch */\r\n\r\n// leap year calulator expects year argument as years offset from 1970\r\n#define LEAP_YEAR(Y)     ( ((1970+Y)>0) && !((1970+Y)%4) && ( ((1970+Y)%100) || !((1970+Y)%400) ) )\r\n\r\nstatic  const uint8_t monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31}; // API starts months from 1, this array starts from 0\r\n \r\nvoid breakTime(time_t timeInput, tmElements_t &tm){\r\n// break the given time_t into time components\r\n// this is a more compact version of the C library localtime function\r\n// note that year is offset from 1970 !!!\r\n\r\n  uint8_t year;\r\n  uint8_t month, monthLength;\r\n  uint32_t time;\r\n  unsigned long days;\r\n\r\n  time = (uint32_t)timeInput;\r\n  tm.Second = time % 60;\r\n  time /= 60; // now it is minutes\r\n  tm.Minute = time % 60;\r\n  time /= 60; // now it is hours\r\n  tm.Hour = time % 24;\r\n  time /= 24; // now it is days\r\n  tm.Wday = ((time + 4) % 7) + 1;  // Sunday is day 1 \r\n  \r\n  year = 0;  \r\n  days = 0;\r\n  while((unsigned)(days += (LEAP_YEAR(year) ? 366 : 365)) <= time) {\r\n    year++;\r\n  }\r\n  tm.Year = year; // year is offset from 1970 \r\n  \r\n  days -= LEAP_YEAR(year) ? 366 : 365;\r\n  time  -= days; // now it is days in this year, starting at 0\r\n  \r\n  days=0;\r\n  month=0;\r\n  monthLength=0;\r\n  for (month=0; month<12; month++) {\r\n    if (month==1) { // february\r\n      if (LEAP_YEAR(year)) {\r\n        monthLength=29;\r\n      } else {\r\n        monthLength=28;\r\n      }\r\n    } else {\r\n      monthLength = monthDays[month];\r\n    }\r\n    \r\n    if (time >= monthLength) {\r\n      time -= monthLength;\r\n    } else {\r\n        break;\r\n    }\r\n  }\r\n  tm.Month = month + 1;  // jan is month 1  \r\n  tm.Day = time + 1;     // day of month\r\n}\r\n\r\ntime_t makeTime(tmElements_t &tm){   \r\n// assemble time elements into time_t \r\n// note year argument is offset from 1970 (see macros in time.h to convert to other formats)\r\n// previous version used full four digit year (or digits since 2000),i.e. 2009 was 2009 or 9\r\n  \r\n  int i;\r\n  uint32_t seconds;\r\n\r\n  // seconds from 1970 till 1 jan 00:00:00 of the given year\r\n  seconds= tm.Year*(SECS_PER_DAY * 365);\r\n  for (i = 0; i < tm.Year; i++) {\r\n    if (LEAP_YEAR(i)) {\r\n      seconds +=  SECS_PER_DAY;   // add extra days for leap years\r\n    }\r\n  }\r\n  \r\n  // add days for this year, months start from 1\r\n  for (i = 1; i < tm.Month; i++) {\r\n    if ( (i == 2) && LEAP_YEAR(tm.Year)) { \r\n      seconds += SECS_PER_DAY * 29;\r\n    } else {\r\n      seconds += SECS_PER_DAY * monthDays[i-1];  //monthDay array starts from 0\r\n    }\r\n  }\r\n  seconds+= (tm.Day-1) * SECS_PER_DAY;\r\n  seconds+= tm.Hour * SECS_PER_HOUR;\r\n  seconds+= tm.Minute * SECS_PER_MIN;\r\n  seconds+= tm.Second;\r\n  return (time_t)seconds; \r\n}\r\n/*=====================================================*/\t\r\n/* Low level system time functions  */\r\n\r\nstatic uint32_t sysTime = 0;\r\nstatic uint32_t prevMillis = 0;\r\nstatic uint32_t nextSyncTime = 0;\r\nstatic timeStatus_t Status = timeNotSet;\r\n\r\ngetExternalTime getTimePtr;  // pointer to external sync function\r\n//setExternalTime setTimePtr; // not used in this version\r\n\r\n#ifdef TIME_DRIFT_INFO   // define this to get drift data\r\ntime_t sysUnsyncedTime = 0; // the time sysTime unadjusted by sync  \r\n#endif\r\n\r\n\r\ntime_t now() {\r\n  while (millis() - prevMillis >= 1000){      \r\n    sysTime++;\r\n    prevMillis += 1000;\t\r\n#ifdef TIME_DRIFT_INFO\r\n    sysUnsyncedTime++; // this can be compared to the synced time to measure long term drift     \r\n#endif\r\n  }\r\n  if (nextSyncTime <= sysTime) {\r\n    if (getTimePtr != 0) {\r\n      time_t t = getTimePtr();\r\n      if (t != 0) {\r\n        setTime(t);\r\n      } else {\r\n        nextSyncTime = sysTime + syncInterval;\r\n        Status = (Status == timeNotSet) ?  timeNotSet : timeNeedsSync;\r\n      }\r\n    }\r\n  }  \r\n  return (time_t)sysTime;\r\n}\r\n\r\nvoid setTime(time_t t) { \r\n#ifdef TIME_DRIFT_INFO\r\n if(sysUnsyncedTime == 0) \r\n   sysUnsyncedTime = t;   // store the time of the first call to set a valid Time   \r\n#endif\r\n\r\n  sysTime = (uint32_t)t;  \r\n  nextSyncTime = (uint32_t)t + syncInterval;\r\n  Status = timeSet;\r\n  prevMillis = millis();  // restart counting from now (thanks to Korman for this fix)\r\n} \r\n\r\nvoid setTime(int hr,int min,int sec,int dy, int mnth, int yr){\r\n // year can be given as full four digit year or two digts (2010 or 10 for 2010);  \r\n //it is converted to years since 1970\r\n  if( yr > 99)\r\n      yr = yr - 1970;\r\n  else\r\n      yr += 30;  \r\n  tm.Year = yr;\r\n  tm.Month = mnth;\r\n  tm.Day = dy;\r\n  tm.Hour = hr;\r\n  tm.Minute = min;\r\n  tm.Second = sec;\r\n  setTime(makeTime(tm));\r\n}\r\n\r\nvoid adjustTime(long adjustment) {\r\n  sysTime += adjustment;\r\n}\r\n\r\n// indicates if time has been set and recently synchronized\r\ntimeStatus_t timeStatus() {\r\n  now(); // required to actually update the status\r\n  return Status;\r\n}\r\n\r\nvoid setSyncProvider( getExternalTime getTimeFunction){\r\n  getTimePtr = getTimeFunction;  \r\n  nextSyncTime = sysTime;\r\n  now(); // this will sync the clock\r\n}\r\n\r\nvoid setSyncInterval(time_t interval){ // set the number of seconds between re-sync\r\n  syncInterval = (uint32_t)interval;\r\n  nextSyncTime = sysTime + syncInterval;\r\n}\r\n\r\n";
    util.genFile("Time", "cpp", code);
  }
  
  public void generateTimeAlarmsH(final Util util) {
    String code = "";
    code = "\r\n//  TimeAlarms.h - Arduino Time alarms header for use with Time library\r\n\r\n#ifndef TimeAlarms_h\r\n#define TimeAlarms_h\r\n\r\n#include <inttypes.h>\r\n\r\n#include \"Time.h\"\r\n\r\n#define dtNBR_ALARMS 6   // max is 255\r\n\r\n#define USE_SPECIALIST_METHODS  // define this for testing\r\n\r\ntypedef enum { dtMillisecond, dtSecond, dtMinute, dtHour, dtDay } dtUnits_t;\r\n\r\ntypedef struct  {\r\n\tuint8_t alarmType              :4 ;  // enumeration of daily/weekly (in future: biweekly/semimonthly/monthly/annual)\r\n\t                                     // note that the current API only supports daily or weekly alarm periods\r\n    uint8_t isEnabled              :1 ;  // the timer is only actioned if isEnabled is true \r\n    uint8_t isOneShot              :1 ;  // the timer will be de-allocated after trigger is processed \r\n\t\t\t\t\t\t\t\t\t\t }\r\n    AlarmMode_t   ;\r\n\t\r\n// new time based alarms should be added just before dtLastAlarmType\r\ntypedef enum  {dtNotAllocated, dtTimer, dtExplicitAlarm, dtDailyAlarm, dtWeeklyAlarm, dtLastAlarmType } dtAlarmPeriod_t ; // in future: dtBiweekly, dtMonthly, dtAnnual\r\n\r\n// macro to return true if the given type is a time based alarm, false if timer or not allocated\r\n#define dtIsAlarm(_type_)  (_type_ >= dtExplicitAlarm && _type_ < dtLastAlarmType) \r\n\r\ntypedef uint8_t AlarmID_t;\r\ntypedef AlarmID_t AlarmId;  // Arduino friendly name\r\n\r\n#define dtINVALID_ALARM_ID 255\r\n#define dtINVALID_TIME     0L\r\n\r\nclass AlarmClass;  // forward reference\r\ntypedef void (*OnTick_t)();  // alarm callback function typedef \r\n\r\n// class defining an alarm instance, only used by dtAlarmsClass\r\nclass AlarmClass\r\n{  \r\nprivate:\r\n\r\npublic:\r\n  AlarmClass(); \r\n  OnTick_t onTickHandler; \r\n  void updateNextTrigger();\r\n  time_t value;\r\n  time_t nextTrigger;\r\n  AlarmMode_t Mode;\r\n};\r\n\r\n// class containing the collection of alarms\r\nclass TimeAlarmsClass\r\n{\r\nprivate:\r\n   AlarmClass Alarm[dtNBR_ALARMS];\r\n   void serviceAlarms();\r\n   uint8_t isServicing;\r\n   uint8_t servicedAlarmId; // the alarm currently being serviced\r\n   AlarmID_t create( time_t value, OnTick_t onTickHandler, uint8_t isOneShot, dtAlarmPeriod_t alarmType, uint8_t isEnabled=true);\r\n   \r\npublic:\r\n  TimeAlarmsClass();\r\n  // functions to create alarms and timers\r\n\r\n  AlarmID_t triggerOnce(time_t value, OnTick_t onTickHandler);   // trigger once at the given time_t\r\n\r\n  AlarmID_t alarmRepeat(time_t value, OnTick_t onTickHandler);                    // trigger daily at given time of day\r\n  AlarmID_t alarmRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with hms arguments\r\n  AlarmID_t alarmRepeat(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with day of week \r\n \r\n  AlarmID_t alarmOnce(time_t value, OnTick_t onTickHandler);                     // trigger once at given time of day\r\n  AlarmID_t alarmOnce( const int H,  const int M,  const int S, OnTick_t onTickHandler);  // as above, with hms arguments\r\n  AlarmID_t alarmOnce(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler); // as above, with day of week \r\n  \r\n  AlarmID_t timerOnce(time_t value, OnTick_t onTickHandler);   // trigger once after the given number of seconds \r\n  AlarmID_t timerOnce(const int H,  const int M,  const int S, OnTick_t onTickHandler);   // As above with HMS arguments\r\n  \r\n  AlarmID_t timerRepeat(time_t value, OnTick_t onTickHandler); // trigger after the given number of seconds continuously\r\n  AlarmID_t timerRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler);   // As above with HMS arguments\r\n  \r\n  void delay(unsigned long ms);\r\n   \r\n  // utility methods\r\n  uint8_t getDigitsNow( dtUnits_t Units);         // returns the current digit value for the given time unit\r\n  void waitForDigits( uint8_t Digits, dtUnits_t Units);  \r\n  void waitForRollover(dtUnits_t Units);\r\n \r\n  // low level methods \r\n  void enable(AlarmID_t ID);                // enable the alarm to trigger\r\n  void disable(AlarmID_t ID);               // prevent the alarm from triggering   \r\n  AlarmID_t getTriggeredAlarmId();          // returns the currently triggered  alarm id\r\n  void write(AlarmID_t ID, time_t value);   // write the value (and enable) the alarm with the given ID  \r\n  time_t read(AlarmID_t ID);                // return the value for the given timer  \r\n  dtAlarmPeriod_t readType(AlarmID_t ID);   // return the alarm type for the given alarm ID \r\n  \r\n#ifndef USE_SPECIALIST_METHODS  \r\nprivate:  // the following methods are for testing and are not documented as part of the standard library\r\n#endif\r\n  void free(AlarmID_t ID);                  // free the id to allow its reuse \r\n  uint8_t count();                          // returns the number of allocated timers\r\n  time_t getNextTrigger();                  // returns the time of the next scheduled alarm\r\n  bool isAllocated(AlarmID_t ID);           // returns true if this id is allocated  \r\n  bool isAlarm(AlarmID_t ID);               // returns true if id is for a time based alarm, false if its a timer or not allocated\r\n};\r\n\r\nextern TimeAlarmsClass Alarm;  // make an instance for the user\r\n\r\n/*==============================================================================\r\n * MACROS\r\n *============================================================================*/\r\n\r\n/* public */\r\n#define waitUntilThisSecond(_val_) waitForDigits( _val_, dtSecond)\r\n#define waitUntilThisMinute(_val_) waitForDigits( _val_, dtMinute)\r\n#define waitUntilThisHour(_val_)   waitForDigits( _val_, dtHour)\r\n#define waitUntilThisDay(_val_)    waitForDigits( _val_, dtDay)\r\n#define waitMinuteRollover() waitForRollover(dtSecond)\r\n#define waitHourRollover()   waitForRollover(dtMinute)\r\n#define waitDayRollover()    waitForRollover(dtHour)\r\n\r\n#define AlarmHMS(_hr_, _min_, _sec_) (_hr_ * SECS_PER_HOUR + _min_ * SECS_PER_MIN + _sec_)\r\n\r\n\r\n#endif /* TimeAlarms_h */\r\n";
    util.genFile("TimeAlarms", "h", code);
  }
  
  public void generateTimeAlarmsCpp(final Util util) {
    String code = "";
    code = "\r\n/*\r\n  TimeAlarms.cpp - Arduino Time alarms for use with Time library   \r\n  Copyright (c) 208-2011 Michael Margolis. \r\n  \r\n  This library is free software; you can redistribute it and/or\r\n  modify it under the terms of the GNU Lesser General Public\r\n  License as published by the Free Software Foundation; either\r\n  version 2.1 of the License, or (at your option) any later version.\r\n\r\n  This library is distributed in the hope that it will be useful,\r\n  but WITHOUT ANY WARRANTY; without even the implied warranty of\r\n  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU\r\n  Lesser General Public License for more details.\r\n */\r\n \r\n /*\r\n  2 July 2011 - replaced alarm types implied from alarm value with enums to make trigger logic more robust\r\n              - this fixes bug in repeating weekly alarms - thanks to Vincent Valdy and draythomp for testing\r\n*/\r\n\r\nextern \"C\" {\r\n#include <string.h> // for memset\r\n}\r\n\r\n#include \"Arduino.h\"\r\n#include \"TimeAlarms.h\"\r\n#include \"Time.h\"\r\n\r\n#define IS_ONESHOT  true   // constants used in arguments to create method\r\n#define IS_REPEAT   false \r\n\r\n\r\n//**************************************************************\r\n//* Alarm Class Constructor\r\n\r\nAlarmClass::AlarmClass()\r\n{\r\n  Mode.isEnabled = Mode.isOneShot = 0;\r\n  Mode.alarmType = dtNotAllocated;\r\n  value = nextTrigger = 0;\r\n  onTickHandler = NULL;  // prevent a callback until this pointer is explicitly set \r\n}\r\n\r\n//**************************************************************\r\n//* Private Methods\r\n\r\n \r\nvoid AlarmClass::updateNextTrigger()\r\n{  \r\n  if( (value != 0) && Mode.isEnabled )\r\n  {\r\n    time_t time = now();\r\n    if( dtIsAlarm(Mode.alarmType) && nextTrigger <= time )   // update alarm if next trigger is not yet in the future\r\n    {      \r\n      if(Mode.alarmType == dtExplicitAlarm ) // is the value a specific date and time in the future\r\n      {\r\n        nextTrigger = value;  // yes, trigger on this value   \r\n      }\r\n      else if(Mode.alarmType == dtDailyAlarm)  //if this is a daily alarm\r\n      {\r\n        if( value + previousMidnight(now()) <= time)\r\n        {\r\n          nextTrigger = value + nextMidnight(time); // if time has passed then set for tomorrow\r\n        }\r\n        else\r\n        {\r\n          nextTrigger = value + previousMidnight(time);  // set the date to today and add the time given in value   \r\n        }\r\n      }\r\n      else if(Mode.alarmType == dtWeeklyAlarm)  // if this is a weekly alarm\r\n      {\r\n        if( (value + previousSunday(now())) <= time)\r\n        {\r\n          nextTrigger = value + nextSunday(time); // if day has passed then set for the next week.\r\n        }\r\n        else\r\n        {\r\n          nextTrigger = value + previousSunday(time);  // set the date to this week today and add the time given in value \r\n        } \r\n      }\r\n      else  // its not a recognized alarm type - this should not happen \r\n      {\r\n        Mode.isEnabled = 0;  // Disable the alarm\r\n      }\t  \r\n    }\r\n    if( Mode.alarmType == dtTimer)\r\n    {\r\n      // its a timer\r\n      nextTrigger = time + value;  // add the value to previous time (this ensures delay always at least Value seconds)\r\n    }\r\n  }\r\n  else\r\n  {\r\n    Mode.isEnabled = 0;  // Disable if the value is 0\r\n  }\r\n}\r\n\r\n//**************************************************************\r\n//* Time Alarms Public Methods\r\n\r\nTimeAlarmsClass::TimeAlarmsClass()\r\n{\r\n  isServicing = false;\r\n  for(uint8_t id = 0; id < dtNBR_ALARMS; id++)\r\n     free(id);   // ensure  all Alarms are cleared and available for allocation  \r\n}\r\n\r\n// this method creates a trigger at the given absolute time_t\r\n// it replaces the call to alarmOnce with values greater than a week   \r\nAlarmID_t TimeAlarmsClass::triggerOnce(time_t value, OnTick_t onTickHandler){   // trigger once at the given time_t\r\n     if( value > 0)\r\n        return create( value, onTickHandler, IS_ONESHOT, dtExplicitAlarm );\r\n     else\r\n        return dtINVALID_ALARM_ID; // dont\'t allocate if the time is greater than one day \t  \r\n}\r\n\r\n// this method will now return an error if the value is greater than one day - use DOW methods for weekly alarms   \r\nAlarmID_t TimeAlarmsClass::alarmOnce(time_t value, OnTick_t onTickHandler){   // trigger once at the given time of day\r\n     if( value <= SECS_PER_DAY)\r\n        return create( value, onTickHandler, IS_ONESHOT, dtDailyAlarm );\r\n     else\r\n        return dtINVALID_ALARM_ID; // dont\'t allocate if the time is greater than one day \t  \r\n}\r\n\r\nAlarmID_t TimeAlarmsClass::alarmOnce(const int H,  const int M,  const int S,OnTick_t onTickHandler){   // as above with HMS arguments\r\n   return create( AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtDailyAlarm );\r\n}\r\n\r\nAlarmID_t TimeAlarmsClass::alarmOnce(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler){  // as above, with day of week \r\n   return create( (DOW-1) * SECS_PER_DAY + AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtWeeklyAlarm );   \r\n}\r\n   \r\n// this method will now return an error if the value is greater than one day - use DOW methods for weekly alarms   \r\nAlarmID_t TimeAlarmsClass::alarmRepeat(time_t value, OnTick_t onTickHandler){ // trigger daily at the given time\r\n    if( value <= SECS_PER_DAY)\r\n       return create( value, onTickHandler, IS_REPEAT, dtDailyAlarm );\r\n    else\r\n       return dtINVALID_ALARM_ID; // dont\'t allocate if the time is greater than one day \t  \r\n    }\r\n    \r\n    AlarmID_t TimeAlarmsClass::alarmRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler){ // as above with HMS arguments\r\n         return create( AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtDailyAlarm );\r\n    }\r\n    \r\n    AlarmID_t TimeAlarmsClass::alarmRepeat(const timeDayOfWeek_t DOW, const int H,  const int M,  const int S, OnTick_t onTickHandler){  // as above, with day of week \r\n       return create( (DOW-1) * SECS_PER_DAY + AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtWeeklyAlarm );      \r\n    }\r\n      \r\n    AlarmID_t TimeAlarmsClass::timerOnce(time_t value, OnTick_t onTickHandler){   // trigger once after the given number of seconds \r\n         return create( value, onTickHandler, IS_ONESHOT, dtTimer );\r\n    }\r\n    \r\n    AlarmID_t TimeAlarmsClass::timerOnce(const int H,  const int M,  const int S, OnTick_t onTickHandler){   // As above with HMS arguments\r\n      return create( AlarmHMS(H,M,S), onTickHandler, IS_ONESHOT, dtTimer );\r\n    }\r\n      \r\n    AlarmID_t TimeAlarmsClass::timerRepeat(time_t value, OnTick_t onTickHandler){ // trigger after the given number of seconds continuously\r\n         return create( value, onTickHandler, IS_REPEAT, dtTimer);\r\n    }\r\n    \r\n    AlarmID_t TimeAlarmsClass::timerRepeat(const int H,  const int M,  const int S, OnTick_t onTickHandler){ // trigger after the given number of seconds continuously\r\n         return create( AlarmHMS(H,M,S), onTickHandler, IS_REPEAT, dtTimer);\r\n    }\r\n    \r\n    void TimeAlarmsClass::enable(AlarmID_t ID)\r\n    {\r\n      if(isAllocated(ID)) {\r\n        Alarm[ID].Mode.isEnabled = (Alarm[ID].value != 0) && (Alarm[ID].onTickHandler != 0) ;  // only enable if value is non zero and a tick handler has been set\r\n        Alarm[ID].updateNextTrigger(); // trigger is updated whenever  this is called, even if already enabled\t \r\n      }\r\n    }\r\n    \r\n    void TimeAlarmsClass::disable(AlarmID_t ID)\r\n    {\r\n      if(isAllocated(ID))\r\n        Alarm[ID].Mode.isEnabled = false;\r\n    }\r\n      \r\n    // write the given value to the given alarm\r\n    void TimeAlarmsClass::write(AlarmID_t ID, time_t value)\r\n    {\r\n      if(isAllocated(ID))\r\n      {\r\n        Alarm[ID].value = value;\r\n        enable(ID);  // update trigger time\r\n      }\r\n    }\r\n    \r\n    // return the value for the given alarm ID\r\n    time_t TimeAlarmsClass::read(AlarmID_t ID)\r\n    {\r\n      if(isAllocated(ID))\r\n        return Alarm[ID].value ;\r\n      else \t\r\n        return dtINVALID_TIME;  \r\n    }\r\n    \r\n    // return the alarm type for the given alarm ID\r\n    dtAlarmPeriod_t TimeAlarmsClass::readType(AlarmID_t ID)\r\n    {\r\n      if(isAllocated(ID))\r\n        return (dtAlarmPeriod_t)Alarm[ID].Mode.alarmType ;\r\n      else \t\r\n        return dtNotAllocated;  \r\n    }\r\n\r\n    void TimeAlarmsClass::free(AlarmID_t ID)\r\n    {\r\n      if(isAllocated(ID))\r\n      {\r\n        Alarm[ID].Mode.isEnabled = false;\r\n    \tAlarm[ID].Mode.alarmType = dtNotAllocated;\r\n        Alarm[ID].onTickHandler = 0;\r\n    \tAlarm[ID].value = 0;\r\n    \tAlarm[ID].nextTrigger = 0;   \t\r\n      }\r\n    }\r\n    \r\n    // returns the number of allocated timers\r\n    uint8_t TimeAlarmsClass::count()\r\n    {\r\n       uint8_t c = 0; \r\n       for(uint8_t id = 0; id < dtNBR_ALARMS; id++)\r\n       {\r\n          if(isAllocated(id))\r\n            c++;\r\n       }\r\n       return c;\r\n    }\r\n    \r\n    // returns true only if id is allocated and the type is a time based alarm, returns false if not allocated or if its a timer\r\n     bool TimeAlarmsClass::isAlarm(AlarmID_t ID)\r\n     {\r\n        return( isAllocated(ID) && dtIsAlarm(Alarm[ID].Mode.alarmType) );\r\n     }\r\n     \r\n     // returns true if this id is allocated\r\n     bool TimeAlarmsClass::isAllocated(AlarmID_t ID)\r\n     {\r\n        return( ID < dtNBR_ALARMS && Alarm[ID].Mode.alarmType != dtNotAllocated );\r\n     }\r\n     \r\n    \r\n    AlarmID_t TimeAlarmsClass::getTriggeredAlarmId()  //returns the currently triggered  alarm id\r\n    // returns  dtINVALID_ALARM_ID if not invoked from within an alarm handler\r\n    {\r\n      if(isServicing)\r\n           return  servicedAlarmId;  // new private data member used instead of local loop variable i in serviceAlarms();\r\n      else\r\n         return dtINVALID_ALARM_ID; // valid ids only available when servicing a callback\r\n    }\r\n     \r\n    // following functions are not Alarm ID specific.\r\n    void TimeAlarmsClass::delay(unsigned long ms)\r\n    {\r\n      unsigned long start = millis();\r\n      while( millis() - start  <= ms)\r\n        serviceAlarms();\r\n    }\r\n    \t\t\r\n    void TimeAlarmsClass::waitForDigits( uint8_t Digits, dtUnits_t Units)\r\n    {\r\n      while(Digits != getDigitsNow(Units) )\r\n      {\r\n        serviceAlarms();\r\n      }\r\n    }\r\n    \r\n    void TimeAlarmsClass::waitForRollover( dtUnits_t Units)\r\n    {\r\n      while(getDigitsNow(Units) == 0  ) // if its just rolled over than wait for another rollover\t                            \r\n        serviceAlarms();\r\n      waitForDigits(0, Units);\r\n    }\r\n    \r\n    uint8_t TimeAlarmsClass::getDigitsNow( dtUnits_t Units)\r\n    {\r\n      time_t time = now();\r\n      if(Units == dtSecond) return numberOfSeconds(time);\r\n      if(Units == dtMinute) return numberOfMinutes(time); \r\n      if(Units == dtHour) return numberOfHours(time);\r\n      if(Units == dtDay) return dayOfWeek(time);\r\n      return 255;  // This should never happen \r\n    }\r\n    \r\n    //***********************************************************\r\n    //* Private Methods\r\n    \r\n    void TimeAlarmsClass::serviceAlarms()\r\n    {\r\n      if(! isServicing)\r\n      {\r\n        isServicing = true;\r\n        for( servicedAlarmId = 0; servicedAlarmId < dtNBR_ALARMS; servicedAlarmId++)\r\n        {\r\n          if( Alarm[servicedAlarmId].Mode.isEnabled && (now() >= Alarm[servicedAlarmId].nextTrigger)  )\r\n          {\r\n            OnTick_t TickHandler = Alarm[servicedAlarmId].onTickHandler;\r\n            if(Alarm[servicedAlarmId].Mode.isOneShot)\r\n               free(servicedAlarmId);  // free the ID if mode is OnShot\t\t\r\n            else   \r\n               Alarm[servicedAlarmId].updateNextTrigger();\r\n            if( TickHandler != NULL) {        \r\n              (*TickHandler)();     // call the handler  \r\n            }\r\n          }\r\n        }\r\n        isServicing = false;\r\n      }\r\n    }\r\n    \r\n    // returns the absolute time of the next scheduled alarm, or 0 if none\r\n     time_t TimeAlarmsClass::getNextTrigger()\r\n     {\r\n     time_t nextTrigger = 0xffffffff;  // the max time value\r\n     \r\n        for(uint8_t id = 0; id < dtNBR_ALARMS; id++)\r\n        {\r\n          if(isAllocated(id) )\r\n          {\r\n        \tif(Alarm[id].nextTrigger <  nextTrigger)\r\n    \t\t   nextTrigger = Alarm[id].nextTrigger;\t\r\n          }      \r\n    \t}\r\n        return nextTrigger == 0xffffffff ? 0 : nextTrigger;  \t\r\n     }\r\n    \r\n    // attempt to create an alarm and return true if successful\r\n    AlarmID_t TimeAlarmsClass::create( time_t value, OnTick_t onTickHandler, uint8_t isOneShot, dtAlarmPeriod_t alarmType, uint8_t isEnabled) \r\n    {\r\n      if( ! (dtIsAlarm(alarmType) && now() < SECS_PER_YEAR)) // only create alarm ids if the time is at least Jan 1 1971\r\n      {  \r\n    \tfor(uint8_t id = 0; id < dtNBR_ALARMS; id++)\r\n        {\r\n          if( Alarm[id].Mode.alarmType == dtNotAllocated )\r\n    \t  {\r\n    \t  // here if there is an Alarm id that is not allocated\r\n      \t    Alarm[id].onTickHandler = onTickHandler;\r\n    \t    Alarm[id].Mode.isOneShot = isOneShot;\r\n    \t    Alarm[id].Mode.alarmType = alarmType;\r\n    \t    Alarm[id].value = value;\r\n    \t    isEnabled ?  enable(id) : disable(id);   \r\n            return id;  // alarm created ok\r\n    \t  }  \r\n        }\r\n      }\r\n      return dtINVALID_ALARM_ID; // no IDs available or time is invalid\r\n    }\r\n    \r\n    // make one instance for the user to use\r\n    TimeAlarmsClass Alarm = TimeAlarmsClass() ;\r\n    \r\n    \r\n\r\n";
    util.genFile("TimeAlarms", "cpp", code);
  }
}