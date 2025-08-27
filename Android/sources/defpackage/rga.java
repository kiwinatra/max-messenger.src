package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rga  reason: default package */
public final class rga implements aq7 {
    public final aq7 a = bye.a;
    public final vsd b = new vsd(bye.b);

    public final Object a(u9 u9Var) {
        if (u9Var.q()) {
            return u9Var.t(this.a);
        }
        return null;
    }

    public final void b(cy3 cy3, Object obj) {
        if (obj != null) {
            cy3.getClass();
            cy3.i(this.a, obj);
            return;
        }
        cy3.e();
    }

    public final usd d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rga.class == obj.getClass() && Intrinsics.areEqual((Object) this.a, (Object) ((rga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
