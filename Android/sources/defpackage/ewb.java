package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ewb  reason: default package */
public final class ewb {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final ContentResolver a;
    public final awb b;
    public final kne c;
    public final boolean d;
    public final dm4 e;
    public final nt4 f;
    public final boolean g;
    public final ta7 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public ewb(ContentResolver contentResolver, awb awb, kne kne, boolean z2, dm4 dm4, nt4 nt4, boolean z3, ta7 ta7, Set set) {
        this.a = contentResolver;
        this.b = awb;
        this.c = kne;
        this.d = z2;
        this.e = dm4;
        this.f = nt4;
        this.g = z3;
        this.h = ta7;
        this.i = set;
        new LinkedHashMap();
        this.l = LazyKt.lazy(new dwb(this, 0));
        this.m = LazyKt.lazy(new dwb(this, 17));
        this.n = LazyKt.lazy(new dwb(this, 1));
        this.o = LazyKt.lazy(new dwb(this, 2));
        this.p = LazyKt.lazy(new dwb(this, 3));
        this.q = LazyKt.lazy(new dwb(this, 4));
        this.r = LazyKt.lazy(new dwb(this, 5));
        this.s = LazyKt.lazy(new dwb(this, 6));
        this.t = LazyKt.lazy(new dwb(this, 7));
        this.u = LazyKt.lazy(new dwb(this, 8));
        this.v = LazyKt.lazy(new dwb(this, 9));
        this.w = LazyKt.lazy(new dwb(this, 10));
        this.x = LazyKt.lazy(new dwb(this, 11));
        this.y = LazyKt.lazy(new dwb(this, 12));
        this.z = LazyKt.lazy(new dwb(this, 13));
        this.A = LazyKt.lazy(new dwb(this, 14));
        this.B = LazyKt.lazy(new dwb(this, 15));
        this.C = LazyKt.lazy(new dwb(this, 16));
    }

    public final xvb a(qa7 qa7) {
        tf6.P();
        Uri uri = qa7.b;
        if (uri != null) {
            int i2 = qa7.c;
            if (i2 == 0) {
                return (xvb) this.o.getValue();
            }
            Lazy lazy = this.w;
            boolean z2 = qa7.g;
            switch (i2) {
                case 2:
                    return z2 ? f() : (xvb) lazy.getValue();
                case 3:
                    return z2 ? f() : (xvb) this.v.getValue();
                case 4:
                    if (z2) {
                        return f();
                    }
                    String type = this.a.getType(uri);
                    Map map = n29.a;
                    return type != null ? StringsKt__StringsJVMKt.startsWith$default(type, "video/", false, 2, (Object) null) : false ? (xvb) lazy.getValue() : (xvb) this.x.getValue();
                case 5:
                    return (xvb) this.B.getValue();
                case 6:
                    return (xvb) this.A.getValue();
                case 7:
                    return (xvb) this.C.getValue();
                case 8:
                    return (xvb) this.z.getValue();
                default:
                    Set set = this.i;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            rae.w(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException(a81.m("Unsupported uri scheme! Uri is: ", sx6.c(uri)));
            }
        } else {
            throw new IllegalStateException("Uri is null.".toString());
        }
    }

    public final xvb b(qa7 qa7) {
        xvb xvb;
        xvb a2 = a(qa7);
        synchronized (this) {
            xvb = (xvb) this.k.get(a2);
            if (xvb == null) {
                this.b.getClass();
                xvb = new oa(a2, 2);
                this.k.put(a2, xvb);
            }
        }
        return xvb;
    }

    public final xvb c(qa7 qa7) {
        tf6.P();
        xvb a2 = a(qa7);
        return qa7.q != null ? g(a2) : a2;
    }

    public final xvb d(qa7 qa7) {
        sx6.d(qa7);
        int i2 = qa7.c;
        if (i2 == 0) {
            return (xvb) this.q.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (xvb) this.s.getValue();
        }
        throw new IllegalArgumentException(a81.m("Unsupported uri scheme for encoded image fetch! Uri is: ", sx6.c(qa7.b)));
    }

    public final xvb e(qa7 qa7) {
        tf6.P();
        sx6.d(qa7);
        int i2 = qa7.c;
        if (i2 == 0) {
            return (xvb) this.l.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (xvb) this.m.getValue();
        }
        if (i2 == 4) {
            return (xvb) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                rae.w(it.next());
                throw null;
            }
        }
        throw new IllegalArgumentException(a81.m("Unsupported uri scheme for encoded image fetch! Uri is: ", sx6.c(qa7.b)));
    }

    public final xvb f() {
        return (xvb) this.y.getValue();
    }

    public final synchronized xvb g(xvb xvb) {
        xvb xvb2;
        xvb2 = (xvb) this.j.get(xvb);
        if (xvb2 == null) {
            awb awb = this.b;
            u6a u6a = new u6a(xvb, awb.p, (Executor) awb.j.c());
            awb awb2 = this.b;
            ko0 ko0 = new ko0((zqd) awb2.n, awb2.o, u6a, 2);
            this.j.put(xvb, ko0);
            xvb2 = ko0;
        }
        return xvb2;
    }

    public final xvb h(xvb xvb) {
        awb awb = this.b;
        z59 z59 = awb.n;
        cd4 cd4 = awb.o;
        return new ko0(awb.n, cd4, new hif(new jo0(cd4, new ko0(z59, cd4, xvb, 0)), this.e, 0), 0);
    }

    public final xvb i(xvb xvb) {
        boolean X = tf6.X();
        awb awb = this.b;
        if (!X) {
            return h(awb.a(xvb));
        }
        tf6.e("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return h(awb.a(xvb));
        } finally {
            tf6.C();
        }
    }

    public final xvb j(s38 s38, bjf[] bjfArr) {
        oa oaVar = new oa(l(s38), 0);
        awb awb = this.b;
        ta7 ta7 = this.h;
        return i(new hif(awb.b(new oa(bjfArr), true, ta7), new wif(awb.j.b(), awb.b(oaVar, true, ta7)), 1));
    }

    public final synchronized u3d k(kne kne) {
        awb awb;
        try {
            tf6.P();
            awb = this.b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b.b(new oa(l(new u6a(awb.k, awb.d, kne)), 0), this.d && this.f != nt4.c, this.h);
    }

    public final jo0 l(xvb xvb) {
        boolean z2 = this.g;
        awb awb = this.b;
        if (z2) {
            tf6.P();
            r2f r2f = awb.l;
            cd4 cd4 = awb.o;
            xvb = new np4(r2f, cd4, new np4(r2f, cd4, xvb, 1), 0);
        }
        cd4 cd42 = awb.o;
        return new jo0(cd42, awb.s, new ko0((zqd) awb.m, cd42, xvb, 1));
    }
}
