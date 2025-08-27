package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Locale;

/* renamed from: me6  reason: default package */
public final class me6 extends hk0 {
    public final f4g c;
    public final long d;

    public me6(f4g f4g, long j) {
        this.c = f4g;
        this.d = j;
    }

    public final y33 a(Bitmap bitmap, ynb ynb) {
        ol0 ol0 = (ol0) this.c;
        zy zyVar = ol0.f;
        if (zyVar == null) {
            z68.f("me6", "No video collage", (Throwable) null);
            ynb.getClass();
            return ynb.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int i = (int) ol0.a;
        int i2 = zyVar.v;
        int width = bitmap.getWidth();
        int i3 = zyVar.o;
        int i4 = width / i3;
        int i5 = ((int) this.d) / (i / i2);
        int i6 = i2 - 1;
        int i7 = zyVar.c;
        return ynb.b(bitmap, (Math.min(i5, i6) % i4) * i3, (Math.min(i5, i6) / i4) * i7, zyVar.o, i7, (Matrix) null);
    }

    public final qx0 b() {
        Locale locale = Locale.ENGLISH;
        StringBuilder n = tr1.n(((ol0) this.c).e, "videoId=", ", millis=");
        n.append(this.d);
        return new uae(n.toString());
    }

    public final String getName() {
        return me6.class.getSimpleName();
    }
}
