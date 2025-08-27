package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: dj4  reason: default package */
public final class dj4 extends jqf {
    public static final /* synthetic */ int X0 = 0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final SparseArray V0;
    public final SparseBooleanArray W0;

    static {
        new dj4(new fj4());
    }

    public dj4(fj4 fj4) {
        super(fj4);
        this.J0 = fj4.z;
        this.K0 = fj4.A;
        this.L0 = fj4.B;
        this.M0 = fj4.C;
        this.N0 = fj4.D;
        this.O0 = fj4.E;
        this.P0 = fj4.F;
        this.Q0 = fj4.G;
        this.R0 = fj4.H;
        this.I0 = fj4.I;
        this.S0 = fj4.J;
        this.T0 = fj4.K;
        this.U0 = fj4.L;
        this.V0 = fj4.M;
        this.W0 = fj4.N;
    }

    public final gj4 a(int i, tpf tpf) {
        Map map = (Map) this.V0.get(i);
        if (map != null) {
            return (gj4) map.get(tpf);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dj4.class != obj.getClass()) {
            return false;
        }
        dj4 dj4 = (dj4) obj;
        if (super.equals(dj4) && this.J0 == dj4.J0 && this.K0 == dj4.K0 && this.L0 == dj4.L0 && this.M0 == dj4.M0 && this.N0 == dj4.N0 && this.O0 == dj4.O0 && this.P0 == dj4.P0 && this.Q0 == dj4.Q0 && this.R0 == dj4.R0 && this.I0 == dj4.I0 && this.S0 == dj4.S0 && this.T0 == dj4.T0 && this.U0 == dj4.U0) {
            SparseBooleanArray sparseBooleanArray = this.W0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = dj4.W0;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.V0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = dj4.V0;
                        if (sparseArray2.size() == size2) {
                            int i2 = 0;
                            while (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            tpf tpf = (tpf) entry.getKey();
                                            if (map2.containsKey(tpf)) {
                                                if (!t0g.a(entry.getValue(), map2.get(tpf))) {
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.J0 ? 1 : 0)) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0)) * 31) + (this.M0 ? 1 : 0)) * 31) + (this.N0 ? 1 : 0)) * 31) + (this.O0 ? 1 : 0)) * 31) + (this.P0 ? 1 : 0)) * 31) + (this.Q0 ? 1 : 0)) * 31) + (this.R0 ? 1 : 0)) * 31) + this.I0) * 31) + (this.S0 ? 1 : 0)) * 31) + (this.T0 ? 1 : 0)) * 31) + (this.U0 ? 1 : 0);
    }
}
