package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* renamed from: t33  reason: default package */
public final class t33 extends id4 {
    public m7f o;
    public boolean v;

    public final void close() {
        synchronized (this) {
            try {
                m7f m7f = this.o;
                if (m7f != null) {
                    this.o = null;
                    synchronized (m7f) {
                        y33.U((y33) m7f.c);
                        m7f.c = null;
                        y33.V((ArrayList) m7f.o);
                        m7f.o = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized int getHeight() {
        m7f m7f;
        m7f = this.o;
        return m7f == null ? 0 : ((GifImage) m7f.a).h();
    }

    public final synchronized int getSizeInBytes() {
        m7f m7f;
        m7f = this.o;
        return m7f == null ? 0 : ((GifImage) m7f.a).j();
    }

    public final synchronized int getWidth() {
        m7f m7f;
        m7f = this.o;
        return m7f == null ? 0 : ((GifImage) m7f.a).k();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public final boolean isStateful() {
        return this.v;
    }
}
