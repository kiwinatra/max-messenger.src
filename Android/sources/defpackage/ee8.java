package defpackage;

/* renamed from: ee8  reason: default package */
public final /* synthetic */ class ee8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae8 b;
    public final /* synthetic */ lfd c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ee8(ae8 ae8, lfd lfd, Object obj, int i) {
        this.a = i;
        this.b = ae8;
        this.c = lfd;
        this.d = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wsb r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            java.lang.Object r3 = r0.d
            lfd r4 = r0.c
            ae8 r5 = r0.b
            r6 = 24
            r7 = 0
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x017e;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.Object r0 = r1.a     // Catch:{ RemoteException -> 0x0177 }
            o3h r0 = (defpackage.o3h) r0     // Catch:{ RemoteException -> 0x0177 }
            android.os.Parcel r8 = r0.H0()     // Catch:{ RemoteException -> 0x0177 }
            r8.writeInt(r7)     // Catch:{ RemoteException -> 0x0177 }
            r8.writeInt(r7)     // Catch:{ RemoteException -> 0x0177 }
            r8.writeInt(r7)     // Catch:{ RemoteException -> 0x0177 }
            r8.writeInt(r7)     // Catch:{ RemoteException -> 0x0177 }
            r9 = 39
            r0.I0(r8, r9)     // Catch:{ RemoteException -> 0x0177 }
            er7 r0 = new er7
            r0.<init>((int) r6, (java.lang.Object) r1)
            vd8 r1 = new vd8
            r1.<init>(r0, r5, r4)
            f3a r3 = (defpackage.f3a) r3
            r3.K0 = r1
            qd8 r0 = r3.L0
            boolean r4 = r0.c
            boolean r5 = r0.d
            boolean r6 = r0.e
            java.lang.Object r8 = r3.b
            r15 = r8
            android.content.Context r15 = (android.content.Context) r15
            r1.j(r15, r6)
            er7 r6 = r1.d
            java.lang.Object r8 = r6.b
            wsb r8 = (defpackage.wsb) r8
            p3a r9 = r8.a0()
            r14 = 0
            if (r9 != 0) goto L_0x0059
            r9 = r14
            goto L_0x0064
        L_0x0059:
            z3a r9 = new z3a
            p3a r8 = r8.a0()
            r10 = 13
            r9.<init>(r10, r8)
        L_0x0064:
            if (r9 != 0) goto L_0x0067
            goto L_0x00ac
        L_0x0067:
            java.lang.Object r8 = r9.b
            p3a r8 = (defpackage.p3a) r8
            r8.getClass()
            java.lang.Object r8 = r8.a
            uzg r8 = (defpackage.uzg) r8
            android.os.Parcel r9 = r8.H0()     // Catch:{ RemoteException -> 0x0170 }
            int r10 = defpackage.hzg.a     // Catch:{ RemoteException -> 0x0170 }
            r9.writeInt(r4)     // Catch:{ RemoteException -> 0x0170 }
            r8.I0(r9, r2)     // Catch:{ RemoteException -> 0x0170 }
            android.os.Parcel r2 = r8.H0()     // Catch:{ RemoteException -> 0x0169 }
            r2.writeInt(r5)     // Catch:{ RemoteException -> 0x0169 }
            r4 = 5
            r8.I0(r2, r4)     // Catch:{ RemoteException -> 0x0169 }
            android.os.Parcel r2 = r8.H0()     // Catch:{ RemoteException -> 0x0162 }
            r2.writeInt(r5)     // Catch:{ RemoteException -> 0x0162 }
            r4 = 20
            r8.I0(r2, r4)     // Catch:{ RemoteException -> 0x0162 }
            android.os.Parcel r2 = r8.H0()     // Catch:{ RemoteException -> 0x015b }
            r2.writeInt(r7)     // Catch:{ RemoteException -> 0x015b }
            r4 = 18
            r8.I0(r2, r4)     // Catch:{ RemoteException -> 0x015b }
            android.os.Parcel r2 = r8.H0()     // Catch:{ RemoteException -> 0x0154 }
            r2.writeInt(r7)     // Catch:{ RemoteException -> 0x0154 }
            r4 = 3
            r8.I0(r2, r4)     // Catch:{ RemoteException -> 0x0154 }
        L_0x00ac:
            int r2 = r0.f
            r1.i(r2)
            double r9 = r0.a
            r4 = 3936146074321813504(0x36a0000000000000, double:1.401298464324817E-45)
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00da
            double r11 = r0.b
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00da
            float r2 = r0.g
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            float r2 = r0.h
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r0 = r0.i
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8 = r1
            r4 = r14
            r14 = r2
            r2 = r15
            r15 = r0
            r8.f(r9, r11, r13, r14, r15)
            goto L_0x00dc
        L_0x00da:
            r4 = r14
            r2 = r15
        L_0x00dc:
            qj0 r0 = new qj0
            r0.<init>(r1, r3)
            td8 r5 = new td8
            r5.<init>(r7, r0)
            java.lang.Object r0 = r6.b
            wsb r0 = (defpackage.wsb) r0
            r0.g0(r5)
            qj0 r5 = new qj0
            r5.<init>(r1, r3)
            lc5 r1 = new lc5
            r6 = 29
            r1.<init>((int) r6, (java.lang.Object) r5)
            r0.h0(r1)
            js9 r0 = defpackage.fu4.k
            fu4 r0 = r0.e(r2)
            k2b r0 = r0.f()
            p53 r0 = r0.g()
            p53 r1 = defpackage.p53.b
            if (r0 != r1) goto L_0x0116
            vd8 r0 = r3.K0
            int r1 = defpackage.nkc.google_map_night_style
            r0.h(r1, r2)
            goto L_0x0126
        L_0x0116:
            vd8 r0 = r3.K0
            ao1 r1 = r0.n
            defpackage.jbd.c(r1)
            er7 r0 = r0.d
            java.lang.Object r0 = r0.b
            wsb r0 = (defpackage.wsb) r0
            r0.f0(r4)
        L_0x0126:
            java.lang.Object r0 = r3.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x012e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0153
            java.lang.Object r1 = r0.next()
            g1a r1 = (defpackage.g1a) r1
            r1.b0()
            r1.a0()
            w58 r2 = r1.A0
            long r2 = r2.h
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x014d
            r1.d0(r2)
        L_0x014d:
            g68 r2 = r1.v
            r2.a(r1)
            goto L_0x012e
        L_0x0153:
            return
        L_0x0154:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0162:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0169:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0170:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0177:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x017e:
            er7 r0 = new er7
            r0.<init>((int) r6, (java.lang.Object) r1)
            vd8 r1 = new vd8
            r1.<init>(r0, r5, r4)
            de8 r3 = (defpackage.de8) r3
            q58 r3 = (defpackage.q58) r3
            r3.F0 = r1
            d9d r0 = new d9d
            r4 = 12
            r0.<init>(r4, r3)
            er7 r1 = r1.d
            r1.getClass()
            td8 r4 = new td8
            r4.<init>(r2, r0)
            java.lang.Object r0 = r1.b
            wsb r0 = (defpackage.wsb) r0
            java.lang.Object r0 = r0.a
            o3h r0 = (defpackage.o3h) r0
            zwg r1 = new zwg     // Catch:{ RemoteException -> 0x01bc }
            r1.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01bc }
            android.os.Parcel r2 = r0.H0()     // Catch:{ RemoteException -> 0x01bc }
            defpackage.hzg.c(r2, r1)     // Catch:{ RemoteException -> 0x01bc }
            r1 = 42
            r0.I0(r2, r1)     // Catch:{ RemoteException -> 0x01bc }
            r3.b()
            return
        L_0x01bc:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee8.a(wsb):void");
    }
}
