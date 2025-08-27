package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wx7  reason: default package */
public final class wx7 extends ContinuationImpl {
    public by7 a;
    public ds5 b;
    public dz7 c;
    public Uri o;
    public /* synthetic */ Object v;
    public final /* synthetic */ by7 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx7(by7 by7, Continuation continuation) {
        super(continuation);
        this.w = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.i((ds5) null, (dz7) null, (Uri) null, this);
    }
}
