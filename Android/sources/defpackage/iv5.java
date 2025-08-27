package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: iv5  reason: default package */
public final class iv5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ eu5 c;
    public ds5 o;
    public Ref.ObjectRef v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iv5(eu5 eu5, Continuation continuation) {
        super(continuation);
        this.c = eu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
