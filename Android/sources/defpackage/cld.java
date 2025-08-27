package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cld  reason: default package */
public final class cld extends ContinuationImpl {
    public dld a;
    public ald b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dld o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cld(dld dld, Continuation continuation) {
        super(continuation);
        this.o = dld;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((ald) null, this);
    }
}
