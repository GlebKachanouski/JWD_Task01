package by.epam.jwd.task01_10;

public class Task01_10 {
    private String[] array;
    private int counter = 0;

    public Task01_10(int a, int b, double h){
        if (array == null) ArrayInit(a, b);
        for(double i=a; i<=b; i+=h){
            ArrayFill(String.format("F(%.2f) = tg(%.2f)", i, Math.tan(i)));
        }
    }

    private void ArrayInit(int a, int b){
            array = new String[b-a+1];
    }

    private void ArrayFill(String a){
        array[counter] = a;
        counter++;
    }

    public String[] GetArray(){
        return array;
    }
}
