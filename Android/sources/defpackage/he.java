package defpackage;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.widget.ImageView;
import androidx.work.WorkRequest;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.webrtc.IceCandidate;
import ru.ok.tamtam.nano.Protos;

/* renamed from: he  reason: default package */
public final class he implements ja7, gn8, mj6, gce, nj6, t0d {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object o;

    public he() {
        this.a = 21;
        this.o = new Object();
    }

    public static void d(ImageView imageView, int i) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        IntEvaluator intEvaluator = new IntEvaluator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new jbc(atomicBoolean, i, imageView, intEvaluator, 0));
        ofFloat.addListener(new n33(3));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public static boolean j(vy4 vy4, vy4 vy42) {
        bs0.r("Fully specified range is not actually fully specified.", vy42.b());
        int i = vy4.a;
        int i2 = vy42.a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = vy4.b;
        return i3 == 0 || i3 == vy42.b;
    }

    public static boolean l(vy4 vy4, vy4 vy42, HashSet hashSet) {
        if (hashSet.contains(vy42)) {
            return j(vy4, vy42);
        }
        vy4.toString();
        vy42.toString();
        return false;
    }

    public static vy4 r(vy4 vy4, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (vy4.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            vy4 vy42 = (vy4) it.next();
            bs0.q(vy42, "Fully specified DynamicRange cannot be null.");
            bs0.r("Fully specified DynamicRange must have fully defined encoding.", vy42.b());
            if (vy42.a != 1 && l(vy4, vy42, hashSet)) {
                return vy42;
            }
        }
        return null;
    }

    private final void s(Throwable th) {
    }

    public static void u(HashSet hashSet, vy4 vy4, b8d b8d) {
        bs0.r("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set c2 = ((zy4) b8d.a).c(vy4);
        if (!c2.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(c2);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", c2);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + vy4 + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    public void a(Object obj) {
        int i;
        switch (this.a) {
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                if (!this.b) {
                    eda eda = (eda) this.c;
                    eda.k(bitmap);
                    ni0 ni0 = new ni0(eda.b());
                    oj0 oj0 = (oj0) this.o;
                    ef efVar = (ef) oj0.c;
                    ((oc4) efVar.g).execute(new w55((Object) efVar, oj0.b, (Object) (ex8) oj0.o, (Object) ni0, 2));
                    return;
                }
                return;
            case 13:
                yx8 yx8 = (yx8) this.o;
                yx8.getClass();
                kne.M(yx8.s, (dx8) obj);
                v0g.I(yx8.s);
                if (this.b) {
                    yx8.p((cx8) this.c);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                yx8 yx82 = ((iy8) this.o).w;
                Handler handler = yx82.l;
                boolean z = this.b;
                cx8 cx8 = (cx8) this.c;
                v0g.W(handler, new uo5(yx82, cx8, new bn5(3, this, (dx8) obj, cx8, z), 29));
                return;
            case 16:
                if (!this.b) {
                    ((gce) this.c).a(obj);
                    return;
                }
                return;
            default:
                Void voidR = (Void) obj;
                r3g r3g = (r3g) this.o;
                if (((zz7) this.c) == r3g.s && (i = r3g.u) != 3) {
                    int i2 = this.b ? 1 : 2;
                    if (i2 != i) {
                        r3g.u = i2;
                        r3g.J().b(i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            i1h r13 = (defpackage.i1h) r13
            qdf r14 = (defpackage.qdf) r14
            monitor-enter(r12)
            java.lang.Object r0 = r12.c     // Catch:{ all -> 0x00e1 }
            o15 r0 = (defpackage.o15) r0     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00e1 }
            f08 r0 = (defpackage.f08) r0     // Catch:{ all -> 0x00e1 }
            boolean r1 = r12.b     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r12.c     // Catch:{ all -> 0x00e1 }
            o15 r2 = (defpackage.o15) r2     // Catch:{ all -> 0x00e1 }
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x00e1 }
            r2.c = r3     // Catch:{ all -> 0x00e1 }
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0021
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r14.b(r12)
            return
        L_0x0021:
            qae r2 = r13.J0
            monitor-enter(r2)
            qae r12 = r13.J0     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = r12.remove(r0)     // Catch:{ all -> 0x0037 }
            r8 = r12
            e1h r8 = (defpackage.e1h) r8     // Catch:{ all -> 0x0037 }
            if (r8 != 0) goto L_0x003a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x00de
        L_0x0037:
            r12 = move-exception
            goto L_0x00df
        L_0x003a:
            he r12 = r8.d     // Catch:{ all -> 0x0037 }
            o15 r12 = r12.v()     // Catch:{ all -> 0x0037 }
            r12.b = r3     // Catch:{ all -> 0x0037 }
            r12.c = r3     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x00d8
            tj5[] r12 = r13.h()     // Catch:{ all -> 0x0037 }
            if (r12 == 0) goto L_0x00b5
            r0 = 0
        L_0x004d:
            int r1 = r12.length     // Catch:{ all -> 0x0037 }
            if (r0 >= r1) goto L_0x0061
            r1 = r12[r0]     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "location_updates_with_callback"
            java.lang.String r5 = r1.a     // Catch:{ all -> 0x0037 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x005e
            r3 = r1
            goto L_0x0061
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x004d
        L_0x0061:
            if (r3 != 0) goto L_0x0064
            goto L_0x00b5
        L_0x0064:
            long r0 = r3.b()     // Catch:{ all -> 0x0037 }
            r3 = 1
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x00b5
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            j7h r12 = (defpackage.j7h) r12     // Catch:{ all -> 0x0037 }
            java.lang.String r13 = "ILocationCallback@"
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0037 }
            int r1 = r1.length()     // Catch:{ all -> 0x0037 }
            int r1 = r1 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r3.<init>(r1)     // Catch:{ all -> 0x0037 }
            r3.append(r13)     // Catch:{ all -> 0x0037 }
            r3.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0037 }
            u1h r13 = new u1h     // Catch:{ all -> 0x0037 }
            r5 = 2
            r0 = 0
            r6 = 0
            r4 = r13
            r7 = r8
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            w0h r1 = new w0h     // Catch:{ all -> 0x0037 }
            r1.<init>(r0, r14)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.H0()     // Catch:{ all -> 0x0037 }
            defpackage.gzg.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r14.writeStrongBinder(r1)     // Catch:{ all -> 0x0037 }
            r13 = 89
            r12.I0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00b5:
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            j7h r12 = (defpackage.j7h) r12     // Catch:{ all -> 0x0037 }
            z0h r10 = new z0h     // Catch:{ all -> 0x0037 }
            r10.<init>(r14)     // Catch:{ all -> 0x0037 }
            z1h r13 = new z1h     // Catch:{ all -> 0x0037 }
            r7 = 0
            r9 = 0
            r11 = 0
            r5 = 2
            r6 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.H0()     // Catch:{ all -> 0x0037 }
            defpackage.gzg.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r13 = 59
            r12.I0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00d8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
        L_0x00dd:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
        L_0x00de:
            return
        L_0x00df:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r12
        L_0x00e1:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(ye1 ye1, fbb fbb) {
        ((voc) this.o).log("IceCandidatesHandler", "handle, participant=" + ye1 + ", client=" + fbb);
        if (!this.b || !ye1.b() || fbb == null || !fbb.k1) {
            ((voc) this.o).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + ye1 + ", client=" + fbb);
            return;
        }
        ((voc) this.o).log("IceCandidatesHandler", fbb + " is iceable for " + ye1);
        Map map = (Map) ((HashMap) this.c).get(ye1);
        if (map != null) {
            if (Objects.equals(ye1.j, ye1.r)) {
                ((voc) this.o).log("IceCandidatesHandler", "push all ice candidates to " + fbb);
                for (Map.Entry entry : map.entrySet()) {
                    for (IceCandidate r : (List) ((Pair) entry.getValue()).getFirst()) {
                        fbb.r(r);
                    }
                    if (!((List) ((Pair) entry.getValue()).getSecond()).isEmpty()) {
                        fbb.H((IceCandidate[]) ((List) ((Pair) entry.getValue()).getSecond()).toArray(new IceCandidate[((List) ((Pair) entry.getValue()).getSecond()).size()]));
                    }
                }
            } else {
                Pair pair = (Pair) map.get(ye1.j);
                if (pair != null) {
                    for (IceCandidate r2 : (List) pair.getFirst()) {
                        fbb.r(r2);
                    }
                    if (!((List) pair.getSecond()).isEmpty()) {
                        fbb.H((IceCandidate[]) ((List) pair.getSecond()).toArray(new IceCandidate[((List) pair.getSecond()).size()]));
                    }
                }
            }
            map.clear();
        }
    }

    public void c(mq4 mq4) {
        gce gce = (gce) this.c;
        try {
            ((qk3) this.o).accept(mq4);
            gce.c(mq4);
        } catch (Throwable th) {
            hd8.Z(th);
            this.b = true;
            mq4.dispose();
            p45.c(th, gce);
        }
    }

    public void close() {
        synchronized (this.o) {
            ((ImageReader) this.c).close();
        }
    }

    public ha7 e() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            fe feVar = new fe(image);
            return feVar;
        }
    }

    public int f() {
        int imageFormat;
        synchronized (this.o) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    public void g(Throwable th) {
        switch (this.a) {
            case 5:
                if (!this.b) {
                    i8b.V("Failed to load bitmap: " + th.getMessage());
                    return;
                }
                return;
            case 13:
                if (th instanceof UnsupportedOperationException) {
                    i8b.W("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    i8b.p("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                yx8 yx8 = (yx8) this.o;
                v0g.I(yx8.s);
                if (this.b) {
                    yx8.p((cx8) this.c);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return;
            default:
                boolean z = th instanceof CancellationException;
                return;
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.o) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.o) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.o) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    public void i() {
        synchronized (this.o) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public void k(ia7 ia7, Executor executor) {
        synchronized (this.o) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ge(this, executor, ia7), hd8.z());
        }
    }

    public void m() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = ((MediaCodec) this.c).dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (this.b) {
            int dequeueInputBuffer = ((MediaCodec) this.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
            if (dequeueInputBuffer >= 0) {
                ((MediaCodec) this.c).queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                this.b = false;
            } else {
                this.b = true;
            }
        }
        if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2 && dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer < 0) {
                z68.f("he", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer, (Throwable) null);
                return;
            }
            boolean z = bufferInfo.size != 0;
            ((MediaCodec) this.c).releaseOutputBuffer(dequeueOutputBuffer, z);
            u4g u4g = (u4g) this.o;
            if (u4g != null) {
                if (z) {
                    long j = bufferInfo.presentationTimeUs;
                    long j2 = u4g.x;
                    if (j >= j2) {
                        if (j >= u4g.y) {
                            u4g.m = true;
                        } else {
                            bufferInfo.presentationTimeUs = j - j2;
                            m7f m7f = u4g.i;
                            EGLSurface eGLSurface = (EGLSurface) m7f.c;
                            if (EGL14.eglMakeCurrent((EGLDisplay) m7f.a, eGLSurface, eGLSurface, (EGLContext) m7f.b)) {
                                j6b j6b = u4g.g;
                                synchronized (j6b.c) {
                                    while (!j6b.o) {
                                        try {
                                            j6b.c.wait(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    j6b.o = false;
                                }
                                j6b.v.getClass();
                                khf.a("before updateTexImage");
                                j6b.a.updateTexImage();
                                j6b j6b2 = u4g.g;
                                j6b2.getClass();
                                j6b2.v.b(j6b2.a, 36197);
                                m7f m7f2 = u4g.i;
                                EGLExt.eglPresentationTimeANDROID((EGLDisplay) m7f2.a, (EGLSurface) m7f2.c, bufferInfo.presentationTimeUs * 1000);
                                m7f m7f3 = u4g.i;
                                EGL14.eglSwapBuffers((EGLDisplay) m7f3.a, (EGLSurface) m7f3.c);
                            } else {
                                throw new RuntimeException("eglMakeCurrent failed");
                            }
                        }
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    u4g u4g2 = (u4g) this.o;
                    ((MediaCodec) u4g2.h.a).signalEndOfInputStream();
                    MediaCodec mediaCodec = (MediaCodec) u4g2.f.c;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                    }
                    MediaCodec mediaCodec2 = (MediaCodec) u4g2.f.c;
                    if (mediaCodec2 != null) {
                        mediaCodec2.release();
                    }
                    u4g2.i.x();
                    u4g2.k = true;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.gy h(defpackage.en8 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "createCodec:"
            on8 r1 = r6.a
            java.lang.String r1 = r1.a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006c }
            r3.<init>(r0)     // Catch:{ Exception -> 0x006c }
            r3.append(r1)     // Catch:{ Exception -> 0x006c }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x006c }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x006c }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x006c }
            boolean r1 = r5.b     // Catch:{ Exception -> 0x003b }
            if (r1 == 0) goto L_0x003d
            ea6 r1 = r6.c     // Catch:{ Exception -> 0x003b }
            int r3 = defpackage.v0g.a     // Catch:{ Exception -> 0x003b }
            r4 = 34
            if (r3 >= r4) goto L_0x0027
            goto L_0x003d
        L_0x0027:
            r4 = 35
            if (r3 >= r4) goto L_0x0033
            java.lang.String r1 = r1.n     // Catch:{ Exception -> 0x003b }
            boolean r1 = defpackage.vq9.k(r1)     // Catch:{ Exception -> 0x003b }
            if (r1 == 0) goto L_0x003d
        L_0x0033:
            syc r1 = new syc     // Catch:{ Exception -> 0x003b }
            r3 = 7
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x003b }
            r3 = 4
            goto L_0x004d
        L_0x003b:
            r5 = move-exception
            goto L_0x006e
        L_0x003d:
            ly r1 = new ly     // Catch:{ Exception -> 0x003b }
            java.lang.Object r3 = r5.o     // Catch:{ Exception -> 0x003b }
            s2f r3 = (defpackage.s2f) r3     // Catch:{ Exception -> 0x003b }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x003b }
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ Exception -> 0x003b }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x003b }
            r3 = 0
        L_0x004d:
            gy r4 = new gy     // Catch:{ Exception -> 0x003b }
            java.lang.Object r5 = r5.c     // Catch:{ Exception -> 0x003b }
            s2f r5 = (defpackage.s2f) r5     // Catch:{ Exception -> 0x003b }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x003b }
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x003b }
            r4.<init>(r0, r5, r1)     // Catch:{ Exception -> 0x003b }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0069 }
            android.media.MediaFormat r5 = r6.b     // Catch:{ Exception -> 0x0069 }
            android.view.Surface r1 = r6.d     // Catch:{ Exception -> 0x0069 }
            android.media.MediaCrypto r6 = r6.e     // Catch:{ Exception -> 0x0069 }
            defpackage.gy.n(r4, r5, r1, r6, r3)     // Catch:{ Exception -> 0x0069 }
            return r4
        L_0x0069:
            r5 = move-exception
            r2 = r4
            goto L_0x006e
        L_0x006c:
            r5 = move-exception
            r0 = r2
        L_0x006e:
            if (r2 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x0079
            r0.release()
            goto L_0x0079
        L_0x0076:
            r2.release()
        L_0x0079:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.h(en8):gy");
    }

    public int o() {
        int maxImages;
        synchronized (this.o) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    public void onError(Throwable th) {
        if (this.b) {
            n54.D(th);
        } else {
            ((gce) this.c).onError(th);
        }
    }

    public ha7 p() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            fe feVar = new fe(image);
            return feVar;
        }
    }

    public void q() {
        this.b = true;
    }

    public void t() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((l30) this.o);
            this.b = false;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.o15 v() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0009 }
            o15 r0 = (defpackage.o15) r0     // Catch:{ all -> 0x0009 }
            monitor-exit(r1)
            return r0
        L_0x0007:
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            throw r0
        L_0x0009:
            r0 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.v():o15");
    }

    public void w(s6h s6h) {
        synchronized (this.o) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(s6h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.s6h) ((java.util.ArrayDeque) r2.c).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(com.google.android.gms.tasks.Task r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.o
            monitor-enter(r0)
            java.lang.Object r1 = r2.c     // Catch:{ all -> 0x002f }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r2.b     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x000e
            goto L_0x0031
        L_0x000e:
            r1 = 1
            r2.b = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
        L_0x0012:
            java.lang.Object r1 = r2.o
            monitor-enter(r1)
            java.lang.Object r0 = r2.c     // Catch:{ all -> 0x0026 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            s6h r0 = (defpackage.s6h) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r2 = move-exception
            goto L_0x002d
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.b(r3)
            goto L_0x0012
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r2
        L_0x002f:
            r2 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.x(com.google.android.gms.tasks.Task):void");
    }

    public /* synthetic */ he(int i, byte b2) {
        this.a = i;
    }

    public /* synthetic */ he(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public /* synthetic */ he(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = z;
        this.o = obj;
    }

    public he(swg swg, o15 o15) {
        this.a = 20;
        this.o = swg;
        this.b = true;
        this.c = o15;
    }

    public he(ye1 ye1, boolean z, zwd zwd) {
        this.a = 18;
        this.c = ye1;
        this.b = z;
        this.o = zwd;
    }

    public he(voc voc) {
        this.a = 19;
        this.c = new HashMap();
        this.o = voc;
    }

    public he(Context context) {
        Sensor defaultSensor;
        this.a = 12;
        xme a2 = f6e.a(Float.valueOf(100.0f));
        this.c = a2;
        this.o = new etc(a2);
        SensorManager sensorManager = (SensorManager) fw3.b(context, SensorManager.class);
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(5)) != null) {
            sensorManager.registerListener(new ov7(0, this), defaultSensor, 3, 2500000);
        }
    }

    public he(boolean z) {
        this.a = 8;
        this.b = z;
        this.c = cs2.a.c();
        this.o = CollectionsKt.emptyList();
    }

    public he(String str, MediaFormat mediaFormat, j6b j6b, u4g u4g) {
        this.a = 4;
        this.b = false;
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
        this.c = createDecoderByType;
        z68.c("he", mediaFormat.toString(), new Object[0]);
        createDecoderByType.configure(mediaFormat, j6b.b, (MediaCrypto) null, 0);
        createDecoderByType.start();
        this.o = u4g;
    }

    public he(Context context, Handler handler, mc5 mc5) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.o = new l30(this, handler, mc5, 0);
    }

    public he(Context context, Handler handler, nc5 nc5) {
        this.a = 3;
        this.c = context.getApplicationContext();
        this.o = new l30(this, handler, nc5, 1);
    }

    public he(ImageReader imageReader) {
        this.a = 0;
        this.o = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public he(qt1 qt1) {
        this.a = 6;
        this.c = qt1;
        this.o = b8d.i(qt1);
        int[] iArr = (int[]) qt1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.b = z;
    }

    public he(int i) {
        this.a = 1;
        ey eyVar = new ey(i, 1);
        ey eyVar2 = new ey(i, 3);
        this.c = eyVar;
        this.o = eyVar2;
        this.b = true;
    }

    public he(lr1 lr1, tsd tsd) {
        this.a = 7;
        this.b = false;
        this.c = new ni0(6);
        this.o = tsd;
    }

    public he(yx8 yx8, cx8 cx8, boolean z, pob pob) {
        this.a = 13;
        this.o = yx8;
        this.c = cx8;
        this.b = z;
    }
}
