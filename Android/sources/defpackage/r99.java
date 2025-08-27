package defpackage;

/* renamed from: r99  reason: default package */
public final /* synthetic */ class r99 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r99(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r13v2, types: [kga] */
    /* JADX WARNING: type inference failed for: r5v15, types: [jga] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = 2
            r3 = 0
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x017c;
                case 1: goto L_0x0166;
                case 2: goto L_0x0143;
                case 3: goto L_0x006f;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r4 = r0.b
            wuc r4 = (defpackage.wuc) r4
            x23 r4 = r4.b
            qjd r4 = (defpackage.qjd) r4
            long r4 = r4.m()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r7 = r0.d
            java.util.List r7 = (java.util.List) r7
            int r8 = r7.size()
            r6.<init>(r8)
            r8 = r3
        L_0x0024:
            int r9 = r7.size()
            if (r8 >= r9) goto L_0x003c
            java.lang.Object r9 = r7.get(r8)
            ouc r9 = (defpackage.ouc) r9
            long r10 = (long) r8
            long r10 = r4 - r10
            luc r9 = defpackage.suc.a(r9, r10)
            r6.add(r9)
            int r8 = r8 + r1
            goto L_0x0024
        L_0x003c:
            java.lang.Object r0 = r0.c
            kuc r0 = (defpackage.kuc) r0
            i6d r1 = r0.a
            r1.c()
            fc2 r4 = new fc2     // Catch:{ all -> 0x006a }
            r5 = 12
            r4.<init>(r5, r0)     // Catch:{ all -> 0x006a }
            qa3 r5 = new qa3     // Catch:{ all -> 0x006a }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x006a }
            juc r4 = new juc     // Catch:{ all -> 0x006a }
            r4.<init>(r0, r6, r3)     // Catch:{ all -> 0x006a }
            qa3 r0 = new qa3     // Catch:{ all -> 0x006a }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x006a }
            na3 r2 = new na3     // Catch:{ all -> 0x006a }
            r2.<init>(r3, r5, r0)     // Catch:{ all -> 0x006a }
            r2.a()     // Catch:{ all -> 0x006a }
            r1.r()     // Catch:{ all -> 0x006a }
            r1.l()
            return
        L_0x006a:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x006f:
            java.lang.Object r4 = r0.b
            iac r4 = (defpackage.iac) r4
            java.lang.Object r5 = r0.c
            mj5 r5 = (defpackage.mj5) r5
            java.lang.Object r0 = r0.d
            cj5 r0 = (defpackage.cj5) r0
            r4.getClass()
            kotlin.reflect.KProperty[] r6 = defpackage.iac.z0
            r7 = 9
            r6 = r6[r7]
            hs7 r4 = r4.Z
            java.lang.Object r4 = r4.get()
            hga r4 = (defpackage.hga) r4
            monitor-enter(r4)
            if (r0 == 0) goto L_0x00c2
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r0)     // Catch:{ all -> 0x00bf }
            gj5 r7 = r4.b()     // Catch:{ all -> 0x00bf }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x00bf }
            j6d r7 = r7.a     // Catch:{ all -> 0x00bf }
            mka r7 = r7.n()     // Catch:{ all -> 0x00bf }
            pf6 r8 = defpackage.pf6.v     // Catch:{ all -> 0x00bf }
            wbe r7 = r7.i(r8)     // Catch:{ all -> 0x00bf }
            fj5 r8 = new fj5     // Catch:{ all -> 0x00bf }
            r8.<init>(r6, r3)     // Catch:{ all -> 0x00bf }
            na3 r6 = new na3     // Catch:{ all -> 0x00bf }
            r9 = 4
            r6.<init>(r9, r7, r8)     // Catch:{ all -> 0x00bf }
            dbe r7 = defpackage.dbe.v     // Catch:{ all -> 0x00bf }
            bb3 r6 = r6.h(r7)     // Catch:{ all -> 0x00bf }
            na3 r7 = new na3     // Catch:{ all -> 0x00bf }
            r7.<init>(r6)     // Catch:{ all -> 0x00bf }
            r7.a()     // Catch:{ all -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            r0 = move-exception
            goto L_0x0141
        L_0x00c2:
            long r11 = r5.a     // Catch:{ all -> 0x00bf }
            long r13 = r5.b     // Catch:{ all -> 0x00bf }
            pga r5 = r4.d()     // Catch:{ all -> 0x00bf }
            wbe r15 = r5.b()     // Catch:{ all -> 0x00bf }
            ap0 r9 = new ap0     // Catch:{ all -> 0x00bf }
            r6 = 10
            r5 = r9
            r7 = r11
            r3 = r9
            r9 = r13
            r5.<init>((int) r6, (long) r7, (long) r9)     // Catch:{ all -> 0x00bf }
            wh8 r9 = new wh8     // Catch:{ all -> 0x00bf }
            r9.<init>(r2, r15, r3)     // Catch:{ all -> 0x00bf }
            ap0 r2 = new ap0     // Catch:{ all -> 0x00bf }
            r6 = 9
            r5 = r2
            r7 = r11
            r3 = r9
            r9 = r13
            r5.<init>((int) r6, (long) r7, (long) r9)     // Catch:{ all -> 0x00bf }
            si8 r5 = new si8     // Catch:{ all -> 0x00bf }
            gga r6 = defpackage.m58.f     // Catch:{ all -> 0x00bf }
            dj6 r7 = defpackage.m58.e     // Catch:{ all -> 0x00bf }
            r5.<init>(r3, r6, r2, r7)     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r5.b()     // Catch:{ all -> 0x00bf }
            mga r2 = (defpackage.mga) r2     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x0129
            hx4 r12 = r2.e     // Catch:{ all -> 0x00bf }
            if (r12 == 0) goto L_0x010b
            jga r3 = new jga     // Catch:{ all -> 0x00bf }
            long r6 = r2.a     // Catch:{ all -> 0x00bf }
            long r8 = r2.b     // Catch:{ all -> 0x00bf }
            long r10 = r2.c     // Catch:{ all -> 0x00bf }
            r5 = r3
            r5.<init>(r6, r8, r10, r12)     // Catch:{ all -> 0x00bf }
            goto L_0x012a
        L_0x010b:
            kga r3 = new kga     // Catch:{ all -> 0x00bf }
            java.lang.Boolean r5 = r2.d     // Catch:{ all -> 0x00bf }
            if (r5 == 0) goto L_0x0118
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00bf }
            r18 = r5
            goto L_0x011a
        L_0x0118:
            r18 = 0
        L_0x011a:
            long r14 = r2.a     // Catch:{ all -> 0x00bf }
            long r5 = r2.b     // Catch:{ all -> 0x00bf }
            long r7 = r2.c     // Catch:{ all -> 0x00bf }
            r13 = r3
            r16 = r5
            r19 = r7
            r13.<init>(r14, r16, r18, r19)     // Catch:{ all -> 0x00bf }
            goto L_0x012a
        L_0x0129:
            r3 = 0
        L_0x012a:
            if (r3 == 0) goto L_0x013f
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r3)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0138
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x013c
        L_0x0138:
            java.util.List r0 = r4.a(r2)     // Catch:{ all -> 0x00bf }
        L_0x013c:
            r4.e(r2, r0, r1)     // Catch:{ all -> 0x00bf }
        L_0x013f:
            monitor-exit(r4)
            return
        L_0x0141:
            monitor-exit(r4)     // Catch:{ all -> 0x00bf }
            throw r0
        L_0x0143:
            java.lang.Object r2 = r0.b
            z0a r2 = (defpackage.z0a) r2
            r2.getClass()
            java.lang.Object r3 = r0.d
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r0 = r0.c
            kwd r0 = (defpackage.kwd) r0
            r0.f = r3
            dfb r0 = r0.c()
            r2.z = r0
            r2.a0()
            t0a r0 = new t0a
            r0.<init>(r2, r1)
            r2.c0(r0)
            return
        L_0x0166:
            java.lang.Object r1 = r0.b
            sd3 r1 = (defpackage.sd3) r1
            java.lang.Object r1 = r1.e
            jb9 r1 = (defpackage.jb9) r1
            if (r1 == 0) goto L_0x017b
            java.lang.Object r2 = r0.c
            long[] r2 = (long[]) r2
            java.lang.Object r0 = r0.d
            long[] r0 = (long[]) r0
            r1.v1(r2, r0)
        L_0x017b:
            return
        L_0x017c:
            int r1 = ru.ok.messages.constructor.MessageConstructorView.U0
            java.lang.Object r1 = r0.b
            ru.ok.messages.constructor.MessageConstructorView r1 = (ru.ok.messages.constructor.MessageConstructorView) r1
            r1.getClass()
            java.lang.Object r3 = r0.c
            xv0 r3 = (defpackage.xv0) r3
            fw0 r3 = r3.b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0192
            goto L_0x01cb
        L_0x0192:
            s99 r1 = r1.w
            if (r1 == 0) goto L_0x01cb
            l2a r1 = (defpackage.l2a) r1
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01a0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r3 = r1.next()
            k0a r3 = (defpackage.k0a) r3
            lk3 r4 = r3.o
            r4.getClass()
            r4 = 7
            kk3 r5 = new kk3
            r5.<init>((int) r4)
            kk3 r4 = r5.a()
            r3.c0(r4)
            a0 r4 = new a0
            java.lang.Object r5 = r0.d
            dw0 r5 = (defpackage.dw0) r5
            r4.<init>(r2, r5)
            r3.V(r4)
            goto L_0x01a0
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r99.run():void");
    }
}
