public enum MonthNames {
    JANUARY(31), FEBRUARY(29), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(30), NOVEMBER(30), DECEMBER(31);


    private final int numberOfDaysInMonth;

    MonthNames(int numberOfDaysInMonth) {
        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }
}


