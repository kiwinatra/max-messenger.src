package defpackage;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: i1e  reason: default package */
public interface i1e extends lz7 {
    public static final x0e b0 = x0e.a;

    Integer a();

    ngf b();

    z0e c();

    ngf d();

    f1e e();

    boolean f(lz7 lz7) {
        return getItemId() == lz7.getItemId();
    }

    ngf getTitle();

    h1e getType() {
        return h1e.b;
    }

    int i() {
        return 0;
    }

    Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        j3h j3h = null;
        s1e s1e = lz7 instanceof s1e ? (s1e) lz7 : null;
        if (s1e != null) {
            j3h = new j3h(7);
            boolean z = false;
            boolean z2 = s() != s1e.b;
            BitSet bitSet = (BitSet) j3h.a;
            bitSet.set(0, z2);
            bitSet.set(1, !Intrinsics.areEqual((Object) getTitle(), (Object) s1e.c));
            bitSet.set(2, getType() != s1e.o);
            bitSet.set(3, !Intrinsics.areEqual((Object) b(), (Object) s1e.v));
            bitSet.set(4, !Intrinsics.areEqual((Object) a(), (Object) s1e.w));
            bitSet.set(5, !Intrinsics.areEqual((Object) e(), (Object) s1e.x));
            bitSet.set(6, !Intrinsics.areEqual((Object) c(), (Object) s1e.y));
            bitSet.set(7, !Intrinsics.areEqual((Object) d(), (Object) s1e.z));
            if (p() != s1e.X) {
                z = true;
            }
            bitSet.set(8, z);
        }
        return j3h;
    }

    int p() {
        return MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
    }

    int s();
}
