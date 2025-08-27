package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: sc6  reason: default package */
public final class sc6 implements LayoutInflater.Factory2 {
    public final c a;

    public sc6(c cVar) {
        this.a = cVar;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        e eVar;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        a aVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoc.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(hoc.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(hoc.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(hoc.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int i = 0;
            try {
                z = a.class.isAssignableFrom(rc6.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    aVar = cVar.D(resourceId);
                }
                if (aVar == null && string != null) {
                    aVar = cVar.E(string);
                }
                if (aVar == null && i != -1) {
                    aVar = cVar.D(i);
                }
                if (aVar == null) {
                    aVar = cVar.J().a(context.getClassLoader(), attributeValue);
                    aVar.x0 = true;
                    aVar.H0 = resourceId != 0 ? resourceId : i;
                    aVar.I0 = i;
                    aVar.J0 = string;
                    aVar.y0 = true;
                    aVar.D0 = cVar;
                    oc6 oc6 = cVar.w;
                    aVar.E0 = oc6;
                    Context context2 = oc6.w0;
                    aVar.r2(attributeSet, aVar.b);
                    eVar = cVar.a(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!aVar.y0) {
                    aVar.y0 = true;
                    aVar.D0 = cVar;
                    oc6 oc62 = cVar.w;
                    aVar.E0 = oc62;
                    Context context3 = oc62.w0;
                    aVar.r2(attributeSet, aVar.b);
                    eVar = cVar.g(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                kd6 kd6 = ld6.a;
                Violation violation = new Violation(aVar, "Attempting to use <fragment> tag to add fragment " + aVar + " to container " + viewGroup);
                ld6.c(violation);
                kd6 a2 = ld6.a(aVar);
                if (a2.a.contains(jd6.o) && ld6.e(a2, aVar.getClass(), FragmentTagUsageViolation.class)) {
                    ld6.b(a2, violation);
                }
                aVar.R0 = viewGroup;
                eVar.k();
                eVar.j();
                View view2 = aVar.S0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (aVar.S0.getTag() == null) {
                        aVar.S0.setTag(string);
                    }
                    aVar.S0.addOnAttachStateChangeListener(new p50(this, eVar));
                    return aVar.S0;
                }
                throw new IllegalStateException(wj6.k("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
