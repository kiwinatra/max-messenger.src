package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: ii  reason: default package */
public abstract class ii {
    public static final ejd a = fi.a;
    public static final boolean b;
    public static final fk c = new fk();
    public static final Lazy d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(4));

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = kotlin.text.StringsKt.toBooleanStrictOrNull(r0);
     */
    static {
        /*
            ejd r0 = defpackage.fi.a
            a = r0
            java.lang.String r0 = "animoji.debug"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            if (r0 == 0) goto L_0x0019
            java.lang.Boolean r0 = kotlin.text.StringsKt.toBooleanStrictOrNull(r0)
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.booleanValue()
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            b = r0
            fk r0 = new fk
            r0.<init>()
            c = r0
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            m r1 = new m
            r2 = 4
            r1.<init>(r2)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r0, r1)
            d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii.<clinit>():void");
    }
}
