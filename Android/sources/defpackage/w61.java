package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w61  reason: default package */
public final class w61 implements oa4 {
    public static final w61 a = new Object();
    public static final x61 b = x61.b;

    public final wa4 a() {
        return b;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        i iVar;
        if (!b.a.contains(ra4)) {
            return null;
        }
        x61.b.getClass();
        if (Intrinsics.areEqual((Object) ra4, (Object) x61.c)) {
            iVar = new i(4);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) x61.d)) {
            String string = bundle.getString("call_link");
            String string2 = bundle.getString("call_title");
            Long F = o54.F("call_chat_id", bundle);
            Boolean E = o54.E("is_link_call", bundle);
            iVar = new v61(F, string, string2, E != null ? E.booleanValue() : false);
        } else {
            throw new IllegalStateException(tr1.i("invalid route ", ra4));
        }
        return new ab4(str, ra4, bundle, (za4) null, (xa4) null, iVar, 24);
    }
}
