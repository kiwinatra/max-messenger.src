package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ks4  reason: default package */
public final class ks4 extends ContinuationImpl {
    public ns4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ns4 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ks4(ns4 ns4, Continuation continuation) {
        super(continuation);
        this.c = ns4;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.c(this);
    }
}
