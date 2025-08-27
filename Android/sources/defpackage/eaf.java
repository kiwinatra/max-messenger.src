package defpackage;

import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;

/* renamed from: eaf  reason: default package */
public final class eaf {
    public static volatile eaf b;
    public static final CountDownLatch c = new CountDownLatch(1);
    public final Lazy a;

    public eaf(Lazy lazy) {
        this.a = lazy;
    }

    public static eaf a() {
        if (c.getCount() == 0) {
            return b;
        }
        throw new IllegalStateException("TamContextAndroid should call `init` before `getInstance`");
    }

    public static z9f b() {
        try {
            c.await();
        } catch (InterruptedException e) {
            z68.g("TamContextAndroid", "TamContext initialization was interrupted: %s", e.getMessage());
        }
        return (z9f) a().a.getValue();
    }
}
