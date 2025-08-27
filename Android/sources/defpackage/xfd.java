package defpackage;

import java.util.Objects;

/* renamed from: xfd  reason: default package */
public abstract class xfd {
    public static final wce a;
    public static final pd3 b;
    public static final ml7 c;
    public static final vqf d = vqf.c;

    static {
        try {
            wce wce = wfd.a;
            Objects.requireNonNull(wce, "Scheduler Supplier result can't be null");
            a = wce;
            try {
                pd3 pd3 = tfd.a;
                Objects.requireNonNull(pd3, "Scheduler Supplier result can't be null");
                b = pd3;
                try {
                    ml7 ml7 = ufd.a;
                    Objects.requireNonNull(ml7, "Scheduler Supplier result can't be null");
                    c = ml7;
                    try {
                        Objects.requireNonNull(vfd.a, "Scheduler Supplier result can't be null");
                    } catch (Throwable th) {
                        throw p95.f(th);
                    }
                } finally {
                    RuntimeException f = p95.f(th);
                }
            } finally {
                RuntimeException f2 = p95.f(th);
            }
        } finally {
            RuntimeException f3 = p95.f(th);
        }
    }

    public static lfd a() {
        pd3 pd3 = b;
        zi6 zi6 = n54.w;
        if (zi6 == null) {
            return pd3;
        }
        try {
            return (lfd) zi6.apply(pd3);
        } catch (Throwable th) {
            throw p95.f(th);
        }
    }

    public static lfd b() {
        ml7 ml7 = c;
        zi6 zi6 = n54.y;
        if (zi6 == null) {
            return ml7;
        }
        try {
            return (lfd) zi6.apply(ml7);
        } catch (Throwable th) {
            throw p95.f(th);
        }
    }
}
