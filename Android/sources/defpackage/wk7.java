package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wk7  reason: default package */
public final class wk7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ j12 o;
    public Object v;
    public ysa w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk7(j12 j12, Continuation continuation) {
        super(continuation);
        this.o = j12;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
