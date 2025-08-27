package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: th7  reason: default package */
public final class th7 {
    public final Context a;
    public final m53 b;
    public final yr6 c;
    public final gy0 d;
    public final cs6 e;
    public final Executor f;
    public final SparseArray g;
    public final int h;
    public final boolean i;
    public fs6 j;
    public q2 k;

    public th7(Context context, m53 m53, yr6 yr6, gy0 gy0, Executor executor, ak4 ak4, int i2, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = m53;
        this.c = yr6;
        this.d = gy0;
        this.f = executor;
        this.e = ak4;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.h = i2;
        this.i = z2;
        sparseArray.put(1, new sh7(new kf5(yr6, gy0, z, z2)));
        sparseArray.put(2, new sh7(new so0(yr6, gy0, z3)));
        sparseArray.put(3, new sh7(new sef(yr6, gy0)));
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i2 < sparseArray.size()) {
                sh7 sh7 = (sh7) sparseArray.get(sparseArray.keyAt(i2));
                sh7.a.release();
                gf5 gf5 = sh7.b;
                if (gf5 != null) {
                    ((gi4) gf5).release();
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
