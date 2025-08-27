package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rn7  reason: default package */
public final class rn7 extends ContinuationImpl {
    public sn7 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sn7 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn7(sn7 sn7, Continuation continuation) {
        super(continuation);
        this.o = sn7;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((String) null, this);
    }
}
