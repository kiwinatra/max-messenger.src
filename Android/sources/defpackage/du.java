package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;

/* renamed from: du  reason: default package */
public final class du extends ibf {
    public List c;
    public List o;
    public List v;
    public List w;

    public du(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.v == null) {
            this.v = Collections.emptyList();
        }
        if (this.w == null) {
            this.w = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r0v76, types: [java.lang.Object, wv9] */
    public final void c(pf9 pf9, String str) {
        int i;
        mk mkVar;
        String str2;
        T t;
        T t2;
        T t3;
        pf9 pf92 = pf9;
        String str3 = str;
        int i2 = 1;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -794795562:
                if (str3.equals("animojis")) {
                    c2 = 0;
                    break;
                }
                break;
            case 399262766:
                if (str3.equals("animojiSets")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1531715286:
                if (str3.equals("stickers")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1596679982:
                if (str3.equals("stickerSets")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                int X = ryg.X(pf9);
                this.v = new ArrayList(X);
                for (int i3 = 0; i3 < X; i3++) {
                    this.v.add(gi.a(pf9));
                }
                return;
            case 1:
                int X2 = ryg.X(pf9);
                this.w = new ArrayList(X2);
                int i4 = 0;
                while (i4 < X2) {
                    List list = this.w;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    objectRef4.element = CollectionsKt.emptyList();
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
                        } else if (ordinal != i2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i5 = X2;
                    int i6 = 0;
                    long j = 0;
                    long j2 = 0;
                    while (true) {
                        mkVar = null;
                        if (i6 < i) {
                            try {
                                str2 = ryg.g0(pf9);
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
                            if (str2 != null) {
                                Unit unit2 = Unit.INSTANCE;
                                try {
                                    switch (str2.hashCode()) {
                                        case -295931082:
                                            if (str2.equals("updateTime")) {
                                                j2 = ryg.d0(pf92, 0);
                                                Unit unit3 = Unit.INSTANCE;
                                                break;
                                            }
                                            break;
                                        case 3355:
                                            if (str2.equals("id")) {
                                                j = ryg.d0(pf92, 0);
                                                Unit unit4 = Unit.INSTANCE;
                                                break;
                                            }
                                            break;
                                        case 3373707:
                                            if (str2.equals("name")) {
                                                t = ryg.g0(pf9);
                                                objectRef.element = t;
                                                Unit unit5 = Unit.INSTANCE;
                                                break;
                                            }
                                            break;
                                        case 660078807:
                                            if (str2.equals("iconLottieUrl")) {
                                                t2 = ryg.g0(pf9);
                                                objectRef3.element = t2;
                                                Unit unit6 = Unit.INSTANCE;
                                                break;
                                            }
                                            break;
                                        case 705606459:
                                            if (str2.equals("animojiIds")) {
                                                T emptyList = CollectionsKt.emptyList();
                                                T l0 = ryg.l0(pf92, new Object());
                                                if (l0 == null) {
                                                    l0 = CollectionsKt.emptyList();
                                                }
                                                emptyList = l0;
                                                objectRef4.element = emptyList;
                                                Unit unit7 = Unit.INSTANCE;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1638765110:
                                            if (str2.equals("iconUrl")) {
                                                t3 = ryg.g0(pf9);
                                                objectRef2.element = t3;
                                                Unit unit8 = Unit.INSTANCE;
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
                                Unit unit9 = Unit.INSTANCE;
                                Unit unit10 = Unit.INSTANCE;
                                i2 = 1;
                            }
                            i6 += i2;
                        } else {
                            Unit unit11 = Unit.INSTANCE;
                        }
                    }
                    long j3 = j;
                    long j4 = j2;
                    CharSequence charSequence = objectRef.element;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        String str4 = objectRef.element;
                        if (str4 != null) {
                            String str5 = str4;
                            String str6 = objectRef2.element;
                            if (str6 == null) {
                                str6 = "";
                            }
                            mkVar = new mk(j3, str5, str6, objectRef3.element, j4, objectRef4.element);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    list.add(mkVar);
                    i2 = 1;
                    i4++;
                    X2 = i5;
                }
                return;
            case 2:
                int X3 = ryg.X(pf9);
                this.c = new ArrayList(X3);
                for (int i7 = 0; i7 < X3; i7++) {
                    this.c.add(coe.a(pf9));
                }
                return;
            case 3:
                int X4 = ryg.X(pf9);
                this.o = new ArrayList(X4);
                for (int i8 = 0; i8 < X4; i8++) {
                    this.o.add(cqe.a(pf9));
                }
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int o3 = kv0.o(this.o);
        int o4 = kv0.o(this.v);
        int o5 = kv0.o(this.w);
        StringBuilder n = a81.n("{stickers=", o2, "stickerSets=", o3, "animojis=");
        n.append(o4);
        n.append("animojiSets=");
        n.append(o5);
        n.append("}");
        return n.toString();
    }
}
