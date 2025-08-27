package defpackage;

import java.util.Objects;

/* renamed from: sh8  reason: default package */
public final class sh8 extends nh8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sh8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void g(pi8 pi8) {
        switch (this.a) {
            case 0:
                rh8 rh8 = new rh8(0, pi8);
                pi8.c(rh8);
                try {
                    ((ri8) this.b).e(rh8);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    rh8.onError(th);
                    return;
                }
            case 1:
                try {
                    Object obj = ((t2f) this.b).get();
                    Objects.requireNonNull(obj, "The maybeSupplier returned a null MaybeSource");
                    ((ti8) obj).a(pi8);
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    pi8.c(p45.a);
                    pi8.onError(th2);
                    return;
                }
            case 2:
                pi8.c(p45.a);
                pi8.onError((Throwable) this.b);
                return;
            default:
                ((lbe) this.b).l(new ci8(pi8, 0));
                return;
        }
    }
}
