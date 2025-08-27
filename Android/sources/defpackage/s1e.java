package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s1e  reason: default package */
public final class s1e implements i1e {
    public final int X;
    public final long a;
    public final int b;
    public final ngf c;
    public final h1e o;
    public final ngf v;
    public final Integer w;
    public final f1e x;
    public final z0e y;
    public final ngf z;

    public s1e(long j, int i, ngf ngf, h1e h1e, ngf ngf2, Integer num, f1e f1e, z0e z0e, ngf ngf3, int i2) {
        this.a = j;
        this.b = i;
        this.c = ngf;
        this.o = h1e;
        this.v = ngf2;
        this.w = num;
        this.x = f1e;
        this.y = z0e;
        this.z = ngf3;
        this.X = i2;
    }

    public static s1e h(s1e s1e, ggf ggf, b1e b1e, int i) {
        long j = s1e.a;
        int i2 = s1e.b;
        ngf ngf = ggf;
        if ((i & 4) != 0) {
            ngf = s1e.c;
        }
        ngf ngf2 = ngf;
        h1e h1e = s1e.o;
        ngf ngf3 = s1e.v;
        Integer num = s1e.w;
        f1e f1e = b1e;
        if ((i & 64) != 0) {
            f1e = s1e.x;
        }
        z0e z0e = s1e.y;
        ngf ngf4 = s1e.z;
        int i3 = s1e.X;
        s1e.getClass();
        return new s1e(j, i2, ngf2, h1e, ngf3, num, f1e, z0e, ngf4, i3);
    }

    public final Integer a() {
        return this.w;
    }

    public final ngf b() {
        return this.v;
    }

    public final z0e c() {
        return this.y;
    }

    public final ngf d() {
        return this.z;
    }

    public final f1e e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1e)) {
            return false;
        }
        s1e s1e = (s1e) obj;
        return this.a == s1e.a && this.b == s1e.b && Intrinsics.areEqual((Object) this.c, (Object) s1e.c) && this.o == s1e.o && Intrinsics.areEqual((Object) this.v, (Object) s1e.v) && Intrinsics.areEqual((Object) this.w, (Object) s1e.w) && Intrinsics.areEqual((Object) this.x, (Object) s1e.x) && Intrinsics.areEqual((Object) this.y, (Object) s1e.y) && Intrinsics.areEqual((Object) this.z, (Object) s1e.z) && this.X == s1e.X;
    }

    public final long getItemId() {
        return this.a;
    }

    public final ngf getTitle() {
        return this.c;
    }

    public final h1e getType() {
        return this.o;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.o.hashCode() + i2a.g(rae.h(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        int i2 = 0;
        ngf ngf = this.v;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.w;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        f1e f1e = this.x;
        int hashCode4 = (hashCode3 + (f1e == null ? 0 : f1e.hashCode())) * 31;
        z0e z0e = this.y;
        if (z0e == null) {
            i = 0;
        } else {
            z0e.getClass();
            i = 92926410;
        }
        int i3 = (hashCode4 + i) * 31;
        ngf ngf2 = this.z;
        if (ngf2 != null) {
            i2 = ngf2.hashCode();
        }
        return Integer.hashCode(this.X) + ((i3 + i2) * 31);
    }

    public final int p() {
        return this.X;
    }

    public final int s() {
        return this.b;
    }

    public final String toString() {
        return "SettingsItemModel(itemId=" + this.a + ", sectionId=" + this.b + ", title=" + this.c + ", type=" + this.o + ", descriptionRes=" + this.v + ", startIconRes=" + this.w + ", endView=" + this.x + ", counterType=" + this.y + ", upperText=" + this.z + ", startIconPadding=" + this.X + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s1e(long r15, int r17, defpackage.ngf r18, defpackage.h1e r19, defpackage.ngf r20, java.lang.Integer r21, defpackage.f1e r22, defpackage.y0e r23, defpackage.ngf r24, int r25, int r26) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            h1e r1 = defpackage.h1e.b
            r7 = r1
            goto L_0x000c
        L_0x000a:
            r7 = r19
        L_0x000c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r8 = r2
            goto L_0x0015
        L_0x0013:
            r8 = r20
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r9 = r2
            goto L_0x001d
        L_0x001b:
            r9 = r21
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r10 = r2
            goto L_0x0025
        L_0x0023:
            r10 = r22
        L_0x0025:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r23
        L_0x002d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r2
            goto L_0x0035
        L_0x0033:
            r12 = r24
        L_0x0035:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            r0 = 8
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r13 = r0
            goto L_0x004f
        L_0x004d:
            r13 = r25
        L_0x004f:
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1e.<init>(long, int, ngf, h1e, ngf, java.lang.Integer, f1e, y0e, ngf, int, int):void");
    }
}
