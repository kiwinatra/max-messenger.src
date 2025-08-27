package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: m76  reason: default package */
public final /* synthetic */ class m76 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ m76(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final Object invoke() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = FoldersPickerScreen.z;
                return ev0.i(recyclerView.getContext());
            default:
                KProperty[] kPropertyArr2 = PickerContactsListWidget.x0;
                return ev0.i(recyclerView.getContext());
        }
    }
}
