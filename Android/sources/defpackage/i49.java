package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: i49  reason: default package */
public final class i49 extends xag {
    public final etc X;
    public final Function1 b;
    public final gh4 c;
    public final Function0 o;
    public final s85 v;
    public final s85 w;
    public final xme x;
    public final etc y;
    public final xme z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i49(Function1 function1, z9 z9Var, int i) {
        this(function1, (i & 2) != 0 ? (gh4) a49.a.getAccessor().g(gh4.class) : z9Var, (Function0) new h49(0));
    }

    public final void j() {
        this.x.setValue((Object) null);
    }

    public final boolean k() {
        return this.y.a.getValue() != null;
    }

    public final void l(Collection collection) {
        xag.h(this.w, new x39(collection));
    }

    public final void m(long j, boolean z2) {
        xme xme;
        Object value;
        Set set;
        if (!k()) {
            xag.h(this.v, new c49(j));
        } else if (z2) {
            do {
                xme = this.x;
                value = xme.getValue();
                Set set2 = (Set) value;
                if (set2 == null || (set = CollectionsKt.toMutableSet(set2)) == null) {
                    set = new LinkedHashSet();
                }
                if (set.contains(Long.valueOf(j))) {
                    set.remove(Long.valueOf(j));
                } else {
                    set.add(Long.valueOf(j));
                }
            } while (!xme.b(value, set));
        }
    }

    public final void n(String str) {
        this.z.setValue(str);
    }

    public i49(Function1 function1, gh4 gh4, Function0 function0) {
        this.b = function1;
        this.c = gh4;
        this.o = function0;
        this.v = new s85(0);
        this.w = new s85(0);
        xme a = f6e.a((Object) null);
        this.x = a;
        this.y = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.z = a2;
        this.X = new etc(a2);
    }
}
