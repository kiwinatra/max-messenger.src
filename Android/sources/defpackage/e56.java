package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: e56  reason: default package */
public final class e56 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderSettingsViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e56(FolderSettingsViewModel folderSettingsViewModel, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsViewModel;
        this.c = str;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e56(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e56) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = this.b.e;
            this.a = 1;
            ia2 ia2 = (ia2) u82;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new p92(ia2, this.c, this.o, (Continuation) null), this);
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
