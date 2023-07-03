import org.example.UserRegistration;
import org.junit.*;



import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {


        UserRegistration registration=new UserRegistration();


        @Test
        public void testFirstName() {

           String firstName = registration.checkFirstName();
           Assert.assertTrue(Pattern.matches("^[A-Z]{1}[a-z]{3,}", firstName));


        }
        @Test
        public void testLastName() {
            String lastName  = registration.checkLastName();
            Assert.assertTrue(Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName));


        }
        @Test
        public void testcheckEmail() {
            String email = registration.checkEmail();
            Assert.assertTrue(Pattern.matches("[a-zA-Z0-9.]{1,}[@]{1}[a-zA-Z]{1,}[.][c]{1}[o]{1}[m]{1}", email));
        }
        @Test
        public void testPhoneNumber() {
            String PhoneNumber = registration.checkPhoneNumber();
            Assert.assertTrue( Pattern.matches("[9][1][ ]{1}[0-9]{10}", PhoneNumber));

        }
        @Test
        public void checkPasswordRule1() {
            String password  = registration. checkPasswordRule1();
            Assert.assertTrue(Pattern.matches("^[a-zA-z]{8,}", password));
        }
        @Test
        public void checkPasswordRule2() {
            String password1= registration. checkPasswordRule2();
            Assert.assertTrue(Pattern.matches("^[A-z]+[A-Za-z]{8,}", password1));

        }
         @Test
        public void checkPasswordRule3() {
            String Password2 =registration. checkPasswordRule3();
            Assert.assertTrue(Pattern.matches("^[A-Z]+[A-Za-z0-9]{8,}", Password2));
        }
          @Test
            public void checkPasswordRule4() {
                 String Password4  = registration. checkPasswordRule4();
                 Assert.assertTrue(Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+", Password4));
         }
        @Test
        public void checkEmail2() {
            String Email2  = registration. checkEmail2();
            Assert.assertTrue(Pattern.matches("^[a-zA-Z]{3,}[+-.]?[A-za-z0-9]*[@]{1}[a-z]+[.]?[a-z]*[.]?[a-z]", Email2));
        }

    }





