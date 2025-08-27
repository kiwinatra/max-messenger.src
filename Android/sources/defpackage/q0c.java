package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: q0c  reason: default package */
public final class q0c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileEditScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0c(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.b = profileEditScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q0c q0c = new q0c(this.b, continuation);
        q0c.a = obj;
        return q0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q0c) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (!Intrinsics.areEqual((Object) v5a, (Object) yzb.b)) {
            boolean z = v5a instanceof g0c;
            e9d e9d = null;
            ProfileEditScreen profileEditScreen = this.b;
            if (z) {
                kr7.z(profileEditScreen);
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                g0c g0c = (g0c) v5a;
                ng3 a2 = b0h.a(g0c.b, (Bundle) null, 6);
                a2.f(g0c.c);
                g0c.d.forEach(new lj2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 10), 8));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(profileEditScreen);
                zx3 zx3 = profileEditScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(profileEditScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            } else if (v5a instanceof h0c) {
                h0c h0c = (h0c) v5a;
                CharSequence a3 = h0c.b.a(profileEditScreen.getContext());
                if (a3 == null) {
                    return Unit.INSTANCE;
                }
                e0b e0b = new e0b((Widget) profileEditScreen);
                e0b.i(a3);
                Integer num = h0c.c;
                e0b.f(num != null ? new o0b(num.intValue()) : p0b.a);
                e0b.j();
            } else if (Intrinsics.areEqual((Object) v5a, (Object) d0c.b)) {
                KProperty[] kPropertyArr2 = ProfileEditScreen.w0;
                profileEditScreen.d0().n();
            } else if (Intrinsics.areEqual((Object) v5a, (Object) f0c.b)) {
                vzb.b.W0().b(":media-picker/select/photo", (Bundle) null);
            } else if (v5a instanceof e0c) {
                try {
                    profileEditScreen.startActivityForResult(((e0c) v5a).b, 333);
                    z5a.g((z5a) profileEditScreen.Z.getValue(), jgd.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    z68.f(profileEditScreen.getClass().getName(), "failed open camera", (Throwable) null);
                    profileEditScreen.d0().l();
                }
            } else if (v5a instanceof zzb) {
                profileEditScreen.startActivityForResult(((zzb) v5a).b, 666);
            } else if (Intrinsics.areEqual((Object) v5a, (Object) wzb.b)) {
                KProperty[] kPropertyArr3 = ProfileEditScreen.w0;
                ((edb) profileEditScreen.Y.getValue()).g(new eng(profileEditScreen, 1));
            } else if (Intrinsics.areEqual((Object) v5a, (Object) c0c.b)) {
                KProperty[] kPropertyArr4 = ProfileEditScreen.w0;
                if (profileEditScreen.getRouter().e().size() == 2) {
                    i9d i9d2 = (i9d) profileEditScreen.getRouter().e().get(1);
                    if (Intrinsics.areEqual((Object) i9d2 != null ? i9d2.a : null, (Object) profileEditScreen)) {
                        Activity d = ((bta) vzb.b.W0().a()).e().x().d();
                        if (d != null) {
                            d.finish();
                        }
                    }
                }
                vzb.b.W0().b(":chat-list", (Bundle) null);
            } else if (v5a instanceof b0c) {
                vzb.b.W0().b(wj6.j(((b0c) v5a).b, ":chats?id=", "&type=local"), (Bundle) null);
            } else if (v5a instanceof pa4) {
                vzb.b.Y0((pa4) v5a);
            } else if (v5a instanceof xzb) {
                xzb xzb = (xzb) v5a;
                int ordinal = xzb.c.ordinal();
                long j = xzb.b;
                if (ordinal == 0) {
                    vzb.b.W0().b(wj6.j(j, ":profile/edit/link?id=", "&type=local_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 1) {
                    vzb.b.W0().b(wj6.j(j, ":profile/edit/link?id=", "&type=server_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 2) {
                    vzb vzb = vzb.b;
                    vzb.getClass();
                    akd akd = (akd) ((bud) bzb.a.getAccessor().h(bud.class).getValue());
                    akd.getClass();
                    if (akd.m(PmsKey.f6accountnicknameenabled, false)) {
                        vzb.W0().b(wj6.j(j, ":profile/edit/link?id=", "&type=contact&flow=edit"), (Bundle) null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (v5a instanceof a0c) {
                vzb vzb2 = vzb.b;
                long j2 = ((a0c) v5a).b;
                ta4 W0 = vzb2.W0();
                W0.b(":profile/invite?id=" + j2, (Bundle) null);
            } else if (v5a instanceof p33) {
                kr7.z(profileEditScreen);
                profileEditScreen.getRouter().B(profileEditScreen);
            }
        }
        return Unit.INSTANCE;
    }
}
