package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.ok.messages.contacts.picker.MultiPickerSelectionViewController;
import ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z6  reason: default package */
public final class z6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.I0 = null;
                actionBarOverlayLayout.v0 = false;
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) this.b;
                stickerSlideRelativeLayout.y = false;
                stickerSlideRelativeLayout.requestLayout();
                return;
            case 16:
                ((fcg) this.b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I0 = null;
                actionBarOverlayLayout.v0 = false;
                return;
            case 1:
                ag agVar = (ag) obj;
                ArrayList arrayList = new ArrayList(agVar.v);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ye) arrayList.get(i)).a(agVar);
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                wk0 wk0 = (wk0) obj;
                p1e n = ct.n(wk0);
                Iterator it = wk0.x0.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) n.a).remove((rmf) it.next());
                }
                return;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    return;
                }
                return;
            case 4:
                kx4 kx4 = (kx4) obj;
                kx4.q();
                kx4.r.start();
                return;
            case 5:
                ((ExpandableTransformationBehavior) obj).b = null;
                return;
            case 6:
                xr5 xr5 = ((yr5) obj).x;
                if (xr5 != null) {
                    xr5.l();
                    return;
                }
                return;
            case 7:
                ((HideBottomViewOnScrollBehavior) obj).h = null;
                return;
            case 9:
                kg8 kg8 = (kg8) obj;
                kg8.b.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                kg8.b(c44.DEFAULT_ASPECT_RATIO);
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((MultiPickerSelectionViewController) obj).e = true;
                return;
            case 11:
                WeakHashMap weakHashMap = gag.a;
                t9g.c((View) ((b4a) obj).c);
                return;
            case 12:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    return;
                }
                return;
            case 13:
                o5h o5h = (o5h) obj;
                if (((ValueAnimator) o5h.b) == animator) {
                    o5h.b = null;
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                StickerSlideRelativeLayout stickerSlideRelativeLayout = (StickerSlideRelativeLayout) obj;
                stickerSlideRelativeLayout.y = false;
                stickerSlideRelativeLayout.requestLayout();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((yrf) obj).o();
                animator.removeListener(this);
                return;
            case 16:
                ((fcg) obj).c();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 8:
                super.onAnimationRepeat(animator);
                uv7 uv7 = (uv7) this.b;
                uv7.y = (uv7.y + 1) % uv7.x.c.length;
                uv7.z = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ag agVar = (ag) this.b;
                ArrayList arrayList = new ArrayList(agVar.v);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ye) arrayList.get(i)).b(agVar);
                }
                return;
            case 10:
                MultiPickerSelectionViewController multiPickerSelectionViewController = (MultiPickerSelectionViewController) this.b;
                multiPickerSelectionViewController.b.setVisibility(0);
                View view = multiPickerSelectionViewController.d;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 16:
                ((fcg) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z6(fcg fcg, View view) {
        this.a = 16;
        this.b = fcg;
    }
}
