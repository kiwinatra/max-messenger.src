package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yv  reason: default package */
public final class yv extends ContinuationImpl {
    public gx a;
    public Object b;
    public iz9 c;
    public Iterator o;
    public iz9 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ gx y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv(gx gxVar, Continuation continuation) {
        super(continuation);
        this.y = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.n((eb9) null, this);
    }
}
