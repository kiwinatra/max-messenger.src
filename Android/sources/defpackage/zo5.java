package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: zo5  reason: default package */
public abstract class zo5 {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
    }

    public static FingerprintManager.CryptoObject b(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean e(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static ap5 f(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new ap5(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new ap5(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new ap5(cryptoObject.getMac());
        }
        return null;
    }

    public static FingerprintManager.CryptoObject g(ap5 ap5) {
        if (ap5 == null) {
            return null;
        }
        Cipher cipher = ap5.b;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        Signature signature = ap5.a;
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        Mac mac = ap5.c;
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
