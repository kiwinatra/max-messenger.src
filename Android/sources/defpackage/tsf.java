package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* renamed from: tsf  reason: default package */
public final class tsf extends ssf {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ xsf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsf(xsf xsf, Object obj) {
        super(obj);
        this.e = xsf;
        zsf zsf = xsf.b;
    }

    public final Object a() {
        boolean z = this.d;
        xsf xsf = this.e;
        Object obj = this.a;
        if (!z && this.c == null) {
            Function1 function1 = xsf.b.d;
            if (function1 != null && !((Boolean) function1.invoke(obj)).booleanValue()) {
                return null;
            }
            Sequence sequence = (Sequence) xsf.b.b.invoke(obj);
            Iterator it = sequence != null ? sequence.iterator() : null;
            this.c = it;
            if (it == null) {
                Function2 function2 = xsf.b.f;
                if (function2 != null) {
                    function2.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (!this.b) {
            this.b = true;
            return obj;
        }
        Function1 function12 = xsf.b.e;
        if (function12 == null) {
            return null;
        }
        function12.invoke(obj);
        return null;
    }
}
