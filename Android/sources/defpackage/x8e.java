package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x8e  reason: default package */
public final class x8e extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ glb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x8e(glb glb, Continuation continuation) {
        super(continuation);
        this.o = glb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
