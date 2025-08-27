package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: rld  reason: default package */
public final /* synthetic */ class rld implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ rld(List list, Collection collection, Collection collection2, int i) {
        this.a = i;
        this.b = list;
        this.c = collection;
        this.d = collection2;
    }

    public final boolean test(Object obj) {
        boolean contains;
        switch (this.a) {
            case 0:
                ald ald = (ald) obj;
                a32 a32 = ald.o;
                if (a32 != null) {
                    contains = ((Set) this.c).contains(Long.valueOf(a32.a));
                } else {
                    vk3 vk3 = ald.v;
                    if (vk3 == null) {
                        return true;
                    }
                    if (cjf.d(this.b, new f1a(vk3.r(), 2))) {
                        return false;
                    }
                    contains = ((Set) this.d).contains(Long.valueOf(vk3.r()));
                }
                return true ^ contains;
            default:
                bac bac = (bac) obj;
                b32 b32 = bac.a;
                if (b32 != null) {
                    return ((List) this.c).contains(Long.valueOf(b32.a));
                }
                cs3 cs3 = bac.c;
                if (cs3 == null) {
                    return false;
                }
                fo3 fo3 = cs3.a;
                if (cjf.d(this.b, new f1a(fo3.a, 2))) {
                    return true;
                }
                return ((List) this.d).contains(Long.valueOf(fo3.a));
        }
    }
}
