package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: h36  reason: default package */
public final class h36 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z26 c;
    public final /* synthetic */ FolderPageViewModel o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h36(z26 z26, Continuation continuation, FolderPageViewModel folderPageViewModel) {
        super(2, continuation);
        this.c = z26;
        this.o = folderPageViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h36 h36 = new h36(this.c, continuation, this.o);
        h36.b = obj;
        return h36;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h36) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            if (this.c instanceof z26) {
                this.a = 1;
                if (FolderPageViewModel.j(this.o, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
