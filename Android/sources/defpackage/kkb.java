package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: kkb  reason: default package */
public final /* synthetic */ class kkb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerMembersListWidget b;

    public /* synthetic */ kkb(PickerMembersListWidget pickerMembersListWidget, int i) {
        this.a = i;
        this.b = pickerMembersListWidget;
    }

    public final Object invoke() {
        PickerMembersListWidget pickerMembersListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerMembersListWidget.v0;
                pickerMembersListWidget.getClass();
                KProperty kProperty = PickerMembersListWidget.v0[0];
                long longValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                cs2 cs2 = cs2.a;
                return new skb(longValue, (a59) cs2.getAccessor().g(a59.class), (y59) cs2.getAccessor().g(y59.class), cs2.getAccessor().h(qx2.class));
            case 1:
                KProperty[] kPropertyArr2 = PickerMembersListWidget.v0;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(pickerMembersListWidget.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d));
                oneMeEmptyView.setSubtitle(new igf(ead.c));
                return oneMeEmptyView;
            default:
                KProperty[] kPropertyArr3 = PickerMembersListWidget.v0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(hra.h0);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                endlessRecyclerView2.setAdapter(pickerMembersListWidget.w);
                endlessRecyclerView2.j(new fz2(new v65(endlessRecyclerView2, 3), new wk(27, endlessRecyclerView2, pickerMembersListWidget), new gl1(26), new gl1(26)));
                endlessRecyclerView2.l(new ia4(endlessRecyclerView2));
                if (pickerMembersListWidget.d0()) {
                    pickerMembersListWidget.c0(endlessRecyclerView2);
                }
                pickerMembersListWidget.X = y7e.n(endlessRecyclerView2);
                return endlessRecyclerView2;
        }
    }
}
