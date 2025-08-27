package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ji2  reason: default package */
public final class ji2 extends ContinuationImpl {
    public aj2 a;
    public hr8 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aj2 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji2(aj2 aj2, Continuation continuation) {
        super(continuation);
        this.o = aj2;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return aj2.l(this.o, 0, (List) null, this);
    }
}
