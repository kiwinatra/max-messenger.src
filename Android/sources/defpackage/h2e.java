package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;

/* renamed from: h2e  reason: default package */
public final class h2e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SettingsListScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h2e(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.b = settingsListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h2e h2e = new h2e(this.b, continuation);
        h2e.a = obj;
        return h2e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h2e) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        e9d e9d = null;
        if (v5a instanceof v2e) {
            Boxing.boxBoolean(z1e.b.W0().b(wj6.j(((v2e) v5a).b, ":profile/edit?id=", "&type=contact"), (Bundle) null));
        } else if (v5a instanceof w2e) {
            Boxing.boxBoolean(z1e.b.W0().b(wj6.j(((w2e) v5a).b, ":profile/avatars?id=", "&type=contact"), (Bundle) null));
        } else {
            boolean areEqual = Intrinsics.areEqual((Object) v5a, (Object) s2e.b);
            SettingsListScreen settingsListScreen = this.b;
            if (areEqual) {
                KProperty[] kPropertyArr = SettingsListScreen.y0;
                settingsListScreen.getClass();
                KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(new igf(xza.r), (Bundle) null, 6);
                int i = wza.d;
                igf igf = new igf(xza.u);
                og3 og3 = og3.c;
                a2.a(new pg3(i, igf, og3));
                a2.a(new pg3(wza.c, new igf(xza.t), og3));
                a2.a(new pg3(wza.b, new igf(xza.s), og3));
                a2.a(new pg3(wza.a, new igf(xza.o), og3.b));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(settingsListScreen);
                zx3 zx3 = settingsListScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(settingsListScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            } else if (Intrinsics.areEqual((Object) v5a, (Object) t2e.b)) {
                KProperty[] kPropertyArr3 = SettingsListScreen.y0;
                ((edb) settingsListScreen.X.getValue()).g(new eng(settingsListScreen, 1));
            } else if (v5a instanceof u2e) {
                settingsListScreen.startActivityForResult(((u2e) v5a).b, 666);
            } else if (v5a instanceof x2e) {
                try {
                    settingsListScreen.startActivityForResult(((x2e) v5a).b, 333);
                    z5a.g((z5a) settingsListScreen.Y.getValue(), jgd.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    z68.f(settingsListScreen.getClass().getName(), "failed open camera", (Throwable) null);
                    settingsListScreen.g0().q();
                }
            } else if (Intrinsics.areEqual((Object) v5a, (Object) y2e.b)) {
                Boxing.boxBoolean(z1e.b.W0().b(":media-picker/select/photo", (Bundle) null));
            } else if (v5a instanceof z2e) {
                z2e z2e = (z2e) v5a;
                CharSequence a3 = z2e.b.a(settingsListScreen.getContext());
                if (a3 == null) {
                    return Unit.INSTANCE;
                }
                e0b e0b = (e0b) settingsListScreen.y.getValue();
                e0b.i(a3);
                Integer num = z2e.c;
                e0b.f(num != null ? new o0b(num.intValue()) : p0b.a);
                e0b.j();
            } else if (v5a instanceof pa4) {
                z1e.b.Y0((pa4) v5a);
            }
        }
        return Unit.INSTANCE;
    }
}
