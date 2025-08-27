package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: is2  reason: default package */
public final class is2 extends ContinuationImpl {
    public js2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ js2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is2(js2 js2, Continuation continuation) {
        super(continuation);
        this.c = js2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Set) null, this);
    }
}
