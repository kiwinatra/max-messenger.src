package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: wyb  reason: default package */
public final class wyb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wyb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wyb wyb = new wyb(continuation, this.b);
        wyb.a = obj;
        return wyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wyb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof dyb) {
            vzb.b.W0().b(wj6.j(((dyb) v5a).b, ":chats?id=", "&type=local"), (Bundle) null);
        } else if (v5a instanceof p33) {
            ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
            kr7.z(profileEditAdminPermissionsWidget);
            profileEditAdminPermissionsWidget.getRouter().B(profileEditAdminPermissionsWidget);
        } else if (v5a instanceof pa4) {
            vzb.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
