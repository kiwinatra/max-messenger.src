package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: c98  reason: default package */
public final class c98 extends ContinuationImpl {
    public Ref.ObjectRef X;
    public int Y;
    public int Z;
    public e98 a;
    public Iterator b;
    public a32 c;
    public i72 o;
    public a89 v;
    public /* synthetic */ Object v0;
    public a89 w;
    public final /* synthetic */ e98 w0;
    public Iterator x;
    public int x0;
    public b89 y;
    public Ref.ObjectRef z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c98(e98 e98, Continuation continuation) {
        super(continuation);
        this.w0 = e98;
    }

    public final Object invokeSuspend(Object obj) {
        this.v0 = obj;
        this.x0 |= IntCompanionObject.MIN_VALUE;
        return this.w0.t((Map) null, this);
    }
}
