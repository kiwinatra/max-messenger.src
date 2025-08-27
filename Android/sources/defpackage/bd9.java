package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bd9  reason: default package */
public final class bd9 {
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final Bitmap h;
    public final long i;
    public final lf6 j;
    public final pj5 k;
    public final hea l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public bd9(long j2, String str, long j3, Long l2, long j4, String str2, long j5, Bitmap bitmap, long j6, lf6 lf6, pj5 pj5, hea hea, boolean z, boolean z2, boolean z3) {
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = l2;
        this.e = j4;
        this.f = str2;
        this.g = j5;
        this.h = bitmap;
        this.i = j6;
        this.j = lf6;
        this.k = pj5;
        this.l = hea;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd9)) {
            return false;
        }
        bd9 bd9 = (bd9) obj;
        return this.a == bd9.a && Intrinsics.areEqual((Object) this.b, (Object) bd9.b) && this.c == bd9.c && Intrinsics.areEqual((Object) this.d, (Object) bd9.d) && this.e == bd9.e && Intrinsics.areEqual((Object) this.f, (Object) bd9.f) && this.g == bd9.g && Intrinsics.areEqual((Object) this.h, (Object) bd9.h) && this.i == bd9.i && Intrinsics.areEqual((Object) this.j, (Object) bd9.j) && this.k == bd9.k && Intrinsics.areEqual((Object) this.l, (Object) bd9.l) && this.m == bd9.m && this.n == bd9.n && this.o == bd9.o;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int i3 = wzf.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l2 = this.d;
        int i4 = wzf.i(g63.d(wzf.i((i3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int hashCode2 = (this.k.hashCode() + ((this.j.hashCode() + wzf.i((i4 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.i)) * 31)) * 31;
        hea hea = this.l;
        if (hea != null) {
            i2 = hea.hashCode();
        }
        return Boolean.hashCode(this.o) + g63.e(g63.e((hashCode2 + i2) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append(", senderUserName=");
        sb.append(this.f);
        sb.append(", senderUserId=");
        sb.append(this.g);
        sb.append(", senderIcon=");
        sb.append(this.h);
        sb.append(", time=");
        sb.append(this.i);
        sb.append(", text=");
        sb.append(this.j);
        sb.append(", fcmNotificationType=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", fcmSource=");
        sb.append(this.m);
        sb.append(", isScheduledMessage=");
        sb.append(this.n);
        sb.append(", hasAnyError=");
        return tr1.m(sb, this.o, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ bd9(long r24, java.lang.String r26, long r27, java.lang.Long r29, long r30, java.lang.String r32, long r33, android.graphics.Bitmap r35, long r36, defpackage.lf6 r38, defpackage.pj5 r39, defpackage.hea r40, boolean r41, boolean r42, boolean r43, int r44) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r19 = r1
            goto L_0x000c
        L_0x000a:
            r19 = r40
        L_0x000c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r20 = r2
            goto L_0x0016
        L_0x0014:
            r20 = r41
        L_0x0016:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x001d
            r21 = r2
            goto L_0x001f
        L_0x001d:
            r21 = r42
        L_0x001f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0026
            r22 = r2
            goto L_0x0028
        L_0x0026:
            r22 = r43
        L_0x0028:
            r2 = r23
            r3 = r24
            r5 = r26
            r6 = r27
            r8 = r29
            r9 = r30
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
            r2.<init>(r3, r5, r6, r8, r9, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd9.<init>(long, java.lang.String, long, java.lang.Long, long, java.lang.String, long, android.graphics.Bitmap, long, lf6, pj5, hea, boolean, boolean, boolean, int):void");
    }
}
