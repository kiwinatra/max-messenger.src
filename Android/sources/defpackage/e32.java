package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: e32  reason: default package */
public final class e32 extends ContinuationImpl {
    public f32 a;
    public Comparable b;
    public Object c;
    public List o;
    public List v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ f32 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e32(f32 f32, Continuation continuation) {
        super(continuation);
        this.y = f32;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.a(0, (String) null, this);
    }
}
