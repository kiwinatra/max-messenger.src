package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ht5  reason: default package */
public final class ht5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fs5 c;
    public ds5 o;
    public Iterator v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ht5(fs5 fs5, Continuation continuation) {
        super(continuation);
        this.c = fs5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
