package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uo9  reason: default package */
public final class uo9 extends ContinuationImpl {
    public wo9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wo9 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo9(wo9 wo9, Continuation continuation) {
        super(continuation);
        this.c = wo9;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((List) null, this);
    }
}
