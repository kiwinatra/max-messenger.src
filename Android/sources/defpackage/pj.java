package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pj  reason: default package */
public final class pj extends ContinuationImpl {
    public gk a;
    public Map b;
    public ArrayList c;
    public /* synthetic */ Object o;
    public final /* synthetic */ gk v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj(gk gkVar, Continuation continuation) {
        super(continuation);
        this.v = gkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return gk.a(this.v, (Map) null, this);
    }
}
