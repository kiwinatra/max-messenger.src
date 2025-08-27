package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nw3  reason: default package */
public final class nw3 {
    public final ngf a;
    public final Integer b;
    public final rcf c;
    public final rcf d;
    public final Function0 e;

    public nw3(ngf ngf, Integer num, rcf rcf, rcf rcf2, Function0 function0) {
        this.a = ngf;
        this.b = num;
        this.c = rcf;
        this.d = rcf2;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw3)) {
            return false;
        }
        nw3 nw3 = (nw3) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nw3.a) && Intrinsics.areEqual((Object) this.b, (Object) nw3.b) && this.c == nw3.c && this.d == nw3.d && Intrinsics.areEqual((Object) this.e, (Object) nw3.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.c.hashCode();
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContextMenuAction(title=" + this.a + ", icon=" + this.b + ", iconColor=" + this.c + ", titleColor=" + this.d + ", clickAction=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw3(igf igf, Integer num, Function0 function0, int i) {
        this(igf, (i & 2) != 0 ? null : num, rcf.X, rcf.B0, function0);
    }
}
