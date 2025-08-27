package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* renamed from: lhf  reason: default package */
public final class lhf implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ mhf a;

    public lhf(mhf mhf) {
        this.a = mhf;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        mhf mhf = this.a;
        mhf.f = surfaceTexture;
        if (mhf.g != null) {
            mhf.h.getClass();
            Objects.toString(mhf.h);
            mhf.h.l.a();
            return;
        }
        mhf.p();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mhf mhf = this.a;
        mhf.f = null;
        go1 go1 = mhf.g;
        if (go1 == null) {
            return true;
        }
        hd8.a(go1, new zqd(this, surfaceTexture, false, 27), iw3.a(mhf.e.getContext()));
        mhf.j = surfaceTexture;
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        do1 do1 = (do1) this.a.k.getAndSet((Object) null);
        if (do1 != null) {
            do1.b((Object) null);
        }
    }
}
