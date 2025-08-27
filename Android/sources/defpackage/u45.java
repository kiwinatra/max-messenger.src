package defpackage;

import android.view.View;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* renamed from: u45  reason: default package */
public final class u45 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ EmptyRecyclerView b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u45(EmptyRecyclerView emptyRecyclerView, int i) {
        super(null);
        this.a = i;
        this.b = emptyRecyclerView;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        EmptyRecyclerView emptyRecyclerView = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (((View) obj2) != null) {
                    KProperty[] kPropertyArr = EmptyRecyclerView.W1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.U1 = new t45(0, emptyRecyclerView);
                    tyc adapter = emptyRecyclerView.getAdapter();
                    if (adapter != null) {
                        EmptyRecyclerView.M0(adapter, emptyRecyclerView.U1);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.U1 != null) {
                    tyc adapter2 = emptyRecyclerView.getAdapter();
                    if (adapter2 != null) {
                        EmptyRecyclerView.N0(adapter2, emptyRecyclerView.U1);
                    }
                    emptyRecyclerView.U1 = null;
                    return;
                } else {
                    return;
                }
            default:
                View view2 = (View) obj;
                if (((View) obj2) != null) {
                    KProperty[] kPropertyArr2 = EmptyRecyclerView.W1;
                    emptyRecyclerView.getClass();
                    emptyRecyclerView.U1 = new t45(0, emptyRecyclerView);
                    tyc adapter3 = emptyRecyclerView.getAdapter();
                    if (adapter3 != null) {
                        EmptyRecyclerView.M0(adapter3, emptyRecyclerView.U1);
                        return;
                    }
                    return;
                } else if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.U1 != null) {
                    tyc adapter4 = emptyRecyclerView.getAdapter();
                    if (adapter4 != null) {
                        EmptyRecyclerView.N0(adapter4, emptyRecyclerView.U1);
                    }
                    emptyRecyclerView.U1 = null;
                    return;
                } else {
                    return;
                }
        }
    }
}
