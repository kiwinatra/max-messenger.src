package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ra7  reason: default package */
public final class ra7 {
    public static final HashSet s = new HashSet();
    public Uri a;
    public pa7 b;
    public int c;
    public v3d d;
    public f8d e;
    public c97 f;
    public oa7 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public uub k;
    public bsb l;
    public Boolean m;
    public g3d n;
    public Boolean o;
    public nt4 p;
    public int q;
    public String r;

    public static ra7 b(qa7 qa7) {
        ra7 d2 = d(qa7.b);
        d2.f = qa7.h;
        qa7.getClass();
        d2.getClass();
        oa7 oa7 = qa7.a;
        d2.g = oa7;
        d2.i = qa7.f;
        d2.j = qa7.g;
        d2.b = qa7.l;
        d2.c = qa7.m;
        if (oa7 != oa7.c) {
            d2.r = null;
        }
        d2.l = qa7.q;
        d2.h = qa7.e;
        d2.k = qa7.k;
        d2.d = qa7.i;
        d2.n = qa7.r;
        d2.e = qa7.j;
        d2.m = qa7.p;
        d2.q = qa7.v;
        d2.r = qa7.u;
        d2.p = qa7.t;
        d2.o = qa7.s;
        return d2;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = s;
        if (!(hashSet == null || uri == null)) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ra7, java.lang.Object] */
    public static ra7 d(Uri uri) {
        ? obj = new Object();
        obj.a = null;
        obj.b = pa7.FULL_FETCH;
        obj.c = 0;
        obj.d = null;
        obj.e = null;
        obj.f = c97.c;
        obj.g = oa7.b;
        obj.h = false;
        obj.i = false;
        obj.j = false;
        obj.k = uub.o;
        obj.l = null;
        obj.m = null;
        obj.o = null;
        obj.p = null;
        obj.r = null;
        uri.getClass();
        obj.a = uri;
        return obj;
    }

    public final qa7 a() {
        Uri uri = this.a;
        if (uri != null) {
            if ("res".equals(mzf.b(uri))) {
                if (!this.a.isAbsolute()) {
                    throw new ImageRequestBuilder$BuilderException("Resource URI path must be absolute.");
                } else if (!this.a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new ImageRequestBuilder$BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new ImageRequestBuilder$BuilderException("Resource URI must not be empty");
                }
            }
            if (!"asset".equals(mzf.b(this.a)) || this.a.isAbsolute()) {
                return new qa7(this);
            }
            throw new ImageRequestBuilder$BuilderException("Asset URI path must be absolute.");
        }
        throw new ImageRequestBuilder$BuilderException("Source must be set!");
    }
}
