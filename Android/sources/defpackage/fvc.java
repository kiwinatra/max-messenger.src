package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fvc  reason: default package */
public final class fvc extends ContinuationImpl {
    public gvc a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gvc o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fvc(gvc gvc, Continuation continuation) {
        super(continuation);
        this.o = gvc;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.c((List) null, this);
    }
}
