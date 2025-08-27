package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: q56  reason: default package */
public abstract class q56 {
    public static r56 a(pf9 pf9) {
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        T t;
        T t2;
        T t3;
        T t4;
        T t5;
        long j;
        T t6;
        pf9 pf92 = pf9;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
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
        Unit unit = Unit.INSTANCE;
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th3) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th3);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                Unit unit2 = Unit.INSTANCE;
                try {
                    switch (str.hashCode()) {
                        case -1724546052:
                            if (str.equals("description")) {
                                t = ryg.g0(pf9);
                                objectRef3.element = t;
                                Unit unit3 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case -1587556021:
                            if (str.equals("startParam")) {
                                t2 = ryg.g0(pf9);
                                objectRef7.element = t2;
                                Unit unit4 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case -1332194002:
                            if (str.equals("background")) {
                                t3 = ryg.g0(pf9);
                                objectRef2.element = t3;
                                Unit unit5 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 3355:
                            if (str.equals("id")) {
                                j2 = ryg.d0(pf92, 0);
                                Unit unit6 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 116079:
                            if (str.equals("url")) {
                                t4 = ryg.g0(pf9);
                                objectRef5.element = t4;
                                Unit unit7 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                t5 = ryg.g0(pf9);
                                objectRef.element = t5;
                                Unit unit8 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 93028124:
                            if (str.equals("appId")) {
                                j = ryg.d0(pf92, 0);
                                T valueOf = Long.valueOf(j);
                                if (j == 0) {
                                    valueOf = null;
                                }
                                objectRef4.element = valueOf;
                                Unit unit9 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 1638765110:
                            if (str.equals("iconUrl")) {
                                t6 = ryg.g0(pf9);
                                objectRef6.element = t6;
                                Unit unit10 = Unit.INSTANCE;
                                break;
                            }
                            break;
                    }
                    pf9.A();
                } catch (Throwable th4) {
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = ytd.a.iterator();
                    while (it3.hasNext()) {
                        ((xm) it3.next()).a(th4);
                    }
                    xtd.a.getClass();
                    int ordinal3 = xtd.b.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
                Unit unit11 = Unit.INSTANCE;
                Unit unit12 = Unit.INSTANCE;
            }
        }
        Unit unit13 = Unit.INSTANCE;
        long j3 = j2;
        if (j3 == 0 || (charSequence = (CharSequence) objectRef.element) == null || charSequence.length() == 0 || (charSequence2 = (CharSequence) objectRef2.element) == null || charSequence2.length() == 0) {
            return null;
        }
        T t7 = objectRef.element;
        if (t7 != null) {
            String str2 = (String) t7;
            T t8 = objectRef2.element;
            if (t8 != null) {
                return new r56(j3, str2, (String) t8, (String) objectRef3.element, (Long) objectRef4.element, (String) objectRef7.element, (String) objectRef5.element, (String) objectRef6.element);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
