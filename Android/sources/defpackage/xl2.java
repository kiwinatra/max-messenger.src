package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xl2  reason: default package */
public final class xl2 extends ContinuationImpl {
    public AtomicLong a;
    public /* synthetic */ Object b;
    public final /* synthetic */ em2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl2(em2 em2, Continuation continuation) {
        super(continuation);
        this.c = em2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.c((String) null, (RectF) null, this);
    }
}
