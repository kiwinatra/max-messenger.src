package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yt5  reason: default package */
public final class yt5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wb c;
    public wb o;
    public ds5 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt5(wb wbVar, Continuation continuation) {
        super(continuation);
        this.c = wbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
