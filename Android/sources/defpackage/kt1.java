package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: kt1  reason: default package */
public final class kt1 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                t6f t6f = (t6f) this.b;
                t6f.k(cameraCaptureSession);
                t6f.a((u6f) t6f);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                t6f t6f = (t6f) this.b;
                t6f.k(cameraCaptureSession);
                t6f.b((u6f) t6f);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                t6f t6f = (t6f) this.b;
                t6f.k(cameraCaptureSession);
                t6f.c(t6f);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        do1 do1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((t6f) this.b).k(cameraCaptureSession);
                    t6f t6f = (t6f) this.b;
                    t6f.d(t6f);
                    synchronized (((t6f) this.b).a) {
                        bs0.q(((t6f) this.b).h, "OpenCaptureSession completer should not null");
                        t6f t6f2 = (t6f) this.b;
                        do1 = t6f2.h;
                        t6f2.h = null;
                    }
                    do1.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((t6f) this.b).a) {
                        bs0.q(((t6f) this.b).h, "OpenCaptureSession completer should not null");
                        t6f t6f3 = (t6f) this.b;
                        do1 do12 = t6f3.h;
                        t6f3.h = null;
                        do12.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        do1 do1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((t6f) this.b).k(cameraCaptureSession);
                    t6f t6f = (t6f) this.b;
                    t6f.e((u6f) t6f);
                    synchronized (((t6f) this.b).a) {
                        bs0.q(((t6f) this.b).h, "OpenCaptureSession completer should not null");
                        t6f t6f2 = (t6f) this.b;
                        do1 = t6f2.h;
                        t6f2.h = null;
                    }
                    do1.b((Object) null);
                    return;
                } catch (Throwable th) {
                    synchronized (((t6f) this.b).a) {
                        bs0.q(((t6f) this.b).h, "OpenCaptureSession completer should not null");
                        t6f t6f3 = (t6f) this.b;
                        do1 do12 = t6f3.h;
                        t6f3.h = null;
                        do12.b((Object) null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((esg) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                t6f t6f = (t6f) this.b;
                t6f.k(cameraCaptureSession);
                t6f.f((u6f) t6f);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                t6f t6f = (t6f) this.b;
                t6f.k(cameraCaptureSession);
                t6f.h((u6f) t6f, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public kt1(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof lt1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
