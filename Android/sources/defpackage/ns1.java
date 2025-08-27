package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ns1  reason: default package */
public final class ns1 implements kr1 {
    public do1 a;
    public final go1 b = m5a.F(new ms1(0, this));
    public final fm0 c;

    public ns1(fm0 fm0) {
        this.c = fm0;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        fm0 fm0 = this.c;
        if (fm0 != null && !fm0.a(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
