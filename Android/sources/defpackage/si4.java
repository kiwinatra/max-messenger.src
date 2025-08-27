package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: si4  reason: default package */
public final /* synthetic */ class si4 implements tk3 {
    public final /* synthetic */ ti4 a;
    public final /* synthetic */ z3f b;
    public final /* synthetic */ SurfaceTexture c;
    public final /* synthetic */ Surface d;

    public /* synthetic */ si4(ti4 ti4, z3f z3f, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = ti4;
        this.b = z3f;
        this.c = surfaceTexture;
        this.d = surface;
    }

    public final void accept(Object obj) {
        ti4 ti4 = this.a;
        z3f z3f = this.b;
        SurfaceTexture surfaceTexture = this.c;
        Surface surface = this.d;
        nc0 nc0 = (nc0) obj;
        ti4.getClass();
        synchronized (z3f.a) {
            z3f.n = null;
            z3f.o = null;
        }
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        surface.release();
        ti4.z--;
        ti4.d();
    }
}
