package defpackage;

import kotlin.Unit;

/* renamed from: ugd  reason: default package */
public final class ugd implements x87 {
    public final x87 a;
    public final Object b = new Object();
    public boolean c;
    public ps1 d;

    public ugd(x87 x87) {
        this.a = x87;
    }

    public final void a(long j, ps1 ps1) {
        Unit unit;
        synchronized (this.b) {
            this.c = true;
            this.d = ps1;
            Unit unit2 = Unit.INSTANCE;
        }
        x87 x87 = this.a;
        if (x87 != null) {
            x87.a(j, new ps1(1, this));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            c();
        }
    }

    public final void b() {
        x87 x87;
        synchronized (this.b) {
            try {
                if (this.c && (x87 = this.a) != null) {
                    x87.clear();
                    Unit unit = Unit.INSTANCE;
                }
                this.c = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                ps1 ps1 = this.d;
                if (ps1 != null) {
                    ps1.a();
                }
                this.d = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        b();
    }
}
