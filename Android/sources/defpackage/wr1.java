package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: wr1  reason: default package */
public final class wr1 extends CameraDevice.StateCallback {
    public final Executor a;
    public final ScheduledExecutorService b;
    public vr1 c;
    public ScheduledFuture d;
    public final ur1 e;
    public final /* synthetic */ xr1 f;

    /* JADX WARNING: type inference failed for: r1v1, types: [ur1, java.lang.Object] */
    public wr1(xr1 xr1, tsd tsd, ew6 ew6, long j) {
        this.f = xr1;
        this.a = tsd;
        this.b = ew6;
        ? obj = new Object();
        obj.c = this;
        obj.b = -1;
        obj.a = j;
        this.e = obj;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        Objects.toString(this.c);
        this.f.toString();
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        boolean z = true;
        bs0.r((String) null, this.c == null);
        if (this.d != null) {
            z = false;
        }
        bs0.r((String) null, z);
        ur1 ur1 = this.e;
        ur1.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (ur1.b == -1) {
            ur1.b = uptimeMillis;
        }
        int i = ((uptimeMillis - ur1.b) > ((long) ur1.b()) ? 1 : ((uptimeMillis - ur1.b) == ((long) ur1.b()) ? 0 : -1));
        xr1 xr1 = this.f;
        if (i >= 0) {
            ur1.b = -1;
            ur1.b();
            xr1.D(4, (ga0) null, false);
            return;
        }
        this.c = new vr1(0, (Object) this, (Object) this.a);
        ur1.a();
        Objects.toString(this.c);
        boolean z2 = xr1.L0;
        xr1.toString();
        this.d = this.b.schedule(this.c, (long) ur1.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r2 = this;
            xr1 r2 = r2.f
            boolean r0 = r2.L0
            if (r0 == 0) goto L_0x000f
            int r2 = r2.Y
            r0 = 1
            if (r2 == r0) goto L_0x0010
            r1 = 2
            if (r2 != r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.c():boolean");
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f.toString();
        boolean z = this.f.X == null;
        bs0.r("Unexpected onClose callback on camera device: " + cameraDevice, z);
        int y = tr1.y(this.f.Q0);
        if (y == 1 || y == 4) {
            bs0.r((String) null, this.f.v0.isEmpty());
            this.f.r();
        } else if (y == 5 || y == 6) {
            xr1 xr1 = this.f;
            int i = xr1.Y;
            if (i != 0) {
                "Camera closed due to error: ".concat(xr1.u(i));
                xr1.toString();
                b();
                return;
            }
            xr1.I(false);
        } else {
            throw new IllegalStateException("Camera closed while in state: ".concat(a81.z(this.f.Q0)));
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.toString();
        onError(cameraDevice, 1);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        xr1 xr1 = this.f;
        xr1.X = cameraDevice;
        xr1.Y = i;
        xe8 xe8 = xr1.P0;
        ((xr1) xe8.c).toString();
        xe8.i();
        int y = tr1.y(this.f.Q0);
        if (y != 1) {
            switch (y) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    a81.w(this.f.Q0);
                    int i2 = 6;
                    boolean z = false;
                    bs0.r("Attempt to handle open error from non open state: ".concat(a81.z(this.f.Q0)), this.f.Q0 == 8 || this.f.Q0 == 9 || this.f.Q0 == 10 || this.f.Q0 == 7 || this.f.Q0 == 6);
                    int i3 = 3;
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        xr1 xr12 = this.f;
                        if (xr12.Y != 0) {
                            z = true;
                        }
                        bs0.r("Can only reopen camera device after error if the camera device is actually in an error state.", z);
                        if (i == 1) {
                            i3 = 2;
                        } else if (i == 2) {
                            i3 = 1;
                        }
                        xr12.D(7, new ga0((Throwable) null, i3), true);
                        xr12.q();
                        return;
                    }
                    cameraDevice.getId();
                    if (i == 3) {
                        i2 = 5;
                    }
                    this.f.D(5, new ga0((Throwable) null, i2), true);
                    this.f.q();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(a81.z(this.f.Q0)));
            }
        }
        cameraDevice.getId();
        a81.w(this.f.Q0);
        this.f.q();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f.toString();
        xr1 xr1 = this.f;
        xr1.X = cameraDevice;
        xr1.Y = 0;
        this.e.b = -1;
        int y = tr1.y(xr1.Q0);
        if (y == 1 || y == 4) {
            bs0.r((String) null, this.f.v0.isEmpty());
            this.f.X.close();
            this.f.X = null;
        } else if (y == 5 || y == 6 || y == 7) {
            this.f.E(9);
            ov1 ov1 = this.f.z0;
            String id = cameraDevice.getId();
            xr1 xr12 = this.f;
            if (ov1.e(id, xr12.y0.G(xr12.X.getId()))) {
                this.f.A();
            }
        } else {
            throw new IllegalStateException("onOpened() should not be possible from state: ".concat(a81.z(this.f.Q0)));
        }
    }
}
