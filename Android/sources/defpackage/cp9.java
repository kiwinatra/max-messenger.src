package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cp9  reason: default package */
public final class cp9 implements oa4 {
    public static final cp9 a = new Object();
    public static final dp9 b = dp9.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        dp9.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) dp9.c)) {
            return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new i(21), 24);
        }
        z68.f(cp9.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
        return null;
    }
}
