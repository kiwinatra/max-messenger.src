package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditViewModel;

/* renamed from: i06  reason: default package */
public final class i06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderEditViewModel b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i06(FolderEditViewModel folderEditViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditViewModel;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i06(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FolderEditViewModel folderEditViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o54 o54 = folderEditViewModel.j;
            boolean z = o54 instanceof uz5;
            u82 u82 = folderEditViewModel.d;
            nd ndVar = folderEditViewModel.e;
            String str = this.c;
            if (z) {
                ndVar.e("FOLDER_CREATE");
                e15 e15 = folderEditViewModel.j().b;
                CharSequence charSequence = e15 != null ? e15.c : null;
                this.a = 1;
                ia2 ia2 = (ia2) u82;
                ia2.getClass();
                obj = ev0.I(ia2.x, new b92(ia2, str, charSequence, (Continuation) null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (o54 instanceof vz5) {
                ndVar.e("FOLDER_UPDATE");
                String str2 = ((vz5) folderEditViewModel.j).o;
                e15 e152 = folderEditViewModel.j().b;
                CharSequence charSequence2 = e152 != null ? e152.c : null;
                this.a = 2;
                ia2 ia22 = (ia2) u82;
                ia22.getClass();
                Object I = ev0.I(ia22.x, new ga2(ia22, str2, str, charSequence2, (Continuation) null), this);
                if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    I = Unit.INSTANCE;
                }
                if (I == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xme xme = folderEditViewModel.f;
                o85 o85 = new o85(wz5.a);
                xme.getClass();
                xme.m((Object) null, o85);
                return Unit.INSTANCE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            xme xme2 = folderEditViewModel.f;
            o85 o852 = new o85(wz5.a);
            xme2.getClass();
            xme2.m((Object) null, o852);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme3 = folderEditViewModel.f;
        o85 o853 = new o85(new xz5(new z26((String) obj, false)));
        xme3.getClass();
        xme3.m((Object) null, o853);
        return Unit.INSTANCE;
    }
}
