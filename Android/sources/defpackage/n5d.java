package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n5d  reason: default package */
public final class n5d extends ContinuationImpl {
    public c6d a;
    public Collection b;
    public Object c;
    public r82 o;
    public Iterator v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ c6d y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n5d(c6d c6d, Continuation continuation) {
        super(continuation);
        this.y = c6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return c6d.g(this.y, (List) null, (Set) null, this);
    }
}
