package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: mt5  reason: default package */
public final class mt5 extends SuspendLambda implements Function2 {
    public Ref.ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref.ObjectRef o;
    public final /* synthetic */ ds5 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mt5(ds5 ds5, Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.o = objectRef;
        this.v = ds5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mt5 mt5 = new mt5(this.v, continuation, this.o);
        mt5.c = obj;
        return mt5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mt5) create(new e22(((e22) obj).a), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            T t = ((e22) this.c).a;
            boolean z = t instanceof d22;
            objectRef = this.o;
            if (!z) {
                objectRef.element = t;
            }
            if (z) {
                Throwable a2 = e22.a(t);
                if (a2 == null) {
                    T t2 = objectRef.element;
                    if (t2 != null) {
                        if (t2 == q8.e) {
                            t2 = null;
                        }
                        this.c = t;
                        this.a = objectRef;
                        this.b = 1;
                        if (this.v.a(t2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                    }
                    objectRef.element = q8.g;
                } else {
                    throw a2;
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            objectRef2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = objectRef2;
        objectRef.element = q8.g;
        return Unit.INSTANCE;
    }
}
