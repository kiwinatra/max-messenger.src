package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: cd7  reason: default package */
public final /* synthetic */ class cd7 implements Function1 {
    public final /* synthetic */ pk6 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ d14 v;
    public final /* synthetic */ yd7 w;
    public final /* synthetic */ zcf x;

    public /* synthetic */ cd7(pk6 pk6, ArrayList arrayList, ArrayList arrayList2, boolean z, d14 d14, yd7 yd7, zcf zcf) {
        this.a = pk6;
        this.b = arrayList;
        this.c = arrayList2;
        this.o = z;
        this.v = d14;
        this.w = yd7;
        this.x = zcf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r9 != -1) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            android.database.Cursor r1 = (android.database.Cursor) r1
            pk6 r2 = r0.a
            java.lang.String r3 = r2.f()
            int r3 = r1.getColumnIndex(r3)
            r4 = -1
            if (r3 != r4) goto L_0x0017
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00fc
        L_0x0017:
            java.lang.String r5 = r2.c()
            int r5 = r1.getColumnIndex(r5)
            if (r5 != r4) goto L_0x0025
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00fc
        L_0x0025:
            java.lang.String r6 = r2.g()
            int r6 = r1.getColumnIndex(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 0
            if (r6 == r4) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r7 = r8
        L_0x0036:
            java.lang.String r6 = r2.d()
            int r6 = r1.getColumnIndex(r6)
            if (r6 != r4) goto L_0x0044
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00fc
        L_0x0044:
            java.lang.String r9 = r2.h()
            if (r9 == 0) goto L_0x0055
            int r9 = r1.getColumnIndex(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            if (r9 == r4) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r10 = r8
        L_0x0056:
            java.lang.String r9 = r2.e()
            if (r9 == 0) goto L_0x0067
            int r9 = r1.getColumnIndex(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            if (r9 == r4) goto L_0x0067
            r8 = r11
        L_0x0067:
            boolean r4 = r1.moveToNext()
            if (r4 == 0) goto L_0x00fa
            yd7 r4 = r0.w
            zcf r9 = r0.x
            boolean r11 = r0.o
            d14 r12 = r0.v
            boolean r4 = defpackage.hd7.h(r12, r4, r9, r11)
            if (r4 == 0) goto L_0x00fa
            long r12 = r1.getLong(r3)
            android.net.Uri r4 = defpackage.n79.B(r1, r5)
            if (r4 != 0) goto L_0x008d
            android.net.Uri r4 = r2.i()
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r4, r12)
        L_0x008d:
            r21 = r4
            long r17 = r1.getLong(r6)
            if (r10 == 0) goto L_0x009e
            int r4 = r10.intValue()
            int r4 = r1.getInt(r4)
            goto L_0x009f
        L_0x009e:
            r4 = 0
        L_0x009f:
            o9a r9 = defpackage.sq9.b
            java.lang.String r9 = "image/jpeg"
            if (r7 != 0) goto L_0x00a7
        L_0x00a5:
            r15 = r9
            goto L_0x00b4
        L_0x00a7:
            int r11 = r7.intValue()
            java.lang.String r11 = r1.getString(r11)
            if (r11 != 0) goto L_0x00b2
            goto L_0x00a5
        L_0x00b2:
            r9 = r11
            goto L_0x00a5
        L_0x00b4:
            ejd r9 = defpackage.j48.a
            r9.getClass()
            j48 r9 = defpackage.ejd.c(r15)
            j48 r11 = defpackage.j48.b
            if (r9 == r11) goto L_0x0067
            if (r8 == 0) goto L_0x00cc
            int r11 = r8.intValue()
            long r19 = r1.getLong(r11)
            goto L_0x00ce
        L_0x00cc:
            r19 = 0
        L_0x00ce:
            k48 r14 = new k48
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Long r20 = java.lang.Long.valueOf(r19)
            r22 = 896(0x380, float:1.256E-42)
            r16 = -1
            r11 = r14
            r24 = r1
            r1 = r14
            r14 = r21
            r19 = r4
            r11.<init>(r12, r14, r15, r16, r17, r19, r20, r21, r22)
            j48 r4 = defpackage.j48.v
            if (r9 != r4) goto L_0x00f1
            java.util.ArrayList r4 = r0.b
            r4.add(r1)
            goto L_0x00f6
        L_0x00f1:
            java.util.ArrayList r4 = r0.c
            r4.add(r1)
        L_0x00f6:
            r1 = r24
            goto L_0x0067
        L_0x00fa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x00fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd7.invoke(java.lang.Object):java.lang.Object");
    }
}
