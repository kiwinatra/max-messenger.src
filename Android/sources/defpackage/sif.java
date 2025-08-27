package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: sif  reason: default package */
public final class sif extends ContinuationImpl {
    public tif a;
    public ds5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tif o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sif(tif tif, Continuation continuation) {
        super(continuation);
        this.o = tif;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.e((ds5) null, this);
    }
}
