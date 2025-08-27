package defpackage;

import java.util.Collection;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fva  reason: default package */
public final class fva {
    public final Collection a;
    public final Lazy b;
    public final Function0 c;
    public final Function0 d;

    public fva(Collection collection, Lazy lazy, us2 us2, us2 us22) {
        this.a = collection;
        this.b = lazy;
        this.c = us2;
        this.d = us22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fva = (fva) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) fva.a) && Intrinsics.areEqual((Object) this.b, (Object) fva.b) && Intrinsics.areEqual((Object) this.c, (Object) fva.c) && Intrinsics.areEqual((Object) this.d, (Object) fva.d);
    }

    public final int hashCode() {
        int e = g63.e(g63.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true), 31, false);
        return this.d.hashCode() + ((this.c.hashCode() + e) * 31);
    }

    public final String toString() {
        return "Config(targets=" + this.a + ", fileSystem=" + this.b + ", isBuildObfuscated=true, isBuildDebugOrBeta=false, debugModeProvider=" + this.c + ", dispatcherProvider=" + this.d + ")";
    }
}
