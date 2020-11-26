package by.epam.jwd.task01_04;

public class Task01_04 {
    public boolean HasEvenNumbered(int[] array){
        int even = 0;
        for (int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) even++;
        }
        if(even >= 2) return true;
        else return false;
    }
}
