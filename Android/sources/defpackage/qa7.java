package defpackage;

import android.net.Uri;
import java.io.File;
import org.apache.commons.logging.LogFactory;

/* renamed from: qa7  reason: default package */
public final class qa7 {
    public final oa7 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final c97 h;
    public final v3d i;
    public final f8d j;
    public final uub k;
    public final pa7 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final bsb q;
    public final g3d r;
    public final Boolean s;
    public final nt4 t;
    public final String u;
    public final int v;

    public qa7(ra7 ra7) {
        this.a = ra7.g;
        Uri uri = ra7.a;
        this.b = uri;
        boolean z = false;
        int i2 = -1;
        if (uri != null) {
            if (mzf.e(uri)) {
                i2 = 0;
            } else if (uri.getPath() != null && "file".equals(mzf.b(uri))) {
                String a2 = n29.a(uri.getPath());
                i2 = a2 != null ? StringsKt__StringsJVMKt.startsWith$default(a2, "video/", false, 2, (Object) null) : false ? 2 : 3;
            } else if ("content".equals(mzf.b(uri))) {
                i2 = 4;
            } else if ("asset".equals(mzf.b(uri))) {
                i2 = 5;
            } else if ("res".equals(mzf.b(uri))) {
                i2 = 6;
            } else if ("data".equals(uri.getScheme())) {
                i2 = 7;
            } else if ("android.resource".equals(mzf.b(uri))) {
                i2 = 8;
            }
        }
        this.c = i2;
        this.e = ra7.h;
        this.f = ra7.i;
        this.g = ra7.j;
        this.h = ra7.f;
        this.i = ra7.d;
        f8d f8d = ra7.e;
        this.j = f8d == null ? f8d.b : f8d;
        ra7.getClass();
        this.k = ra7.k;
        this.l = ra7.b;
        boolean z2 = (ra7.c & 48) == 0 && (mzf.e(ra7.a) || ra7.c(ra7.a));
        this.n = z2;
        int i3 = ra7.c;
        this.m = !z2 ? i3 | 48 : i3;
        this.o = (i3 & 15) == 0 ? true : z;
        this.p = ra7.m;
        this.q = ra7.l;
        this.r = ra7.n;
        this.s = ra7.o;
        this.t = ra7.p;
        this.v = ra7.q;
        this.u = ra7.r;
    }

    public static qa7 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ra7.d(uri).a();
    }

    public static qa7 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final synchronized File c() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.d;
    }

    public final boolean d(int i2) {
        return (this.m & i2) == 0;
    }

    public final boolean equals(Object obj) {
        qa7 qa7;
        if (!(obj instanceof qa7) || this.f != (qa7 = (qa7) obj).f || this.n != qa7.n || this.o != qa7.o || !hsg.k(this.b, qa7.b) || !hsg.k(this.a, qa7.a) || !hsg.k(this.u, qa7.u) || !hsg.k(this.d, qa7.d)) {
            return false;
        }
        qa7.getClass();
        if (!hsg.k((Object) null, (Object) null) || !hsg.k(this.h, qa7.h) || !hsg.k(this.i, qa7.i) || !hsg.k(this.k, qa7.k) || !hsg.k(this.l, qa7.l) || !hsg.k(Integer.valueOf(this.m), Integer.valueOf(qa7.m)) || !hsg.k(this.p, qa7.p) || !hsg.k(this.s, qa7.s) || !hsg.k(this.t, qa7.t) || !hsg.k(this.j, qa7.j) || this.g != qa7.g) {
            return false;
        }
        qx0 qx0 = null;
        bsb bsb = this.q;
        qx0 b2 = bsb != null ? bsb.b() : null;
        bsb bsb2 = qa7.q;
        if (bsb2 != null) {
            qx0 = bsb2.b();
        }
        return hsg.k(b2, qx0) && this.v == qa7.v;
    }

    public final int hashCode() {
        bsb bsb = this.q;
        return q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(q8.g(0, this.a), this.b), Boolean.valueOf(this.f)), (Object) null), this.k), this.l), Integer.valueOf(this.m)), Boolean.valueOf(this.n)), Boolean.valueOf(this.o)), this.h), this.p), this.i), this.j), bsb != null ? bsb.b() : null), this.s), this.t), Integer.valueOf(this.v)), Boolean.valueOf(this.g));
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.x(this.b, "uri");
        K.x(this.a, "cacheChoice");
        K.x(this.h, "decodeOptions");
        K.x(this.q, "postprocessor");
        K.x(this.k, LogFactory.PRIORITY_KEY);
        K.x(this.i, "resizeOptions");
        K.x(this.j, "rotationOptions");
        K.x((Object) null, "bytesRange");
        K.x(this.s, "resizingAllowedOverride");
        K.x(this.t, "downsampleOverride");
        K.w("progressiveRenderingEnabled", this.e);
        K.w("localThumbnailPreviewsEnabled", this.f);
        K.w("loadThumbnailOnly", this.g);
        K.x(this.l, "lowestPermittedRequestLevel");
        K.v(this.m, "cachesDisabled");
        K.w("isDiskCacheEnabled", this.n);
        K.w("isMemoryCacheEnabled", this.o);
        K.x(this.p, "decodePrefetches");
        K.v(this.v, "delayMs");
        return K.toString();
    }
}
