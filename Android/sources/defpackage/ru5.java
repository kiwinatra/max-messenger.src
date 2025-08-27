package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ru5  reason: default package */
public final class ru5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ os5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru5(os5 os5, Continuation continuation) {
        super(continuation);
        this.o = os5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
