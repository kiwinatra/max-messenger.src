package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.messages.list.loader.MessageModel;

/* renamed from: yw9  reason: default package */
public final class yw9 extends ContinuationImpl {
    public cx9 a;
    public List b;
    public List c;
    public /* synthetic */ Object o;
    public final /* synthetic */ cx9 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw9(cx9 cx9, Continuation continuation) {
        super(continuation);
        this.v = cx9;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.d((MessageModel) null, this);
    }
}
