package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: u4g  reason: default package */
public final class u4g {
    public ByteBuffer a;
    public MediaExtractor b;
    public d0a c;
    public int d = -1;
    public int e = -1;
    public he f;
    public j6b g;
    public aqg h;
    public m7f i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final Context o;
    public final m95 p;
    public final String q;
    public final String r;
    public final float s;
    public final float t;
    public final rac u;
    public final boolean v;
    public final p3a w;
    public long x;
    public long y;

    public u4g(Context context, m95 m95, String str, String str2, float f2, float f3, rac rac, boolean z, p3a p3a) {
        this.o = context;
        this.p = m95;
        this.q = str;
        this.r = str2;
        this.s = f2;
        this.t = f3;
        this.u = rac;
        this.v = z;
        this.w = p3a;
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r4v4, types: [d0a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.view.Surface, android.media.MediaCrypto, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [aqg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, m7f] */
    /* JADX WARNING: type inference failed for: r7v24 */
    public final boolean a() {
        int i2;
        boolean z;
        int i3;
        File parentFile;
        this.a = ByteBuffer.allocate(262144);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        ? r7 = 0;
        mediaExtractor.setDataSource(this.o, Uri.parse(this.q), (Map) null);
        String str = this.r;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        ? obj = new Object();
        obj.c = false;
        int i4 = -1;
        obj.a = -1;
        obj.b = -1;
        obj.d = false;
        obj.e = false;
        obj.g = new ArrayList();
        obj.f = new MediaMuxer(str, 0);
        this.c = obj;
        int trackCount = this.b.getTrackCount();
        int i5 = 0;
        while (true) {
            if (i5 >= trackCount) {
                i2 = i4;
                break;
            }
            MediaFormat trackFormat = this.b.getTrackFormat(i5);
            String string = trackFormat.getString("mime");
            z68.c("u4g", string, new Object[0]);
            z68.c("u4g", trackFormat.toString(), new Object[0]);
            this.b.selectTrack(i5);
            if (string.startsWith("video/")) {
                this.d = i5;
                float f2 = (float) trackFormat.getLong("durationUs");
                this.x = (long) (this.s * f2);
                this.y = (long) (f2 * this.t);
                rac rac = this.u;
                int i6 = rac.b;
                int i7 = i6 - (i6 % 4);
                int i8 = rac.c;
                int i9 = i8 - (i8 % 4);
                try {
                    i3 = trackFormat.getInteger("frame-rate");
                } catch (Throwable unused) {
                    i3 = 15;
                }
                int i10 = rac.d;
                ? obj2 = new Object();
                obj2.b = this;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i9);
                createVideoFormat.setInteger("frame-rate", i3);
                createVideoFormat.setInteger("bitrate", i10);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("i-frame-interval", 1);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
                obj2.a = createEncoderByType;
                createEncoderByType.configure(createVideoFormat, r7, r7, 1);
                obj2.c = createEncoderByType.createInputSurface();
                createEncoderByType.start();
                this.h = obj2;
                ? obj3 = new Object();
                obj3.a = EGL14.EGL_NO_DISPLAY;
                obj3.b = EGL14.EGL_NO_CONTEXT;
                obj3.c = EGL14.EGL_NO_SURFACE;
                Surface surface = (Surface) obj2.c;
                surface.getClass();
                obj3.o = surface;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                obj3.a = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig((EGLDisplay) obj3.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            obj3.b = EGL14.eglCreateContext((EGLDisplay) obj3.a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            m7f.e("eglCreateContext");
                            if (((EGLContext) obj3.b) != null) {
                                obj3.c = EGL14.eglCreateWindowSurface((EGLDisplay) obj3.a, eGLConfigArr[0], (Surface) obj3.o, new int[]{12344}, 0);
                                m7f.e("eglCreateWindowSurface");
                                EGLSurface eGLSurface = (EGLSurface) obj3.c;
                                if (eGLSurface != null) {
                                    this.i = obj3;
                                    if (EGL14.eglMakeCurrent((EGLDisplay) obj3.a, eGLSurface, eGLSurface, (EGLContext) obj3.b)) {
                                        this.g = new j6b();
                                        this.f = new he(string, trackFormat, this.g, this);
                                        this.c.d = true;
                                        z = false;
                                    } else {
                                        throw new RuntimeException("eglMakeCurrent failed");
                                    }
                                } else {
                                    throw new RuntimeException("surface was null");
                                }
                            } else {
                                throw new RuntimeException("null context");
                            }
                        } else {
                            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                        }
                    } else {
                        obj3.a = r7;
                        throw new RuntimeException("unable to initialize EGL14");
                    }
                } else {
                    throw new RuntimeException("unable to get EGL14 display");
                }
            } else {
                z = r7;
                if (string.startsWith("audio/")) {
                    this.e = i5;
                    if (this.v) {
                        this.c.e = false;
                        z = r7;
                    } else {
                        d0a d0a = this.c;
                        d0a.e = true;
                        d0a.b = ((MediaMuxer) d0a.f).addTrack(trackFormat);
                        z = r7;
                    }
                }
            }
            i2 = -1;
            if (this.e != -1 && this.d != -1) {
                break;
            }
            i5++;
            i4 = -1;
            r7 = z;
        }
        return this.d != i2;
    }
}
