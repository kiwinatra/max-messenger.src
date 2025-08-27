package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wn7  reason: default package */
public final class wn7 implements oa4 {
    public static final wn7 a = new Object();
    public static final xn7 b = xn7.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!b.a.contains(ra4)) {
            return null;
        }
        xa4 xa4 = new xa4(new ck7(5), new ck7(6));
        xn7.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) xn7.c)) {
            return new ab4(str, ra4, bundle, (za4) null, xa4, new o72(bundle, 7), 8);
        }
        throw new IllegalStateException(tr1.i("unknown screen ", ra4));
    }
}
