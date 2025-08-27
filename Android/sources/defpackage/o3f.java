package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* renamed from: o3f  reason: default package */
public final /* synthetic */ class o3f implements vu {
    public final /* synthetic */ q3f a;
    public final /* synthetic */ p3f b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kc0 o;
    public final /* synthetic */ kc0 v;

    public /* synthetic */ o3f(q3f q3f, p3f p3f, int i, kc0 kc0, kc0 kc02) {
        this.a = q3f;
        this.b = p3f;
        this.c = i;
        this.o = kc0;
        this.v = kc02;
    }

    public final zz7 apply(Object obj) {
        p3f p3f = this.b;
        Surface surface = (Surface) obj;
        q3f q3f = this.a;
        q3f.getClass();
        surface.getClass();
        try {
            p3f.d();
            s3f s3f = new s3f(surface, this.c, q3f.g.a, this.o, this.v);
            s3f.X.b.d(new n3f(p3f, 1), ryg.j());
            bs0.r("Consumer can only be linked once.", p3f.q == null);
            p3f.q = s3f;
            return hd8.E(s3f);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new xa7(1, e);
        }
    }
}
