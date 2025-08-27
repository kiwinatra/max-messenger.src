package defpackage;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t75  reason: default package */
public final class t75 extends eqb {
    public final zsd l = zsd.p;
    public final Lazy m;

    public t75(int i) {
        super("one.me.webapp.domain.jsbridge.SuccessResponse.Status", (op6) null, i);
        this.m = LazyKt.lazy(new s75(i, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof usd)) {
            return false;
        }
        usd usd = (usd) obj;
        if (usd.getKind() != zsd.p) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) usd.a()) && Intrinsics.areEqual((Object) y64.e(this), (Object) y64.e(usd));
    }

    public final kne getKind() {
        return this.l;
    }

    public final usd h(int i) {
        return ((usd[]) this.m.getValue())[i];
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Iterator it = new c57(1, this).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            String str = (String) it.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(new c57(1, this), ", ", g63.l(new StringBuilder(), this.a, '('), ")", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }
}
