package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: un3  reason: default package */
public final class un3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vn3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un3(vn3 vn3, Continuation continuation) {
        super(continuation);
        this.c = vn3;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
