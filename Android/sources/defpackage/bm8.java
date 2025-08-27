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
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: bm8  reason: default package */
public final class bm8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bm8 bm8 = new bm8(continuation, this.b);
        bm8.a = obj;
        return bm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bm8) create((vj8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vj8 vj8 = (vj8) this.a;
        boolean z = vj8 instanceof pj8;
        MediaBarWidget mediaBarWidget = this.b;
        int i = 0;
        e9d e9d = null;
        if (z) {
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mediaBarWidget.m0().setText(mediaBarWidget.v.f.j);
            mediaBarWidget.u0((prd) mediaBarWidget.r0().D0.a.getValue());
            boolean z2 = ((Boolean) mediaBarWidget.r0().B0.a.getValue()).booleanValue() || mediaBarWidget.r0().l();
            mediaBarWidget.m0().setVisibility(z2 ? 0 : 8);
            KProperty kProperty = MediaBarWidget.c1[16];
            oz1 oz1 = (oz1) mediaBarWidget.N0.getValue();
            if (!(!z2)) {
                i = 8;
            }
            oz1.setVisibility(i);
            mediaBarWidget.v0((n00) mediaBarWidget.r0().y.getValue());
            orb n0 = mediaBarWidget.n0();
            if (!n0.isLaidOut() || n0.isLayoutRequested()) {
                n0.addOnLayoutChangeListener(new em8(mediaBarWidget, 1));
            } else if (mediaBarWidget.r0().l()) {
                mediaBarWidget.n0().k();
            } else {
                orb n02 = mediaBarWidget.n0();
                int i2 = orb.z;
                n02.setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
            }
            z5a.g(mediaBarWidget.o, jgd.CHAT_ATTACH_PICKER);
        } else if (vj8 instanceof mj8) {
            if (((mj8) vj8).a) {
                KProperty[] kPropertyArr2 = MediaBarWidget.c1;
                mediaBarWidget.m0().setText((CharSequence) null);
            }
            KProperty[] kPropertyArr3 = MediaBarWidget.c1;
            mediaBarWidget.n0().j(true);
        } else if (vj8 instanceof nj8) {
            KProperty[] kPropertyArr4 = MediaBarWidget.c1;
            mediaBarWidget.m0().e(false);
        } else if (vj8 instanceof qj8) {
            KProperty[] kPropertyArr5 = MediaBarWidget.c1;
            mediaBarWidget.getClass();
            KProperty[] kPropertyArr6 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(new igf(mra.B), (Bundle) null, 6);
            a2.a(new pg3(1, new igf(mra.z), og3.a));
            a2.a(new pg3(2, new igf(mra.A), og3.b));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(mediaBarWidget);
            zx3 zx3 = mediaBarWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(mediaBarWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (vj8 instanceof lj8) {
            KProperty[] kPropertyArr7 = MediaBarWidget.c1;
            xag.h(mediaBarWidget.k0().o, dm6.a);
        } else if (vj8 instanceof oj8) {
            KProperty[] kPropertyArr8 = MediaBarWidget.c1;
            om6 k0 = mediaBarWidget.k0();
            tqd tqd = ((oj8) vj8).a;
            k0.getClass();
            xag.h(k0.o, new fm6(tqd));
        } else if (vj8 instanceof sj8) {
            sj8 sj8 = (sj8) vj8;
            d48 M = cvg.M(sj8.a.a);
            KProperty[] kPropertyArr9 = MediaBarWidget.c1;
            mediaBarWidget.s0(M, sj8.b, "SELECTED_MEDIA_ALBUM");
        } else if (vj8 instanceof tj8) {
            MediaBarWidget.c0(mediaBarWidget, kra.k, mra.V);
        } else if (vj8 instanceof rj8) {
            MediaBarWidget.c0(mediaBarWidget, kra.j, mra.U);
        } else if (vj8 instanceof uj8) {
            MediaBarWidget.d0(mediaBarWidget, ((uj8) vj8).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
