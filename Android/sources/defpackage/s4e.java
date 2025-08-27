package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: s4e  reason: default package */
public final class s4e {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public s4e() {
        d(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 270.0f, c44.DEFAULT_ASPECT_RATIO);
    }

    public final void a(float f2) {
        float f3 = this.e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.c;
                float f6 = this.d;
                o4e o4e = new o4e(f5, f6, f5, f6);
                o4e.f = this.e;
                o4e.g = f4;
                this.h.add(new m4e(o4e));
                this.e = f2;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((q4e) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [p4e, q4e, java.lang.Object] */
    public final void c(float f2, float f3) {
        ? q4e = new q4e();
        q4e.b = f2;
        q4e.c = f3;
        this.g.add(q4e);
        n4e n4e = new n4e(q4e, this.c, this.d);
        a(n4e.b() + 270.0f);
        this.h.add(n4e);
        this.e = n4e.b() + 270.0f;
        this.c = f2;
        this.d = f3;
    }

    public final void d(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
