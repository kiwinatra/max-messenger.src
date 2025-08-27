package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: di2  reason: default package */
public final class di2 extends ContinuationImpl {
    public aj2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aj2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di2(aj2 aj2, Continuation continuation) {
        super(continuation);
        this.c = aj2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return aj2.j(this.c, (List) null, this);
    }
}
