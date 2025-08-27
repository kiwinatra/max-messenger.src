package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: v8a  reason: default package */
public final class v8a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ma8 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v8a(ma8 ma8, Continuation continuation) {
        super(continuation);
        this.c = ma8;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
