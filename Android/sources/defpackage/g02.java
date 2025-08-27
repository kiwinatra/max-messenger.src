package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g02  reason: default package */
public final class g02 implements i02 {
    public final int a;
    public final f02 b;
    public final String c;
    public final ngf d;
    public final Integer e;
    public final boolean f;

    public g02(int i, f02 f02, String str, ngf ngf, Integer num, boolean z) {
        this.a = i;
        this.b = f02;
        this.c = str;
        this.d = ngf;
        this.e = num;
        this.f = z;
    }

    public static g02 a(g02 g02, String str, ngf ngf, Integer num, boolean z, int i) {
        if ((i & 4) != 0) {
            str = g02.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = g02.f;
        }
        return new g02(g02.a, g02.b, str2, ngf, num, z);
    }

    public final boolean b(i02 i02) {
        if (i02 == null || !(i02 instanceof g02)) {
            return false;
        }
        g02 g02 = (g02) i02;
        return this.b != g02.b || !Intrinsics.areEqual((Object) this.c, (Object) g02.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.g02) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.g02
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            g02 r5 = (defpackage.g02) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            f02 r1 = r4.b
            f02 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            ngf r1 = r4.d
            ngf r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.Integer r1 = r4.e
            java.lang.Integer r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g02.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ngf ngf = this.d;
        int hashCode3 = (hashCode2 + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", hint=");
        sb.append(this.d);
        sb.append(", hintColor=");
        sb.append(this.e);
        sb.append(", hasError=");
        return tr1.m(sb, this.f, ")");
    }

    public /* synthetic */ g02(f02 f02, String str) {
        this(ixa.a2, f02, str, (ngf) null, (Integer) null, false);
    }
}
