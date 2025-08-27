package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: wsd  reason: default package */
public final class wsd implements usd, iy0 {
    public final String a;
    public final kne b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final usd[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final usd[] k;
    public final Lazy l;

    public wsd(String str, kne kne, int i2, List list, hr6 hr6) {
        this.a = str;
        this.b = kne;
        this.c = i2;
        this.d = (List) hr6.a;
        ArrayList arrayList = (ArrayList) hr6.b;
        this.e = CollectionsKt.toHashSet(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = y64.o((ArrayList) hr6.c);
        this.h = (List[]) ((ArrayList) hr6.o).toArray(new List[0]);
        this.i = CollectionsKt___CollectionsKt.toBooleanArray((ArrayList) hr6.v);
        Iterable<IndexedValue> withIndex = ArraysKt.withIndex((T[]) strArr);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
        for (IndexedValue indexedValue : withIndex) {
            arrayList2.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.j = MapsKt.toMap(arrayList2);
        this.k = y64.o(list);
        this.l = LazyKt.lazy(new ifb(28, this));
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.e;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wsd) {
            usd usd = (usd) obj;
            if (Intrinsics.areEqual((Object) a(), (Object) usd.a()) && Arrays.equals(this.k, ((wsd) obj).k) && e() == usd.e()) {
                int e2 = e();
                int i2 = 0;
                while (i2 < e2) {
                    if (Intrinsics.areEqual((Object) h(i2).a(), (Object) usd.h(i2).a()) && Intrinsics.areEqual((Object) h(i2).getKind(), (Object) usd.h(i2).getKind())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f(int i2) {
        return this.f[i2];
    }

    public final List g(int i2) {
        return this.h[i2];
    }

    public final List getAnnotations() {
        return this.d;
    }

    public final kne getKind() {
        return this.b;
    }

    public final usd h(int i2) {
        return this.g[i2];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    public final boolean i(int i2) {
        return this.i[i2];
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", g63.l(new StringBuilder(), this.a, '('), ")", 0, (CharSequence) null, new jkb(17, (Object) this), 24, (Object) null);
    }
}
