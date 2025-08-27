package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;

/* renamed from: g68  reason: default package */
public final class g68 implements c68 {
    public static final /* synthetic */ int X = 0;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context o;
    public final gm4 v;
    public final gm4 w;
    public final gm4 x;
    public final gm4 y;
    public final gm4 z;

    public g68(Context context, jtb jtb, Lazy lazy, Lazy lazy2) {
        this.o = context;
        Objects.requireNonNull(lazy);
        this.v = new gm4((Object) new wz0(1, lazy));
        this.w = new gm4((Object) new f68(this, lazy, context, jtb, 0));
        this.x = new gm4((Object) new f68(this, lazy, context, jtb, 1));
        this.y = new gm4((Object) new u00((Object) this, (Object) lazy, (Object) context, 13));
        Objects.requireNonNull(lazy2);
        this.z = new gm4((Object) new wz0(2, lazy2));
    }

    public final void L(s58 s58) {
        for (c68 L : this.a) {
            L.L(s58);
        }
        for (c68 L2 : this.b) {
            L2.L(s58);
        }
        for (c68 L3 : this.c) {
            L3.L(s58);
        }
    }

    public final void a(c68 c68) {
        if (!n54.e(this.o, n54.k)) {
            z68.c("g68", "start: no permissions", new Object[0]);
            c68.w();
            return;
        }
        b8d b8d = new b8d((Object) c68);
        swg swg = ((lt6) this.v.get()).a;
        swg.getClass();
        ur0 ur0 = new ur0();
        ur0.c = true;
        ur0.d = sq6.x;
        ur0.b = 2414;
        s7h c2 = swg.c(0, ur0.a());
        c2.i(new jt6(b8d));
        c2.c(xdf.a, new jt6(b8d));
    }

    public final void b(c68 c68) {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    e68 e68 = (e68) this.y.get();
                    e68.getClass();
                    y64.B(new d68(e68, 1));
                    z68.c("g68", "requestHighAccuracyUpdates", new Object[0]);
                }
                this.c.add(c68);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(c68 c68) {
        synchronized (this.b) {
            try {
                this.b.remove(c68);
                if (this.b.isEmpty()) {
                    if (this.x.a != null) {
                        e68 e68 = (e68) this.x.get();
                        e68.getClass();
                        y64.B(new d68(e68, 0));
                        z68.c("g68", "stopBalancedPowerUpdates", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(c68 c68) {
        synchronized (this.c) {
            try {
                this.c.remove(c68);
                if (this.c.isEmpty()) {
                    if (this.y.a != null) {
                        e68 e68 = (e68) this.y.get();
                        e68.getClass();
                        y64.B(new d68(e68, 0));
                        z68.c("g68", "stopHighAccuracyUpdates", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(c68 c68) {
        synchronized (this.a) {
            try {
                this.a.remove(c68);
                if (this.a.isEmpty()) {
                    if (this.w.a != null) {
                        e68 e68 = (e68) this.w.get();
                        e68.getClass();
                        y64.B(new d68(e68, 0));
                        z68.c("g68", "stopNoPowerUpdates", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w() {
        for (c68 w2 : this.a) {
            w2.w();
        }
        for (c68 w3 : this.b) {
            w3.w();
        }
        for (c68 w4 : this.c) {
            w4.w();
        }
    }
}
