package de.srh.service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
/**
 * Implements Password secuitry
 * @author Andreas Lakus
 */
public class PasswordService {
// https://mkyong.com/java/java-password-hashing-with-argon2/

    /**
     * hashes password string with argon2
     * @author Andreas Lakus
     * @param password
     * @return
     * @author Andreas Lakus
     */
    public String hashPassword(String password){
        String hashedPassword;
        Argon2 argon2 = Argon2Factory.create();
        char[] passwordChars = password.toCharArray();
        try {
            // iterations = 10
            // memory = 64m
            // parallelism = 1
            hashedPassword = argon2.hash(22, 65536, 1, passwordChars);

        } finally {
            // Wipe confidential data
            argon2.wipeArray(passwordChars);
        }

        return hashedPassword;
    }

    /**
     * verify the password with the hashed string in databse
     * @author Andreas Lakus
     * @param hashedPassword
     * @param password
     * @return
     */
    public boolean verifyPasswordWithHash(String hashedPassword, String password){
        Argon2 argon2 = Argon2Factory.create();
        return argon2.verify(hashedPassword, password);
    }
}

