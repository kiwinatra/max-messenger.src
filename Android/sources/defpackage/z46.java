package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: z46  reason: default package */
public final class z46 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FolderSettingsViewModel a;
    public final /* synthetic */ x16 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z46(x16 x16, Continuation continuation, FolderSettingsViewModel folderSettingsViewModel) {
        super(2, continuation);
        this.a = folderSettingsViewModel;
        this.b = x16;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z46(this.b, continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z46) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xme xme = this.a.k;
        o85 o85 = new o85(new w46(new z26(this.b.a, true)));
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
