package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ix1  reason: default package */
public final class ix1 extends r6f {
    public final /* synthetic */ int a;
    public final Object b;

    public ix1(jx1 jx1) {
        this.a = 0;
        this.b = jx1;
    }

    private final void i(t6f t6f) {
    }

    public void a(u6f u6f) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((ata) u6f.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).a(u6f);
                }
                return;
            default:
                return;
        }
    }

    public void b(u6f u6f) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((ata) u6f.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).b(u6f);
                }
                return;
            default:
                return;
        }
    }

    public void c(t6f t6f) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((ata) t6f.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).c(t6f);
                }
                return;
            default:
                return;
        }
    }

    public final void d(t6f t6f) {
        switch (this.a) {
            case 0:
                synchronized (((jx1) this.b).a) {
                    try {
                        switch (tr1.y(((jx1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(a81.A(((jx1) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((jx1) this.b).d();
                                break;
                        }
                        int i = ((jx1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((ata) t6f.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).d(t6f);
                }
                return;
        }
    }

    public final void e(u6f u6f) {
        switch (this.a) {
            case 0:
                synchronized (((jx1) this.b).a) {
                    try {
                        switch (tr1.y(((jx1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(a81.A(((jx1) this.b).i)));
                            case 3:
                                jx1 jx1 = (jx1) this.b;
                                jx1.i = 5;
                                jx1.e = u6f;
                                jx1.k(jx1.f);
                                jx1 jx12 = (jx1) this.b;
                                jx12.o.c().d(new pr1(9, jx12), ryg.j());
                                break;
                            case 5:
                                ((jx1) this.b).e = u6f;
                                break;
                            case 6:
                                u6f.j();
                                break;
                        }
                        int i = ((jx1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((ata) u6f.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).e(u6f);
                }
                return;
        }
    }

    public final void f(u6f u6f) {
        switch (this.a) {
            case 0:
                synchronized (((jx1) this.b).a) {
                    try {
                        if (tr1.y(((jx1) this.b).i) != 0) {
                            int i = ((jx1) this.b).i;
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(a81.A(((jx1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((ata) u6f.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).f(u6f);
                }
                return;
        }
    }

    public final void g(t6f t6f) {
        switch (this.a) {
            case 0:
                synchronized (((jx1) this.b).a) {
                    try {
                        jx1 jx1 = (jx1) this.b;
                        if (jx1.i != 1) {
                            jx1.d();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(a81.A(((jx1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).g(t6f);
                }
                return;
        }
    }

    public void h(u6f u6f, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((ata) u6f.q().b).b, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((r6f) it.next()).h(u6f, surface);
                }
                return;
            default:
                return;
        }
    }

    public ix1(int i, List list) {
        Object obj;
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    obj = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    obj = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    obj = new kt1(list);
                }
                this.b = obj;
                return;
        }
    }
}
