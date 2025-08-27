package defpackage;

import java.util.concurrent.ExecutorService;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: t6e  reason: default package */
public final class t6e {
    public final ExecutorService a;
    public final voc b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final zga e;
    public grg f;
    public JavaAudioDeviceModule g;
    public EglBase h;
    public final p6a i;
    public final dab j;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r3 = (defpackage.qr0) r7.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r7 = (defpackage.qr0) r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t6e(org.webrtc.EglBase r5, defpackage.voc r6, defpackage.te1 r7, defpackage.jl4 r8) {
        /*
            r4 = this;
            java.util.concurrent.ExecutorService r0 = defpackage.hz0.m2
            r4.<init>()
            r4.a = r0
            r4.b = r6
            r4.i = r8
            zga r1 = new zga
            org.webrtc.EglBase$Context r2 = r5.getEglBaseContext()
            r1.<init>(r2, r6)
            r4.e = r1
            dab r1 = new dab
            org.webrtc.EglBase$Context r2 = r5.getEglBaseContext()
            dm4 r7 = r7.w
            if (r7 == 0) goto L_0x0036
            java.lang.Object r3 = r7.b
            qr0 r3 = (defpackage.qr0) r3
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.a
            if (r3 != 0) goto L_0x0034
        L_0x002a:
            java.lang.Object r7 = r7.c
            qr0 r7 = (defpackage.qr0) r7
            if (r7 == 0) goto L_0x0036
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x0036
        L_0x0034:
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1.<init>(r2, r7, r6)
            r4.j = r1
            r8.b(r1)
            o6d r7 = new o6d
            r8 = 3
            r7.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r8)
            r0.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6e.<init>(org.webrtc.EglBase, voc, te1, jl4):void");
    }
}
