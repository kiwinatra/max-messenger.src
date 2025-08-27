package defpackage;

import android.util.AttributeSet;
import android.view.GestureDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: sgb  reason: default package */
public final /* synthetic */ class sgb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatController b;

    public /* synthetic */ sgb(PickerChatController pickerChatController, int i) {
        this.a = i;
        this.b = pickerChatController;
    }

    public final Object invoke() {
        PickerChatController pickerChatController = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatController.z0;
                whb f0 = pickerChatController.f0();
                shb shb = whb.E0;
                f0.A0.C((og9) null);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr2 = PickerChatController.z0;
                h3b d = o54.d(pickerChatController.getContext(), (AttributeSet) null);
                d.setId(hra.j);
                d.setTransitionName(d.getContext().getString(jra.q));
                d.setTitle(jra.c0);
                d.setForm(z2b.a);
                d.setLeftActions(new p2b(new vq7(27, (Object) pickerChatController)));
                return d;
            case 2:
                KProperty[] kPropertyArr3 = PickerChatController.z0;
                OneMeContactsChipGroup oneMeContactsChipGroup = new OneMeContactsChipGroup(pickerChatController.getContext(), (AttributeSet) null);
                oneMeContactsChipGroup.getEditText().setHint(jra.b0);
                oneMeContactsChipGroup.setCallback(new ata(20, pickerChatController, oneMeContactsChipGroup));
                oneMeContactsChipGroup.getEditText().addTextChangedListener(new u2(13, pickerChatController));
                return oneMeContactsChipGroup;
            case 3:
                KProperty[] kPropertyArr4 = PickerChatController.z0;
                dc9 dc9 = new dc9(pickerChatController.getContext());
                dc9.setId(hra.e0);
                t53 t53 = new t53(4, (Object) pickerChatController, (Object) dc9);
                dc9.setInputHint(jra.a0);
                GestureDetector gestureDetector = new GestureDetector(dc9.getContext(), t53);
                dc9.setRightOuterIconActionState(wb9.a);
                dc9.setRightOuterIconTouchListener(new pg6(gestureDetector, 6));
                dc9.setLeftInnerIconTouchListener(kne.a(dc9.getContext(), new sgb(pickerChatController, 0)));
                return dc9;
            case 4:
                return pickerChatController.x0;
            default:
                KProperty[] kPropertyArr5 = PickerChatController.z0;
                whb f02 = pickerChatController.f0();
                f02.A0.C(og9.o);
                h88.f(pickerChatController.e0(), PickerChatController.A0, (Function1) null);
                ((dc9) pickerChatController.X.getValue()).setLeftIcon(cad.c1);
                return Unit.INSTANCE;
        }
    }
}
