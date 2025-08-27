package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: el9  reason: default package */
public final class el9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ en9 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el9(en9 en9, Continuation continuation) {
        super(continuation);
        this.b = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.r(0, this);
    }
}
