package defpackage;

import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tt2  reason: default package */
public final /* synthetic */ class tt2 implements ds5, FunctionAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object a2 = ((ds5) this.b).a((ss2) obj, continuation);
                return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
            default:
                Object t = ((zvb) ((cwb) this.b)).o.t((bxf) obj, continuation);
                return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ds5) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof ds5) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    public final Function getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(2, (ds5) this.b, ds5.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            default:
                return new FunctionReferenceImpl(2, (cwb) this.b, cwb.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
