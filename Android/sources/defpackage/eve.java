package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eve  reason: default package */
public final class eve implements oa4 {
    public static final eve a = new Object();
    public static final fve b = fve.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        fve.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) fve.c)) {
            return new ab4(str, ra4, bundle, za4.a, (xa4) null, new o72(bundle, 12), 16);
        }
        throw new IllegalStateException(tr1.i("invalid route ", ra4));
    }
}
