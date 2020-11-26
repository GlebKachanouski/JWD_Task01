package by.epam.jwd.task01_06;

public class Task01_06 {
    public String HoursTaken(int seconds){
        if(seconds > 0) {
            int hours, minutes;
            hours = seconds / 3600;
            seconds = seconds - hours * 3600;
            minutes = seconds / 60;
            seconds = seconds - minutes * 60;
            return hours + ":" + minutes + ":" + seconds;
        }else{
            return "Input number can't be less or equals 0!";
        }
    }
}
