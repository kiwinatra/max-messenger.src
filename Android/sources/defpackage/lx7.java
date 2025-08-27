package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: lx7  reason: default package */
public final class lx7 extends ContinuationImpl {
    public by7 a;
    public ds5 b;
    public Uri c;
    public ha9 o;
    public a32 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ by7 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx7(by7 by7, Continuation continuation) {
        super(continuation);
        this.y = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.b((ds5) null, (Uri) null, 0, 0, 0, this);
    }
}
