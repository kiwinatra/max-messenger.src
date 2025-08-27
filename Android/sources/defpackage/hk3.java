package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.constructor.ConstructorPopupLayout;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: hk3  reason: default package */
public final class hk3 extends erb {
    public final /* synthetic */ int a;
    public final /* synthetic */ nrb b;

    public /* synthetic */ hk3(nrb nrb, int i) {
        this.a = i;
        this.b = nrb;
    }

    public final int a() {
        nrb nrb = this.b;
        switch (this.a) {
            case 0:
                return ((ConstructorPopupLayout) nrb).getMeasuredHeight() - l().getMeasuredHeight();
            case 1:
                int i = ExtraActionsView.x0;
                ExtraActionsView extraActionsView = (ExtraActionsView) nrb;
                if (extraActionsView.v) {
                    return extraActionsView.getMeasuredHeight() - extraActionsView.w0.getMeasuredHeight();
                }
                return 0;
            default:
                ok8 ok8 = (ok8) nrb;
                return ok8.K0.getMeasuredHeight() + ok8.L0.getMeasuredHeight() + (-ok8.I0.getMeasuredHeight());
        }
    }

    public final int b() {
        int measuredHeight;
        int measuredHeight2;
        nrb nrb = this.b;
        switch (this.a) {
            case 0:
                return ((ConstructorPopupLayout) nrb).getMeasuredHeight() - l().getMeasuredHeight();
            case 1:
                int i = ExtraActionsView.x0;
                ExtraActionsView extraActionsView = (ExtraActionsView) nrb;
                if (extraActionsView.v) {
                    return extraActionsView.getMeasuredHeight() - extraActionsView.w0.getMeasuredHeight();
                }
                return 0;
            default:
                ok8 ok8 = (ok8) nrb;
                int K = hd8.K(ok8.getContext());
                int i2 = ok8.N0;
                if (1 == K) {
                    measuredHeight = ((ok8.getMeasuredHeight() - i2) - i2) - (i2 / 4);
                    measuredHeight2 = ok8.I0.getMeasuredHeight();
                } else {
                    measuredHeight = (ok8.getMeasuredHeight() - i2) - (i2 / 3);
                    measuredHeight2 = ok8.I0.getMeasuredHeight();
                }
                return measuredHeight - measuredHeight2;
        }
    }

    public final int c() {
        nrb nrb = this.b;
        switch (this.a) {
            case 0:
                return ((ConstructorPopupLayout) nrb).getMeasuredHeight();
            case 1:
                int i = ExtraActionsView.x0;
                ExtraActionsView extraActionsView = (ExtraActionsView) nrb;
                return extraActionsView.v ? extraActionsView.getMeasuredHeight() : -extraActionsView.w0.getMeasuredHeight();
            default:
                return ((ok8) nrb).getMeasuredHeight();
        }
    }

    public final View d() {
        switch (this.a) {
            case 0:
                return l();
            case 1:
                return ((ExtraActionsView) this.b).w0;
            default:
                return ((ok8) this.b).H0;
        }
    }

    public void e() {
        switch (this.a) {
            case 2:
                ((ok8) this.b).post(new nk8(this, 1));
                return;
            default:
                return;
        }
    }

    public final void f() {
        f2a f2a;
        d8b d8b;
        switch (this.a) {
            case 0:
                ConstructorPopupLayout constructorPopupLayout = (ConstructorPopupLayout) this.b;
                l2a l2a = constructorPopupLayout.v0;
                if (l2a != null) {
                    l2a.w0 = 1;
                    l2a.N(new zj0(27));
                }
                i1a i1a = constructorPopupLayout.z;
                if (!(i1a == null || (f2a = i1a.d.a) == null || (d8b = ((u2a) f2a).X) == null)) {
                    d8b.d();
                }
                View l = l();
                View view = constructorPopupLayout.y;
                if (l != view) {
                    view.offsetTopAndBottom(constructorPopupLayout.getMeasuredHeight() - constructorPopupLayout.y.getTop());
                }
                constructorPopupLayout.setVisibility(8);
                return;
            case 1:
                ExtraActionsView extraActionsView = (ExtraActionsView) this.b;
                extraActionsView.setVisibility(4);
                extraActionsView.w0.z0(0);
                d9d d9d = extraActionsView.v0;
                if (d9d != null) {
                    ((AlbumsSelectionFragment) d9d.b).i3().A.setValue(zk6.COLLAPSED);
                    return;
                }
                return;
            default:
                ok8 ok8 = (ok8) this.b;
                ok8.L0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                ok8.L0.setClickable(false);
                lk8 lk8 = ok8.w0;
                if (lk8 != null) {
                    i3a i3a = (i3a) lk8;
                    if (i3a.z.isActive()) {
                        for (k1a k1a : (Set) i3a.a) {
                            i1a i1a2 = k1a.c;
                            if (i1a2 != null) {
                                CharSequence charSequence = k1a.w.f.j;
                                p1a p1a = i1a2.c;
                                p1a.getClass();
                                f2a f2a2 = p1a.a;
                                if (f2a2 != null) {
                                    s3a s3a = (s3a) f2a2;
                                    Editable text = s3a.X.getText();
                                    String str = null;
                                    String charSequence2 = text == null ? null : text.toString();
                                    if (charSequence != null) {
                                        str = charSequence.toString();
                                    }
                                    if (!cvg.c(charSequence2, str)) {
                                        s3a.X.setText(charSequence);
                                        if (charSequence != null) {
                                            try {
                                                s3a.X.setSelection(charSequence.length());
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                }
                                i1a2.a.getClass();
                                i1a2.d();
                            }
                        }
                        i3a.x0.j();
                    }
                }
                if (n54.f(ok8.getContext())) {
                    b4a b4a = ok8.x0;
                    if (b4a.D0.h()) {
                        ok8.s(ok8, new nk8(this, 0), false);
                        b4a.release();
                    }
                }
                ok8.J0.M(false);
                return;
        }
    }

    public void g(int i, boolean z) {
        switch (this.a) {
            case 2:
                ok8 ok8 = (ok8) this.b;
                if (n54.f(ok8.getContext()) && ok8.x0.D0.h()) {
                    ok8.s(ok8, new mk8(this, z, i, 0), z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void h() {
        switch (this.a) {
            case 0:
                l2a l2a = ((ConstructorPopupLayout) this.b).v0;
                if (l2a != null) {
                    for (k0a k0a : (Set) l2a.a) {
                        n99 n99 = k0a.b;
                        n99.o.getClass();
                        n99.a();
                        n99.b.b(n99.D0);
                    }
                    return;
                }
                return;
            case 1:
                d9d d9d = ((ExtraActionsView) this.b).v0;
                return;
            default:
                ok8 ok8 = (ok8) this.b;
                pk4 pk4 = ok8.S0;
                if (((ValueAnimator) pk4.e) == null) {
                    Rect rect = rcg.a;
                    rcg.d(rect, ok8.Q0);
                    pk4.s(rect.top, false, false);
                    return;
                }
                return;
        }
    }

    public void i(int i) {
        switch (this.a) {
            case 2:
                if (i == 0) {
                    ((ok8) this.b).J0.M(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void j(int i) {
        switch (this.a) {
            case 2:
                ok8 ok8 = (ok8) this.b;
                pk4 pk4 = ok8.S0;
                Rect rect = rcg.a;
                rcg.d(rect, ok8.Q0);
                boolean z = false;
                pk4.s(rect.top, false, false);
                if (ok8.getScrollState() == 1) {
                    ok8.J0.setTranslationY((float) ((Math.max(b(), i) - b()) - ok8.getKeyboardHeight()));
                }
                ok8.L0.setAlpha(i <= 0 ? Math.abs(((float) i) / ((float) a())) : c44.DEFAULT_ASPECT_RATIO);
                Toolbar toolbar = ok8.L0;
                if (toolbar.getAlpha() >= 1.0f) {
                    z = true;
                }
                toolbar.setClickable(z);
                return;
            default:
                return;
        }
    }

    public final boolean k(int i) {
        d8b d8b;
        boolean z = true;
        nrb nrb = this.b;
        switch (this.a) {
            case 0:
                l2a l2a = ((ConstructorPopupLayout) nrb).v0;
                if (l2a.w0 == 2) {
                    return !l2a.z.c.canScrollVertically(-1);
                }
                f2a f2a = l2a.Z.e.a;
                if ((f2a != null && !((j4a) f2a).d0()) || !(!l2a.x.x.canScrollVertically(-1))) {
                    z = false;
                }
                return z;
            case 1:
                int i2 = ExtraActionsView.x0;
                ExtraActionsView extraActionsView = (ExtraActionsView) nrb;
                if (extraActionsView.v) {
                    return true;
                }
                RecyclerView recyclerView = extraActionsView.w0;
                return recyclerView.getMeasuredHeight() + recyclerView.computeVerticalScrollOffset() == recyclerView.computeVerticalScrollRange();
            default:
                ok8 ok8 = (ok8) nrb;
                return ok8.O0.getVisibility() != 0 && (i != 2 || ok8.Q0.computeVerticalScrollOffset() == 0) && (!ok8.x0.Z() && ((ValueAnimator) ok8.S0.e) == null) && !(ok8.J0.O0.isFocused() && (d8b = ((i3a) ok8.w0).x.X) != null && d8b.g);
        }
    }

    public View l() {
        ConstructorPopupLayout constructorPopupLayout = (ConstructorPopupLayout) this.b;
        return constructorPopupLayout.w0 == ik3.a ? constructorPopupLayout.y : constructorPopupLayout.x;
    }
}
