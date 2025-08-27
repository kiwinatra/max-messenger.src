package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: in7  reason: default package */
public final class in7 extends ContinuationImpl {
    public ConcurrentHashMap a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q40 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in7(q40 q40, Continuation continuation) {
        super(continuation);
        this.o = q40;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.j(this);
    }
}
