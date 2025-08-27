package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: b56  reason: default package */
public final class b56 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderSettingsViewModel b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b56(FolderSettingsViewModel folderSettingsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsViewModel;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b56(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b56) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = this.b.e;
            this.a = 1;
            if (((ia2) u82).c(this.c, this) == coroutine_suspended) {
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
