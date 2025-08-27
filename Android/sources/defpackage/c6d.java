package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: c6d  reason: default package */
public final class c6d {
    public final i6d a;
    public final li b;
    public final li c;
    public final we4 d;
    public final t5d e;
    public final t5d f;
    public final t5d g;
    public final t5d h;
    public final t5d i;
    public final t5d j;
    public final uf9 k;
    public final uf9 l;
    public final t5d m;
    public final t5d n;

    public c6d(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 21);
        this.c = new li(oneMeRoomDatabase, 22);
        this.d = new we4(oneMeRoomDatabase, 5);
        this.e = new t5d(oneMeRoomDatabase, 3);
        this.f = new t5d(oneMeRoomDatabase, 4);
        this.g = new t5d(oneMeRoomDatabase, 5);
        this.h = new t5d(oneMeRoomDatabase, 6);
        this.i = new t5d(oneMeRoomDatabase, 7);
        this.j = new t5d(oneMeRoomDatabase, 8);
        this.k = new uf9(oneMeRoomDatabase, 28);
        this.l = new uf9(oneMeRoomDatabase, 29);
        this.m = new t5d(oneMeRoomDatabase, 0);
        this.n = new t5d(oneMeRoomDatabase, 1);
        new t5d(oneMeRoomDatabase, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(defpackage.c6d r24, java.lang.String r25, java.lang.CharSequence r26, kotlin.coroutines.Continuation r27) {
        /*
            r1 = r24
            r0 = r27
            r2 = 0
            boolean r3 = r0 instanceof defpackage.k5d
            if (r3 == 0) goto L_0x0018
            r3 = r0
            k5d r3 = (defpackage.k5d) r3
            int r4 = r3.w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0018
            int r4 = r4 - r5
            r3.w = r4
            goto L_0x001d
        L_0x0018:
            k5d r3 = new k5d
            r3.<init>(r1, r0)
        L_0x001d:
            java.lang.Object r0 = r3.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.w
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0058
            if (r5 == r7) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            java.lang.Object r1 = r3.a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x010d
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.CharSequence r1 = r3.c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r5 = r3.b
            java.lang.Object r8 = r3.a
            c6d r8 = (defpackage.c6d) r8
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0051 }
            r23 = r8
            r8 = r1
            r1 = r23
            goto L_0x0087
        L_0x0051:
            r0 = move-exception
            r23 = r8
            r8 = r1
            r1 = r23
            goto L_0x00a3
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x009f }
            r3.a = r1     // Catch:{ all -> 0x009f }
            r5 = r25
            r3.b = r5     // Catch:{ all -> 0x009d }
            r0 = r26
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x009d }
            r3.c = r0     // Catch:{ all -> 0x009d }
            r3.w = r7     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "SELECT MAX(`order`) FROM chat_folder"
            d7d r0 = defpackage.d7d.a(r2, r0)     // Catch:{ all -> 0x009d }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ all -> 0x009d }
            r8.<init>()     // Catch:{ all -> 0x009d }
            b6d r9 = new b6d     // Catch:{ all -> 0x009d }
            r10 = 4
            r9.<init>(r1, r0, r10)     // Catch:{ all -> 0x009d }
            i6d r0 = r1.a     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = defpackage.i8b.q(r0, r8, r9, r3)     // Catch:{ all -> 0x009d }
            if (r0 != r4) goto L_0x0085
            return r4
        L_0x0085:
            r8 = r26
        L_0x0087:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0098 }
            long r9 = r0.longValue()     // Catch:{ all -> 0x0098 }
            int r0 = (int) r9     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            r10 = r5
            goto L_0x00ae
        L_0x0098:
            r0 = move-exception
            goto L_0x00a3
        L_0x009a:
            r8 = r26
            goto L_0x00a3
        L_0x009d:
            r0 = move-exception
            goto L_0x009a
        L_0x009f:
            r0 = move-exception
            r5 = r25
            goto L_0x009a
        L_0x00a3:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            goto L_0x0096
        L_0x00ae:
            boolean r5 = kotlin.Result.m29isFailureimpl(r0)
            r15 = 0
            if (r5 == 0) goto L_0x00b6
            r0 = r15
        L_0x00b6:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.intValue()
            goto L_0x00c0
        L_0x00bf:
            r0 = r2
        L_0x00c0:
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            j5d r14 = new j5d
            if (r8 == 0) goto L_0x00d2
            java.lang.String r8 = r8.toString()
            r11 = r8
            goto L_0x00d3
        L_0x00d2:
            r11 = r15
        L_0x00d3:
            int r12 = r0 + 1
            java.util.Set r13 = kotlin.collections.SetsKt.emptySet()
            r19 = 0
            r20 = 0
            r0 = 0
            r7 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 8064(0x1f80, float:1.13E-41)
            r8 = r14
            r9 = r5
            r22 = r14
            r14 = r0
            r0 = r15
            r15 = r7
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12, (java.util.Set) r13, (boolean) r14, (boolean) r15, (java.util.List) r16, (java.lang.Long) r17, (java.util.Map) r18, (java.util.List) r19, (java.util.Set) r20, (int) r21)
            r3.a = r5
            r3.b = r0
            r3.c = r0
            r3.w = r6
            r1.getClass()
            u5d r0 = new u5d
            r6 = r22
            r0.<init>(r1, r6, r2)
            i6d r1 = r1.a
            java.lang.Object r0 = defpackage.i8b.r(r1, r0, r3)
            if (r0 != r4) goto L_0x010c
            return r4
        L_0x010c:
            r1 = r5
        L_0x010d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.a(c6d, java.lang.String, java.lang.CharSequence, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(defpackage.c6d r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.l5d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            l5d r0 = (defpackage.l5d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            l5d r0 = new l5d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            java.lang.String r6 = r0.b
            c6d r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0054
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.a = r5
            r0.b = r6
            r0.v = r4
            x5d r7 = new x5d
            r2 = 0
            r7.<init>(r5, r6, r2)
            i6d r2 = r5.a
            java.lang.Object r7 = defpackage.i8b.r(r2, r7, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r7 = 0
            r0.a = r7
            r0.b = r7
            r0.v = r3
            r5.getClass()
            x5d r7 = new x5d
            r2 = 1
            r7.<init>(r5, r6, r2)
            i6d r5 = r5.a
            java.lang.Object r5 = defpackage.i8b.r(r5, r7, r0)
            if (r5 != r1) goto L_0x006d
            return r1
        L_0x006d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.b(c6d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(defpackage.c6d r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.m5d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            m5d r0 = (defpackage.m5d) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            m5d r0 = new m5d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006a
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            c6d r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0053
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r5
            r0.o = r4
            r5.getClass()
            w5d r6 = new w5d
            r2 = 0
            r6.<init>(r5, r2)
            i6d r2 = r5.a
            java.lang.Object r6 = defpackage.i8b.r(r2, r6, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r6 = 0
            r0.a = r6
            r0.o = r3
            r5.getClass()
            w5d r6 = new w5d
            r2 = 1
            r6.<init>(r5, r2)
            i6d r5 = r5.a
            java.lang.Object r5 = defpackage.i8b.r(r5, r6, r0)
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x006a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.c(c6d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0168 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0169 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object g(defpackage.c6d r26, java.util.List r27, java.util.Set r28, kotlin.coroutines.Continuation r29) {
        /*
            r0 = r26
            r1 = r29
            boolean r2 = r1 instanceof defpackage.n5d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            n5d r2 = (defpackage.n5d) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.z = r3
            goto L_0x001c
        L_0x0017:
            n5d r2 = new n5d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.x
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.z
            r5 = 1
            r6 = 3
            r7 = 2
            if (r4 == 0) goto L_0x007f
            if (r4 == r5) goto L_0x006f
            if (r4 == r7) goto L_0x0057
            if (r4 != r6) goto L_0x004f
            int r0 = r2.w
            java.util.Iterator r4 = r2.v
            r82 r5 = r2.o
            java.lang.Object r8 = r2.c
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.util.Collection r9 = r2.b
            java.util.Set r9 = (java.util.Set) r9
            c6d r10 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r12 = r0
            r11 = r6
            r1 = r9
            r0 = r10
            r6 = r5
            r5 = r8
            r25 = r7
            r7 = r3
            r3 = r25
            goto L_0x0137
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            int r0 = r2.w
            r82 r4 = r2.o
            java.lang.Object r5 = r2.c
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.util.Collection r8 = r2.b
            java.util.Set r8 = (java.util.Set) r8
            c6d r9 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r25 = r7
            r7 = r3
            r3 = r25
            goto L_0x012c
        L_0x006f:
            java.lang.Object r0 = r2.c
            java.util.Set r0 = (java.util.Set) r0
            java.util.Collection r4 = r2.b
            java.util.List r4 = (java.util.List) r4
            c6d r5 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r5
            goto L_0x00a2
        L_0x007f:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.a = r0
            r1 = r27
            java.util.Collection r1 = (java.util.Collection) r1
            r2.b = r1
            r1 = r28
            r2.c = r1
            r2.z = r5
            jkb r4 = new jkb
            r5 = 13
            r4.<init>((int) r5, (java.lang.Object) r0)
            i6d r5 = r0.a
            java.lang.Object r4 = defpackage.n6d.a(r5, r4, r2)
            if (r4 != r3) goto L_0x00a0
            return r3
        L_0x00a0:
            r4 = r27
        L_0x00a2:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r12 = r5
            r5 = r4
        L_0x00ab:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0171
            java.lang.Object r4 = r5.next()
            int r15 = r12 + 1
            if (r12 >= 0) goto L_0x00bc
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x00bc:
            r82 r4 = (defpackage.r82) r4
            j5d r14 = new j5d
            java.lang.String r8 = r4.a
            boolean r16 = r1.contains(r8)
            java.util.List r8 = r4.y
            java.util.ArrayList r17 = defpackage.qe8.u(r8)
            long r8 = r4.z
            java.lang.Long r18 = java.lang.Long.valueOf(r8)
            java.util.List r13 = r4.Y
            r21 = 4096(0x1000, float:5.74E-42)
            java.lang.String r9 = r4.a
            java.lang.String r10 = r4.b
            java.lang.String r11 = r4.c
            java.util.Set r8 = r4.w
            boolean r6 = r4.x
            java.util.Map r7 = r4.X
            r22 = r3
            java.util.Set r3 = r4.Z
            r19 = r8
            r8 = r14
            r20 = r13
            r13 = r19
            r23 = r14
            r14 = r16
            r24 = r15
            r15 = r6
            r16 = r17
            r17 = r18
            r18 = r7
            r19 = r20
            r20 = r3
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12, (java.util.Set) r13, (boolean) r14, (boolean) r15, (java.util.List) r16, (java.lang.Long) r17, (java.util.Map) r18, (java.util.List) r19, (java.util.Set) r20, (int) r21)
            r2.a = r0
            r2.b = r1
            r2.c = r5
            r2.o = r4
            r3 = 0
            r2.v = r3
            r12 = r24
            r2.w = r12
            r3 = 2
            r2.z = r3
            r0.getClass()
            u5d r6 = new u5d
            r7 = 0
            r8 = r23
            r6.<init>(r0, r8, r7)
            i6d r7 = r0.a
            java.lang.Object r6 = defpackage.i8b.r(r7, r6, r2)
            r7 = r22
            if (r6 != r7) goto L_0x0129
            return r7
        L_0x0129:
            r9 = r0
            r8 = r1
            r0 = r12
        L_0x012c:
            java.util.Set r1 = r4.o
            java.util.Iterator r1 = r1.iterator()
            r12 = r0
            r6 = r4
            r0 = r9
            r4 = r1
            r1 = r8
        L_0x0137:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0169
            java.lang.Object r8 = r4.next()
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            java.lang.String r10 = r6.a
            r2.a = r0
            r2.b = r1
            r2.c = r5
            r2.o = r6
            r2.v = r4
            r2.w = r12
            r11 = 3
            r2.z = r11
            r0.getClass()
            y5d r13 = new y5d
            r13.<init>((defpackage.c6d) r0, (long) r8, (java.lang.String) r10)
            i6d r8 = r0.a
            java.lang.Object r8 = defpackage.i8b.r(r8, r13, r2)
            if (r8 != r7) goto L_0x0137
            return r7
        L_0x0169:
            r6 = 3
            r25 = r7
            r7 = r3
            r3 = r25
            goto L_0x00ab
        L_0x0171:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.g(c6d, java.util.List, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object h(defpackage.c6d r6, java.lang.String r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.o5d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            o5d r0 = (defpackage.o5d) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            o5d r0 = new o5d
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r8 = r0.c
            java.lang.String r7 = r0.b
            c6d r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.w = r3
            java.lang.Object r9 = r6.e(r0)
            if (r9 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.toMutableList(r9)
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r9)
            if (r8 <= r0) goto L_0x0058
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0058:
            java.util.Iterator r0 = r9.iterator()
            r1 = 0
            r2 = r1
        L_0x005e:
            boolean r4 = r0.hasNext()
            r5 = -1
            if (r4 == 0) goto L_0x0077
            java.lang.Object r4 = r0.next()
            j5d r4 = (defpackage.j5d) r4
            java.lang.String r4 = r4.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0077:
            r2 = r5
        L_0x0078:
            if (r2 == r5) goto L_0x00d9
            if (r2 != r8) goto L_0x007d
            goto L_0x00d9
        L_0x007d:
            if (r8 < r2) goto L_0x0088
            int r8 = r8 + r3
            java.util.List r7 = r9.subList(r2, r8)
            java.util.Collections.rotate(r7, r5)
            goto L_0x0090
        L_0x0088:
            int r2 = r2 + r3
            java.util.List r7 = r9.subList(r8, r2)
            java.util.Collections.rotate(r7, r3)
        L_0x0090:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x009f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00be
            java.lang.Object r9 = r8.next()
            int r0 = r1 + 1
            if (r1 >= 0) goto L_0x00b0
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x00b0:
            j5d r9 = (defpackage.j5d) r9
            r2 = 8183(0x1ff7, float:1.1467E-41)
            r3 = 0
            j5d r9 = defpackage.j5d.a(r9, r1, r3, r2)
            r7.add(r9)
            r1 = r0
            goto L_0x009f
        L_0x00be:
            i6d r8 = r6.a
            r8.b()
            r8.c()
            li r6 = r6.b     // Catch:{ all -> 0x00d4 }
            r6.a0(r7)     // Catch:{ all -> 0x00d4 }
            r8.r()     // Catch:{ all -> 0x00d4 }
            r8.l()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x00d4:
            r6 = move-exception
            r8.l()
            throw r6
        L_0x00d9:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.h(c6d, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v3 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x00aa, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object i(defpackage.c6d r7, java.lang.String r8, java.util.LinkedHashSet r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.p5d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            p5d r0 = (defpackage.p5d) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            p5d r0 = new p5d
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r5) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00ad
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            c6d r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a2
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r10)
            q82 r10 = defpackage.q82.v
            boolean r10 = r9.contains(r10)
            if (r10 != 0) goto L_0x0081
            q82 r10 = defpackage.q82.w
            boolean r10 = r9.contains(r10)
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0056
            goto L_0x0081
        L_0x0056:
            java.util.Iterator r10 = r9.iterator()
        L_0x005a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r10.next()
            q82 r2 = (defpackage.q82) r2
            cd4 r6 = defpackage.q82.a
            r6.getClass()
            java.util.LinkedHashSet r6 = defpackage.q82.c
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x005a
            java.util.Set r9 = kotlin.collections.CollectionsKt.toMutableSet(r9)
            q82 r10 = defpackage.q82.Y
            r9.remove(r10)
            q82 r10 = defpackage.q82.Z
            r9.remove(r10)
        L_0x0081:
            j5d r8 = r7.d(r8)
            if (r8 != 0) goto L_0x0088
            return r3
        L_0x0088:
            r10 = 8175(0x1fef, float:1.1456E-41)
            r2 = 0
            j5d r8 = defpackage.j5d.a(r8, r2, r9, r10)
            r0.a = r7
            r0.o = r5
            u5d r9 = new u5d
            r10 = 1
            r9.<init>(r7, r8, r10)
            i6d r8 = r7.a
            java.lang.Object r8 = defpackage.i8b.r(r8, r9, r0)
            if (r8 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r0.a = r3
            r0.o = r4
            java.lang.Object r10 = r7.e(r0)
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.i(c6d, java.lang.String, java.util.LinkedHashSet, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object j(defpackage.c6d r6, long r7, java.util.ArrayList r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.q5d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            q5d r0 = (defpackage.q5d) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            q5d r0 = new q5d
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r6 = r0.c
            java.lang.Object r8 = r0.b
            java.util.Iterator r8 = (java.util.Iterator) r8
            c6d r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006d
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            long r7 = r0.c
            java.lang.Object r6 = r0.b
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            c6d r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0063
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.a = r6
            r0.b = r9
            r0.c = r7
            r0.w = r4
            a6d r10 = new a6d
            r2 = 1
            r10.<init>(r6, r7, r2)
            i6d r2 = r6.a
            java.lang.Object r10 = defpackage.i8b.r(r2, r10, r0)
            if (r10 != r1) goto L_0x0063
            return r1
        L_0x0063:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r5 = r9
            r9 = r6
            r6 = r7
            r8 = r5
        L_0x006d:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0092
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            r0.a = r9
            r0.b = r8
            r0.c = r6
            r0.w = r3
            r9.getClass()
            y5d r2 = new y5d
            r2.<init>((defpackage.c6d) r9, (long) r6, (java.lang.String) r10)
            i6d r10 = r9.a
            java.lang.Object r10 = defpackage.i8b.r(r10, r2, r0)
            if (r10 != r1) goto L_0x006d
            return r1
        L_0x0092:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.j(c6d, long, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: j5d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r16v3, types: [j5d] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.j5d d(java.lang.String r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "SELECT * FROM chat_folder WHERE id = ?"
            r2 = 1
            d7d r1 = defpackage.d7d.a(r2, r1)
            if (r0 != 0) goto L_0x0011
            r1.X(r2)
        L_0x000e:
            r0 = r30
            goto L_0x0015
        L_0x0011:
            r1.h(r2, r0)
            goto L_0x000e
        L_0x0015:
            i6d r0 = r0.a
            r0.b()
            r3 = 0
            android.database.Cursor r4 = r0.o(r1, r3)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r4, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r5 = "title"
            int r5 = defpackage.kne.u(r4, r5)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = "emoji"
            int r6 = defpackage.kne.u(r4, r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = "order"
            int r7 = defpackage.kne.u(r4, r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = "filters"
            int r8 = defpackage.kne.u(r4, r8)     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "isHiddenForAllFolder"
            int r9 = defpackage.kne.u(r4, r9)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = "hideIfEmpty"
            int r10 = defpackage.kne.u(r4, r10)     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = "elements"
            int r11 = defpackage.kne.u(r4, r11)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "creatorId"
            int r12 = defpackage.kne.u(r4, r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r13 = "filterSubjects"
            int r13 = defpackage.kne.u(r4, r13)     // Catch:{ all -> 0x0142 }
            java.lang.String r14 = "widgets"
            int r14 = defpackage.kne.u(r4, r14)     // Catch:{ all -> 0x0142 }
            java.lang.String r15 = "options"
            int r15 = defpackage.kne.u(r4, r15)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "isRemoved"
            int r2 = defpackage.kne.u(r4, r2)     // Catch:{ all -> 0x0142 }
            boolean r16 = r4.moveToFirst()     // Catch:{ all -> 0x0142 }
            if (r16 == 0) goto L_0x0144
            boolean r16 = r4.isNull(r0)     // Catch:{ all -> 0x0142 }
            if (r16 == 0) goto L_0x007c
            r17 = r3
            goto L_0x0082
        L_0x007c:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0142 }
            r17 = r0
        L_0x0082:
            boolean r0 = r4.isNull(r5)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x008b
            r18 = r3
            goto L_0x0091
        L_0x008b:
            java.lang.String r0 = r4.getString(r5)     // Catch:{ all -> 0x0142 }
            r18 = r0
        L_0x0091:
            boolean r0 = r4.isNull(r6)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x009a
            r19 = r3
            goto L_0x00a0
        L_0x009a:
            java.lang.String r0 = r4.getString(r6)     // Catch:{ all -> 0x0142 }
            r19 = r0
        L_0x00a0:
            int r20 = r4.getInt(r7)     // Catch:{ all -> 0x0142 }
            boolean r0 = r4.isNull(r8)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00ac
            r0 = r3
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r0 = r4.getString(r8)     // Catch:{ all -> 0x0142 }
        L_0x00b0:
            java.util.EnumSet r21 = defpackage.tf6.n0(r0)     // Catch:{ all -> 0x0142 }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x0142 }
            r5 = 0
            if (r0 == 0) goto L_0x00be
            r22 = 1
            goto L_0x00c0
        L_0x00be:
            r22 = r5
        L_0x00c0:
            int r0 = r4.getInt(r10)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00c9
            r23 = 1
            goto L_0x00cb
        L_0x00c9:
            r23 = r5
        L_0x00cb:
            boolean r0 = r4.isNull(r11)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00d3
            r0 = r3
            goto L_0x00d7
        L_0x00d3:
            byte[] r0 = r4.getBlob(r11)     // Catch:{ all -> 0x0142 }
        L_0x00d7:
            if (r0 == 0) goto L_0x00e8
            ru.ok.tamtam.nano.Protos$MessageElements r6 = new ru.ok.tamtam.nano.Protos$MessageElements     // Catch:{ all -> 0x0142 }
            r6.<init>()     // Catch:{ all -> 0x0142 }
            defpackage.ad9.mergeFrom(r6, r0)     // Catch:{ all -> 0x0142 }
            java.util.ArrayList r0 = defpackage.ua9.a(r6)     // Catch:{ all -> 0x0142 }
        L_0x00e5:
            r24 = r0
            goto L_0x00ed
        L_0x00e8:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x0142 }
            goto L_0x00e5
        L_0x00ed:
            boolean r0 = r4.isNull(r12)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00f6
            r25 = r3
            goto L_0x0100
        L_0x00f6:
            long r6 = r4.getLong(r12)     // Catch:{ all -> 0x0142 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0142 }
            r25 = r0
        L_0x0100:
            boolean r0 = r4.isNull(r13)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0108
            r0 = r3
            goto L_0x010c
        L_0x0108:
            byte[] r0 = r4.getBlob(r13)     // Catch:{ all -> 0x0142 }
        L_0x010c:
            java.util.Map r26 = defpackage.tf6.L(r0)     // Catch:{ all -> 0x0142 }
            boolean r0 = r4.isNull(r14)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0118
            r0 = r3
            goto L_0x011c
        L_0x0118:
            byte[] r0 = r4.getBlob(r14)     // Catch:{ all -> 0x0142 }
        L_0x011c:
            java.util.List r27 = defpackage.tf6.N(r0)     // Catch:{ all -> 0x0142 }
            boolean r0 = r4.isNull(r15)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            byte[] r3 = r4.getBlob(r15)     // Catch:{ all -> 0x0142 }
        L_0x012b:
            java.util.Set r28 = defpackage.tf6.M(r3)     // Catch:{ all -> 0x0142 }
            int r0 = r4.getInt(r2)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0138
            r29 = 1
            goto L_0x013a
        L_0x0138:
            r29 = r5
        L_0x013a:
            j5d r3 = new j5d     // Catch:{ all -> 0x0142 }
            r16 = r3
            r16.<init>((java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (int) r20, (java.util.Set) r21, (boolean) r22, (boolean) r23, (java.util.List) r24, (java.lang.Long) r25, (java.util.Map) r26, (java.util.List) r27, (java.util.Set) r28, (boolean) r29)     // Catch:{ all -> 0x0142 }
            goto L_0x0144
        L_0x0142:
            r0 = move-exception
            goto L_0x014b
        L_0x0144:
            r4.close()
            r1.o()
            return r3
        L_0x014b:
            r4.close()
            r1.o()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6d.d(java.lang.String):j5d");
    }

    public final Object e(Continuation continuation) {
        d7d a2 = d7d.a(0, "SELECT * FROM chat_folder");
        return i8b.q(this.a, new CancellationSignal(), new b6d(this, a2, 1), continuation);
    }

    public final ArrayList f(String str) {
        d7d a2 = d7d.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }
}
