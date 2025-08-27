package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* renamed from: oqb  reason: default package */
public final class oqb {
    public final nqb a;
    public d69 b;
    public lo0 c;
    public d69 d;
    public zq5 e;
    public d69 f;
    public p7d g;
    public ni0 h;
    public qp6 i;

    public oqb(nqb nqb) {
        this.a = nqb;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, lo0] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lo0 a() {
        /*
            r6 = this;
            lo0 r0 = r6.c
            if (r0 != 0) goto L_0x0085
            nqb r0 = r6.a
            java.lang.String r1 = r0.i
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L_0x003b;
                case -1106578487: goto L_0x0031;
                case -404562712: goto L_0x0027;
                case -402149703: goto L_0x001d;
                case 95945896: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0045
        L_0x0013:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = 0
            goto L_0x0046
        L_0x001d:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r5
            goto L_0x0046
        L_0x0027:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r4
            goto L_0x0046
        L_0x0031:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = 4
            goto L_0x0046
        L_0x003b:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r3
            goto L_0x0046
        L_0x0045:
            r1 = -1
        L_0x0046:
            if (r1 == 0) goto L_0x007e
            if (r1 == r5) goto L_0x0076
            if (r1 == r4) goto L_0x0068
            v9a r2 = r0.b
            u9a r4 = r0.d
            if (r1 == r3) goto L_0x005c
            ht0 r1 = new ht0
            pqb r0 = r0.a
            r1.<init>(r4, r0, r2)
            r6.c = r1
            goto L_0x0085
        L_0x005c:
            ht0 r0 = new ht0
            pqb r1 = defpackage.bd4.a()
            r0.<init>(r4, r1, r2)
            r6.c = r0
            goto L_0x0085
        L_0x0068:
            sb8 r1 = new sb8
            v9a r2 = defpackage.v9a.a()
            int r0 = r0.j
            r1.<init>(r0, r2)
            r6.c = r1
            goto L_0x0085
        L_0x0076:
            yx4 r0 = new yx4
            r0.<init>()
            r6.c = r0
            goto L_0x0085
        L_0x007e:
            sx4 r0 = new sx4
            r0.<init>()
            r6.c = r0
        L_0x0085:
            lo0 r6 = r6.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqb.a():lo0");
    }

    public final zq5 b() {
        if (this.e == null) {
            nqb nqb = this.a;
            this.e = new zq5(nqb.d, nqb.c);
        }
        return this.e;
    }

    public final p7d c(int i2) {
        d69 d69;
        if (this.g == null) {
            nqb nqb = this.a;
            Class<qqb> cls = qqb.class;
            Class<pqb> cls2 = pqb.class;
            Class<g69> cls3 = g69.class;
            if (i2 == 0) {
                if (this.f == null) {
                    try {
                        this.f = NativeMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{nqb.d, nqb.e, nqb.f});
                    } catch (ClassNotFoundException e2) {
                        bg5.d("PoolFactory", "", e2);
                        this.f = null;
                    } catch (IllegalAccessException e3) {
                        bg5.d("PoolFactory", "", e3);
                        this.f = null;
                    } catch (InstantiationException e4) {
                        bg5.d("PoolFactory", "", e4);
                        this.f = null;
                    } catch (NoSuchMethodException e5) {
                        bg5.d("PoolFactory", "", e5);
                        this.f = null;
                    } catch (InvocationTargetException e6) {
                        bg5.d("PoolFactory", "", e6);
                        this.f = null;
                    }
                }
                d69 = this.f;
            } else if (i2 == 1) {
                if (this.d == null) {
                    try {
                        this.d = BufferMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{nqb.d, nqb.e, nqb.f});
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                d69 = this.d;
            } else if (i2 == 2) {
                if (this.b == null) {
                    try {
                        this.b = AshmemMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{nqb.d, nqb.e, nqb.f});
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                d69 = this.b;
            } else {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            cvg.p(d69, "failed to get pool for chunk type: " + i2);
            this.g = new p7d(17, (Object) d69, (Object) d());
        }
        return this.g;
    }

    public final ni0 d() {
        if (this.h == null) {
            if (this.i == null) {
                nqb nqb = this.a;
                this.i = new qp6(nqb.d, nqb.g, nqb.h);
            }
            this.h = new ni0(this.i);
        }
        return this.h;
    }
}
