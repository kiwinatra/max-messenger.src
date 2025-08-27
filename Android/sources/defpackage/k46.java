package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: k46  reason: default package */
public final class k46 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderSettingsFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k46(FolderSettingsFragment folderSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k46(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k46) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FolderSettingsFragment folderSettingsFragment = this.b;
            jv7 X1 = folderSettingsFragment.X1();
            iu7 iu7 = iu7.c;
            j46 j46 = new j46(folderSettingsFragment, (Continuation) null);
            this.a = 1;
            if (gsg.x(X1, iu7, j46, this) == coroutine_suspended) {
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
