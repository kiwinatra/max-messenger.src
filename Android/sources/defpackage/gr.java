package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gr  reason: default package */
public final class gr implements oa4 {
    public static final gr a = new Object();
    public static final hr b = hr.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        za4 za4 = za4.a;
        if (Intrinsics.areEqual((Object) ra4, (Object) hr.c)) {
            return new ab4(str, ra4, bundle, za4, (xa4) null, new i(2), 16);
        }
        throw new IllegalStateException(tr1.i("Unknown route=", ra4));
    }
}
