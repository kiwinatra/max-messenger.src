package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: v65  reason: default package */
public final /* synthetic */ class v65 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndlessRecyclerView2 b;

    public /* synthetic */ v65(EndlessRecyclerView2 endlessRecyclerView2, int i) {
        this.a = i;
        this.b = endlessRecyclerView2;
    }

    public final Object invoke() {
        EndlessRecyclerView2 endlessRecyclerView2 = this.b;
        switch (this.a) {
            case 0:
                int i = EndlessRecyclerView2.g2;
                String name = endlessRecyclerView2.getClass().getName();
                String resourceName = endlessRecyclerView2.getResources().getResourceName(endlessRecyclerView2.getId());
                return StringsKt__StringsJVMKt.replace$default(name + "-" + resourceName, ".", "_", false, 4, (Object) null);
            case 1:
                KProperty[] kPropertyArr = PickerChatsListWidget.Z;
                return ev0.i(endlessRecyclerView2.getContext());
            case 2:
                KProperty[] kPropertyArr2 = PickerChatsListWidget2.w0;
                return ev0.i(endlessRecyclerView2.getContext());
            default:
                KProperty[] kPropertyArr3 = PickerMembersListWidget.v0;
                return ev0.i(endlessRecyclerView2.getContext());
        }
    }
}
