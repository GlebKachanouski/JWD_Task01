package by.epam.jwd.tests;

import by.epam.jwd.task01_07.Task01_07;
import org.junit.Assert;
import org.junit.Test;

public class Test01_07 {
    @Test
    public void Test7(){
        Assert.assertEquals("A closer than B", new Task01_07().LengthCheck(3,7,4,8));
        Assert.assertEquals("B closer than A", new Task01_07().LengthCheck(7,7,4,8));
        Assert.assertEquals("A equals B", new Task01_07().LengthCheck(3,7,7,3));
    }
}
