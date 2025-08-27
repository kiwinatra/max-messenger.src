package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m2e  reason: default package */
public final class m2e implements oa4 {
    public static final m2e a = new Object();
    public static final n2e b = n2e.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        n2e.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) n2e.c)) {
            return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new i(27), 24);
        }
        z68.f(m2e.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
        return null;
    }
}
