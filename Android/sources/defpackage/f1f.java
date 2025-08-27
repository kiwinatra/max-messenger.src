package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.suggests.SuggestsView;

/* renamed from: f1f  reason: default package */
public final class f1f extends qf5 {
    public static final /* synthetic */ KProperty[] x;
    public final w28 c = c(lic.root);
    public final w28 o = c(lic.suggests);
    public final w28 v = c(lic.description);
    public Animator w;

    static {
        Class<f1f> cls = f1f.class;
        x = new KProperty[]{wj6.p(cls, "root", "getRoot()Lru/ok/messages/suggests/SuggestsView;", 0), wj6.p(cls, "suggests", "getSuggests()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), wj6.p(cls, "description", "getDescription()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    }

    public final void b() {
        Animator animator = this.w;
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.w = null;
    }

    public final ObjectAnimator d(float f, float f2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(f(), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.setDuration(kne.s(f().getContext()).a.h());
        ofPropertyValuesHolder.addListener(new uf(8, this));
        this.w = ofPropertyValuesHolder;
        return ofPropertyValuesHolder;
    }

    public final AppCompatTextView e() {
        return (AppCompatTextView) this.v.getValue(this, x[2]);
    }

    public final SuggestsView f() {
        return (SuggestsView) this.c.getValue(this, x[0]);
    }

    public final EndlessRecyclerView g() {
        return (EndlessRecyclerView) this.o.getValue(this, x[1]);
    }
}
