package defpackage;

import android.hardware.biometrics.BiometricManager;

/* renamed from: un0  reason: default package */
public abstract class un0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
