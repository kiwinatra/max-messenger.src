package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;

/* renamed from: tgb  reason: default package */
public final /* synthetic */ class tgb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatController b;

    public /* synthetic */ tgb(PickerChatController pickerChatController, int i) {
        this.a = i;
        this.b = pickerChatController;
    }

    public final void onClick(View view) {
        PickerChatController pickerChatController = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatController.z0;
                whb f0 = pickerChatController.f0();
                if (!f0.D0) {
                    f0.D0 = true;
                    xag.h(f0.B0, new q33());
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr2 = PickerChatController.z0;
                whb f02 = pickerChatController.f0();
                if (!f02.D0) {
                    f02.D0 = true;
                    xag.h(f02.B0, new q33());
                    return;
                }
                return;
        }
    }
}
