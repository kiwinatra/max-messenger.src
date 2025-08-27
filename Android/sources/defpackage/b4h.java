package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: b4h  reason: default package */
public final class b4h extends p0h {
    private static final v0h zzb = new o9a(22);
    private static final b4h zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private u0h zzh = r0h.o;
    private x0h zzi = i2h.o;
    private y3h zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        b4h b4h = new b4h();
        zzd = b4h;
        p0h.i(b4h.class, b4h);
    }

    public static b4h n(byte[] bArr, xzg xzg) {
        return (b4h) p0h.f(zzd, bArr, xzg);
    }

    public static void o(b4h b4h, p4h p4h) {
        x0h x0h = b4h.zzi;
        if (!((bzg) x0h).a) {
            int size = x0h.size();
            b4h.zzi = x0h.c(size == 0 ? 10 : size + size);
        }
        b4h.zzi.add(p4h);
    }

    public static /* synthetic */ void p(b4h b4h, y3h y3h) {
        b4h.zzj = y3h;
        b4h.zze |= 4;
    }

    public static /* synthetic */ void q(b4h b4h, boolean z) {
        b4h.zze |= 8;
        b4h.zzk = z;
    }

    public static /* synthetic */ void r(b4h b4h) {
        b4h.zze |= 16;
        b4h.zzl = false;
    }

    public static void s(b4h b4h, Iterable iterable) {
        u0h u0h = b4h.zzh;
        if (!((bzg) u0h).a) {
            int size = u0h.size();
            int i = size == 0 ? 10 : size + size;
            r0h r0h = (r0h) u0h;
            if (i >= r0h.c) {
                b4h.zzh = new r0h(Arrays.copyOf(r0h.b, i), r0h.c, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((r0h) b4h.zzh).e(((z3h) it.next()).a);
        }
    }

    public static /* synthetic */ void t(b4h b4h, int i) {
        b4h.zzg = i - 1;
        b4h.zze |= 2;
    }

    public static a4h u() {
        return (a4h) zzd.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", u3h.e, "zzh", u3h.d, "zzi", p4h.class, "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new b4h();
        } else {
            if (i2 == 4) {
                return new d0h(zzd);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
