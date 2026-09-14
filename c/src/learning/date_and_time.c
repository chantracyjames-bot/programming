#include <stdio.h>
#include <time.h>

int main() {
    time_t my_time = time(NULL);
    struct tm *yes = localtime(&my_time);       // localtime() returns a pointer to a struct tm

    printf("Year: %d\n", yes->tm_year + 1900); // since localdate returns the year since 1900
    printf("Month: %d\n", yes->tm_mon + 1);    // months are ordered from 0 to 11
    printf("Day: %d\n", yes->tm_mday);         // month day
    printf("Hour: %d\n", yes->tm_hour);        // current hour
    printf("Minute: %d\n", yes->tm_min);       // current minute
    printf("Second: %d\n", yes->tm_sec);       // current second
    
    return 0;
}