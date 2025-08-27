package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gu1  reason: default package */
public final class gu1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public gu1(kq9 kq9) {
        this.a = 1;
        this.b = kq9;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList g;
        synchronized (((kq9) this.b).b) {
            g = ((kq9) this.b).g();
            ((LinkedHashSet) ((kq9) this.b).v).clear();
            ((LinkedHashSet) ((kq9) this.b).c).clear();
            ((LinkedHashSet) ((kq9) this.b).o).clear();
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            u6f u6f = (u6f) ((t6f) it.next());
            synchronized (u6f.a) {
                try {
                    List<lk4> list = u6f.j;
                    if (list != null) {
                        for (lk4 b2 : list) {
                            b2.b();
                        }
                        u6f.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            u6f.t.d();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((kq9) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((kq9) this.b).v);
            linkedHashSet.addAll((LinkedHashSet) ((kq9) this.b).c);
        }
        ((Executor) ((kq9) this.b).a).execute(new pr1(10, linkedHashSet));
    }

    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((kq9) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((kq9) this.b).v);
                    linkedHashSet.addAll((LinkedHashSet) ((kq9) this.b).c);
                }
                ((Executor) ((kq9) this.b).a).execute(new l40(linkedHashSet, i, 6));
                a();
                return;
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public gu1(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof hu1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
