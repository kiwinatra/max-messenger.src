package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: d56  reason: default package */
public final class d56 extends SuspendLambda implements Function2 {
    public final /* synthetic */ x16 a;
    public final /* synthetic */ FolderSettingsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d56(x16 x16, Continuation continuation, FolderSettingsViewModel folderSettingsViewModel) {
        super(2, continuation);
        this.a = x16;
        this.b = folderSettingsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d56(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d56) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z26 z26 = new z26(this.a.a, false);
        xme xme = this.b.k;
        o85 o85 = new o85(new w46(z26));
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
