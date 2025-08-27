package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: aof  reason: default package */
public final /* synthetic */ class aof implements kr1 {
    public final /* synthetic */ bof a;

    public /* synthetic */ aof(bof bof) {
        this.a = bof;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        bof bof = this.a;
        if (bof.f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == bof.g) {
                bof.f.b((Object) null);
                bof.f = null;
            }
        }
        return false;
    }
}
