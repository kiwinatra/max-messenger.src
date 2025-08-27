package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: yyb  reason: default package */
public final class yyb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yyb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yyb yyb = new yyb(continuation, this.b);
        yyb.a = obj;
        return yyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yyb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        iyb iyb = (iyb) this.a;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        r3d r3d = profileEditAdminPermissionsWidget.X;
        if (r3d.isInitialized()) {
            ((OneMeButton) r3d.getValue()).setVisibility(iyb.b ? 0 : 8);
            profileEditAdminPermissionsWidget.f0();
        }
        profileEditAdminPermissionsWidget.x.G(iyb.a);
        return Unit.INSTANCE;
    }
}
