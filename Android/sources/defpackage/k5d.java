package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: k5d  reason: default package */
public final class k5d extends ContinuationImpl {
    public Object a;
    public String b;
    public CharSequence c;
    public /* synthetic */ Object o;
    public final /* synthetic */ c6d v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k5d(c6d c6d, Continuation continuation) {
        super(continuation);
        this.v = c6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return c6d.a(this.v, (String) null, (CharSequence) null, this);
    }
}
