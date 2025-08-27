package defpackage;

import android.util.Size;

/* renamed from: e87  reason: default package */
public final class e87 {
    public static final j87 a;

    /* JADX WARNING: type inference failed for: r3v0, types: [x3d, java.lang.Object] */
    static {
        Size size = new Size(640, 480);
        vy4 vy4 = vy4.d;
        jq5 jq5 = jq5.c;
        Size size2 = pde.c;
        ? obj = new Object();
        obj.a = size2;
        obj.b = 1;
        w3d w3d = new w3d(jq5, obj, 0);
        d87 d87 = new d87(0);
        la0 la0 = x97.K;
        pz9 pz9 = d87.b;
        pz9.f(la0, size);
        pz9.f(zzf.n0, 1);
        pz9.f(x97.F, 0);
        pz9.f(x97.N, w3d);
        if (vy4.equals(vy4)) {
            pz9.f(m97.E, vy4);
            a = new j87(c5b.a(pz9));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
