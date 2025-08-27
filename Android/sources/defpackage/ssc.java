package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: ssc  reason: default package */
public final class ssc extends ContinuationImpl {
    public ReactionsViewModel a;
    public Object b;
    public xd9 c;
    public hqc o;
    public qqc v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ReactionsViewModel x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ssc(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(continuation);
        this.x = reactionsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return ReactionsViewModel.j(this.x, (osc) null, this);
    }
}
