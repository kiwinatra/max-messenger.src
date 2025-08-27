package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: kcc  reason: default package */
public final class kcc implements iha {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kcc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((tk3) this.b).accept(obj);
                return;
            case 1:
                ((lyc) this.b).b.s((Boolean) obj);
                return;
            default:
                gc0 gc0 = (gc0) obj;
                if (gc0 != null) {
                    r3g r3g = (r3g) this.b;
                    if (r3g.u != 3) {
                        Objects.toString(r3g.q);
                        gc0.toString();
                        gc0 gc02 = r3g.q;
                        r3g.q = gc0;
                        hc0 hc0 = r3g.g;
                        hc0.getClass();
                        int i = gc02.a;
                        Set set = gc0.e;
                        boolean contains = set.contains(Integer.valueOf(i));
                        int i2 = gc0.a;
                        if ((contains || set.contains(Integer.valueOf(i2)) || i == i2) && (!r3g.y || gc02.c == null || gc0.c != null)) {
                            int i3 = gc02.a;
                            if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                                r3g.F(r3g.r, gc0, hc0);
                                ArrayList arrayList = new ArrayList(1);
                                Object obj2 = new Object[]{r3g.r.c()}[0];
                                Objects.requireNonNull(obj2);
                                arrayList.add(obj2);
                                r3g.C(Collections.unmodifiableList(arrayList));
                                r3g.o();
                                return;
                            } else if (gc02.b != gc0.b) {
                                r3g.F(r3g.r, gc0, hc0);
                                ArrayList arrayList2 = new ArrayList(1);
                                Object obj3 = new Object[]{r3g.r.c()}[0];
                                Objects.requireNonNull(obj3);
                                arrayList2.add(obj3);
                                r3g.C(Collections.unmodifiableList(arrayList2));
                                Iterator it = r3g.a.iterator();
                                while (it.hasNext()) {
                                    ((uzf) it.next()).h(r3g);
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            r3g.L();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                bs6 bs6 = ((lyc) this.b).b;
                bs6.getClass();
                bs6.s(new fc0(th));
                return;
            default:
                return;
        }
    }
}
