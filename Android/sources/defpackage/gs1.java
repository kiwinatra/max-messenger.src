package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: gs1  reason: default package */
public final class gs1 implements ls1 {
    public final lr1 a;
    public boolean b = false;

    public gs1(lr1 lr1) {
        this.a = lr1;
    }

    public final zz7 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        Integer num2;
        xa7 E = hd8.E(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return E;
        }
        int intValue = num.intValue();
        if ((intValue == 1 || intValue == 2) && (num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) != null && num2.intValue() == 0) {
            this.b = true;
            this.a.h.e(false);
        }
        return E;
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        if (this.b) {
            this.a.h.a(true, false);
        }
    }
}
