package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pv9  reason: default package */
public final class pv9 extends ibf {
    public final b89 c;

    public pv9(b89 b89) {
        this.c = b89;
    }

    public static final pv9 d(pf9 pf9) {
        String str;
        if (!pf9.m()) {
            return null;
        }
        int y0 = pf9.y0();
        b89 b89 = null;
        for (int i = 0; i < y0; i++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = ytd.a.iterator();
                while (it.hasNext()) {
                    ((xm) it.next()).a(th);
                }
                xtd.a.getClass();
                int ordinal = xtd.b.ordinal();
                if (ordinal == 0) {
                    str = null;
                } else if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th;
                }
            }
            if (str != null) {
                if (Intrinsics.areEqual((Object) str, (Object) "message")) {
                    b89 = z79.a(pf9);
                } else {
                    pf9.A();
                }
            }
        }
        return new pv9(b89);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv9) && Intrinsics.areEqual((Object) this.c, (Object) ((pv9) obj).c);
    }

    public final int hashCode() {
        b89 b89 = this.c;
        if (b89 == null) {
            return 0;
        }
        return b89.hashCode();
    }

    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
