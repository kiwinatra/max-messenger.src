package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;

/* renamed from: v48  reason: default package */
public final class v48 {
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);
    public final i8d C;
    public final qpg D;
    public final p1e E;
    public final EglBase.Context a;
    public final py0 b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Context d;
    public final j50 e;
    public final l48 f;
    public final Executor g;
    public final MediaStream h;
    public final n60 i;
    public final n60 j;
    public final String k;
    public final String l;
    public final String m;
    public final voc n;
    public final boolean o;
    public n8g p;
    public volatile VideoSink q;
    public volatile mt1 r;
    public volatile dv1 s;
    public volatile ngd t;
    public volatile lhd u;
    public volatile w48 v;
    public final boolean w = false;
    public ykb x;
    public final b8g y;
    public final fhd z;

    /* JADX WARNING: type inference failed for: r7v9, types: [qpg, java.lang.Object] */
    public v48(u48 u48) {
        qpg qpg;
        voc voc = u48.h;
        this.n = voc;
        this.d = u48.d;
        PeerConnectionFactory peerConnectionFactory = u48.a;
        this.e = u48.b;
        this.f = u48.q;
        this.g = u48.c;
        String str = u48.g;
        String str2 = u48.f;
        this.m = u48.e;
        this.o = u48.p;
        this.a = u48.i;
        boolean z2 = u48.k;
        this.b = u48.j;
        this.w = u48.l;
        String n2 = wj6.n(new StringBuilder(), u48.e, "sc0");
        this.k = n2;
        String n3 = wj6.n(new StringBuilder(), u48.e, "as0");
        this.l = n3;
        MediaStream createLocalMediaStream = peerConnectionFactory.createLocalMediaStream(u48.e);
        this.h = createLocalMediaStream;
        MediaStream createLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(n2);
        if (u48.o) {
            ? obj = new Object();
            obj.o = this;
            obj.b = new Handler(Looper.getMainLooper());
            obj.c = new haf(13, (Object) obj);
            qpg = obj;
        } else {
            qpg = null;
        }
        this.D = qpg;
        this.E = u48.r;
        createLocalMediaStream = !z2 ? null : createLocalMediaStream;
        n60 n60 = new n60(peerConnectionFactory, str, createLocalMediaStream, voc);
        this.i = n60;
        n60.l();
        n60.o(false);
        n60 n602 = new n60(peerConnectionFactory, n3, createLocalMediaStream, voc);
        this.j = n602;
        n602.l();
        n602.o(false);
        PeerConnectionFactory peerConnectionFactory2 = peerConnectionFactory;
        b8g b8g = new b8g(peerConnectionFactory2, str2, createLocalMediaStream, u48.s, u48.t, new syc(13, this), voc);
        this.y = b8g;
        b8g.l();
        fhd fhd = new fhd(peerConnectionFactory2, n2, createLocalMediaStream2, voc, u48.r, u48.m);
        this.z = fhd;
        fhd.l();
        this.C = u48.m;
    }

    public final void a() {
        n8g n8g = this.p;
        if (n8g != null) {
            n8g.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + ur9.c(this.p) + " was cleared");
        }
    }

    public final void b(y48 y48) {
        qpg qpg = this.D;
        if (qpg != null && y48 != null) {
            qpg.a = y48;
            Handler handler = (Handler) qpg.b;
            haf haf = (haf) qpg.c;
            handler.removeCallbacks(haf);
            ((v48) qpg.o).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
            handler.postDelayed(haf, 1500);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, n8g] */
    public final void c(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + ur9.c(videoCapturer));
        if (videoCapturer != null) {
            this.y.l();
            b8g b8g = this.y;
            Context context = this.d;
            EglBase.Context context2 = this.a;
            VideoSource videoSource = (VideoSource) ((MediaSource) b8g.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver == null) {
                throw new IllegalStateException("Can't set capture in absence of video source");
            } else if (b8g.y == null) {
                SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), (SurfaceTextureHelper.FrameRefMonitor) null, b8g);
                b8g.y = create;
                b8g.z = new zqd(b8g, capturerObserver, false, 29);
                videoCapturer.initialize(create, context.getApplicationContext(), b8g.z);
                if (!this.w) {
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.v);
                    if (videoTrack != null) {
                        if (this.p == null) {
                            ? obj = new Object();
                            this.p = obj;
                            obj.a = this.q;
                        }
                        videoTrack.addSink(this.p);
                    }
                } else if (videoCapturer instanceof cab) {
                    ((cab) videoCapturer).w = this.q;
                } else {
                    throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(cab.class.getName()));
                }
            } else {
                throw new IllegalStateException("An attempt to create surface texture screencast=false, while got one");
            }
        } else {
            throw new IllegalArgumentException("Video capturer is expected to be not null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.mz9 r12) {
        /*
            r11 = this;
            boolean r0 = r12.f
            java.lang.String r1 = "startCameraVideoCapture, start="
            java.lang.String r1 = defpackage.i2a.i(r1, r0)
            voc r2 = r11.n
            java.lang.String r3 = "OKRTCLmsAdapter"
            r2.log(r3, r1)
            j50 r1 = r11.e
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L_0x002d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": has no video capturer factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            voc r1 = r11.n
            r1.log(r3, r0)
            goto L_0x012f
        L_0x002d:
            if (r0 == 0) goto L_0x0114
            mt1 r0 = r11.r
            if (r0 == 0) goto L_0x0043
            mt1 r0 = r11.r
            if (r0 != 0) goto L_0x0039
            goto L_0x012f
        L_0x0039:
            r0.a()
            b8g r0 = r11.y
            r0.o(r4)
            goto L_0x012f
        L_0x0043:
            r11.a()
            r11.g()
            j50 r0 = r11.e
            dv1 r1 = r11.s
            java.lang.Object r5 = r0.o
            voc r5 = (defpackage.voc) r5
            java.lang.String r6 = "OKRTCSvcFactory"
            java.lang.String r7 = "createCameraCapturer"
            r5.log(r6, r7)
            java.lang.Object r5 = r0.v
            l48 r5 = (defpackage.l48) r5
            r7 = 0
            if (r5 == 0) goto L_0x00a2
            boolean r5 = r5.d
            if (r5 != 0) goto L_0x0064
            goto L_0x00a2
        L_0x0064:
            mt1 r0 = r0.a(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x00ac
        L_0x0069:
            r5 = move-exception
            java.lang.Object r8 = r0.o
            voc r8 = (defpackage.voc) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Camera capturer creation failed. Is Camera2: "
            r9.<init>(r10)
            boolean r10 = r0.b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.reportException(r6, r9, r5)
            boolean r5 = r0.b
            if (r5 != 0) goto L_0x0087
        L_0x0085:
            r0 = r7
            goto L_0x00ac
        L_0x0087:
            java.lang.Object r5 = r0.o
            voc r5 = (defpackage.voc) r5
            java.lang.String r8 = "Failed to create camera capturer using camera2 API. Fallback to camera1"
            r5.log(r6, r8)
            r0.b = r2
            mt1 r0 = r0.a(r1)     // Catch:{ all -> 0x0097 }
            goto L_0x00ac
        L_0x0097:
            r1 = move-exception
            java.lang.Object r0 = r0.o
            voc r0 = (defpackage.voc) r0
            java.lang.String r5 = "Camera capturer creation failed after fallback to camera1"
            r0.reportException(r6, r5, r1)
            goto L_0x0085
        L_0x00a2:
            java.lang.String r1 = "No video permissions"
            java.lang.Object r0 = r0.o
            voc r0 = (defpackage.voc) r0
            r0.log(r6, r1)
            goto L_0x0085
        L_0x00ac:
            r11.r = r0
            mt1 r0 = r11.r
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": can't get camera capturer from factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            voc r1 = r11.n
            r1.log(r3, r0)
            goto L_0x0112
        L_0x00c9:
            mt1 r0 = r11.r
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f
            r0.add(r11)
            mt1 r0 = r11.r     // Catch:{ RuntimeException -> 0x00e9 }
            xga r0 = r0.c     // Catch:{ RuntimeException -> 0x00e9 }
            java.lang.Object r0 = r0.b     // Catch:{ RuntimeException -> 0x00e9 }
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0     // Catch:{ RuntimeException -> 0x00e9 }
            r11.c(r0)     // Catch:{ RuntimeException -> 0x00e9 }
            mt1 r0 = r11.r
            if (r0 != 0) goto L_0x00e0
            goto L_0x0112
        L_0x00e0:
            r0.a()
            b8g r0 = r11.y
            r0.o(r4)
            goto L_0x0112
        L_0x00e9:
            r0 = move-exception
            voc r1 = r11.n
            java.lang.String r5 = "camera.video.track.create"
            r1.reportException(r3, r5, r0)
            mt1 r0 = r11.r
            voc r1 = r0.e
            java.lang.String r5 = "CameraCapturerAdapter"
            java.lang.String r6 = "release"
            r1.log(r5, r6)
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.f
            r1.clear()
            r0.b()
            xga r0 = r0.c
            java.lang.Object r0 = r0.b
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0
            r0.dispose()
            r11.r = r7
            r11.g()
        L_0x0112:
            r0 = r4
            goto L_0x0130
        L_0x0114:
            mt1 r0 = r11.r
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x0122
            mt1 r0 = r11.r
            r0.b()
            goto L_0x012f
        L_0x0122:
            mt1 r0 = r11.r
            if (r0 != 0) goto L_0x0127
            goto L_0x012f
        L_0x0127:
            r0.a()
            b8g r0 = r11.y
            r0.o(r2)
        L_0x012f:
            r0 = r2
        L_0x0130:
            boolean r12 = r12.e
            n60 r1 = r11.i
            java.lang.Object r5 = r1.v
            org.webrtc.MediaStreamTrack r5 = (org.webrtc.MediaStreamTrack) r5
            if (r5 == 0) goto L_0x013f
            boolean r5 = r5.enabled()
            goto L_0x0140
        L_0x013f:
            r5 = r2
        L_0x0140:
            if (r5 == r12) goto L_0x0151
            java.lang.String r2 = "setAudioTrackEnabled, enabled="
            java.lang.String r2 = defpackage.i2a.i(r2, r12)
            voc r5 = r11.n
            r5.log(r3, r2)
            r1.o(r12)
            r2 = r4
        L_0x0151:
            r12 = r0 | r2
            if (r12 == 0) goto L_0x016b
            java.util.concurrent.CopyOnWriteArraySet r12 = r11.c
            java.util.Iterator r12 = r12.iterator()
        L_0x015b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r12.next()
            x48 r0 = (defpackage.x48) r0
            r0.b(r11)
            goto L_0x015b
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v48.d(mz9):void");
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + ur9.c(videoCapturer));
        if (videoCapturer != null) {
            fhd fhd = this.z;
            fhd.l();
            Context applicationContext = this.d.getApplicationContext();
            VideoSource videoSource = (VideoSource) ((MediaSource) fhd.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver != null) {
                g6d g6d = fhd.y;
                g6d.o = capturerObserver;
                SurfaceTextureHelper surfaceTextureHelper = fhd.x;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                }
                SurfaceTextureHelper create = SurfaceTextureHelper.create("ScreenCapturerThread", this.a);
                fhd.x = create;
                videoCapturer.initialize(create, applicationContext.getApplicationContext(), g6d);
                return;
            }
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        throw new IllegalArgumentException("videoCapturer must not be null");
    }

    public final void g() {
        n8g n8g;
        voc voc = this.n;
        voc.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        b8g b8g = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) b8g.v);
        if (!(videoTrack == null || (n8g = this.p) == null)) {
            try {
                videoTrack.removeSink(n8g);
            } catch (Exception unused) {
            }
            voc.log("OKRTCLmsAdapter", this + ": " + ur9.c(this.p) + " was removed from " + ur9.c(videoTrack));
        }
        this.p = null;
        b8g.m();
    }

    public final Size h() {
        mt1 mt1 = this.r;
        if (mt1 == null) {
            return new Size(0, 0);
        }
        Size size = new Size(mt1.n, mt1.m);
        b8g b8g = this.y;
        b8g.getClass();
        Size b2 = b8g.X.b(size.width, size.height);
        return b2 == null ? size : b2;
    }

    public final void i(mt1 mt1, boolean z2) {
        this.n.log("OKRTCLmsAdapter", i2a.i("onCameraCapturerSwitchDone, switched ? ", z2));
        if (z2) {
            ykb ykb = this.x;
            if (ykb != null) {
                ((hz0) ykb.b).k(b51.x, Boolean.TRUE);
            }
            this.g.execute(new uo5(23, (Object) this, (Object) mt1));
        }
    }

    public final void j(boolean z2) {
        n60 n60 = this.j;
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) n60.v;
        if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z2) {
            this.n.log("OKRTCLmsAdapter", i2a.i("setAudioShareTrackEnabled, enabled=", z2));
            n60.o(z2);
        }
    }

    public final void k(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + ur9.c(videoSink));
        this.q = videoSink;
        if (this.w) {
            mt1 mt1 = this.r;
            CameraVideoCapturer cameraVideoCapturer = mt1 != null ? (CameraVideoCapturer) mt1.c.b : null;
            if (cameraVideoCapturer instanceof cab) {
                ((cab) cameraVideoCapturer).w = videoSink;
            } else if (cameraVideoCapturer != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(cab.class.getName()));
            }
        }
        n8g n8g = this.p;
        if (n8g != null) {
            n8g.a = videoSink;
        }
    }

    public final void l(dv1 dv1) {
        ou1 ou1;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r != null) {
            mt1 mt1 = this.r;
            mt1.e.log("CameraCapturerAdapter", "switchCamera");
            if (!mt1.k) {
                mt1.e.log("CameraCapturerAdapter", "Camera is not started");
                return;
            }
            if (mt1.j) {
                synchronized (mt1.g) {
                    try {
                        if (mt1.j) {
                            mt1.e.log("CameraCapturerAdapter", "Camera switch is pending");
                            return;
                        }
                        mt1.j = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (dv1 == null) {
                ou1 = mt1.d.I(mt1.i ? cv1.b : cv1.a);
            } else {
                ou1 = mt1.d.I(dv1.a);
            }
            if (ou1 != null && !Objects.equals(mt1.h, ou1.a())) {
                String a2 = ou1.a();
                ((CameraVideoCapturer) mt1.c.b).switchCamera(new wsb(mt1, a2, false), a2);
            }
        } else if (dv1 != null) {
            this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
            this.s = dv1;
        } else {
            this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
        }
    }

    public final void m(Float f2, Float f3) {
        Integer num;
        float f4;
        b8g b8g = this.y;
        j6g j6g = b8g.X;
        if (f2 != null) {
            j6g.getClass();
            int roundToInt = MathKt.roundToInt(((float) j6g.c) * f2.floatValue());
            num = Integer.valueOf(RangesKt.coerceIn(roundToInt - (roundToInt % 16), 320, (int) ConstantsKt.DEFAULT_BLOCK_SIZE));
        } else {
            num = null;
        }
        j6g.e = num;
        Function1 function1 = j6g.b;
        function1.invoke("Set scale restriction: " + f2 + " ");
        b8g.u();
        b8g b8g2 = this.y;
        if (f3 != null) {
            b8g2.getClass();
            if (f3.floatValue() > c44.DEFAULT_ASPECT_RATIO && ((double) f3.floatValue()) < 1.0d) {
                f4 = f3.floatValue();
                b8g2.Z = f4;
                b8g2.u();
            }
        }
        f4 = 1.0f;
        b8g2.Z = f4;
        b8g2.u();
    }

    public final String toString() {
        return ur9.c(this);
    }
}
