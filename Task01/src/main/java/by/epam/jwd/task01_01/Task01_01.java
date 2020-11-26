package by.epam.jwd.task01_01;

public class Task01_01 {
    public int NumberCheck(int number){
        int lastDigit = (int)Math.pow(number % 10, 2) % 10;
        return lastDigit;
    }
}
