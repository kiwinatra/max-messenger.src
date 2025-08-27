package defpackage;

import javax.net.ssl.SSLEngine;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tlf  reason: default package */
public final class tlf extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public SSLEngine o;
    public ulf v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ulf x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tlf(ulf ulf, Continuation continuation) {
        super(continuation);
        this.x = ulf;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.b((String) null, this);
    }
}
