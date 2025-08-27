package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: tx5  reason: default package */
public final /* synthetic */ class tx5 implements kr1 {
    public final /* synthetic */ wx5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ tx5(int i, long j, wx5 wx5) {
        this.a = wx5;
        this.b = i;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        wx5 wx5 = this.a;
        wx5.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != this.b || !lr1.x(totalCaptureResult, this.c)) {
            return false;
        }
        do1 do1 = wx5.u;
        if (do1 != null) {
            do1.b((Object) null);
            wx5.u = null;
        }
        return true;
    }
}
