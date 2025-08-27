package defpackage;

/* renamed from: h02  reason: default package */
public final class h02 implements i02 {
    public final int a;
    public final String b;
    public final ngf c;
    public final Integer d;
    public final boolean e;

    public h02(int i, String str, ngf ngf, Integer num, boolean z) {
        this.a = i;
        this.b = str;
        this.c = ngf;
        this.d = num;
        this.e = z;
    }

    public static h02 a(h02 h02, String str, ngf ngf, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            str = h02.b;
        }
        return new h02(h02.a, str, ngf, num, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.h02) r5;
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
            boolean r1 = r5 instanceof defpackage.h02
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h02 r5 = (defpackage.h02) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            ngf r1 = r4.c
            ngf r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.Integer r1 = r4.d
            java.lang.Integer r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h02.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ngf ngf = this.c;
        int hashCode3 = (hashCode2 + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.e) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(title=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", hint=");
        sb.append(this.c);
        sb.append(", hintColor=");
        sb.append(this.d);
        sb.append(", hasError=");
        return tr1.m(sb, this.e, ")");
    }
}
