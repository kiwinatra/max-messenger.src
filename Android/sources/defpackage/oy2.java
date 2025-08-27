package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oy2  reason: default package */
public final class oy2 implements oa4 {
    public static final oy2 a = new Object();
    public static final py2 b = py2.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        xa4 xa4 = new xa4(new oq2(6), new oq2(7));
        if (Intrinsics.areEqual((Object) ra4, (Object) py2.c)) {
            return new ab4(str, ra4, bundle, za4.a, xa4, new i(5));
        }
        throw new IllegalStateException(tr1.i("invalid route ", ra4));
    }
}
