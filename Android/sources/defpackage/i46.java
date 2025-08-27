package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: i46  reason: default package */
public final class i46 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderSettingsFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i46(FolderSettingsFragment folderSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i46 i46 = new i46(this.b, continuation);
        i46.a = obj;
        return i46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i46) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        x46 x46 = (x46) ((o85) this.a).a;
        boolean z = x46 instanceof u46;
        FolderSettingsFragment folderSettingsFragment = this.b;
        if (z) {
            ((z16) folderSettingsFragment.B1).n1();
        } else if (x46 instanceof v46) {
            ((z16) folderSettingsFragment.B1).o1(xy5.a);
        } else if (x46 instanceof w46) {
            ((z16) folderSettingsFragment.B1).p1(((w46) x46).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
