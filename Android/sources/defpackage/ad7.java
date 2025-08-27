package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ad7  reason: default package */
public final class ad7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ pk6 b;
    public final /* synthetic */ yd7 c;
    public final /* synthetic */ zcf o;
    public final /* synthetic */ ConcurrentHashMap v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad7(pk6 pk6, yd7 yd7, zcf zcf, ConcurrentHashMap concurrentHashMap, Continuation continuation) {
        super(2, continuation);
        this.b = pk6;
        this.c = yd7;
        this.o = zcf;
        this.v = concurrentHashMap;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ad7 ad7 = new ad7(this.b, this.c, this.o, this.v, continuation);
        ad7.a = obj;
        return ad7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ad7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9 A[Catch:{ all -> 0x0099, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f A[Catch:{ all -> 0x0099, all -> 0x01c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            r36 = this;
            r0 = r36
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r37)
            java.lang.Object r1 = r0.a
            d14 r1 = (defpackage.d14) r1
            nk6 r2 = defpackage.nk6.f
            pk6 r3 = r0.b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            yd7 r5 = r0.c
            android.content.ContentResolver r6 = r5.o
            android.net.Uri r7 = r3.i()
            java.lang.String[] r8 = r3.d
            java.lang.String r9 = r3.a
            java.lang.String[] r10 = r3.b
            java.lang.String r11 = r3.c
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x01c9
            java.util.concurrent.ConcurrentHashMap r7 = r0.v
            java.lang.String r8 = r3.f()     // Catch:{ all -> 0x0099 }
            int r8 = r6.getColumnIndex(r8)     // Catch:{ all -> 0x0099 }
            r10 = -1
            if (r8 != r10) goto L_0x003e
            goto L_0x01bb
        L_0x003e:
            java.lang.String r11 = r3.b()     // Catch:{ all -> 0x0099 }
            int r11 = r6.getColumnIndex(r11)     // Catch:{ all -> 0x0099 }
            if (r11 != r10) goto L_0x004a
            goto L_0x01bb
        L_0x004a:
            java.lang.String r12 = r3.a()     // Catch:{ all -> 0x0099 }
            int r12 = r6.getColumnIndex(r12)     // Catch:{ all -> 0x0099 }
            if (r12 != r10) goto L_0x0056
            goto L_0x01bb
        L_0x0056:
            java.lang.String r13 = r3.c()     // Catch:{ all -> 0x0099 }
            int r13 = r6.getColumnIndex(r13)     // Catch:{ all -> 0x0099 }
            if (r13 != r10) goto L_0x0062
            goto L_0x01bb
        L_0x0062:
            java.lang.String r14 = r3.d()     // Catch:{ all -> 0x0099 }
            int r14 = r6.getColumnIndex(r14)     // Catch:{ all -> 0x0099 }
            if (r14 != r10) goto L_0x006e
            goto L_0x01bb
        L_0x006e:
            java.lang.String r15 = r3.g()     // Catch:{ all -> 0x0099 }
            int r15 = r6.getColumnIndex(r15)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r15)     // Catch:{ all -> 0x0099 }
            int r9 = r15.intValue()     // Catch:{ all -> 0x0099 }
            if (r9 == r10) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r15 = 0
        L_0x0082:
            java.lang.String r9 = r3.h()     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x0097
            int r9 = r6.getColumnIndex(r9)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)     // Catch:{ all -> 0x0099 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x0099 }
            if (r0 == r10) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            r9 = 0
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            r1 = r0
            goto L_0x01c2
        L_0x009d:
            boolean r0 = defpackage.e14.f(r1)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x01bb
            r10 = r1
            long r0 = r6.getLong(r8)     // Catch:{ all -> 0x0099 }
            int r28 = r6.getInt(r11)     // Catch:{ all -> 0x0099 }
            r29 = r8
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r28)     // Catch:{ all -> 0x0099 }
            boolean r8 = r4.contains(r8)     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x00c4
            java.lang.String r8 = r6.getString(r12)     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x00c8
        L_0x00c4:
            r1 = r10
            r8 = r29
            goto L_0x009d
        L_0x00c8:
            android.net.Uri r16 = defpackage.n79.B(r6, r13)     // Catch:{ all -> 0x0099 }
            if (r16 != 0) goto L_0x00db
            r30 = r10
            android.net.Uri r10 = r3.i()     // Catch:{ all -> 0x0099 }
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r10, r0)     // Catch:{ all -> 0x0099 }
            r26 = r10
            goto L_0x00df
        L_0x00db:
            r30 = r10
            r26 = r16
        L_0x00df:
            java.lang.String r10 = r3.j()     // Catch:{ all -> 0x0099 }
            if (r15 != 0) goto L_0x00e8
        L_0x00e5:
            r20 = r10
            goto L_0x00f7
        L_0x00e8:
            r16 = r10
            int r10 = r15.intValue()     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = r6.getString(r10)     // Catch:{ all -> 0x0099 }
            if (r10 != 0) goto L_0x00e5
            r10 = r16
            goto L_0x00e5
        L_0x00f7:
            ejd r10 = defpackage.j48.a     // Catch:{ all -> 0x0099 }
            r10.getClass()     // Catch:{ all -> 0x0099 }
            j48 r10 = defpackage.ejd.c(r20)     // Catch:{ all -> 0x0099 }
            r31 = r11
            j48 r11 = defpackage.j48.b     // Catch:{ all -> 0x0099 }
            if (r10 == r11) goto L_0x01b3
            if (r9 == 0) goto L_0x0111
            int r11 = r9.intValue()     // Catch:{ all -> 0x0099 }
            int r11 = r6.getInt(r11)     // Catch:{ all -> 0x0099 }
            goto L_0x0112
        L_0x0111:
            r11 = 0
        L_0x0112:
            long r22 = r6.getLong(r14)     // Catch:{ all -> 0x0099 }
            wk6 r10 = new wk6     // Catch:{ all -> 0x0099 }
            r32 = r9
            qk6 r9 = new qk6     // Catch:{ all -> 0x0099 }
            r33 = r12
            java.lang.String r12 = java.lang.String.valueOf(r28)     // Catch:{ all -> 0x0099 }
            r34 = r13
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r3)     // Catch:{ all -> 0x0099 }
            r9.<init>(r12, r8, r13)     // Catch:{ all -> 0x0099 }
            r12 = 0
            r10.<init>(r9, r12, r12, r2)     // Catch:{ all -> 0x0099 }
            java.util.concurrent.ConcurrentHashMap r12 = r5.z0
            java.lang.Object r13 = r12.get(r9)     // Catch:{ all -> 0x0099 }
            k48 r13 = (defpackage.k48) r13     // Catch:{ all -> 0x0099 }
            if (r13 == 0) goto L_0x0142
            r35 = r14
            long r13 = r13.v     // Catch:{ all -> 0x0099 }
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 >= 0) goto L_0x015c
            goto L_0x0144
        L_0x0142:
            r35 = r14
        L_0x0144:
            k48 r13 = new k48     // Catch:{ all -> 0x0099 }
            java.lang.Integer r24 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)     // Catch:{ all -> 0x0099 }
            r27 = 960(0x3c0, float:1.345E-42)
            r25 = 0
            r16 = r13
            r17 = r0
            r19 = r26
            r21 = r28
            r16.<init>(r17, r19, r20, r21, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0099 }
            r12.put(r9, r13)     // Catch:{ all -> 0x0099 }
        L_0x015c:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r28)     // Catch:{ all -> 0x0099 }
            r4.add(r0)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r28)     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0099 }
            wk6 r0 = (defpackage.wk6) r0     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x019c
            wk6 r10 = new wk6     // Catch:{ all -> 0x0099 }
            qk6 r1 = new qk6     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = java.lang.String.valueOf(r28)     // Catch:{ all -> 0x0099 }
            vk6 r11 = r0.a     // Catch:{ all -> 0x0099 }
            java.util.List r11 = r11.d()     // Catch:{ all -> 0x0099 }
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x0099 }
            java.util.List r11 = kotlin.collections.CollectionsKt.plus(r11, r3)     // Catch:{ all -> 0x0099 }
            r1.<init>(r9, r8, r11)     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.d     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0190
            if (r2 == 0) goto L_0x018d
            goto L_0x0190
        L_0x018d:
            r0 = 0
            r12 = 0
            goto L_0x0192
        L_0x0190:
            r12 = 1
            r0 = 0
        L_0x0192:
            r10.<init>(r1, r0, r0, r12)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r28)     // Catch:{ all -> 0x0099 }
            r7.remove(r0)     // Catch:{ all -> 0x0099 }
        L_0x019c:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r28)     // Catch:{ all -> 0x0099 }
            r7.put(r0, r10)     // Catch:{ all -> 0x0099 }
            r8 = r29
            r1 = r30
            r11 = r31
            r9 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            goto L_0x009d
        L_0x01b3:
            r8 = r29
            r1 = r30
            r11 = r31
            goto L_0x009d
        L_0x01bb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0099 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r0)
            goto L_0x01c9
        L_0x01c2:
            throw r1     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r6, r1)
            throw r2
        L_0x01c9:
            r3.toString()
            r0 = r36
            zcf r0 = r0.o
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
