package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cf2  reason: default package */
public final class cf2 extends ContinuationImpl {
    public pp0 a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pp0 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cf2(pp0 pp0, Continuation continuation) {
        super(continuation);
        this.o = pp0;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((ArrayList) null, this);
    }
}
