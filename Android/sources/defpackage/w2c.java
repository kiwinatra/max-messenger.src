package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: w2c  reason: default package */
public final class w2c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ u2c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w2c(u2c u2c, Continuation continuation) {
        super(continuation);
        this.c = u2c;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
