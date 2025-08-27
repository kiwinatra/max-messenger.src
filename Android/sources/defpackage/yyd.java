package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.SettingMediaScreen;

/* renamed from: yyd  reason: default package */
public final class yyd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingMediaScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yyd(Continuation continuation, SettingMediaScreen settingMediaScreen) {
        super(2, continuation);
        this.b = settingMediaScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yyd yyd = new yyd(continuation, this.b);
        yyd.a = obj;
        return yyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yyd) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        e9d e9d = null;
        if (v5a instanceof r2e) {
            r2e r2e = (r2e) v5a;
            KProperty[] kPropertyArr = SettingMediaScreen.w;
            SettingMediaScreen settingMediaScreen = this.b;
            settingMediaScreen.getClass();
            KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
            ng3 a2 = b0h.a(r2e.b, (Bundle) null, 4);
            for (q2e q2e : r2e.c) {
                boolean z = q2e.c;
                ngf ngf = q2e.a;
                int i = q2e.b;
                if (z) {
                    a2.b(i, (igf) ngf);
                } else {
                    a2.d(i, (igf) ngf);
                }
            }
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(settingMediaScreen);
            zx3 zx3 = settingMediaScreen;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(settingMediaScreen);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (v5a instanceof pa4) {
            xyd.b.Y0((pa4) v5a);
        } else if (v5a instanceof p2e) {
            xyd.b.W0().b(":settings/caching", (Bundle) null);
        }
        return Unit.INSTANCE;
    }
}
