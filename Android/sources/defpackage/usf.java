package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* renamed from: usf  reason: default package */
public final class usf extends ssf {
    public final Iterator b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usf(xsf xsf, Object obj) {
        super(obj);
        zsf zsf = xsf.b;
        Sequence sequence = (Sequence) zsf.b.invoke(obj);
        this.b = sequence != null ? sequence.iterator() : null;
    }

    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
