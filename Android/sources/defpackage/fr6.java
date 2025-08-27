package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fr6  reason: default package */
public final class fr6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ hr6 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fr6(hr6 hr6, Continuation continuation) {
        super(continuation);
        this.b = hr6;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return hr6.a(this.b, 0, (List) null, this);
    }
}
