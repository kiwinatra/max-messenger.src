package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xm0  reason: default package */
public final class xm0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ bn0 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm0(bn0 bn0, Continuation continuation) {
        super(continuation);
        this.b = bn0;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.f((ArrayList) null, this);
    }
}
