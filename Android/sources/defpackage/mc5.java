package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: mc5  reason: default package */
public final class mc5 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ sc5 a;

    public mc5(sc5 sc5) {
        this.a = sc5;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        sc5 sc5 = this.a;
        sc5.getClass();
        Surface surface = new Surface(surfaceTexture);
        sc5.A1(surface);
        sc5.V0 = surface;
        sc5.w1(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sc5 sc5 = this.a;
        sc5.A1((Surface) null);
        sc5.w1(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.w1(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.w1(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        sc5 sc5 = this.a;
        sc5.getClass();
        sc5.w1(0, 0);
    }
}
