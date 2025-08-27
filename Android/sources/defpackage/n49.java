package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n49  reason: default package */
public final class n49 extends ContinuationImpl {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r49 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n49(r49 r49, Continuation continuation) {
        super(continuation);
        this.c = r49;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return r49.j((n39) null, this.c, (List) null, this);
    }
}
