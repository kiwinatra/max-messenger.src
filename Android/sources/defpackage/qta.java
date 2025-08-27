package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qta  reason: default package */
public final class qta extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ rta b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qta(rta rta, Continuation continuation) {
        super(continuation);
        this.b = rta;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Context) null, this);
    }
}
