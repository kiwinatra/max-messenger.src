package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vx7  reason: default package */
public final class vx7 extends ContinuationImpl {
    public Object a;
    public ds5 b;
    public Uri c;
    public dz7 o;
    public Object v;
    public Throwable w;
    public /* synthetic */ Object x;
    public final /* synthetic */ by7 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx7(by7 by7, Continuation continuation) {
        super(continuation);
        this.y = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return by7.a(this.y, (ds5) null, (Uri) null, this);
    }
}
