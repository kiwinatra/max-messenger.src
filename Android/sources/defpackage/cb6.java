package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: cb6  reason: default package */
public final /* synthetic */ class cb6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ cb6(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    public final Object invoke() {
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ForwardPickerScreen.I0;
                ((ya6) forwardPickerScreen.l0().c).q.C((og9) null);
                return Unit.INSTANCE;
            case 1:
                return forwardPickerScreen.E0;
            case 2:
                KProperty[] kPropertyArr2 = ForwardPickerScreen.I0;
                dc9 dc9 = new dc9(forwardPickerScreen.getContext());
                dc9.setId(era.c);
                dc9.setInputHint(gra.d);
                dc9.setRightOuterIconActionState(wb9.a);
                dc9.setRightOuterIconTouchListener(kne.a(dc9.getContext(), new j35(16, (Object) forwardPickerScreen, (Object) dc9)));
                dc9.setLeftInnerIconTouchListener(kne.a(dc9.getContext(), new cb6(forwardPickerScreen, 0)));
                return dc9;
            case 3:
                forwardPickerScreen.E0.k();
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr3 = ForwardPickerScreen.I0;
                ForwardPickerScreen.n0(forwardPickerScreen, forwardPickerScreen.p0(), new igf(blc.forward_author_visibility_onboarding), true);
                forwardPickerScreen.x0 = new a46(8);
                return Unit.INSTANCE;
        }
    }
}
