package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: zy3  reason: default package */
public final class zy3 implements vy3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public AnimatorSet b;
    public View c;
    public View d;
    public final Lazy e;
    public final Lazy f;
    public boolean g;
    public Function1 h;
    public Function1 i;
    public ty3 j;
    public ty3 k;

    public zy3() {
        wy3 wy3 = new wy3(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = LazyKt.lazy(lazyThreadSafetyMode, wy3);
        this.f = LazyKt.lazy(lazyThreadSafetyMode, new wy3(this, 1));
        this.g = true;
        this.h = new of3(5);
        this.i = new of3(6);
        this.j = new ty3();
        this.k = new ty3();
    }

    public final void a(boolean z) {
        View view;
        boolean z2 = z;
        boolean z3 = this.g;
        if (z3 == z2 || this.b != null) {
            this.h.invoke(Boolean.valueOf(z3));
            return;
        }
        this.j = ty3.a(this.j, 0, 0, z2, 3);
        ty3 a2 = ty3.a(this.k, 0, 0, z2, 3);
        this.k = a2;
        this.g = z2;
        View view2 = this.c;
        if (view2 != null && (view = this.d) != null) {
            boolean z4 = this.j.c;
            int i2 = z4 ? 1 : -1;
            boolean z5 = a2.c;
            int i3 = !z5 ? 1 : -1;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            int b2 = this.j.b();
            float f2 = ((float) b2) * ((float) i2);
            sy3 sy3 = r8;
            AnimatorSet animatorSet2 = animatorSet;
            sy3 sy32 = new sy3(z4, b2, i2, f2, view2.getY(), this.j.b);
            int b3 = this.k.b();
            float f3 = ((float) b3) * ((float) i3);
            sy3 sy33 = new sy3(z5, b3, i3, f3, view.getY(), this.k.b);
            Property property = View.ALPHA;
            float f4 = c44.DEFAULT_ASPECT_RATIO;
            Float valueOf = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
            if (!z4) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
            Float valueOf2 = Float.valueOf(1.0f);
            if (!z4) {
                valueOf2 = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{floatValue, valueOf2 != null ? valueOf2.floatValue() : 0.0f});
            Property property2 = View.Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property2, new float[]{view2.getY(), view2.getY() + f2});
            Float valueOf3 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
            if (!z5) {
                valueOf3 = null;
            }
            float floatValue2 = valueOf3 != null ? valueOf3.floatValue() : 1.0f;
            Float valueOf4 = Float.valueOf(1.0f);
            if (!z5) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                f4 = valueOf4.floatValue();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, property, new float[]{floatValue2, f4});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property2, new float[]{view.getY(), view.getY() + f3});
            LinkedHashSet<uy3> linkedHashSet = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
            for (uy3 v : linkedHashSet) {
                arrayList.add(v.v(sy3, sy33));
            }
            List flatten = CollectionsKt.flatten(arrayList);
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(ofFloat);
            createListBuilder.add(ofFloat2);
            createListBuilder.add(ofFloat3);
            createListBuilder.add(ofFloat4);
            createListBuilder.addAll(flatten);
            AnimatorSet animatorSet3 = animatorSet2;
            animatorSet3.playTogether(CollectionsKt.build(createListBuilder));
            animatorSet3.addListener(new yy3(this, this.g, 0));
            animatorSet3.start();
            this.b = animatorSet3;
        }
    }
}
