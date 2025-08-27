package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: evc  reason: default package */
public final class evc extends ContinuationImpl {
    public gvc a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gvc o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public evc(gvc gvc, Continuation continuation) {
        super(continuation);
        this.o = gvc;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(this);
    }
}
