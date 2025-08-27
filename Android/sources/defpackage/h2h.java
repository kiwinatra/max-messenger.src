package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: h2h  reason: default package */
public final class h2h {
    public static final h2h c = new h2h();
    public final er7 a = new er7(1);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final l2h a(Class cls) {
        b2h b2h;
        c2h c2h;
        Class cls2;
        Charset charset = y0h.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            l2h l2h = (l2h) concurrentHashMap.get(cls);
            if (l2h == null) {
                er7 er7 = this.a;
                er7.getClass();
                Class cls3 = o2h.a;
                Class<p0h> cls4 = p0h.class;
                if (cls4.isAssignableFrom(cls) || (cls2 = o2h.a) == null || cls2.isAssignableFrom(cls)) {
                    j2h a2 = ((s1h) er7.b).a(cls);
                    if ((a2.d & 2) == 2) {
                        boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                        azg azg = a2.a;
                        if (isAssignableFrom) {
                            c2h = new c2h(o2h.c, zzg.a, azg);
                        } else {
                            c3h c3h = o2h.b;
                            yzg yzg = zzg.b;
                            if (yzg != null) {
                                c2h = new c2h(c3h, yzg, azg);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        l2h = c2h;
                    } else {
                        if (cls4.isAssignableFrom(cls)) {
                            if (a2.b() - 1 != 1) {
                                int i = f2h.a;
                                f1h f1h = g1h.b;
                                c3h c3h2 = o2h.c;
                                yzg yzg2 = zzg.a;
                                int i2 = w1h.a;
                                b2h = b2h.u(a2, f1h, c3h2, yzg2);
                            } else {
                                int i3 = f2h.a;
                                f1h f1h2 = g1h.b;
                                c3h c3h3 = o2h.c;
                                int i4 = w1h.a;
                                b2h = b2h.u(a2, f1h2, c3h3, (yzg) null);
                            }
                        } else if (a2.b() - 1 != 1) {
                            int i5 = f2h.a;
                            d1h d1h = g1h.a;
                            c3h c3h4 = o2h.b;
                            yzg yzg3 = zzg.b;
                            if (yzg3 != null) {
                                int i6 = w1h.a;
                                b2h = b2h.u(a2, d1h, c3h4, yzg3);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            int i7 = f2h.a;
                            d1h d1h2 = g1h.a;
                            c3h c3h5 = o2h.b;
                            int i8 = w1h.a;
                            b2h = b2h.u(a2, d1h2, c3h5, (yzg) null);
                        }
                        l2h = b2h;
                    }
                    l2h l2h2 = (l2h) concurrentHashMap.putIfAbsent(cls, l2h);
                    return l2h2 == null ? l2h : l2h2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
