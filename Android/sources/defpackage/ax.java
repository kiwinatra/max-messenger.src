package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ax  reason: default package */
public final class ax extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bx c;
    public bx o;
    public wv v;
    public long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax(bx bxVar, Continuation continuation) {
        super(continuation);
        this.c = bxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
