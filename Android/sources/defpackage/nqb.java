package defpackage;

import android.util.SparseIntArray;
import kotlin.io.ConstantsKt;

/* renamed from: nqb  reason: default package */
public final class nqb {
    public final pqb a = bd4.a();
    public final v9a b = v9a.a();
    public final pqb c;
    public final u9a d;
    public final pqb e;
    public final v9a f;
    public final pqb g;
    public final v9a h;
    public final String i;
    public final int j;

    public nqb(p7d p7d) {
        tf6.P();
        p7d.getClass();
        int i2 = lf4.a;
        int i3 = i2 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
            sparseIntArray.put(i4, i2);
        }
        this.c = new pqb(4194304, i3, sparseIntArray, lf4.a);
        this.d = u9a.a();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(ConstantsKt.DEFAULT_BLOCK_SIZE, 5);
        sparseIntArray2.put(ConstantsKt.DEFAULT_BUFFER_SIZE, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i5 = min < 16777216 ? 3145728 : min < 33554432 ? 6291456 : 12582912;
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new pqb(i5, min2 < 16777216 ? min2 / 2 : (min2 / 4) * 3, sparseIntArray2, -1);
        this.f = v9a.a();
        pqb pqb = (pqb) p7d.b;
        if (pqb == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            pqb = new pqb(81920, 1048576, sparseIntArray3, -1);
        }
        this.g = pqb;
        this.h = v9a.a();
        String str = (String) p7d.c;
        this.i = str == null ? "legacy" : str;
        this.j = 4194304;
        tf6.P();
    }
}
