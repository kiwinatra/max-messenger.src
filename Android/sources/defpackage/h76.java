package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;

/* renamed from: h76  reason: default package */
public final class h76 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FoldersPickerFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h76(FoldersPickerFragment foldersPickerFragment, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h76(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h76) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FoldersPickerFragment foldersPickerFragment = this.b;
            jv7 X1 = foldersPickerFragment.X1();
            iu7 iu7 = iu7.c;
            g76 g76 = new g76(foldersPickerFragment, (Continuation) null);
            this.a = 1;
            if (gsg.x(X1, iu7, g76, this) == coroutine_suspended) {
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
