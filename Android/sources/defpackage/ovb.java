package defpackage;

/* renamed from: ovb  reason: default package */
public final /* synthetic */ class ovb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ovb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5, types: [int] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 7
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 3
            java.lang.String r4 = "RtcNotificationReceiver"
            r5 = 2
            r6 = 1
            r7 = 0
            int r8 = r15.a
            switch(r8) {
                case 0: goto L_0x04e6;
                case 1: goto L_0x04ac;
                case 2: goto L_0x048b;
                case 3: goto L_0x045c;
                case 4: goto L_0x042f;
                case 5: goto L_0x03e6;
                case 6: goto L_0x03a0;
                case 7: goto L_0x0377;
                case 8: goto L_0x035a;
                case 9: goto L_0x034e;
                case 10: goto L_0x0342;
                case 11: goto L_0x0334;
                case 12: goto L_0x0328;
                case 13: goto L_0x02cf;
                case 14: goto L_0x0262;
                case 15: goto L_0x0226;
                case 16: goto L_0x01c0;
                case 17: goto L_0x017e;
                case 18: goto L_0x0113;
                case 19: goto L_0x00e2;
                case 20: goto L_0x00b6;
                case 21: goto L_0x008a;
                case 22: goto L_0x0071;
                case 23: goto L_0x0065;
                case 24: goto L_0x0059;
                case 25: goto L_0x004d;
                case 26: goto L_0x0041;
                case 27: goto L_0x0035;
                case 28: goto L_0x0029;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r0 = r15.b
            t6e r0 = (defpackage.t6e) r0
            java.lang.Object r15 = r15.c
            d r15 = (defpackage.d) r15
            r0.getClass()
            v48 r15 = r15.x0
            if (r15 == 0) goto L_0x0023
            r15.j(r7)
        L_0x0023:
            org.webrtc.audio.JavaAudioDeviceModule r15 = r0.g
            r15.stopDeviceAudioShare()
            return
        L_0x0029:
            java.lang.Object r0 = r15.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r15 = r15.c
            ru.ok.android.externcalls.sdk.id.ParticipantId r15 = (ru.ok.android.externcalls.sdk.id.ParticipantId) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1(r0, r15)
            return
        L_0x0035:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r15 = r15.c
            uj1 r15 = (defpackage.uj1) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$7(r0, r15)
            return
        L_0x0041:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r15 = r15.c
            vj1 r15 = (defpackage.vj1) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.onRoomRemoved$lambda$3(r0, r15)
            return
        L_0x004d:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r15 = r15.c
            tj1 r15 = (defpackage.tj1) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$9(r0, r15)
            return
        L_0x0059:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r15 = r15.c
            wj1 r15 = (defpackage.wj1) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.onRoomUpdated$lambda$5(r0, r15)
            return
        L_0x0065:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r15 = r15.c
            ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager$OwnRoomsListener r15 = (ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener) r15
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.sendActualState$lambda$12(r0, r15)
            return
        L_0x0071:
            java.lang.Object r0 = r15.b
            lhd r0 = (defpackage.lhd) r0
            java.lang.Object r15 = r15.c
            u64 r15 = (defpackage.u64) r15
            pe6 r1 = r0.w
            r1.d(r15)
            boolean r1 = r0.x
            if (r1 == 0) goto L_0x0089
            if (r15 == 0) goto L_0x0089
            pe6 r15 = r0.w
            r15.e()
        L_0x0089:
            return
        L_0x008a:
            java.lang.Object r0 = r15.c
            t9d r0 = (defpackage.t9d) r0
            java.lang.Object r15 = r15.b
            n09 r15 = (defpackage.n09) r15
            java.lang.Object r1 = r15.a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x009a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r1.next()
            u9d r2 = (defpackage.u9d) r2
            r2.b(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009a
        L_0x00aa:
            r2 = move-exception
            java.lang.String r3 = "rtc.notification.handle.notificationreceived"
            java.lang.Object r5 = r15.c
            voc r5 = (defpackage.voc) r5
            r5.reportException(r4, r3, r2)
            goto L_0x009a
        L_0x00b5:
            return
        L_0x00b6:
            java.lang.Object r0 = r15.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r15 = r15.b
            n09 r15 = (defpackage.n09) r15
            java.lang.Object r1 = r15.a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00c6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r1.next()
            u9d r2 = (defpackage.u9d) r2
            r2.c(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00c6
        L_0x00d6:
            r2 = move-exception
            java.lang.String r3 = "rtc.notification.handle.notificationerror"
            java.lang.Object r5 = r15.c
            voc r5 = (defpackage.voc) r5
            r5.reportException(r4, r3, r2)
            goto L_0x00c6
        L_0x00e1:
            return
        L_0x00e2:
            java.lang.Object r0 = r15.b
            n09 r0 = (defpackage.n09) r0
            java.lang.Object r1 = r0.x
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x00f1
            goto L_0x0112
        L_0x00f1:
            java.lang.Object r1 = r0.y
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r2 = r1.get()
            u64 r2 = (defpackage.u64) r2
            java.lang.Object r15 = r15.c
            u64 r15 = (defpackage.u64) r15
            if (r2 == r15) goto L_0x0112
            r1.set(r15)
            java.lang.Object r0 = r0.z
            msg r0 = (defpackage.msg) r0
            if (r2 == 0) goto L_0x010d
            r2.c(r0)
        L_0x010d:
            if (r15 == 0) goto L_0x0112
            r15.a(r0)
        L_0x0112:
            return
        L_0x0113:
            java.lang.Object r0 = r15.b
            q9d r0 = (defpackage.q9d) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.j
            boolean r2 = r1.get()
            if (r2 == 0) goto L_0x0120
            goto L_0x017d
        L_0x0120:
            java.util.concurrent.atomic.AtomicReference r2 = r0.b
            java.lang.Object r3 = r2.get()
            u64 r3 = (defpackage.u64) r3
            java.lang.Object r15 = r15.c
            u64 r15 = (defpackage.u64) r15
            if (r3 != r15) goto L_0x012f
            goto L_0x017d
        L_0x012f:
            r2.set(r15)
            java.lang.String r4 = "Illegal 'listener' value: null"
            msg r5 = r0.d
            gtg r6 = r0.c
            if (r3 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x0145
            java.util.concurrent.CopyOnWriteArrayList r7 = r3.c
            r7.remove(r6)
            r3.c(r5)
            goto L_0x014b
        L_0x0145:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r4)
            throw r15
        L_0x014b:
            r0.a()
            if (r15 == 0) goto L_0x017d
            r15.a(r5)
            if (r6 == 0) goto L_0x0177
            java.util.concurrent.CopyOnWriteArrayList r3 = r15.c
            r3.add(r6)
            boolean r3 = r15.b()
            java.lang.Object r2 = r2.get()
            u64 r2 = (defpackage.u64) r2
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x017d
            if (r2 == r15) goto L_0x016d
            goto L_0x017d
        L_0x016d:
            if (r3 == 0) goto L_0x0173
            r0.b()
            goto L_0x017d
        L_0x0173:
            r0.a()
            goto L_0x017d
        L_0x0177:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r4)
            throw r15
        L_0x017d:
            return
        L_0x017e:
            java.lang.Object r0 = r15.b
            q9d r0 = (defpackage.q9d) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.j
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x018b
            goto L_0x01bf
        L_0x018b:
            long r1 = r0.k
            r3 = 1
            long r1 = r1 + r3
            r0.k = r1
            lsg r3 = new lsg
            java.lang.Object r15 = r15.c
            o9d r15 = (defpackage.o9d) r15
            voc r4 = r0.o
            r3.<init>(r1, r15, r4)
            android.util.LongSparseArray r4 = r0.l
            r4.put(r1, r3)
            o5h r3 = r0.n
            r3.getClass()
            ysg r4 = new ysg
            n9d r15 = r15.b
            r4.<init>(r3, r15, r7)
            java.lang.Object r15 = r3.c
            android.os.Handler r15 = (android.os.Handler) r15
            r15.post(r4)
            p9d r15 = new p9d
            r15.<init>(r0, r1, r7)
            android.os.Handler r0 = r0.f
            r0.post(r15)
        L_0x01bf:
            return
        L_0x01c0:
            java.lang.Object r0 = r15.b
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0225
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r7 = r1.longValue()
            java.lang.Object r1 = r15.c
            c7d r1 = (defpackage.c7d) r1
            ueb r1 = r1.c()
            i6d r4 = r1.a
            r4.b()
            uf9 r1 = r1.d
            gf6 r9 = r1.E()
            r9.k(r6, r7)
            long r7 = (long) r6
            r9.k(r5, r7)
            if (r2 != 0) goto L_0x0208
            r9.X(r3)
            goto L_0x020b
        L_0x0208:
            r9.h(r3, r2)
        L_0x020b:
            r4.c()     // Catch:{ all -> 0x0220 }
            r9.n()     // Catch:{ all -> 0x021b }
            r4.r()     // Catch:{ all -> 0x021b }
            r4.l()     // Catch:{ all -> 0x0220 }
            r1.S(r9)
            goto L_0x01cc
        L_0x021b:
            r15 = move-exception
            r4.l()     // Catch:{ all -> 0x0220 }
            throw r15     // Catch:{ all -> 0x0220 }
        L_0x0220:
            r15 = move-exception
            r1.S(r9)
            throw r15
        L_0x0225:
            return
        L_0x0226:
            java.lang.Object r0 = r15.b
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0230:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0261
            java.lang.Object r1 = r0.next()
            xdb r1 = (defpackage.xdb) r1
            java.lang.Object r2 = r15.c
            c7d r2 = (defpackage.c7d) r2
            ueb r3 = r2.c()
            ydb r1 = defpackage.c7d.b(r2, r1)
            i6d r2 = r3.a
            r2.b()
            r2.c()
            li r3 = r3.b     // Catch:{ all -> 0x025c }
            r3.c0(r1)     // Catch:{ all -> 0x025c }
            r2.r()     // Catch:{ all -> 0x025c }
            r2.l()
            goto L_0x0230
        L_0x025c:
            r15 = move-exception
            r2.l()
            throw r15
        L_0x0261:
            return
        L_0x0262:
            java.lang.Object r0 = r15.b
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x026e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02ce
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r1 = r1.getValue()
            xd9 r1 = (defpackage.xd9) r1
            java.lang.Object r4 = r15.c
            z6d r4 = (defpackage.z6d) r4
            aj9 r4 = r4.d()
            i6d r7 = r4.a
            r7.b()
            uf9 r8 = r4.m
            gf6 r9 = r8.E()
            hp9 r4 = r4.a()
            r4.getClass()
            byte[] r1 = defpackage.hp9.c(r1)
            if (r1 != 0) goto L_0x02ae
            r9.X(r6)
            goto L_0x02b1
        L_0x02ae:
            r9.l(r6, r1)
        L_0x02b1:
            r9.k(r5, r2)
            r7.c()     // Catch:{ all -> 0x02c9 }
            r9.n()     // Catch:{ all -> 0x02c4 }
            r7.r()     // Catch:{ all -> 0x02c4 }
            r7.l()     // Catch:{ all -> 0x02c9 }
            r8.S(r9)
            goto L_0x026e
        L_0x02c4:
            r15 = move-exception
            r7.l()     // Catch:{ all -> 0x02c9 }
            throw r15     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            r15 = move-exception
            r8.S(r9)
            throw r15
        L_0x02ce:
            return
        L_0x02cf:
            java.lang.Object r0 = r15.b
            ya8 r0 = (defpackage.ya8) r0
            int r1 = r0.k()
        L_0x02d7:
            if (r7 >= r1) goto L_0x0327
            long r8 = r0.h(r7)
            java.lang.Object r2 = r0.l(r7)
            mtb r2 = (defpackage.mtb) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0325
            java.lang.Object r4 = r15.c
            g6d r4 = (defpackage.g6d) r4
            ht3 r4 = r4.p()
            int r10 = r2.b
            i6d r11 = r4.a
            r11.b()
            mi r4 = r4.d
            gf6 r12 = r4.E()
            long r13 = (long) r10
            r12.k(r6, r13)
            int r2 = r2.a
            long r13 = (long) r2
            r12.k(r5, r13)
            r12.k(r3, r8)
            r11.c()     // Catch:{ all -> 0x0320 }
            r12.n()     // Catch:{ all -> 0x031b }
            r11.r()     // Catch:{ all -> 0x031b }
            r11.l()     // Catch:{ all -> 0x0320 }
            r4.S(r12)
            goto L_0x0325
        L_0x031b:
            r15 = move-exception
            r11.l()     // Catch:{ all -> 0x0320 }
            throw r15     // Catch:{ all -> 0x0320 }
        L_0x0320:
            r15 = move-exception
            r4.S(r12)
            throw r15
        L_0x0325:
            int r7 = r7 + r6
            goto L_0x02d7
        L_0x0327:
            return
        L_0x0328:
            java.lang.Object r0 = r15.b
            vzg r0 = (defpackage.vzg) r0
            java.lang.Object r15 = r15.c
            android.graphics.Typeface r15 = (android.graphics.Typeface) r15
            r0.A(r15)
            return
        L_0x0334:
            java.lang.Object r0 = r15.b
            zb0 r0 = (defpackage.zb0) r0
            tk3 r0 = r0.X
            java.lang.Object r15 = r15.c
            h8g r15 = (defpackage.h8g) r15
            r0.accept(r15)
            return
        L_0x0342:
            java.lang.Object r0 = r15.b
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            java.lang.Object r15 = r15.c
            java.lang.Runnable r15 = (java.lang.Runnable) r15
            r0.execute(r15)
            return
        L_0x034e:
            java.lang.Object r0 = r15.b
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl r0 = (ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl) r0
            java.lang.Object r15 = r15.c
            ig1 r15 = (defpackage.ig1) r15
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl.onRecordStarted$lambda$4(r0, r15)
            return
        L_0x035a:
            java.lang.Object r0 = r15.b
            wuc r0 = (defpackage.wuc) r0
            r0.getClass()
            java.lang.Object r15 = r15.c
            java.util.List r15 = (java.util.List) r15
            gb3 r15 = defpackage.jha.n(r15)
            uuc r1 = new uuc
            r1.<init>(r0, r7)
            wia r0 = new wia
            r0.<init>(r15, r1)
            r0.a()
            return
        L_0x0377:
            com.google.gson.Gson r0 = one.me.rlottie.RLottieDrawable.gson
            java.lang.Object r0 = r15.b
            one.me.rlottie.RLottieDrawable r0 = (one.me.rlottie.RLottieDrawable) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r0 = r0.C1
            r1.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x038b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x039f
            java.lang.Object r1 = r0.next()
            one.me.rlottie.RLottieDrawable$DrawableLoadListener r1 = (one.me.rlottie.RLottieDrawable.DrawableLoadListener) r1
            java.lang.Object r2 = r15.c
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.onError(r2)
            goto L_0x038b
        L_0x039f:
            return
        L_0x03a0:
            java.lang.Object r3 = r15.b
            d8c r3 = (defpackage.d8c) r3
            k77 r4 = r3.B0
            java.lang.Object r15 = r15.c
            snd r15 = (defpackage.snd) r15
            if (r4 != 0) goto L_0x03ae
            r4 = r15
            goto L_0x03b3
        L_0x03ae:
            me0 r4 = new me0
            r4.<init>(r1)
        L_0x03b3:
            r3.J0 = r4
            long r4 = r15.f()
            r3.K0 = r4
            boolean r4 = r3.Q0
            if (r4 != 0) goto L_0x03c8
            long r4 = r15.f()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x03c8
            r7 = r6
        L_0x03c8:
            r3.L0 = r7
            if (r7 == 0) goto L_0x03cd
            goto L_0x03ce
        L_0x03cd:
            r0 = r6
        L_0x03ce:
            r3.M0 = r0
            boolean r0 = r3.F0
            if (r0 == 0) goto L_0x03e2
            long r0 = r3.K0
            boolean r15 = r15.c()
            boolean r2 = r3.L0
            i8c r3 = r3.x
            r3.v(r0, r15, r2)
            goto L_0x03e5
        L_0x03e2:
            r3.m()
        L_0x03e5:
            return
        L_0x03e6:
            java.lang.Object r3 = r15.b
            c8c r3 = (defpackage.c8c) r3
            j77 r4 = r3.A0
            java.lang.Object r15 = r15.c
            rnd r15 = (defpackage.rnd) r15
            if (r4 != 0) goto L_0x03f4
            r4 = r15
            goto L_0x03f9
        L_0x03f4:
            tq5 r4 = new tq5
            r4.<init>(r1)
        L_0x03f9:
            r3.H0 = r4
            long r4 = r15.f()
            r3.I0 = r4
            long r4 = r3.O0
            r8 = -1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0412
            long r4 = r15.f()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0412
            r7 = r6
        L_0x0412:
            r3.J0 = r7
            if (r7 == 0) goto L_0x0417
            goto L_0x0418
        L_0x0417:
            r0 = r6
        L_0x0418:
            r3.K0 = r0
            long r0 = r3.I0
            boolean r15 = r15.c()
            boolean r2 = r3.J0
            h8c r4 = r3.x
            r4.q(r0, r15, r2)
            boolean r15 = r3.E0
            if (r15 != 0) goto L_0x042e
            r3.h()
        L_0x042e:
            return
        L_0x042f:
            java.lang.Object r0 = r15.b
            ru.ok.messages.views.widgets.ProfileTopPartView r0 = (ru.ok.messages.views.widgets.ProfileTopPartView) r0
            android.widget.TextView r1 = r0.e1
            android.text.TextPaint r2 = r1.getPaint()
            android.widget.TextView r3 = r0.e1
            int r3 = r3.getWidth()
            android.widget.TextView r4 = r0.e1
            int r4 = r4.getPaddingRight()
            int r3 = r3 - r4
            android.widget.TextView r0 = r0.e1
            int r0 = r0.getPaddingLeft()
            int r3 = r3 - r0
            float r0 = (float) r3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            java.lang.Object r15 = r15.c
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            java.lang.CharSequence r15 = android.text.TextUtils.ellipsize(r15, r2, r0, r3)
            r1.setText(r15)
            return
        L_0x045c:
            java.lang.Object r0 = r15.b
            androidx.profileinstaller.ProfileInstallerInitializer r0 = (androidx.profileinstaller.ProfileInstallerInitializer) r0
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = defpackage.a2c.a(r0)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.max(r2, r6)
            int r1 = r1.nextInt(r2)
            nn r2 = new nn
            java.lang.Object r15 = r15.c
            android.content.Context r15 = (android.content.Context) r15
            r3 = 4
            r2.<init>(r15, r3)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
        L_0x048b:
            java.lang.Object r0 = r15.b
            r5 = r0
            ru.ok.messages.views.widgets.profiledescription.ProfileDescriptionView r5 = (ru.ok.messages.views.widgets.profiledescription.ProfileDescriptionView) r5
            android.widget.EditText r6 = r5.b
            java.lang.Object r15 = r15.c
            android.widget.TextView r15 = (android.widget.TextView) r15
            int r0 = r15.getHeight()
            int r1 = r15.getPaddingTop()
            int r1 = r1 + r0
            int r15 = r15.getPaddingBottom()
            int r2 = r15 + r1
            r1 = 0
            r3 = 0
            r4 = 0
            defpackage.b59.x(r1, r2, r3, r4, r5, r6)
            return
        L_0x04ac:
            java.lang.Object r0 = r15.b
            qvb r0 = (defpackage.qvb) r0
            k3d r0 = r0.f
            r0.getClass()
            defpackage.ev0.g()
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x04bd
            goto L_0x04e5
        L_0x04bd:
            go1 r1 = r0.c
            fo1 r1 = r1.b
            boolean r1 = r1.isDone()
            java.lang.String r2 = "onImageCaptured() must be called before onFinalResult()"
            defpackage.bs0.r(r2, r1)
            r0.a()
            defpackage.ev0.g()
            rc0 r0 = r0.a
            r0.getClass()
            s6e r1 = new s6e
            java.lang.Object r15 = r15.c
            androidx.camera.core.ImageCaptureException r15 = (androidx.camera.core.ImageCaptureException) r15
            r2 = 9
            r1.<init>(r2, r0, r15)
            java.util.concurrent.Executor r15 = r0.b
            r15.execute(r1)
        L_0x04e5:
            return
        L_0x04e6:
            java.lang.Object r0 = r15.b
            qvb r0 = (defpackage.qvb) r0
            k3d r0 = r0.f
            r0.getClass()
            defpackage.ev0.g()
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x04f7
            goto L_0x050a
        L_0x04f7:
            rc0 r0 = r0.a
            r0.getClass()
            l9f r1 = new l9f
            java.lang.Object r15 = r15.c
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            r1.<init>(r0, r15)
            java.util.concurrent.Executor r15 = r0.b
            r15.execute(r1)
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovb.run():void");
    }
}
