package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: zag  reason: default package */
public final class zag extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ abg c;
    public final /* synthetic */ Function2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zag(abg abg, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.c = abg;
        this.o = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zag zag = new zag(this.c, this.o, continuation);
        zag.b = obj;
        return zag;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zag) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        abg abg = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            if (((rh3) abg.b.getValue()).e()) {
                Function2 function2 = this.o;
                this.a = 1;
                if (function2.invoke(d14, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new TamErrorException(new qaf("io.exception", "io connection error", (String) null));
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (TamErrorException e) {
                n6e n6e = abg.c;
                Object invoke = abg.a.invoke(e);
                this.a = 2;
                if (n6e.a(invoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
