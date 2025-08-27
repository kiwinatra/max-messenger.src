package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: nuc  reason: default package */
public final class nuc {
    public final long a;
    public final muc b;
    public final String c;

    public nuc(long j, muc muc, String str) {
        this.a = j;
        this.b = muc;
        this.c = str;
    }

    public static final nuc a(pf9 pf9) {
        int i;
        String str;
        T t;
        T t2;
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            Throwable th2 = th;
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th2);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i != 0) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = muc.UNKNOWN;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    str = ryg.g0(pf9);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it2 = ytd.a.iterator();
                    while (it2.hasNext()) {
                        ((xm) it2.next()).a(th4);
                    }
                    xtd.a.getClass();
                    int ordinal2 = xtd.b.ordinal();
                    if (ordinal2 == 0) {
                        str = null;
                    } else if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        throw th4;
                    }
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 3575610) {
                            if (hashCode == 111972721 && str.equals("value")) {
                                try {
                                    t2 = ryg.g0(pf9);
                                } catch (Throwable th5) {
                                    Throwable th6 = th5;
                                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                    Iterator it3 = ytd.a.iterator();
                                    while (it3.hasNext()) {
                                        ((xm) it3.next()).a(th6);
                                    }
                                    xtd.a.getClass();
                                    int ordinal3 = xtd.b.ordinal();
                                    if (ordinal3 == 0) {
                                        t2 = null;
                                    } else if (ordinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    } else {
                                        throw th6;
                                    }
                                }
                                objectRef2.element = t2;
                            }
                        } else if (str.equals("type")) {
                            T t3 = muc.UNKNOWN;
                            try {
                                pf6 pf6 = muc.b;
                                String g0 = ryg.g0(pf9);
                                pf6.getClass();
                                Iterator it4 = muc.x.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it4.next();
                                    if (Intrinsics.areEqual((Object) ((muc) t).a, (Object) g0)) {
                                        break;
                                    }
                                }
                                T t4 = (muc) t;
                                t3 = t4 == null ? muc.UNKNOWN : t4;
                            } catch (Throwable th7) {
                                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it5 = ytd.a.iterator();
                                while (it5.hasNext()) {
                                    ((xm) it5.next()).a(th7);
                                }
                                xtd.a.getClass();
                                int ordinal4 = xtd.b.ordinal();
                                if (ordinal4 != 0) {
                                    if (ordinal4 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th7;
                                }
                            }
                            objectRef.element = t3;
                        }
                    } else if (str.equals("id")) {
                        try {
                            j = ryg.d0(pf9, 0);
                        } catch (Throwable th8) {
                            Throwable th9 = th8;
                            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                            Iterator it6 = ytd.a.iterator();
                            while (it6.hasNext()) {
                                ((xm) it6.next()).a(th9);
                            }
                            xtd.a.getClass();
                            int ordinal5 = xtd.b.ordinal();
                            if (ordinal5 == 0) {
                                j = 0;
                            } else if (ordinal5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th9;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        pf9.A();
                    } catch (Throwable th10) {
                        Throwable th11 = th10;
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                        Iterator it7 = ytd.a.iterator();
                        while (it7.hasNext()) {
                            ((xm) it7.next()).a(th11);
                        }
                        xtd.a.getClass();
                        int ordinal6 = xtd.b.ordinal();
                        if (ordinal6 != 0) {
                            if (ordinal6 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th11;
                        }
                    }
                }
                pf9 pf92 = pf9;
            }
            if (!(j == 0 && objectRef.element == muc.UNKNOWN && objectRef2.element == null)) {
                return new nuc(j, (muc) objectRef.element, (String) objectRef2.element);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuc)) {
            return false;
        }
        nuc nuc = (nuc) obj;
        return this.a == nuc.a && this.b == nuc.b && Intrinsics.areEqual((Object) this.c, (Object) nuc.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        return wj6.n(sb, this.c, ")");
    }
}
