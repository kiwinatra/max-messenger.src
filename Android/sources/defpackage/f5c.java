package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: f5c  reason: default package */
public final class f5c extends ContinuationImpl {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j5c Z;
    public j5c a;
    public vk3 b;
    public a32 c;
    public cyb o;
    public eyb v;
    public int v0;
    public Object w;
    public List x;
    public Object y;
    public Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f5c(j5c j5c, Continuation continuation) {
        super(continuation);
        this.Z = j5c;
    }

    public final Object invokeSuspend(Object obj) {
        this.Y = obj;
        this.v0 |= IntCompanionObject.MIN_VALUE;
        return this.Z.b((vk3) null, (a32) null, (cyb) null, (eyb) null, (Long) null, this);
    }
}
