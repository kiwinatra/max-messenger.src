package defpackage;

import java.util.Iterator;

/* renamed from: b62  reason: default package */
public final /* synthetic */ class b62 implements u2f, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r62 b;

    public /* synthetic */ b62(r62 r62, int i) {
        this.a = i;
        this.b = r62;
    }

    public void accept(Object obj) {
        ((m95) this.b.o.get()).a((Throwable) obj);
    }

    public Object get() {
        Long l;
        switch (this.a) {
            case 0:
                r62 r62 = this.b;
                a32 a32 = r62.a;
                if (a32 != null) {
                    return a32;
                }
                ltb ltb = (ltb) r62.n;
                if (ltb.a.s() != -1) {
                    n72 T = r62.T(ltb.a.s());
                    r62.d.put(Long.valueOf(T.b), T);
                    a32 h = r62.h(T, (ha9) null);
                    r62.a = h;
                    return h;
                }
                throw new IllegalStateException("no user id");
            case 2:
                return this.b.a;
            default:
                try {
                    Iterator it = this.b.I(r62.I).iterator();
                    if (!it.hasNext()) {
                        l = null;
                    } else {
                        Long valueOf = Long.valueOf(((a32) it.next()).b.k);
                        while (it.hasNext()) {
                            Long valueOf2 = Long.valueOf(((a32) it.next()).b.k);
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                        l = valueOf;
                    }
                    return Long.valueOf(l != null ? l.longValue() : 0);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
        }
    }
}
