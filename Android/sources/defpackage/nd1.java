package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: nd1  reason: default package */
public final class nd1 {
    public final voc a;
    public final EglBase.Context b;
    public final cf c;
    public final String d;
    public final ld1 e;
    public final Matrix f = new Matrix();
    public final VideoFrameDrawer g = new VideoFrameDrawer();
    public final GlRectDrawer h = new GlRectDrawer();
    public final ArrayList i = new ArrayList();

    public nd1(voc voc, EglBase.Context context, int[] iArr, String str) {
        this.a = voc;
        this.b = context;
        this.d = a81.m("CallOpenGL_renderer_", str);
        ld1 ld1 = new ld1(voc, ((EglBase14.Context) context).getRawContext(), iArr, new hq7(26, (Object) this), str);
        this.e = ld1;
        cf cfVar = new cf(8, this);
        try {
            ld1.k.postDelayed(cfVar, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } catch (IllegalStateException e2) {
            ld1.a.reportException(ld1.j, "OpenGL tread died, is it fine?", e2);
        }
        this.c = cfVar;
    }

    public final void a() {
        ld1 ld1 = this.e;
        ld1.a.log(ld1.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (ld1.h) {
            if (!ld1.i) {
                ld1.a.log(ld1.j, "Already released, ignore");
                countDownLatch.countDown();
            } else {
                ld1.i = false;
                Unit unit = Unit.INSTANCE;
                ld1.k.postAtFrontOfQueue(new c(16, ld1, countDownLatch));
                ld1.a.log(ld1.j, "Release action submitted");
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void b(ld1 ld1, in1 in1, VideoFrame videoFrame, mg1 mg1) {
        ld1 ld12 = ld1;
        in1 in12 = in1;
        mg1 mg12 = mg1;
        EGLSurface eGLSurface = in12.a;
        if (eGLSurface != null && !Intrinsics.areEqual((Object) eGLSurface, (Object) EGL14.EGL_NO_SURFACE)) {
            long nanoTime = System.nanoTime();
            ld12.b(eGLSurface);
            ld1.a("makeCurrent()");
            GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            GLES20.glClear(16384);
            Matrix matrix = this.f;
            matrix.reset();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(mg12.c ? -1.0f : 1.0f, 1.0f);
            matrix.preScale(mg12.a, mg12.b);
            matrix.preTranslate(-0.5f, -0.5f);
            RendererCommon.GlDrawer glDrawer = in12.k;
            if (glDrawer == null) {
                glDrawer = this.h;
            }
            RendererCommon.GlDrawer glDrawer2 = glDrawer;
            EGLDisplay eGLDisplay = ld12.e;
            if (eGLDisplay != null) {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                int i2 = iArr[0];
                EGLDisplay eGLDisplay2 = ld12.e;
                if (eGLDisplay2 != null) {
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
                    this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i2, iArr2[0]);
                    ld1.a("drawFrame()");
                    long nanoTime2 = System.nanoTime();
                    EGLDisplay eGLDisplay3 = ld12.e;
                    if (eGLDisplay3 != null) {
                        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
                        ld1.a("swapBuffers()");
                        long nanoTime3 = System.nanoTime();
                        jn1 jn1 = in12.l;
                        jn1.h += nanoTime3 - nanoTime;
                        jn1.i += nanoTime3 - nanoTime2;
                        ld1.a("swapBuffers()");
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                }
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
