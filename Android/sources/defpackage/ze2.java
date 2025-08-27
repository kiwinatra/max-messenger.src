package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ze2  reason: default package */
public final class ze2 extends ContinuationImpl {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pp0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze2(pp0 pp0, Continuation continuation) {
        super(continuation);
        this.c = pp0;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b(0, 0, 0, this);
    }
}
