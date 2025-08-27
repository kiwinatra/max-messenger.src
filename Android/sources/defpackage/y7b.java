package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: y7b  reason: default package */
public final class y7b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public y7b(int i2, int i3) {
        this.a = Color.red(i2);
        this.b = Color.green(i2);
        this.c = Color.blue(i2);
        this.d = i2;
        this.e = i3;
    }

    public final void a() {
        if (!this.f) {
            int i2 = this.d;
            int e2 = w53.e(-1, 4.5f, i2);
            int e3 = w53.e(-1, 3.0f, i2);
            if (e2 == -1 || e3 == -1) {
                int e4 = w53.e(-16777216, 4.5f, i2);
                int e5 = w53.e(-16777216, 3.0f, i2);
                if (e4 == -1 || e5 == -1) {
                    this.h = e2 != -1 ? w53.h(-1, e2) : w53.h(-16777216, e4);
                    this.g = e3 != -1 ? w53.h(-1, e3) : w53.h(-16777216, e5);
                    this.f = true;
                    return;
                }
                this.h = w53.h(-16777216, e4);
                this.g = w53.h(-16777216, e5);
                this.f = true;
                return;
            }
            this.h = w53.h(-1, e2);
            this.g = w53.h(-1, e3);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        w53.a(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y7b.class != obj.getClass()) {
            return false;
        }
        y7b y7b = (y7b) obj;
        return this.e == y7b.e && this.d == y7b.d;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(y7b.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
