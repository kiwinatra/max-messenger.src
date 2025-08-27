package defpackage;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fbe  reason: default package */
public final class fbe implements Provider {
    public final Object a;

    public fbe(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbe) && Intrinsics.areEqual(this.a, ((fbe) obj).a);
    }

    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ')';
    }
}
