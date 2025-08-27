package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: u9b  reason: default package */
public final class u9b extends ContinuationImpl {
    public Object X;
    public Iterator Y;
    public ts Z;
    public /* synthetic */ Object a;
    public int b;
    public m9b c;
    public final /* synthetic */ m9b o;
    public ds5 v;
    public long v0;
    public cf1 w;
    public List x;
    public i9b y;
    public Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u9b(m9b m9b, Continuation continuation) {
        super(continuation);
        this.o = m9b;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
