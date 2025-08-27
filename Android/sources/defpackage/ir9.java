package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.tamtam.logout.a;

/* renamed from: ir9  reason: default package */
public final class ir9 implements xt2 {
    public final uua a;
    public final int b = 10;
    public final Lazy c;
    public final q04 d;
    public final q04 e;
    public final jx3 f;
    public final Lazy g;
    public pm7 h;

    public ir9(uua uua, gaf gaf, a aVar, Lazy lazy, Lazy lazy2) {
        this.a = uua;
        this.c = lazy;
        osa osa = (osa) gaf;
        q04 s0 = osa.b().s0(1, "mini-chats-io");
        this.d = s0;
        this.e = osa.a().s0(1, "mini-chats-computation");
        jx3 a2 = e14.a(s0);
        this.f = a2;
        this.g = LazyKt.lazy(new j35((Object) this, lazy2, 26));
        String name = ir9.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, name, "instance created " + this, (Throwable) null);
        }
        ev0.v(a2, (CoroutineContext) null, (f14) null, new ar9(aVar, this, (Continuation) null), 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:9|28|(1:30)(1:31)|32|33|36|(1:38)(1:39)|40|(1:42)|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0110, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        defpackage.z68.f(r7.getClass().getName(), "fail to decode protospans", r0);
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ir9 r39, java.util.List r40, kotlin.coroutines.Continuation r41) {
        /*
            r0 = r41
            r39.getClass()
            boolean r1 = r0 instanceof defpackage.hr9
            if (r1 == 0) goto L_0x001a
            r1 = r0
            hr9 r1 = (defpackage.hr9) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.y = r2
            r2 = r39
            goto L_0x0021
        L_0x001a:
            hr9 r1 = new hr9
            r2 = r39
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.w
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.y
            r5 = 1
            if (r4 == 0) goto L_0x0050
            if (r4 != r5) goto L_0x0048
            xk2 r2 = r1.v
            java.util.Iterator r4 = r1.o
            java.util.Collection r6 = r1.c
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r7 = r1.b
            java.util.List r7 = (java.util.List) r7
            ir9 r8 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            r38 = r4
            r4 = r2
            r2 = r8
            r8 = r6
            r6 = r38
            goto L_0x00da
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r40
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r6 = r4
            r4 = r0
            r0 = r40
        L_0x0064:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x018d
            java.lang.Object r7 = r4.next()
            xk2 r7 = (defpackage.xk2) r7
            kotlin.Lazy r8 = r2.g
            java.lang.Object r8 = r8.getValue()
            ld0 r8 = (defpackage.ld0) r8
            r1.a = r2
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            r1.b = r9
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            r1.c = r9
            r1.o = r4
            r1.v = r7
            r1.y = r5
            r8.getClass()
            long r9 = r7.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            wi6 r10 = r8.b
            java.lang.Object r9 = r10.get(r9)
            kotlin.Pair r9 = (kotlin.Pair) r9
            if (r9 != 0) goto L_0x00ab
            java.lang.Object r8 = r8.a(r7, r1)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00a8
            goto L_0x00d2
        L_0x00a8:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto L_0x00d2
        L_0x00ab:
            java.lang.Object r9 = r9.getFirst()
            android.net.Uri r9 = (android.net.Uri) r9
            android.net.Uri r11 = r7.b
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r9 != 0) goto L_0x00d0
            long r11 = r7.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r11)
            r10.remove(r9)
            java.lang.Object r8 = r8.a(r7, r1)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00cd
            goto L_0x00d2
        L_0x00cd:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto L_0x00d2
        L_0x00d0:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00d2:
            if (r8 != r3) goto L_0x00d6
            goto L_0x0190
        L_0x00d6:
            r8 = r6
            r6 = r4
            r4 = r7
            r7 = r0
        L_0x00da:
            kotlin.Lazy r0 = r2.g
            java.lang.Object r0 = r0.getValue()
            ld0 r0 = (defpackage.ld0) r0
            r0.getClass()
            long r9 = r4.a
            java.lang.CharSequence r11 = r4.v
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            wi6 r0 = r0.b
            java.lang.Object r0 = r0.get(r9)
            kotlin.Pair r0 = (kotlin.Pair) r0
            r9 = 0
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r0.getSecond()
            byte[] r0 = (byte[]) r0
            r35 = r0
            goto L_0x0103
        L_0x0101:
            r35 = r9
        L_0x0103:
            kotlin.Lazy r0 = r2.c     // Catch:{ all -> 0x0110 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0110 }
            t8c r0 = (defpackage.t8c) r0     // Catch:{ all -> 0x0110 }
            java.util.ArrayList r0 = r0.b(r11)     // Catch:{ all -> 0x0110 }
            goto L_0x011f
        L_0x0110:
            r0 = move-exception
            java.lang.Class r10 = r7.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "fail to decode protospans"
            defpackage.z68.f(r10, r12, r0)
            r0 = r9
        L_0x011f:
            java.lang.String r17 = r11.toString()
            if (r0 == 0) goto L_0x0131
            r10 = 0
            rf7[] r10 = new defpackage.rf7[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            rf7[] r0 = (defpackage.rf7[]) r0
            r18 = r0
            goto L_0x0133
        L_0x0131:
            r18 = r9
        L_0x0133:
            wk2 r0 = r4.Z
            int r23 = r0.ordinal()
            android.net.Uri r0 = r4.b
            if (r0 == 0) goto L_0x0141
            java.lang.String r9 = r0.toString()
        L_0x0141:
            r34 = r9
            yq9 r0 = new yq9
            r12 = r0
            java.lang.CharSequence r9 = r4.v
            r36 = r9
            boolean r9 = r4.X
            r37 = r9
            long r13 = r4.a
            java.lang.CharSequence r15 = r4.c
            java.lang.CharSequence r9 = r4.o
            r16 = r9
            java.lang.CharSequence r9 = r4.w
            r19 = r9
            java.lang.String r9 = r4.y
            r20 = r9
            long r9 = r4.Y
            r21 = r9
            int r9 = r4.v0
            r24 = r9
            boolean r9 = r4.w0
            r25 = r9
            boolean r9 = r4.x0
            r26 = r9
            boolean r9 = r4.y0
            r27 = r9
            long r9 = r4.z0
            r28 = r9
            java.lang.Long r9 = r4.A0
            r30 = r9
            long r9 = r4.B0
            r31 = r9
            java.lang.CharSequence r4 = r4.C0
            r33 = r4
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r33, r34, r35, r36, r37)
            r8.add(r0)
            r4 = r6
            r0 = r7
            r6 = r8
            goto L_0x0064
        L_0x018d:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
        L_0x0190:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir9.a(ir9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
