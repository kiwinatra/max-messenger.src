package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ld0  reason: default package */
public final class ld0 {
    public final Lazy a;
    public final wi6 b;
    public final Lazy c = LazyKt.lazy(new m(15));

    public ld0(int i, Lazy lazy) {
        this.a = lazy;
        this.b = new wi6(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.xk2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jd0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jd0 r0 = (defpackage.jd0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            jd0 r0 = new jd0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            xk2 r5 = r0.b
            ld0 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r4
            r0.b = r5
            r0.v = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Pair r6 = (kotlin.Pair) r6
            if (r6 == 0) goto L_0x0054
            wi6 r4 = r4.b
            long r0 = r5.a
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r4.put(r5, r6)
        L_0x0054:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld0.a(xk2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.xk2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.kd0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kd0 r0 = (defpackage.kd0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            kd0 r0 = new kd0
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            android.net.Uri r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            android.net.Uri r7 = r7.b
            if (r7 != 0) goto L_0x003c
            return r3
        L_0x003c:
            hd0 r8 = defpackage.foa.a
            goa r8 = defpackage.goa.a
            ra7 r2 = defpackage.ra7.d(r7)
            oa7 r5 = defpackage.oa7.b
            r2.g = r5
            hk0 r8 = defpackage.foa.a(r8)
            r2.l = r8
            uub r8 = defpackage.uub.o
            r2.k = r8
            kotlin.Lazy r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            v3d r8 = (defpackage.v3d) r8
            r2.d = r8
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            qa7 r8 = r2.a()
            kotlin.Lazy r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            no0 r6 = (defpackage.no0) r6
            r0.a = r7
            r0.o = r4
            java.lang.Object r8 = r6.b(r8, r0)
            if (r8 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r7
        L_0x0076:
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x0083
            int r7 = r8.length
            if (r7 != 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r8)
            return r6
        L_0x0083:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld0.b(xk2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
