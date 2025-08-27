package defpackage;

import java.util.Objects;
import kotlin.uuid.Uuid;

/* renamed from: wv5  reason: default package */
public abstract class wv5 implements eac {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", Uuid.SIZE_BITS).intValue());

    public static wv5 a(Object... objArr) {
        if (objArr.length == 0) {
            return fw5.b;
        }
        if (objArr.length != 1) {
            return new gw5(1, objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "item is null");
        return new sw5(obj);
    }

    public final void c(gx5 gx5) {
        Objects.requireNonNull(gx5, "subscriber is null");
        try {
            g(gx5);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void f(pye pye) {
        if (pye instanceof gx5) {
            c((gx5) pye);
            return;
        }
        Objects.requireNonNull(pye, "subscriber is null");
        c(new txe(pye));
    }

    public abstract void g(pye pye);
}
