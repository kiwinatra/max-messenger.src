package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: i5e  reason: default package */
public final class i5e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ShareDataPickerScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i5e(ShareDataPickerScreen shareDataPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.b = shareDataPickerScreen;
        this.c = viewGroup;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i5e i5e = new i5e(this.b, (ViewGroup) this.c, continuation);
        i5e.a = obj;
        return i5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i5e) create((pg9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pg9 pg9 = (pg9) this.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        e9d e9d = shareDataPickerScreen.x0;
        if (e9d != null) {
            int ordinal = pg9.a.ordinal();
            View view = this.c;
            if (ordinal == 0) {
                xr8 xr8 = shareDataPickerScreen.z0;
                if (xr8 != null) {
                    KProperty[] kPropertyArr = xr8.m;
                    xr8.e(true);
                }
                shareDataPickerScreen.n0().setLeftIcon(cad.c1);
                h88.f(view, ShareDataPickerScreen.B0, (Function1) null);
            } else if (ordinal == 1) {
                if (!e9d.n()) {
                    e9d.R(iq.n(new MediaKeyboardWidget(shareDataPickerScreen.b, 0, true, 2, (DefaultConstructorMarker) null), (ey3) null, (ey3) null));
                }
                WeakHashMap weakHashMap = gag.a;
                v9g.u(view, (vla) null);
                xr8 xr82 = shareDataPickerScreen.z0;
                if (xr82 != null) {
                    xr82.f();
                }
                shareDataPickerScreen.n0().setLeftIcon(cad.g1);
            } else if (ordinal == 2) {
                sn0 sn0 = ((ShareDataPickerScreen) shareDataPickerScreen.y0.b).Z;
                if (sn0.isInitialized()) {
                    ((dc9) sn0.getValue()).e(true);
                }
                shareDataPickerScreen.n0().setLeftIcon(cad.c1);
                bs0.K(new ps5(bs0.Y(new kyd(pq7.f, 2), 1), new k5e((ViewGroup) view, (Continuation) null), 5), shareDataPickerScreen.getViewLifecycleScope());
            }
        }
        return Unit.INSTANCE;
    }
}
