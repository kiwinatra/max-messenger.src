package defpackage;

import android.opengl.EGL14;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;

/* renamed from: in1  reason: default package */
public final class in1 extends md1 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final AtomicReference d = new AtomicReference((Object) null);
    public final ap0 e = new ap0(1);
    public final fj f = new fj(4, (byte) 0);
    public nd1 g;
    public final Object h = new Object();
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final jn1 l;

    public in1(String str) {
        this.a = EGL14.EGL_NO_SURFACE;
        this.b = str;
        this.j = a81.m("CallOpenGL_drawer_", str);
        this.l = new jn1(str, new ve(14, (Object) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = r5.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r5.k = null;
        r0 = m.decrementAndGet();
        r1 = r5.j;
        r5 = r5.b;
        r2.log(r1, "Instance " + r5 + " released. Remaining count is " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.h
            monitor-enter(r0)
            r1 = 0
            r5.i = r1     // Catch:{ all -> 0x0021 }
            nd1 r2 = r5.g     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0051
            voc r2 = r2.a     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x000f
            goto L_0x0051
        L_0x000f:
            r5.g = r1     // Catch:{ all -> 0x0021 }
            java.util.concurrent.atomic.AtomicReference r3 = r5.d     // Catch:{ all -> 0x0021 }
            java.lang.Object r3 = r3.getAndSet(r1)     // Catch:{ all -> 0x0021 }
            org.webrtc.VideoFrame r3 = (org.webrtc.VideoFrame) r3     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x0023
            r3.release()     // Catch:{ all -> 0x0021 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r5 = move-exception
            goto L_0x0053
        L_0x0023:
            monitor-exit(r0)
            org.webrtc.RendererCommon$GlDrawer r0 = r5.k
            if (r0 == 0) goto L_0x002b
            r0.release()
        L_0x002b:
            r5.k = r1
            java.util.concurrent.atomic.AtomicInteger r0 = m
            int r0 = r0.decrementAndGet()
            java.lang.String r1 = r5.j
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Instance "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = " released. Remaining count is "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.log(r1, r5)
            return
        L_0x0051:
            monitor-exit(r0)
            return
        L_0x0053:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in1.a():void");
    }

    public final void b(nd1 nd1, ld1 ld1) {
        boolean z;
        float f2;
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet((Object) null);
        if (videoFrame != null) {
            ap0 ap0 = this.e;
            synchronized (ap0) {
                long j2 = ap0.c;
                if (j2 > 0) {
                    if (j2 != LongCompanionObject.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        long j3 = ap0.b;
                        if (nanoTime >= j3) {
                            long j4 = j3 + ap0.c;
                            ap0.b = j4;
                            ap0.b = Math.max(j4, nanoTime);
                        }
                    }
                    z = false;
                }
                z = true;
            }
            if (z) {
                try {
                    int rotatedWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    float f3 = ((float) rotatedWidth) / ((float) rotatedHeight);
                    fj fjVar = this.f;
                    Float f4 = (Float) ((AtomicReference) fjVar.b).get();
                    if (Intrinsics.areEqual(f4, (float) c44.DEFAULT_ASPECT_RATIO)) {
                        f4 = Float.valueOf(f3);
                    }
                    float f5 = 1.0f;
                    if (f3 > f4.floatValue()) {
                        float floatValue = f4.floatValue() / f3;
                        f2 = 1.0f;
                        f5 = floatValue;
                    } else {
                        f2 = f3 / f4.floatValue();
                    }
                    nd1.b(ld1, this, videoFrame, new mg1(f5, f2, ((AtomicBoolean) fjVar.c).get()));
                    this.l.f++;
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        VoipVideoRenderer.drawerListener$lambda$1(((ydg) ((hn1) it.next())).a, rotatedWidth, rotatedHeight);
                    }
                } catch (Throwable th) {
                    videoFrame.release();
                    throw th;
                }
            }
            videoFrame.release();
        }
    }
}
