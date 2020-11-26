package by.epam.jwd.task01_08;

public class Task01_08 {
    public double NumberCheck(int x){
        if(x >= 3) return (Math.pow(x, 2) + 3*x + 9) * -1;
        else return (1 / (Math.pow(x, 3) - 6));
    }
}
