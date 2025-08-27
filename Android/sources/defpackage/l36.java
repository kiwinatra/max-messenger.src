package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: l36  reason: default package */
public final class l36 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderPageViewModel b;
    public final /* synthetic */ z26 c;
    public final /* synthetic */ a32 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l36(FolderPageViewModel folderPageViewModel, z26 z26, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = folderPageViewModel;
        this.c = z26;
        this.o = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l36(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = this.b.h;
            String str = this.c.a;
            long j = this.o.b.a;
            this.a = 1;
            ia2 ia2 = (ia2) u82;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new f92(ia2, str, j, (Continuation) null), this);
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
