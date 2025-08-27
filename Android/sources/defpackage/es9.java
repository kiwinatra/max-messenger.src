package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: es9  reason: default package */
public final class es9 extends ContinuationImpl {
    public is9 a;
    public jz9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ is9 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public es9(is9 is9, Continuation continuation) {
        super(continuation);
        this.o = is9;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.r((l88) null, 0, this);
    }
}
