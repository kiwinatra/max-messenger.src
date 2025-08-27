package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: gi  reason: default package */
public final class gi {
    public final long a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;

    public gi(long j, long j2, String str, long j3, String str2, String str3, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public static final gi a(pf9 pf9) {
        int i;
        gi giVar;
        String str;
        T t;
        T t2;
        T t3;
        T t4;
        pf9 pf92 = pf9;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        int i2 = 0;
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
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            giVar = null;
            if (i2 < i) {
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
                            case -295931082:
                                if (str.equals("updateTime")) {
                                    j = ryg.d0(pf92, 0);
                                    Unit unit3 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 3355:
                                if (str.equals("id")) {
                                    j2 = ryg.d0(pf92, 0);
                                    Unit unit4 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 96632902:
                                if (str.equals("emoji")) {
                                    t = ryg.g0(pf9);
                                    objectRef.element = t;
                                    Unit unit5 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 109327645:
                                if (str.equals("setId")) {
                                    j3 = ryg.d0(pf92, 0);
                                    Unit unit6 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 803933436:
                                if (str.equals("lottiePlayUrl")) {
                                    t2 = ryg.g0(pf9);
                                    objectRef3.element = t2;
                                    Unit unit7 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 1539122512:
                                if (str.equals("lottieUrl")) {
                                    t3 = ryg.g0(pf9);
                                    objectRef2.element = t3;
                                    Unit unit8 = Unit.INSTANCE;
                                    break;
                                }
                                break;
                            case 1638765110:
                                if (str.equals("iconUrl")) {
                                    t4 = ryg.g0(pf9);
                                    objectRef4.element = t4;
                                    Unit unit9 = Unit.INSTANCE;
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
                    Unit unit10 = Unit.INSTANCE;
                    Unit unit11 = Unit.INSTANCE;
                }
                i2++;
            } else {
                Unit unit12 = Unit.INSTANCE;
            }
        }
        long j4 = j2;
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (!(charSequence == null || charSequence.length() == 0)) {
            T t5 = objectRef.element;
            if (t5 != null) {
                giVar = new gi(j4, j, (String) t5, j3, (String) objectRef2.element, (String) objectRef3.element, (String) objectRef4.element);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return giVar;
    }
}
