package defpackage;

import android.media.VolumeProvider;
import android.os.Handler;

/* renamed from: zdg  reason: default package */
public final class zdg extends VolumeProvider {
    public final /* synthetic */ to0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zdg(to0 to0, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = to0;
    }

    public final void onAdjustVolume(int i) {
        to0 to0 = this.a;
        to0.getClass();
        v0g.W((Handler) to0.w, new wpb(to0, i, 1, 1));
    }

    public final void onSetVolumeTo(int i) {
        to0 to0 = this.a;
        to0.getClass();
        v0g.W((Handler) to0.w, new wpb(to0, i, 1, 0));
    }
}
