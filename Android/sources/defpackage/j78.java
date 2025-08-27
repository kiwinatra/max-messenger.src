package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j78  reason: default package */
public final class j78 extends ContinuationImpl {
    public k78 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k78 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j78(k78 k78, Continuation continuation) {
        super(continuation);
        this.c = k78;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.g(false, this);
    }
}
