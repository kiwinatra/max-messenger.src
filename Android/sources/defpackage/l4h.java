package defpackage;

/* renamed from: l4h  reason: default package */
public final class l4h extends p0h {
    private static final l4h zzb;
    private int zzd;
    private int zze;

    /* JADX WARNING: type inference failed for: r0v0, types: [l4h, p0h] */
    static {
        ? p0h = new p0h();
        zzb = p0h;
        p0h.i(l4h.class, p0h);
    }

    public static /* synthetic */ void n(l4h l4h, int i) {
        l4h.zze = i - 1;
        l4h.zzd |= 1;
    }

    public static k4h o() {
        return (k4h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", u3h.f});
        } else if (i2 == 3) {
            return new p0h();
        } else {
            if (i2 == 4) {
                return new d0h(zzb);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
