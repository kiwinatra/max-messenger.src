package defpackage;

import android.media.VolumeProvider;
import android.os.Handler;
import one.me.calls.impl.service.CallServiceImpl;

/* renamed from: pj1  reason: default package */
public final class pj1 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj1(to0 to0, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = to0;
    }

    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                z68.c("CallServiceTag", "on adjust volume changed: " + i, new Object[0]);
                ((s61) ((CallServiceImpl) this.b).w.getValue()).a();
                return;
            default:
                to0 to0 = (to0) this.b;
                to0.getClass();
                v0g.W((Handler) to0.w, new wpb(to0, i, 1, 1));
                return;
        }
    }

    public void onSetVolumeTo(int i) {
        switch (this.a) {
            case 1:
                to0 to0 = (to0) this.b;
                to0.getClass();
                v0g.W((Handler) to0.w, new wpb(to0, i, 1, 0));
                return;
            default:
                super.onSetVolumeTo(i);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj1(CallServiceImpl callServiceImpl) {
        super(1, 0, 0);
        this.b = callServiceImpl;
    }
}
