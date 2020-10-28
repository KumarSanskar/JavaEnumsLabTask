import java.util.Scanner;

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
        System.out.println("Please enter name of current month for year 2020: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim().toUpperCase();
        System.out.println("Please enter today's date: ");
        int presentDate = scanner.nextInt();
        scanner.close();
        System.out.println("You entered month name as " + name + " and present date as " + presentDate);
        MonthNames currentMonth = MonthNames.valueOf(name);
        switch (currentMonth) {
            case JANUARY -> System.out.println("You have " + (MonthNames.JANUARY.getNumberOfDaysInMonth() - presentDate) + " days left in month of January.");
            case FEBRUARY -> System.out.println("You have " + (MonthNames.FEBRUARY.getNumberOfDaysInMonth() - presentDate) + " days left in month of February.");
            case MARCH -> System.out.println("You have " + (MonthNames.MARCH.getNumberOfDaysInMonth() - presentDate) + " days left in month of March.");
            case APRIL -> System.out.println("You have " + (MonthNames.APRIL.getNumberOfDaysInMonth() - presentDate) + " days left in month of April.");
            case MAY -> System.out.println("You have " + (MonthNames.MAY.getNumberOfDaysInMonth() - presentDate) + " days left in month of May.");
            case JUNE -> System.out.println("You have " + (MonthNames.JUNE.getNumberOfDaysInMonth() - presentDate) + " days left in month of June.");
            case JULY -> System.out.println("You have " + (MonthNames.JULY.getNumberOfDaysInMonth() - presentDate) + " days left in month of July.");
            case AUGUST -> System.out.println("You have " + (MonthNames.AUGUST.getNumberOfDaysInMonth() - presentDate) + " days left in month of August.");
            case SEPTEMBER -> System.out.println("You have " + (MonthNames.SEPTEMBER.getNumberOfDaysInMonth() - presentDate) + " days left in month of September.");
            case OCTOBER -> System.out.println("You have " + (MonthNames.OCTOBER.getNumberOfDaysInMonth() - presentDate) + " days left in month of October.");
            case NOVEMBER -> System.out.println("You have " + (MonthNames.NOVEMBER.getNumberOfDaysInMonth() - presentDate) + " days left in month of November.");
            case DECEMBER -> System.out.println("You have " + (MonthNames.DECEMBER.getNumberOfDaysInMonth() - presentDate) + " days left in month of December.");
            default -> System.out.println("Invalid Inputs, please check and try again.");
        }

    }
}


