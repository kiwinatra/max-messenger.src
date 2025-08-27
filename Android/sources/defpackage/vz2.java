package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: vz2  reason: default package */
public final class vz2 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ ChipGroup b;

    public vz2(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = gag.a;
                view2.setId(View.generateViewId());
            }
            g5b g5b = chipGroup.y;
            Chip chip = (Chip) view2;
            ((HashMap) g5b.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                g5b.f(chip);
            }
            chip.setInternalOnCheckedChangeListener(new rt6(11, (Object) g5b));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            g5b g5b = chipGroup.y;
            Chip chip = (Chip) view2;
            g5b.getClass();
            chip.setInternalOnCheckedChangeListener((xg8) null);
            ((HashMap) g5b.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) g5b.o).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
