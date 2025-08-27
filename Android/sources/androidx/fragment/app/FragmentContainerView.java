package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/a;", "F", "getFragment", "()Landroidx/fragment/app/a;", "fragment_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n55#2,6:346\n55#2,6:352\n1855#3,2:358\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n112#1:346,6\n134#1:352,6\n218#1:358,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public View.OnApplyWindowInsetsListener c;
    public boolean o = true;

    @JvmOverloads
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoc.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(hoc.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + Typography.quote);
            }
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(whc.fragment_container_view_tag);
        if ((tag instanceof a ? (a) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        iog g = iog.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        iog g2 = onApplyWindowInsetsListener != null ? iog.g((View) null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : gag.f(this, g);
        if (!g2.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                gag.b(getChildAt(i), g2);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.o) {
            for (View drawChild : this.a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.o) {
            ArrayList arrayList = this.a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void endViewTransition(View view) {
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.o = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends a> F getFragment() {
        b bVar;
        a aVar;
        c cVar;
        View view = this;
        while (true) {
            bVar = null;
            if (view == null) {
                aVar = null;
                break;
            }
            Object tag = view.getTag(whc.fragment_container_view_tag);
            aVar = tag instanceof a ? (a) tag : null;
            if (aVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (aVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof b) {
                    bVar = (b) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (bVar != null) {
                cVar = bVar.v();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (aVar.a2()) {
            cVar = aVar.N1();
        } else {
            throw new IllegalStateException("The Fragment " + aVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return cVar.D(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                a(getChildAt(childCount));
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.o = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, c cVar) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoc.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(hoc.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(hoc.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        a D = cVar.D(id);
        if (classAttribute != null && D == null) {
            if (id == -1) {
                throw new IllegalStateException(wj6.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            a a2 = cVar.J().a(context.getClassLoader(), classAttribute);
            a2.H0 = id;
            a2.I0 = id;
            a2.J0 = string;
            a2.D0 = cVar;
            a2.E0 = cVar.w;
            a2.r2(attributeSet, (Bundle) null);
            xe0 xe0 = new xe0(cVar);
            xe0.p = true;
            a2.R0 = this;
            a2.z0 = true;
            xe0.h(getId(), a2, string, 1);
            xe0.g();
        }
        Iterator it = cVar.c.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            a aVar = eVar.c;
            if (aVar.I0 == getId() && (view = aVar.S0) != null && view.getParent() == null) {
                aVar.R0 = this;
                eVar.b();
                eVar.k();
            }
        }
    }
}
