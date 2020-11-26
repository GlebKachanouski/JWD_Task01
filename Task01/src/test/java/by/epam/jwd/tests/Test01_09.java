package by.epam.jwd.tests;

import by.epam.jwd.task01_09.Task01_09;
import org.junit.Assert;
import org.junit.Test;

public class Test01_09 {
    @Test
    public void Test9(){
        Assert.assertEquals("31,42, 78,54", new Task01_09(5).GetCircleData());
        Assert.assertEquals("69,12, 380,13", new Task01_09(11).GetCircleData());
        Assert.assertEquals("50,27, 201,06", new Task01_09(8).GetCircleData());
    }
}
