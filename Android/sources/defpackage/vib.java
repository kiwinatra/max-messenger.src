package defpackage;

import kotlin.reflect.KProperty;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: vib  reason: default package */
public final /* synthetic */ class vib implements ehb {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    public /* synthetic */ vib(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        this.a = i;
        this.b = pickerChatsListWidget2;
    }

    public final void t(long j, ckb ckb) {
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatsListWidget2.w0;
                pickerChatsListWidget2.e0().j(j, ckb);
                return;
            default:
                KProperty[] kPropertyArr2 = PickerChatsListWidget2.w0;
                pickerChatsListWidget2.e0().j(j, ckb);
                return;
        }
    }
}
