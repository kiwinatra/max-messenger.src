package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x1b  reason: default package */
public final class x1b extends ContinuationImpl {
    public y1b a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y1b o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.o = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.k((q1b) null, (File) null, this);
    }
}
