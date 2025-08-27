package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: p78  reason: default package */
public final class p78 {
    public static final ThreadLocal i = new ThreadLocal();
    public final w78 a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final Throwable f;
    public final Lazy g;
    public final Lazy h;

    public p78(w78 w78, String str, String str2, String str3, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = w78;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = currentTimeMillis;
        this.f = th;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.g = LazyKt.lazy(lazyThreadSafetyMode, new l78(this, 0));
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new l78(this, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.p78) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.p78
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p78 r8 = (defpackage.p78) r8
            w78 r1 = r8.a
            w78 r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.Throwable r7 = r7.f
            java.lang.Throwable r8 = r8.f
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 != 0) goto L_0x0048
            return r2
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p78.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int i3 = wzf.i(g63.d((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        Throwable th = this.f;
        if (th != null) {
            i2 = th.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "LogEntry(level=" + this.a + ", tag=" + this.b + ", message=" + this.c + ", threadName=" + this.d + ", time=" + this.e + ", throwable=" + this.f + ")";
    }
}
