package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: c93  reason: default package */
public final class c93 extends ContinuationImpl {
    public d93 a;
    public vo7 b;
    public ihg c;
    public String o;
    public /* synthetic */ Object v;
    public final /* synthetic */ d93 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c93(d93 d93, Continuation continuation) {
        super(continuation);
        this.w = d93;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.a((x02) null, (vo7) null, (ihg) null, (String) null, this);
    }
}
