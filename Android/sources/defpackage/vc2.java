package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vc2  reason: default package */
public final class vc2 extends ContinuationImpl {
    public m29 a;
    public igf b;
    public ngf c;
    public /* synthetic */ Object o;
    public final /* synthetic */ wc2 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vc2(wc2 wc2, Continuation continuation) {
        super(continuation);
        this.v = wc2;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.b((a32) null, (a89) null, (m29) null, this);
    }
}
