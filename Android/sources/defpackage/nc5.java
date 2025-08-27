package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: nc5  reason: default package */
public final class nc5 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ tc5 a;

    public nc5(tc5 tc5) {
        this.a = tc5;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        tc5 tc5 = this.a;
        tc5.getClass();
        Surface surface = new Surface(surfaceTexture);
        tc5.D1(surface);
        tc5.Z0 = surface;
        tc5.y1(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tc5 tc5 = this.a;
        tc5.D1((Object) null);
        tc5.y1(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.y1(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.y1(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        tc5 tc5 = this.a;
        tc5.getClass();
        tc5.y1(0, 0);
    }
}
