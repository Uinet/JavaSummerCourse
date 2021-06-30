package ua.training.test.task2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.training.main.task2.GlobalConstant;
import ua.training.main.task2.Model;

public class ModelTest {
    private static Model model;

    @BeforeClass
    public static void runT(){
        model = new Model();
        model.setUpperLimit(GlobalConstant.DEFAULT_UPPER_LIMIT);
        model.setLowerLimit(GlobalConstant.DEFAULT_LOWER_LIMIT);
    }

    @Test
    public void testCheckNumber(){
        boolean res = model.checkNumber(model.generateSecretNumber());
        Assert.assertTrue(res);
    }

}
