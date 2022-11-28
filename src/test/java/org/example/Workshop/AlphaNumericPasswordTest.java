package org.example.Workshop;

import org.junit.Assert;
import org.junit.Test;

public class AlphaNumericPasswordTest {

    @Test
    public void givenPassword_WhenValid_ThenTrue() {
        boolean result = AlphaNumericPassword.validationCheck("viv@ek7");
        Assert.assertTrue(result);
        System.out.println(true);
    }

    @Test
    public void givenPassword_WhenInvalid_ThenFalse() {
        boolean result= AlphaNumericPassword.validationCheck("vivek097546du");
        Assert.assertFalse(result);
        System.out.println(false);
    }
}