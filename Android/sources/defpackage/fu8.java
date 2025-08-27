package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fu8  reason: default package */
public final class fu8 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ds5 c;
    public final /* synthetic */ vb o;
    public boolean v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu8(vb vbVar, Continuation continuation) {
        super(continuation);
        this.o = vbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
