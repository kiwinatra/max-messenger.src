package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: foa  reason: default package */
public final class foa {
    public static final hd0 a = new hd0();
    public static final id0 b = new Object();

    public static hk0 a(joa joa) {
        if (joa instanceof goa) {
            return a;
        }
        if (joa instanceof ioa) {
            return b;
        }
        if (Intrinsics.areEqual((Object) joa, (Object) hoa.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static qa7 b(String str, joa joa, int i) {
        if ((i & 2) != 0) {
            joa = goa.a;
        }
        Uri e = o54.e(str);
        if (e == null) {
            e = Uri.EMPTY;
        }
        ra7 d = ra7.d(e);
        d.g = oa7.b;
        d.l = a(joa);
        d.k = uub.o;
        return d.a();
    }
}
