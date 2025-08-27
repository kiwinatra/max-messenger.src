package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;

/* renamed from: of2  reason: default package */
public final class of2 extends e54 {
    public final zx3 Z;
    public final String v0 = "chatMediaViewer";
    public final ov w0;

    public of2(zx3 zx3, ExecutorService executorService) {
        super(zx3, 0);
        this.Z = zx3;
        y35 y35 = new y35(2, (Object) this);
        w63 w63 = new w63(11);
        if (executorService == null) {
            synchronized (n79.c) {
                try {
                    if (n79.d == null) {
                        n79.d = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            executorService = n79.d;
        }
        this.w0 = new ov(y35, new dm4(3, (Object) executorService, (Object) w63));
    }

    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r0v9, types: [one.me.chatmedia.viewer.video.VideoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v10, types: [one.me.chatmedia.viewer.photo.PhotoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v11, types: [one.me.chatmedia.viewer.photo.GifViewerWidget] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r14 = r14.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(defpackage.e9d r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r14.n()
            if (r0 == 0) goto L_0x0042
            java.lang.Class<of2> r13 = defpackage.of2.class
            java.lang.String r13 = r13.getName()
            a67 r15 = defpackage.z68.b
            if (r15 != 0) goto L_0x0011
            goto L_0x0041
        L_0x0011:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0041
            w78 r0 = defpackage.w78.o
            java.util.ArrayList r14 = r14.e()
            java.lang.Object r14 = kotlin.collections.CollectionsKt.lastOrNull(r14)
            i9d r14 = (defpackage.i9d) r14
            r1 = 0
            if (r14 == 0) goto L_0x002f
            zx3 r14 = r14.a
            if (r14 == 0) goto L_0x002f
            zx3 r14 = r14.getTargetController()
            goto L_0x0030
        L_0x002f:
            r14 = r1
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Media viewer. Configure router | root exist | target exist:"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r15.d(r0, r13, r14, r1)
        L_0x0041:
            return
        L_0x0042:
            ov r0 = r13.w0
            java.util.List r0 = r0.f
            java.lang.Object r15 = kotlin.collections.CollectionsKt.getOrNull(r0, r15)
            hr8 r15 = (defpackage.hr8) r15
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            long r1 = r15.m()
            java.lang.String r3 = r15.v()
            boolean r0 = r15 instanceof defpackage.yq8
            if (r0 == 0) goto L_0x0076
            yq8 r15 = (defpackage.yq8) r15
            boolean r15 = r15.v
            if (r15 == 0) goto L_0x006c
            one.me.chatmedia.viewer.photo.GifViewerWidget r15 = new one.me.chatmedia.viewer.photo.GifViewerWidget
            java.lang.String r4 = r13.v0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
        L_0x006a:
            r7 = r15
            goto L_0x0084
        L_0x006c:
            one.me.chatmedia.viewer.photo.PhotoViewerWidget r15 = new one.me.chatmedia.viewer.photo.PhotoViewerWidget
            java.lang.String r4 = r13.v0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0076:
            boolean r15 = r15 instanceof defpackage.fr8
            if (r15 == 0) goto L_0x009d
            one.me.chatmedia.viewer.video.VideoViewerWidget r15 = new one.me.chatmedia.viewer.video.VideoViewerWidget
            java.lang.String r4 = r13.v0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0084:
            zx3 r13 = r13.Z
            r7.setTargetController(r13)
            yx3 r13 = defpackage.yx3.b
            r7.setRetainViewMode(r13)
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.R(r13)
            return
        L_0x009d:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of2.G(e9d, int):void");
    }

    public final int j() {
        return this.w0.f.size();
    }

    public final long k(int i) {
        hr8 hr8 = (hr8) CollectionsKt.getOrNull(this.w0.f, i);
        if (hr8 != null) {
            return hr8.getItemId();
        }
        return 0;
    }
}
