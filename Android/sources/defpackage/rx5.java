package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.ScheduledFuture;

/* renamed from: rx5  reason: default package */
public final /* synthetic */ class rx5 implements kr1 {
    public final /* synthetic */ wx5 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ rx5(wx5 wx5, boolean z, long j) {
        this.a = wx5;
        this.b = z;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        wx5 wx5 = this.a;
        wx5.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (wx5.q.length > 0) {
            if (!this.b || num == null) {
                wx5.m = true;
                wx5.l = true;
            } else if (wx5.h.intValue() == 3) {
                if (num.intValue() == 4) {
                    wx5.m = true;
                    wx5.l = true;
                } else if (num.intValue() == 5) {
                    wx5.m = false;
                    wx5.l = true;
                }
            }
        }
        if (wx5.l && lr1.x(totalCaptureResult, this.c)) {
            boolean z = wx5.m;
            ScheduledFuture scheduledFuture = wx5.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                wx5.j = null;
            }
            do1 do1 = wx5.t;
            if (do1 != null) {
                do1.b(new xx5(z));
                wx5.t = null;
            }
            return true;
        } else if (wx5.h.equals(num) || num == null) {
            return false;
        } else {
            wx5.h = num;
            return false;
        }
    }
}
