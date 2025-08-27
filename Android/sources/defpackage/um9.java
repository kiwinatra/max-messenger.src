package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: um9  reason: default package */
public final class um9 extends ContinuationImpl {
    public en9 a;
    public ha9 b;
    public l20 c;
    public a32 o;
    public /* synthetic */ Object v;
    public final /* synthetic */ en9 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public um9(en9 en9, Continuation continuation) {
        super(continuation);
        this.w = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return en9.m(this.w, (ha9) null, this);
    }
}
