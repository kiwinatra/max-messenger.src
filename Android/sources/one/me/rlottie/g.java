package one.me.rlottie;

import android.util.SparseIntArray;
import java.util.ArrayList;

public final class g {
    public static ArrayList j;
    public static g k;
    public static final ArrayList l = new ArrayList();
    public static final xvg m = new xvg(2);
    public final ArrayList a = new ArrayList(10);
    public final SparseIntArray b = new SparseIntArray();
    public final ArrayList c = new ArrayList(10);
    public final int d;
    public int e;
    public final int f;
    public int g;
    public boolean h;
    public final f i = new f(this);

    public g(int i2) {
        this.d = i2;
        this.f = e.j.nextInt();
    }

    public static void a(Runnable runnable, boolean z) {
        if (!a.b()) {
            RLottie.getLogger().e(new RuntimeException("wrong thread"));
            return;
        }
        ArrayList arrayList = j;
        xvg xvg = m;
        if (arrayList == null) {
            ArrayList arrayList2 = l;
            if (!arrayList2.isEmpty()) {
                j = (ArrayList) arrayList2.remove(arrayList2.size() - 1);
            } else {
                j = new ArrayList(100);
            }
            if (!z) {
                a.d(xvg);
            }
        }
        j.add(runnable);
        if (z) {
            a.a.removeCallbacks(xvg);
            xvg.run();
        }
    }
}
