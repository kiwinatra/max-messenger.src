package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jy2  reason: default package */
public final class jy2 extends ContinuationImpl {
    public my2 a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy2(my2 my2, Continuation continuation) {
        super(continuation);
        this.o = my2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.t(0, (Set) null, this);
    }
}
