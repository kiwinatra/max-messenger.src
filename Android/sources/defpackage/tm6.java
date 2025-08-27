package defpackage;

import android.net.Uri;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: tm6  reason: default package */
public final class tm6 extends vm6 {
    public final boolean b;
    public final k48 c;
    public final v3d d;
    public final dfb e;
    public final p4g f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final long m;

    public tm6(boolean z, k48 k48, v3d v3d, dfb dfb, p4g p4g, Uri uri, int i2, boolean z2, long j2, int i3, Uri uri2) {
        super(10);
        this.b = z;
        this.c = k48;
        this.d = v3d;
        this.e = dfb;
        this.f = p4g;
        this.g = uri;
        this.h = i2;
        this.i = z2;
        this.j = j2;
        this.k = i3;
        this.l = uri2;
        Long l2 = k48.x;
        this.m = l2 != null ? l2.longValue() : 0;
    }

    public static tm6 b(tm6 tm6, dfb dfb, p4g p4g, Uri uri, int i2, boolean z, int i3, Uri uri2, int i4) {
        tm6 tm62 = tm6;
        int i5 = i4;
        boolean z2 = tm62.b;
        k48 k48 = tm62.c;
        v3d v3d = tm62.d;
        dfb dfb2 = (i5 & 8) != 0 ? tm62.e : dfb;
        p4g p4g2 = (i5 & 16) != 0 ? tm62.f : p4g;
        Uri uri3 = (i5 & 32) != 0 ? tm62.g : uri;
        int i6 = (i5 & 64) != 0 ? tm62.h : i2;
        boolean z3 = (i5 & Uuid.SIZE_BITS) != 0 ? tm62.i : z;
        long j2 = tm62.j;
        int i7 = (i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tm62.k : i3;
        Uri uri4 = (i5 & 1024) != 0 ? tm62.l : uri2;
        tm6.getClass();
        return new tm6(z2, k48, v3d, dfb2, p4g2, uri3, i6, z3, j2, i7, uri4);
    }

    public final Long a() {
        return Long.valueOf(this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.tm6) r8;
        r1 = r8.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.tm6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tm6 r8 = (defpackage.tm6) r8
            boolean r1 = r8.b
            boolean r3 = r7.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            k48 r1 = r7.c
            k48 r3 = r8.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            v3d r1 = r7.d
            v3d r3 = r8.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            dfb r1 = r7.e
            dfb r3 = r8.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            p4g r1 = r7.f
            p4g r3 = r8.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            android.net.Uri r1 = r7.g
            android.net.Uri r3 = r8.g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004a
            return r2
        L_0x004a:
            int r1 = r7.h
            int r3 = r8.h
            if (r1 == r3) goto L_0x0051
            return r2
        L_0x0051:
            boolean r1 = r7.i
            boolean r3 = r8.i
            if (r1 == r3) goto L_0x0058
            return r2
        L_0x0058:
            long r3 = r7.j
            long r5 = r8.j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            return r2
        L_0x0061:
            int r1 = r7.k
            int r3 = r8.k
            if (r1 == r3) goto L_0x0068
            return r2
        L_0x0068:
            android.net.Uri r7 = r7.l
            android.net.Uri r8 = r8.l
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 != 0) goto L_0x0073
            return r2
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        int i2 = 0;
        dfb dfb = this.e;
        int hashCode2 = (hashCode + (dfb == null ? 0 : dfb.hashCode())) * 31;
        p4g p4g = this.f;
        int hashCode3 = (hashCode2 + (p4g == null ? 0 : p4g.hashCode())) * 31;
        Uri uri = this.g;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return this.l.hashCode() + rae.h(this.k, wzf.i(g63.e(rae.h(this.h, (hashCode3 + i2) * 31, 31), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        int i2 = this.h;
        return "Media(multiSelect=" + this.b + ", origin=" + this.c + ", resizeOptions=" + this.d + ", photoEditorOptions=" + this.e + ", videoConvertOptions=" + this.f + ", overlay=" + this.g + ", selectionNumber=" + i2 + ", enabled=" + this.i + ", id=" + this.j + ", rotation=" + this.k + ", thumbnailUri=" + this.l + ")";
    }
}
