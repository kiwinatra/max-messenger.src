package defpackage;

import android.net.Uri;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: by7  reason: default package */
public final class by7 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final String r = by7.class.getName();

    public by7(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16, Lazy lazy17) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy6;
        this.d = lazy4;
        this.e = lazy7;
        this.f = lazy3;
        this.g = lazy8;
        this.h = lazy9;
        this.i = lazy10;
        this.j = lazy5;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0 = kotlin.Result.m23constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0245, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.by7 r23, defpackage.ds5 r24, android.net.Uri r25, kotlin.coroutines.Continuation r26) {
        /*
            r11 = r23
            r12 = r24
            r0 = r26
            r23.getClass()
            boolean r1 = r0 instanceof defpackage.vx7
            if (r1 == 0) goto L_0x001d
            r1 = r0
            vx7 r1 = (defpackage.vx7) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001d
            int r2 = r2 - r3
            r1.z = r2
        L_0x001b:
            r13 = r1
            goto L_0x0023
        L_0x001d:
            vx7 r1 = new vx7
            r1.<init>(r11, r0)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r0 = r13.x
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.z
            r15 = 0
            switch(r1) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0090;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0078;
                case 7: goto L_0x0073;
                case 8: goto L_0x006e;
                case 9: goto L_0x0069;
                case 10: goto L_0x0054;
                case 11: goto L_0x003c;
                case 12: goto L_0x0037;
                case 13: goto L_0x0037;
                case 14: goto L_0x0037;
                case 15: goto L_0x0037;
                case 16: goto L_0x0037;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x02d7
        L_0x003c:
            java.lang.Throwable r1 = r13.w
            java.lang.Object r2 = r13.v
            dz7 r3 = r13.o
            android.net.Uri r4 = r13.c
            ds5 r5 = r13.b
            java.lang.Object r6 = r13.a
            by7 r6 = (defpackage.by7) r6
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r6
            goto L_0x0292
        L_0x0054:
            dz7 r1 = r13.o
            android.net.Uri r2 = r13.c
            ds5 r3 = r13.b
            java.lang.Object r4 = r13.a
            by7 r4 = (defpackage.by7) r4
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0064 }
            r12 = r3
            goto L_0x0238
        L_0x0064:
            r0 = move-exception
            r12 = r3
        L_0x0066:
            r11 = r4
            goto L_0x0254
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x033c
        L_0x006e:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x01e4
        L_0x0073:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x01ce
        L_0x0078:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x01b2
        L_0x007d:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x019a
        L_0x0082:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0187
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0152
        L_0x008c:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00f0
        L_0x0090:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0349
        L_0x0095:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Lazy r0 = r11.q
            java.lang.Object r0 = r0.getValue()
            doa r0 = (defpackage.doa) r0
            boolean r0 = r0.e()
            xw7 r1 = defpackage.xw7.a
            if (r0 == 0) goto L_0x033f
            kotlin.Lazy r0 = r11.m
            java.lang.Object r0 = r0.getValue()
            opa r0 = (defpackage.opa) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00b8
            goto L_0x033f
        L_0x00b8:
            kotlin.Lazy r0 = r11.d
            java.lang.Object r0 = r0.getValue()
            fz7 r0 = (defpackage.fz7) r0
            r2 = r25
            android.net.Uri r10 = r0.f(r2)
            kotlin.Lazy r0 = r11.n
            java.lang.Object r0 = r0.getValue()
            ta4 r0 = (defpackage.ta4) r0
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            na4 r0 = (defpackage.na4) r0
            kotlin.Pair r0 = r0.a(r10)
            if (r0 == 0) goto L_0x00f4
            vw7 r0 = new vw7
            java.lang.String r1 = r11.d(r10)
            r0.<init>(r10, r1)
            r1 = 2
            r13.z = r1
            java.lang.Object r0 = r12.a(r0, r13)
            if (r0 != r14) goto L_0x00f0
            goto L_0x034b
        L_0x00f0:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x00f4:
            kotlin.Lazy r0 = r11.d
            java.lang.Object r0 = r0.getValue()
            fz7 r0 = (defpackage.fz7) r0
            kotlin.Lazy r2 = r11.b
            java.lang.Object r2 = r2.getValue()
            r62 r2 = (defpackage.r62) r2
            kotlin.Lazy r3 = r11.a
            java.lang.Object r3 = r3.getValue()
            km3 r3 = (defpackage.km3) r3
            kotlin.Lazy r4 = r11.p
            java.lang.Object r4 = r4.getValue()
            u82 r4 = (defpackage.u82) r4
            dz7 r8 = r0.c(r10, r2, r3, r4)
            java.lang.String r0 = r11.r
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x011f
            goto L_0x0140
        L_0x011f:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0140
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "parse "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r5 = ", deeplinkdata = "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r0, r4, r15)
        L_0x0140:
            if (r8 != 0) goto L_0x0156
            yw7 r0 = new yw7
            r0.<init>(r10)
            r1 = 3
            r13.z = r1
            java.lang.Object r0 = r12.a(r0, r13)
            if (r0 != r14) goto L_0x0152
            goto L_0x034b
        L_0x0152:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x0156:
            boolean r0 = r8 instanceof defpackage.vy7
            if (r0 == 0) goto L_0x018b
            kotlin.Lazy r0 = r11.l
            java.lang.Object r0 = r0.getValue()
            uj5 r0 = (defpackage.uj5) r0
            vj5 r0 = (defpackage.vj5) r0
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x018b
            vy7 r8 = (defpackage.vy7) r8
            java.lang.String r0 = r8.v
            r1 = 4
            r13.z = r1
            gx7 r1 = new gx7
            r1.<init>(r0)
            java.lang.Object r0 = r12.a(r1, r13)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0183:
            if (r0 != r14) goto L_0x0187
            goto L_0x034b
        L_0x0187:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x018b:
            boolean r0 = r8 instanceof defpackage.yy7
            if (r0 == 0) goto L_0x019e
            r0 = 5
            r13.z = r0
            java.lang.Object r0 = r12.a(r1, r13)
            if (r0 != r14) goto L_0x019a
            goto L_0x034b
        L_0x019a:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x019e:
            boolean r0 = r8 instanceof defpackage.zy7
            if (r0 == 0) goto L_0x01b6
            r0 = r8
            zy7 r0 = (defpackage.zy7) r0
            android.net.Uri r0 = r0.v
            r1 = 6
            r13.z = r1
            java.lang.Object r0 = r11.i(r12, r8, r0, r13)
            if (r0 != r14) goto L_0x01b2
            goto L_0x034b
        L_0x01b2:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x01b6:
            boolean r0 = r8 instanceof defpackage.wy7
            if (r0 == 0) goto L_0x01d2
            zw7 r0 = new zw7
            wy7 r8 = (defpackage.wy7) r8
            java.lang.String r1 = r8.v
            r0.<init>(r1)
            r1 = 7
            r13.z = r1
            java.lang.Object r0 = r12.a(r0, r13)
            if (r0 != r14) goto L_0x01ce
            goto L_0x034b
        L_0x01ce:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x01d2:
            boolean r0 = r8 instanceof defpackage.cz7
            if (r0 == 0) goto L_0x01e8
            cz7 r8 = (defpackage.cz7) r8
            r0 = 8
            r13.z = r0
            java.lang.Object r0 = r11.g(r12, r8, r13)
            if (r0 != r14) goto L_0x01e4
            goto L_0x034b
        L_0x01e4:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x01e8:
            long r4 = r8.a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01f1
            goto L_0x0205
        L_0x01f1:
            long r2 = r8.b
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01f8
            goto L_0x0205
        L_0x01f8:
            long r2 = r8.c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ff
            goto L_0x0205
        L_0x01ff:
            long r2 = r8.o
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x032c
        L_0x0205:
            long r6 = r8.b
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x02db
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x024e }
            r13.a = r11     // Catch:{ all -> 0x024e }
            r13.b = r12     // Catch:{ all -> 0x024e }
            r13.c = r10     // Catch:{ all -> 0x024e }
            r13.o = r8     // Catch:{ all -> 0x024e }
            r0 = 10
            r13.z = r0     // Catch:{ all -> 0x024e }
            r16 = 0
            r1 = r23
            r2 = r24
            r3 = r10
            r18 = r6
            r6 = r16
            r20 = r8
            r8 = r18
            r25 = r10
            r10 = r13
            java.lang.Object r0 = r1.b(r2, r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0248 }
            if (r0 != r14) goto L_0x0233
            goto L_0x034b
        L_0x0233:
            r2 = r25
            r4 = r11
            r1 = r20
        L_0x0238:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0245 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0245 }
            r3 = r1
        L_0x023f:
            r21 = r2
            r2 = r0
            r0 = r21
            goto L_0x0261
        L_0x0245:
            r0 = move-exception
            goto L_0x0066
        L_0x0248:
            r0 = move-exception
        L_0x0249:
            r2 = r25
            r1 = r20
            goto L_0x0254
        L_0x024e:
            r0 = move-exception
            r20 = r8
            r25 = r10
            goto L_0x0249
        L_0x0254:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            r3 = r1
            r4 = r11
            goto L_0x023f
        L_0x0261:
            java.lang.Throwable r1 = kotlin.Result.m26exceptionOrNullimpl(r2)
            if (r1 == 0) goto L_0x02d7
            qx2 r5 = r4.c()
            long r6 = r3.a
            r13.a = r4
            r13.b = r12
            r13.c = r0
            r13.o = r3
            r13.v = r2
            r13.w = r1
            r8 = 11
            r13.z = r8
            my2 r5 = (defpackage.my2) r5
            java.lang.Object r5 = r5.l(r6, r13)
            if (r5 != r14) goto L_0x0287
            goto L_0x034b
        L_0x0287:
            r21 = r5
            r5 = r0
            r0 = r21
            r22 = r3
            r3 = r2
            r2 = r4
            r4 = r22
        L_0x0292:
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x02b6
            long r0 = r4.a
            r13.a = r3
            r13.b = r15
            r13.c = r15
            r13.o = r15
            r13.v = r15
            r13.w = r15
            r3 = 12
            r13.z = r3
            r7 = 0
            r3 = r12
            r4 = r5
            r5 = r0
            r9 = r13
            java.lang.Object r0 = r2.k(r3, r4, r5, r7, r9)
            if (r0 != r14) goto L_0x02d7
            goto L_0x034b
        L_0x02b6:
            java.lang.String r0 = r2.r
            java.lang.String r2 = "chat not found"
            defpackage.z68.f(r0, r2, r1)
            uw7 r0 = defpackage.uw7.a
            r13.a = r3
            r13.b = r15
            r13.c = r15
            r13.o = r15
            r13.v = r15
            r13.w = r15
            r1 = 13
            r13.z = r1
            java.lang.Object r0 = r12.a(r0, r13)
            if (r0 != r14) goto L_0x02d7
            goto L_0x034b
        L_0x02d7:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x02db:
            r2 = r8
            r25 = r10
            long r6 = r2.o
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x02fd
            r0 = 14
            r13.z = r0
            hx7 r0 = new hx7
            r0.<init>(r6)
            java.lang.Object r0 = r12.a(r0, r13)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02fa:
            if (r0 != r14) goto L_0x02d7
            goto L_0x034b
        L_0x02fd:
            long r6 = r2.c
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0318
            r0 = 15
            r13.z = r0
            r0 = 0
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r6
            r6 = r0
            r7 = r13
            java.lang.Object r0 = r1.j(r2, r3, r4, r6, r7)
            if (r0 != r14) goto L_0x02d7
            goto L_0x034b
        L_0x0318:
            r0 = 16
            r13.z = r0
            r6 = 0
            r1 = r23
            r2 = r24
            r3 = r25
            r8 = r13
            java.lang.Object r0 = r1.k(r2, r3, r4, r6, r8)
            if (r0 != r14) goto L_0x02d7
            goto L_0x034b
        L_0x032c:
            r2 = r8
            r25 = r10
            r0 = 9
            r13.z = r0
            r1 = r25
            java.lang.Object r0 = r11.i(r12, r2, r1, r13)
            if (r0 != r14) goto L_0x033c
            goto L_0x034b
        L_0x033c:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x034b
        L_0x033f:
            r0 = 1
            r13.z = r0
            java.lang.Object r0 = r12.a(r1, r13)
            if (r0 != r14) goto L_0x0349
            goto L_0x034b
        L_0x0349:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x034b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.a(by7, ds5, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        r4 = (defpackage.ha9) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        if (r4 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        defpackage.z68.f(r9.r, "message not found!", (java.lang.Throwable) null);
        r10.a = null;
        r10.b = null;
        r10.c = null;
        r10.z = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d5, code lost:
        if (r0.a(r12, r10) != r11) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d7, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00da, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
        r5 = r9.c();
        r10.a = r9;
        r10.b = r0;
        r10.c = r1;
        r10.o = r4;
        r10.z = 3;
        r2 = ((defpackage.my2) r5).l(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f0, code lost:
        if (r2 != r11) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f2, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        r2 = (defpackage.a32) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f5, code lost:
        if (r2 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        defpackage.z68.f(r9.r, "chat not found", (java.lang.Throwable) null);
        r10.a = null;
        r10.b = null;
        r10.c = null;
        r10.o = null;
        r10.z = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        if (r0.a(r12, r10) != r11) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010f, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0112, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0129, code lost:
        if (((defpackage.f72) defpackage.hd8.r(r4.o, r2.b.n.d(r4.S0)).getSecond()) == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        r10.a = null;
        r10.b = null;
        r10.c = null;
        r10.o = null;
        r10.z = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014a, code lost:
        if (r9.k(r0, r1, r2.a, r4.o, r10) != r11) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014c, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014f, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0150, code lost:
        r3 = defpackage.bx7.a;
        r10.a = r9;
        r10.b = r0;
        r10.c = r1;
        r10.o = r4;
        r10.v = r2;
        r10.z = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0163, code lost:
        if (r0.a(r3, r10) != r11) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0165, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0166, code lost:
        r5 = r4.o;
        r10.a = null;
        r10.b = null;
        r10.c = null;
        r10.o = null;
        r10.v = null;
        r10.z = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0189, code lost:
        if (r9.f(r0, r1, r2, r5, r4.S0, r10) != r11) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018b, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018e, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.ds5 r20, android.net.Uri r21, long r22, long r24, long r26, kotlin.coroutines.Continuation r28) {
        /*
            r19 = this;
            r9 = r19
            r0 = r28
            boolean r1 = r0 instanceof defpackage.lx7
            if (r1 == 0) goto L_0x0018
            r1 = r0
            lx7 r1 = (defpackage.lx7) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.z = r2
        L_0x0016:
            r10 = r1
            goto L_0x001e
        L_0x0018:
            lx7 r1 = new lx7
            r1.<init>(r9, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r10.x
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.z
            uw7 r12 = defpackage.uw7.a
            r13 = 0
            switch(r1) {
                case 0: goto L_0x0085;
                case 1: goto L_0x006e;
                case 2: goto L_0x0069;
                case 3: goto L_0x0057;
                case 4: goto L_0x0052;
                case 5: goto L_0x004d;
                case 6: goto L_0x0039;
                case 7: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x018c
        L_0x0039:
            a32 r1 = r10.v
            ha9 r2 = r10.o
            android.net.Uri r3 = r10.c
            ds5 r4 = r10.b
            by7 r5 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            r9 = r5
            r4 = r2
            r2 = r1
            r1 = r3
            goto L_0x0166
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x014d
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0110
        L_0x0057:
            ha9 r1 = r10.o
            android.net.Uri r2 = r10.c
            ds5 r3 = r10.b
            by7 r4 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            r9 = r4
            r4 = r1
            r1 = r2
            r2 = r0
            r0 = r3
            goto L_0x00f3
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00d8
        L_0x006e:
            long r1 = r10.w
            android.net.Uri r3 = r10.c
            ds5 r4 = r10.b
            by7 r5 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            r9 = r5
            r16 = r4
            r4 = r0
            r0 = r16
            r17 = r1
            r1 = r3
            r2 = r17
            goto L_0x00bd
        L_0x0085:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Lazy r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r14 = r0.b()
            mx7 r15 = new mx7
            r8 = 0
            r0 = r15
            r1 = r24
            r3 = r19
            r4 = r26
            r6 = r22
            r0.<init>(r1, r3, r4, r6, r8)
            r10.a = r9
            r0 = r20
            r10.b = r0
            r1 = r21
            r10.c = r1
            r2 = r22
            r10.w = r2
            r4 = 1
            r10.z = r4
            java.lang.Object r4 = defpackage.ev0.I(r14, r15, r10)
            if (r4 != r11) goto L_0x00bd
            return r11
        L_0x00bd:
            ha9 r4 = (defpackage.ha9) r4
            if (r4 != 0) goto L_0x00db
            java.lang.String r1 = r9.r
            java.lang.String r2 = "message not found!"
            defpackage.z68.f(r1, r2, r13)
            r10.a = r13
            r10.b = r13
            r10.c = r13
            r1 = 2
            r10.z = r1
            java.lang.Object r0 = r0.a(r12, r10)
            if (r0 != r11) goto L_0x00d8
            return r11
        L_0x00d8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00db:
            qx2 r5 = r9.c()
            r10.a = r9
            r10.b = r0
            r10.c = r1
            r10.o = r4
            r6 = 3
            r10.z = r6
            my2 r5 = (defpackage.my2) r5
            java.lang.Object r2 = r5.l(r2, r10)
            if (r2 != r11) goto L_0x00f3
            return r11
        L_0x00f3:
            a32 r2 = (defpackage.a32) r2
            if (r2 != 0) goto L_0x0113
            java.lang.String r1 = r9.r
            java.lang.String r2 = "chat not found"
            defpackage.z68.f(r1, r2, r13)
            r10.a = r13
            r10.b = r13
            r10.c = r13
            r10.o = r13
            r1 = 4
            r10.z = r1
            java.lang.Object r0 = r0.a(r12, r10)
            if (r0 != r11) goto L_0x0110
            return r11
        L_0x0110:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0113:
            m72 r3 = r2.b
            g72 r3 = r3.n
            bl4 r5 = r4.S0
            java.util.ArrayList r3 = r3.d(r5)
            long r5 = r4.o
            kotlin.Pair r3 = defpackage.hd8.r(r5, r3)
            java.lang.Object r3 = r3.getSecond()
            f72 r3 = (defpackage.f72) r3
            if (r3 == 0) goto L_0x0150
            r10.a = r13
            r10.b = r13
            r10.c = r13
            r10.o = r13
            r3 = 5
            r10.z = r3
            long r2 = r2.a
            long r4 = r4.o
            r19 = r9
            r20 = r0
            r21 = r1
            r22 = r2
            r24 = r4
            r26 = r10
            java.lang.Object r0 = r19.k(r20, r21, r22, r24, r26)
            if (r0 != r11) goto L_0x014d
            return r11
        L_0x014d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0150:
            bx7 r3 = defpackage.bx7.a
            r10.a = r9
            r10.b = r0
            r10.c = r1
            r10.o = r4
            r10.v = r2
            r5 = 6
            r10.z = r5
            java.lang.Object r3 = r0.a(r3, r10)
            if (r3 != r11) goto L_0x0166
            return r11
        L_0x0166:
            long r5 = r4.o
            r10.a = r13
            r10.b = r13
            r10.c = r13
            r10.o = r13
            r10.v = r13
            r3 = 7
            r10.z = r3
            bl4 r3 = r4.S0
            r19 = r9
            r20 = r0
            r21 = r1
            r22 = r2
            r23 = r5
            r25 = r3
            r26 = r10
            java.lang.Object r0 = r19.f(r20, r21, r22, r23, r25, r26)
            if (r0 != r11) goto L_0x018c
            return r11
        L_0x018c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.b(ds5, android.net.Uri, long, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final qx2 c() {
        return (qx2) this.f.getValue();
    }

    public final String d(Uri uri) {
        vj5 vj5 = (vj5) ((uj5) this.l.getValue());
        vj5.getClass();
        if (!vj5.m(PmsKey.f35esiaenabled, false) || uri == null) {
            return null;
        }
        ((fz7) this.d.getValue()).getClass();
        String queryParameter = uri.getQueryParameter("externalCallback");
        if (queryParameter != null && queryParameter.equals("1")) {
            return uri.toString();
        }
        return null;
    }

    public final wb e(Uri uri) {
        return new wb(15, new sbd(new nx7(this, uri, (Continuation) null)), new uu5((Object) this, (Continuation) null, 5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.ds5 r21, android.net.Uri r22, defpackage.a32 r23, long r24, defpackage.bl4 r26, kotlin.coroutines.Continuation r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r27
            boolean r3 = r2 instanceof defpackage.px7
            if (r3 == 0) goto L_0x0019
            r3 = r2
            px7 r3 = (defpackage.px7) r3
            int r4 = r3.y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.y = r4
            goto L_0x001e
        L_0x0019:
            px7 r3 = new px7
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.w
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.y
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x004b
            if (r5 == r7) goto L_0x003b
            if (r5 != r6) goto L_0x0033
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00b8
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            long r0 = r3.v
            a32 r5 = r3.o
            android.net.Uri r7 = r3.c
            ds5 r8 = r3.b
            by7 r9 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r10 = r0
            r1 = r5
            goto L_0x0098
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Lazy r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            r8 = r2
            qa2 r8 = (defpackage.qa2) r8
            long r9 = r1.a
            m72 r2 = r1.b
            long r11 = r2.a
            long r15 = r23.j(r24, r26)
            r17 = 0
            r13 = r24
            r19 = r26
            long r8 = defpackage.qa2.b(r8, r9, r11, r13, r15, r17, r19)
            kotlin.Lazy r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            pa2 r2 = (defpackage.pa2) r2
            n6e r2 = r2.a
            wn3 r5 = new wn3
            r10 = 1
            r5.<init>(r2, r8, r10)
            r3.a = r0
            r2 = r21
            r3.b = r2
            r8 = r22
            r3.c = r8
            r3.o = r1
            r9 = r24
            r3.v = r9
            r3.y = r7
            java.lang.Object r5 = defpackage.bs0.z(r5, r3)
            if (r5 != r4) goto L_0x0094
            return r4
        L_0x0094:
            r7 = r8
            r10 = r9
            r9 = r0
            r8 = r2
        L_0x0098:
            long r0 = r1.a
            r2 = 0
            r3.a = r2
            r3.b = r2
            r3.c = r2
            r3.o = r2
            r3.y = r6
            r20 = r9
            r21 = r8
            r22 = r7
            r23 = r0
            r25 = r10
            r27 = r3
            java.lang.Object r0 = r20.k(r21, r22, r23, r25, r27)
            if (r0 != r4) goto L_0x00b8
            return r4
        L_0x00b8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.f(ds5, android.net.Uri, a32, long, bl4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.ds5 r10, defpackage.cz7 r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.qx7
            if (r0 == 0) goto L_0x0013
            r0 = r12
            qx7 r0 = (defpackage.qx7) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qx7 r0 = new qx7
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 3
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003c
            if (r2 == r3) goto L_0x0038
            if (r2 != r6) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0089
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0079
        L_0x003c:
            ds5 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0063
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r11 = r11.v
            kotlin.time.Duration$Companion r12 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r12 = kotlin.time.DurationUnit.SECONDS
            long r7 = kotlin.time.DurationKt.toDuration((int) r6, (kotlin.time.DurationUnit) r12)
            ux7 r12 = new ux7
            r12.<init>(r9, r11, r5)
            r0.a = r10
            r0.o = r4
            long r7 = defpackage.xk4.e(r7)
            java.lang.Object r12 = defpackage.okf.c(r7, r12, r0)
            if (r12 != r1) goto L_0x0063
            return r1
        L_0x0063:
            zx5 r12 = (defpackage.zx5) r12
            if (r12 == 0) goto L_0x007c
            zw7 r9 = new zw7
            java.lang.String r11 = r12.a
            r9.<init>(r11)
            r0.a = r5
            r0.o = r3
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x007c:
            jx7 r9 = defpackage.jx7.a
            r0.a = r5
            r0.o = r6
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L_0x0089
            return r1
        L_0x0089:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.g(ds5, cz7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri h(Uri uri) {
        String scheme = uri.getScheme();
        Lazy lazy = this.d;
        return StringsKt__StringsJVMKt.equals$default(scheme, ((fz7) lazy.getValue()).b, false, 2, (Object) null) ? uri.buildUpon().scheme(((fz7) lazy.getValue()).a).build() : uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023d, code lost:
        r1 = r6.longValue();
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 8;
        r4.getClass();
        r0 = r0.a(new defpackage.hx7(r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025e, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0261, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0263, code lost:
        if (r0 != r14) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0265, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0268, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0269, code lost:
        if (r5 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
        if (r5.length() != 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0280, code lost:
        if (((defpackage.vj5) ((defpackage.uj5) r4.l.getValue())).o() == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0282, code lost:
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 9;
        r0 = r0.a(new defpackage.gx7(r5), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x029c, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029f, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a1, code lost:
        if (r0 != r14) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a3, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a6, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a7, code lost:
        if (r8 == null) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02af, code lost:
        if (r8.longValue() == 0) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b1, code lost:
        if (r15 == null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b9, code lost:
        if (r15.longValue() <= 0) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        r1 = r8.longValue();
        r9 = r15.longValue();
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (r4.b(r0, r7, r1, r9, 0, r3) != r14) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dc, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02df, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02e0, code lost:
        r1 = r8.longValue();
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02fb, code lost:
        if (r4.k(r0, r7, r1, 0, r3) != r14) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02fd, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0300, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0301, code lost:
        defpackage.z68.f(r4.r, "link info failed", (java.lang.Throwable) null);
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0319, code lost:
        if (r0.a(r9, r3) != r14) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x031b, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x031e, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0321, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        r2 = r0.h(r7);
        r7 = ((defpackage.jna) ((defpackage.rl) r0.j.getValue())).F(kotlin.text.StringsKt.trim((java.lang.CharSequence) r2.toString()).toString(), false);
        r9 = kotlin.time.Duration.Companion;
        r11 = kotlin.time.DurationKt.toDuration(2, kotlin.time.DurationUnit.SECONDS);
        r9 = new defpackage.yx7(r0, r7, (kotlin.coroutines.Continuation) null);
        r3.a = r0;
        r3.b = r1;
        r3.c = r4;
        r3.o = r2;
        r3.x = 2;
        r7 = defpackage.okf.c(defpackage.xk4.e(r11), r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e9, code lost:
        if (r7 != r14) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00eb, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ec, code lost:
        r17 = r7;
        r7 = r0;
        r0 = r2;
        r2 = r17;
        r18 = r4;
        r4 = r1;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r2 = (defpackage.jw7) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        if (r2 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        r2 = new defpackage.yw7(r0);
        r3.a = r7;
        r3.b = r4;
        r3.c = r1;
        r3.o = r0;
        r3.x = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010f, code lost:
        if (r4.a(r2, r3) != r14) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0111, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0114, code lost:
        r17 = r7;
        r7 = r0;
        r0 = r4;
        r4 = r17;
        r8 = r2 instanceof defpackage.hw7;
        r9 = defpackage.uw7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011e, code lost:
        if (r8 == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0120, code lost:
        r4 = r4.r;
        r6 = defpackage.z68.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        if (r6 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        if (r6.c() == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012d, code lost:
        r6.d(defpackage.w78.x, r4, defpackage.a81.m("link info error: ", ((defpackage.hw7) r2).b), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013e, code lost:
        if ((r1 instanceof defpackage.bz7) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0142, code lost:
        if ((r1 instanceof defpackage.xy7) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        if ((r1 instanceof defpackage.zy7) == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        r1 = new defpackage.yw7(r7);
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        if (r0.a(r1, r3) != r14) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015f, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0162, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0163, code lost:
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0172, code lost:
        if (r0.a(r9, r3) != r14) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0174, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0177, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017a, code lost:
        if ((r2 instanceof defpackage.iw7) == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017c, code lost:
        r2 = (defpackage.iw7) r2;
        r8 = r2.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0182, code lost:
        if (r8 == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0184, code lost:
        r8 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0186, code lost:
        if (r8 == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0188, code lost:
        r12 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018b, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018c, code lost:
        r8 = r2.b;
        r15 = r2.c;
        r6 = r2.g;
        r5 = r2.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0194, code lost:
        if (r5 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0196, code lost:
        r5 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019c, code lost:
        if (r12 <= 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        if ((r1 instanceof defpackage.zy7) == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        r1 = ((defpackage.zy7) r1).w;
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 6;
        r2 = ((defpackage.km3) r4.a.getValue()).p(r12, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cf, code lost:
        if (r12 != ((defpackage.qjd) ((defpackage.x23) r4.k.getValue())).s()) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d1, code lost:
        r0 = r0.a(defpackage.ww7.a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01db, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e1, code lost:
        if (r2 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ef, code lost:
        if (r2.a.c.n.contains(defpackage.rm3.o) == false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f1, code lost:
        r0 = r0.a(new defpackage.ax7(r12, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fe, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0201, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        r0 = r0.a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020c, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020f, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        if (r0 != r14) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0216, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0217, code lost:
        r9 = r2.h;
        r3.a = null;
        r3.b = null;
        r3.c = null;
        r3.o = null;
        r3.x = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022d, code lost:
        if (r4.j(r0, r7, r12, r9, r3) != r14) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022f, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0232, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0233, code lost:
        if (r6 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023b, code lost:
        if (r6.longValue() <= 0) goto L_0x0269;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.ds5 r20, defpackage.dz7 r21, android.net.Uri r22, kotlin.coroutines.Continuation r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r23
            boolean r3 = r2 instanceof defpackage.wx7
            if (r3 == 0) goto L_0x0019
            r3 = r2
            wx7 r3 = (defpackage.wx7) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.x = r4
            goto L_0x001e
        L_0x0019:
            wx7 r3 = new wx7
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.v
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.x
            r5 = 0
            r6 = 0
            switch(r4) {
                case 0: goto L_0x0090;
                case 1: goto L_0x007a;
                case 2: goto L_0x006d;
                case 3: goto L_0x0060;
                case 4: goto L_0x005b;
                case 5: goto L_0x0056;
                case 6: goto L_0x0051;
                case 7: goto L_0x004c;
                case 8: goto L_0x0047;
                case 9: goto L_0x0042;
                case 10: goto L_0x003d;
                case 11: goto L_0x0038;
                case 12: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x031c
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02fe
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02dd
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02a4
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0266
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0230
        L_0x0051:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0214
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0160
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0175
        L_0x0060:
            android.net.Uri r0 = r3.o
            dz7 r1 = r3.c
            ds5 r4 = r3.b
            by7 r7 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0112
        L_0x006d:
            android.net.Uri r0 = r3.o
            dz7 r1 = r3.c
            ds5 r4 = r3.b
            by7 r7 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00f7
        L_0x007a:
            android.net.Uri r0 = r3.o
            dz7 r1 = r3.c
            ds5 r4 = r3.b
            by7 r7 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r17 = r7
            r7 = r0
            r0 = r17
            r18 = r4
            r4 = r1
            r1 = r18
            goto L_0x00ab
        L_0x0090:
            kotlin.ResultKt.throwOnFailure(r2)
            bx7 r2 = defpackage.bx7.a
            r3.a = r0
            r3.b = r1
            r4 = r21
            r3.c = r4
            r7 = r22
            r3.o = r7
            r8 = 1
            r3.x = r8
            java.lang.Object r2 = r1.a(r2, r3)
            if (r2 != r14) goto L_0x00ab
            return r14
        L_0x00ab:
            android.net.Uri r2 = r0.h(r7)
            kotlin.Lazy r7 = r0.j
            java.lang.Object r7 = r7.getValue()
            rl r7 = (defpackage.rl) r7
            java.lang.String r8 = r2.toString()
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            java.lang.String r8 = r8.toString()
            jna r7 = (defpackage.jna) r7
            long r7 = r7.F(r8, r6)
            kotlin.time.Duration$Companion r9 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r9 = kotlin.time.DurationUnit.SECONDS
            r10 = 2
            long r11 = kotlin.time.DurationKt.toDuration((int) r10, (kotlin.time.DurationUnit) r9)
            yx7 r9 = new yx7
            r9.<init>(r0, r7, r5)
            r3.a = r0
            r3.b = r1
            r3.c = r4
            r3.o = r2
            r3.x = r10
            long r7 = defpackage.xk4.e(r11)
            java.lang.Object r7 = defpackage.okf.c(r7, r9, r3)
            if (r7 != r14) goto L_0x00ec
            return r14
        L_0x00ec:
            r17 = r7
            r7 = r0
            r0 = r2
            r2 = r17
            r18 = r4
            r4 = r1
            r1 = r18
        L_0x00f7:
            jw7 r2 = (defpackage.jw7) r2
            if (r2 != 0) goto L_0x0114
            yw7 r2 = new yw7
            r2.<init>(r0)
            r3.a = r7
            r3.b = r4
            r3.c = r1
            r3.o = r0
            r8 = 3
            r3.x = r8
            java.lang.Object r2 = r4.a(r2, r3)
            if (r2 != r14) goto L_0x0112
            return r14
        L_0x0112:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x0114:
            r17 = r7
            r7 = r0
            r0 = r4
            r4 = r17
            boolean r8 = r2 instanceof defpackage.hw7
            uw7 r9 = defpackage.uw7.a
            if (r8 == 0) goto L_0x0178
            java.lang.String r4 = r4.r
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x0127
            goto L_0x013c
        L_0x0127:
            boolean r8 = r6.c()
            if (r8 == 0) goto L_0x013c
            w78 r8 = defpackage.w78.x
            hw7 r2 = (defpackage.hw7) r2
            java.lang.String r2 = r2.b
            java.lang.String r10 = "link info error: "
            java.lang.String r2 = defpackage.a81.m(r10, r2)
            r6.d(r8, r4, r2, r5)
        L_0x013c:
            boolean r2 = r1 instanceof defpackage.bz7
            if (r2 != 0) goto L_0x0163
            boolean r2 = r1 instanceof defpackage.xy7
            if (r2 != 0) goto L_0x0163
            boolean r1 = r1 instanceof defpackage.zy7
            if (r1 == 0) goto L_0x0149
            goto L_0x0163
        L_0x0149:
            yw7 r1 = new yw7
            r1.<init>(r7)
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r2 = 5
            r3.x = r2
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r14) goto L_0x0160
            return r14
        L_0x0160:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0163:
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r1 = 4
            r3.x = r1
            java.lang.Object r0 = r0.a(r9, r3)
            if (r0 != r14) goto L_0x0175
            return r14
        L_0x0175:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0178:
            boolean r8 = r2 instanceof defpackage.iw7
            if (r8 == 0) goto L_0x031f
            iw7 r2 = (defpackage.iw7) r2
            cs3 r8 = r2.d
            r10 = 0
            if (r8 == 0) goto L_0x018b
            fo3 r8 = r8.a
            if (r8 == 0) goto L_0x018b
            long r12 = r8.a
            goto L_0x018c
        L_0x018b:
            r12 = r10
        L_0x018c:
            java.lang.Long r8 = r2.b
            java.lang.Long r15 = r2.c
            java.lang.Long r6 = r2.g
            d4g r5 = r2.f
            if (r5 == 0) goto L_0x0199
            java.lang.String r5 = r5.b
            goto L_0x019a
        L_0x0199:
            r5 = 0
        L_0x019a:
            int r16 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x0233
            boolean r5 = r1 instanceof defpackage.zy7
            if (r5 == 0) goto L_0x0217
            zy7 r1 = (defpackage.zy7) r1
            java.lang.String r1 = r1.w
            r2 = 0
            r3.a = r2
            r3.b = r2
            r3.c = r2
            r3.o = r2
            r2 = 6
            r3.x = r2
            kotlin.Lazy r2 = r4.a
            java.lang.Object r2 = r2.getValue()
            km3 r2 = (defpackage.km3) r2
            r5 = 0
            vk3 r2 = r2.p(r12, r5)
            kotlin.Lazy r4 = r4.k
            java.lang.Object r4 = r4.getValue()
            x23 r4 = (defpackage.x23) r4
            qjd r4 = (defpackage.qjd) r4
            long r4 = r4.s()
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x01e1
            ww7 r1 = defpackage.ww7.a
            java.lang.Object r0 = r0.a(r1, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x01de
            goto L_0x0211
        L_0x01de:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0211
        L_0x01e1:
            if (r2 == 0) goto L_0x0204
            vm3 r2 = r2.a
            um3 r2 = r2.c
            java.util.List r2 = r2.n
            rm3 r4 = defpackage.rm3.o
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0204
            ax7 r2 = new ax7
            r2.<init>(r12, r1)
            java.lang.Object r0 = r0.a(r2, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0201
            goto L_0x0211
        L_0x0201:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0211
        L_0x0204:
            java.lang.Object r0 = r0.a(r9, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0211:
            if (r0 != r14) goto L_0x0214
            return r14
        L_0x0214:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0217:
            java.lang.String r9 = r2.h
            r1 = 0
            r3.a = r1
            r3.b = r1
            r3.c = r1
            r3.o = r1
            r1 = 7
            r3.x = r1
            r5 = r0
            r6 = r7
            r7 = r12
            r10 = r3
            java.lang.Object r0 = r4.j(r5, r6, r7, r9, r10)
            if (r0 != r14) goto L_0x0230
            return r14
        L_0x0230:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0233:
            if (r6 == 0) goto L_0x0269
            long r1 = r6.longValue()
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0269
            long r1 = r6.longValue()
            r5 = 0
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r5 = 8
            r3.x = r5
            r4.getClass()
            hx7 r4 = new hx7
            r4.<init>(r1)
            java.lang.Object r0 = r0.a(r4, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0261
            goto L_0x0263
        L_0x0261:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0263:
            if (r0 != r14) goto L_0x0266
            return r14
        L_0x0266:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0269:
            if (r5 == 0) goto L_0x02a7
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0272
            goto L_0x02a7
        L_0x0272:
            kotlin.Lazy r1 = r4.l
            java.lang.Object r1 = r1.getValue()
            uj5 r1 = (defpackage.uj5) r1
            vj5 r1 = (defpackage.vj5) r1
            boolean r1 = r1.o()
            if (r1 == 0) goto L_0x02a7
            r1 = 0
            r3.a = r1
            r3.b = r1
            r3.c = r1
            r3.o = r1
            r1 = 9
            r3.x = r1
            gx7 r1 = new gx7
            r1.<init>(r5)
            java.lang.Object r0 = r0.a(r1, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02a1:
            if (r0 != r14) goto L_0x02a4
            return r14
        L_0x02a4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02a7:
            if (r8 == 0) goto L_0x0301
            long r1 = r8.longValue()
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x0301
            if (r15 == 0) goto L_0x02e0
            long r1 = r15.longValue()
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e0
            long r1 = r8.longValue()
            long r9 = r15.longValue()
            r5 = 0
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r5 = 10
            r3.x = r5
            r11 = 0
            r5 = r0
            r6 = r7
            r7 = r1
            r13 = r3
            java.lang.Object r0 = r4.b(r5, r6, r7, r9, r11, r13)
            if (r0 != r14) goto L_0x02dd
            return r14
        L_0x02dd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02e0:
            long r1 = r8.longValue()
            r5 = 0
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r5 = 11
            r3.x = r5
            r9 = 0
            r5 = r0
            r6 = r7
            r7 = r1
            r11 = r3
            java.lang.Object r0 = r4.k(r5, r6, r7, r9, r11)
            if (r0 != r14) goto L_0x02fe
            return r14
        L_0x02fe:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0301:
            java.lang.String r1 = r4.r
            java.lang.String r2 = "link info failed"
            r4 = 0
            defpackage.z68.f(r1, r2, r4)
            r3.a = r4
            r3.b = r4
            r3.c = r4
            r3.o = r4
            r1 = 12
            r3.x = r1
            java.lang.Object r0 = r0.a(r9, r3)
            if (r0 != r14) goto L_0x031c
            return r14
        L_0x031c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x031f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.i(ds5, dz7, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        r3 = (defpackage.vk3) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        if (r0 != ((defpackage.qjd) ((defpackage.x23) r10.k.getValue())).s()) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r0 = defpackage.ww7.a;
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        if (r9.a(r0, r4) != r5) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r11 = defpackage.fx7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e2, code lost:
        if (r3 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        if (r9.a(r11, r4) != r5) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        if (r3.n() != 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        if (r3.B() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r3.x() == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        r3 = r10.c();
        r4.a = r10;
        r4.b = r9;
        r4.c = r6;
        r4.o = r2;
        r4.v = r0;
        r4.y = 5;
        r3 = ((defpackage.my2) r3).u(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0124, code lost:
        if (r3 != r5) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0126, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        r3 = (defpackage.a32) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r3 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        r0 = new defpackage.ex7(r3.a, r2, r10.d(r6));
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0145, code lost:
        if (r9.a(r0, r4) != r5) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0147, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014b, code lost:
        defpackage.z68.f(r10.r, "could not create dialog", (java.lang.Throwable) null);
        r2 = new defpackage.dx7(r0, r10.d(r6));
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (r9.a(r2, r4) != r5) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        if (r2 == null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
        if (r2.length() != 0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0177, code lost:
        r3 = r10.c();
        r4.a = r10;
        r4.b = r9;
        r4.c = r6;
        r4.o = r2;
        r4.y = 8;
        r3 = ((defpackage.my2) r3).u(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018d, code lost:
        if (r3 != r5) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0190, code lost:
        r0 = r2;
        r1 = r6;
        r2 = r9;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0194, code lost:
        r3 = (defpackage.a32) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0196, code lost:
        if (r3 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0198, code lost:
        r8 = new defpackage.ex7(r3.a, r0, r6.d(r1));
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b3, code lost:
        if (r2.a(r8, r4) != r5) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b8, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b9, code lost:
        defpackage.z68.f(r6.r, "could not create dialog", (java.lang.Throwable) null);
        r0 = defpackage.uw7.a;
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (r2.a(r0, r4) != r5) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d2, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d5, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d6, code lost:
        r2 = ((defpackage.my2) r10.c()).q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e0, code lost:
        if (r2 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e2, code lost:
        r0 = new defpackage.ex7(r2.a, (java.lang.String) null, r10.d(r6));
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fd, code lost:
        if (r9.a(r0, r4) != r5) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0202, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        r2 = new defpackage.dx7(r0, r10.d(r6));
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021c, code lost:
        if (r9.a(r2, r4) != r5) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0221, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0222, code lost:
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.y = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
        if (r9.a(r11, r4) != r5) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0233, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0236, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(defpackage.ds5 r16, android.net.Uri r17, long r18, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            r3 = r21
            boolean r4 = r3 instanceof defpackage.zx7
            if (r4 == 0) goto L_0x0018
            r4 = r3
            zx7 r4 = (defpackage.zx7) r4
            int r5 = r4.y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0018
            int r5 = r5 - r6
            r4.y = r5
            goto L_0x001d
        L_0x0018:
            zx7 r4 = new zx7
            r4.<init>(r15, r3)
        L_0x001d:
            java.lang.Object r3 = r4.w
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.y
            r7 = 0
            java.lang.String r8 = "could not create dialog"
            switch(r6) {
                case 0: goto L_0x0089;
                case 1: goto L_0x007b;
                case 2: goto L_0x0077;
                case 3: goto L_0x0072;
                case 4: goto L_0x006d;
                case 5: goto L_0x005e;
                case 6: goto L_0x0059;
                case 7: goto L_0x0054;
                case 8: goto L_0x0047;
                case 9: goto L_0x0042;
                case 10: goto L_0x003d;
                case 11: goto L_0x0038;
                case 12: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x021f
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0200
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x01d3
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x01b6
        L_0x0047:
            java.lang.String r0 = r4.o
            android.net.Uri r1 = r4.c
            ds5 r2 = r4.b
            by7 r6 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0194
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x016b
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0148
        L_0x005e:
            long r0 = r4.v
            java.lang.String r2 = r4.o
            android.net.Uri r6 = r4.c
            ds5 r9 = r4.b
            by7 r10 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0127
        L_0x006d:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0234
        L_0x0072:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00f6
        L_0x0077:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00dd
        L_0x007b:
            long r0 = r4.v
            java.lang.String r2 = r4.o
            android.net.Uri r6 = r4.c
            ds5 r9 = r4.b
            by7 r10 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00b5
        L_0x0089:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.Lazy r3 = r0.o
            java.lang.Object r3 = r3.getValue()
            gq6 r3 = (defpackage.gq6) r3
            r4.a = r0
            r6 = r16
            r4.b = r6
            r9 = r17
            r4.c = r9
            r10 = r20
            r4.o = r10
            r4.v = r1
            r11 = 1
            r4.y = r11
            java.lang.Object r3 = defpackage.gq6.a(r3, r1, r4)
            if (r3 != r5) goto L_0x00ae
            return r5
        L_0x00ae:
            r13 = r10
            r10 = r0
            r0 = r1
            r2 = r13
            r14 = r9
            r9 = r6
            r6 = r14
        L_0x00b5:
            vk3 r3 = (defpackage.vk3) r3
            kotlin.Lazy r11 = r10.k
            java.lang.Object r11 = r11.getValue()
            x23 r11 = (defpackage.x23) r11
            qjd r11 = (defpackage.qjd) r11
            long r11 = r11.s()
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00e0
            ww7 r0 = defpackage.ww7.a
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r1 = 2
            r4.y = r1
            java.lang.Object r0 = r9.a(r0, r4)
            if (r0 != r5) goto L_0x00dd
            return r5
        L_0x00dd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00e0:
            fx7 r11 = defpackage.fx7.a
            if (r3 != 0) goto L_0x00f9
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r0 = 3
            r4.y = r0
            java.lang.Object r0 = r9.a(r11, r4)
            if (r0 != r5) goto L_0x00f6
            return r5
        L_0x00f6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f9:
            int r12 = r3.n()
            if (r12 != 0) goto L_0x0222
            boolean r12 = r3.B()
            if (r12 == 0) goto L_0x0107
            goto L_0x0222
        L_0x0107:
            boolean r3 = r3.x()
            if (r3 == 0) goto L_0x016e
            qx2 r3 = r10.c()
            r4.a = r10
            r4.b = r9
            r4.c = r6
            r4.o = r2
            r4.v = r0
            r11 = 5
            r4.y = r11
            my2 r3 = (defpackage.my2) r3
            java.lang.Object r3 = r3.u(r0, r4)
            if (r3 != r5) goto L_0x0127
            return r5
        L_0x0127:
            a32 r3 = (defpackage.a32) r3
            if (r3 == 0) goto L_0x014b
            ex7 r0 = new ex7
            long r11 = r3.a
            java.lang.String r1 = r10.d(r6)
            r0.<init>(r11, r2, r1)
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r1 = 6
            r4.y = r1
            java.lang.Object r0 = r9.a(r0, r4)
            if (r0 != r5) goto L_0x0148
            return r5
        L_0x0148:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014b:
            java.lang.String r2 = r10.r
            defpackage.z68.f(r2, r8, r7)
            dx7 r2 = new dx7
            java.lang.String r3 = r10.d(r6)
            r2.<init>(r0, r3)
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r0 = 7
            r4.y = r0
            java.lang.Object r0 = r9.a(r2, r4)
            if (r0 != r5) goto L_0x016b
            return r5
        L_0x016b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x016e:
            if (r2 == 0) goto L_0x01d6
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0177
            goto L_0x01d6
        L_0x0177:
            qx2 r3 = r10.c()
            r4.a = r10
            r4.b = r9
            r4.c = r6
            r4.o = r2
            r11 = 8
            r4.y = r11
            my2 r3 = (defpackage.my2) r3
            java.lang.Object r3 = r3.u(r0, r4)
            if (r3 != r5) goto L_0x0190
            return r5
        L_0x0190:
            r0 = r2
            r1 = r6
            r2 = r9
            r6 = r10
        L_0x0194:
            a32 r3 = (defpackage.a32) r3
            if (r3 == 0) goto L_0x01b9
            ex7 r8 = new ex7
            long r9 = r3.a
            java.lang.String r1 = r6.d(r1)
            r8.<init>(r9, r0, r1)
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r0 = 9
            r4.y = r0
            java.lang.Object r0 = r2.a(r8, r4)
            if (r0 != r5) goto L_0x01b6
            return r5
        L_0x01b6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01b9:
            java.lang.String r0 = r6.r
            defpackage.z68.f(r0, r8, r7)
            uw7 r0 = defpackage.uw7.a
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r1 = 10
            r4.y = r1
            java.lang.Object r0 = r2.a(r0, r4)
            if (r0 != r5) goto L_0x01d3
            return r5
        L_0x01d3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01d6:
            qx2 r2 = r10.c()
            my2 r2 = (defpackage.my2) r2
            a32 r2 = r2.q(r0)
            if (r2 == 0) goto L_0x0203
            ex7 r0 = new ex7
            long r1 = r2.a
            java.lang.String r3 = r10.d(r6)
            r0.<init>(r1, r7, r3)
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r1 = 11
            r4.y = r1
            java.lang.Object r0 = r9.a(r0, r4)
            if (r0 != r5) goto L_0x0200
            return r5
        L_0x0200:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0203:
            dx7 r2 = new dx7
            java.lang.String r3 = r10.d(r6)
            r2.<init>(r0, r3)
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r0 = 12
            r4.y = r0
            java.lang.Object r0 = r9.a(r2, r4)
            if (r0 != r5) goto L_0x021f
            return r5
        L_0x021f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0222:
            r4.a = r7
            r4.b = r7
            r4.c = r7
            r4.o = r7
            r0 = 4
            r4.y = r0
            java.lang.Object r0 = r9.a(r11, r4)
            if (r0 != r5) goto L_0x0234
            return r5
        L_0x0234:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.j(ds5, android.net.Uri, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.ds5 r20, android.net.Uri r21, long r22, long r24, kotlin.coroutines.Continuation r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r3 = r26
            boolean r4 = r3 instanceof defpackage.ay7
            if (r4 == 0) goto L_0x0019
            r4 = r3
            ay7 r4 = (defpackage.ay7) r4
            int r5 = r4.y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.y = r5
            goto L_0x001e
        L_0x0019:
            ay7 r4 = new ay7
            r4.<init>(r0, r3)
        L_0x001e:
            java.lang.Object r3 = r4.w
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.y
            r7 = 5
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 4
            if (r6 == 0) goto L_0x0066
            if (r6 == r10) goto L_0x0052
            if (r6 == r9) goto L_0x004e
            if (r6 == r8) goto L_0x0049
            if (r6 == r11) goto L_0x0044
            if (r6 != r7) goto L_0x003c
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0102
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x018f
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0167
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00a6
        L_0x0052:
            long r0 = r4.v
            long r12 = r4.o
            android.net.Uri r2 = r4.c
            ds5 r6 = r4.b
            by7 r10 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r12
            r12 = r2
            r13 = r0
            r1 = r17
            goto L_0x0089
        L_0x0066:
            kotlin.ResultKt.throwOnFailure(r3)
            qx2 r3 = r19.c()
            r4.a = r0
            r6 = r20
            r4.b = r6
            r12 = r21
            r4.c = r12
            r4.o = r1
            r13 = r24
            r4.v = r13
            r4.y = r10
            my2 r3 = (defpackage.my2) r3
            java.lang.Object r3 = r3.l(r1, r4)
            if (r3 != r5) goto L_0x0088
            return r5
        L_0x0088:
            r10 = r0
        L_0x0089:
            a32 r3 = (defpackage.a32) r3
            r0 = 0
            if (r3 != 0) goto L_0x00a9
            java.lang.String r1 = r10.r
            java.lang.String r2 = "chat not found"
            defpackage.z68.f(r1, r2, r0)
            uw7 r1 = defpackage.uw7.a
            r4.a = r0
            r4.b = r0
            r4.c = r0
            r4.y = r9
            java.lang.Object r0 = r6.a(r1, r4)
            if (r0 != r5) goto L_0x00a6
            return r5
        L_0x00a6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a9:
            boolean r9 = r3.b0()
            if (r9 != 0) goto L_0x0108
            boolean r9 = r3.d0()
            if (r9 == 0) goto L_0x00bc
            boolean r9 = r3.E()
            if (r9 == 0) goto L_0x00bc
            goto L_0x0108
        L_0x00bc:
            boolean r1 = r3.a0()
            if (r1 == 0) goto L_0x0105
            android.net.Uri r1 = r10.h(r12)
            r4.a = r0
            r4.b = r0
            r4.c = r0
            r4.y = r7
            java.lang.String r0 = r10.r
            java.lang.String r2 = "showPrivateChannelConfirm"
            defpackage.z68.c(r0, r2, new java.lang.Object[0])
            tw7 r0 = new tw7
            long r7 = r3.a
            java.lang.String r2 = r3.r()
            boolean r3 = r3.K()
            java.lang.String r1 = r1.toString()
            r19 = r0
            r20 = r7
            r22 = r2
            r23 = r1
            r24 = r3
            r19.<init>(r20, r22, r23, r24)
            java.lang.Object r0 = r6.a(r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x00ff:
            if (r0 != r5) goto L_0x0102
            return r5
        L_0x0102:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0105:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0108:
            r15 = 0
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x016a
            java.lang.String r7 = r10.r
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x0115
            goto L_0x0143
        L_0x0115:
            boolean r11 = r9.c()
            if (r11 == 0) goto L_0x0143
            w78 r11 = defpackage.w78.o
            kotlin.time.Duration$Companion r15 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r15 = kotlin.time.DurationUnit.MILLISECONDS
            long r15 = kotlin.time.DurationKt.toDuration((long) r13, (kotlin.time.DurationUnit) r15)
            java.lang.String r15 = kotlin.time.Duration.m1402toStringimpl(r15)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "showData: chatId="
            r8.<init>(r0)
            r8.append(r1)
            java.lang.String r0 = ", messageTime="
            r8.append(r0)
            r8.append(r15)
            java.lang.String r0 = r8.toString()
            r1 = 0
            r9.d(r11, r7, r0, r1)
        L_0x0143:
            cx7 r0 = new cx7
            long r1 = r3.a
            java.lang.String r3 = r10.d(r12)
            r19 = r0
            r20 = r1
            r22 = r3
            r23 = r13
            r19.<init>(r20, r22, r23)
            r1 = 0
            r4.a = r1
            r4.b = r1
            r4.c = r1
            r1 = 3
            r4.y = r1
            java.lang.Object r0 = r6.a(r0, r4)
            if (r0 != r5) goto L_0x0167
            return r5
        L_0x0167:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x016a:
            cx7 r0 = new cx7
            long r1 = r3.a
            java.lang.String r3 = r10.d(r12)
            r7 = 0
            r19 = r0
            r20 = r1
            r22 = r3
            r23 = r7
            r19.<init>(r20, r22, r23)
            r1 = 0
            r4.a = r1
            r4.b = r1
            r4.c = r1
            r4.y = r11
            java.lang.Object r0 = r6.a(r0, r4)
            if (r0 != r5) goto L_0x018f
            return r5
        L_0x018f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by7.k(ds5, android.net.Uri, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
