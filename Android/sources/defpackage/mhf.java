package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mhf  reason: default package */
public final class mhf extends sda {
    public TextureView e;
    public SurfaceTexture f;
    public go1 g;
    public z3f h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public u00 l;

    public final View f() {
        return this.e;
    }

    public final Bitmap g() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    public final void j() {
        SurfaceTexture surfaceTexture;
        if (this.i && this.j != null && this.e.getSurfaceTexture() != (surfaceTexture = this.j)) {
            this.e.setSurfaceTexture(surfaceTexture);
            this.j = null;
            this.i = false;
        }
    }

    public final void k() {
        this.i = true;
    }

    public final void l(z3f z3f, u00 u00) {
        this.b = z3f.b;
        this.l = u00;
        FrameLayout frameLayout = (FrameLayout) this.c;
        frameLayout.getClass();
        ((Size) this.b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new lhf(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        z3f z3f2 = this.h;
        if (z3f2 != null) {
            z3f2.d();
        }
        this.h = z3f;
        Executor a = iw3.a(this.e.getContext());
        z3f.k.a(new s6e(15, this, z3f), a);
        p();
    }

    public final zz7 o() {
        return m5a.F(new nqd(26, this));
    }

    public final void p() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size != null && (surfaceTexture = this.f) != null && this.h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
            Surface surface = new Surface(this.f);
            z3f z3f = this.h;
            go1 F = m5a.F(new pbb(22, this, surface));
            this.g = F;
            F.b.d(new jh3(17, this, surface, F, z3f), iw3.a(this.e.getContext()));
            this.a = true;
            m();
        }
    }
}
