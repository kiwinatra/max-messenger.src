package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ti2  reason: default package */
public final class ti2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ui2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ti2(ui2 ui2, Continuation continuation) {
        super(continuation);
        this.c = ui2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
