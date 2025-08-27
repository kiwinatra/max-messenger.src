package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* renamed from: j44  reason: default package */
public abstract class j44 {
    public static BiometricPrompt.CryptoObject a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
