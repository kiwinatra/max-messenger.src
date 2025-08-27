package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: px7  reason: default package */
public final class px7 extends ContinuationImpl {
    public by7 a;
    public ds5 b;
    public Uri c;
    public a32 o;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ by7 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px7(by7 by7, Continuation continuation) {
        super(continuation);
        this.x = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.f((ds5) null, (Uri) null, (a32) null, 0, (bl4) null, this);
    }
}
