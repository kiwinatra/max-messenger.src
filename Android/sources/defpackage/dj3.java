package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: dj3  reason: default package */
public abstract class dj3 extends View {
    public int[] a = new int[32];
    public int b;
    public Context c;
    public cy6 o;
    public String v;
    public String w;
    public HashMap x = new HashMap();

    public dj3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        h(attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x008e
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x008e
        L_0x000a:
            android.content.Context r0 = r5.c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.y0
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.y0
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.g(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0070
            java.lang.Class<pgc> r1 = defpackage.pgc.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0070 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            if (r3 != 0) goto L_0x0080
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0080:
            if (r3 == 0) goto L_0x008e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.x
            r1.put(r0, r6)
            r5.b(r3)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj3.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i != getId()) {
            int i2 = this.b + 1;
            int[] iArr = this.a;
            if (i2 > iArr.length) {
                this.a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.a;
            int i3 = this.b;
            iArr2[i3] = i;
            this.b = i3 + 1;
        }
    }

    public final void c(String str) {
        if (str != null && str.length() != 0 && this.c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof fj3) && trim.equals(((fj3) layoutParams).Y) && childAt.getId() != -1) {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            e((ConstraintLayout) parent);
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View view = (View) constraintLayout.a.get(this.a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > c44.DEFAULT_ASPECT_RATIO) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == doc.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.v = string;
                    setIds(string);
                } else if (index == doc.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.w = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(tj3 tj3, boolean z) {
    }

    public void j() {
    }

    public final void k() {
        if (this.o != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof fj3) {
                ((fj3) layoutParams).p0 = this.o;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.v;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.w;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.v = str;
        if (str != null) {
            int i = 0;
            this.b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.w = str;
        if (str != null) {
            int i = 0;
            this.b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    c(str.substring(i));
                    return;
                } else {
                    c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.v = null;
        this.b = 0;
        for (int b2 : iArr) {
            b(b2);
        }
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.v == null) {
            b(i);
        }
    }
}
