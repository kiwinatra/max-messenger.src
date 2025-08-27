package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.TransitionValues;
import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: wh  reason: default package */
public final class wh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                ((TransitionValues) this.b).view.setClipBounds((Rect) null);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((ValueAnimator) obj2).removeListener(this);
                ((Function0) obj).invoke();
                return;
            case 1:
                super.onAnimationEnd(animator);
                if (((e33) obj).b) {
                    ((TransitionValues) obj2).view.setClipBounds((Rect) null);
                    return;
                }
                return;
            case 2:
                ((sp6) ((up6) obj2).getHierarchy()).n(b9d.b(((iv4) obj).b));
                return;
            case 3:
                up6 up6 = (up6) obj2;
                nv4 nv4 = (nv4) obj;
                ((sp6) up6.getHierarchy()).h(nv4.b);
                if (nv4.o != null) {
                    sp6 sp6 = (sp6) up6.getHierarchy();
                    PointF pointF = nv4.o;
                    sp6.getClass();
                    pointF.getClass();
                    sp6.f(2).r(pointF);
                    return;
                }
                return;
            case 4:
                n05 n05 = (n05) obj;
                n05.o.setValues((float[]) obj2);
                n05.o.invert(n05.v);
                n05.invalidate();
                return;
            case 5:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) obj;
                gestureCropImageView.setCurrentMatrixValues((float[]) obj2);
                gestureCropImageView.invalidate();
                return;
            case 6:
                int i = IncomingCallControlsView.D0;
                IncomingCallControlsView incomingCallControlsView = (IncomingCallControlsView) obj;
                incomingCallControlsView.getClass();
                incomingCallControlsView.postDelayed(new uo5(13, (Object) this, (Object) (View) obj2), 500);
                return;
            case 7:
                ((ts) obj2).remove(animator);
                ((yrf) obj).z0.remove(animator);
                return;
            default:
                vng vng = (vng) obj2;
                vng.a.d(1.0f);
                rng.e((View) obj, vng);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                ((yrf) this.c).z0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ wh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
