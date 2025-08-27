package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = (long) Math.round(((float) TimeUnit.SECONDS.toNanos(1)) / f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new p1d(this, 1));
        Logging.d(TAG, "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        for (Listener onRenderWindowClose : this.listeners) {
            onRenderWindowClose.onRenderWindowClose();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new mg(2, this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r8.choreographer.postFrameCallback(new defpackage.mg(2, r8));
        r0 = r9 - r8.lastOpenedTimeNanos;
        r8.lastRefreshTimeNanos = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (java.lang.Math.abs(r0 - r8.targetFrameIntervalNanos) >= java.lang.Math.abs((r0 - r8.targetFrameIntervalNanos) + (r9 - r8.lastRefreshTimeNanos))) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r8.lastOpenedTimeNanos = r9;
        openRenderWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r8.renderWindowOpen == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        closeRenderWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDisplayRefreshCycleBegin(long r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.lock
            monitor-enter(r0)
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r1 = r8.listeners     // Catch:{ all -> 0x0017 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r9 = "RenderSynchronizer"
            java.lang.String r10 = "No listeners, unsubscribing to frame callbacks"
            org.webrtc.Logging.d(r9, r10)     // Catch:{ all -> 0x0017 }
            r9 = 0
            r8.isListening = r9     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r8 = move-exception
            goto L_0x0051
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            android.view.Choreographer r0 = r8.choreographer
            mg r1 = new mg
            r2 = 2
            r1.<init>(r2, r8)
            r0.postFrameCallback(r1)
            long r0 = r8.lastOpenedTimeNanos
            long r0 = r9 - r0
            long r2 = r8.lastRefreshTimeNanos
            long r2 = r9 - r2
            r8.lastRefreshTimeNanos = r9
            long r4 = r8.targetFrameIntervalNanos
            long r4 = r0 - r4
            long r4 = java.lang.Math.abs(r4)
            long r6 = r8.targetFrameIntervalNanos
            long r0 = r0 - r6
            long r0 = r0 + r2
            long r0 = java.lang.Math.abs(r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            r8.lastOpenedTimeNanos = r9
            r8.openRenderWindow()
            goto L_0x0050
        L_0x0049:
            boolean r9 = r8.renderWindowOpen
            if (r9 == 0) goto L_0x0050
            r8.closeRenderWindow()
        L_0x0050:
            return
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RenderSynchronizer.onDisplayRefreshCycleBegin(long):void");
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        for (Listener onRenderWindowOpen : this.listeners) {
            onRenderWindowOpen.onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1 : 0);
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d(TAG, "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new p1d(this, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(DEFAULT_TARGET_FPS);
    }
}
