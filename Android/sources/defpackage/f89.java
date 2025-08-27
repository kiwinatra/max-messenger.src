package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: f89  reason: default package */
public final class f89 extends ContinuationImpl {
    public j89 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j89 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f89(j89 j89, Continuation continuation) {
        super(continuation);
        this.c = j89;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((List) null, this);
    }
}
