package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: ak  reason: default package */
public final class ak extends ContinuationImpl {
    public Object a;
    public Object b;
    public Ref.ObjectRef c;
    public Object o;
    public jz9 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ gk x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(gk gkVar, Continuation continuation) {
        super(continuation);
        this.x = gkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return gk.c(this.x, (List) null, (Map) null, this);
    }
}
