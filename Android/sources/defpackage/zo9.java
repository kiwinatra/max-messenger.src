package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zo9  reason: default package */
public final class zo9 extends ContinuationImpl {
    public ap9 a;
    public CharSequence b;
    public List c;
    public long o;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ap9 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo9(ap9 ap9, Continuation continuation) {
        super(continuation);
        this.x = ap9;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return ap9.a(this.x, 0, (Long) null, (CharSequence) null, (List) null, false, this);
    }
}
