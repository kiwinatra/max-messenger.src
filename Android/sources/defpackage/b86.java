package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: b86  reason: default package */
public final class b86 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FoldersPickerViewModel b;
    public final /* synthetic */ w16 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b86(FoldersPickerViewModel foldersPickerViewModel, w16 w16, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerViewModel;
        this.c = w16;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b86(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            w16 w16 = this.c;
            this.a = 1;
            FoldersPickerViewModel foldersPickerViewModel = this.b;
            Object I = ev0.I(((osa) foldersPickerViewModel.k).a(), new j86(foldersPickerViewModel, w16.a, !w16.d, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
