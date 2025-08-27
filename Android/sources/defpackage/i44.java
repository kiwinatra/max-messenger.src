package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* renamed from: i44  reason: default package */
public abstract class i44 {
    public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    public static KeyGenParameterSpec.Builder b(String str, int i) {
        return new KeyGenParameterSpec.Builder(str, i);
    }

    public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }

    public static void d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes(new String[]{"CBC"});
    }

    public static void e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
    }
}
