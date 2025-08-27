package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m3c  reason: default package */
public abstract class m3c extends s3c {
    public final boolean f(lz7 lz7) {
        if (Intrinsics.areEqual((Object) this, (Object) i3c.a)) {
            return lz7 instanceof i3c;
        }
        if (this instanceof j3c) {
            return lz7 instanceof j3c;
        }
        if (this instanceof l3c) {
            return (lz7 instanceof l3c) && ((l3c) this).a.a == ((l3c) lz7).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean r(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (Intrinsics.areEqual((Object) this, (Object) i3c.a)) {
            return lz7 instanceof i3c;
        }
        if (this instanceof j3c) {
            return lz7 instanceof j3c;
        }
        if (this instanceof l3c) {
            return (lz7 instanceof l3c) && Intrinsics.areEqual((Object) ((l3c) this).a, (Object) ((l3c) lz7).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
