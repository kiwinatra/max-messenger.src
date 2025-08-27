package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xv  reason: default package */
public final class xv extends ContinuationImpl {
    public gx a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gx o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xv(gx gxVar, Continuation continuation) {
        super(continuation);
        this.o = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.m((za9) null, this);
    }
}
