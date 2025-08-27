package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z92  reason: default package */
public final class z92 extends ContinuationImpl {
    public ia2 a;
    public Comparator b;
    public Collection c;
    public Iterator o;
    public /* synthetic */ Object v;
    public final /* synthetic */ ia2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z92(ia2 ia2, Continuation continuation) {
        super(continuation);
        this.w = ia2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return ia2.b(this.w, (ArrayList) null, false, this);
    }
}
