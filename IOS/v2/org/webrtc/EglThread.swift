package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.webrtc.EglBase;
import org.webrtc.RenderSynchronizer;

public class EglThread implements RenderSynchronizer.Listener {
    private final EglBase.EglConnection eglConnection;
    private final HandlerWithExceptionCallbacks handler;
    private final List<RenderUpdate> pendingRenderUpdates = new ArrayList();
    private final ReleaseMonitor releaseMonitor;
    private final RenderSynchronizer renderSynchronizer;
    private boolean renderWindowOpen = true;

    public static class HandlerWithExceptionCallbacks extends Handler {
        private final Object callbackLock = new Object();
        private final List<Runnable> exceptionCallbacks = new ArrayList();

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
        }

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.e("EglThread", "Exception on EglThread", e);
                synchronized (this.callbackLock) {
                    for (Runnable run : this.exceptionCallbacks) {
                        run.run();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }
    }

    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    public interface RenderUpdate {
        void update(boolean z);
    }

    private EglThread(ReleaseMonitor releaseMonitor2, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection2, RenderSynchronizer renderSynchronizer2) {
        this.releaseMonitor = releaseMonitor2;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection2;
        this.renderSynchronizer = renderSynchronizer2;
        if (renderSynchronizer2 != null) {
            renderSynchronizer2.registerListener(this);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor2, EglBase.Context context, int[] iArr, RenderSynchronizer renderSynchronizer2) {
        HandlerThread handlerThread = new HandlerThread("EglThread");
        handlerThread.start();
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(handlerThread.getLooper());
        EglBase.EglConnection eglConnection2 = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly((Handler) handlerWithExceptionCallbacks, new z52(3, context, iArr));
        if (releaseMonitor2 == null) {
            releaseMonitor2 = new lw4(1);
        }
        return new EglThread(releaseMonitor2, handlerWithExceptionCallbacks, eglConnection2, renderSynchronizer2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) throws Exception {
        return context == null ? EglBase.EglConnection.createEgl10(iArr) : EglBase.EglConnection.create(context, iArr);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onRenderWindowClose$3() {
        this.renderWindowOpen = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onRenderWindowOpen$2() {
        this.renderWindowOpen = true;
        for (RenderUpdate update : this.pendingRenderUpdates) {
            update.update(false);
        }
        this.pendingRenderUpdates.clear();
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public void onRenderWindowClose() {
        this.handler.post(new s05(this, 1));
    }

    public void onRenderWindowOpen() {
        this.handler.post(new s05(this, 0));
    }

    public void release() {
        if (this.releaseMonitor.onRelease(this)) {
            RenderSynchronizer renderSynchronizer2 = this.renderSynchronizer;
            if (renderSynchronizer2 != null) {
                renderSynchronizer2.removeListener(this);
            }
            HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
            EglBase.EglConnection eglConnection2 = this.eglConnection;
            Objects.requireNonNull(eglConnection2);
            handlerWithExceptionCallbacks.post(new ne4(15, eglConnection2));
            this.handler.getLooper().quitSafely();
        }
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.add(renderUpdate);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor2, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor2, context, iArr, (RenderSynchronizer) null);
    }
}
