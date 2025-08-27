package one.me.sdk.gallery.selectalbum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "parentScope", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "qa", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSelectAlbumWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAlbumWidget.kt\none/me/sdk/gallery/selectalbum/SelectAlbumWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,131:1\n420#2:132\n255#2,9:133\n410#2,8:142\n410#2,8:150\n28#3:158\n*S KotlinDebug\n*F\n+ 1 SelectAlbumWidget.kt\none/me/sdk/gallery/selectalbum/SelectAlbumWidget\n*L\n27#1:132\n28#1:133,9\n81#1:142,8\n34#1:150,8\n47#1:158\n*E\n"})
@SuppressLint({"ValidController"})
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ KProperty[] w;
    public final Lazy a;
    public final Lazy b;
    public final sn0 c;
    public final sn0 o;
    public final sn0 v;

    static {
        Class<SelectAlbumWidget> cls = SelectAlbumWidget.class;
        w = new KProperty[]{wj6.p(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), wj6.p(cls, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0), wj6.p(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0)};
    }

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        KProperty kProperty = w[0];
        this.a = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, opd.class, (Function0) null);
        this.b = bq8.a.getAccessor().h(aua.class);
        this.c = binding(new ppd(this, 0));
        this.o = binding(new ppd(this, 1));
        this.v = binding(new ppd(this, 2));
    }

    public final cqd c0() {
        KProperty kProperty = w[2];
        return (cqd) this.o.getValue();
    }

    public final orb d0() {
        KProperty kProperty = w[3];
        return (orb) this.v.getValue();
    }

    public final opd e0() {
        return (opd) this.a.getValue();
    }

    public final void f0() {
        View f;
        if (d0().getScrollState() == lrb.a) {
            frb callback = d0().getCallback();
            if (callback == null || (f = callback.f()) == null || f.getHeight() != 0) {
                d0().k();
            } else {
                d0().post(new mgd(3, this));
            }
        } else {
            d0().j(true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return d0();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(e0().v, getViewLifecycleOwner().getLifecycle(), iu7.o), new rpd((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public SelectAlbumWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
