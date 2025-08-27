package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;

/* renamed from: jxd  reason: default package */
public final class jxd implements hxd, yh3 {
    public static final /* synthetic */ int j = 0;
    public final Lazy a;
    public final m95 b;
    public final Lazy c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final om0 e = om0.H();
    public final String[] f = {"no_net", "disconnected", "connected", "logged_in"};
    public final String[] g = {"disconnected", "connected", "logged_in"};
    public volatile int h = 0;
    public volatile int i = 0;

    public jxd(Lazy lazy, m95 m95, Lazy lazy2) {
        this.a = lazy;
        this.b = m95;
        this.c = lazy2;
        ((rh3) lazy.getValue()).c(new ixd(this));
        z68.c("jxd", "ctor, %s", toString());
    }

    public final void a() {
        if (!((rh3) this.a.getValue()).e()) {
            this.h = 0;
        } else {
            int i2 = this.i;
            if (i2 == 0) {
                this.h = 1;
            } else if (i2 == 1) {
                this.h = 2;
            } else if (i2 == 2) {
                this.h = 3;
            } else {
                throw new IllegalStateException("Unknown connection status=" + this.i);
            }
        }
        z68.c("jxd", "updateState, %s", toString());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gxd) it.next()).c(this.h);
        }
        this.e.d(Integer.valueOf(this.h));
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.g[this.i] + ") -> " + this.f[this.h];
    }
}
