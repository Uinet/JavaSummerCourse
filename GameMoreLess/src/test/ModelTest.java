package test;

import main.controller.GlobalConstant;
import main.model.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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

    @Test
    public void testSecretNumberNotEqualUpperLimit(){
        for(int i = 0; i < 10000; i++){
            Assert.assertNotEquals(GlobalConstant.DEFAULT_UPPER_LIMIT,
                    model.generateSecretNumber());
        }
    }

    @Test
    public void testSecretNumberNotEqualLowerLimit(){
        for(int i = 0; i < 10000; i++){
            Assert.assertNotEquals(GlobalConstant.DEFAULT_LOWER_LIMIT,
                    model.generateSecretNumber());
        }
    }

    @Test
    public void secretNumberBetweenLimits(){
        for (int i = 0; i < 10000; i++){
            int secretNumber = model.generateSecretNumber();
            Assert.assertTrue(model.getLowerLimit() < secretNumber
                    && model.getUpperLimit() > secretNumber);
        }
    }

}
