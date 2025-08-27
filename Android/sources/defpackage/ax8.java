package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* renamed from: ax8  reason: default package */
public final class ax8 {
    public static final zvd d;
    public static final pob e;
    public final zvd a;
    public final pob b;
    public final tb7 c;

    static {
        HashSet hashSet = new HashSet();
        k0d k0d = yvd.d;
        for (int i = 0; i < k0d.o; i++) {
            hashSet.add(new yvd(((Integer) k0d.get(i)).intValue()));
        }
        d = new zvd(hashSet);
        HashSet hashSet2 = new HashSet();
        k0d k0d2 = yvd.e;
        for (int i2 = 0; i2 < k0d2.o; i2++) {
            hashSet2.add(new yvd(((Integer) k0d2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < k0d.o; i3++) {
            hashSet2.add(new yvd(((Integer) k0d.get(i3)).intValue()));
        }
        new zvd(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int append : y35.c) {
            n79.n(!false);
            sparseBooleanArray.append(append, true);
        }
        n79.n(!false);
        e = new pob(new xq5(sparseBooleanArray));
    }

    public ax8(zvd zvd, pob pob, tb7 tb7) {
        this.a = zvd;
        this.b = pob;
        this.c = tb7;
    }
}
