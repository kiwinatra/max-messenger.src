package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: geb  reason: default package */
public final class geb extends SuspendLambda implements Function2 {
    public List a;
    public List b;
    public List c;
    public List o;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ meb y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public geb(meb meb, Continuation continuation) {
        super(2, continuation);
        this.y = meb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        geb geb = new geb(this.y, continuation);
        geb.x = obj;
        return geb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((geb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: d14} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            java.lang.String r3 = "Phonebook"
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r7) goto L_0x0058
            if (r2 == r6) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            long r1 = r0.v
            java.util.List r5 = r0.c
            java.util.List r5 = (java.util.List) r5
            java.util.List r6 = r0.b
            java.util.List r6 = (java.util.List) r6
            java.util.List r8 = r0.a
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r9 = r0.x
            d14 r9 = (defpackage.d14) r9
            kotlin.ResultKt.throwOnFailure(r32)
            r4 = r32
            goto L_0x02b9
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            long r8 = r0.v
            java.util.List r2 = r0.o
            java.util.List r2 = (java.util.List) r2
            java.util.List r6 = r0.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.List r10 = r0.b
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = r0.a
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.x
            d14 r12 = (defpackage.d14) r12
            kotlin.ResultKt.throwOnFailure(r32)
            r4 = r32
            r29 = r6
            r6 = r2
            r2 = r29
            goto L_0x0212
        L_0x0058:
            long r8 = r0.v
            java.util.List r2 = r0.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.List r10 = r0.b
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = r0.a
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.x
            d14 r12 = (defpackage.d14) r12
            kotlin.ResultKt.throwOnFailure(r32)
            r5 = r32
            goto L_0x017f
        L_0x0071:
            kotlin.ResultKt.throwOnFailure(r32)
            java.lang.Object r2 = r0.x
            r12 = r2
            d14 r12 = (defpackage.d14) r12
            java.lang.String r2 = "checkUpdatesWorker"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            meb r2 = r0.y
            kotlin.Lazy r2 = r2.w
            java.lang.Object r2 = r2.getValue()
            doa r2 = (defpackage.doa) r2
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0389
            meb r2 = r0.y
            kotlin.Lazy r2 = r2.w
            java.lang.Object r2 = r2.getValue()
            doa r2 = (defpackage.doa) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x00a0
            goto L_0x0389
        L_0x00a0:
            meb r2 = r0.y
            kotlin.Lazy r2 = r2.v
            java.lang.Object r2 = r2.getValue()
            epa r2 = (defpackage.epa) r2
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            edb r2 = (defpackage.edb) r2
            java.lang.String[] r8 = defpackage.edb.f
            boolean r2 = r2.b(r8)
            if (r2 != 0) goto L_0x00c2
            java.lang.String r0 = "checkUpdates: no permission"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c2:
            meb r2 = r0.y
            r2.d()
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            long r8 = android.os.SystemClock.elapsedRealtime()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r8 = kotlin.time.DurationKt.toDuration((long) r8, (kotlin.time.DurationUnit) r2)
            meb r2 = r0.y
            android.content.Context r10 = r2.a
            m95 r2 = r2.c
            java.util.Collection r2 = defpackage.o54.o(r10, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r10.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L_0x00ec:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0138
            java.lang.Object r11 = r2.next()
            wdb r11 = (defpackage.wdb) r11
            xdb r14 = new xdb
            long r5 = r11.a
            int r15 = r11.b
            java.lang.String r13 = r11.c
            r27 = r8
            long r7 = r11.d
            java.lang.String r9 = r11.e
            java.lang.String r4 = r11.f
            r16 = r15
            java.lang.String r15 = r11.g
            int r11 = r11.h
            r17 = 0
            r22 = 0
            r19 = r13
            r13 = r14
            r32 = r2
            r2 = r14
            r25 = r15
            r20 = r16
            r14 = r17
            r16 = r5
            r18 = r20
            r20 = r7
            r23 = r9
            r24 = r4
            r26 = r11
            r13.<init>(r14, r16, r18, r19, r20, r22, r23, r24, r25, r26)
            r10.add(r2)
            r2 = r32
            r8 = r27
            r5 = 3
            r6 = 2
            r7 = 1
            goto L_0x00ec
        L_0x0138:
            r27 = r8
            boolean r2 = defpackage.e14.f(r12)
            if (r2 != 0) goto L_0x0143
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0143:
            meb r2 = r0.y
            kotlin.Lazy r2 = r2.o
            java.lang.Object r2 = r2.getValue()
            s74 r2 = (defpackage.s74) r2
            a74 r2 = (defpackage.a74) r2
            c7d r2 = r2.e
            java.util.ArrayList r2 = r2.e()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            meb r5 = r0.y
            r0.x = r12
            r0.a = r10
            r0.b = r2
            r0.c = r4
            r6 = r27
            r0.v = r6
            r8 = 1
            r0.w = r8
            r5.getClass()
            jeb r8 = new jeb
            r9 = 0
            r8.<init>(r10, r5, r2, r9)
            java.lang.Object r5 = defpackage.e14.d(r8, r0)
            if (r5 != r1) goto L_0x017b
            return r1
        L_0x017b:
            r8 = r6
            r11 = r10
            r10 = r2
            r2 = r4
        L_0x017f:
            java.util.List r5 = (java.util.List) r5
            boolean r4 = defpackage.e14.f(r12)
            if (r4 != 0) goto L_0x018a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x018a:
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r6 = r4.isEmpty()
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x01e7
            meb r6 = r0.y
            kotlin.Lazy r6 = r6.o
            java.lang.Object r6 = r6.getValue()
            s74 r6 = (defpackage.s74) r6
            a74 r6 = (defpackage.a74) r6
            c7d r6 = r6.e
            ueb r7 = r6.c()
            r13 = r5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r13, 10)
            r14.<init>(r15)
            java.util.Iterator r13 = r13.iterator()
        L_0x01b7:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x01cb
            java.lang.Object r15 = r13.next()
            xdb r15 = (defpackage.xdb) r15
            ydb r15 = defpackage.c7d.b(r6, r15)
            r14.add(r15)
            goto L_0x01b7
        L_0x01cb:
            i6d r6 = r7.a
            r6.b()
            r6.c()
            we4 r7 = r7.c     // Catch:{ all -> 0x01e2 }
            r7.c0(r14)     // Catch:{ all -> 0x01e2 }
            r6.r()     // Catch:{ all -> 0x01e2 }
            r6.l()
            r2.addAll(r4)
            goto L_0x01e7
        L_0x01e2:
            r0 = move-exception
            r6.l()
            throw r0
        L_0x01e7:
            meb r4 = r0.y
            r0.x = r12
            r6 = r11
            java.util.List r6 = (java.util.List) r6
            r0.a = r6
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            r0.b = r6
            r0.c = r2
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            r0.o = r6
            r0.v = r8
            r6 = 2
            r0.w = r6
            r4.getClass()
            heb r6 = new heb
            r7 = 0
            r6.<init>(r10, r4, r11, r7)
            java.lang.Object r4 = defpackage.e14.d(r6, r0)
            if (r4 != r1) goto L_0x0211
            return r1
        L_0x0211:
            r6 = r5
        L_0x0212:
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            boolean r4 = defpackage.e14.f(r12)
            if (r4 != 0) goto L_0x021e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x021e:
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r7 = r4.isEmpty()
            r13 = 1
            r7 = r7 ^ r13
            if (r7 == 0) goto L_0x0284
            meb r7 = r0.y
            kotlin.Lazy r7 = r7.o
            java.lang.Object r7 = r7.getValue()
            s74 r7 = (defpackage.s74) r7
            a74 r7 = (defpackage.a74) r7
            c7d r7 = r7.e
            ueb r7 = r7.c()
            r13 = r5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r13, 10)
            r14.<init>(r15)
            java.util.Iterator r13 = r13.iterator()
        L_0x024b:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0269
            java.lang.Object r15 = r13.next()
            xdb r15 = (defpackage.xdb) r15
            r16 = r10
            r17 = r11
            long r10 = r15.b
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r14.add(r10)
            r10 = r16
            r11 = r17
            goto L_0x024b
        L_0x0269:
            r16 = r10
            r17 = r11
            i6d r10 = r7.a
            r10.c()
            defpackage.ueb.a(r7, r14)     // Catch:{ all -> 0x027f }
            r10.r()     // Catch:{ all -> 0x027f }
            r10.l()
            r2.addAll(r4)
            goto L_0x0288
        L_0x027f:
            r0 = move-exception
            r10.l()
            throw r0
        L_0x0284:
            r16 = r10
            r17 = r11
        L_0x0288:
            meb r4 = r0.y
            r0.x = r12
            r0.a = r2
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r0.b = r7
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            r0.c = r7
            r7 = 0
            r0.o = r7
            r0.v = r8
            r10 = 3
            r0.w = r10
            r4.getClass()
            ieb r10 = new ieb
            r13 = r16
            r11 = r17
            r10.<init>(r11, r4, r13, r7)
            java.lang.Object r4 = defpackage.e14.d(r10, r0)
            if (r4 != r1) goto L_0x02b3
            return r1
        L_0x02b3:
            r29 = r8
            r8 = r2
            r1 = r29
            r9 = r12
        L_0x02b9:
            java.util.List r4 = (java.util.List) r4
            boolean r7 = defpackage.e14.f(r9)
            if (r7 != 0) goto L_0x02c4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02c4:
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r10 = r7.isEmpty()
            r11 = 1
            r10 = r10 ^ r11
            if (r10 == 0) goto L_0x0307
            meb r10 = r0.y
            kotlin.Lazy r10 = r10.o
            java.lang.Object r10 = r10.getValue()
            s74 r10 = (defpackage.s74) r10
            a74 r10 = (defpackage.a74) r10
            c7d r10 = r10.e
            j6d r11 = r10.a
            i6d r11 = r11.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r11 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r11
            ovb r12 = new ovb
            r13 = 15
            r12.<init>(r13, r4, r10)
            r11.q(r12)
            boolean r10 = defpackage.e14.f(r9)
            if (r10 != 0) goto L_0x02f8
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02f8:
            r8.addAll(r7)
            meb r7 = r0.y
            sv0 r7 = r7.b
            veb r10 = new veb
            r10.<init>()
            r7.c(r10)
        L_0x0307:
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x030c
            goto L_0x0335
        L_0x030c:
            boolean r10 = r7.c()
            if (r10 == 0) goto L_0x0335
            w78 r10 = defpackage.w78.o
            int r6 = r6.size()
            int r5 = r5.size()
            int r4 = r4.size()
            java.lang.String r11 = "updatePhones="
            java.lang.String r12 = ",deletedPhones="
            java.lang.String r13 = ",newPhones="
            java.lang.StringBuilder r5 = defpackage.a81.n(r11, r6, r12, r5, r13)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 0
            r7.d(r10, r3, r4, r5)
        L_0x0335:
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x033a
            goto L_0x0360
        L_0x033a:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0360
            w78 r5 = defpackage.w78.o
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.Companion
            long r6 = android.os.SystemClock.elapsedRealtime()
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.MILLISECONDS
            long r6 = kotlin.time.DurationKt.toDuration((long) r6, (kotlin.time.DurationUnit) r10)
            long r1 = kotlin.time.Duration.m1388minusLRDsOJo(r6, r1)
            java.lang.String r1 = kotlin.time.Duration.m1402toStringimpl(r1)
            java.lang.String r2 = "checkUpdates completed in time="
            java.lang.String r1 = defpackage.a81.m(r2, r1)
            r2 = 0
            r4.d(r5, r3, r1, r2)
        L_0x0360:
            boolean r1 = defpackage.e14.f(r9)
            if (r1 == 0) goto L_0x0386
            boolean r1 = r8.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0386
            meb r0 = r0.y
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.x
            java.util.Iterator r0 = r0.iterator()
        L_0x0376:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0386
            java.lang.Object r1 = r0.next()
            ceb r1 = (defpackage.ceb) r1
            r1.a(r8)
            goto L_0x0376
        L_0x0386:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0389:
            java.lang.String r0 = "checkUpdates: not authorized"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.geb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
