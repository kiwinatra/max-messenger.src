package defpackage;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z04  reason: default package */
public final class z04 extends AbstractCoroutineContextElement {
    public static final y04 b = new Object();
    public final String a = "AnimojiVerifier";

    public z04() {
        super(b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z04) && Intrinsics.areEqual((Object) this.a, (Object) ((z04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.l(new StringBuilder("CoroutineName("), this.a, ')');
    }
}
