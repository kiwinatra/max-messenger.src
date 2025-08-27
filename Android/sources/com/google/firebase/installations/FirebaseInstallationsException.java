package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        vzg.j(str, "Detail message must not be empty");
    }
}
