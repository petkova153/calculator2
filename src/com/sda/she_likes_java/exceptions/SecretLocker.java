package com.sda.she_likes_java.exceptions;

public class SecretLocker {
    private Secret mySecret;

    @Override
    public String toString() {
        return "SecretLocker{" +
                "mySecret=" + mySecret +
                '}';
    }

    // HSM - hardware security module
    // send encrypted Secret to HSM
    // get decrypted value from HSM
    // celebrate secrets:)
    public Secret decryptMessageWithHSM() throws Exception {
        // connect to HSM
        boolean canConnectToHSM = false;
        if (canConnectToHSM) {
            // HSM decrypted the message for me:)
            return mySecret;
        }
        throw new Exception("Couldn't connect to HSM");
    }

    // using my own exception of class MyBrokenException
    public Secret decryptSecretAndSignalIssueWithMyBrokenExc()
//        throws MyBrokenException
    {
        return null;
    }

    public Secret decrypt() throws HSMConnectionException, DecryptionIssueException {
        // connect to HSM
        boolean canConnectToHSM = true;
        boolean decryptIssue = true;
        if (canConnectToHSM) {
            // HSM decrypted the message for me:)
            System.out.println("I'm able to connect to HSM");
            if (decryptIssue) {
                throw new DecryptionIssueException("Broken text");
            }
            return mySecret;
        }
        throw new HSMConnectionException("Couldn't connect to HSM");
    }

    public Secret tellMeSecret(){
        System.out.println("Share the secret.");
        return mySecret;
    }
    public SecretLocker(Secret mySecret) {
        this.mySecret = mySecret;
    }
}
