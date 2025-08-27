package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: opd  reason: default package */
public final class opd extends xag {
    public final s48 b;
    public final cpd c;
    public final s85 o = new s85(0);
    public final s85 v = new s85(0);
    public final xme w;
    public final etc x;
    public final etc y;

    public opd(s48 s48, cpd cpd) {
        this.b = s48;
        this.c = cpd;
        sbd sbd = new sbd(new npd(new kpd(((yd7) s48).Z, this, 0), (Continuation) null, this));
        xme a = f6e.a((Object) null);
        this.w = a;
        etc etc = new etc(a);
        this.x = etc;
        kpd kpd = new kpd(new i21(sbd, etc, new qrb(3, (Continuation) null, 9), 4), this, 1);
        List emptyList = CollectionsKt.emptyList();
        this.y = bs0.X(kpd, this.a, z6e.a, emptyList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[EDGE_INSN: B:27:0x0056->B:19:0x0056 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hpd
            if (r0 == 0) goto L_0x0013
            r0 = r5
            hpd r0 = (defpackage.hpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            hpd r0 = new hpd
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.c = r3
            s48 r4 = r4.b
            r4.getClass()
            yd7 r4 = (defpackage.yd7) r4
            wb r4 = r4.Z
            java.lang.Object r5 = defpackage.bs0.z(r4, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r4 = r5 instanceof java.util.Collection
            r0 = 0
            if (r4 == 0) goto L_0x0058
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0058
        L_0x0056:
            r3 = r0
            goto L_0x006c
        L_0x0058:
            java.util.Iterator r4 = r5.iterator()
        L_0x005c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r4.next()
            wk6 r5 = (defpackage.wk6) r5
            int r5 = r5.b
            if (r5 <= 0) goto L_0x005c
        L_0x006c:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opd.j(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
