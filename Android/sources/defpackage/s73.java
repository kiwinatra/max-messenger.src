package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s73  reason: default package */
public final class s73 extends ContinuationImpl {
    public t73 a;
    public jz9 b;
    public LinkedHashSet c;
    public Iterator o;
    public /* synthetic */ Object v;
    public final /* synthetic */ t73 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s73(t73 t73, Continuation continuation) {
        super(continuation);
        this.w = t73;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.c((List) null, this);
    }
}
