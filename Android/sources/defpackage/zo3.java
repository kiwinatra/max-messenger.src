package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zo3  reason: default package */
public final class zo3 implements lz7 {
    public final CharSequence X;
    public final boolean Y;
    public final qdb Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List o;
    public final CharSequence v;
    public final Boolean v0;
    public final CharSequence w;
    public final boolean w0;
    public final Uri x;
    public final int x0;
    public final boolean y;
    public final boolean y0;
    public final boolean z;
    public final int z0;

    public zo3(long j, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, Uri uri, boolean z2, boolean z3, CharSequence charSequence5, boolean z4, qdb qdb, Boolean bool, boolean z5, int i, boolean z6) {
        int i2;
        CharSequence charSequence6 = charSequence4;
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = list;
        this.v = charSequence3;
        this.w = charSequence6;
        this.x = uri;
        this.y = z2;
        this.z = z3;
        this.X = charSequence5;
        this.Y = z4;
        this.Z = qdb;
        this.v0 = bool;
        this.w0 = z5;
        this.x0 = i;
        this.y0 = z6;
        if (charSequence6 == null) {
            i2 = rra.m;
        } else {
            i2 = rra.s;
        }
        this.z0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo3)) {
            return false;
        }
        zo3 zo3 = (zo3) obj;
        return this.a == zo3.a && Intrinsics.areEqual((Object) this.b, (Object) zo3.b) && Intrinsics.areEqual((Object) this.c, (Object) zo3.c) && Intrinsics.areEqual((Object) this.o, (Object) zo3.o) && Intrinsics.areEqual((Object) this.v, (Object) zo3.v) && Intrinsics.areEqual((Object) this.w, (Object) zo3.w) && Intrinsics.areEqual((Object) this.x, (Object) zo3.x) && this.y == zo3.y && this.z == zo3.z && Intrinsics.areEqual((Object) this.X, (Object) zo3.X) && this.Y == zo3.Y && Intrinsics.areEqual((Object) this.Z, (Object) zo3.Z) && Intrinsics.areEqual((Object) this.v0, (Object) zo3.v0) && this.w0 == zo3.w0 && this.x0 == zo3.x0 && this.y0 == zo3.y0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int e = wj6.e(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int hashCode = (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.o;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.v;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.w;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.x;
        int e2 = g63.e(wj6.e(this.X, g63.e(g63.e((hashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.y), 31, this.z), 31), 31, this.Y);
        qdb qdb = this.Z;
        int hashCode5 = (e2 + (qdb == null ? 0 : qdb.hashCode())) * 31;
        Boolean bool = this.v0;
        if (bool != null) {
            i = bool.hashCode();
        }
        return Boolean.hashCode(this.y0) + rae.h(this.x0, g63.e((hashCode5 + i) * 31, 31, this.w0), 31);
    }

    public final int i() {
        return this.z0;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        zo3 zo3 = lz7 instanceof zo3 ? (zo3) lz7 : null;
        if (zo3 == null) {
            return null;
        }
        Boolean bool = this.v0;
        Boolean bool2 = zo3.v0;
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            return new yo3(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ContactListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", phones=" + this.o + ", subtitle=" + this.v + ", button=" + this.w + ", avatar=" + this.x + ", isOnline=" + this.y + ", isVerified=" + this.z + ", abbreviation=" + this.X + ", isSelf=" + this.Y + ", availablePhone=" + this.Z + ", isSelected=" + this.v0 + ", hasCallActions=" + this.w0 + ", presence=" + this.x0 + ", isBot=" + this.y0 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ zo3(long r22, java.lang.CharSequence r24, java.lang.String r25, java.util.List r26, java.lang.CharSequence r27, java.lang.CharSequence r28, android.net.Uri r29, boolean r30, boolean r31, java.lang.CharSequence r32, boolean r33, defpackage.qdb r34, java.lang.Boolean r35, int r36, boolean r37, int r38) {
        /*
            r21 = this;
            r0 = r38
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r33
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r3 = 0
            if (r1 == 0) goto L_0x0013
            r16 = r3
            goto L_0x0015
        L_0x0013:
            r16 = r34
        L_0x0015:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x001c
            r17 = r3
            goto L_0x001e
        L_0x001c:
            r17 = r35
        L_0x001e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0025
            r19 = r2
            goto L_0x0027
        L_0x0025:
            r19 = r36
        L_0x0027:
            r18 = 0
            r3 = r21
            r4 = r22
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r20 = r37
            r3.<init>((long) r4, (java.lang.CharSequence) r6, (java.lang.CharSequence) r7, (java.util.List) r8, (java.lang.CharSequence) r9, (java.lang.CharSequence) r10, (android.net.Uri) r11, (boolean) r12, (boolean) r13, (java.lang.CharSequence) r14, (boolean) r15, (defpackage.qdb) r16, (java.lang.Boolean) r17, (boolean) r18, (int) r19, (boolean) r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo3.<init>(long, java.lang.CharSequence, java.lang.String, java.util.List, java.lang.CharSequence, java.lang.CharSequence, android.net.Uri, boolean, boolean, java.lang.CharSequence, boolean, qdb, java.lang.Boolean, int, boolean, int):void");
    }
}
