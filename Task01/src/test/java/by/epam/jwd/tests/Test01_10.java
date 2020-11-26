package by.epam.jwd.tests;

import by.epam.jwd.task01_10.Task01_10;
import org.junit.Assert;
import org.junit.Test;

public class Test01_10 {
    private String[] expectedArray = new String[]{"F(2,00) = tg(-2,19)",
                                                  "F(3,00) = tg(-0,14)",
                                                  "F(4,00) = tg(1,16)",
                                                  "F(5,00) = tg(-3,38)",
                                                  "F(6,00) = tg(-0,29)",
                                                  "F(7,00) = tg(0,87)",
                                                  "F(8,00) = tg(-6,80)"};
    @Test
    public void Test10(){
        Assert.assertArrayEquals(expectedArray, new Task01_10(2,8,1).GetArray());
    }
}
