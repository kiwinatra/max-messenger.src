package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yn6  reason: default package */
public final class yn6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wn6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn6(wn6 wn6, Continuation continuation) {
        super(continuation);
        this.c = wn6;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
