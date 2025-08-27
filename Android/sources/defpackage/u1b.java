package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: u1b  reason: default package */
public final class u1b extends ContinuationImpl {
    public y1b a;
    public Object b;
    public Iterator c;
    public /* synthetic */ Object o;
    public final /* synthetic */ y1b v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.v = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g((ptc) null, 0, (File) null, (k4d) null, (q1b) null, (File) null, false, this);
    }
}
