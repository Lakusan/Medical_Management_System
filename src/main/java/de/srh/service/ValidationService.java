package de.srh.service;

import de.srh.exceptions.NoMatchException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {
    /**
     * Password validation to given criteria with regex
     * @author Andreas Lakus
     * @param password
     * @return
     */
    public boolean validatePassword(String password){

        // 8-20 chars, one digit, one upper case letter, one lower case letter, one special char !@#$%&*()-+=^, no white space
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        return isValidString(password,regex);
    }

    /**
     * RegEx Matcher
     * @author Andreas Lakus
     * @param text
     * @param regex
     * @return
     */
    public boolean isValidString(String text,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    // TODO: remove ?
    /**
     *
     * @author Andreas Lakus
     * @param frontendPassword
     * @param backendPassword
     * @throws NoMatchException
     */
    public void passwordMatcher(String frontendPassword, String backendPassword) throws NoMatchException {
            if (frontendPassword.equals(backendPassword)) {
            } else {
                throw new NoMatchException("Not Matched!\n");
            }
    }

    /**
     * Checks if given username is valid on given criteria
     * @author Andreas Lakus
     * @param username
     * @return
     */
    public boolean checkUsername(String username){
        // 6-8 long, no trailing _ or .
        // _ . inside ok
        // Allowed Chars a-zA-Z0-9._
        // no . or _ at the end of username
        String regex ="^(?=.{6,15}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
        return isValidString(username, regex);
    }
}
