package by.epam.jwd.task01_02;

public class Task01_02 {
    private boolean IsLeapYear(int y)
    {
        return (y%4 == 0 && y%100 != 0) || (y%400 == 0);
    }

    public int DaysInMonth(int month, int year)
    {
        if(month > 0 && year > 0) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && IsLeapYear(year))
                return 29;

            return daysInMonth[month - 1];
        }
        return 0;
    }
}
