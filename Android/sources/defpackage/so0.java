package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: so0  reason: default package */
public final class so0 extends q2 {
    public boolean X;
    public boolean Y;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue();
    public final yr6 v;
    public final boolean w;
    public z1d x;
    public gs6 y;
    public int z;

    public so0(yr6 yr6, gy0 gy0, boolean z2) {
        super(gy0);
        this.v = yr6;
        this.w = z2;
    }

    public final void G() {
        this.o.clear();
        this.Y = false;
        this.X = false;
        this.z = 0;
        gs6 gs6 = this.y;
        if (gs6 != null) {
            try {
                gs6.a();
                this.y = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        super.G();
    }

    public final int I() {
        return 0;
    }

    public final void O(Bitmap bitmap, je6 je6, skf skf) {
        ((gy0) this.a).v(new po0(this, bitmap, je6, skf));
    }

    public final void X(gi4 gi4) {
        this.z = 0;
        this.x = gi4;
    }

    public final void Y() {
        ((gy0) this.a).v(new qo0(this, 0));
    }

    public final void Z() {
        if (!this.o.isEmpty() && this.z != 0) {
            ro0 ro0 = (ro0) this.o.element();
            je6 je6 = ro0.b;
            skf skf = ro0.c;
            n79.n(skf.hasNext());
            long next = skf.next() + ro0.b.e;
            if (!this.Y) {
                this.Y = true;
                Bitmap bitmap = ro0.a;
                try {
                    gs6 gs6 = this.y;
                    if (gs6 != null) {
                        gs6.a();
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    ld8.h();
                    int i = iArr[0];
                    ld8.c(bitmap.getWidth(), bitmap.getHeight());
                    ld8.d(3553, i, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    ld8.h();
                    this.y = new gs6(i, -1, je6.b, je6.c);
                    if (v0g.a >= 34 && bitmap.hasGainmap()) {
                        z1d z1d = this.x;
                        z1d.getClass();
                        Gainmap c = bitmap.getGainmap();
                        c.getClass();
                        ((gi4) z1d).l(oo0.d(c));
                    }
                    if (this.w) {
                        z1d z1d2 = this.x;
                        z1d2.getClass();
                        gi4 gi4 = (gi4) z1d2;
                        n79.n(gi4.a.b == 1);
                        gi4.t = true;
                        gi4.u = false;
                    }
                } catch (GlUtil$GlException e) {
                    throw VideoFrameProcessingException.a(e);
                }
            }
            this.z--;
            z1d z1d3 = this.x;
            z1d3.getClass();
            yr6 yr6 = this.v;
            gs6 gs62 = this.y;
            gs62.getClass();
            ((kj0) z1d3).a(yr6, gs62, next);
            int i2 = je6.b;
            LinkedHashMap linkedHashMap = p94.a;
            synchronized (p94.class) {
            }
            if (!ro0.c.hasNext()) {
                this.Y = false;
                ((ro0) this.o.remove()).a.recycle();
                if (this.o.isEmpty() && this.X) {
                    z1d z1d4 = this.x;
                    z1d4.getClass();
                    ((kj0) z1d4).c();
                    p94.a();
                    this.X = false;
                }
            }
        }
    }

    public final void r() {
        ((gy0) this.a).v(new qo0(this, 1));
    }

    public final void release() {
        ((gy0) this.a).v(new qo0(this, 2));
    }
}
