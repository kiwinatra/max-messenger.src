package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zx7  reason: default package */
public final class zx7 extends ContinuationImpl {
    public by7 a;
    public ds5 b;
    public Uri c;
    public String o;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ by7 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zx7(by7 by7, Continuation continuation) {
        super(continuation);
        this.x = by7;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.j((ds5) null, (Uri) null, 0, (String) null, this);
    }
}
