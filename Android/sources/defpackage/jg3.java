package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: jg3  reason: default package */
public final class jg3 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg3 b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jg3(defpackage.lg3 r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            ig3 r2 = defpackage.ig3.NORMAL
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg3.<init>(lg3, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ig3 ig3 = (ig3) obj2;
                    ig3 ig32 = (ig3) obj;
                    js9 js9 = fu4.k;
                    lg3 lg3 = this.b;
                    int i = js9.f(lg3).i(ig3.a);
                    int ordinal = ig3.ordinal();
                    afe afe = lg3.Z1;
                    if (ordinal == 0) {
                        lg3.setInputsEnabled(false);
                        ArrayList I0 = lg3.I0(lg3);
                        kg3 kg3 = new kg3(lg3, ig3, 0);
                        afe.getClass();
                        tee tee = new tee(afe, i, 1);
                        f14 f14 = f14.b;
                        xee xee = new xee(I0, kg3, afe, tee, (Continuation) null);
                        d14 d14 = afe.a;
                        aje v = ev0.v(d14, (CoroutineContext) null, f14, xee, 1);
                        KProperty[] kPropertyArr = afe.e;
                        afe.d.setValue(afe, kPropertyArr[1], v);
                        aje v2 = ev0.v(d14, (CoroutineContext) null, f14, new zee(I0, afe, new p2c(2, afe, afe.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 4), (Continuation) null), 1);
                        afe.c.setValue(afe, kPropertyArr[0], v2);
                        return;
                    } else if (ordinal == 1) {
                        lg3.setInputsEnabled(!lg3.getDisableInputsForError());
                        if (Build.VERSION.SDK_INT >= 30) {
                            b0h.K(lg3, rw6.REJECT);
                        }
                        ArrayList I02 = lg3.I0(lg3);
                        kg3 kg32 = new kg3(lg3, ig3, 1);
                        afe.b();
                        ohe ohe = new ohe(lg3, ohe.p);
                        phe phe = new phe(c44.DEFAULT_ASPECT_RATIO);
                        phe.b(1500.0f);
                        phe.a(0.2f);
                        ohe.m = phe;
                        ohe.a = 3000.0f;
                        ohe.g();
                        tee tee2 = new tee(afe, i, 2);
                        aje v3 = ev0.v(afe.a, (CoroutineContext) null, f14.b, new vee(I02, kg32, tee2, 200, (Continuation) null), 1);
                        afe.d.setValue(afe, afe.e[1], v3);
                        return;
                    } else if (ordinal == 2) {
                        lg3.setInputsEnabled(true);
                        ArrayList I03 = lg3.I0(lg3);
                        kg3 kg33 = new kg3(lg3, ig3, 2);
                        afe.b();
                        tee tee3 = new tee(afe, i, 0);
                        aje v4 = ev0.v(afe.a, (CoroutineContext) null, f14.b, new vee(I03, kg33, tee3, 300, (Continuation) null), 1);
                        afe.d.setValue(afe, afe.e[1], v4);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    lg3 lg32 = this.b;
                    lg32.setAdapter(new pee(intValue, lg32, new zj2(3, lg32)));
                    return;
                }
                return;
        }
    }
}
