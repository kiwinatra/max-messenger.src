package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dk  reason: default package */
public final class dk extends ContinuationImpl {
    public gk a;
    public List b;
    public asc c;
    public /* synthetic */ Object o;
    public final /* synthetic */ gk v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dk(gk gkVar, Continuation continuation) {
        super(continuation);
        this.v = gkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.m((List) null, (asc) null, this);
    }
}
