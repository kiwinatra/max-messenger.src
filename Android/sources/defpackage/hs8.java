package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hs8  reason: default package */
public final class hs8 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ ns8 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs8(ns8 ns8, Continuation continuation) {
        super(continuation);
        this.b = ns8;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((a89) null, (Set) null, this);
    }
}
