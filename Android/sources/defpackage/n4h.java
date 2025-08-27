package defpackage;

/* renamed from: n4h  reason: default package */
public final class n4h extends p0h {
    private static final n4h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private h4h zzg;
    private j4h zzh;

    static {
        n4h n4h = new n4h();
        zzb = n4h;
        p0h.i(n4h.class, n4h);
    }

    public static /* synthetic */ void n(n4h n4h, r4h r4h) {
        n4h.zzf = r4h;
        n4h.zze = 4;
    }

    public static /* synthetic */ void o(n4h n4h, b4h b4h) {
        n4h.zzf = b4h;
        n4h.zze = 5;
    }

    public static /* synthetic */ void p(n4h n4h, j4h j4h) {
        n4h.zzh = j4h;
        n4h.zzd |= 2;
    }

    public static /* synthetic */ void q(n4h n4h, h4h h4h) {
        n4h.zzg = h4h;
        n4h.zzd |= 1;
    }

    public static /* synthetic */ void r(n4h n4h, t3h t3h) {
        n4h.zzf = t3h;
        n4h.zze = 2;
    }

    public static /* synthetic */ void s(n4h n4h, w3h w3h) {
        n4h.zzf = w3h;
        n4h.zze = 3;
    }

    public static m4h t() {
        return (m4h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", t3h.class, w3h.class, r4h.class, b4h.class, "zzh"});
        } else if (i2 == 3) {
            return new n4h();
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
