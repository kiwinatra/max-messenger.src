package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ba7  reason: default package */
public final class ba7 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public static final CancellationException m = new CancellationException("Modified URL is null");
    public final ewb a;
    public final r2f b;
    public final r2f c;
    public final zb6 d;
    public final yb6 e;
    public final z59 f;
    public final z59 g;
    public final cd4 h;
    public final r2f i;
    public final AtomicLong j = new AtomicLong();
    public final da7 k;

    static {
        new CancellationException("ImageRequest is null");
    }

    public ba7(ewb ewb, Set set, Set set2, w2f w2f, zqd zqd, zqd zqd2, r2f r2f, cd4 cd4, r2f r2f2, da7 da7) {
        this.a = ewb;
        this.b = w2f;
        this.c = r2f;
        this.d = new zb6(set);
        this.e = new yb6(set2);
        this.f = zqd;
        this.g = zqd2;
        this.h = cd4;
        this.i = r2f2;
        this.k = da7;
    }

    public final i0 a(qa7 qa7, Object obj) {
        return b(qa7, obj, (pa7) null, (g3d) null, (String) null);
    }

    public final i0 b(qa7 qa7, Object obj, pa7 pa7, g3d g3d, String str) {
        if (qa7 == null) {
            return q8.s(new NullPointerException());
        }
        try {
            xvb c2 = this.a.c(qa7);
            if (pa7 == null) {
                pa7 = pa7.FULL_FETCH;
            }
            return h(c2, qa7, pa7, obj, g3d, str);
        } catch (Exception e2) {
            return q8.s(e2);
        }
    }

    public final i0 c(qa7 qa7) {
        if (qa7.b != null) {
            try {
                xvb e2 = this.a.e(qa7);
                if (qa7.i != null) {
                    ra7 b2 = ra7.b(qa7);
                    b2.d = null;
                    qa7 = b2.a();
                }
                return h(e2, qa7, pa7.FULL_FETCH, (Object) null, (g3d) null, (String) null);
            } catch (Exception e3) {
                return q8.s(e3);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final io0 d(qa7 qa7, f0 f0Var) {
        tf6.P();
        bsb bsb = qa7.q;
        cd4 cd4 = this.h;
        return bsb != null ? cd4.j(qa7, f0Var) : cd4.e(qa7, f0Var);
    }

    public final zb6 e(qa7 qa7, g3d g3d) {
        if (qa7 != null) {
            zb6 zb6 = this.d;
            g3d g3d2 = qa7.r;
            if (g3d == null) {
                if (g3d2 == null) {
                    return zb6;
                }
                return new zb6(zb6, g3d2);
            } else if (g3d2 == null) {
                return new zb6(zb6, g3d);
            } else {
                return new zb6(zb6, g3d, g3d2);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final i0 f(qa7 qa7, f0 f0Var) {
        tf6.P();
        CancellationException cancellationException = l;
        r2f r2f = this.i;
        da7 da7 = this.k;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return q8.s(cancellationException);
        }
        try {
            da7.v.getClass();
            if (qa7 != null) {
                Boolean bool = qa7.p;
                boolean booleanValue = bool != null ? !bool.booleanValue() : ((Boolean) r2f.get()).booleanValue();
                ewb ewb = this.a;
                return i(booleanValue ? ewb.d(qa7) : ewb.b(qa7), qa7, f0Var, uub.c);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception e2) {
            return q8.s(e2);
        }
    }

    public final i0 g(qa7 qa7, Object obj, uub uub) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return q8.s(l);
        }
        if (qa7 == null) {
            return q8.s(new NullPointerException("imageRequest is null"));
        }
        try {
            return i(this.a.d(qa7), qa7, obj, uub);
        } catch (Exception e2) {
            return q8.s(e2);
        }
    }

    public final i0 h(xvb xvb, qa7 qa7, pa7 pa7, Object obj, g3d g3d, String str) {
        boolean z;
        qa7 qa72 = qa7;
        tf6.P();
        ej7 ej7 = new ej7(e(qa7, g3d), this.e);
        try {
            pa7 pa72 = qa72.l;
            pa7 pa73 = pa7;
            pa7 pa74 = pa72.a > pa73.a ? pa72 : pa73;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            if (!qa72.e) {
                if (mzf.e(qa72.b)) {
                    z = false;
                    ik0 ik0 = new ik0(qa7, valueOf, str, ej7, obj, pa74, false, z, qa72.k, this.k);
                    tf6.P();
                    xvb xvb2 = xvb;
                    w33 w33 = new w33(xvb, ik0, ej7, 0);
                    tf6.P();
                    return w33;
                }
            }
            z = true;
            ik0 ik02 = new ik0(qa7, valueOf, str, ej7, obj, pa74, false, z, qa72.k, this.k);
            tf6.P();
            xvb xvb22 = xvb;
            w33 w332 = new w33(xvb, ik02, ej7, 0);
            tf6.P();
            return w332;
        } catch (Exception e2) {
            return q8.s(e2);
        }
    }

    public final i0 i(xvb xvb, qa7 qa7, Object obj, uub uub) {
        qa7 qa72 = qa7;
        pa7 pa7 = pa7.FULL_FETCH;
        ej7 ej7 = new ej7(e(qa72, (g3d) null), this.e);
        Uri uri = qa72.b;
        if (uri == null) {
            return q8.s(m);
        }
        if (!Intrinsics.areEqual((Object) uri, (Object) uri)) {
            ra7 b2 = ra7.b(qa7);
            b2.a = uri;
            qa72 = b2.a();
        }
        qa7 qa73 = qa72;
        try {
            pa7 pa72 = qa73.l;
            pa7 pa73 = pa72.a > 1 ? pa72 : pa7;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            da7 da7 = this.k;
            f7a f7a = da7.v;
            return new w33(xvb, new ik0(qa73, valueOf, (String) null, ej7, obj, pa73, true, false, uub, da7), ej7, 1);
        } catch (Exception e2) {
            return q8.s(e2);
        }
    }
}
