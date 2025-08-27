package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bt3  reason: default package */
public final class bt3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pm2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bt3(pm2 pm2, Continuation continuation) {
        super(continuation);
        this.c = pm2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
