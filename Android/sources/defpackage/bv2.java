package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bv2  reason: default package */
public final class bv2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cv2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv2(cv2 cv2, Continuation continuation) {
        super(continuation);
        this.c = cv2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
