package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.jvm.internal.Ref;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.gallery.view.CameraContainerView;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;

/* renamed from: nn1  reason: default package */
public final class nn1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nn1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        scf scf;
        Rect rect;
        int i9;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                on1 on1 = (on1) obj2;
                p6g b2 = on1.getVideoLayoutUpdatesController();
                if (b2 != null) {
                    b2.a((View) ((Ref.ObjectRef) obj).element, on1.y);
                    return;
                }
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) obj;
                if (textView.isInEditMode()) {
                    scf = vi4.f0;
                } else {
                    Context context = textView.getContext();
                    Lazy lazy = scf.b0;
                    scf = j4b.k0(context);
                }
                ((Drawable) obj2).setColorFilter(new PorterDuffColorFilter(scf.l, PorterDuff.Mode.SRC_IN));
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                m56 m56 = (m56) obj2;
                tf6 tf6 = (tf6) obj;
                vj6 vj6 = new vj6(5, (Object) m56, (Object) tf6);
                buf a2 = m56.a(m56, tf6);
                FolderTutorLayout folderTutorLayout = (FolderTutorLayout) m56.c;
                if (a2 == null || (rect = rcg.c(a2.o(), folderTutorLayout)) == null) {
                    rect = new Rect();
                }
                if (rect.bottom > folderTutorLayout.getHeight()) {
                    m56.b(m56, rect);
                    NestedScrollView nestedScrollView = (NestedScrollView) m56.e;
                    if (!nestedScrollView.isLaidOut() || nestedScrollView.isLayoutRequested()) {
                        nestedScrollView.addOnLayoutChangeListener(new dr0(6, vj6));
                        return;
                    } else {
                        vj6.run();
                        return;
                    }
                } else {
                    vj6.run();
                    return;
                }
            case 3:
                view.removeOnLayoutChangeListener(this);
                GalleryFragment galleryFragment = (GalleryFragment) obj2;
                int i10 = galleryFragment.k3().q.a;
                int width = (((View) obj).getWidth() / i10) - (galleryFragment.k3().q.b - (galleryFragment.k3().q.b / i10));
                CameraContainerView d = galleryFragment.E1.d();
                ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = width;
                    layoutParams.height = width;
                    d.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            case 4:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr = MediaGalleryWidget.x;
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj2;
                int i11 = mediaGalleryWidget.e0().w0.c;
                int i12 = mediaGalleryWidget.e0().w0.d - (mediaGalleryWidget.e0().w0.d / i11);
                om6 d0 = mediaGalleryWidget.d0();
                d0.getClass();
                xag.h(d0.c, new lm6((((View) obj).getWidth() / i11) - i12));
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                dc9 dc9 = (dc9) obj2;
                int i13 = 0;
                if (dc9.c.getMeasuredHeight() <= Math.min(dc9.b.getMeasuredHeight(), y7e.w(dc9.v))) {
                    z = false;
                }
                if (z) {
                    ogf ogf = tr2.a;
                    i9 = (int) (((double) so4.c(tr2.l.g((uy4) obj), dc9.getContext())) * 0.2d);
                } else {
                    i9 = 0;
                }
                dc9.a = g63.b((float) 4, vo4.c().getDisplayMetrics().density, i9);
                ImageView imageView = dc9.b;
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.bottomMargin = dc9.a;
                    imageView.setLayoutParams(marginLayoutParams);
                    Lazy lazy2 = dc9.v;
                    if (lazy2.isInitialized()) {
                        ImageView imageView2 = (ImageView) lazy2.getValue();
                        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                        if (layoutParams3 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                            marginLayoutParams2.bottomMargin = dc9.a;
                            imageView2.setLayoutParams(marginLayoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    ImageView imageView3 = dc9.y;
                    ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (z) {
                            i13 = i9;
                        }
                        marginLayoutParams3.bottomMargin = i13;
                        imageView3.setLayoutParams(marginLayoutParams3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 6:
                view.removeOnLayoutChangeListener(this);
                occ occ = (occ) obj2;
                if (wgf.d(occ.getTitleView())) {
                    KProperty[] kPropertyArr2 = MessageWriteWidget.C0;
                    ((MessageWriteWidget) obj).getClass();
                    MessageWriteWidget.m0(occ, true);
                    return;
                }
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr3 = NeuroAvatarsScreen.K0;
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) obj;
                neuroAvatarsScreen.getClass();
                KProperty[] kPropertyArr4 = NeuroAvatarsScreen.K0;
                KProperty kProperty = kPropertyArr4[6];
                ReadOnlyProperty readOnlyProperty = neuroAvatarsScreen.Y;
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((View) readOnlyProperty.getValue(neuroAvatarsScreen, kPropertyArr4[6])).getPaddingBottom() + ((View) readOnlyProperty.getValue(neuroAvatarsScreen, kProperty)).getMeasuredHeight());
                return;
            default:
                View view2 = (View) obj2;
                if (view2.getVisibility() == 0) {
                    ((q8f) obj).d(view2);
                    return;
                }
                return;
        }
    }

    public nn1(q8f q8f, View view) {
        this.a = 8;
        this.c = q8f;
        this.b = view;
    }
}
