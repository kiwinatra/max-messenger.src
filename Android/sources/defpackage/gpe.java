package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gpe  reason: default package */
public final class gpe implements lz7 {
    public static final gpe w0 = new gpe(0, 0, 0, (String) null, (String) null, 0, 0, false, false, 0, 4094);
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String v;
    public final int v0;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    public gpe(long j, long j2, long j3, String str, String str2, int i, int i2, int i3, boolean z2, boolean z3, boolean z4, long j4) {
        int i4;
        String str3 = str2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.v = str3;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = j4;
        if (str3 == null || str2.length() == 0) {
            i4 = fza.g;
        } else {
            i4 = fza.h;
        }
        this.v0 = i4;
    }

    public static gpe h(gpe gpe, boolean z2, boolean z3, int i) {
        gpe gpe2 = gpe;
        int i2 = i;
        boolean z4 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? gpe2.X : z2;
        gpe gpe3 = r3;
        gpe gpe4 = new gpe(gpe2.a, gpe2.b, gpe2.c, gpe2.o, gpe2.v, gpe2.w, gpe2.x, gpe2.y, gpe2.z, z4, (i2 & 1024) != 0 ? gpe2.Y : z3, gpe2.Z);
        return gpe3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe)) {
            return false;
        }
        gpe gpe = (gpe) obj;
        return this.a == gpe.a && this.b == gpe.b && this.c == gpe.c && Intrinsics.areEqual((Object) this.o, (Object) gpe.o) && Intrinsics.areEqual((Object) this.v, (Object) gpe.v) && this.w == gpe.w && this.x == gpe.x && this.y == gpe.y && this.z == gpe.z && this.X == gpe.X && this.Y == gpe.Y && this.Z == gpe.Z;
    }

    public final boolean f(lz7 lz7) {
        return this.Z == lz7.getItemId();
    }

    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.o;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Long.hashCode(this.Z) + g63.e(g63.e(g63.e(rae.h(this.y, rae.h(this.x, rae.h(this.w, (hashCode + i2) * 31, 31), 31), 31), 31, this.z), 31, this.X), 31, this.Y);
    }

    public final int i() {
        return this.v0;
    }

    public final Object l(Object obj) {
        boolean z2;
        lz7 lz7 = (lz7) obj;
        if ((lz7 instanceof gpe) && this.Y != (z2 = ((gpe) lz7).Y)) {
            return new fpe(z2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerModel(id=");
        sb.append(this.a);
        sb.append(", setId=");
        sb.append(this.b);
        sb.append(", originalSetId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", lottieUrl=");
        sb.append(this.v);
        sb.append(", markerType=");
        sb.append(this.w);
        sb.append(", width=");
        sb.append(this.x);
        sb.append(", height=");
        sb.append(this.y);
        sb.append(", external=");
        sb.append(this.z);
        sb.append(", favorite=");
        sb.append(this.X);
        sb.append(", selected=");
        sb.append(this.Y);
        sb.append(", itemId=");
        return wj6.m(sb, this.Z, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ gpe(long r22, long r24, long r26, java.lang.String r28, java.lang.String r29, int r30, int r31, boolean r32, boolean r33, long r34, int r36) {
        /*
            r21 = this;
            r0 = r36
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r24
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r26
        L_0x0014:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r11 = r2
            goto L_0x001d
        L_0x001b:
            r11 = r28
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r29
        L_0x0025:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x002c
            r14 = r2
            goto L_0x002e
        L_0x002c:
            r14 = r30
        L_0x002e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0034
            r15 = r2
            goto L_0x0036
        L_0x0034:
            r15 = r31
        L_0x0036:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003d
            r17 = r2
            goto L_0x003f
        L_0x003d:
            r17 = r32
        L_0x003f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0046
            r18 = r2
            goto L_0x0048
        L_0x0046:
            r18 = r33
        L_0x0048:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x004f
            r19 = r22
            goto L_0x0051
        L_0x004f:
            r19 = r34
        L_0x0051:
            r13 = 0
            r16 = 0
            r4 = r21
            r5 = r22
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpe.<init>(long, long, long, java.lang.String, java.lang.String, int, int, boolean, boolean, long, int):void");
    }
}
