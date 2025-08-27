package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: d87  reason: default package */
public final class d87 implements yzf {
    public final /* synthetic */ int a;
    public final pz9 b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d87(int i) {
        this(pz9.c(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(pz9.c(), 1);
                return;
            case 2:
                this(pz9.c(), 2);
                return;
            default:
                return;
        }
    }

    public y87 a() {
        Object obj;
        Object obj2;
        Object obj3;
        la0 la0 = z87.v;
        pz9 pz9 = this.b;
        pz9.getClass();
        Object obj4 = null;
        try {
            obj = pz9.n(la0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            pz9.f(m97.D, num);
        } else {
            w87 w87 = y87.z;
            try {
                obj3 = pz9.n(z87.w);
            } catch (IllegalArgumentException unused2) {
                obj3 = null;
            }
            if (Objects.equals(obj3, 1)) {
                pz9.f(m97.D, 4101);
                pz9.f(m97.E, vy4.c);
            } else {
                pz9.f(m97.D, 256);
            }
        }
        z87 z87 = new z87(c5b.a(pz9));
        x97.X(z87);
        y87 y87 = new y87(z87);
        try {
            obj2 = pz9.n(x97.J);
        } catch (IllegalArgumentException unused3) {
            obj2 = null;
        }
        Size size = (Size) obj2;
        if (size != null) {
            y87.s = new Rational(size.getWidth(), size.getHeight());
        }
        la0 la02 = fl7.Q;
        Object F = ryg.F();
        try {
            F = pz9.n(la02);
        } catch (IllegalArgumentException unused4) {
        }
        bs0.q((Executor) F, "The IO executor can't be null");
        la0 la03 = z87.c;
        if (pz9.a.containsKey(la03)) {
            Integer num2 = (Integer) pz9.n(la03);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            } else if (num2.intValue() == 3) {
                try {
                    obj4 = pz9.n(z87.Y);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return y87;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [vzf, bub] */
    public bub b() {
        cub cub = new cub(c5b.a(this.b));
        x97.X(cub);
        ? vzf = new vzf(cub);
        vzf.p = bub.w;
        return vzf;
    }

    public final Object c(w3d w3d) {
        switch (this.a) {
            case 0:
                this.b.f(x97.N, w3d);
                return this;
            case 1:
                this.b.f(x97.N, w3d);
                return this;
            case 2:
                this.b.f(x97.N, w3d);
                return this;
            default:
                this.b.f(x97.N, w3d);
                return this;
        }
    }

    public final Object d(Size size) {
        switch (this.a) {
            case 0:
                this.b.f(x97.J, size);
                return this;
            case 1:
                this.b.f(x97.J, size);
                return this;
            case 2:
                this.b.f(x97.J, size);
                return this;
            default:
                throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }
    }

    public final Object e(int i) {
        switch (this.a) {
            case 0:
                this.b.f(x97.G, Integer.valueOf(i));
                return this;
            case 1:
                this.b.f(x97.G, Integer.valueOf(i));
                return this;
            case 2:
                la0 la0 = x97.G;
                Integer valueOf = Integer.valueOf(i);
                pz9 pz9 = this.b;
                pz9.f(la0, valueOf);
                pz9.f(x97.H, Integer.valueOf(i));
                return this;
            default:
                this.b.f(x97.G, Integer.valueOf(i));
                return this;
        }
    }

    public final yy9 q() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public final zzf s() {
        switch (this.a) {
            case 0:
                return new j87(c5b.a(this.b));
            case 1:
                return new z87(c5b.a(this.b));
            case 2:
                return new cub(c5b.a(this.b));
            default:
                return new s3g(c5b.a(this.b));
        }
    }

    public d87(pz9 pz9, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = pz9;
                Object obj5 = null;
                try {
                    obj = pz9.n(cdf.h0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<y87> cls2 = y87.class;
                if (cls == null || cls.equals(cls2)) {
                    this.b.f(zzf.r0, b0g.a);
                    la0 la0 = cdf.h0;
                    pz9 pz92 = this.b;
                    pz92.f(la0, cls2);
                    try {
                        obj5 = pz92.n(cdf.g0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj5 == null) {
                        this.b.f(cdf.g0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 2:
                this.b = pz9;
                Object obj6 = null;
                try {
                    obj2 = pz9.n(cdf.h0);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls3 = (Class) obj2;
                Class<bub> cls4 = bub.class;
                if (cls3 == null || cls3.equals(cls4)) {
                    this.b.f(zzf.r0, b0g.b);
                    la0 la02 = cdf.h0;
                    pz9 pz93 = this.b;
                    pz93.f(la02, cls4);
                    try {
                        obj6 = pz93.n(cdf.g0);
                    } catch (IllegalArgumentException unused4) {
                    }
                    if (obj6 == null) {
                        this.b.f(cdf.g0, cls4.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                    int i2 = -1;
                    try {
                        i2 = pz9.n(x97.I);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (((Integer) i2).intValue() == -1) {
                        pz9.f(x97.I, 2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
            case 3:
                this.b = pz9;
                if (pz9.a.containsKey(s3g.b)) {
                    Object obj7 = null;
                    try {
                        obj3 = pz9.n(cdf.h0);
                    } catch (IllegalArgumentException unused6) {
                        obj3 = null;
                    }
                    Class cls5 = (Class) obj3;
                    Class<r3g> cls6 = r3g.class;
                    if (cls5 == null || cls5.equals(cls6)) {
                        this.b.f(zzf.r0, b0g.o);
                        la0 la03 = cdf.h0;
                        pz9 pz94 = this.b;
                        pz94.f(la03, cls6);
                        try {
                            obj7 = pz94.n(cdf.g0);
                        } catch (IllegalArgumentException unused7) {
                        }
                        if (obj7 == null) {
                            pz94.f(cdf.g0, cls6.getCanonicalName() + "-" + UUID.randomUUID());
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls5);
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = pz9;
                Object obj8 = null;
                try {
                    obj4 = pz9.n(cdf.h0);
                } catch (IllegalArgumentException unused8) {
                    obj4 = null;
                }
                Class cls7 = (Class) obj4;
                Class<g87> cls8 = g87.class;
                if (cls7 == null || cls7.equals(cls8)) {
                    this.b.f(zzf.r0, b0g.c);
                    la0 la04 = cdf.h0;
                    pz9 pz95 = this.b;
                    pz95.f(la04, cls8);
                    try {
                        obj8 = pz95.n(cdf.g0);
                    } catch (IllegalArgumentException unused9) {
                    }
                    if (obj8 == null) {
                        pz95.f(cdf.g0, cls8.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d87(defpackage.h7g r3) {
        /*
            r2 = this;
            r0 = 3
            r2.a = r0
            pz9 r0 = defpackage.pz9.c()
            la0 r1 = defpackage.s3g.b
            r0.f(r1, r3)
            r3 = 3
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d87.<init>(h7g):void");
    }
}
