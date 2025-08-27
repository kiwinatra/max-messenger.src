package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* renamed from: vw9  reason: default package */
public final class vw9 {
    public final boolean a;
    public final Set b;
    public final List c;

    public vw9(boolean z, Set set, List list) {
        this.a = z;
        this.b = set;
        this.c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw9(boolean z, int i) {
        this((i & 1) != 0 ? false : z, SetsKt.emptySet(), CollectionsKt.emptyList());
    }
}
