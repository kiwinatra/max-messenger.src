package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.sequences.Sequence;

/* renamed from: zsf  reason: default package */
public final class zsf implements Sequence {
    public final Object a;
    public final Function1 b;
    public final veg c;
    public final Function1 d;
    public final Function1 e = null;
    public final Function2 f = null;
    public final int g = IntCompanionObject.MAX_VALUE;

    public zsf(Object obj, Function1 function1, Function1 function12) {
        veg veg = veg.a;
        this.a = obj;
        this.b = function1;
        this.c = veg;
        this.d = function12;
    }

    public final Iterator iterator() {
        return new xsf(this);
    }
}
