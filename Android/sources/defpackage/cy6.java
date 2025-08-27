package defpackage;

import java.util.ArrayList;

/* renamed from: cy6  reason: default package */
public abstract class cy6 extends tj3 {
    public tj3[] q0 = new tj3[4];
    public int r0 = 0;

    public final void R(int i, fng fng, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            tj3 tj3 = this.q0[i2];
            ArrayList arrayList2 = fng.a;
            if (!arrayList2.contains(tj3)) {
                arrayList2.add(tj3);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            cvg.t(this.q0[i3], i, arrayList, fng);
        }
    }

    public void S() {
    }
}
