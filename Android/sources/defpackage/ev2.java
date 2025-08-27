package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ev2  reason: default package */
public final class ev2 extends ContinuationImpl {
    public Collection X;
    public /* synthetic */ Object a;
    public int b;
    public cv2 c;
    public final /* synthetic */ cv2 o;
    public ds5 v;
    public List w;
    public List x;
    public Collection y;
    public Iterator z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev2(cv2 cv2, Continuation continuation) {
        super(continuation);
        this.o = cv2;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
