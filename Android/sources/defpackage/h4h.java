package defpackage;

/* renamed from: h4h  reason: default package */
public final class h4h extends p0h {
    private static final h4h zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        h4h h4h = new h4h();
        zzb = h4h;
        p0h.i(h4h.class, h4h);
    }

    public static /* synthetic */ void n(h4h h4h, String str) {
        str.getClass();
        h4h.zzd |= 1;
        h4h.zze = str;
    }

    public static /* synthetic */ void o(h4h h4h, String str) {
        str.getClass();
        h4h.zzd |= 2;
        h4h.zzf = str;
    }

    public static g4h p() {
        return (g4h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new h4h();
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
