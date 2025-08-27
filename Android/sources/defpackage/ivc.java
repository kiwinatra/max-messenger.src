package defpackage;

/* renamed from: ivc  reason: default package */
public final /* synthetic */ class ivc implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ivc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        r5 = (defpackage.cpe) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.lang.String r0 = "t4g"
            r1 = 0
            java.lang.Object r2 = r5.b
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f5;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00d2;
                case 5: goto L_0x008c;
                case 6: goto L_0x0056;
                case 7: goto L_0x004f;
                case 8: goto L_0x003d;
                case 9: goto L_0x002f;
                case 10: goto L_0x0023;
                case 11: goto L_0x0017;
                default: goto L_0x000a;
            }
        L_0x000a:
            ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview r2 = (ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview) r2
            or7 r5 = r2.x
            defpackage.jbd.c(r5)
            ru.ok.messages.video.widgets.VideoFramePreview r5 = r2.c
            r5.a(r1)
            return
        L_0x0017:
            j4g r2 = (defpackage.j4g) r2
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            java.lang.String r1 = "putConversionInRepository: success, videoConversion = %s"
            defpackage.z68.c(r0, r1, r5)
            return
        L_0x0023:
            k4g r2 = (defpackage.k4g) r2
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            java.lang.String r1 = "removeFromRepository: success, conversionData = %s"
            defpackage.z68.c(r0, r1, r5)
            return
        L_0x002f:
            bxf r2 = (defpackage.bxf) r2
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            java.lang.String r0 = "jxf"
            java.lang.String r1 = "putUploadInRepository: finished for upload=%s"
            defpackage.z68.c(r0, r1, r5)
            return
        L_0x003d:
            b33 r2 = (defpackage.b33) r2
            java.lang.Object r5 = r2.a
            jkd r5 = (defpackage.jkd) r5
            if (r5 == 0) goto L_0x004e
            android.view.MenuItem r5 = r5.c()
            if (r5 == 0) goto L_0x004e
            r5.expandActionView()
        L_0x004e:
            return
        L_0x004f:
            r5 = 1
            tcf r2 = (defpackage.tcf) r2
            r2.b(r5)
            return
        L_0x0056:
            ybf r2 = (defpackage.ybf) r2
            kotlin.Lazy r5 = r2.k
            java.lang.Object r5 = r5.getValue()
            vtd r5 = (defpackage.vtd) r5
            hs7 r5 = r5.j
            java.lang.Object r5 = r5.get()
            hba r5 = (defpackage.hba) r5
            r5.getClass()
            kotlin.reflect.KProperty[] r0 = defpackage.hba.b
            r0 = r0[r1]
            hs7 r5 = r5.a
            java.lang.Object r5 = r5.get()
            d18 r5 = (defpackage.d18) r5
            j18 r5 = (defpackage.j18) r5
            r5.getClass()
            java.lang.String r0 = "j18"
            java.lang.String r1 = "onLocationRequest"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            defpackage.j18.a()
            g68 r0 = r5.w0
            r0.a(r5)
            return
        L_0x008c:
            r1f r2 = (defpackage.r1f) r2
            a32 r5 = r2.n
            long r0 = r5.a
            r62 r5 = r2.c
            a32 r5 = r5.G(r0)
            r2.n = r5
            if (r5 != 0) goto L_0x009d
            goto L_0x00d1
        L_0x009d:
            a89 r5 = r5.c
            if (r5 == 0) goto L_0x00d1
            ha9 r5 = r5.a
            boolean r0 = r5.z()
            if (r0 != 0) goto L_0x00aa
            goto L_0x00d1
        L_0x00aa:
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r5.o
            long r0 = r0 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            goto L_0x00d1
        L_0x00b9:
            q10 r5 = r5.f()
            if (r5 != 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            p10 r0 = defpackage.p10.c
            p10 r5 = r5.a
            if (r5 == r0) goto L_0x00ce
            p10 r0 = defpackage.p10.o
            if (r5 == r0) goto L_0x00ce
            p10 r0 = defpackage.p10.b
            if (r5 != r0) goto L_0x00d1
        L_0x00ce:
            r2.e()
        L_0x00d1:
            return
        L_0x00d2:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            java.lang.String r0 = "vqe"
            java.lang.String r1 = "storeStickerSetsFromServer: success: %s"
            defpackage.z68.c(r0, r1, r5)
            return
        L_0x00e0:
            int r5 = ru.ok.messages.media.attaches.SharePreviewView.H0
            r5 = 8
            ru.ok.messages.media.attaches.SharePreviewView r2 = (ru.ok.messages.media.attaches.SharePreviewView) r2
            r2.setVisibility(r5)
            return
        L_0x00ea:
            a3e r2 = (defpackage.a3e) r2
            jwb r5 = r2.D0
            if (r5 != 0) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            r5.O0()
        L_0x00f4:
            return
        L_0x00f5:
            qjd r2 = (defpackage.qjd) r2
            r2.s()
            return
        L_0x00fb:
            kvc r2 = (defpackage.kvc) r2
            jvc r5 = r2.P0
            if (r5 == 0) goto L_0x0117
            t26 r5 = (defpackage.t26) r5
            java.lang.Object r5 = r5.z
            i7b r5 = (defpackage.i7b) r5
            if (r5 == 0) goto L_0x0117
            cpe r5 = (defpackage.cpe) r5
            bpe r0 = r5.G0
            if (r0 == 0) goto L_0x0117
            r0.m0()
            bpe r5 = r5.G0
            r5.f0()
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivc.run():void");
    }
}
