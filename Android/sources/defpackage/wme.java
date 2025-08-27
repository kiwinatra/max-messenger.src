package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wme  reason: default package */
public final class wme extends ContinuationImpl {
    public xme a;
    public ds5 b;
    public yme c;
    public pm7 o;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ xme x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wme(xme xme, Continuation continuation) {
        super(continuation);
        this.x = xme;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.e((ds5) null, this);
    }
}
