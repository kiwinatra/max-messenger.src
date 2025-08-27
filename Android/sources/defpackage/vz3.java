package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.WeakHashMap;
import kotlin.Unit;

/* renamed from: vz3  reason: default package */
public final class vz3 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vz3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChildViewAdded(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).B0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.z0;
                ((FastScroller) obj).b();
                return;
            default:
                rta rta = (rta) obj;
                rta.getClass();
                boolean z = view2 instanceof TextView;
                WeakHashMap weakHashMap = rta.b;
                ome ome = rta.a;
                if (z) {
                    weakHashMap.put(view2, Unit.INSTANCE);
                    TextView textView = (TextView) view2;
                    uy4 uy4 = (uy4) ome.getValue();
                    Object tag = textView.getTag(mya.a);
                    ogf ogf = tag instanceof ogf ? (ogf) tag : null;
                    if (ogf != null) {
                        ogf.b(textView, uy4);
                        return;
                    }
                    return;
                } else if (view2 instanceof x86) {
                    weakHashMap.get(view2);
                    ((x86) view2).a((uy4) ome.getValue());
                    return;
                } else {
                    return;
                }
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                coordinatorLayout.j(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.B0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            case 1:
                int i = FastScroller.z0;
                ((FastScroller) obj).b();
                return;
            default:
                rta rta = (rta) obj;
                rta.getClass();
                if ((view2 instanceof TextView) || (view2 instanceof x86)) {
                    rta.b.remove(view2);
                    return;
                }
                return;
        }
    }
}
