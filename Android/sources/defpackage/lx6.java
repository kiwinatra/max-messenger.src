package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* renamed from: lx6  reason: default package */
public final class lx6 implements Iterable, KMappedMarker {
    public final String[] a;

    public lx6(String[] strArr) {
        this.a = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        IntProgression step = RangesKt.step(RangesKt.downTo(strArr.length - 2, 0), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (!StringsKt__StringsJVMKt.equals(str, strArr[first], true)) {
                if (first != last) {
                    first += step2;
                }
            }
            return strArr[first + 1];
        }
        return null;
    }

    public final String d(int i) {
        return this.a[i * 2];
    }

    public final e4 e() {
        e4 e4Var = new e4(20);
        CollectionsKt__MutableCollectionsKt.addAll((ArrayList) e4Var.b, (T[]) this.a);
        return e4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lx6) {
            if (Arrays.equals(this.a, ((lx6) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i) {
        return this.a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(d(i), f(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String d = d(i);
            String f = f(i);
            sb.append(d);
            sb.append(": ");
            if (u0g.p(d)) {
                f = "██";
            }
            sb.append(f);
            sb.append("\n");
        }
        return sb.toString();
    }
}
