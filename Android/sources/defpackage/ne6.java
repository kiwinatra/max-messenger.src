package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: ne6  reason: default package */
public final class ne6 extends hk0 {
    public final g4g c;
    public final long d;
    public final String e = ne6.class.getName();

    public ne6(g4g g4g, long j) {
        this.c = g4g;
        this.d = j;
    }

    public final y33 a(Bitmap bitmap, ynb ynb) {
        g4g g4g = this.c;
        zy b = g4g.b();
        if (b == null) {
            z68.p(this.e, "No video collage");
            ynb.getClass();
            return ynb.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int e2 = (int) g4g.e();
        int i = b.v;
        int width = bitmap.getWidth();
        int i2 = b.o;
        int i3 = width / i2;
        int i4 = ((int) this.d) / (e2 / i);
        int i5 = i - 1;
        int i6 = b.c;
        return ynb.b(bitmap, (Math.min(i4, i5) % i3) * i2, (Math.min(i4, i5) / i3) * i6, b.o, i6, (Matrix) null);
    }

    public final qx0 b() {
        StringBuilder n = tr1.n(this.c.f(), "videoId=", ", millis=");
        n.append(this.d);
        return new uae(n.toString());
    }

    public final String getName() {
        return ne6.class.getSimpleName();
    }
}
