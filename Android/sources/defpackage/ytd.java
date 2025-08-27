package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ytd  reason: default package */
public abstract class ytd {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final long[] b(pf9 pf9) {
        int i;
        CopyOnWriteArraySet<xm> copyOnWriteArraySet = a;
        try {
            i = ryg.X(pf9);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            for (xm a2 : copyOnWriteArraySet) {
                a2.a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                return null;
            }
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ryg.d0(pf9, 0);
        }
        return jArr;
    }
}
