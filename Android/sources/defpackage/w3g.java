package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: w3g  reason: default package */
public final class w3g extends ibf {
    public ArrayList c;

    public w3g(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void c(pf9 pf9, String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "members")) {
            int X = ryg.X(pf9);
            this.c = new ArrayList();
            IntRange until = RangesKt.until(0, X);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(bj2.a(pf9));
            }
            ArrayList arrayList2 = this.c;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            arrayList2.addAll(arrayList);
            return;
        }
        pf9.A();
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return wj6.k("{members : [", CollectionsKt___CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new duc(27), 31, (Object) null), "]}");
    }
}
