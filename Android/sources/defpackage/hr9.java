package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hr9  reason: default package */
public final class hr9 extends ContinuationImpl {
    public ir9 a;
    public List b;
    public Collection c;
    public Iterator o;
    public xk2 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ir9 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hr9(ir9 ir9, Continuation continuation) {
        super(continuation);
        this.x = ir9;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return ir9.a(this.x, (List) null, this);
    }
}
