package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ay7  reason: default package */
public final class ay7 extends ContinuationImpl {
    public by7 a;
    public ds5 b;
    public Uri c;
    public long o;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ by7 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ay7(by7 by7, Continuation continuation) {
        super(continuation);
        this.x = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.k((ds5) null, (Uri) null, 0, 0, this);
    }
}
