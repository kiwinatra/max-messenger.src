package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: hte  reason: default package */
public final class hte extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hte(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.b = stickersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hte hte = new hte(continuation, this.b);
        hte.a = obj;
        return hte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hte) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        t0e t0e = (t0e) this.a;
        KProperty[] kPropertyArr = StickersScreen.Y;
        StickersScreen stickersScreen = this.b;
        stickersScreen.getClass();
        if (t0e instanceof q0e) {
            q0e q0e = (q0e) t0e;
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            e9d e9d = null;
            ng3 a2 = b0h.a(q0e.a, (Bundle) null, 6);
            a2.f(q0e.b);
            q0e.c.forEach(new lj2(new nj2(1, a2, ng3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12), 10));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(stickersScreen);
            zx3 zx3 = stickersScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(stickersScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (t0e instanceof s0e) {
            e0b e0b = new e0b((Widget) stickersScreen);
            s0e s0e = (s0e) t0e;
            e0b.f(new o0b(s0e.a));
            CharSequence a3 = s0e.b.a(stickersScreen.getContext());
            if (a3 == null) {
                a3 = "";
            }
            e0b.i(a3);
            e0b.j();
        }
        return Unit.INSTANCE;
    }
}
