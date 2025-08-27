package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zse  reason: default package */
public final class zse extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bte c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zse(bte bte, Continuation continuation) {
        super(continuation);
        this.c = bte;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b((String) null, 0, 0, this);
    }
}
