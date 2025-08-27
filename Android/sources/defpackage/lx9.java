package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: lx9  reason: default package */
public final class lx9 extends ld9 {
    public final /* synthetic */ Comparator r;

    public lx9(Comparator comparator) {
        this.r = comparator;
    }

    public final Map q() {
        return new TreeMap(this.r);
    }
}
