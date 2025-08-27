package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ms4  reason: default package */
public final class ms4 extends ContinuationImpl {
    public Object a;
    public float b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ns4 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms4(ns4 ns4, Continuation continuation) {
        super(continuation);
        this.o = ns4;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.b(c44.DEFAULT_ASPECT_RATIO, 0, 0, this);
    }
}
