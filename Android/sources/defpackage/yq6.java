package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yq6  reason: default package */
public final class yq6 extends ContinuationImpl {
    public zq6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zq6 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq6(zq6 zq6, Continuation continuation) {
        super(continuation);
        this.c = zq6;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a(0, 0, (String) null, (Long) null, (Integer) null, this);
    }
}
