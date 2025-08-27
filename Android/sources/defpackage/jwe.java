package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: jwe  reason: default package */
public final class jwe extends vyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jwe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ay2.a((ay2) this.b);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<jwe> cls = jwe.class;
                String name = cls.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, name, i2a.i("onItemRangeInserted start. isComputingLayout:", recyclerView.b0()), (Throwable) null);
                }
                ay2.a((ay2) this.b);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, name2, i2a.i("onItemRangeInserted end. isComputingLayout:", recyclerView2.b0()), (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                ay2.a((ay2) this.b);
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                ay2.a((ay2) this.b);
                return;
            default:
                if (i2 != 0 && ((NeuroAvatarsScreen) this.b).G0.L(i) != null) {
                    x8a h0 = ((NeuroAvatarsScreen) this.b).h0();
                    q7a q7a = h0.v;
                    if (q7a != null) {
                        int i4 = q7a.c;
                        q7a q7a2 = h0.v;
                        if (q7a2 != null) {
                            long j = q7a2.a;
                            Iterator it = ((Map) h0.x0.getValue()).keySet().iterator();
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i3 = -1;
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (i6 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    if (((Number) next).intValue() != i4) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            Iterator it2 = ((List) h0.w.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((q7a) it2.next()).a == j) {
                                        i3 = i5;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            Integer valueOf = Integer.valueOf(i3);
                            h0.x = i6;
                            h0.Z.d(new r7a(i6, valueOf));
                        }
                    }
                    ((tyc) this.c).D(this);
                    return;
                }
                return;
        }
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                ay2.a((ay2) this.b);
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ay2.a((ay2) this.b);
                return;
            default:
                return;
        }
    }
}
