package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qj  reason: default package */
public final class qj extends ContinuationImpl {
    public gk a;
    public ArrayList b;
    public ArrayList c;
    public Map o;
    public /* synthetic */ Object v;
    public final /* synthetic */ gk w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qj(gk gkVar, Continuation continuation) {
        super(continuation);
        this.w = gkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return gk.b(this.w, (qu) null, this);
    }
}
