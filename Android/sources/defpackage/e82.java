package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: e82  reason: default package */
public final class e82 extends ContinuationImpl {
    public AtomicLong a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m82 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e82(m82 m82, Continuation continuation) {
        super(continuation);
        this.c = m82;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.h((String) null, (RectF) null, this);
    }
}
