package com.userregistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserValidationTest {
    @Test
    public void givenFirstNameReturnIsTrue(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validateFirstName("Sharad");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("this is a Happy Messapge");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenFirstNameReturnIsFalse(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validateFirstName("Sh@rad");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenLastNameIsTrue(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validateLastname("Patil");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenLastNameIsFalse() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validateLastname("P@til");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public  void  givenEmailIsValide(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validateEmail("shard123@yaho.com");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenEmailIsInvalide(){
        RegistrationOfUser validatuionofUser = new RegistrationOfUser();
        boolean result = validatuionofUser.validateEmail("Sharad432");
        Assertions.assertTrue(result);
        String mood = validatuionofUser.analyseMood("Tis is Sad");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPhoneNumberIsValide(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePhoneNumber("91 9096549959");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPhoneNumberIsInvalide(){
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePhoneNumber("90965499");
        Assertions.assertTrue(result);
        String mood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPasswordIsValide(){
        RegistrationOfUser validationofUser =new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckOne("sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }

    @Test
    public void givenPasswordIsInValide() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckOne("shara");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }
    @Test
    public void givenPasswordIsValideTwo() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckTwo("Sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is HAppy");
        Assertions.assertEquals("HAPPY", moood);
    }
    @Test
    public void givenPasswordIsInValideTwo() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckOne("sharadpa");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }

    @Test
    public void givenPasswordIsValideThree() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckThree("Sharad12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }
    @Test
    public void givenPasswordIsInValideThree() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckThree("sharad");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }
    @Test
    public void givenPasswordIsValideFour() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckFour("Sharad@12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Happy");
        Assertions.assertEquals("HAPPY", moood);
    }

    @Test
    public void givenPasswordIsInValideFour() {
        RegistrationOfUser validationofUser = new RegistrationOfUser();
        boolean result = validationofUser.validatePasswordCheckFour("sharad12");
        Assertions.assertTrue(result);
        String moood = validationofUser.analyseMood("This is Sad");
        Assertions.assertEquals("SAD", moood);
    }

}
