package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xo6  reason: default package */
public final class xo6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ uo6 o;
    public pm6 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo6(uo6 uo6, Continuation continuation) {
        super(continuation);
        this.o = uo6;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
