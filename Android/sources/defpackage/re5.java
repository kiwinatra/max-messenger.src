package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: re5  reason: default package */
public final class re5 implements oa4 {
    public static final re5 a = new Object();
    public static final se5 b = se5.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        se5.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) se5.c)) {
            return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new o72(bundle, 2), 24);
        }
        throw new IllegalStateException(tr1.i("unknown screen ", ra4));
    }
}
