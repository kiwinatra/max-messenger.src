package one.me.chatmedia.viewer.photo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/photo/PhotoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Legd;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "mfb", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPhotoViewerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoViewerWidget.kt\none/me/chatmedia/viewer/photo/PhotoViewerWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n419#2:109\n419#2:110\n419#2:111\n255#2,9:112\n410#2,8:130\n9#3,6:121\n15#3:128\n1#4:127\n1#4:129\n*S KotlinDebug\n*F\n+ 1 PhotoViewerWidget.kt\none/me/chatmedia/viewer/photo/PhotoViewerWidget\n*L\n31#1:109\n32#1:110\n34#1:111\n36#1:112,9\n72#1:130,8\n41#1:121,6\n41#1:128\n41#1:127\n*E\n"})
@SuppressLint({"ValidController"})
public final class PhotoViewerWidget extends Widget {
    public static final /* synthetic */ KProperty[] v;
    public final is a;
    public final is b;
    public final Lazy c;
    public final ReadOnlyProperty o;

    static {
        Class<PhotoViewerWidget> cls = PhotoViewerWidget.class;
        v = new KProperty[]{wj6.p(cls, "msgId", "getMsgId()J", 0), wj6.p(cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0)};
    }

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, 0L, "chat.media.viewer.message_id");
        this.b = new is(String.class, "", "chat.media.viewer.attach_id");
        is isVar = new is(egd.class, new egd(m1570getScopeIdIluPPks()), Widget.ARG_SCOPE_ID);
        KProperty kProperty = v[2];
        this.c = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, aj2.class, (Function0) null);
        this.o = viewBinding(cra.h);
    }

    public final String c0() {
        KProperty kProperty = v[1];
        return (String) this.b.a(this);
    }

    public final long d0() {
        KProperty kProperty = v[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final lfb e0() {
        return (lfb) this.o.getValue(this, v[3]);
    }

    public final aj2 f0() {
        return (aj2) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        lfb lfb = new lfb(frameLayout.getContext());
        lfb.setId(cra.h);
        frameLayout.addView(lfb);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        hr8 t = f0().t(d0(), c0());
        yq8 yq8 = t instanceof yq8 ? (yq8) t : null;
        if (yq8 != null) {
            e0().setZoomEnabled(true);
            e0().setListener(new d6a(2, (Object) this));
            f0().v(d0(), c0());
            e0().r(yq8.o, false);
            bs0.K(new ps5(ct.k(f0().L0, getViewLifecycleOwner().getLifecycle(), iu7.o), new nfb((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public PhotoViewerWidget(long j, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("chat.media.viewer.message_id", Long.valueOf(j)), TuplesKt.to("chat.media.viewer.attach_id", str), i2a.l(str2, Widget.ARG_SCOPE_ID)));
    }
}
