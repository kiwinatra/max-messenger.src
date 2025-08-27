package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: it5  reason: default package */
public final class it5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fs5 c;
    public fs5 o;
    public ds5 v;
    public int w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public it5(fs5 fs5, Continuation continuation) {
        super(continuation);
        this.c = fs5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
