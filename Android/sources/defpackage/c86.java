package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: c86  reason: default package */
public final class c86 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FoldersPickerViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c86(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c86(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FoldersPickerViewModel foldersPickerViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ss9 ss9 = foldersPickerViewModel.c;
            if (ss9 instanceof qs9) {
                long j = ((qs9) ss9).a;
                this.a = 1;
                ia2 ia2 = (ia2) foldersPickerViewModel.h;
                ia2.getClass();
                Object I = ev0.I(ia2.x, new s92(ia2, j, (Continuation) null), this);
                if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    I = Unit.INSTANCE;
                }
                if (I == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (ss9 instanceof rs9) {
                foldersPickerViewModel.m();
                return Unit.INSTANCE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = foldersPickerViewModel.n;
        o85 o85 = new o85(v76.a);
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
