package defpackage;

/* renamed from: yo1  reason: default package */
public final class yo1 implements o9c {
    public final /* synthetic */ ap1 a;

    public yo1(ap1 ap1) {
        this.a = ap1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r0.a.l() == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            ap1 r9 = r9.a
            h9b r0 = r9.d
            v9b r0 = (defpackage.v9b) r0
            y8b r0 = r0.c()
            m01 r1 = r9.b
            o01 r1 = (defpackage.o01) r1
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r1 = r1.b()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = r1.getDeviceType()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "speakerphone"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            kgd r2 = r9.h
            boolean r2 = r2.c()
            dp1 r3 = r9.a
            mp1 r3 = (defpackage.mp1) r3
            s44 r3 = r3.j()
            boolean r3 = r3.h
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0049
            h9b r3 = r9.d
            v9b r3 = (defpackage.v9b) r3
            etc r3 = r3.Y
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            i9b r3 = (defpackage.i9b) r3
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r5
        L_0x004a:
            ahd r6 = r9.i
            r7 = r6
            chd r7 = (defpackage.chd) r7
            xme r7 = r7.v
            java.lang.Object r7 = r7.getValue()
            dhd r7 = (defpackage.dhd) r7
            ehd r7 = r7.a
            ehd r8 = defpackage.ehd.a
            if (r7 != r8) goto L_0x0084
            chd r6 = (defpackage.chd) r6
            xme r6 = r6.v
            java.lang.Object r6 = r6.getValue()
            dhd r6 = (defpackage.dhd) r6
            zgd r6 = r6.b
            if (r6 == 0) goto L_0x006e
            ze1 r6 = r6.c
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            cf1 r7 = r0.a
            ze1 r7 = r7.getId()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x0085
            cf1 r0 = r0.a
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r5 = r4
        L_0x0085:
            p9c r9 = r9.j
            if (r3 != 0) goto L_0x00a8
            if (r1 != 0) goto L_0x00a8
            if (r2 != 0) goto L_0x00a8
            if (r5 == 0) goto L_0x0090
            goto L_0x00a8
        L_0x0090:
            r9.getClass()
            android.os.PowerManager$WakeLock r9 = r9.f     // Catch:{ Exception -> 0x009b }
            if (r9 == 0) goto L_0x00a7
            r9.acquire()     // Catch:{ Exception -> 0x009b }
            goto L_0x00a7
        L_0x009b:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "ProximityHelperTag"
            defpackage.z68.h(r2, r9, r0, r1)
        L_0x00a7:
            return
        L_0x00a8:
            r9.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo1.a():void");
    }

    public final void b() {
        this.a.j.c();
    }
}
