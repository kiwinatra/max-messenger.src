package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: w7a  reason: default package */
public abstract class w7a {
    public static x7a a(pf9 pf9) {
        int i;
        String str;
        T t;
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
        List emptyList = CollectionsKt.emptyList();
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
                if (Intrinsics.areEqual((Object) str, (Object) "name")) {
                    try {
                        t = ryg.g0(pf9);
                    } catch (Throwable th3) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = ytd.a.iterator();
                        while (it3.hasNext()) {
                            ((xm) it3.next()).a(th3);
                        }
                        xtd.a.getClass();
                        int ordinal3 = xtd.b.ordinal();
                        if (ordinal3 == 0) {
                            t = null;
                        } else if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    if (t != null) {
                        objectRef.element = t;
                    }
                } else if (Intrinsics.areEqual((Object) str, (Object) "avatars")) {
                    ArrayList l0 = ryg.l0(pf9, new q0a(18));
                    emptyList = l0 != null ? CollectionsKt.filterNotNull(l0) : null;
                    if (emptyList == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
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
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence == null || charSequence.length() == 0 || emptyList.isEmpty()) {
            return null;
        }
        T t2 = objectRef.element;
        if (t2 != null) {
            return new x7a((String) t2, emptyList);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
