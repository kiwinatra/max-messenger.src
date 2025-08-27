package defpackage;

/* renamed from: t3h  reason: default package */
public final class t3h extends p0h {
    private static final t3h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private y3h zzh;

    static {
        t3h t3h = new t3h();
        zzb = t3h;
        p0h.i(t3h.class, t3h);
    }

    public static t3h n(byte[] bArr, xzg xzg) {
        return (t3h) p0h.f(zzb, bArr, xzg);
    }

    public static /* synthetic */ void o(t3h t3h, y3h y3h) {
        t3h.zzh = y3h;
        t3h.zzd |= 2;
    }

    public static /* synthetic */ void p(t3h t3h, l4h l4h) {
        t3h.zzf = l4h;
        t3h.zze = 4;
    }

    public static /* synthetic */ void q(t3h t3h, int i) {
        t3h.zzg = i - 1;
        t3h.zzd |= 1;
    }

    public static s3h r() {
        return (s3h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", u3h.b, "zzh", l4h.class});
        } else if (i2 == 3) {
            return new t3h();
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
