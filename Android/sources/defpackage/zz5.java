package defpackage;

/* renamed from: zz5  reason: default package */
public final class zz5 {
    public final boolean a;
    public final e15 b;
    public final int c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ zz5(e15 e15, boolean z) {
        this(false, e15, 16, z, (CharSequence) null, false, false);
    }

    public static zz5 a(zz5 zz5, boolean z, e15 e15, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = zz5.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            e15 = zz5.b;
        }
        e15 e152 = e15;
        int i2 = zz5.c;
        if ((i & 8) != 0) {
            z2 = zz5.d;
        }
        boolean z4 = z2;
        CharSequence charSequence = zz5.e;
        boolean z5 = (i & 32) != 0 ? zz5.f : false;
        boolean z6 = zz5.g;
        zz5.getClass();
        return new zz5(z3, e152, i2, z4, charSequence, z5, z6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.zz5) r5;
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
            boolean r1 = r5 instanceof defpackage.zz5
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            zz5 r5 = (defpackage.zz5) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            e15 r1 = r4.b
            e15 r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x002c
            return r2
        L_0x002c:
            java.lang.CharSequence r1 = r4.e
            java.lang.CharSequence r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x003e
            return r2
        L_0x003e:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x0045
            return r2
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i = 0;
        e15 e15 = this.b;
        int e2 = g63.e(rae.h(this.c, (hashCode + (e15 == null ? 0 : e15.hashCode())) * 31, 31), 31, this.d);
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Boolean.hashCode(this.g) + g63.e((e2 + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(isEmojiPickerShown=");
        sb.append(this.a);
        sb.append(", emoji=");
        sb.append(this.b);
        sb.append(", maxSymbolsName=");
        sb.append(this.c);
        sb.append(", isInputValid=");
        sb.append(this.d);
        sb.append(", initialInput=");
        sb.append(this.e);
        sb.append(", isInitialState=");
        sb.append(this.f);
        sb.append(", isEditMode=");
        return tr1.m(sb, this.g, ")");
    }

    public zz5(boolean z, e15 e15, int i, boolean z2, CharSequence charSequence, boolean z3, boolean z4) {
        this.a = z;
        this.b = e15;
        this.c = i;
        this.d = z2;
        this.e = charSequence;
        this.f = z3;
        this.g = z4;
    }
}
