package by.epam.jwd.tests;

import by.epam.jwd.task01_03.Task01_03;
import org.junit.Assert;
import org.junit.Test;

public class Test01_03 {
    @Test
    public void Test3(){
        Assert.assertEquals(25, new Task01_03().SmallSquareArea(50), 1);
        Assert.assertEquals(35, new Task01_03().SmallSquareArea(70), 1);
        Assert.assertEquals(5, new Task01_03().SmallSquareArea(10), 1);
    }
}
