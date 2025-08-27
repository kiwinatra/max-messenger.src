package defpackage;

import android.opengl.EGLSurface;

/* renamed from: pb0  reason: default package */
public final class pb0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public pb0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0 = (pb0) obj;
        return this.a.equals(pb0.a) && this.b == pb0.b && this.c == pb0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wj6.l(sb, this.c, "}");
    }
}
