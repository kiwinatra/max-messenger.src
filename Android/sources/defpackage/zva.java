package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zva  reason: default package */
public final class zva extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ awa b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zva(awa awa, Continuation continuation) {
        super(continuation);
        this.b = awa;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a(0, (List) null, this);
    }
}
