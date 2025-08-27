package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: a56  reason: default package */
public final class a56 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FolderSettingsViewModel c;
    public final /* synthetic */ x16 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a56(boolean z, FolderSettingsViewModel folderSettingsViewModel, x16 x16, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = folderSettingsViewModel;
        this.o = x16;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a56(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a56) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean z = this.b;
        x16 x16 = this.o;
        FolderSettingsViewModel folderSettingsViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (z) {
                folderSettingsViewModel.g.e("FOLDER_ADD_TEMPLATE_CLICK_ON_ROW");
            } else {
                folderSettingsViewModel.g.e("FOLDER_ADD_TEMPLATE_CLICK_ON_PLUS");
            }
            if (x16.e) {
                return Unit.INSTANCE;
            }
            folderSettingsViewModel.g.e("FOLDER_CREATE_FROM_TEMPLATE");
            int size = ((y46) folderSettingsViewModel.i.getValue()).a.size();
            m58 m58 = x16.b;
            s67 s67 = m58 instanceof s67 ? (s67) m58 : null;
            zx5 zx5 = new zx5(x16.a, x16.c, (s67 == null || (charSequence = s67.k) == null) ? null : charSequence.toString(), size, x16.d, x16.f, true, false, CollectionsKt.emptyList(), false, SetsKt.emptySet(), SetsKt.emptySet(), SetsKt.emptySet(), CollectionsKt.emptyList(), Boxing.boxLong(0), MapsKt.emptyMap(), CollectionsKt.emptyList(), SetsKt.emptySet());
            this.a = 1;
            if (u82.e(folderSettingsViewModel.e, zx5, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (z) {
            gc8 c2 = ((osa) folderSettingsViewModel.h).c();
            z46 z46 = new z46(x16, (Continuation) null, folderSettingsViewModel);
            this.a = 2;
            if (ev0.I(c2, z46, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
