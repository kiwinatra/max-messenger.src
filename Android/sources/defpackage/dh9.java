package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dh9  reason: default package */
public final class dh9 extends ContinuationImpl {
    public Object a;
    public ha9 b;
    public boolean c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ mh9 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh9(mh9 mh9, Continuation continuation) {
        super(continuation);
        this.w = mh9;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.m((Long) null, false, this);
    }
}
