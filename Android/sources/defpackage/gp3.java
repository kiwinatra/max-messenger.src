package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gp3  reason: default package */
public final class gp3 extends ContinuationImpl {
    public kp3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kp3 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp3(kp3 kp3, Continuation continuation) {
        super(continuation);
        this.c = kp3;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return kp3.a(this.c, this);
    }
}
