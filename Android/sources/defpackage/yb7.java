package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: yb7  reason: default package */
public final class yb7 extends AbstractMap {
    public final c1g[] a;

    public yb7(c1g[] c1gArr) {
        this.a = c1gArr;
    }

    public final Set entrySet() {
        return new os(this.a);
    }
}
