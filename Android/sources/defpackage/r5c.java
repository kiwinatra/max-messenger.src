package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: r5c  reason: default package */
public final class r5c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r5c(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.b = profileScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r5c r5c = new r5c(continuation, this.b);
        r5c.a = obj;
        return r5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r5c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        e9d e9d = null;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h6c h6c = (h6c) this.a;
        boolean z = h6c instanceof d6c;
        ProfileScreen profileScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = ProfileScreen.D0;
            profileScreen.getClass();
            m58.b(ix3.a).h(((d6c) h6c).a).o((fqa) profileScreen.w0.getValue(profileScreen, ProfileScreen.D0[9])).build().o(profileScreen);
        } else if (h6c instanceof c6c) {
            c6c c6c = (c6c) h6c;
            KProperty[] kPropertyArr2 = ProfileScreen.D0;
            profileScreen.getClass();
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(c6c.a, c6c.d, 4);
            a2.f(c6c.b);
            pg3[] pg3Arr = (pg3[]) c6c.c.toArray(new pg3[0]);
            a2.a((pg3[]) Arrays.copyOf(pg3Arr, pg3Arr.length));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(profileScreen);
            zx3 zx3 = profileScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(profileScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (h6c instanceof b6c) {
            CharSequence a3 = ((b6c) h6c).a.a(profileScreen.getContext());
            if (a3 != null) {
                e0b e0b = new e0b((Widget) profileScreen);
                e0b.f(r0b.a);
                e0b.g(t0b.a);
                e0b.i(a3);
                e0b.d(new z3a(3, h6c));
                e0b.j();
            }
        } else if (h6c instanceof g6c) {
            e0b e0b2 = new e0b((Widget) profileScreen);
            g6c g6c = (g6c) h6c;
            Integer num = g6c.a;
            if (num != null) {
                e0b2.f(new o0b(num.intValue()));
            }
            e0b2.h(g6c.b);
            e0b2.j();
        } else if (h6c instanceof y5c) {
            String str = hsg.n;
            Context context = profileScreen.getContext();
            CharSequence a4 = ((y5c) h6c).a.a(profileScreen.getContext());
            if (a4 == null) {
                a4 = "";
            }
            hsg.G(context, a4);
        } else if (h6c instanceof f6c) {
            KProperty[] kPropertyArr4 = ProfileScreen.D0;
            profileScreen.getClass();
            m58.b(ix3.a).h(((f6c) h6c).a).o((r1e) profileScreen.x0.getValue(profileScreen, ProfileScreen.D0[10])).build().o(profileScreen);
        } else if (h6c instanceof e6c) {
            e6c e6c = (e6c) h6c;
            e6c.getClass();
            Bundle f = o54.f(TuplesKt.to("profile:participant_id_for_action", Boxing.boxLong(0)));
            KProperty[] kPropertyArr5 = ProfileScreen.D0;
            EndlessRecyclerView2 f0 = profileScreen.f0();
            e6c.getClass();
            pzc M = f0.M(0);
            View view = M != null ? M.a : null;
            if (view != null) {
                lw3 m = m58.b(ix3.b).m(f);
                e6c.getClass();
                m.h((Collection) null).o(view).k(vo4.c().getDisplayMetrics().density * 12.0f).build().o(profileScreen);
            }
        } else if (Intrinsics.areEqual((Object) h6c, (Object) z5c.a)) {
            KProperty[] kPropertyArr6 = ProfileScreen.D0;
            ((edb) profileScreen.A0.getValue()).g(new eng(profileScreen, 1));
        } else if (h6c instanceof a6c) {
            try {
                profileScreen.startActivityForResult(((a6c) h6c).a, 333);
                z5a.g((z5a) profileScreen.B0.getValue(), jgd.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                KProperty[] kPropertyArr7 = ProfileScreen.D0;
                profileScreen.g0().r();
                z68.f(ProfileScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
