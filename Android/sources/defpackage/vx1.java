package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vx1  reason: default package */
public final class vx1 implements xx1 {
    public final long X;
    public final int Y;
    public final int a;
    public final List b;
    public final boolean c;
    public final m15 o;
    public final String v;
    public final String w;
    public final ngf x;
    public final int y;
    public final boolean z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vx1(int r13, java.util.List r14, boolean r15, defpackage.m15 r16, java.lang.String r17, java.lang.String r18, defpackage.mgf r19, long r20, int r22) {
        /*
            r12 = this;
            r4 = r16
            r0 = r22 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r17
        L_0x000b:
            r0 = r22 & 32
            if (r0 == 0) goto L_0x0011
            r6 = r1
            goto L_0x0013
        L_0x0011:
            r6 = r18
        L_0x0013:
            r0 = r22 & 64
            if (r0 == 0) goto L_0x001b
            ngf r0 = r4.b
            r7 = r0
            goto L_0x001d
        L_0x001b:
            r7 = r19
        L_0x001d:
            int r8 = r4.c
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx1.<init>(int, java.util.List, boolean, m15, java.lang.String, java.lang.String, mgf, long, int):void");
    }

    public static vx1 h(vx1 vx1, boolean z2) {
        return new vx1(vx1.a, vx1.b, z2, vx1.o, vx1.v, vx1.w, vx1.x, vx1.y, vx1.z, vx1.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) vx1.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        vx1 vx1 = (vx1) obj;
        if (this.a != vx1.a || this.c != vx1.c || this.o != vx1.o || !Intrinsics.areEqual((Object) this.v, (Object) vx1.v) || !Intrinsics.areEqual((Object) this.w, (Object) vx1.w)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.x, (Object) vx1.x) || this.y != vx1.y) {
            return false;
        }
        return this.X == vx1.X && this.Y == vx1.Y;
    }

    public final long getItemId() {
        return this.X;
    }

    public final ngf getName() {
        return this.x;
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + g63.e(this.a * 31, 31, this.c)) * 31;
        int i = 0;
        String str = this.v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.w;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return wzf.i((i2a.g((hashCode2 + i) * 31, 31, this.x) + this.y) * 31, 31, this.X) + this.Y;
    }

    public final int i() {
        return this.Y;
    }

    public final Object l(Object obj) {
        boolean z2;
        lz7 lz7 = (lz7) obj;
        if ((lz7 instanceof vx1) && this.c != (z2 = ((vx1) lz7).c)) {
            return new ux1(z2);
        }
        return null;
    }

    public final boolean q() {
        return this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.o);
        sb.append(", iconUrl=");
        sb.append(this.v);
        sb.append(", iconLottieUrl=");
        sb.append(this.w);
        sb.append(", name=");
        sb.append(this.x);
        sb.append(", iconRes=");
        sb.append(this.y);
        sb.append(", clearCategoryAvailable=");
        sb.append(this.z);
        sb.append(", itemId=");
        return wj6.m(sb, this.X, ")");
    }

    public vx1(int i, List list, boolean z2, m15 m15, String str, String str2, ngf ngf, int i2, boolean z3, long j) {
        this.a = i;
        this.b = list;
        this.c = z2;
        this.o = m15;
        this.v = str;
        this.w = str2;
        this.x = ngf;
        this.y = i2;
        this.z = z3;
        this.X = j;
        this.Y = zua.q;
    }
}
