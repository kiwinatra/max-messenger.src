package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "", "name", "<init>", "(Ljava/lang/String;)V", "Lnd1;", "renderer", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "", "init", "(Lnd1;Lorg/webrtc/RendererCommon$GlDrawer;)V", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "listener", "addFrameSizeListener", "(Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;)V", "removeFrameSizeListener", "", "mirror", "setMirror", "(Z)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "()V", "pauseVideo", "clearImage", "Lorg/webrtc/VideoFrame;", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "layoutAspectRatio", "setLayoutAspectRatio", "Landroid/view/Surface;", "surface", "createEglSurface", "(Landroid/view/Surface;)V", "Lkotlin/Function0;", "onDone", "releaseEglSurface", "(Lkotlin/jvm/functions/Function0;)V", "release", "Lin1;", "callVideoDrawer", "Lin1;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lhn1;", "drawerListener", "Lhn1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVoipVideoRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoipVideoRenderer.kt\nru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1855#2,2:74\n*S KotlinDebug\n*F\n+ 1 VoipVideoRenderer.kt\nru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer\n*L\n15#1:74,2\n*E\n"})
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final in1 callVideoDrawer;
    private final hn1 drawerListener = new ydg(this);
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new in1(str);
    }

    /* access modifiers changed from: private */
    public static final void drawerListener$lambda$1(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        for (VideoRendererInterface.FrameSizeListener onFrame : voipVideoRenderer.listeners) {
            onFrame.onFrame(i, i2);
        }
    }

    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.add(frameSizeListener);
    }

    public void clearImage() {
        in1 in1 = this.callVideoDrawer;
        synchronized (in1.h) {
            nd1 nd1 = in1.g;
            if (nd1 != null) {
                nd1.e.d(new bn7(5, in1));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public void createEglSurface(Surface surface) {
        in1 in1 = this.callVideoDrawer;
        synchronized (in1.h) {
            try {
                nd1 nd1 = in1.g;
                if (nd1 != null) {
                    nd1.a.log(in1.j, "External request for surface creation");
                    nd1.e.d(new o14(2, in1, surface));
                } else {
                    in1.i = surface;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(nd1 nd1, RendererCommon.GlDrawer glDrawer) {
        in1 in1 = this.callVideoDrawer;
        synchronized (in1.h) {
            try {
                if (in1.g == null) {
                    in1.g = nd1;
                    nd1.getClass();
                    nd1.e.d(new eug((md1) in1, (Object) glDrawer, nd1));
                    Surface surface = in1.i;
                    if (surface != null) {
                        nd1.a.log(in1.j, "Got postponed surface request, process and reset reference");
                        nd1.e.d(new o14(2, in1, surface));
                    }
                    in1.i = null;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        in1 in12 = this.callVideoDrawer;
        in12.c.add(this.drawerListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4 = (org.webrtc.VideoFrame) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r4.release();
        r3.l.d.incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r4) {
        /*
            r3 = this;
            in1 r3 = r3.callVideoDrawer
            jn1 r0 = r3.l
            java.util.concurrent.atomic.AtomicInteger r0 = r0.c
            r0.incrementAndGet()
            java.lang.Object r0 = r3.h
            monitor-enter(r0)
            nd1 r1 = r3.g     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)
            goto L_0x0038
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference r2 = r3.d     // Catch:{ all -> 0x0039 }
            r4.retain()     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r2.getAndSet(r4)     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x0027
            kug r2 = new kug     // Catch:{ all -> 0x0039 }
            r2.<init>((defpackage.md1) r3, (defpackage.nd1) r1)     // Catch:{ all -> 0x0039 }
            ld1 r1 = r1.e     // Catch:{ all -> 0x0039 }
            r1.c(r2)     // Catch:{ all -> 0x0039 }
        L_0x0027:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)
            org.webrtc.VideoFrame r4 = (org.webrtc.VideoFrame) r4
            if (r4 == 0) goto L_0x0038
            r4.release()
            jn1 r3 = r3.l
            java.util.concurrent.atomic.AtomicInteger r3 = r3.d
            r3.incrementAndGet()
        L_0x0038:
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void pauseVideo() {
        setFpsReduction(c44.DEFAULT_ASPECT_RATIO);
    }

    public void release() {
        in1 in1 = this.callVideoDrawer;
        in1.c.remove(this.drawerListener);
        in1 in12 = this.callVideoDrawer;
        synchronized (in12.h) {
            nd1 nd1 = in12.g;
            if (nd1 != null) {
                nd1.e.d(new kug(nd1, (md1) in12));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseEglSurface(kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
        /*
            r5 = this;
            in1 r5 = r5.callVideoDrawer
            java.lang.Object r0 = r5.h
            monitor-enter(r0)
            r1 = 0
            r5.i = r1     // Catch:{ all -> 0x0029 }
            nd1 r1 = r5.g     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x002b
            voc r2 = r1.a     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r5.j     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "External request for surface release"
            r2.log(r3, r4)     // Catch:{ all -> 0x0029 }
            eug r2 = new eug     // Catch:{ all -> 0x0029 }
            r2.<init>((defpackage.nd1) r1, (defpackage.md1) r5, (kotlin.jvm.functions.Function0) r6)     // Catch:{ all -> 0x0029 }
            ld1 r5 = r1.e     // Catch:{ all -> 0x0029 }
            boolean r5 = r5.d(r2)     // Catch:{ all -> 0x0029 }
            if (r5 != 0) goto L_0x0027
            if (r6 == 0) goto L_0x0027
            r6.invoke()     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0)
            goto L_0x0031
        L_0x0029:
            r5 = move-exception
            goto L_0x0032
        L_0x002b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)
            r6.invoke()
        L_0x0031:
            return
        L_0x0032:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer.releaseEglSurface(kotlin.jvm.functions.Function0):void");
    }

    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.remove(frameSizeListener);
    }

    public void setFpsReduction(float f) {
        ap0 ap0 = this.callVideoDrawer.e;
        synchronized (ap0) {
            try {
                long j = ap0.c;
                if (f <= c44.DEFAULT_ASPECT_RATIO) {
                    ap0.c = LongCompanionObject.MAX_VALUE;
                } else {
                    ap0.c = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
                }
                if (ap0.c != j) {
                    ap0.b = System.nanoTime();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        ((AtomicReference) this.callVideoDrawer.f.b).set(Float.valueOf(f));
    }

    public void setMirror(boolean z) {
        ((AtomicBoolean) this.callVideoDrawer.f.c).set(z);
    }
}
