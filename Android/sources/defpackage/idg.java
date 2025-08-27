package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* renamed from: idg  reason: default package */
public final class idg implements uzf {
    public final HashMap X;
    public final y3d Y;
    public final y3d Z;
    public final Set a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();
    public final c0g v;
    public final su1 w;
    public final su1 x;
    public final fx1 y = new fx1(2, this);
    public final HashSet z;

    public idg(su1 su1, su1 su12, HashSet hashSet, c0g c0g, nqd nqd) {
        this.w = su1;
        this.x = su12;
        this.v = c0g;
        this.a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vzf vzf = (vzf) it.next();
            hashMap.put(vzf, vzf.m(su1.n(), (zzf) null, vzf.f(true, c0g)));
        }
        this.X = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.z = hashSet2;
        this.Y = new y3d(su1, hashSet2);
        if (this.x != null) {
            this.Z = new y3d(this.x, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            vzf vzf2 = (vzf) it2.next();
            this.o.put(vzf2, Boolean.FALSE);
            this.c.put(vzf2, new hdg(su1, this, nqd));
        }
    }

    public static void q(q3f q3f, lk4 lk4, fwd fwd) {
        q3f.e();
        try {
            ev0.g();
            q3f.b();
            p3f p3f = q3f.l;
            Objects.requireNonNull(p3f);
            p3f.f(lk4, new n3f(p3f, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            dwd dwd = fwd.f;
            if (dwd != null) {
                dwd.a(fwd);
            }
        }
    }

    public static lk4 r(vzf vzf) {
        List b2 = vzf instanceof y87 ? vzf.m.b() : Collections.unmodifiableList(vzf.m.g.a);
        bs0.r((String) null, b2.size() <= 1);
        if (b2.size() == 1) {
            return (lk4) b2.get(0);
        }
        return null;
    }

    public final void d(vzf vzf) {
        lk4 r;
        ev0.g();
        q3f q3f = (q3f) this.b.get(vzf);
        Objects.requireNonNull(q3f);
        if (s(vzf) && (r = r(vzf)) != null) {
            q(q3f, r, vzf.m);
        }
    }

    public final void e(vzf vzf) {
        ev0.g();
        if (!s(vzf)) {
            this.o.put(vzf, Boolean.TRUE);
            lk4 r = r(vzf);
            if (r != null) {
                q3f q3f = (q3f) this.b.get(vzf);
                Objects.requireNonNull(q3f);
                q(q3f, r, vzf.m);
            }
        }
    }

    public final void h(vzf vzf) {
        ev0.g();
        if (s(vzf)) {
            q3f q3f = (q3f) this.b.get(vzf);
            Objects.requireNonNull(q3f);
            lk4 r = r(vzf);
            if (r != null) {
                q(q3f, r, vzf.m);
                return;
            }
            ev0.g();
            q3f.b();
            q3f.l.a();
        }
    }

    public final void o(vzf vzf) {
        ev0.g();
        if (s(vzf)) {
            this.o.put(vzf, Boolean.FALSE);
            q3f q3f = (q3f) this.b.get(vzf);
            Objects.requireNonNull(q3f);
            ev0.g();
            q3f.b();
            q3f.l.a();
        }
    }

    public final nb0 p(vzf vzf, y3d y3d, su1 su1, q3f q3f, int i, boolean z2) {
        boolean z3;
        Size size;
        vzf vzf2 = vzf;
        y3d y3d2 = y3d;
        q3f q3f2 = q3f;
        int m = su1.n().m(i);
        Matrix matrix = q3f2.b;
        RectF rectF = grf.a;
        float[] fArr = {c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        double sqrt = Math.sqrt((double) ((f2 * f2) + (f * f))) * Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
        boolean z4 = ((float) Math.toDegrees(Math.atan2(((double) ((f * f4) - (f2 * f3))) / sqrt, ((double) f5) / sqrt))) > c44.DEFAULT_ASPECT_RATIO;
        zzf zzf = (zzf) this.X.get(vzf2);
        Objects.requireNonNull(zzf);
        float[] fArr2 = new float[9];
        q3f2.b.getValues(fArr2);
        int h = grf.h((int) Math.round(Math.atan2((double) fArr2[3], (double) fArr2[0]) * 57.29577951308232d));
        y3d.getClass();
        boolean c2 = grf.c(h);
        Rect rect = q3f2.d;
        if (c2) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            size = grf.e(rect);
            Iterator it = y3d2.b(zzf).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size e = grf.e(y3d.a((Size) it.next(), size));
                if (!y3d.c(e, size)) {
                    size = e;
                    break;
                }
            }
        } else {
            Size e2 = grf.e(rect);
            List b2 = y3d2.b(zzf);
            Iterator it2 = b2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = b2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = e2;
                            break;
                        }
                        Size size2 = (Size) it3.next();
                        if (!y3d.c(size2, e2)) {
                            size = size2;
                            break;
                        }
                    }
                } else {
                    Size size3 = (Size) it2.next();
                    Rational rational = ht.a;
                    Size size4 = pde.c;
                    if (!ht.a(e2, rational, size4)) {
                        rational = ht.c;
                        if (!ht.a(e2, rational, size4)) {
                            rational = y3d.g(e2);
                        }
                    }
                    if (!y3d2.d(rational, size3) && !y3d.c(size3, e2)) {
                        size = size3;
                        break;
                    }
                }
            }
            rect = y3d.a(e2, size);
        }
        Pair pair = new Pair(rect, size);
        Rect rect2 = (Rect) pair.first;
        Size size5 = (Size) pair.second;
        if (z3) {
            Size size6 = new Size(size5.getHeight(), size5.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size5 = size6;
        }
        Pair pair2 = new Pair(rect2, size5);
        Rect rect3 = (Rect) pair2.first;
        Size size7 = (Size) pair2.second;
        int m2 = this.w.n().m(((x97) vzf2.f).Y(0));
        hdg hdg = (hdg) this.c.get(vzf2);
        Objects.requireNonNull(hdg);
        hdg.c.c = m2;
        int h2 = grf.h((q3f2.i + m2) - m);
        return new nb0(UUID.randomUUID(), vzf2 instanceof bub ? 1 : vzf2 instanceof y87 ? 4 : 2, vzf2 instanceof y87 ? 256 : 34, rect3, grf.g(size7, h2), h2, vzf2.l(su1) ^ z4);
    }

    public final boolean s(vzf vzf) {
        Boolean bool = (Boolean) this.o.get(vzf);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void t(HashMap hashMap) {
        HashMap hashMap2 = this.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            vzf vzf = (vzf) entry.getKey();
            q3f q3f = (q3f) entry.getValue();
            vzf.A(q3f.d);
            vzf.y(q3f.b);
            vzf.g = vzf.w(q3f.g, (hc0) null);
            vzf.p();
        }
    }
}
