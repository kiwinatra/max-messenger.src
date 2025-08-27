package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mte  reason: default package */
public final class mte implements oa4 {
    public static final mte a = new Object();
    public static final nte b = nte.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        nte.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) nte.c)) {
            return new ab4(str, ra4, bundle, za4.a, (xa4) null, new o72(bundle, 11), 16);
        }
        throw new IllegalStateException(tr1.i("invalid route ", ra4));
    }
}
