package defpackage;

/* renamed from: jf6  reason: default package */
public final class jf6 extends dce {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jf6(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [jk3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v6, types: [l15, java.lang.Object] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 172 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x014b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.q4 r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 5
            r2 = 20
            int r3 = r13.b
            switch(r3) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0029;
                default: goto L_0x0009;
            }
        L_0x0009:
            a33 r0 = new a33
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r14.g(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r13 = r13.c
            kotlin.Lazy r13 = (kotlin.Lazy) r13
            java.lang.Object r13 = r13.getValue()
            tn4 r13 = (defpackage.tn4) r13
            java.lang.Class<fn5> r2 = defpackage.fn5.class
            java.lang.Object r14 = r14.g(r2)
            fn5 r14 = (defpackage.fn5) r14
            r0.<init>(r1, r13, r14)
            return r0
        L_0x0029:
            no0 r0 = new no0
            java.lang.Class<ba7> r1 = defpackage.ba7.class
            kotlin.Lazy r1 = r14.h(r1)
            java.lang.Class<ea7> r2 = defpackage.ea7.class
            kotlin.Lazy r14 = r14.h(r2)
            java.lang.Object r13 = r13.c
            g43 r13 = (defpackage.g43) r13
            r0.<init>(r13, r1, r14)
            return r0
        L_0x003f:
            java.lang.Object r3 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Class<jtb> r4 = defpackage.jtb.class
            java.lang.Object r4 = r14.g(r4)
            jtb r4 = (defpackage.jtb) r4
            ltb r4 = (defpackage.ltb) r4
            a33 r4 = r4.a
            java.lang.String r5 = "app.debug.fresco"
            ls7 r4 = r4.g
            r6 = 0
            boolean r4 = r4.getBoolean(r5, r6)
            r3.set(r4)
            pf6 r3 = defpackage.pf6.b
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Object r4 = r14.g(r4)
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class<da7> r5 = defpackage.da7.class
            java.lang.Object r5 = r14.g(r5)
            da7 r5 = (defpackage.da7) r5
            java.lang.Class<aua> r7 = defpackage.aua.class
            java.lang.Object r14 = r14.g(r7)
            aua r14 = (defpackage.aua) r14
            java.lang.Object r13 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r13 = (java.util.concurrent.atomic.AtomicBoolean) r13
            k38 r7 = new k38
            r7.<init>()
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            cg5 r8 = defpackage.cg5.b
            r8.getClass()
            boolean r8 = r13.get()
            if (r8 == 0) goto L_0x0091
            r8 = 2
            goto L_0x0092
        L_0x0091:
            r8 = 6
        L_0x0092:
            cg5 r9 = defpackage.bg5.a
            r9.a = r8
            u9a r8 = new u9a
            r9 = 12
            r8.<init>(r9)
            defpackage.tf6.a = r8
            defpackage.ea7.j(r5)
            ea7 r8 = defpackage.ea7.g()
            ay2 r9 = new ay2
            r9.<init>((int) r1)
            jk3 r1 = new jk3
            r1.<init>()
            nf6 r10 = new nf6
            r10.<init>(r13)
            r1.b = r10
            r1.c = r9
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00bf:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00e0
            java.lang.Object r10 = r7.next()
            tu4 r10 = (defpackage.tu4) r10
            java.lang.Object r11 = r1.a
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 != 0) goto L_0x00d8
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1.a = r11
        L_0x00d8:
            java.lang.Object r11 = r1.a
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r10)
            goto L_0x00bf
        L_0x00e0:
            l15 r7 = new l15
            r7.<init>()
            java.lang.Object r10 = r1.a
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x00f1
            a00 r11 = new a00
            r11.<init>(r10)
            goto L_0x00f2
        L_0x00f1:
            r11 = r0
        L_0x00f2:
            r7.a = r11
            java.lang.Object r10 = r1.b
            r2f r10 = (defpackage.r2f) r10
            if (r10 == 0) goto L_0x00fb
            goto L_0x0104
        L_0x00fb:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            m74 r11 = new m74
            r12 = 3
            r11.<init>(r12, r10)
            r10 = r11
        L_0x0104:
            r7.c = r10
            java.lang.Object r1 = r1.c
            ay2 r1 = (defpackage.ay2) r1
            r7.b = r1
            defpackage.tf6.P()
            boolean r1 = defpackage.ld9.q
            r10 = 1
            if (r1 == 0) goto L_0x011a
            cg5 r1 = defpackage.bg5.a
            r1.getClass()
            goto L_0x011c
        L_0x011a:
            defpackage.ld9.q = r10
        L_0x011c:
            defpackage.j4b.B = r10
            java.lang.Class<o5a> r1 = defpackage.o5a.class
            monitor-enter(r1)
            p5a r11 = defpackage.o5a.a     // Catch:{ all -> 0x01e2 }
            if (r11 == 0) goto L_0x0126
            r6 = r10
        L_0x0126:
            monitor-exit(r1)     // Catch:{ all -> 0x01e2 }
            if (r6 != 0) goto L_0x0173
            defpackage.tf6.P()
            java.lang.String r1 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x015d, InvocationTargetException -> 0x0154, NoSuchMethodException -> 0x014b }
            java.lang.String r6 = "init"
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x015d, InvocationTargetException -> 0x0154, NoSuchMethodException -> 0x014b }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r10)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x015d, InvocationTargetException -> 0x0154, NoSuchMethodException -> 0x014b }
            java.lang.Object[] r6 = new java.lang.Object[]{r4}     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x015d, InvocationTargetException -> 0x0154, NoSuchMethodException -> 0x014b }
            r1.invoke(r0, r6)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x015d, InvocationTargetException -> 0x0154, NoSuchMethodException -> 0x014b }
        L_0x0145:
            defpackage.tf6.P()
            goto L_0x0173
        L_0x0149:
            r13 = move-exception
            goto L_0x016f
        L_0x014b:
            djd r0 = new djd     // Catch:{ all -> 0x0149 }
            r0.<init>((int) r2)     // Catch:{ all -> 0x0149 }
            defpackage.o5a.G(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0145
        L_0x0154:
            djd r0 = new djd     // Catch:{ all -> 0x0149 }
            r0.<init>((int) r2)     // Catch:{ all -> 0x0149 }
            defpackage.o5a.G(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0145
        L_0x015d:
            djd r0 = new djd     // Catch:{ all -> 0x0149 }
            r0.<init>((int) r2)     // Catch:{ all -> 0x0149 }
            defpackage.o5a.G(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0145
        L_0x0166:
            djd r0 = new djd     // Catch:{ all -> 0x0149 }
            r0.<init>((int) r2)     // Catch:{ all -> 0x0149 }
            defpackage.o5a.G(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0145
        L_0x016f:
            defpackage.tf6.P()
            throw r13
        L_0x0173:
            android.content.Context r0 = r4.getApplicationContext()
            if (r5 != 0) goto L_0x0195
            java.lang.Class<ea7> r1 = defpackage.ea7.class
            monitor-enter(r1)
            defpackage.tf6.P()     // Catch:{ all -> 0x0193 }
            ca7 r2 = new ca7     // Catch:{ all -> 0x0193 }
            r2.<init>(r0)     // Catch:{ all -> 0x0193 }
            da7 r5 = new da7     // Catch:{ all -> 0x0193 }
            r5.<init>(r2)     // Catch:{ all -> 0x0193 }
            defpackage.ea7.j(r5)     // Catch:{ all -> 0x0193 }
            defpackage.tf6.P()     // Catch:{ all -> 0x0193 }
            monitor-exit(r1)
            goto L_0x0198
        L_0x0191:
            monitor-exit(r1)     // Catch:{ all -> 0x0193 }
            throw r13
        L_0x0193:
            r13 = move-exception
            goto L_0x0191
        L_0x0195:
            defpackage.ea7.j(r5)
        L_0x0198:
            defpackage.tf6.P()
            lnb r1 = new lnb
            r1.<init>(r7, r0)
            defpackage.ld9.p = r1
            com.facebook.drawee.view.SimpleDraweeView.z = r1
            defpackage.tf6.P()
            defpackage.tf6.P()
            android.content.res.Resources r0 = r4.getResources()
            pk4 r1 = defpackage.pk4.x()
            xc4 r2 = r8.a()
            da7 r4 = r8.b
            f7a r4 = r4.v
            r4.getClass()
            of6 r4 = new of6
            java.util.concurrent.ExecutorService r14 = r14.a()
            r4.<init>(r14)
            zqd r14 = r8.d()
            java.lang.Object r5 = r7.a
            a00 r5 = (defpackage.a00) r5
            nf6 r6 = new nf6
            r6.<init>(r13)
            r9.b = r0
            r9.c = r1
            r9.o = r2
            r9.v = r4
            r9.w = r14
            r9.x = r5
            r9.y = r6
            return r3
        L_0x01e2:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01e2 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf6.b(q4):java.lang.Object");
    }
}
