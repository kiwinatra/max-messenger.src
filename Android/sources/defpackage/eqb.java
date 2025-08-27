package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: eqb  reason: default package */
public class eqb implements usd, iy0 {
    public final String a;
    public final op6 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;

    public eqb(String str, op6 op6, int i2) {
        this.a = str;
        this.b = op6;
        this.c = i2;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new dqb(this, 0));
        this.j = LazyKt.lazy(lazyThreadSafetyMode, new dqb(this, 1));
        this.k = LazyKt.lazy(lazyThreadSafetyMode, new dqb(this, 2));
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.h.keySet();
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof eqb) {
            usd usd = (usd) obj;
            if (Intrinsics.areEqual((Object) this.a, (Object) usd.a()) && Arrays.equals((usd[]) this.j.getValue(), (usd[]) ((eqb) obj).j.getValue()) && (i2 = this.c) == usd.e()) {
                int i3 = 0;
                while (i3 < i2) {
                    if (Intrinsics.areEqual((Object) h(i3).a(), (Object) usd.h(i3).a()) && Intrinsics.areEqual((Object) h(i3).getKind(), (Object) usd.h(i3).getKind())) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f(int i2) {
        return this.e[i2];
    }

    public final List g(int i2) {
        List list = this.f[i2];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public kne getKind() {
        return hye.o;
    }

    public usd h(int i2) {
        return ((aq7[]) this.i.getValue())[i2].d();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final boolean i(int i2) {
        return this.g[i2];
    }

    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        int i2 = this.d + 1;
        this.d = i2;
        String[] strArr = this.e;
        strArr[i2] = str;
        this.g[i2] = z;
        this.f[i2] = null;
        if (i2 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(strArr[i3], Integer.valueOf(i3));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", g63.l(new StringBuilder(), this.a, '('), ")", 0, (CharSequence) null, new jkb(4, (Object) this), 24, (Object) null);
    }
}
