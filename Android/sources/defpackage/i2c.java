package defpackage;

import android.os.Bundle;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: i2c  reason: default package */
public final class i2c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileInviteScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2c(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.b = profileInviteScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i2c i2c = new i2c(this.b, continuation);
        i2c.a = obj;
        return i2c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i2c) create((f2c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        f2c f2c = (f2c) this.a;
        boolean z = f2c instanceof e2c;
        ProfileInviteScreen profileInviteScreen = this.b;
        if (z) {
            e2c e2c = (e2c) f2c;
            CharSequence a2 = e2c.a.a(profileInviteScreen.getContext());
            if (a2 == null) {
                return Unit.INSTANCE;
            }
            e0b e0b = new e0b((Widget) profileInviteScreen);
            e0b.f(new o0b(e2c.b));
            e0b.i(a2);
            e0b.j();
        } else if (f2c instanceof b2c) {
            b59.k(profileInviteScreen.getContext(), ((b2c) f2c).a);
        } else if (f2c instanceof d2c) {
            lw3 h = m58.b(ix3.a).h(((d2c) f2c).a);
            KProperty[] kPropertyArr = ProfileInviteScreen.w;
            profileInviteScreen.getClass();
            h.o((ImageView) profileInviteScreen.v.getValue(profileInviteScreen, ProfileInviteScreen.w[0])).build().o(profileInviteScreen);
        } else if (f2c instanceof c2c) {
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            c2c c2c = (c2c) f2c;
            e9d e9d = null;
            ng3 a3 = b0h.a(c2c.a, (Bundle) null, 6);
            a3.f(c2c.b);
            c2c.c.forEach(new lj2(new nj2(1, a3, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11), 9));
            ConfirmationBottomSheet e = a3.e();
            e.setTargetController(profileInviteScreen);
            zx3 zx3 = profileInviteScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(profileInviteScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
