package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: tn0  reason: default package */
public abstract class tn0 {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
