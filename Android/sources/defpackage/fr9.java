package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fr9  reason: default package */
public final class fr9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ dr9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fr9(dr9 dr9, Continuation continuation) {
        super(continuation);
        this.o = dr9;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
