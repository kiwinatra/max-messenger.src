package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bw2  reason: default package */
public final class bw2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zv2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bw2(zv2 zv2, Continuation continuation) {
        super(continuation);
        this.c = zv2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
