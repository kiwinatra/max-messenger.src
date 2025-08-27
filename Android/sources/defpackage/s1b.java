package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s1b  reason: default package */
public final class s1b extends ContinuationImpl {
    public int X;
    public Object a;
    public File b;
    public j4f c;
    public File o;
    public Object v;
    public q1b w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ y1b z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.z = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.X |= IntCompanionObject.MIN_VALUE;
        return this.z.a((String) null, (File) null, (j4f) null, (String) null, false, this);
    }
}
