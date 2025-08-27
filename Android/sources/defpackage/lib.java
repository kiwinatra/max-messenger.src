package defpackage;

import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: lib  reason: default package */
public final /* synthetic */ class lib implements ehb {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ lib(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    public final void t(long j, ckb ckb) {
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatsListWidget.Z;
                ((whb) pickerChatsListWidget.a.getValue()).k(j);
                return;
            default:
                KProperty[] kPropertyArr2 = PickerChatsListWidget.Z;
                ((whb) pickerChatsListWidget.a.getValue()).k(j);
                return;
        }
    }
}
