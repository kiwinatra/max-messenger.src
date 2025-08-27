package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: nkg  reason: default package */
public final class nkg extends ContinuationImpl {
    public wkg a;
    public zjg b;
    public mkg c;
    public uwe o;
    public /* synthetic */ Object v;
    public final /* synthetic */ wkg w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nkg(wkg wkg, Continuation continuation) {
        super(continuation);
        this.w = wkg;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.h((String) null, false, this);
    }
}
