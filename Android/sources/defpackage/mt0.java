package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mt0  reason: default package */
public final class mt0 extends ContinuationImpl {
    public st0 a;
    public ArrayList b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ st0 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mt0(st0 st0, Continuation continuation) {
        super(continuation);
        this.v = st0;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.c((List) null, this);
    }
}
