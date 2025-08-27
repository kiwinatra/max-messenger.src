package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rcd  reason: default package */
public final class rcd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ vcd b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rcd(vcd vcd, Continuation continuation) {
        super(continuation);
        this.b = vcd;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.b((String) null, false, this);
    }
}
