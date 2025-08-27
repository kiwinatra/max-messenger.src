package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: d1h  reason: default package */
public final class d1h extends g1h {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(long j, Object obj) {
        Object obj2;
        List list = (List) k3h.i(j, obj);
        if (list instanceof c1h) {
            obj2 = ((c1h) list).a();
        } else {
            if (!c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof g2h) || !(list instanceof x0h)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    bzg bzg = (bzg) ((x0h) list);
                    boolean z = bzg.a;
                    if (z && z) {
                        bzg.a = false;
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        k3h.p(j, obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: b1h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: b1h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: b1h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r4, java.lang.Object r6, java.lang.Object r7) {
        /*
            r3 = this;
            java.lang.Object r3 = defpackage.k3h.i(r4, r7)
            java.util.List r3 = (java.util.List) r3
            int r7 = r3.size()
            java.lang.Object r0 = defpackage.k3h.i(r4, r6)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0039
            boolean r1 = r0 instanceof defpackage.c1h
            if (r1 == 0) goto L_0x0020
            b1h r0 = new b1h
            r0.<init>((int) r7)
            goto L_0x0035
        L_0x0020:
            boolean r1 = r0 instanceof defpackage.g2h
            if (r1 == 0) goto L_0x0030
            boolean r1 = r0 instanceof defpackage.x0h
            if (r1 == 0) goto L_0x0030
            x0h r0 = (defpackage.x0h) r0
            x0h r7 = r0.c(r7)
            r0 = r7
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L_0x0035:
            defpackage.k3h.p(r4, r6, r0)
            goto L_0x0092
        L_0x0039:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = c
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0057
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r7
            r1.<init>(r2)
            r1.addAll(r0)
            defpackage.k3h.p(r4, r6, r1)
        L_0x0055:
            r0 = r1
            goto L_0x0092
        L_0x0057:
            boolean r1 = r0 instanceof defpackage.f3h
            if (r1 == 0) goto L_0x0074
            b1h r1 = new b1h
            int r2 = r0.size()
            int r2 = r2 + r7
            r1.<init>((int) r2)
            f3h r0 = (defpackage.f3h) r0
            java.util.List r7 = r1.b
            int r7 = r7.size()
            r1.addAll(r7, r0)
            defpackage.k3h.p(r4, r6, r1)
            goto L_0x0055
        L_0x0074:
            boolean r1 = r0 instanceof defpackage.g2h
            if (r1 == 0) goto L_0x0092
            boolean r1 = r0 instanceof defpackage.x0h
            if (r1 == 0) goto L_0x0092
            r1 = r0
            x0h r1 = (defpackage.x0h) r1
            r2 = r1
            bzg r2 = (defpackage.bzg) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L_0x0092
            int r0 = r0.size()
            int r0 = r0 + r7
            x0h r0 = r1.c(r0)
            defpackage.k3h.p(r4, r6, r0)
        L_0x0092:
            int r7 = r0.size()
            int r1 = r3.size()
            if (r7 <= 0) goto L_0x00a1
            if (r1 <= 0) goto L_0x00a1
            r0.addAll(r3)
        L_0x00a1:
            if (r7 > 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r3 = r0
        L_0x00a5:
            defpackage.k3h.p(r4, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1h.b(long, java.lang.Object, java.lang.Object):void");
    }
}
