package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;

/* renamed from: ob4  reason: default package */
public final /* synthetic */ class ob4 implements h08, i08, nsb, zi6, vp8, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ ob4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public void accept(Object obj) {
        ypb ypb = (ypb) obj;
        switch (this.a) {
            case 7:
                ypb.V(this.b);
                return;
            case 8:
                ypb.H(this.b);
                return;
            case 9:
                ypb.setRepeatMode(this.b);
                return;
            default:
                ypb.u0(this.b);
                return;
        }
    }

    public Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) ((List) obj).get(this.b);
        return bitmap == null ? uh8.a : nh8.e(bitmap);
    }

    public void c(np8 np8) {
        if (np8.isConnected()) {
            qo8 qo8 = np8.a;
            qo8.getClass();
            n79.n(Looper.myLooper() == qo8.v.getLooper());
            qo8.o.getClass();
            ya7 a2 = oo8.a();
            a2.d(new kh1((Object) np8, (Object) a2, this.b, 13), dp4.a);
        }
    }

    public void invoke(Object obj) {
        int i = this.b;
        switch (this.a) {
            case 0:
                ((sb5) obj).getClass();
                z68.c("sb5", "onDroppedVideoFrames: " + i, new Object[0]);
                return;
            case 1:
                ((rob) obj).onRepeatModeChanged(i);
                return;
            case 2:
                ((sob) obj).onRepeatModeChanged(i);
                return;
            default:
                ((sob) obj).onRepeatModeChanged(i);
                return;
        }
    }

    public boolean test(Object obj) {
        return this.b < ((List) obj).size();
    }

    public /* synthetic */ ob4(int i, yvd yvd, Bundle bundle) {
        this.a = 6;
        this.b = i;
    }

    public /* synthetic */ ob4(sd sdVar, int i, long j) {
        this.a = 0;
        this.b = i;
    }
}
