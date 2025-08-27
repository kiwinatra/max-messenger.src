package defpackage;

import android.view.View;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* renamed from: oa3  reason: default package */
public final class oa3 extends jha {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ oa3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void w(cla cla) {
        lbe lbe;
        switch (this.a) {
            case 0:
                ao1 ao1 = new ao1(2, cla, (ija) ((oka) this.c));
                cla.c(ao1);
                ((ma3) this.b).j(ao1);
                return;
            case 1:
                yh8 yh8 = new yh8(cla, (zi6) this.c, 0);
                cla.c(yh8);
                ((ti8) this.b).a(yh8);
                return;
            case 2:
                oka oka = (oka) this.c;
                boolean z = oka instanceof t2f;
                zi6 zi6 = (zi6) this.b;
                if (z) {
                    try {
                        Object obj = ((t2f) oka).get();
                        if (obj != null) {
                            Object apply = zi6.apply(obj);
                            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                            lbe = (lbe) apply;
                        } else {
                            lbe = null;
                        }
                        if (lbe == null) {
                            p45.a(cla);
                            return;
                        } else {
                            lbe.l(new wi8(cla, 1));
                            return;
                        }
                    } catch (Throwable th) {
                        hd8.Z(th);
                        p45.b(th, cla);
                        return;
                    }
                } else {
                    oka.a(new xha(cla, zi6));
                    return;
                }
            case 3:
                try {
                    Object apply2 = ((zi6) this.c).apply(this.b);
                    Objects.requireNonNull(apply2, "The mapper returned a null ObservableSource");
                    oka oka2 = (oka) apply2;
                    if (oka2 instanceof t2f) {
                        try {
                            Object obj2 = ((t2f) oka2).get();
                            if (obj2 == null) {
                                p45.a(cla);
                                return;
                            }
                            jka jka = new jka(cla, obj2);
                            cla.c(jka);
                            jka.run();
                            return;
                        } catch (Throwable th2) {
                            hd8.Z(th2);
                            p45.b(th2, cla);
                            return;
                        }
                    } else {
                        oka2.a(cla);
                        return;
                    }
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    p45.b(th3, cla);
                    return;
                }
            case 4:
                yh8 yh82 = new yh8(cla, (zi6) this.c, 1);
                cla.c(yh82);
                ((lbe) this.b).l(yh82);
                return;
            default:
                if (iq.v(cla)) {
                    View view = (View) this.b;
                    lcg lcg = new lcg(view, (Function1) this.c, cla);
                    cla.c(lcg);
                    view.setOnTouchListener(lcg);
                    return;
                }
                return;
        }
    }

    public oa3(oka oka, zi6 zi6) {
        this.a = 2;
        this.c = oka;
        this.b = zi6;
    }
}
