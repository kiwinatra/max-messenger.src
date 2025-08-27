package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j06  reason: default package */
public final class j06 extends ContinuationImpl {
    public m06 a;
    public zx5 b;
    public Set c;
    public jz9 o;
    public ws v;
    public Iterator w;
    public /* synthetic */ Object x;
    public final /* synthetic */ m06 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j06(m06 m06, Continuation continuation) {
        super(continuation);
        this.y = m06;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return m06.j(this.y, (Set) null, this);
    }
}
