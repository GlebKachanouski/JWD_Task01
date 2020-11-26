package by.epam.jwd.tests;

import by.epam.jwd.task01_01.Task01_01;
import org.junit.*;

public class Test01_01 {
    @Test
    public void Test1(){
        Assert.assertEquals(6, new Task01_01().NumberCheck(14));
        Assert.assertEquals(5, new Task01_01().NumberCheck(55));
        Assert.assertEquals(9, new Task01_01().NumberCheck(27));
        Assert.assertEquals(1, new Task01_01().NumberCheck(9));
        Assert.assertEquals(1, new Task01_01().NumberCheck(11));
    }
}



