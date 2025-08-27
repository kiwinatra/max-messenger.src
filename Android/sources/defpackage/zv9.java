package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: zv9  reason: default package */
public final class zv9 extends ibf {
    public final ud9 c;
    public final String o;

    public zv9(ud9 ud9, String str) {
        this.c = ud9;
        this.o = str;
    }

    public static final zv9 d(pf9 pf9) {
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
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ud9 ud9 = null;
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
                if (Intrinsics.areEqual((Object) str, (Object) "reactionInfo")) {
                    ud9 = td9.a(pf9);
                } else if (Intrinsics.areEqual((Object) str, (Object) "error")) {
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
                    objectRef.element = t;
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
        return new zv9(ud9, (String) objectRef.element);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv9)) {
            return false;
        }
        zv9 zv9 = (zv9) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) zv9.c) && Intrinsics.areEqual((Object) this.o, (Object) zv9.o);
    }

    public final int hashCode() {
        int i = 0;
        ud9 ud9 = this.c;
        int hashCode = (ud9 == null ? 0 : ud9.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(reactionInfo=" + this.c + ", error=" + this.o + ")";
    }
}
