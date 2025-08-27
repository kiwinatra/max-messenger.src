package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ip3  reason: default package */
public final class ip3 extends ContinuationImpl {
    public kp3 a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kp3 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip3(kp3 kp3, Continuation continuation) {
        super(continuation);
        this.o = kp3;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return kp3.b(this.o, this);
    }
}
