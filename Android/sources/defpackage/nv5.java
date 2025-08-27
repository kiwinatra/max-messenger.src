package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: nv5  reason: default package */
public final class nv5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ i21 c;
    public i21 o;
    public ds5 v;
    public Ref.ObjectRef w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nv5(i21 i21, Continuation continuation) {
        super(continuation);
        this.c = i21;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
