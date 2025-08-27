package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: g5e  reason: default package */
public final /* synthetic */ class g5e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ g5e(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    public final Object invoke() {
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ShareDataPickerScreen.A0;
                dc9 dc9 = new dc9(shareDataPickerScreen.getContext());
                dc9.setId(zza.a);
                dc9.setInputHint(a0b.a);
                dc9.setRightOuterIconActionState(wb9.a);
                dc9.setRightOuterIconTouchListener(kne.a(dc9.getContext(), new vra(23, shareDataPickerScreen, dc9)));
                dc9.setLeftInnerIconTouchListener(kne.a(dc9.getContext(), new g5e(shareDataPickerScreen, 3)));
                return dc9;
            case 1:
                shareDataPickerScreen.y0.k();
                return Unit.INSTANCE;
            case 2:
                return shareDataPickerScreen.y0;
            default:
                KProperty[] kPropertyArr2 = ShareDataPickerScreen.A0;
                ((e5e) shareDataPickerScreen.l0().c).k.C((og9) null);
                return Unit.INSTANCE;
        }
    }
}
