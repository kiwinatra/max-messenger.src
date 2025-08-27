package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: vx5  reason: default package */
public final /* synthetic */ class vx5 implements kr1 {
    public final /* synthetic */ wx5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ do1 c;

    public /* synthetic */ vx5(wx5 wx5, long j, do1 do1) {
        this.a = wx5;
        this.b = j;
        this.c = do1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        wx5 wx5 = this.a;
        wx5.getClass();
        if ((((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) != wx5.v || !lr1.x(totalCaptureResult, this.b)) {
            return false;
        }
        do1 do1 = this.c;
        if (do1 != null) {
            do1.b((Object) null);
        }
        return true;
    }
}
