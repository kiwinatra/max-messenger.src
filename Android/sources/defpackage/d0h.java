package defpackage;

import com.google.android.gms.internal.play_billing.zzfl;

/* renamed from: d0h  reason: default package */
public abstract class d0h implements Cloneable {
    public final p0h a;
    public p0h b;

    public d0h(p0h p0h) {
        this.a = p0h;
        if (!p0h.l()) {
            this.b = (p0h) p0h.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final p0h a() {
        p0h e = e();
        if (e.k()) {
            return e;
        }
        throw new zzfl();
    }

    public final Object clone() {
        d0h d0h = (d0h) this.a.m(5);
        d0h.b = e();
        return d0h;
    }

    public final p0h e() {
        if (!this.b.l()) {
            return this.b;
        }
        p0h p0h = this.b;
        p0h.getClass();
        h2h.c.a(p0h.getClass()).b(p0h);
        p0h.h();
        return this.b;
    }

    public final void h() {
        if (!this.b.l()) {
            p0h p0h = (p0h) this.a.m(4);
            h2h.c.a(p0h.getClass()).h(p0h, this.b);
            this.b = p0h;
        }
    }
}
