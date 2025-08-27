package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: qu9  reason: default package */
public final class qu9 implements xf5 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable o;

    public qu9(qu1 qu1, Rational rational) {
        this.a = qu1.c();
        this.b = qu1.h();
        this.o = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    public zpf B(int i, int i2) {
        if (i2 == 2) {
            this.a = i;
        } else if (i2 == 1) {
            this.b = i;
        }
        HashMap hashMap = (HashMap) this.o;
        pu9 pu9 = (pu9) hashMap.get(Integer.valueOf(i2));
        if (pu9 != null) {
            return pu9;
        }
        pu9 pu92 = new pu9();
        hashMap.put(Integer.valueOf(i2), pu92);
        return pu92;
    }

    public void M(snd snd) {
        this.c = true;
    }

    public Size a(x97 x97) {
        boolean z = false;
        int Y = x97.Y(0);
        Size size = (Size) x97.k(x97.J, (Object) null);
        if (size == null) {
            return size;
        }
        int N = kne.N(Y);
        if (1 == this.b) {
            z = true;
        }
        int x = kne.x(N, this.a, z);
        return (x == 90 || x == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public void v() {
    }

    public qu9() {
        this.a = -1;
        this.b = -1;
        this.o = new HashMap();
    }
}
