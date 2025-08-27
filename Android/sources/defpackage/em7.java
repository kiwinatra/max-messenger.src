package defpackage;

import java.util.Iterator;

/* renamed from: em7  reason: default package */
public final class em7 extends s1 {
    public final /* synthetic */ int o = 0;
    public final Iterator v;
    public final /* synthetic */ Object w;

    public em7(Iterator it, msb msb) {
        this.v = it;
        this.w = msb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (((defpackage.msb) r2.w).apply(r0) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r2.b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.hasNext() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (((defpackage.xxd) r2.w).b.contains(r0) == false) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r2.b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r0 = r2.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r0.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = r0.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r2 = this;
            int r0 = r2.o
            switch(r0) {
                case 0: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.Iterator r0 = r2.v
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r2.w
            xxd r1 = (defpackage.xxd) r1
            java.util.Set r1 = r1.b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0005
            goto L_0x0022
        L_0x001e:
            r0 = 3
            r2.b = r0
            r0 = 0
        L_0x0022:
            return r0
        L_0x0023:
            java.util.Iterator r0 = r2.v
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r2.w
            msb r1 = (defpackage.msb) r1
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L_0x0023
            goto L_0x003e
        L_0x003a:
            r0 = 3
            r2.b = r0
            r0 = 0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em7.a():java.lang.Object");
    }

    public em7(xxd xxd) {
        this.w = xxd;
        this.v = xxd.a.iterator();
    }
}
