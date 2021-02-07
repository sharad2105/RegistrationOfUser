package com.userregistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserValidationTest {
    @Test
    public void givenFirstNameReturnIsTrue() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validateFirstName("Sharad");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("this is a Happy Messapge");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenFirstNameReturnIsFalse() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validateFirstName("Sh@rad");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenLastNameIsTrue() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validateLastname("Patil");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenLastNameIsFalse()throws RegistrationOfUserException {
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validateLastname("P@til");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public  void  givenEmailIsValide() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPY");
        boolean result = validationofUser.validateEmail("shard123@yaho.com");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenEmailIsInvalide() throws RegistrationOfUserException{
        RegistrationOfUser validatuionofUser = new RegistrationOfUser("SAD");
        boolean result = validatuionofUser.validateEmail("Sharad432");
        Assertions.assertTrue(result);
        String mood = validatuionofUser.analyseMood("Tis is Sad");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPhoneNumberIsValide() throws  RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validatePhoneNumber("91 9096549959");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPhoneNumberIsInvalide() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validatePhoneNumber("90965499");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPasswordIsValide() throws  RegistrationOfUserException{
        RegistrationOfUser validationofUser =new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validatePasswordCheckOne("sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }

    @Test
    public void givenPasswordIsInValide() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validatePasswordCheckOne("shara");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }
    @Test
    public void givenPasswordIsValideTwo() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validatePasswordCheckTwo("Sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is HAppy");
        Assertions.assertEquals("HAPPY", moood);
    }
    @Test
    public void givenPasswordIsInValideTwo() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validatePasswordCheckOne("sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }

    @Test
    public void givenPasswordIsValideThree() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validatePasswordCheckThree("Sharad12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }
    @Test
    public void givenPasswordIsInValideThree() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validatePasswordCheckThree("sharad");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }
    @Test
    public void givenPasswordIsValideFour() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("HAPPY");
        boolean result = validationofUser.validatePasswordCheckFour("Sharad@12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }

    @Test
    public void givenPasswordIsInValideFour() throws RegistrationOfUserException{
        RegistrationOfUser validationofUser = new RegistrationOfUser("SAD");
        boolean result = validationofUser.validatePasswordCheckFour("sharad12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }

}
