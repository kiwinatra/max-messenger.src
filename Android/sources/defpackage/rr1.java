package defpackage;

import android.hardware.camera2.CameraManager;

/* renamed from: rr1  reason: default package */
public final class rr1 extends CameraManager.AvailabilityCallback implements nv1 {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ xr1 c;

    public rr1(xr1 xr1, String str) {
        this.c = xr1;
        this.a = str;
    }

    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.Q0 == 4) {
                this.c.I(false);
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
