package defpackage;

import androidx.fragment.app.b;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: v16  reason: default package */
public final class v16 extends hx3 {
    public Function0 h;
    public Function0 i;

    public v16(b bVar, Set set) {
        super(bVar);
        List createListBuilder = CollectionsKt.createListBuilder();
        if (set.contains(u16.a)) {
            createListBuilder.add(new nw3(new igf(qad.M2), Integer.valueOf(nad.g0), new t16(this, 0), 12));
        }
        if (set.contains(u16.b)) {
            igf igf = new igf(qad.K2);
            Integer valueOf = Integer.valueOf(nad.P1);
            rcf rcf = rcf.Z;
            createListBuilder.add(new nw3(igf, valueOf, rcf, rcf, new t16(this, 1)));
        }
        r6 r6Var = new r6(9, this);
        this.a.a(CollectionsKt.build(createListBuilder), r6Var);
    }
}
