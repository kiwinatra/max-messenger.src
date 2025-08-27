package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: rjb  reason: default package */
public final /* synthetic */ class rjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ rjb(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    public final Object invoke() {
        PickerContactsListWidget pickerContactsListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerContactsListWidget.x0;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(pickerContactsListWidget.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d));
                oneMeEmptyView.setSubtitle(new igf(ead.c));
                return oneMeEmptyView;
            default:
                KProperty[] kPropertyArr2 = PickerContactsListWidget.x0;
                RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(hra.h0);
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipToOutline(false);
                recyclerView.setItemAnimator((yyc) null);
                recyclerView.setHasFixedSize(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(pickerContactsListWidget.z);
                recyclerView.j(new fz2(new m76(recyclerView, 1), new qjb(pickerContactsListWidget, 2), new oo9(21), new qjb(pickerContactsListWidget, 1)));
                pickerContactsListWidget.c0(recyclerView);
                pickerContactsListWidget.Z = y7e.n(recyclerView);
                return recyclerView;
        }
    }
}
