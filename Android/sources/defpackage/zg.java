package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

/* renamed from: zg  reason: default package */
public final class zg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zg(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                Drawable background = ((View) this.c).getBackground();
                if (background != null) {
                    background.setAlpha(this.b);
                    return;
                }
                return;
            case 1:
            case 2:
                return;
            default:
                oee oee = (oee) ((lg7) this.c);
                oee.N("");
                oee.F0.setTextColor(i8b.Y(1.0f, this.b));
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                Drawable background = ((View) obj).getBackground();
                if (background != null) {
                    background.setAlpha(i);
                    return;
                }
                return;
            case 1:
                ((RecyclerView) ((ce) obj).o).setVisibility(i);
                return;
            case 2:
                int i2 = MarkdownMenuView.x;
                ((MarkdownMenuView) obj).a(i, false);
                return;
            default:
                oee oee = (oee) ((lg7) obj);
                oee.N("");
                oee.F0.setTextColor(i8b.Y(1.0f, i));
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
