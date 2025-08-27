package defpackage;

/* renamed from: w3h  reason: default package */
public final class w3h extends p0h {
    private static final w3h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        w3h w3h = new w3h();
        zzb = w3h;
        p0h.i(w3h.class, w3h);
    }

    public static /* synthetic */ void n(w3h w3h, l4h l4h) {
        w3h.zzf = l4h;
        w3h.zze = 2;
    }

    public static /* synthetic */ void o(w3h w3h, int i) {
        w3h.zzg = i - 1;
        w3h.zzd |= 1;
    }

    public static v3h p() {
        return (v3h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", u3h.b, l4h.class});
        } else if (i2 == 3) {
            return new w3h();
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
