package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: f5f  reason: default package */
public final class f5f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ c5f o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f5f(c5f c5f, Continuation continuation) {
        super(continuation);
        this.o = c5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
