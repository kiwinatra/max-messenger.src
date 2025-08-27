package defpackage;

import android.text.Layout;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jf9  reason: default package */
public final class jf9 {
    public final a32 a;
    public final a89 b;
    public final hf9 c;
    public Lazy d;
    public final Lazy e;
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();

    public jf9(a32 a32, a89 a89, hf9 hf9, Lazy lazy) {
        this.a = a32;
        this.b = a89;
        this.c = hf9;
        this.d = lazy;
        this.e = lazy;
    }

    public final Layout a() {
        return (Layout) this.e.getValue();
    }

    public final void b(Layout layout) {
        this.d = LazyKt.lazy(new c28(9, layout));
        for (if9 if9 : this.f) {
            lf9 lf9 = (lf9) if9;
            lf9.getClass();
            lf9.post(new sx8(7, lf9, this));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf9)) {
            return false;
        }
        jf9 jf9 = (jf9) obj;
        if (a() != jf9.a()) {
            return false;
        }
        Long l = null;
        a32 a32 = this.a;
        Long valueOf = a32 != null ? Long.valueOf(a32.a) : null;
        a32 a322 = jf9.a;
        if (a322 != null) {
            l = Long.valueOf(a322.a);
        }
        return Intrinsics.areEqual((Object) valueOf, (Object) l) && this.b.a.b == jf9.b.a.b;
    }

    public final int hashCode() {
        a32 a32 = this.a;
        Long valueOf = a32 != null ? Long.valueOf(a32.a) : null;
        return a().hashCode() + wzf.i((valueOf != null ? valueOf.hashCode() : 0) * 31, 31, this.b.a.b);
    }
}
