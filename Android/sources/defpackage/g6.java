package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: g6  reason: default package */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ g6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0036;
                case 2: goto L_0x0032;
                case 3: goto L_0x002b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0017;
                case 6: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.view.View r3 = r0.I0
            java.util.WeakHashMap r0 = defpackage.gag.a
            defpackage.t9g.c(r3)
            return
        L_0x000f:
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r3 = r0.J0
            java.util.WeakHashMap r0 = defpackage.gag.a
            defpackage.t9g.c(r3)
            return
        L_0x0017:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            r0.G(r0)
            return
        L_0x001d:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.invalidate()
            return
        L_0x002b:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.W0
            r3 = 0
            r0.k0(r3)
            return
        L_0x0032:
            r0.startPostponedEnterTransition()
            return
        L_0x0036:
            defpackage.g6.super.finish()
            return
        L_0x003a:
            ju8 r3 = r0.O0
            if (r3 == 0) goto L_0x004f
            dm4 r3 = r0.x
            java.lang.Object r3 = r3.b
            id3 r3 = (defpackage.id3) r3
            qra r3 = (defpackage.qra) r3
            mu8 r3 = r3.t()
            ju8 r1 = r0.O0
            r3.o(r1)
        L_0x004f:
            ju8 r3 = r0.P0
            if (r3 == 0) goto L_0x0064
            dm4 r3 = r0.x
            java.lang.Object r3 = r3.b
            id3 r3 = (defpackage.id3) r3
            qra r3 = (defpackage.qra) r3
            mu8 r3 = r3.t()
            ju8 r1 = r0.P0
            r3.o(r1)
        L_0x0064:
            it8 r3 = r0.D0
            if (r3 == 0) goto L_0x00ac
            java.util.ArrayList r3 = r0.z0
            int r1 = r3.size()
            if (r1 != 0) goto L_0x0071
            goto L_0x00ac
        L_0x0071:
            int r1 = r0.A0
            java.lang.Object r3 = r3.get(r1)
            d48 r3 = (defpackage.d48) r3
            if (r3 != 0) goto L_0x007c
            goto L_0x00ac
        L_0x007c:
            it8 r0 = r0.D0
            long r1 = r3.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r3 = r0.H(r1)
            boolean r0 = r3 instanceof ru.ok.messages.media.mediabar.FrgLocalVideo
            if (r0 == 0) goto L_0x00ac
            ru.ok.messages.media.mediabar.FrgLocalVideo r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3
            b1a r0 = r3.K1
            if (r0 != 0) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            ju8 r3 = r3.I1
            m48 r3 = (defpackage.m48) r3
            r3.g = r0
            f4g r0 = r3.f
            if (r0 == 0) goto L_0x00ac
            int r0 = r3.j()
            int r1 = r3.h()
            int r2 = r3.i()
            iu8 r3 = r3.e
            if (r3 == 0) goto L_0x00ac
            r3.k(r0, r1, r2)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.run():void");
    }
}
