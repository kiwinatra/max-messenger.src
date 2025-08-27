package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o88  reason: default package */
public final class o88 implements oa4 {
    public static final o88 a = new Object();
    public static final p88 b = p88.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        ya4 ha3;
        if (!b.a.contains(ra4)) {
            return null;
        }
        if (Intrinsics.areEqual((Object) ra4, (Object) p88.c)) {
            ha3 = new i(18);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) p88.d)) {
            ha3 = new ha3(o54.L("id", bundle), 3);
        } else {
            throw new IllegalStateException(tr1.i("invalid route ", ra4));
        }
        return new ab4(str, ra4, bundle, (za4) null, (xa4) null, ha3, 24);
    }
}
