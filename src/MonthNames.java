import java.util.Calendar;
import java.util.GregorianCalendar;

public enum MonthNames {
    JANUARY(31), FEBRUARY(29), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(30), NOVEMBER(30), DECEMBER(31);


    private final int numberOfDaysInMonth;

    MonthNames(int numberOfDaysInMonth) {
        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }

    public int getNumberOfDaysInMonth() {
        return numberOfDaysInMonth;
    }
}

class Main {
    public static void main(String[] args) {
        int presentDateOfMonth = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        int numberOfDaysInMonth = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        int numberOfDaysLeft = numberOfDaysInMonth - presentDateOfMonth;
        System.out.println("There are " + numberOfDaysLeft + " left in present month.");
    }
}


