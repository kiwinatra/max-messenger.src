package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: djg  reason: default package */
public final class djg extends ContinuationImpl {
    public hjg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hjg c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public djg(hjg hjg, Continuation continuation) {
        super(continuation);
        this.c = hjg;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return hjg.k(this.c, (lo7) null, this);
    }
}
