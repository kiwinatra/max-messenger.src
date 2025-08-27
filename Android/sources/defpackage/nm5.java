package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: nm5  reason: default package */
public final class nm5 extends ContinuationImpl {
    public um5 a;
    public xz9 b;
    public String c;
    public /* synthetic */ Object o;
    public final /* synthetic */ um5 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm5(um5 um5, Continuation continuation) {
        super(continuation);
        this.v = um5;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.b(this);
    }
}
