package defpackage;

import java.util.Comparator;

/* renamed from: f5b  reason: default package */
public abstract class f5b implements Comparator {
    public static f5b a(Comparator comparator) {
        return comparator instanceof f5b ? (f5b) comparator : new u93(comparator);
    }

    public f5b b() {
        return new e5d(this);
    }
}
