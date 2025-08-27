package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vn6  reason: default package */
public final class vn6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ wn6 o;
    public wk6 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn6(wn6 wn6, Continuation continuation) {
        super(continuation);
        this.o = wn6;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
