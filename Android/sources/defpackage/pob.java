package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* renamed from: pob  reason: default package */
public final class pob {
    public static final pob b;
    public static final String c = Integer.toString(0, 36);
    public final xq5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        n79.n(!false);
        b = new pob(new xq5(sparseBooleanArray));
        int i = v0g.a;
    }

    public pob(xq5 xq5) {
        this.a = xq5;
    }

    public static pob c(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int intValue = integerArrayList.get(i).intValue();
            n79.n(!false);
            sparseBooleanArray.append(intValue, true);
        }
        n79.n(!false);
        return new pob(new xq5(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final boolean b(int... iArr) {
        return this.a.a(iArr);
    }

    public final int d(int i) {
        return this.a.b(i);
    }

    public final int e() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pob)) {
            return false;
        }
        return this.a.equals(((pob) obj).a);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            xq5 xq5 = this.a;
            if (i < xq5.a.size()) {
                arrayList.add(Integer.valueOf(xq5.b(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
