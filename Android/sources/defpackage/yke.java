package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yke  reason: default package */
public final class yke implements oa4 {
    public static final yke a = new Object();
    public static final ale b = ale.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        it3 it3;
        ya4 ha3;
        za4 za4 = za4.a;
        if (!b.a.contains(ra4)) {
            return null;
        }
        ale.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) ale.c)) {
            ha3 = new i(28);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) ale.d)) {
            ha3 = new i(29);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) ale.e)) {
            ha3 = new xke(0);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) ale.f)) {
            it3 = new it3(1, bundle.containsKey("ids") ? o54.M("ids", bundle) : new long[0]);
            return new ab4(str, ra4, bundle, za4, (xa4) null, it3, 16);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) ale.g)) {
            ha3 = new ha3(o54.L("id", bundle), 9);
        } else {
            z68.f(yke.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
            return null;
        }
        it3 = ha3;
        return new ab4(str, ra4, bundle, za4, (xa4) null, it3, 16);
    }
}
