package defpackage;

/* renamed from: y3h  reason: default package */
public final class y3h extends p0h {
    private static final y3h zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";

    static {
        y3h y3h = new y3h();
        zzb = y3h;
        p0h.i(y3h.class, y3h);
    }

    public static /* synthetic */ void n(y3h y3h, int i) {
        y3h.zzd |= 1;
        y3h.zze = i;
    }

    public static /* synthetic */ void o(y3h y3h, String str) {
        str.getClass();
        y3h.zzd |= 2;
        y3h.zzf = str;
    }

    public static /* synthetic */ void p(y3h y3h, String str) {
        y3h.zzd |= 8;
        y3h.zzh = str;
    }

    public static /* synthetic */ void q(y3h y3h, int i) {
        y3h.zzg = i - 1;
        y3h.zzd |= 4;
    }

    public static x3h r() {
        return (x3h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", u3h.c, "zzh"});
        } else if (i2 == 3) {
            return new y3h();
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
