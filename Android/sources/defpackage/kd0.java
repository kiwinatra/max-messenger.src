package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kd0  reason: default package */
public final class kd0 extends ContinuationImpl {
    public Uri a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ld0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd0(ld0 ld0, Continuation continuation) {
        super(continuation);
        this.c = ld0;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b((xk2) null, this);
    }
}
