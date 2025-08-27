package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dl9  reason: default package */
public final class dl9 extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ en9 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl9(en9 en9, Continuation continuation) {
        super(continuation);
        this.c = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.q(0, (String) null, 0, false, this);
    }
}
