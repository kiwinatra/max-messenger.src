package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lpd  reason: default package */
public final class lpd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jpd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lpd(jpd jpd, Continuation continuation) {
        super(continuation);
        this.c = jpd;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
