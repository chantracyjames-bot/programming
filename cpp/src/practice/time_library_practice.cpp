#include <iostream>
#include <ctime>

int main() {
    time_t yes;
    struct tm timeStruct;
    timeStruct.tm_year = 126;
    timeStruct.tm_mon = 5;
    timeStruct.tm_mday = 12;
    timeStruct.tm_hour = 17;
    timeStruct.tm_min = 49;
    timeStruct.tm_sec = 39;
    timeStruct.tm_isdst = 0;

    yes = std::mktime(&timeStruct);
    std::cout << std::ctime(&yes) << std::endl << std::asctime(std::localtime(&yes));

    return 0;

    /* localtime
    time_t timeRN;
    time(&timeRN);
    struct tm* localTime;
    localTime = localtime(&timeRN);
    std::cout << std::asctime(localTime);
    */

    /* gmtime
    time_t timeGTFO;
    time(&timeGTFO);
    struct tm* greenichMeanTime;
    greenichMeanTime = gmtime(&timeGTFO);
    std::cout << std::asctime(greenichMeanTime);
    */
}