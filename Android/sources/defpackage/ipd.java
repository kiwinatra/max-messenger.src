package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ipd  reason: default package */
public final class ipd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jpd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ipd(jpd jpd, Continuation continuation) {
        super(continuation);
        this.c = jpd;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
