package defpackage;

import android.widget.FrameLayout;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* renamed from: n61  reason: default package */
public final class n61 extends kbe {
    public final f61 D0;

    public n61(FrameLayout frameLayout) {
        super(frameLayout);
        this.D0 = (f61) frameLayout.findViewById(kgc.call_opponents);
    }

    public final void M(lz7 lz7) {
        this.D0.setOpponents((y4b) lz7);
    }

    /* renamed from: P */
    public final void N(y4b y4b, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        Collection collection = list;
        f61 f61 = this.D0;
        if (collection == null || collection.isEmpty()) {
            f61.setOpponents(y4b);
            return;
        }
        for (w4b w4b : SequencesKt.filter(SequencesKt.flatMapIterable(CollectionsKt.asSequence(list), new h9(18)), m61.b)) {
            if (w4b instanceof w4b) {
                f61.setOpponents(w4b.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
