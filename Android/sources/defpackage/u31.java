package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;

/* renamed from: u31  reason: default package */
public final class u31 implements oa4 {
    public static final u31 a = new Object();
    public static final v31 b = v31.b;

    public final wa4 a() {
        return b;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, ya4] */
    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        ra4 ra42 = ra4;
        Bundle bundle2 = bundle;
        String str2 = null;
        if (!b.a.contains(ra42)) {
            return null;
        }
        v31.b.getClass();
        boolean z = true;
        if (Intrinsics.areEqual((Object) ra42, (Object) v31.d)) {
            String I = f6e.I(o54.N("link", bundle2));
            boolean S = iq.S(o54.E("video_enabled", bundle2));
            boolean S2 = iq.S(o54.E("microphone_enabled", bundle2));
            Boolean E = o54.E("front_camera_enabled", bundle2);
            if (E != null) {
                z = E.booleanValue();
            }
            boolean z2 = z;
            boolean S3 = iq.S(o54.E("is_new", bundle2));
            n31 n31 = n31.b;
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(n31, 0), new t31(n31, 1)), new o31(I, S, S2, z2, S3), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.c)) {
            long L = o54.L("opponent_id", bundle2);
            boolean S4 = iq.S(o54.E("video_enabled", bundle2));
            Boolean E2 = o54.E("microphone_enabled", bundle2);
            if (E2 != null) {
                z = E2.booleanValue();
            }
            boolean z3 = z;
            n31 n312 = n31.b;
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(n312, 0), new t31(n312, 1)), new p31(L, S4, z3, 0), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.e)) {
            long L2 = o54.L("chat_id", bundle2);
            boolean S5 = iq.S(o54.E("video_enabled", bundle2));
            boolean S6 = iq.S(o54.E("microphone_enabled", bundle2));
            n31 n313 = n31.b;
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(n313, 0), new t31(n313, 1)), new p31(L2, S5, S6, 1), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.g)) {
            String string = bundle2.getString("place");
            if (true ^ (string == null || StringsKt.isBlank(string))) {
                str2 = string;
            }
            if (str2 == null) {
                str2 = "OTHER";
            }
            n31 valueOf = n31.valueOf(str2);
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(valueOf, 0), new t31(valueOf, 1)), new Object(), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.j)) {
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new v11(2), new v11(3)), new i(3), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.f)) {
            String N = o54.N("call_name", bundle2);
            String string2 = bundle2.getString("call_avatar");
            long L3 = o54.L("chat_id", bundle2);
            boolean I2 = o54.I("video_enabled", bundle2);
            n31 n314 = n31.c;
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(n314, 0), new t31(n314, 1)), new r31(L3, N, string2, I2), 8);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.h)) {
            return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new m31(f6e.I(o54.N("link", bundle2)), 0), 24);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.i)) {
            return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new m31(o54.N(Widget.ARG_SCOPE_ID, bundle2), 1), 24);
        } else if (Intrinsics.areEqual((Object) ra42, (Object) v31.k)) {
            n31 n315 = n31.c;
            return new ab4(str, ra4, bundle, (za4) null, new xa4(new t31(n315, 0), new t31(n315, 1)), new s31(bundle2), 8);
        } else {
            throw new IllegalStateException(tr1.i("invalid route ", ra42));
        }
    }
}
