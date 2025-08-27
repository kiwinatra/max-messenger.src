package one.me.sdk.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lql6;", "galleryMode", "(Ljava/lang/String;Lql6;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaGalleryWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaGalleryWidget.kt\none/me/sdk/gallery/MediaGalleryWidget\n+ 2 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Widget.kt\none/me/sdk/arch/Widget\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,199:1\n9#2:200\n9#2:228\n1#3:201\n1#3:229\n255#4,9:202\n235#4,10:211\n65#5,4:221\n37#5:225\n53#5:226\n72#5:227\n*S KotlinDebug\n*F\n+ 1 MediaGalleryWidget.kt\none/me/sdk/gallery/MediaGalleryWidget\n*L\n51#1:200\n60#1:228\n51#1:201\n60#1:229\n50#1:202,9\n54#1:211,10\n103#1:221,4\n103#1:225\n103#1:226\n103#1:227\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ KProperty[] x = {wj6.p(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0)};
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final sn0 v;
    public final k71 w;

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = fdb.a.c();
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "arg_scope_id", cls);
        if (k != null) {
            this.b = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, om6.class, (Function0) null);
            this.c = createViewModelLazy(gp6.class, new i76(19, new j35(19, (Object) bundle, (Object) this)));
            this.o = LazyKt.lazy(new cq8(this, 0));
            this.v = binding(new cq8(this, 1));
            this.w = new k71(5, this);
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final EndlessRecyclerView c0() {
        KProperty kProperty = x[0];
        return (EndlessRecyclerView) this.v.getValue();
    }

    public final om6 d0() {
        return (om6) this.b.getValue();
    }

    public final gp6 e0() {
        return (gp6) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(c0());
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gp6 e0 = e0();
        xm6 a2 = fqc.a(e0.c);
        e0.w0 = a2;
        z68.c("gp6", "did recalculate uiOptions: " + a2, new Object[0]);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new nn1(4, this, view));
        } else {
            int i = e0().w0.c;
            int width = view.getWidth() / i;
            om6 d0 = d0();
            d0.getClass();
            xag.h(d0.c, new lm6(width - (e0().w0.d - (e0().w0.d / i))));
        }
        EndlessRecyclerView c0 = c0();
        c0.setPager(this.w);
        c0.setProgressView(tya.a);
        c0.setHasFixedSize(true);
        c0.setThreshold(e0().w0.b);
        c0.setAdapter((kk6) this.o.getValue());
        c0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(e0().w0.c);
        gridLayoutManager.C = e0().w0.c * 4;
        c0.setLayoutManager(gridLayoutManager);
        c0.j(new cl2(e0().w0.c, e0().w0.d, 3));
        c0.setItemAnimator(e0().w0.g ? new mg4() : null);
        c0.m(new k61(8, this));
        bs0.K(new ps5(e0().v0, new dq8(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().C0, new eq8(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().y0, new fq8(this, (Continuation) null), 5), getViewLifecycleScope());
        o5a.O(new ps5(d0().o, new gq8(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaGalleryWidget(java.lang.String r1, defpackage.ql6 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0008
            android.os.Parcelable$Creator<ql6> r2 = defpackage.ql6.CREATOR
            ql6 r2 = defpackage.ql6.X
        L_0x0008:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.gallery.MediaGalleryWidget.<init>(java.lang.String, ql6, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public MediaGalleryWidget(String str, ql6 ql6, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "arg_scope_id"), TuplesKt.to("arg_gallery_mode", ql6)));
    }
}
