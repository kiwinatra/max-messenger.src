package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: nl1  reason: default package */
public abstract class nl1 implements c43 {
    public static ml1 a(pf9 pf9) {
        int i;
        String str;
        pf9 pf92 = pf9;
        long nanoTime = System.nanoTime();
        if (!pf9.m()) {
            return new ml1();
        }
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
        if (i == 0) {
            return new ml1();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long j = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            T t = null;
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
                if (hashCode != 110541305) {
                    if (hashCode != 554416495) {
                        if (hashCode == 698680425 && str.equals("token_refresh_ts")) {
                            try {
                                j2 = ryg.d0(pf92, 0);
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
                                    j2 = 0;
                                } else if (ordinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                        }
                    } else if (str.equals("token_lifetime_ts")) {
                        try {
                            j = ryg.d0(pf92, 0);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = ytd.a.iterator();
                            while (it4.hasNext()) {
                                ((xm) it4.next()).a(th8);
                            }
                            xtd.a.getClass();
                            int ordinal4 = xtd.b.ordinal();
                            if (ordinal4 == 0) {
                                j = 0;
                            } else if (ordinal4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th8;
                            }
                        }
                    }
                } else if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    try {
                        t = ryg.g0(pf9);
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                        Iterator it5 = ytd.a.iterator();
                        while (it5.hasNext()) {
                            ((xm) it5.next()).a(th10);
                        }
                        xtd.a.getClass();
                        int ordinal5 = xtd.b.ordinal();
                        if (ordinal5 != 0) {
                            if (ordinal5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th10;
                        }
                    }
                    objectRef.element = t;
                }
                Unit unit = Unit.INSTANCE;
                try {
                    pf9.A();
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it6 = ytd.a.iterator();
                    while (it6.hasNext()) {
                        ((xm) it6.next()).a(th12);
                    }
                    xtd.a.getClass();
                    int ordinal6 = xtd.b.ordinal();
                    if (ordinal6 != 0) {
                        if (ordinal6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                }
            }
        }
        String str2 = (String) objectRef.element;
        if (str2 == null) {
            str2 = "";
        }
        return new ml1(j, j2, nanoTime, str2);
    }
}
