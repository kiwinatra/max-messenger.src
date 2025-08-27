package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: iyd  reason: default package */
public final class iyd extends ContinuationImpl {
    public bx a;
    public xme b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ bx v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iyd(bx bxVar, Continuation continuation) {
        super(continuation);
        this.v = bxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.e((vk3) null, this);
    }
}
