package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: ko3  reason: default package */
public final class ko3 implements c43 {
    public static final ko3 a = new Object();

    public final ibf p(pf9 pf9) {
        int i;
        String str;
        if (!pf9.m()) {
            return new jo3(CollectionsKt.emptyList());
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
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
        if (i == 0) {
            return new jo3(CollectionsKt.emptyList());
        }
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
                if (ordinal2 == 0) {
                    str = null;
                } else if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (Intrinsics.areEqual((Object) str, (Object) "contacts")) {
                    T emptyList = CollectionsKt.emptyList();
                    try {
                        emptyList = a00.e(pf9);
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
                    objectRef.element = emptyList;
                } else {
                    Unit unit = Unit.INSTANCE;
                    try {
                        pf9.A();
                    } catch (Throwable th4) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = ytd.a.iterator();
                        while (it4.hasNext()) {
                            ((xm) it4.next()).a(th4);
                        }
                        xtd.a.getClass();
                        int ordinal4 = xtd.b.ordinal();
                        if (ordinal4 != 0) {
                            if (ordinal4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new jo3((List) objectRef.element);
    }
}
