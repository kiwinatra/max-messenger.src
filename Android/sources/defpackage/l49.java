package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: l49  reason: default package */
public final class l49 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ r49 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l49(r49 r49, Continuation continuation) {
        super(continuation);
        this.b = r49;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.k((Collection) null, this);
    }
}
