package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m6e  reason: default package */
public final class m6e extends ContinuationImpl {
    public n6e a;
    public ds5 b;
    public o6e c;
    public pm7 o;
    public /* synthetic */ Object v;
    public final /* synthetic */ n6e w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m6e(n6e n6e, Continuation continuation) {
        super(continuation);
        this.w = n6e;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return n6e.n(this.w, (ds5) null, this);
    }
}
