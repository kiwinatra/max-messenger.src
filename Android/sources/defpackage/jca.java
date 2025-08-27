package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.math.MathKt;

/* renamed from: jca  reason: default package */
public final class jca {
    public final Lazy a;
    public final Lazy b;
    public final int c = MathKt.roundToInt(((float) 104) * vo4.c().getDisplayMetrics().density);
    public final go0 d = new go0(100, 1);
    public final sb2 e;

    public jca(Context context, Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
        this.e = new sb2(100, context, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.ba7 r11, defpackage.qa7 r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.fca
            if (r0 == 0) goto L_0x0014
            r0 = r13
            fca r0 = (defpackage.fca) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.o = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            fca r0 = new fca
            r0.<init>(r10, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r10 = r6.b
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.o
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r9) goto L_0x0030
            ba7 r11 = r6.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x002e }
            goto L_0x004d
        L_0x002e:
            r10 = move-exception
            goto L_0x005a
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r10)
            r6.a = r11     // Catch:{ all -> 0x002e }
            r6.o = r9     // Catch:{ all -> 0x002e }
            r5 = 0
            r7 = 12
            r3 = 200(0xc8, double:9.9E-322)
            r1 = r11
            r2 = r12
            java.lang.Object r10 = defpackage.ld9.u(r1, r2, r3, r5, r6, r7)     // Catch:{ all -> 0x002e }
            if (r10 != r13) goto L_0x004d
            return r13
        L_0x004d:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch:{ all -> 0x002e }
            if (r10 == 0) goto L_0x0067
            boolean r11 = r10.isRecycled()     // Catch:{ all -> 0x002e }
            r11 = r11 ^ r9
            if (r11 == 0) goto L_0x0067
            r8 = r10
            goto L_0x0067
        L_0x005a:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "fail to fetch bitmap"
            defpackage.z68.f(r11, r12, r10)
        L_0x0067:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.a(ba7, qa7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.a32 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gca
            if (r0 == 0) goto L_0x0013
            r0 = r6
            gca r0 = (defpackage.gca) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            gca r0 = new gca
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            a32 r5 = r0.b
            jca r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            kl0 r6 = defpackage.kl0.b
            jl0 r2 = defpackage.jl0.a
            java.lang.String r6 = r5.h(r6, r2)
            r0.a = r4
            r0.b = r5
            r0.v = r3
            java.lang.Object r6 = r4.d(r6, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0064
            r4.getClass()
            r5.l0()
            r5.m0()
            java.lang.CharSequence r6 = r5.v0
            long r0 = r5.g()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x0064:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.b(a32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.vk3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hca
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hca r0 = (defpackage.hca) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            hca r0 = new hca
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            vk3 r5 = r0.b
            jca r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            kl0 r6 = defpackage.kl0.b
            java.lang.String r6 = r5.t(r6)
            r0.a = r4
            r0.b = r5
            r0.v = r3
            java.lang.Object r6 = r4.d(r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x005e
            r4.getClass()
            java.lang.CharSequence r6 = r5.q()
            long r0 = r5.r()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x005e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.c(vk3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ica
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ica r0 = (defpackage.ica) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ica r0 = new ica
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r5) goto L_0x002f
            java.lang.String r8 = r0.b
            jca r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0097
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            if (r8 == 0) goto L_0x00a9
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0043
            goto L_0x00a9
        L_0x0043:
            go0 r9 = r7.d
            java.lang.Object r9 = r9.c(r8)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L_0x0068
            boolean r2 = r9.isRecycled()
            if (r2 != 0) goto L_0x0068
            android.graphics.Bitmap$Config r2 = r9.getConfig()     // Catch:{ all -> 0x005c }
            android.graphics.Bitmap r7 = r9.copy(r2, r3)     // Catch:{ all -> 0x005c }
            return r7
        L_0x005c:
            r9 = move-exception
            java.lang.Class<jca> r2 = defpackage.jca.class
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = "fail to copy bitmap"
            defpackage.z68.f(r2, r6, r9)
        L_0x0068:
            hd0 r9 = defpackage.foa.a
            goa r9 = defpackage.goa.a
            android.net.Uri r2 = defpackage.o54.e(r8)
            ra7 r2 = defpackage.ra7.d(r2)
            oa7 r6 = defpackage.oa7.a
            r2.g = r6
            hk0 r9 = defpackage.foa.a(r9)
            r2.l = r9
            qa7 r9 = r2.a()
            kotlin.Lazy r2 = r7.b
            java.lang.Object r2 = r2.getValue()
            ba7 r2 = (defpackage.ba7) r2
            r0.a = r7
            r0.b = r8
            r0.v = r5
            java.lang.Object r9 = r7.a(r2, r9, r0)
            if (r9 != r1) goto L_0x0097
            return r1
        L_0x0097:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L_0x00a9
            go0 r7 = r7.d
            android.graphics.Bitmap$Config r0 = r9.getConfig()
            android.graphics.Bitmap r0 = r9.copy(r0, r3)
            r7.d(r8, r0)
            r4 = r9
        L_0x00a9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Bitmap e(CharSequence charSequence, long j) {
        fd0 fd0 = (fd0) this.e.c(TuplesKt.to(charSequence, Long.valueOf(j)));
        if (fd0 == null) {
            return null;
        }
        int i = this.c;
        return kne.O(fd0, i, i);
    }
}
