package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* renamed from: wsf  reason: default package */
public final class wsf extends ssf {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ xsf d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wsf(xsf xsf, Object obj) {
        super(obj);
        this.d = xsf;
        zsf zsf = xsf.b;
    }

    public final Object a() {
        Function2 function2;
        boolean z = this.b;
        xsf xsf = this.d;
        Object obj = this.a;
        if (!z) {
            Function1 function1 = xsf.b.d;
            if (function1 != null && !((Boolean) function1.invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it == null || it.hasNext()) {
            if (this.c == null) {
                Sequence sequence = (Sequence) xsf.b.b.invoke(obj);
                Iterator it2 = sequence != null ? sequence.iterator() : null;
                this.c = it2;
                if (it2 == null && (function2 = xsf.b.f) != null) {
                    function2.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                Iterator it3 = this.c;
                if (it3 == null || !it3.hasNext()) {
                    Function1 function12 = xsf.b.e;
                    if (function12 != null) {
                        function12.invoke(obj);
                    }
                    return null;
                }
            }
            return this.c.next();
        }
        Function1 function13 = xsf.b.e;
        if (function13 == null) {
            return null;
        }
        function13.invoke(obj);
        return null;
    }
}
