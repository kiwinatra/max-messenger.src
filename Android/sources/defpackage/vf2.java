package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;

/* renamed from: vf2  reason: default package */
public final class vf2 implements tu, u0d {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public vf2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, pp0 pp0, long j, Set set, ps8 ps8) {
        this.b = pp0;
        this.a = j;
        this.c = set;
        this.d = ps8;
        this.e = vf2.class.getName();
        this.f = lazy;
        this.g = lazy2;
        this.h = lazy3;
        this.i = lazy4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(long r28, int r30, int r31, long r32, long r34, kotlin.coroutines.Continuation r36) {
        /*
            r27 = this;
            r0 = r27
            r1 = r36
            boolean r2 = r1 instanceof defpackage.qf2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            qf2 r2 = (defpackage.qf2) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.z = r3
            goto L_0x001c
        L_0x0017:
            qf2 r2 = new qf2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.x
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0057
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            int r0 = r2.w
            int r3 = r2.v
            long r4 = r2.o
            ha9 r9 = r2.c
            a32 r10 = r2.b
            vf2 r2 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r21 = r0
            r18 = r3
            r22 = r4
            goto L_0x0139
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            int r0 = r2.w
            int r4 = r2.v
            long r9 = r2.o
            vf2 r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0082
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Object r1 = r0.f
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            r2.a = r0
            r9 = r28
            r2.o = r9
            r4 = r30
            r2.v = r4
            r11 = r31
            r2.w = r11
            r2.z = r6
            long r12 = r0.a
            java.lang.Object r1 = r1.d(r12, r2)
            if (r1 != r3) goto L_0x007d
            return r3
        L_0x007d:
            r26 = r11
            r11 = r0
            r0 = r26
        L_0x0082:
            a32 r1 = (defpackage.a32) r1
            java.lang.Object r12 = r11.d
            ps8 r12 = (defpackage.ps8) r12
            os8 r12 = r12.d()
            java.lang.Object r13 = r11.g
            kotlin.Lazy r13 = (kotlin.Lazy) r13
            java.lang.Object r13 = r13.getValue()
            fa9 r13 = (defpackage.fa9) r13
            long r14 = r11.a
            ha9 r13 = r13.s(r14, r9)
            if (r13 == 0) goto L_0x00a1
            long r5 = r13.c
            goto L_0x00a3
        L_0x00a1:
            r5 = 0
        L_0x00a3:
            long r7 = r12.d
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00cd
            java.lang.Object r7 = r11.c
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r8 = r12.c
            boolean r7 = r8.containsAll(r7)
            if (r7 == 0) goto L_0x00cd
            if (r0 <= 0) goto L_0x00c1
            long r7 = r12.b
            r14 = 0
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00c3
            r5 = r7
            goto L_0x00c3
        L_0x00c1:
            r14 = 0
        L_0x00c3:
            if (r4 <= 0) goto L_0x00cf
            long r7 = r12.a
            int r12 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00cf
            r5 = r7
            goto L_0x00cf
        L_0x00cd:
            r14 = 0
        L_0x00cf:
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00e2
            java.lang.String r0 = "Media loader. Don't request media if messageId == 0"
            java.lang.Object r1 = r11.e
            java.lang.String r1 = (java.lang.String) r1
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        L_0x00e2:
            yt r7 = new yt
            m72 r8 = r1.b
            long r14 = r8.a
            java.lang.Long r19 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            java.lang.Integer r21 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            java.lang.Integer r22 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object r5 = r11.c
            r20 = r5
            java.util.Set r20 = (java.util.Set) r20
            r16 = r7
            r17 = r14
            r16.<init>((long) r17, (java.lang.Long) r19, (java.util.Set) r20, (java.lang.Integer) r21, (java.lang.Integer) r22)
            rf2 r5 = new rf2
            r6 = 0
            r5.<init>(r11, r7, r6)
            sbd r7 = new sbd
            r7.<init>(r5)
            sf2 r5 = new sf2
            r8 = 0
            r5.<init>(r11, r6, r8)
            wb r6 = new wb
            r8 = 16
            r6.<init>(r8, r7, r5)
            r2.a = r11
            r2.b = r1
            r2.c = r13
            r2.o = r9
            r2.v = r4
            r2.w = r0
            r5 = 2
            r2.z = r5
            java.lang.Object r2 = defpackage.bs0.z(r6, r2)
            if (r2 != r3) goto L_0x012f
            return r3
        L_0x012f:
            r21 = r0
            r18 = r4
            r22 = r9
            r9 = r13
            r10 = r1
            r1 = r2
            r2 = r11
        L_0x0139:
            bd2 r1 = (defpackage.bd2) r1
            java.util.List r0 = r1.d()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r2.g
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            fa9 r0 = (defpackage.fa9) r0
            long r3 = r10.a
            java.util.List r5 = r1.d()
            java.lang.Object r6 = r2.h
            kotlin.Lazy r6 = (kotlin.Lazy) r6
            java.lang.Object r6 = r6.getValue()
            x23 r6 = (defpackage.x23) r6
            qjd r6 = (defpackage.qjd) r6
            long r6 = r6.s()
            r27 = r0
            r28 = r3
            r30 = r6
            r32 = r5
            r27.h(r28, r30, r32)
        L_0x0174:
            java.lang.Object r0 = r2.f
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            qx2 r0 = (defpackage.qx2) r0
            long r3 = r10.a
            if (r9 == 0) goto L_0x0187
            long r7 = r9.b
            r19 = r7
            goto L_0x0189
        L_0x0187:
            r19 = 0
        L_0x0189:
            my2 r0 = (defpackage.my2) r0
            r62 r0 = r0.n()
            r0.getClass()
            l62 r5 = new l62
            java.lang.Object r2 = r2.c
            r16 = r2
            java.util.Set r16 = (java.util.Set) r16
            r14 = r5
            r15 = r0
            r17 = r1
            r24 = r3
            r14.<init>(r15, r16, r17, r18, r19, r21, r22, r24)
            r2 = 0
            r0.i(r3, r2, r5)
            java.util.List r0 = r1.d()
            int r0 = r0.size()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf2.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x008e, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(long r19, int r21, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.tf2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            tf2 r1 = (defpackage.tf2) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.x = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            tf2 r1 = new tf2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.v
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.x
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0091
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.c
            int r3 = r11.o
            long r4 = r11.b
            vf2 r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r4
            r10 = r6
            goto L_0x0077
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r0)
            r11.a = r10
            r14 = r19
            r11.b = r14
            r9 = r21
            r11.o = r9
            r7 = r22
            r11.c = r7
            r11.x = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0073
            return r12
        L_0x0073:
            r3 = r21
            r1 = r22
        L_0x0077:
            java.lang.Object r0 = r10.b
            tu r0 = (defpackage.tu) r0
            r4 = 0
            r11.a = r4
            r11.x = r13
            r18 = r0
            r19 = r14
            r21 = r3
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.b(r19, r21, r22, r24)
            if (r0 != r12) goto L_0x0091
            return r12
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf2.b(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x0087, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r17, int r19, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.uf2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            uf2 r1 = (defpackage.uf2) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.x = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            uf2 r1 = new uf2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.v
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.x
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008a
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.c
            int r3 = r11.o
            long r4 = r11.b
            vf2 r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r4
            r10 = r6
            goto L_0x0070
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r0)
            r11.a = r10
            r14 = r17
            r11.b = r14
            r9 = r19
            r11.o = r9
            r7 = r20
            r11.c = r7
            r11.x = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r17
            r4 = r19
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006c
            return r12
        L_0x006c:
            r3 = r19
            r1 = r20
        L_0x0070:
            java.lang.Object r0 = r10.b
            tu r0 = (defpackage.tu) r0
            r4 = 0
            r11.a = r4
            r11.x = r13
            r16 = r0
            r17 = r14
            r19 = r3
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.c(r17, r19, r20, r22)
            if (r0 != r12) goto L_0x008a
            return r12
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf2.c(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public xr1 e(String str) {
        if (((ArrayList) this.g).contains(str)) {
            as1 f2 = f(str);
            ha0 ha0 = (ha0) this.d;
            Executor executor = ha0.a;
            return new xr1((Context) this.b, (vu1) this.f, str, f2, (mqf) this.c, (ov1) this.e, executor, ha0.b, (hq4) this.h, this.a);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public as1 f(String str) {
        HashMap hashMap = (HashMap) this.i;
        try {
            as1 as1 = (as1) hashMap.get(str);
            if (as1 != null) {
                return as1;
            }
            as1 as12 = new as1((vu1) this.f, str);
            hashMap.put(str, as12);
            return as12;
        } catch (CameraAccessExceptionCompat e2) {
            throw new Exception(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [fbf] */
    /* JADX WARNING: type inference failed for: r0v17, types: [fbf] */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|20|21|(4:24|(2:26|56)(2:27|57)|54|22)|55|28|(2:31|29)|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }, LOOP:2: B:29:0x0093->B:31:0x0099, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vf2(android.content.Context r5, defpackage.ha0 r6, defpackage.jv1 r7, long r8) {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.i = r0
            r4.b = r5
            r4.d = r6
            vu1 r6 = new vu1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x001d
            xu1 r0 = new xu1
            r0.<init>((android.content.Context) r5, (defpackage.f6e) r2)
            goto L_0x0022
        L_0x001d:
            wu1 r0 = new wu1
            r0.<init>((android.content.Context) r5, (defpackage.f6e) r2)
        L_0x0022:
            r6.<init>(r0)
            r4.f = r6
            hq4 r5 = defpackage.hq4.b(r5)
            r4.h = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            fbf r0 = r6.a     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r0.getClass()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.Object r0 = r0.b     // Catch:{ CameraAccessException -> 0x00ff }
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch:{ CameraAccessException -> 0x00ff }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x00ff }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 != 0) goto L_0x005f
            java.util.Iterator r6 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0049:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0049
        L_0x0059:
            r4 = move-exception
            goto L_0x0106
        L_0x005c:
            r4 = move-exception
            goto L_0x010c
        L_0x005f:
            java.lang.Integer r1 = r7.b()     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.String r2 = defpackage.gsg.f(r6, r1, r0)     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0067:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0070:
            boolean r1 = r0.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r0.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            boolean r3 = r1.equals(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r3 == 0) goto L_0x0083
            goto L_0x0070
        L_0x0083:
            as1 r1 = r4.f(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.add(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0070
        L_0x008b:
            java.util.List r6 = r7.a(r6)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0093:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            qu1 r7 = (defpackage.qu1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            qu1 r7 = (defpackage.qu1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = r7.e()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0093
        L_0x00a9:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00b2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "0"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00dd
        L_0x00cf:
            java.lang.Object r0 = r4.f
            vu1 r0 = (defpackage.vu1) r0
            boolean r0 = defpackage.y7e.G(r0, r7)
            if (r0 == 0) goto L_0x00b2
            r6.add(r7)
            goto L_0x00b2
        L_0x00dd:
            r6.add(r7)
            goto L_0x00b2
        L_0x00e1:
            r4.g = r6
            mqf r5 = new mqf
            java.lang.Object r6 = r4.f
            vu1 r6 = (defpackage.vu1) r6
            r5.<init>((defpackage.vu1) r6)
            r4.c = r5
            ov1 r6 = new ov1
            r6.<init>(r5)
            r4.e = r6
            java.lang.Object r5 = r5.o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            r4.a = r8
            return
        L_0x00ff:
            r4 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r5 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>(r4)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            throw r5     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0106:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            r5.<init>(r4)
            throw r5
        L_0x010c:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = new androidx.camera.core.CameraUnavailableException
            r6.<init>(r4)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf2.<init>(android.content.Context, ha0, jv1, long):void");
    }
}
