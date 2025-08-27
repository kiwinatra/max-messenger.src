package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: j41  reason: default package */
public final class j41 extends SuspendLambda implements Function2 {
    public xme a;
    public int b;
    public final /* synthetic */ CallDialogViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j41(CallDialogViewModel callDialogViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = callDialogViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j41(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j41) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        xme xme2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        CallDialogViewModel callDialogViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme2 = callDialogViewModel.j;
            this.a = xme2;
            this.b = 1;
            obj = CallDialogViewModel.k(callDialogViewModel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            xme2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            xme = this.a;
            ResultKt.throwOnFailure(obj);
            xme.setValue(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme2.setValue(obj);
        xme xme3 = callDialogViewModel.k;
        pje pje = callDialogViewModel.i.a;
        lje lje = pje instanceof lje ? (lje) pje : null;
        if (lje == null) {
            obj2 = (h41) xme3.getValue();
        } else if (lje.c) {
            obj2 = (h41) xme3.getValue();
        } else {
            a32 G = callDialogViewModel.d.G(lje.a);
            if (G == null) {
                obj2 = g41.b;
            } else {
                G.b.c();
                int i2 = pad.a;
                obj2 = new Object();
            }
        }
        xme3.setValue(obj2);
        xme xme4 = callDialogViewModel.l;
        this.a = xme4;
        this.b = 2;
        Object j = CallDialogViewModel.j(callDialogViewModel, this);
        if (j == coroutine_suspended) {
            return coroutine_suspended;
        }
        xme xme5 = xme4;
        obj = j;
        xme = xme5;
        xme.setValue(obj);
        return Unit.INSTANCE;
    }
}
