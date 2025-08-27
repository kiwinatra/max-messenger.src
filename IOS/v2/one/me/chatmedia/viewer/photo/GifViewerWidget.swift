package one.me.chatmedia.viewer.photo;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
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
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/GifViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Legd;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGifViewerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifViewerWidget.kt\none/me/chatmedia/viewer/photo/GifViewerWidget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Log.kt\nru/ok/tamtam/logger/Log\n*L\n1#1,245:1\n5#2:246\n419#3:247\n419#3:248\n419#3:249\n255#3,9:250\n410#3,8:268\n410#3,8:276\n9#4,6:259\n15#4:266\n1#5:265\n1#5:267\n32#6,4:284\n*S KotlinDebug\n*F\n+ 1 GifViewerWidget.kt\none/me/chatmedia/viewer/photo/GifViewerWidget\n*L\n44#1:246\n46#1:247\n47#1:248\n49#1:249\n51#1:250,9\n134#1:268,8\n135#1:276,8\n88#1:259,6\n88#1:266\n88#1:265\n141#1:284,4\n*E\n"})
@SuppressLint({"ValidController"})
public final class GifViewerWidget extends Widget {
    public static final /* synthetic */ KProperty[] X;
    public final String a;
    public final is b;
    public final is c;
    public final Lazy o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty w;
    public jk3 x;
    public g4g y;
    public final wie z;

    static {
        Class<GifViewerWidget> cls = GifViewerWidget.class;
        X = new KProperty[]{wj6.p(cls, "msgId", "getMsgId()J", 0), wj6.p(cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0), wj6.p(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    }

    public GifViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = GifViewerWidget.class.getName();
        this.b = new is(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new is(String.class, "", "chat.media.viewer.attach_id");
        is isVar = new is(egd.class, new egd(m1570getScopeIdIluPPks()), Widget.ARG_SCOPE_ID);
        KProperty kProperty = X[2];
        this.o = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, aj2.class, (Function0) null);
        this.v = viewBinding(cra.h);
        this.w = viewBinding(cra.f);
        this.z = new wie(22, (Object) this);
    }

    public final String c0() {
        KProperty kProperty = X[1];
        return (String) this.c.a(this);
    }

    public final long d0() {
        KProperty kProperty = X[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final lfb e0() {
        return (lfb) this.v.getValue(this, X[3]);
    }

    public final n7g f0() {
        zx3 targetController = getTargetController();
        j9g j9g = targetController instanceof j9g ? (j9g) targetController : null;
        if (j9g != null) {
            return ((ChatMediaViewerScreen) j9g).p0();
        }
        return null;
    }

    public final h9g g0() {
        return (h9g) this.w.getValue(this, X[4]);
    }

    public final aj2 h0() {
        return (aj2) this.o.getValue();
    }

    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() != null && this.y != null) {
            g0().a(this.z);
            n7g f0 = f0();
            if (f0 != null) {
                f0.play();
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        if (getView() != null && this.y != null) {
            n7g f0 = f0();
            if (f0 != null) {
                f0.pause();
                f0.L0((Surface) null);
            }
            g0().b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        lfb lfb = new lfb(frameLayout.getContext());
        lfb.setId(cra.h);
        lfb.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(lfb);
        h9g h9g = new h9g(frameLayout.getContext());
        h9g.setId(cra.f);
        h9g.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        h9g.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.x = new jk3(h9g);
        frameLayout.addView(h9g);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        super.onDestroyView(view);
        jk3 jk3 = this.x;
        if (!(jk3 == null || (objectAnimator = (ObjectAnimator) jk3.b) == null)) {
            objectAnimator.cancel();
        }
        this.x = null;
        this.y = null;
        g0().b();
    }

    public final void onViewCreated(View view) {
        hr8 t = h0().t(d0(), c0());
        yq8 yq8 = t instanceof yq8 ? (yq8) t : null;
        if (yq8 != null) {
            e0().setZoomEnabled(false);
            e0().setListener(new er7(20, (Object) this));
            h0().v(d0(), c0());
            e0().r(yq8.o, false);
            s85 s85 = h0().L0;
            iu7 iu7 = iu7.o;
            bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new ur6((Continuation) null, this), 5), getViewLifecycleScope());
            bs0.K(new ps5(ct.k(h0().U0, getViewLifecycleOwner().getLifecycle(), iu7), new vr6((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public GifViewerWidget(long j, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("chat.media.viewer.message_id", Long.valueOf(j)), TuplesKt.to("chat.media.viewer.attach_id", str), i2a.l(str2, Widget.ARG_SCOPE_ID)));
    }
}
