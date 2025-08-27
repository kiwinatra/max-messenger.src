package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: gqa  reason: default package */
public final class gqa {
    public final int a;
    public final dqa b;
    public final cqa c;
    public final CharSequence d;
    public final Drawable e;
    public final Integer f;
    public final Integer g;
    public final boolean h;

    public gqa(int i, dqa dqa, cqa cqa, CharSequence charSequence, Drawable drawable, Integer num, Integer num2, boolean z) {
        this.a = i;
        this.b = dqa;
        this.c = cqa;
        this.d = charSequence;
        this.e = drawable;
        this.f = num;
        this.g = num2;
        this.h = z;
    }

    public static gqa a(gqa gqa, boolean z) {
        return new gqa(gqa.a, gqa.b, gqa.c, gqa.d, gqa.e, gqa.f, gqa.g, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.gqa) r5;
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
            boolean r1 = r5 instanceof defpackage.gqa
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            gqa r5 = (defpackage.gqa) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            dqa r1 = r4.b
            dqa r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            cqa r1 = r4.c
            cqa r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.CharSequence r1 = r4.d
            java.lang.CharSequence r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            android.graphics.drawable.Drawable r1 = r4.e
            android.graphics.drawable.Drawable r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.Integer r1 = r4.f
            java.lang.Integer r3 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0042
            return r2
        L_0x0042:
            java.lang.Integer r1 = r4.g
            java.lang.Integer r3 = r5.g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004d
            return r2
        L_0x004d:
            boolean r4 = r4.h
            boolean r5 = r5.h
            if (r4 == r5) goto L_0x0054
            return r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        int i = 0;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return Boolean.hashCode(this.h) + ((hashCode4 + i) * 31);
    }

    public final String toString() {
        return "ButtonToolData(id=" + this.a + ", mode=" + this.b + ", appearance=" + this.c + ", text=" + this.d + ", icon=" + this.e + ", textRes=" + this.f + ", iconRes=" + this.g + ", isEnabled=" + this.h + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqa(int i, cqa cqa, Integer num, Integer num2, int i2) {
        this(i, dqa.b, (i2 & 4) != 0 ? cqa.a : cqa, (CharSequence) null, (Drawable) null, num, num2, true);
    }
}
