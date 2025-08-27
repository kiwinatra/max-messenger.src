package defpackage;

import android.util.Property;
import android.view.ViewGroup;

/* renamed from: nz2  reason: default package */
public final class nz2 extends Property {
    public static final nz2 a = new Property(Float.class, "childrenAlpha");

    public final Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(agc.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f = (Float) obj2;
        float floatValue = f.floatValue();
        viewGroup.setTag(agc.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
