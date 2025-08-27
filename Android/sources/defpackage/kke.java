package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kke  reason: default package */
public final class kke extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y40 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kke(y40 y40, Continuation continuation) {
        super(continuation);
        this.c = y40;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
