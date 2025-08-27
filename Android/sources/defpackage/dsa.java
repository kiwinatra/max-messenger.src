package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.messages.list.loader.MessageModel;

/* renamed from: dsa  reason: default package */
public final class dsa extends ContinuationImpl {
    public int X;
    public Object a;
    public Object b;
    public MessageModel c;
    public MessageModel o;
    public Layout v;
    public MessageModel w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ esa z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsa(esa esa, Continuation continuation) {
        super(continuation);
        this.z = esa;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.X |= IntCompanionObject.MIN_VALUE;
        return this.z.e((ge8) null, this);
    }
}
