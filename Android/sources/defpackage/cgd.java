package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import scout.exception.ElementCreationFailedException;
import scout.exception.MappingCreationFailedException;
import scout.exception.MissingCollectionElementsException;
import scout.exception.MissingMappingException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* renamed from: cgd  reason: default package */
public final class cgd {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final q4 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final int m;

    public cgd(String str, List list, Map map, Map map2, Map map3, Set set) {
        List list2;
        List list3;
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = set;
        this.g = hd8.e ? new wo4(this, 0) : new wo4(this, 1);
        if (list.isEmpty()) {
            list2 = CollectionsKt.emptyList();
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int lastIndex = CollectionsKt.getLastIndex(list); lastIndex >= 0; lastIndex--) {
                cgd cgd = (cgd) list.get(lastIndex);
                if (hashSet.add(cgd)) {
                    arrayList.add(cgd);
                }
                for (cgd cgd2 : cgd.h) {
                    if (hashSet.add(cgd2)) {
                        arrayList.add(cgd2);
                    }
                }
            }
            list2 = Collections.unmodifiableList(arrayList);
        }
        this.h = list2;
        List<cgd> list4 = this.b;
        if (list4.isEmpty()) {
            list3 = CollectionsKt.emptyList();
        } else {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (cgd cgd3 : list4) {
                for (cgd cgd4 : cgd3.i) {
                    if (hashSet2.add(cgd4)) {
                        arrayList2.add(cgd4);
                    }
                }
                if (hashSet2.add(cgd3)) {
                    arrayList2.add(cgd3);
                }
            }
            list3 = Collections.unmodifiableList(arrayList2);
        }
        this.i = list3;
        List list5 = this.h;
        this.j = list5;
        this.k = list3;
        this.l = list5;
        this.m = list5.size();
    }

    public static final void b(StringBuilder sb, cgd cgd, int i2) {
        sb.append(10);
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append("   ");
        }
        sb.append("⌞ " + cgd + " (object factories: " + cgd.c.size() + ", collection factories: " + cgd.d.size() + ", association factories: " + cgd.e.size() + ", allowed object overrides: " + cgd.f.size() + ')');
        for (cgd b2 : cgd.j) {
            b(sb, b2, i3);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTree of scopes:");
        b(sb, this, 0);
        return sb.toString();
    }

    public final Map c(Pair pair, boolean z) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.e.get(pair);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                arrayList.add((Pair) ((gi7) list.get(i2)).a(this.g));
                i2++;
            } catch (Exception e2) {
                throw new MappingCreationFailedException(pair, this, e2);
            }
        }
        for (int i3 = 0; i3 < this.m; i3++) {
            cgd cgd = (cgd) this.l.get(i3);
            List list2 = (List) cgd.e.get(pair);
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            int size2 = list2.size();
            int i4 = 0;
            while (i4 < size2) {
                try {
                    arrayList.add((Pair) ((gi7) list2.get(i4)).a(cgd.g));
                    i4++;
                } catch (Exception e3) {
                    throw new MappingCreationFailedException(pair, this, e3);
                }
            }
        }
        if ((!arrayList.isEmpty()) || !z) {
            return MapsKt.toMap(arrayList);
        }
        throw new MissingMappingException(pair, this);
    }

    public final ArrayList d(Class cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < this.m; i3++) {
            cgd cgd = (cgd) this.k.get(i3);
            List list = (List) cgd.d.get(cls);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                try {
                    arrayList.add(((gi7) list.get(i4)).a(cgd.g));
                    i4++;
                } catch (Exception e2) {
                    throw new ElementCreationFailedException(cls, this, e2);
                }
            }
        }
        List list2 = (List) this.d.get(cls);
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        int size2 = list2.size();
        while (i2 < size2) {
            try {
                arrayList.add(((gi7) list2.get(i2)).a(this.g));
                i2++;
            } catch (Exception e3) {
                throw new ElementCreationFailedException(cls, this, e3);
            }
        }
        if ((!arrayList.isEmpty()) || !z) {
            return arrayList;
        }
        throw new MissingCollectionElementsException(cls, this);
    }

    public final Object e(Class cls, boolean z) {
        gi7 gi7 = (gi7) this.c.get(cls);
        if (gi7 != null) {
            try {
                Object a2 = gi7.a(this.g);
                if (a2 != null || !z) {
                    return a2;
                }
                throw new ObjectNullabilityException(cls, this);
            } catch (Exception e2) {
                throw new ObjectCreationFailedException(cls, this, e2);
            }
        } else {
            int i2 = 0;
            while (i2 < this.m) {
                cgd cgd = (cgd) this.j.get(i2);
                gi7 gi72 = (gi7) cgd.c.get(cls);
                if (gi72 != null) {
                    try {
                        Object a3 = gi72.a(cgd.g);
                        if (a3 != null || !z) {
                            return a3;
                        }
                        throw new ObjectNullabilityException(cls, this);
                    } catch (Exception e3) {
                        throw new ObjectCreationFailedException(cls, this, e3);
                    }
                } else {
                    i2++;
                }
            }
            if (!z) {
                return null;
            }
            throw new MissingObjectFactoryException(cls, this);
        }
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Scope(name=\""), this.a, "\")");
    }
}
