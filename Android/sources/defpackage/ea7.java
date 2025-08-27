package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ea7  reason: default package */
public final class ea7 {
    public static ea7 p;
    public static ba7 q;
    public final dm4 a;
    public final da7 b;
    public final b8d c;
    public final sp4 d;
    public ub8 e;
    public zqd f;
    public ub8 g;
    public zqd h;
    public cg4 i;
    public ow9 j;
    public awb k;
    public ewb l;
    public ys m;
    public g5b n;
    public AnimatedFactoryV2Impl o;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, b8d] */
    public ea7(da7 da7) {
        tf6.P();
        da7.getClass();
        this.b = da7;
        f7a f7a = da7.v;
        f7a.getClass();
        this.a = new dm4((Executor) da7.h.b());
        bk3 bk3 = da7.x;
        ? obj = new Object();
        obj.a = new u6h(10, bk3);
        this.c = obj;
        tf6.P();
        this.d = da7.f;
        f7a.getClass();
    }

    public static ea7 g() {
        ea7 ea7 = p;
        cvg.p(ea7, "ImagePipelineFactory was not initialized!");
        return ea7;
    }

    public static synchronized void j(da7 da7) {
        synchronized (ea7.class) {
            if (p != null) {
                bg5.a.a(5);
            }
            p = new ea7(da7);
        }
    }

    public final xc4 a() {
        AnimatedFactoryV2Impl b2 = b();
        if (b2 == null) {
            return null;
        }
        if (b2.h == null) {
            C0003if ifVar = new C0003if(0);
            ysd ysd = b2.i;
            if (ysd == null) {
                ysd = new ei4(b2.b.a());
            }
            ysd ysd2 = ysd;
            C0003if ifVar2 = new C0003if(1);
            if (b2.f == null) {
                b2.f = new b8d((Object) b2);
            }
            b8d b8d = b2.f;
            if (dvf.b == null) {
                dvf.b = new dvf(new Handler(Looper.getMainLooper()));
            }
            b2.h = new xc4(b8d, dvf.b, ysd2, RealtimeSinceBootClock.get(), b2.a, b2.c, ifVar, ifVar2, new m74(3, Boolean.valueOf(b2.k)), new m74(3, Boolean.valueOf(b2.d)), new m74(3, Integer.valueOf(b2.j)), new m74(3, Integer.valueOf(b2.l)));
        }
        return b2.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            ynb h2 = h();
            da7 da7 = this.b;
            ma5 ma5 = da7.h;
            t14 c2 = c();
            da7.v.getClass();
            da7.v.getClass();
            da7.v.getClass();
            da7.v.getClass();
            da7.getClass();
            if (!j4b.y) {
                Class<AnimatedFactoryV2Impl> cls = AnimatedFactoryV2Impl.class;
                Class<ynb> cls2 = ynb.class;
                Class<ma5> cls3 = ma5.class;
                Class<t14> cls4 = t14.class;
                try {
                    Class cls5 = Boolean.TYPE;
                    Class cls6 = Integer.TYPE;
                    Constructor<AnimatedFactoryV2Impl> constructor = cls.getConstructor(new Class[]{cls2, cls3, cls4, cls5, cls5, cls6, cls6, ysd.class});
                    Boolean bool = Boolean.FALSE;
                    j4b.z = constructor.newInstance(new Object[]{h2, ma5, c2, bool, bool, 30, 1000, null});
                } catch (Throwable unused) {
                }
                if (j4b.z != null) {
                    j4b.y = true;
                }
            }
            this.o = j4b.z;
        }
        return this.o;
    }

    public final t14 c() {
        if (this.e == null) {
            da7 da7 = this.b;
            bk3 bk3 = da7.y;
            ad4 ad4 = da7.a;
            u9a u9a = da7.l;
            cd4 cd4 = da7.b;
            da7.v.getClass();
            da7.v.getClass();
            da7.getClass();
            bk3.getClass();
            ub8 ub8 = new ub8(new ece(9), ad4);
            u9a.getClass();
            this.e = ub8;
        }
        return this.e;
    }

    public final zqd d() {
        if (this.f == null) {
            t14 c2 = c();
            t9a t9a = this.b.i;
            t9a.getClass();
            this.f = new zqd(15, c2, new wie(24, (Object) t9a));
        }
        return this.f;
    }

    public final zqd e() {
        if (this.h == null) {
            da7 da7 = this.b;
            da7.getClass();
            if (this.g == null) {
                ub8 ub8 = new ub8(new t9a(11), da7.g);
                da7.l.getClass();
                this.g = ub8;
            }
            ub8 ub82 = this.g;
            t9a t9a = da7.i;
            t9a.getClass();
            this.h = new zqd(15, ub82, new grg(18, t9a));
        }
        return this.h;
    }

    public final ba7 f() {
        ba7 ba7;
        ba7 ba72;
        ContentResolver contentResolver;
        hf hfVar;
        jf jfVar;
        if (q == null) {
            da7 da7 = this.b;
            da7.v.getClass();
            ewb ewb = this.l;
            f7a f7a = da7.v;
            if (ewb == null) {
                ContentResolver contentResolver2 = da7.d.getApplicationContext().getContentResolver();
                if (this.k == null) {
                    js9 js9 = (js9) f7a.c;
                    oqb oqb = da7.n;
                    if (oqb.i == null) {
                        nqb nqb = oqb.a;
                        oqb.i = new qp6(nqb.d, nqb.g, nqb.h);
                    }
                    qp6 qp6 = oqb.i;
                    if (this.i == null) {
                        da7.getClass();
                        AnimatedFactoryV2Impl b2 = b();
                        if (b2 != null) {
                            jfVar = new jf(0, b2);
                            hfVar = new hf(b2);
                        } else {
                            jfVar = null;
                            hfVar = null;
                        }
                        da7.v.getClass();
                        ata ata = da7.u;
                        if (ata == null) {
                            this.i = new cg4(jfVar, hfVar, i(), (Map) null);
                        } else {
                            this.i = new cg4(jfVar, hfVar, i(), (HashMap) ata.b);
                            i97 i97 = (i97) i97.d.getValue();
                            i97.b = (ArrayList) ata.c;
                            i97.a();
                        }
                    }
                    cg4 cg4 = this.i;
                    p7d c2 = oqb.c(0);
                    oqb.d();
                    zqd d2 = d();
                    zqd e2 = e();
                    ynb h2 = h();
                    js9.getClass();
                    int i2 = f7a.a;
                    b8d b8d = this.c;
                    Context context = da7.d;
                    d6a d6a = da7.o;
                    nt4 nt4 = da7.e;
                    ba72 = ba7;
                    contentResolver = contentResolver2;
                    this.k = new awb(context, qp6, cg4, d6a, nt4, da7.s, da7.h, c2, d2, e2, this.d, da7.c, h2, i2, b8d);
                } else {
                    ba72 = ba7;
                    contentResolver = contentResolver2;
                }
                awb awb = this.k;
                f7a.getClass();
                if (this.j == null) {
                    da7.getClass();
                    f7a f7a2 = da7.v;
                    f7a2.getClass();
                    this.j = new ow9(f7a2.a);
                }
                ContentResolver contentResolver3 = contentResolver;
                this.l = new ewb(contentResolver3, awb, da7.m, da7.s, this.a, da7.e, da7.w, this.j, da7.r);
            } else {
                ba72 = ba7;
            }
            da7.getClass();
            new ba7(this.l, da7.p, da7.q, da7.j, d(), e(), this.d, da7.c, (m74) f7a.d, this.b);
            q = ba72;
        }
        return q;
    }

    public final ynb h() {
        if (this.m == null) {
            oqb oqb = this.b.n;
            i();
            this.m = new ys(oqb.a(), this.c);
        }
        return this.m;
    }

    public final znb i() {
        if (this.n == null) {
            da7 da7 = this.b;
            oqb oqb = da7.n;
            da7.v.getClass();
            da7.v.getClass();
            zq0 zq0 = (zq0) da7.v.b;
            lo0 a2 = oqb.a();
            int i2 = oqb.a.c.d;
            xqb xqb = new xqb(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                qv0 qv0 = r94.a;
                xqb.b(ByteBuffer.allocate(16384));
            }
            this.n = new g5b(a2, xqb, zq0);
        }
        return this.n;
    }
}
