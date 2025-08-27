package defpackage;

import android.util.AttributeSet;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: t2  reason: default package */
public final /* synthetic */ class t2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractPickerScreen b;

    public /* synthetic */ t2(AbstractPickerScreen abstractPickerScreen, int i) {
        this.a = i;
        this.b = abstractPickerScreen;
    }

    public final Object invoke() {
        AbstractPickerScreen abstractPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = AbstractPickerScreen.x;
                return abstractPickerScreen.f0(abstractPickerScreen.getContext());
            default:
                KProperty[] kPropertyArr2 = AbstractPickerScreen.x;
                OneMeContactsChipGroup oneMeContactsChipGroup = new OneMeContactsChipGroup(abstractPickerScreen.getContext(), (AttributeSet) null);
                oneMeContactsChipGroup.getEditText().setHint(((ngf) abstractPickerScreen.i0().getValue()).a(oneMeContactsChipGroup.getContext()));
                oneMeContactsChipGroup.setCallback(new wsb(abstractPickerScreen, oneMeContactsChipGroup));
                oneMeContactsChipGroup.getEditText().addTextChangedListener(new u2(0, abstractPickerScreen));
                return oneMeContactsChipGroup;
        }
    }
}
