package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tue  reason: default package */
public final class tue implements oa4 {
    public static final tue a = new Object();
    public static final uue b = uue.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        ya4 ha3;
        if (!b.a.contains(ra4)) {
            return null;
        }
        Long F = o54.F("set_id", bundle);
        long longValue = F != null ? F.longValue() : -1;
        uue.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) uue.c)) {
            ha3 = new xke(1);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) uue.d)) {
            ha3 = new xke(2);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) uue.e)) {
            ha3 = new xke(3);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) uue.f)) {
            ha3 = new ha3(longValue, 10);
        } else {
            throw new IllegalStateException(tr1.i("invalid route ", ra4));
        }
        return new ab4(str, ra4, bundle, za4.a, (xa4) null, ha3, 16);
    }
}
