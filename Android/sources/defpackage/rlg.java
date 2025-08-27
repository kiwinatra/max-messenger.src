package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rlg  reason: default package */
public final class rlg implements oa4 {
    public static final rlg a = new Object();
    public static final slg b = slg.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        slg.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) slg.c)) {
            return new ab4(str, ra4, bundle, za4.a, (xa4) null, new xke(4), 16);
        }
        z68.f(rlg.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
        return null;
    }
}
