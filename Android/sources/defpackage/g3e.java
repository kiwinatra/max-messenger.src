package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3e  reason: default package */
public final class g3e implements oa4 {
    public static final g3e a = new Object();
    public static final h3e b = h3e.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        f3e f3e;
        f3e f3e2;
        if (!b.a.contains(ra4)) {
            return null;
        }
        h3e.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) h3e.c)) {
            f3e2 = f3e.b;
        } else if (Intrinsics.areEqual((Object) ra4, (Object) h3e.d)) {
            f3e2 = f3e.c;
        } else if (Intrinsics.areEqual((Object) ra4, (Object) h3e.e)) {
            f3e2 = f3e.o;
        } else if (Intrinsics.areEqual((Object) ra4, (Object) h3e.f)) {
            String N = o54.N("mode", bundle);
            if (Intrinsics.areEqual((Object) N, (Object) "setup")) {
                f3e2 = f3e.v;
            } else if (Intrinsics.areEqual((Object) N, (Object) "confirm")) {
                f3e = new m31(o54.N("hash", bundle), 2);
                return new ab4(str, ra4, bundle, (za4) null, (xa4) null, f3e, 24);
            } else {
                throw new IllegalStateException("illegal mode".toString());
            }
        } else {
            z68.f(g3e.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
            return null;
        }
        f3e = f3e2;
        return new ab4(str, ra4, bundle, (za4) null, (xa4) null, f3e, 24);
    }
}
