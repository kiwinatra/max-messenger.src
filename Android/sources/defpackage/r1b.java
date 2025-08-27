package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r1b  reason: default package */
public final class r1b extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y1b c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.c = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b((File) null, (String) null, this);
    }
}
