package by.epam.jwd.task01_07;

public class Task01_07 {
    public String LengthCheck(int x1, int x2, int y1, int y2){
        double X = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
        double Y = Math.sqrt(Math.pow(y1, 2) + Math.pow(y2, 2));
        if(X == Y) return "A equals B";
        if(X > Y) return "B closer than A";
        else return "A closer than B";
    }
}
