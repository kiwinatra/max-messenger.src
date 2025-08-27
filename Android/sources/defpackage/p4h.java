package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p4h  reason: default package */
public final class p4h extends p0h {
    private static final p4h zzb;
    private int zzd;
    private x0h zze = i2h.o;
    private int zzf;
    private String zzg = "";

    static {
        p4h p4h = new p4h();
        zzb = p4h;
        p0h.i(p4h.class, p4h);
    }

    public static void n(p4h p4h, List list) {
        x0h x0h = p4h.zze;
        if (!((bzg) x0h).a) {
            int size = x0h.size();
            p4h.zze = x0h.c(size == 0 ? 10 : size + size);
        }
        x0h x0h2 = p4h.zze;
        Charset charset = y0h.a;
        list.getClass();
        if (list instanceof c1h) {
            List i = ((c1h) list).i();
            c1h c1h = (c1h) x0h2;
            int size2 = x0h2.size();
            for (Object next : i) {
                if (next == null) {
                    String j = a81.j(c1h.size() - size2, "Element at index ", " is null.");
                    int size3 = c1h.size();
                    while (true) {
                        size3--;
                        if (size3 >= size2) {
                            c1h.remove(size3);
                        } else {
                            throw new NullPointerException(j);
                        }
                    }
                } else if (next instanceof fzg) {
                    c1h.j((fzg) next);
                } else {
                    c1h.add((String) next);
                }
            }
        } else if (!(list instanceof g2h)) {
            if (x0h2 instanceof ArrayList) {
                ((ArrayList) x0h2).ensureCapacity(list.size() + x0h2.size());
            }
            int size4 = x0h2.size();
            for (Object next2 : list) {
                if (next2 == null) {
                    String j2 = a81.j(x0h2.size() - size4, "Element at index ", " is null.");
                    int size5 = x0h2.size();
                    while (true) {
                        size5--;
                        if (size5 >= size4) {
                            x0h2.remove(size5);
                        } else {
                            throw new NullPointerException(j2);
                        }
                    }
                } else {
                    x0h2.add(next2);
                }
            }
        } else {
            x0h2.addAll(list);
        }
    }

    public static /* synthetic */ void o(p4h p4h, int i) {
        p4h.zzd |= 1;
        p4h.zzf = i;
    }

    public static /* synthetic */ void p(p4h p4h, String str) {
        str.getClass();
        p4h.zzd |= 2;
        p4h.zzg = str;
    }

    public static o4h q() {
        return (o4h) zzb.d();
    }

    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new j2h(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new p4h();
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
