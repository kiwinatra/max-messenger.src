package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: m36  reason: default package */
public final class m36 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderPageViewModel b;
    public final /* synthetic */ z26 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m36(z26 z26, Continuation continuation, FolderPageViewModel folderPageViewModel) {
        super(2, continuation);
        this.b = folderPageViewModel;
        this.c = z26;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m36(this.c, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FolderPageViewModel folderPageViewModel = this.b;
            folderPageViewModel.i.e("FOLDER_DELETE");
            u82 u82 = folderPageViewModel.h;
            String str = this.c.a;
            this.a = 1;
            if (((ia2) u82).c(str, this) == coroutine_suspended) {
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
