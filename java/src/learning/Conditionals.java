import java.time.DayOfWeek;
import java.time.LocalDate;
public class Conditionals {
    static void switchCase(DayOfWeek day) {
        String currentDay;
        switch (day) { 
            case SUNDAY:
                currentDay = "Today is Sunday";
                break;
            case MONDAY:
                currentDay = "Today is Monday";
                break;
            case TUESDAY:
                currentDay = "Today is Tuesday";
                break;
            case WEDNESDAY:
                currentDay = "Today is Wednesday";
                break;
            case THURSDAY:
                currentDay = "Today is Thusday";
                break;
            case FRIDAY:
                currentDay = "Today is Friday";
                break;
            case SATURDAY:
                currentDay = "Today is Saturday";
                break;
            default:
                currentDay = "idkman";
                break;
        }
        System.out.println(currentDay);
    }

    static void ifElseIfElse(DayOfWeek day) {
        String currentDay;
        if (day == DayOfWeek.SUNDAY) {
            currentDay = "Today is Sunday";
        } else if (day == DayOfWeek.MONDAY) {
            currentDay = "Today is Monday";
        } else if (day == DayOfWeek.TUESDAY) {
            currentDay = "Today is Tuesday";
        } else if (day == DayOfWeek.WEDNESDAY) {
            currentDay = "Today is Wednesday";
        } else if (day == DayOfWeek.THURSDAY) {
            currentDay = "Today is Thursday";
        } else if (day == DayOfWeek.FRIDAY) {
            currentDay = "Today is Friday";
        } else if (day == DayOfWeek.SATURDAY) {
            currentDay = "Today is Saturday";
        } else {
            currentDay = "lumbago";
        }
        System.out.println(currentDay);
    }

    static void ternaryOperators(DayOfWeek day) {
        String currentDay =  (day == DayOfWeek.SUNDAY) ? "Today is Sunday" 
                           : (day == DayOfWeek.MONDAY) ? "Today is Monday"
                           : (day == DayOfWeek.TUESDAY) ? "Today is Tuesday"
                           : (day == DayOfWeek.WEDNESDAY) ? "Today is Wednesday"
                           : (day == DayOfWeek.THURSDAY) ? "Today is Thursday"
                           : (day == DayOfWeek.FRIDAY) ? "Today is Friday"
                           : (day == DayOfWeek.SATURDAY) ? "Today is Saturday"
                           : "Hello World";
        System.out.println(currentDay);
    }

    public static void main(String[] args) {
        DayOfWeek day = LocalDate.now().getDayOfWeek();

        ternaryOperators(day);
    }

}
