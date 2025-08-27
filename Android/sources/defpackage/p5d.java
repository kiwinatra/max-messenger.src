package defpackage;

import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p5d  reason: default package */
public final class p5d extends ContinuationImpl {
    public c6d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c6d c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p5d(c6d c6d, Continuation continuation) {
        super(continuation);
        this.c = c6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return c6d.i(this.c, (String) null, (LinkedHashSet) null, this);
    }
}
