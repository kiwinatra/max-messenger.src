package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: wu5  reason: default package */
public final class wu5 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ wu5(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.element = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.element = obj;
                throw new AbortFlowException(this);
            default:
                Ref.ObjectRef objectRef = this.b;
                T t = objectRef.element;
                T t2 = q8.e;
                if (t == t2) {
                    objectRef.element = obj;
                    return Unit.INSTANCE;
                }
                objectRef.element = t2;
                throw new AbortFlowException(this);
        }
    }
}
