package defpackage;

import android.graphics.SurfaceTexture;

/* renamed from: if5  reason: default package */
public final /* synthetic */ class if5 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ kf5 a;
    public final /* synthetic */ gy0 b;

    public /* synthetic */ if5(kf5 kf5, gy0 gy0) {
        this.a = kf5;
        this.b = gy0;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        kf5 kf5 = this.a;
        kf5.getClass();
        this.b.v(new hf5(kf5, 4));
    }
}
