package defpackage;

import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;

/* renamed from: grd  reason: default package */
public final /* synthetic */ class grd implements UnaryOperator {
    public final /* synthetic */ long a;

    public /* synthetic */ grd(long j) {
        this.a = j;
    }

    public final Object apply(Object obj) {
        Set mutableSet = CollectionsKt.toMutableSet((Set) obj);
        mutableSet.removeIf(new rz5(3, new hg2(this.a, 9)));
        return mutableSet;
    }
}
