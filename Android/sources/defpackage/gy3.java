package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.jvm.functions.Function0;

/* renamed from: gy3  reason: default package */
public final class gy3 implements Function0 {
    public static final gy3 X = new gy3(8);
    public static final gy3 Y = new gy3(9);
    public static final gy3 Z = new gy3(10);
    public static final gy3 b = new gy3(0);
    public static final gy3 c = new gy3(1);
    public static final gy3 o = new gy3(2);
    public static final gy3 v = new gy3(3);
    public static final gy3 v0 = new gy3(11);
    public static final gy3 w = new gy3(4);
    public static final gy3 w0 = new gy3(12);
    public static final gy3 x = new gy3(5);
    public static final gy3 y = new gy3(6);
    public static final gy3 z = new gy3(7);
    public final /* synthetic */ int a;

    public /* synthetic */ gy3(int i) {
        this.a = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return zx3.class;
            case 1:
                return zx3.class;
            case 2:
                return zx3.class;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return sjd.a;
            case 7:
                return qra.a;
            case 8:
                return qra.a.z();
            case 9:
                return l2b.a;
            case 10:
                return new qi6(new ConcurrentHashMap(64));
            case 11:
                return new qi6(new ConcurrentHashMap(64));
            default:
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                return instance;
        }
    }
}
