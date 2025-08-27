package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: om9  reason: default package */
public final class om9 extends ContinuationImpl {
    public en9 a;
    public ha9 b;
    public l20 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ en9 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public om9(en9 en9, Continuation continuation) {
        super(continuation);
        this.v = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return en9.l(this.v, (ha9) null, this);
    }
}
