package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: ss5  reason: default package */
public final class ss5 extends SuspendLambda implements Function2 {
    public Ref.ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ int o;
    public final /* synthetic */ bs5 v;
    public final /* synthetic */ Function1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss5(int i, ps5 ps5, rx2 rx2, Continuation continuation) {
        super(2, continuation);
        this.o = i;
        this.v = ps5;
        this.w = rx2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ss5 ss5 = new ss5(this.o, (ps5) this.v, (rx2) this.w, continuation);
        ss5.c = obj;
        return ss5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ss5) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        ds5 ds5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 ds52 = (ds5) this.c;
            int i2 = this.o;
            if (i2 > 0) {
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    bs5 bs5 = this.v;
                    rs5 rs5 = new rs5(objectRef2, i2, ds52);
                    this.c = ds52;
                    this.a = objectRef2;
                    this.b = 1;
                    if (bs5.e(rs5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ds5 = ds52;
                    objectRef = objectRef2;
                } catch (CancellationException e) {
                    e = e;
                    objectRef = objectRef2;
                    ArrayList arrayList = (ArrayList) objectRef.element;
                    if (arrayList != null) {
                        this.w.invoke(arrayList);
                    }
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Chunk size must be greater than 0".toString());
            }
        } else if (i == 1) {
            objectRef = this.a;
            ds5 = (ds5) this.c;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e2) {
                e = e2;
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList2 = (ArrayList) objectRef.element;
        if (arrayList2 != null) {
            this.c = null;
            this.a = null;
            this.b = 2;
            if (ds5.a(arrayList2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
