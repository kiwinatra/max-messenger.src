package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qg2  reason: default package */
public final class qg2 extends ContinuationImpl {
    public int X;
    public gh2 a;
    public List b;
    public Long c;
    public List o;
    public ArrayList v;
    public ArrayList w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ gh2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg2(gh2 gh2, Continuation continuation) {
        super(continuation);
        this.z = gh2;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.X |= IntCompanionObject.MIN_VALUE;
        return this.z.v((List) null, (Long) null, this);
    }
}
