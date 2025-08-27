package org.webrtc;

import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private static final String TAG = "SurfaceEglRenderer";
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock = new Object();
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    private void logD(String str) {
        String str2 = this.name;
        Logging.d(TAG, str2 + ": " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Reporting frame resolution changed to "
            java.lang.Object r1 = r6.layoutLock
            monitor-enter(r1)
            boolean r2 = r6.isRenderingPaused     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r6 = move-exception
            goto L_0x009b
        L_0x000e:
            boolean r2 = r6.isFirstFrameRendered     // Catch:{ all -> 0x000b }
            if (r2 != 0) goto L_0x0021
            r2 = 1
            r6.isFirstFrameRendered = r2     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "Reporting first rendered frame."
            r6.logD(r2)     // Catch:{ all -> 0x000b }
            org.webrtc.RendererCommon$RendererEvents r2 = r6.rendererEvents     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x0021
            r2.onFirstFrameRendered()     // Catch:{ all -> 0x000b }
        L_0x0021:
            int r2 = r6.rotatedFrameWidth     // Catch:{ all -> 0x000b }
            int r3 = r7.getRotatedWidth()     // Catch:{ all -> 0x000b }
            if (r2 != r3) goto L_0x0039
            int r2 = r6.rotatedFrameHeight     // Catch:{ all -> 0x000b }
            int r3 = r7.getRotatedHeight()     // Catch:{ all -> 0x000b }
            if (r2 != r3) goto L_0x0039
            int r2 = r6.frameRotation     // Catch:{ all -> 0x000b }
            int r3 = r7.getRotation()     // Catch:{ all -> 0x000b }
            if (r2 == r3) goto L_0x0099
        L_0x0039:
            org.webrtc.VideoFrame$Buffer r2 = r7.getBuffer()     // Catch:{ all -> 0x000b }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x000b }
            org.webrtc.VideoFrame$Buffer r3 = r7.getBuffer()     // Catch:{ all -> 0x000b }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x000b }
            int r4 = r7.getRotation()     // Catch:{ all -> 0x000b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x000b }
            r5.<init>(r0)     // Catch:{ all -> 0x000b }
            r5.append(r2)     // Catch:{ all -> 0x000b }
            java.lang.String r0 = "x"
            r5.append(r0)     // Catch:{ all -> 0x000b }
            r5.append(r3)     // Catch:{ all -> 0x000b }
            java.lang.String r0 = " with rotation "
            r5.append(r0)     // Catch:{ all -> 0x000b }
            r5.append(r4)     // Catch:{ all -> 0x000b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x000b }
            r6.logD(r0)     // Catch:{ all -> 0x000b }
            org.webrtc.RendererCommon$RendererEvents r0 = r6.rendererEvents     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0087
            org.webrtc.VideoFrame$Buffer r2 = r7.getBuffer()     // Catch:{ all -> 0x000b }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x000b }
            org.webrtc.VideoFrame$Buffer r3 = r7.getBuffer()     // Catch:{ all -> 0x000b }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x000b }
            int r4 = r7.getRotation()     // Catch:{ all -> 0x000b }
            r0.onFrameResolutionChanged(r2, r3, r4)     // Catch:{ all -> 0x000b }
        L_0x0087:
            int r0 = r7.getRotatedWidth()     // Catch:{ all -> 0x000b }
            r6.rotatedFrameWidth = r0     // Catch:{ all -> 0x000b }
            int r0 = r7.getRotatedHeight()     // Catch:{ all -> 0x000b }
            r6.rotatedFrameHeight = r0     // Catch:{ all -> 0x000b }
            int r7 = r7.getRotation()     // Catch:{ all -> 0x000b }
            r6.frameRotation = r7     // Catch:{ all -> 0x000b }
        L_0x0099:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x009b:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceEglRenderer.updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame):void");
    }

    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f == c44.DEFAULT_ASPECT_RATIO;
        }
        super.setFpsReduction(f);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i + " size: " + i2 + "x" + i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new mgd(17, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
