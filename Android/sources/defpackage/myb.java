package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: myb  reason: default package */
public final class myb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public nyb c;
    public Object o;
    public final /* synthetic */ nyb v;
    public Object w;
    public vk3 x;
    public xme y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public myb(nyb nyb, Continuation continuation) {
        super(continuation);
        this.v = nyb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.v.a((Object) null, this);
    }
}
