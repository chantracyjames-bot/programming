/* time and date
    - requires the <ctime> header library
    - functions
        - std::time()
            - returns time elapsed since January1, 1970 @ 00:00:00 UTC
            - syntax:
                std::time(<reference>)
            - <pointer> refers to a reference of a variable
                - most commontly to a time_t data type variable
            - <pointer> will take the variable, write the current time and return it
                example:
                time_t timeNow;
                std::time(&timeNow); // timeNow stores the current time
            - using nullptr as an argument for <pointer> does not store the current time
                - it will only return it, not store it
                - using NULL does the same thing

        - std::clock()
            - processing time spent by the CPU when running a program
            - presented in ticks, not seconds
            - syntax:
                std::clock();
            - returns a clock_t type value

        - std::difftime()
            - returns the difference between two time_t values
            - must be declared as a double as it retrun such
            - syntax:
                std::difftime(<startValue>, <endValue>);

        - std::mktime()
            - converts a tm struct into a timestamp
            - syntax:
                std::mktime(<tmstructReference>)
            - sidenote:
                - the argument that std::mktime() takes has to be a reference to the structure
            - it needs these values from the tm structure to be able to return a value
                - tm_year
                - tm_mon   
                - tm_mday  
                - tm_hour
                - tm_min 
                - tm_sec   
                - tm_isdst
                        
        - std::ctime()
            - converts a timestamp into a C style formatted representation of time
            - syntax:
                std::ctime(<reference>)
            - usually outputs
                <WeekdayAbbr> <MonthAbbr> <MonthDay> <Hour>:<Minute>:<Second> <Year>

        - std::localtime()
            - converts a timestamp into tm structure
                - representing its time in the system's local time zone
            - syntax:
                std::localtime(<timestampReference>);
            - example:
                time_t timeRN;
                time(&timeRN);
                struct tm* localTime;
                localTime = localtime(&timeRN);
                // or
                time_t timeRN = time(timeRN);
                struct tm localTime = *localtime(&timeRN);

        - std::gmtime()
            - converts a timestamp into a tm stucture
                - representing its time in GMT time zone
            - syntax:
                std::gmtime(<timestampReference>);
            - example:
                time_t timeGTFO;
                time(&timeGTFO);
                struct tm* greenichMeanTime;
                greenichMeanTime = gmtime(&timeGTFO);
                // or
                time_t timeGTFO = time(&timeGTFO);
                struct tm greenichMeanTime = *gmtime(&timeGTFO);

        - std::asctime()
            - converts a tm structure into a C style formatted representation of time
            - syntax:
                std::asctime(<tmstruct>);
            - example: 
                stuct tm* timeStuff;
                std::asctime(timeStuff); // returns garbage value since timeStuff is not initialized
            - usually using the std::localtim() or gmtime() functions automatically returns a fixed tm structure
            - manually creating a tm struture requires to be "fixed" first before displaying
                - example:
                    mktime(&timeStruct);
                    asctime(&timeStruct);

        - std::strftime()
            - is an advanced alternative of std::asctime()
            - converts a tm stucture into a C style formatted representation of time
            - it has many customization options rather than a constant output unlike std::asctime
            - syntax:  
                std::strftime(<charArrayName>, <charArraySize>, <formatSpecifiers>, <tmstruct>);
            - it takes four arguments
                - the first is the name of the char array for the output to be stored in
                - the second is the size of the char array, it must match the char declaration
                    - if it exceeds the original declaration, string smashing occurs
                    - it it less than the origianl size, the output will yield less characters
                - the thrrd is the format that the output becomes
                - the fourth if the reference to the tm structure
            - format specifiers
                %a - abbr name of day of the week          // Fri
                %b - abbr name of month of the year        // Jun
                %h - functionally the same as %b
                %A - nme of day of the week                // Friday
                %B - name of month of the year             // June
                %d - num of the day of the month (w/ 0)    // 12
                %e - num of the day of the month (w/  )    // 12
                %H - 24-hour format of the hour of the day // 17
                %I - 12-hour format of the hour of the day // 05
                %M - minutes of the hour                   // 50
                %p - AM or PM                              // PM
                %S - seconds of the minute                 // 02
                %y - 2 digit representation of the year    // 26
                %Y - 4 digit representation of the year    // 2026

    - data types:
        - time_t
            - on modern systems, it is the same as long
            - technically, time_t is an arithmetic type
                - it can be int, long, long long, or even floating points
        
    - tm structure
        - is a structure that stores at least 9 members
            - differs from different implementations of C++
        - typical members
            - tm_year  // the year since 1900
                        // <currentYear> - 1900
            - tm_mon   // the current month
                        // ranges from 0 - 11
            - tm_mday  // the current day of the month
                        // ranges from1 - 31
            - tm_hour  // the current hour
                        // ranges from 0 - 23
                        // 0 is 12am, 23 is 11pm
            - tm_min   // the current minute of the hour
                        // ranges from 0 - 59
            - tm_sec   // the current second of the minute
                        // ranges from 0 -60
                        // allows one leap second
            - tm_isdst // status of daylight savings time
                        //1 means on, 0 means off, 1 means computer configuration
            - tm_yday  // the day since January 1st
                        // ranges from 0 - 365
                        // 0 is January 1st
            - tm_wday  // the day of the wee
                        // ranges from 0 - 6
                        // 0 is Sunday
        - syntax:
            struct tm <structName>;
        - example:
            stuct tm timeStruct;
            timeStruct.tm_year = 126;
            timeStruct.tm_mon = 5;
            timeStruct.tm_mday = 12;
            timeStruct.tm_hour = 15;
            timeStruct.tm_min = 49;
            timeStruct.tm_sec = 39;
            timeStruct.tm_isdst = 0;
            // usually not needed or not required by std::mktime()
            // timeStruct.tm_yday;
            // timeStruct.tm_wday;
*/