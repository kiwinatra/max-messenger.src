package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: drd  reason: default package */
public final class drd {
    public final zqd a;
    public final CoroutineContext b;
    public final LinkedHashMap c = new LinkedHashMap();

    public drd(zqd zqd, gl7 gl7, ce4 ce4) {
        this.a = zqd;
        this.b = gl7.a.plus(caa.a);
        zqd.getClass();
        ni niVar = new ni(26, zqd, d7d.a(0, "SELECT * FROM selected_mentions"));
        bs0.K(new ps5(bs0.F(bs0.w(bs0.F(new sbd(new m14((i6d) zqd.b, new String[]{"selected_mentions"}, niVar, (Continuation) null)), gl7.a)), ce4.a), new ard(this, (Continuation) null), 5), e14.a(ce4.a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.erd a(long r1) {
        /*
            r0 = this;
            java.util.LinkedHashMap r0 = r0.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            yqd r0 = (defpackage.yqd) r0
            if (r0 == 0) goto L_0x0012
            erd r0 = r0.b
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            erd r0 = defpackage.erd.a
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.a(long):erd");
    }
}
