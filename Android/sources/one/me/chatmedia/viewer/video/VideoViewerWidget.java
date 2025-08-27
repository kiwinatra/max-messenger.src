package one.me.chatmedia.viewer.video;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Legd;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "j9g", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoViewerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoViewerWidget.kt\none/me/chatmedia/viewer/video/VideoViewerWidget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Log.kt\nru/ok/tamtam/logger/Log\n*L\n1#1,223:1\n5#2:224\n419#3:225\n419#3:226\n419#3:227\n255#3,9:228\n410#3,8:238\n410#3,8:246\n1#4:237\n32#5,4:254\n*S KotlinDebug\n*F\n+ 1 VideoViewerWidget.kt\none/me/chatmedia/viewer/video/VideoViewerWidget\n*L\n42#1:224\n44#1:225\n45#1:226\n47#1:227\n49#1:228,9\n129#1:238,8\n134#1:246,8\n140#1:254,4\n*E\n"})
@SuppressLint({"ValidController"})
public final class VideoViewerWidget extends Widget {
    public static final /* synthetic */ KProperty[] X;
    public final String a;
    public final is b;
    public final is c;
    public final Lazy o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty w;
    public jk3 x;
    public g4g y;
    public final nob z;

    static {
        Class<VideoViewerWidget> cls = VideoViewerWidget.class;
        X = new KProperty[]{wj6.p(cls, "msgId", "getMsgId()J", 0), wj6.p(cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0), wj6.p(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    }

    public VideoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = VideoViewerWidget.class.getName();
        this.b = new is(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new is(String.class, "", "chat.media.viewer.attach_id");
        is isVar = new is(egd.class, new egd(m1570getScopeIdIluPPks()), Widget.ARG_SCOPE_ID);
        KProperty kProperty = X[2];
        this.o = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, aj2.class, (Function0) null);
        this.v = viewBinding(cra.o);
        this.w = viewBinding(cra.p);
        this.z = new nob((Object) this);
    }

    public final String c0() {
        KProperty kProperty = X[1];
        return (String) this.c.a(this);
    }

    public final long d0() {
        KProperty kProperty = X[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final j9g e0() {
        zx3 targetController = getTargetController();
        if (targetController instanceof j9g) {
            return (j9g) targetController;
        }
        return null;
    }

    public final h9g f0() {
        return (h9g) this.w.getValue(this, X[4]);
    }

    public final void onActivityStarted(Activity activity) {
        j9g e0;
        n7g p0;
        super.onActivityStarted(activity);
        if (getView() != null && this.y != null && (e0 = e0()) != null && (p0 = ((ChatMediaViewerScreen) e0).p0()) != null) {
            tc5 tc5 = p0.v;
            if (tc5.getPlaybackState() == 3 && !tc5.q()) {
                f0().a(this.z);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        n7g p0;
        super.onActivityStopped(activity);
        if (getView() != null && this.y != null) {
            j9g e0 = e0();
            if (!(e0 == null || (p0 = ((ChatMediaViewerScreen) e0).p0()) == null)) {
                p0.pause();
                p0.L0((Surface) null);
            }
            f0().b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tlb tlb = new tlb(getContext());
        tlb.setId(cra.q);
        tlb.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tlb.setTouchEventDelegate(new nr4(tlb.getContext(), tlb, new lce(18, this), new xga(11, this)));
        t7g t7g = new t7g(tlb.getContext());
        t7g.setId(cra.o);
        t7g.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        tlb.addView(t7g);
        h9g h9g = new h9g(tlb.getContext());
        h9g.setId(cra.p);
        h9g.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        h9g.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.x = new jk3(h9g);
        tlb.addView(h9g);
        return tlb;
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
        f0().b();
    }

    public final void onViewCreated(View view) {
        Lazy lazy = this.o;
        etc etc = ((aj2) lazy.getValue()).U0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new k9g((Continuation) null, this), 5), getViewLifecycleScope());
        hr8 t = ((aj2) lazy.getValue()).t(d0(), c0());
        fr8 fr8 = t instanceof fr8 ? (fr8) t : null;
        if (fr8 != null) {
            t7g t7g = (t7g) this.v.getValue(this, X[3]);
            b3g b3g = t7g.B0;
            b3g b3g2 = fr8.o;
            boolean z2 = !Intrinsics.areEqual((Object) b3g2, (Object) b3g);
            t7g.B0 = b3g2;
            if (z2) {
                t7g.o(qa7.a(b3g2.b), qa7.a(b3g2.h));
            }
            bs0.K(new ps5(ct.k(((aj2) lazy.getValue()).L0, getViewLifecycleOwner().getLifecycle(), iu7), new l9g((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public VideoViewerWidget(long j, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("chat.media.viewer.message_id", Long.valueOf(j)), TuplesKt.to("chat.media.viewer.attach_id", str), i2a.l(str2, Widget.ARG_SCOPE_ID)));
    }
}
