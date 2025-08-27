package defpackage;

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
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: h0e  reason: default package */
public final class h0e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsBlacklistScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0e(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.b = settingsBlacklistScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h0e h0e = new h0e(continuation, this.b);
        h0e.a = obj;
        return h0e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h0e) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            i3e.b.Y0((pa4) v5a);
        } else {
            boolean z = v5a instanceof xzd;
            SettingsBlacklistScreen settingsBlacklistScreen = this.b;
            if (z) {
                xzd xzd = (xzd) v5a;
                KProperty[] kPropertyArr = SettingsBlacklistScreen.x;
                settingsBlacklistScreen.getClass();
                KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(xzd.b, xzd.e, 4);
                for (wzd wzd : xzd.c) {
                    boolean z2 = wzd.c;
                    ngf ngf = wzd.a;
                    int i = wzd.b;
                    if (z2) {
                        a2.d(i, (igf) ngf);
                    } else {
                        a2.c(i, (igf) ngf);
                    }
                }
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(settingsBlacklistScreen);
                zx3 zx3 = settingsBlacklistScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                e9d e9d = null;
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(settingsBlacklistScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            } else if (v5a instanceof yzd) {
                e0b e0b = new e0b((Widget) settingsBlacklistScreen);
                e0b.h(((yzd) v5a).b);
                e0b.j();
            } else if (v5a instanceof zzd) {
                e0b e0b2 = new e0b((Widget) settingsBlacklistScreen);
                e0b2.f(new o0b(sza.b));
                e0b2.h(((zzd) v5a).b);
                e0b2.j();
            }
        }
        return Unit.INSTANCE;
    }
}
