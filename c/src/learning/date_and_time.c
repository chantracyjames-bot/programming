/* date and time
    - in C, working with dates and times is done via a specific header file
        - imported from the <time.h> header library
            - syntax:
                #include <time.h>
        - after importing the required header files
            - it is now possible to get the current time, format it, etc.

        - getting the current time
            - the time() function returns the current time
                - as a data type time_t
            - syntax:
                time(&<variable>);
            - example:
                time_t my_time;
                time(&my_time);

        - breaking down the time
            - it is possible to acess the individual parts of a date or time
                - like the year, month or day, or hour, minute or second
            - done using the localtime() function
                - taking the current time, from the time() function
                - into a struct tm structure
                    - a special structure that holds the date and time into separate fields
            - syntax:
                struct tm *<pointer_name> = localtime(<variable>);
            - example:
                time_t my_time;
                struct tm *yes = localtime(&my_time);      // localtime() returns a pointer to a struct tm

                printf("Year: %d\n", yes->tm_year + 1900); // since localdate returns the year since 1900
                printf("Month: %d\n", yes->tm_month + 1);  // months are ordered from 0 to 11
                printf("Day: %d\n", yes->tm_mday);         // month day
                printf("Hour: %d\n", yes->tm_hour);        // current hour
                printf("Minute: %d\n", yes->tm_min);       // current minute
                printf("Second: %d\n", yes->tm_sec);       // current second
                
        - formatting date and time
            - it is done through the strftime() function
                - fordats the date and time into a string
            - syntax:
                strftime(<buffer_variable>, <buffer_size>, <format>, <time_struct>);
            - example:
                time_t my_time;
                time(&my_time);
                struct tm *yes = localtime(&my_time);
                char my_buffer[100];
                strftime(my_buffer, 100, "%d-%m-%Y %H:%M:%S", yes);
*/