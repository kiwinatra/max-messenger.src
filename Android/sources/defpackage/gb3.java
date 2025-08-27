package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: gb3  reason: default package */
public final class gb3 extends jha {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void w(cla cla) {
        switch (this.a) {
            case 0:
                ((ma3) this.b).j(new cja(cla));
                return;
            case 1:
                ((gh3) this.b).G(cla);
                return;
            case 2:
                ((ti8) this.b).a(new wi8(cla, 0));
                return;
            case 3:
                yha yha = new yha(cla);
                cla.c(yha);
                try {
                    ((mja) this.b).c(yha);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    yha.onError(th);
                    return;
                }
            case 4:
                Object[] objArr = (Object[]) this.b;
                bja bja = new bja(cla, objArr);
                cla.c(bja);
                if (!bja.o) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length && !bja.v) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            bja.a.onError(new NullPointerException(a81.j(i, "The element at index ", " is null")));
                            return;
                        } else {
                            bja.a.d(obj);
                            i++;
                        }
                    }
                    if (!bja.v) {
                        bja.a.b();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                try {
                    Iterator it = ((Iterable) this.b).iterator();
                    try {
                        if (!it.hasNext()) {
                            p45.a(cla);
                            return;
                        }
                        dja dja = new dja(cla, it);
                        cla.c(dja);
                        if (!dja.o) {
                            while (!dja.c) {
                                try {
                                    Object next = dja.b.next();
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    dja.a.d(next);
                                    if (!dja.c) {
                                        try {
                                            if (!dja.b.hasNext()) {
                                                if (!dja.c) {
                                                    dja.a.b();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            hd8.Z(th2);
                                            dja.a.onError(th2);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    hd8.Z(th3);
                                    dja.a.onError(th3);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        hd8.Z(th4);
                        p45.b(th4, cla);
                        return;
                    }
                } catch (Throwable th5) {
                    hd8.Z(th5);
                    p45.b(th5, cla);
                    return;
                }
            case 6:
                ((wv5) ((eac) this.b)).f(new eja(cla));
                return;
            case 7:
                ((oka) this.b).a(cla);
                return;
            case 8:
                ((lbe) this.b).l(new wi8(cla, 1));
                return;
            case 9:
                if (iq.v(cla)) {
                    Toolbar toolbar = (Toolbar) this.b;
                    hmd hmd = new hmd(toolbar, cla, 1);
                    cla.c(hmd);
                    toolbar.setOnMenuItemClickListener(hmd);
                    return;
                }
                return;
            default:
                if (iq.v(cla)) {
                    View view = (View) this.b;
                    p9g p9g = new p9g(view, cla);
                    cla.c(p9g);
                    view.setOnClickListener(p9g);
                    return;
                }
                return;
        }
    }
}
