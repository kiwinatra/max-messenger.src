package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: rq0  reason: default package */
public final class rq0 implements c43 {
    public static final rq0 a = new Object();

    /* JADX WARNING: type inference failed for: r8v14, types: [java.lang.Object, wv9] */
    public final ibf p(pf9 pf9) {
        int i;
        String str;
        T t;
        if (!pf9.m()) {
            return null;
        }
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
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = CollectionsKt.emptyList();
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
                if (Intrinsics.areEqual((Object) str, (Object) "commands")) {
                    T emptyList = CollectionsKt.emptyList();
                    try {
                        emptyList = ryg.l0(pf9, new Object());
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
                    objectRef2.element = emptyList;
                } else if (Intrinsics.areEqual((Object) str, (Object) "contact")) {
                    try {
                        t = fo3.e(pf9);
                    } catch (Throwable th4) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = ytd.a.iterator();
                        while (it4.hasNext()) {
                            ((xm) it4.next()).a(th4);
                        }
                        xtd.a.getClass();
                        int ordinal4 = xtd.b.ordinal();
                        if (ordinal4 == 0) {
                            t = null;
                        } else if (ordinal4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th4;
                        }
                    }
                    objectRef.element = t;
                } else {
                    Unit unit = Unit.INSTANCE;
                    try {
                        pf9.A();
                    } catch (Throwable th5) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = ytd.a.iterator();
                        while (it5.hasNext()) {
                            ((xm) it5.next()).a(th5);
                        }
                        xtd.a.getClass();
                        int ordinal5 = xtd.b.ordinal();
                        if (ordinal5 != 0) {
                            if (ordinal5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new qq0(objectRef2.element, objectRef.element);
    }
}
