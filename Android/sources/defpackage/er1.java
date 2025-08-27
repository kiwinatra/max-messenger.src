package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: er1  reason: default package */
public final /* synthetic */ class er1 implements kr1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ do1 b;

    public /* synthetic */ er1(long j, do1 do1) {
        this.a = j;
        this.b = do1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        if (!lr1.x(totalCaptureResult, this.a)) {
            return false;
        }
        this.b.b((Object) null);
        return true;
    }
}
