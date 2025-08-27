package defpackage;

import java.util.EnumMap;
import kotlin.collections.CollectionsKt;

/* renamed from: ogf  reason: default package */
public final class ogf {
    public final boolean a;
    public final EnumMap b;
    public final EnumMap c;
    public final boolean d;
    public final long e;
    public final String f;
    public final j96 g;

    public ogf(boolean z, EnumMap enumMap, EnumMap enumMap2, boolean z2, long j, String str, j96 j96) {
        this.a = z;
        this.b = enumMap;
        this.c = enumMap2;
        this.d = z2;
        this.e = j;
        this.f = str;
        this.g = j96;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: so4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.text.TextPaint r4, android.util.DisplayMetrics r5, defpackage.uy4 r6) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f
            r1 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            j96 r2 = r3.g
            int r2 = r2.a
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2, r1)
            r4.setTypeface(r0)
            long r0 = r3.e
            float r0 = defpackage.so4.d(r0, r5)
            r4.setLetterSpacing(r0)
            java.util.EnumMap r3 = r3.b
            java.lang.Object r6 = r3.get(r6)
            so4 r6 = (defpackage.so4) r6
            if (r6 != 0) goto L_0x0032
            java.util.Collection r3 = r3.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r3 = kotlin.collections.CollectionsKt.first(r3)
            r6 = r3
            so4 r6 = (defpackage.so4) r6
        L_0x0032:
            long r0 = r6.a
            float r3 = defpackage.so4.d(r0, r5)
            r4.setTextSize(r3)
            r3 = 1
            r4.setLinearText(r3)
            r4.setSubpixelText(r3)
            r4.setAntiAlias(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogf.a(android.text.TextPaint, android.util.DisplayMetrics, uy4):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: so4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.widget.TextView r5, defpackage.uy4 r6) {
        /*
            r4 = this;
            int r0 = defpackage.mya.a
            r5.setTag(r0, r4)
            java.util.EnumMap r0 = r4.b
            java.lang.Object r1 = r0.get(r6)
            so4 r1 = (defpackage.so4) r1
            if (r1 != 0) goto L_0x001c
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            r1 = r0
            so4 r1 = (defpackage.so4) r1
        L_0x001c:
            boolean r0 = r4.a
            r5.setAllCaps(r0)
            long r0 = r1.a
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r0 = defpackage.so4.e(r0)
            r5.setTextSize(r2, r0)
            java.util.EnumMap r0 = r4.c
            java.lang.Object r6 = r0.get(r6)
            so4 r6 = (defpackage.so4) r6
            if (r6 != 0) goto L_0x0045
            java.util.Collection r6 = r0.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = kotlin.collections.CollectionsKt.first(r6)
            so4 r6 = (defpackage.so4) r6
        L_0x0045:
            long r0 = r6.a
            android.content.res.Resources r6 = r5.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = defpackage.so4.d(r0, r6)
            int r6 = (int) r6
            r5.setLineHeight(r6)
            boolean r6 = r4.d
            r5.setIncludeFontPadding(r6)
            android.content.res.Resources r6 = r5.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            long r0 = r4.e
            float r6 = defpackage.so4.d(r0, r6)
            r5.setLetterSpacing(r6)
            java.lang.String r6 = r4.f
            r0 = 0
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r0)
            j96 r4 = r4.g
            int r4 = r4.a
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r6, r4, r0)
            r5.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogf.b(android.widget.TextView, uy4):void");
    }

    public final EnumMap e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.ogf) r8;
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
            boolean r1 = r8 instanceof defpackage.ogf
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ogf r8 = (defpackage.ogf) r8
            boolean r1 = r8.a
            boolean r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.EnumMap r1 = r7.b
            java.util.EnumMap r3 = r8.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.util.EnumMap r1 = r7.c
            java.util.EnumMap r3 = r8.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            boolean r1 = r7.d
            boolean r3 = r8.d
            if (r1 == r3) goto L_0x0030
            return r2
        L_0x0030:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            j96 r7 = r7.g
            j96 r8 = r8.g
            if (r7 == r8) goto L_0x004a
            return r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogf.equals(java.lang.Object):boolean");
    }

    public final EnumMap f() {
        return this.b;
    }

    public final long g(uy4 uy4) {
        EnumMap enumMap = this.b;
        so4 so4 = (so4) enumMap.get(uy4);
        return so4 != null ? so4.a : ((so4) CollectionsKt.first(enumMap.values())).a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.g.hashCode() + g63.d(wzf.i(g63.e((this.c.hashCode() + ((hashCode + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String m = wj6.m(new StringBuilder("Dimension(encodedValue="), this.e, ")");
        return "TextStyle(textAllCaps=" + this.a + ", textSizes=" + this.b + ", lineHeights=" + this.c + ", includeFontPadding=" + this.d + ", letterSpacing=" + m + ", fontFamily=" + this.f + ", fontWeight=" + this.g + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ogf(boolean r10, long r11, long r13, boolean r15, long r16, java.lang.String r18, defpackage.j96 r19) {
        /*
            r9 = this;
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<uy4> r0 = defpackage.uy4.class
            r2.<init>(r0)
            uy4 r1 = defpackage.uy4.b
            r3 = r11
            defpackage.rae.u(r11, r2, r1)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r0)
            r4 = r13
            defpackage.rae.u(r13, r3, r1)
            r0 = r9
            r1 = r10
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r0.<init>((boolean) r1, (java.util.EnumMap) r2, (java.util.EnumMap) r3, (boolean) r4, (long) r5, (java.lang.String) r7, (defpackage.j96) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogf.<init>(boolean, long, long, boolean, long, java.lang.String, j96):void");
    }
}
