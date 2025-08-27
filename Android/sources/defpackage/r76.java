package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* renamed from: r76  reason: default package */
public final /* synthetic */ class r76 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r76(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Set set = (Set) obj;
                return SequencesKt.toSet(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence((List) this.b), new rx2(19, (l86) this.c)), s76.a));
            case 1:
                Set set2 = (Set) obj;
                Iterator it = ((Set) ((zc4) this.b).b).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Set set3 = (Set) this.c;
                    if (!hasNext) {
                        return set3;
                    }
                    set3.add(new dkb(((Number) it.next()).longValue(), ckb.a));
                }
            default:
                List list = (List) obj;
                Iterable<boe> iterable = (List) this.b;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (boe j : iterable) {
                    arrayList.add(ute.j((ute) this.c, j));
                }
                return arrayList;
        }
    }
}
