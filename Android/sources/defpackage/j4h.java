package defpackage;

/* renamed from: j4h  reason: default package */
public final class j4h extends p0h {
    private static final j4h zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    /* JADX WARNING: type inference failed for: r0v0, types: [p0h, j4h] */
    static {
        ? p0h = new p0h();
        zzb = p0h;
        p0h.i(j4h.class, p0h);
    }

    public static /* synthetic */ void n(j4h j4h) {
        j4h.zzd |= 2;
        j4h.zzf = false;
    }

    public static i4h o() {
        return (i4h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
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
