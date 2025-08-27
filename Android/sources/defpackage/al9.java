package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: al9  reason: default package */
public final class al9 extends ContinuationImpl {
    public en9 a;
    public a32 b;
    public List c;
    public Ref.BooleanRef o;
    public Ref.BooleanRef v;
    public /* synthetic */ Object w;
    public final /* synthetic */ en9 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al9(en9 en9, Continuation continuation) {
        super(continuation);
        this.x = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return en9.j(this.x, (a32) null, (List) null, this);
    }
}
