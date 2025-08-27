package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: az3  reason: default package */
public abstract class az3 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(ft1.o, ft1.v, ft1.w, ft1.x));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(gt1.o, gt1.a));
    public static final Set c;
    public static final Set d;

    static {
        et1 et1 = et1.v;
        et1 et12 = et1.o;
        et1 et13 = et1.a;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(et1, et12, et13));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(et12);
        copyOf.remove(et13);
        d = Collections.unmodifiableSet(copyOf);
    }
}
