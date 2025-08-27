package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kve  reason: default package */
public final class kve extends ContinuationImpl {
    public mve a;
    public Collection b;
    public Iterator c;
    public bqe o;
    public Collection v;
    public /* synthetic */ Object w;
    public final /* synthetic */ mve x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kve(mve mve, Continuation continuation) {
        super(continuation);
        this.x = mve;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.m((List) null, this);
    }
}
