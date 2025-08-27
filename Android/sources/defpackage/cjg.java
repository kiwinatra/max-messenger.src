package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cjg  reason: default package */
public final class cjg extends ContinuationImpl {
    public lo7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hjg c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjg(hjg hjg, Continuation continuation) {
        super(continuation);
        this.c = hjg;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return hjg.j(this.c, (ywe) null, this);
    }
}
