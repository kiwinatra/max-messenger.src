package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: xyb  reason: default package */
public final class xyb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xyb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xyb xyb = new xyb(continuation, this.b);
        xyb.a = obj;
        return xyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xyb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yxb yxb = (yxb) this.a;
        boolean z = yxb instanceof wxb;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        if (z) {
            kr7.z(profileEditAdminPermissionsWidget);
            KProperty[] kPropertyArr = BottomSheetWidget.v0;
            wxb wxb = (wxb) yxb;
            e9d e9d = null;
            ng3 a2 = b0h.a(wxb.a, (Bundle) null, 6);
            a2.f(wxb.b);
            wxb.c.forEach(new mn2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9), 1));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(profileEditAdminPermissionsWidget);
            zx3 zx3 = profileEditAdminPermissionsWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(profileEditAdminPermissionsWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (yxb instanceof xxb) {
            z3a z3a = profileEditAdminPermissionsWidget.Z;
            if (z3a != null) {
                z3a.o();
            }
            e0b e0b = new e0b((Widget) profileEditAdminPermissionsWidget);
            xxb xxb = (xxb) yxb;
            e0b.h(xxb.a);
            Integer num = xxb.b;
            if (num != null) {
                e0b.f(new o0b(num.intValue()));
            }
            profileEditAdminPermissionsWidget.Z = e0b.j();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
