package defpackage;

/* renamed from: c2h  reason: default package */
public final class c2h implements l2h {
    public final azg a;
    public final c3h b;
    public final yzg c;

    public c2h(c3h c3h, yzg yzg, azg azg) {
        this.b = c3h;
        this.c = yzg;
        this.a = azg;
    }

    public final p0h a() {
        azg azg = this.a;
        return azg instanceof p0h ? (p0h) ((p0h) azg).m(4) : ((d0h) ((p0h) azg).m(5)).e();
    }

    public final void b(Object obj) {
        this.b.getClass();
        c3h.c(obj);
        this.c.getClass();
        rae.w(obj);
        throw null;
    }

    public final void c(Object obj, p1e p1e) {
        this.c.getClass();
        rae.w(obj);
        throw null;
    }

    public final void d(Object obj, byte[] bArr, int i, int i2, gv1 gv1) {
        p0h p0h = (p0h) obj;
        if (p0h.zzc == b3h.f) {
            p0h.zzc = b3h.b();
        }
        rae.w(obj);
        throw null;
    }

    public final boolean e(Object obj) {
        this.c.getClass();
        rae.w(obj);
        throw null;
    }

    public final int f(Object obj) {
        this.b.getClass();
        return ((p0h) obj).zzc.hashCode();
    }

    public final int g(Object obj) {
        this.b.getClass();
        b3h b3h = ((p0h) obj).zzc;
        int i = b3h.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < b3h.a; i3++) {
            int Y = wzg.Y(8);
            int Y2 = wzg.Y(b3h.b[i3] >>> 3) + wzg.Y(16);
            int Y3 = wzg.Y(24);
            int e = ((fzg) b3h.c[i3]).e();
            i2 += Y + Y + Y2 + wzf.h(e, e, Y3);
        }
        b3h.d = i2;
        return i2;
    }

    public final void h(Object obj, Object obj2) {
        o2h.t(this.b, obj, obj2);
    }

    public final boolean i(Object obj, Object obj2) {
        this.b.getClass();
        return ((p0h) obj).zzc.equals(((p0h) obj2).zzc);
    }
}
