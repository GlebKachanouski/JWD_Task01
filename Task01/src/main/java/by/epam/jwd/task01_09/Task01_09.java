package by.epam.jwd.task01_09;

public class Task01_09 {
    private double circleLength;
    private double circleArea;

    public Task01_09(int R){
        R = Math.abs(R);
        circleLength = 2 * Math.PI * R;
        circleArea = Math.PI * Math.pow(R, 2);
    }

    public String GetCircleData(){
        return String.format("%.2f, %.2f", circleLength, circleArea);
    }

}
