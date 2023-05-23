package com.sda.she_likes_java.exceptions;

public class SecretExample {
    public static void main(String[] args) {

        SecretLocker secretToSay = new SecretLocker(null);
        System.out.println("The secret will come out!");
        Secret theSecret = secretToSay.tellMeSecret();

        SecretLocker secretStorage = new SecretLocker(
                null
        );


        try {
            System.out.println("Inside try block");
            Secret enemysSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemy's secret: " + enemysSecret);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After problematic source code");

        System.out.println();
        System.out.println("Let's play again with our own exceptions");
        try {
            Secret stupidSecret = secretStorage.decrypt();
        } catch (HSMConnectionException e) {
            System.out.println("Connection issue: " + e.getMessage());
        } catch (DecryptionIssueException e) {
            System.out.println("Cannot decrypt enemy's secret: " + e.getMessage());
        }
    }


}
