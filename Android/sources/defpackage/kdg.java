package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: kdg  reason: default package */
public abstract class kdg extends dj3 {
    public boolean y;
    public boolean z;

    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == doc.ConstraintLayout_Layout_android_visibility) {
                    this.y = true;
                } else if (index == doc.ConstraintLayout_Layout_android_elevation) {
                    this.z = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(cs5 cs5, int i, int i2);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y || this.z) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View view = (View) constraintLayout.a.get(this.a[i]);
                    if (view != null) {
                        if (this.y) {
                            view.setVisibility(visibility);
                        }
                        if (this.z && elevation > c44.DEFAULT_ASPECT_RATIO) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
