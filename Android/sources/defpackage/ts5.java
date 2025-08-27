package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ts5  reason: default package */
public final class ts5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public ds5 o;
    public final /* synthetic */ os5 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts5(os5 os5, Continuation continuation) {
        super(continuation);
        this.v = os5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.v.a((Object) null, this);
    }
}
