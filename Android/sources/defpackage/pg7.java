package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pg7  reason: default package */
public final class pg7 extends v5a {
    public final f0d b;

    public pg7(f0d f0d) {
        super(Unit.INSTANCE);
        this.b = f0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg7) && Intrinsics.areEqual((Object) this.b, (Object) ((pg7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}
