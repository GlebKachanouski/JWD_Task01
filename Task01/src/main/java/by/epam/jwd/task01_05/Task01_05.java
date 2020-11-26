package by.epam.jwd.task01_05;

public class Task01_05 {
    public boolean IsPerfect(int number) {
        if(number > 0 && Sum(number)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean Sum(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n % i == 0) sum += i;
        }
        if(sum == n) return true;
        else return false;
    }
}
