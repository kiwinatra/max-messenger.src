package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cr9  reason: default package */
public final class cr9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ dr9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr9(dr9 dr9, Continuation continuation) {
        super(continuation);
        this.c = dr9;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
