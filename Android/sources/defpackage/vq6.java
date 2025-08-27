package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vq6  reason: default package */
public final class vq6 extends ContinuationImpl {
    public wq6 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wq6 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq6(wq6 wq6, Continuation continuation) {
        super(continuation);
        this.o = wq6;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((String) null, this);
    }
}
