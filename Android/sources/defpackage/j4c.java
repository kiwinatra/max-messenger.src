package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j4c  reason: default package */
public final class j4c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ k4c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j4c(k4c k4c, Continuation continuation) {
        super(continuation);
        this.c = k4c;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
