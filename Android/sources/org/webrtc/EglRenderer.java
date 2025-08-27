package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.RendererCommon;

public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    /* access modifiers changed from: private */
    public EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    /* access modifiers changed from: private */
    public EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private final Object layoutLock;
    /* access modifiers changed from: private */
    public final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private volatile boolean mirrorHorizontally;
    private volatile boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    /* access modifiers changed from: private */
    public final Object threadLock;
    private boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public /* synthetic */ EglSurfaceCreation(EglRenderer eglRenderer, int i) {
            this();
        }

        public synchronized void run() {
            try {
                if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else if (obj instanceof SurfaceTexture) {
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    } else {
                        Object obj2 = this.surface;
                        throw new IllegalStateException("Invalid surface: " + obj2);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        private EglSurfaceCreation() {
        }
    }

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j / ((long) i));
        return micros + " us";
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$4(float f, float f2, float f3, float f4) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasSurface()) {
            logD("clearSurface");
            this.eglBase.makeCurrent();
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$3(Runnable runnable) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$swapBuffersOnRenderThread$5(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase2 = this.eglBase;
            if (eglBase2 != null && eglBase2.hasSurface()) {
                this.eglBase.makeCurrent();
            } else {
                return;
            }
        }
        if (this.usePresentationTimeStamp) {
            this.eglBase.swapBuffers(videoFrame.getTimestampNs());
        } else {
            this.eglBase.swapBuffers();
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs = (System.nanoTime() - j) + this.renderSwapBufferTimeNs;
        }
    }

    private void logD(String str) {
        String str2 = this.name;
        Logging.d(TAG, str2 + str);
    }

    private void logE(String str, Throwable th) {
        String str2 = this.name;
        Logging.e(TAG, str2 + str, th);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logStatistics() {
        /*
            r14 = this;
            java.lang.String r0 = "Duration: "
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "#.0"
            r1.<init>(r2)
            long r2 = java.lang.System.nanoTime()
            java.lang.Object r4 = r14.statisticsLock
            monitor-enter(r4)
            long r5 = r14.statisticsStartTimeNs     // Catch:{ all -> 0x002b }
            long r5 = r2 - r5
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a6
            long r7 = r14.minRenderPeriodNs     // Catch:{ all -> 0x002b }
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x002d
            int r7 = r14.framesReceived     // Catch:{ all -> 0x002b }
            if (r7 != 0) goto L_0x002d
            goto L_0x00a6
        L_0x002b:
            r14 = move-exception
            goto L_0x00a8
        L_0x002d:
            int r7 = r14.framesRendered     // Catch:{ all -> 0x002b }
            long r7 = (long) r7     // Catch:{ all -> 0x002b }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002b }
            r10 = 1
            long r9 = r9.toNanos(r10)     // Catch:{ all -> 0x002b }
            long r7 = r7 * r9
            float r7 = (float) r7     // Catch:{ all -> 0x002b }
            float r8 = (float) r5     // Catch:{ all -> 0x002b }
            float r7 = r7 / r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x002b }
            long r5 = r8.toMillis(r5)     // Catch:{ all -> 0x002b }
            int r8 = r14.framesReceived     // Catch:{ all -> 0x002b }
            int r9 = r14.framesDropped     // Catch:{ all -> 0x002b }
            int r10 = r14.framesRendered     // Catch:{ all -> 0x002b }
            double r11 = (double) r7     // Catch:{ all -> 0x002b }
            java.lang.String r1 = r1.format(r11)     // Catch:{ all -> 0x002b }
            long r11 = r14.renderTimeNs     // Catch:{ all -> 0x002b }
            int r7 = r14.framesRendered     // Catch:{ all -> 0x002b }
            java.lang.String r7 = r14.averageTimeAsString(r11, r7)     // Catch:{ all -> 0x002b }
            long r11 = r14.renderSwapBufferTimeNs     // Catch:{ all -> 0x002b }
            int r13 = r14.framesRendered     // Catch:{ all -> 0x002b }
            java.lang.String r11 = r14.averageTimeAsString(r11, r13)     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r12.<init>(r0)     // Catch:{ all -> 0x002b }
            r12.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = " ms. Frames received: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r8)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = ". Dropped: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r9)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = ". Rendered: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r10)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = ". Render fps: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = ". Average render time: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r7)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = ". Average swapBuffer time: "
            r12.append(r0)     // Catch:{ all -> 0x002b }
            r12.append(r11)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "."
            r12.append(r0)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x002b }
            r14.logD(r0)     // Catch:{ all -> 0x002b }
            r14.resetStatistics(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x00a6:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x00a8:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.logStatistics():void");
    }

    private void logW(String str) {
        String str2 = this.name;
        Logging.w(TAG, str2 + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * ((float) videoFrame.getRotatedWidth()));
                    int rotatedHeight = (int) (next.scale * ((float) videoFrame.getRotatedHeight()));
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        next.listener.onFrame((Bitmap) null);
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                        GLES20.glClear(16384);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread2 = this.eglThread;
                if (eglThread2 != null) {
                    eglThread2.getHandler().post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = r14.eglBase;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        if (r0 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        if (r0.hasSurface() != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        r14.eglBase.makeCurrent();
        r0 = r14.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = r14.minRenderPeriodNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r1 > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r1 = java.lang.System.nanoTime();
        r5 = r14.nextFrameTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r1 >= r5) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r5 = r5 + r14.minRenderPeriodNs;
        r14.nextFrameTimeNs = r5;
        r14.nextFrameTimeNs = java.lang.Math.max(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        r12 = java.lang.System.nanoTime();
        r0 = ((float) r9.getRotatedWidth()) / ((float) r9.getRotatedHeight());
        r1 = r14.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = r14.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r2 == defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r4 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        if (r0 <= r2) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007d, code lost:
        r2 = r2 / r0;
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        r0 = r0 / r2;
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0082, code lost:
        r14.drawMatrix.reset();
        r14.drawMatrix.preTranslate(0.5f, 0.5f);
        r1 = r14.drawMatrix;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        if (r14.mirrorHorizontally == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        r5 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        r5 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        if (r14.mirrorVertically == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        r1.preScale(r5, r4);
        r14.drawMatrix.preScale(r2, r0);
        r14.drawMatrix.preTranslate(-0.5f, -0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        if (r11 == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        android.opengl.GLES20.glClearColor(defpackage.c44.DEFAULT_ASPECT_RATIO, defpackage.c44.DEFAULT_ASPECT_RATIO, defpackage.c44.DEFAULT_ASPECT_RATIO, defpackage.c44.DEFAULT_ASPECT_RATIO);
        android.opengl.GLES20.glClear(16384);
        r14.frameDrawer.drawFrame(r9, r14.drawer, r14.drawMatrix, 0, 0, r14.eglBase.surfaceWidth(), r14.eglBase.surfaceHeight());
        r0 = java.lang.System.nanoTime();
        swapBuffersOnRenderThread(r9, r0);
        r2 = r14.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r14.framesRendered++;
        r14.renderTimeNs = (r0 - r12) + r14.renderTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ed, code lost:
        notifyCallbacks(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f0, code lost:
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        logE("Error while drawing frame", r0);
        r0 = r14.errorCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fb, code lost:
        if (r0 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fd, code lost:
        r0.onGlOutOfMemory();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        r14.drawer.release();
        r14.frameDrawer.release();
        r14.bitmapTextureFramebuffer.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0110, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0111, code lost:
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0114, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0119, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011a, code lost:
        logD("Dropping frame - No surface");
        r9.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0122, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderFrameOnRenderThread() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r9 = r14.pendingFrame     // Catch:{ all -> 0x0009 }
            if (r9 != 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r14 = move-exception
            goto L_0x0123
        L_0x000c:
            r1 = 0
            r14.pendingFrame = r1     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            org.webrtc.EglBase r0 = r14.eglBase
            if (r0 == 0) goto L_0x011a
            boolean r0 = r0.hasSurface()
            if (r0 != 0) goto L_0x001c
            goto L_0x011a
        L_0x001c:
            org.webrtc.EglBase r0 = r14.eglBase
            r0.makeCurrent()
            java.lang.Object r0 = r14.fpsReductionLock
            monitor-enter(r0)
            long r1 = r14.minRenderPeriodNs     // Catch:{ all -> 0x004b }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            r10 = 1
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            r11 = r4
            goto L_0x005a
        L_0x0033:
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x003b
        L_0x0039:
            r11 = r10
            goto L_0x005a
        L_0x003b:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004b }
            long r5 = r14.nextFrameTimeNs     // Catch:{ all -> 0x004b }
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x004e
            java.lang.String r1 = "Skipping frame rendering - fps reduction is active."
            r14.logD(r1)     // Catch:{ all -> 0x004b }
            goto L_0x0031
        L_0x004b:
            r14 = move-exception
            goto L_0x0118
        L_0x004e:
            long r3 = r14.minRenderPeriodNs     // Catch:{ all -> 0x004b }
            long r5 = r5 + r3
            r14.nextFrameTimeNs = r5     // Catch:{ all -> 0x004b }
            long r1 = java.lang.Math.max(r5, r1)     // Catch:{ all -> 0x004b }
            r14.nextFrameTimeNs = r1     // Catch:{ all -> 0x004b }
            goto L_0x0039
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            long r12 = java.lang.System.nanoTime()
            int r0 = r9.getRotatedWidth()
            float r0 = (float) r0
            int r1 = r9.getRotatedHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            java.lang.Object r1 = r14.layoutLock
            monitor-enter(r1)
            float r2 = r14.layoutAspectRatio     // Catch:{ all -> 0x0115 }
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r2 = r0
        L_0x0076:
            monitor-exit(r1)     // Catch:{ all -> 0x0115 }
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 <= 0) goto L_0x0080
            float r2 = r2 / r0
            r0 = r4
            goto L_0x0082
        L_0x0080:
            float r0 = r0 / r2
            r2 = r4
        L_0x0082:
            android.graphics.Matrix r1 = r14.drawMatrix
            r1.reset()
            android.graphics.Matrix r1 = r14.drawMatrix
            r5 = 1056964608(0x3f000000, float:0.5)
            r1.preTranslate(r5, r5)
            android.graphics.Matrix r1 = r14.drawMatrix
            boolean r5 = r14.mirrorHorizontally
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 == 0) goto L_0x0098
            r5 = r6
            goto L_0x0099
        L_0x0098:
            r5 = r4
        L_0x0099:
            boolean r7 = r14.mirrorVertically
            if (r7 == 0) goto L_0x009e
            r4 = r6
        L_0x009e:
            r1.preScale(r5, r4)
            android.graphics.Matrix r1 = r14.drawMatrix
            r1.preScale(r2, r0)
            android.graphics.Matrix r0 = r14.drawMatrix
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0.preTranslate(r1, r1)
            if (r11 == 0) goto L_0x00ed
            android.opengl.GLES20.glClearColor(r3, r3, r3, r3)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            org.webrtc.VideoFrameDrawer r1 = r14.frameDrawer     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            org.webrtc.RendererCommon$GlDrawer r3 = r14.drawer     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            android.graphics.Matrix r4 = r14.drawMatrix     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            org.webrtc.EglBase r0 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            int r7 = r0.surfaceWidth()     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            org.webrtc.EglBase r0 = r14.eglBase     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            int r8 = r0.surfaceHeight()     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            r5 = 0
            r6 = 0
            r2 = r9
            r1.drawFrame(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            long r0 = java.lang.System.nanoTime()     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            r14.swapBuffersOnRenderThread(r9, r0)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            java.lang.Object r2 = r14.statisticsLock     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            monitor-enter(r2)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
            int r3 = r14.framesRendered     // Catch:{ all -> 0x00e6 }
            int r3 = r3 + r10
            r14.framesRendered = r3     // Catch:{ all -> 0x00e6 }
            long r3 = r14.renderTimeNs     // Catch:{ all -> 0x00e6 }
            long r0 = r0 - r12
            long r0 = r0 + r3
            r14.renderTimeNs = r0     // Catch:{ all -> 0x00e6 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x00ed
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ GlOutOfMemoryException -> 0x00eb }
        L_0x00e9:
            r14 = move-exception
            goto L_0x0111
        L_0x00eb:
            r0 = move-exception
            goto L_0x00f4
        L_0x00ed:
            r14.notifyCallbacks(r9, r11)     // Catch:{ GlOutOfMemoryException -> 0x00eb }
        L_0x00f0:
            r9.release()
            goto L_0x0110
        L_0x00f4:
            java.lang.String r1 = "Error while drawing frame"
            r14.logE(r1, r0)     // Catch:{ all -> 0x00e9 }
            org.webrtc.EglRenderer$ErrorCallback r0 = r14.errorCallback     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x0100
            r0.onGlOutOfMemory()     // Catch:{ all -> 0x00e9 }
        L_0x0100:
            org.webrtc.RendererCommon$GlDrawer r0 = r14.drawer     // Catch:{ all -> 0x00e9 }
            r0.release()     // Catch:{ all -> 0x00e9 }
            org.webrtc.VideoFrameDrawer r0 = r14.frameDrawer     // Catch:{ all -> 0x00e9 }
            r0.release()     // Catch:{ all -> 0x00e9 }
            org.webrtc.GlTextureFrameBuffer r14 = r14.bitmapTextureFramebuffer     // Catch:{ all -> 0x00e9 }
            r14.release()     // Catch:{ all -> 0x00e9 }
            goto L_0x00f0
        L_0x0110:
            return
        L_0x0111:
            r9.release()
            throw r14
        L_0x0115:
            r14 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0115 }
            throw r14
        L_0x0118:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r14
        L_0x011a:
            java.lang.String r0 = "Dropping frame - No surface"
            r14.logD(r0)
            r9.release()
            return
        L_0x0123:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.renderFrameOnRenderThread():void");
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0;
            this.renderSwapBufferTimeNs = 0;
        }
    }

    private void swapBuffersOnRenderThread(VideoFrame videoFrame, long j) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread2 = this.eglThread;
                if (eglThread2 != null) {
                    eglThread2.scheduleRenderUpdate(new r05(this, videoFrame, j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, (RendererCommon.GlDrawer) null, false);
    }

    public void clearImage() {
        clearImage(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread2, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    logD("Initializing EglRenderer");
                    this.eglThread = eglThread2;
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z;
                    eglThread2.addExceptionCallback(this.eglExceptionCallback);
                    this.eglBase = eglThread2.createEglBaseWithSharedConnection();
                    eglThread2.getHandler().post(this.eglSurfaceCreationRunnable);
                    resetStatistics(System.nanoTime());
                    eglThread2.getHandler().postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                } else {
                    String str = this.name;
                    throw new IllegalStateException(str + "Already initialized");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r7 = r6.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r6.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.statisticsLock
            monitor-enter(r0)
            int r1 = r6.framesReceived     // Catch:{ all -> 0x0057 }
            r2 = 1
            int r1 = r1 + r2
            r6.framesReceived = r1     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r6.threadLock
            monitor-enter(r1)
            org.webrtc.EglThread r0 = r6.eglThread     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x001a
            java.lang.String r7 = "Dropping frame - Not initialized or already released."
            r6.logD(r7)     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r6 = move-exception
            goto L_0x0055
        L_0x001a:
            java.lang.Object r0 = r6.frameLock     // Catch:{ all -> 0x0018 }
            monitor-enter(r0)     // Catch:{ all -> 0x0018 }
            org.webrtc.VideoFrame r3 = r6.pendingFrame     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0023
            r4 = r2
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x002c
            r3.release()     // Catch:{ all -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r6 = move-exception
            goto L_0x0053
        L_0x002c:
            r6.pendingFrame = r7     // Catch:{ all -> 0x002a }
            r7.retain()     // Catch:{ all -> 0x002a }
            org.webrtc.EglThread r7 = r6.eglThread     // Catch:{ all -> 0x002a }
            android.os.Handler r7 = r7.getHandler()     // Catch:{ all -> 0x002a }
            ne4 r3 = new ne4     // Catch:{ all -> 0x002a }
            r5 = 14
            r3.<init>(r5, r6)     // Catch:{ all -> 0x002a }
            r7.post(r3)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0052
            java.lang.Object r7 = r6.statisticsLock
            monitor-enter(r7)
            int r0 = r6.framesDropped     // Catch:{ all -> 0x004f }
            int r0 = r0 + r2
            r6.framesDropped = r0     // Catch:{ all -> 0x004f }
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            goto L_0x0052
        L_0x004f:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r6
        L_0x0052:
            return
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r6     // Catch:{ all -> 0x0018 }
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r6
        L_0x0057:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void pauseVideo() {
        setFpsReduction(c44.DEFAULT_ASPECT_RATIO);
    }

    public void printStackTrace() {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread2 = this.eglThread;
                Thread thread = eglThread2 == null ? null : eglThread2.getHandler().getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r0);
        r0 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = r5.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        logD("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.logD(r0)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r1 = r5.threadLock
            monitor-enter(r1)
            org.webrtc.EglThread r2 = r5.eglThread     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "Already released"
            r5.logD(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r5 = move-exception
            goto L_0x005f
        L_0x001b:
            android.os.Handler r2 = r2.getHandler()     // Catch:{ all -> 0x0019 }
            java.lang.Runnable r3 = r5.logStatisticsRunnable     // Catch:{ all -> 0x0019 }
            r2.removeCallbacks(r3)     // Catch:{ all -> 0x0019 }
            org.webrtc.EglThread r2 = r5.eglThread     // Catch:{ all -> 0x0019 }
            java.lang.Runnable r3 = r5.eglExceptionCallback     // Catch:{ all -> 0x0019 }
            r2.removeExceptionCallback(r3)     // Catch:{ all -> 0x0019 }
            org.webrtc.EglThread r2 = r5.eglThread     // Catch:{ all -> 0x0019 }
            android.os.Handler r2 = r2.getHandler()     // Catch:{ all -> 0x0019 }
            bk4 r3 = new bk4     // Catch:{ all -> 0x0019 }
            r4 = 10
            r3.<init>(r4, r5, r0)     // Catch:{ all -> 0x0019 }
            r2.postAtFrontOfQueue(r3)     // Catch:{ all -> 0x0019 }
            org.webrtc.EglThread r2 = r5.eglThread     // Catch:{ all -> 0x0019 }
            r2.release()     // Catch:{ all -> 0x0019 }
            r2 = 0
            r5.eglThread = r2     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            java.lang.Object r0 = r5.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r5.pendingFrame     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0056
            r1.release()     // Catch:{ all -> 0x0054 }
            r5.pendingFrame = r2     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            r5 = move-exception
            goto L_0x005d
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Releasing done."
            r5.logD(r0)
            return
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r5
        L_0x005f:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface((Object) null);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread2 = this.eglThread;
                if (eglThread2 != null) {
                    eglThread2.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.eglThread.getHandler().postAtFrontOfQueue(new bk4(9, this, runnable));
                    return;
                }
                runnable.run();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread != null) {
                    if (Thread.currentThread() != this.eglThread.getHandler().getLooper().getThread()) {
                        postToRenderThread(new ktg(this, countDownLatch, frameListener, 28));
                        ThreadUtils.awaitUninterruptibly(countDownLatch);
                        return;
                    }
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback2) {
        this.errorCallback = errorCallback2;
    }

    public void setFpsReduction(float f) {
        synchronized (this.fpsReductionLock) {
            try {
                long j = this.minRenderPeriodNs;
                if (f <= c44.DEFAULT_ASPECT_RATIO) {
                    this.minRenderPeriodNs = LongCompanionObject.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
                }
                if (this.minRenderPeriodNs != j) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        if (z != this.mirrorHorizontally) {
            synchronized (this.layoutLock) {
                this.mirrorHorizontally = z;
            }
        }
    }

    public void setMirrorVertically(boolean z) {
        if (z != this.mirrorVertically) {
            synchronized (this.layoutLock) {
                this.mirrorVertically = z;
            }
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() {
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() {
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    try {
                        if (EglRenderer.this.eglThread != null) {
                            EglRenderer.this.eglThread.getHandler().removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.eglThread.getHandler().postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread2 = this.eglThread;
                if (eglThread2 != null) {
                    eglThread2.getHandler().postAtFrontOfQueue(new q05(this, f, f2, f3, f4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
        postToRenderThread(new p05(this, glDrawer, frameListener, f, z));
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create((EglThread.ReleaseMonitor) null, context, iArr), glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
