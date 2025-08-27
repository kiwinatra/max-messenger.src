package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: pe5  reason: default package */
public final class pe5 implements c43 {
    public static final pe5 a = new Object();

    public final ibf p(pf9 pf9) {
        int i;
        String str;
        T t;
        long j;
        if (!pf9.m()) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        Long l = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th2) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th2);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
            }
            if (str != null) {
                Unit unit2 = Unit.INSTANCE;
                try {
                    if (Intrinsics.areEqual((Object) str, (Object) "botId")) {
                        j = ryg.d0(pf9, 0);
                        l = Long.valueOf(j);
                    } else if (Intrinsics.areEqual((Object) str, (Object) "startParams")) {
                        t = ryg.g0(pf9);
                        objectRef.element = t;
                    } else {
                        pf9.A();
                    }
                } catch (Throwable th3) {
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = ytd.a.iterator();
                    while (it3.hasNext()) {
                        ((xm) it3.next()).a(th3);
                    }
                    xtd.a.getClass();
                    int ordinal3 = xtd.b.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                }
                Unit unit3 = Unit.INSTANCE;
            }
        }
        Unit unit4 = Unit.INSTANCE;
        return new oe5((String) objectRef.element, l);
    }
}
