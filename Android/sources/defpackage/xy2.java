package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xy2  reason: default package */
public final class xy2 extends ij0 {
    public final Collection b;
    public final boolean c;
    public final boolean o;
    public final bl4 v;
    public final hj0 w;
    public final boolean x;
    public final Set y;

    public xy2(List list, boolean z) {
        this(list, z, false, (bl4) null, (zub) null, 124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy2)) {
            return false;
        }
        xy2 xy2 = (xy2) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) xy2.b) && this.c == xy2.c && this.o == xy2.o && this.v == xy2.v && Intrinsics.areEqual((Object) this.w, (Object) xy2.w) && this.x == xy2.x && Intrinsics.areEqual((Object) this.y, (Object) xy2.y);
    }

    public final int hashCode() {
        int hashCode = (this.v.hashCode() + g63.e(g63.e(this.b.hashCode() * 31, 31, this.c), 31, this.o)) * 31;
        hj0 hj0 = this.w;
        return this.y.hashCode() + g63.e((hashCode + (hj0 == null ? 0 : hj0.hashCode())) * 31, 31, this.x);
    }

    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.o + ", itemType=" + this.v + ", error=" + this.w + ", replaceDuplicate=" + this.x + ", chatServerIds=" + this.y + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy2(Collection collection, boolean z, boolean z2, bl4 bl4, zub zub, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? bl4.REGULAR : bl4, (i & 16) != 0 ? null : zub, false, SetsKt.emptySet());
    }

    public xy2(Collection collection, boolean z, boolean z2, bl4 bl4, hj0 hj0, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.o = z2;
        this.v = bl4;
        this.w = hj0;
        this.x = z3;
        this.y = set;
    }
}
