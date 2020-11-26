package by.epam.jwd.tests;

import by.epam.jwd.task01_02.Task01_02;
import org.junit.Assert;
import org.junit.Test;

public class Test01_02 {
    @Test
    public void Test2(){
        Assert.assertEquals(31, new Task01_02().DaysInMonth(5, 2014));
        Assert.assertEquals(30, new Task01_02().DaysInMonth(11, 1999));
        Assert.assertEquals(30, new Task01_02().DaysInMonth(11, 2020));
    }
}
