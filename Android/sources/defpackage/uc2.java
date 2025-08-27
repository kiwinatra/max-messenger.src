package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uc2  reason: default package */
public final class uc2 extends ContinuationImpl {
    public wc2 a;
    public a32 b;
    public List c;
    public List o;
    public /* synthetic */ Object v;
    public final /* synthetic */ wc2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uc2(wc2 wc2, Continuation continuation) {
        super(continuation);
        this.w = wc2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.a((a32) null, (a89) null, this);
    }
}
