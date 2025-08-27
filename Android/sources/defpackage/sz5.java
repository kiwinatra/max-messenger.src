package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditViewModel;

/* renamed from: sz5  reason: default package */
public final class sz5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderEditViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz5(FolderEditViewModel folderEditViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sz5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sz5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FolderEditViewModel folderEditViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = folderEditViewModel.d;
            String str = ((vz5) folderEditViewModel.j).o;
            this.a = 1;
            obj = ((ia2) u82).d(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zx5 zx5 = (zx5) obj;
        if (zx5 == null) {
            return Unit.INSTANCE;
        }
        String str2 = zx5.c;
        zz5 zz5 = new zz5(folderEditViewModel.c instanceof yy5, str2 != null ? new e15(0, str2, CollectionsKt.emptyList()) : null, 16, true, zx5.b, true, true);
        xme xme = folderEditViewModel.h;
        xme.getClass();
        xme.m((Object) null, zz5);
        return Unit.INSTANCE;
    }
}
