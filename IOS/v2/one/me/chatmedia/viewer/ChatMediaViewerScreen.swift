package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lmfb;", "Lj9g;", "Lghd;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "attachId", "msgId", "", "singleMode", "descOrder", "(JLjava/lang/String;JZZ)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMediaViewerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMediaViewerScreen.kt\none/me/chatmedia/viewer/ChatMediaViewerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,751:1\n419#2:752\n419#2:753\n419#2:754\n419#2:755\n419#2:756\n235#2,10:757\n410#2,8:780\n410#2,8:788\n410#2,8:796\n410#2,8:804\n410#2,8:812\n410#2,8:820\n410#2,8:828\n423#2:836\n424#2:842\n5#3:767\n254#4:768\n157#4,8:772\n254#4:837\n256#4,2:838\n256#4,2:840\n254#4:843\n365#4:844\n254#4:845\n1#5:769\n24#6:770\n24#6:771\n41#7:846\n91#7,14:847\n30#7:861\n91#7,14:862\n*S KotlinDebug\n*F\n+ 1 ChatMediaViewerScreen.kt\none/me/chatmedia/viewer/ChatMediaViewerScreen\n*L\n99#1:752\n100#1:753\n101#1:754\n102#1:755\n103#1:756\n116#1:757,10\n298#1:780,8\n314#1:788,8\n320#1:796,8\n323#1:804,8\n324#1:812,8\n342#1:820,8\n345#1:828,8\n365#1:836\n365#1:842\n161#1:767\n182#1:768\n249#1:772,8\n366#1:837\n367#1:838,2\n368#1:840,2\n418#1:843\n550#1:844\n622#1:845\n207#1:770\n249#1:771\n635#1:846\n635#1:847,14\n650#1:861\n650#1:862,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMediaViewerScreen extends SwipeWidget implements mfb, j9g, ghd, cx3 {
    public static final /* synthetic */ KProperty[] H0;
    public static final yh7 I0;
    public static final yh7 J0;
    public final of2 A0;
    public final Lazy B0;
    public final Lazy C0;
    public float D0;
    public boolean E0;
    public pm7 F0;
    public z3a G0;
    public final boolean X;
    public final Lazy Y;
    public final ReadOnlyProperty Z;
    public final is c;
    public final is o;
    public final is v;
    public final ReadOnlyProperty v0;
    public final is w;
    public final ReadOnlyProperty w0;
    public final is x;
    public n09 x0;
    public final Lazy y;
    public log y0;
    public final w28 z;
    public AnimatorSet z0;

    static {
        Class<ChatMediaViewerScreen> cls = ChatMediaViewerScreen.class;
        H0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "attachId", "getAttachId()Ljava/lang/String;", 0), wj6.p(cls, "msgId", "getMsgId()J", 0), wj6.p(cls, "descOrder", "getDescOrder()Z", 0), wj6.p(cls, "singleMode", "getSingleMode()Z", 0), wj6.p(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
        jdb jdb = jdb.o;
        jdb jdb2 = anf.a;
        I0 = new yh7(jdb, (nr0) null, 2);
        J0 = new yh7((jdb) null, new nr0(jdb, mr0.a, false), 1);
    }

    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.c = new is(cls, 0L, "chat.media.viewer.chat_id");
        this.o = new is(String.class, "", "chat.media.viewer.attach_id");
        this.v = new is(cls, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.w = new is(cls2, bool, "chat.media.viewer.desc_order");
        this.x = new is(cls2, bool, "chat.media.viewer.single_mode");
        cd2 cd2 = cd2.a;
        this.y = cd2.getAccessor().h(uj5.class);
        this.z = new w28(new r52(11), (Function0) null, 6);
        this.X = true;
        this.Y = createViewModelLazy(aj2.class, new s(23, new ih2(this, 0)));
        this.Z = viewBinding(cra.e);
        this.v0 = viewBinding(cra.i);
        this.w0 = viewBinding(cra.d);
        this.A0 = new of2(this, ((aua) cd2.getAccessor().g(aua.class)).a());
        this.B0 = cd2.getAccessor().h(mce.class);
        this.C0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ih2(this, 1));
        this.D0 = -1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.F0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean j0(one.me.chatmedia.viewer.ChatMediaViewerScreen r1) {
        /*
            kotlin.Lazy r0 = r1.C0
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto L_0x0014
            pm7 r1 = r1.F0
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isActive()
            r0 = 1
            if (r1 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.j0(one.me.chatmedia.viewer.ChatMediaViewerScreen):boolean");
    }

    public final boolean J() {
        vj5 vj5 = (vj5) ((uj5) this.y.getValue());
        vj5.getClass();
        return vj5.m(PmsKey.f18chatanim, false);
    }

    public final void d0() {
        Window window;
        Window window2;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(l2b.d.h);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setStatusBarColor(l2b.d.h);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            window.setNavigationBarColor(l2b.d.h);
        }
        m0(true);
        l0(false);
    }

    public final void e0() {
        Window window;
        Window window2;
        View view = getView();
        if (view != null) {
            l2b.d.getClass();
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            l2b.d.getClass();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            l2b.d.getClass();
            window.setNavigationBarColor(0);
        }
    }

    public final void f0() {
        if (getView() == null) {
            return;
        }
        if (q0().getVisibility() == 0) {
            q0().setVisibility(8);
            o0().setVisibility(8);
            n09 n09 = this.x0;
            if (n09 != null) {
                n09.m(false);
                return;
            }
            return;
        }
        n0();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1547getScopeIdIluPPks() {
        return "chatMediaViewer";
    }

    public final pgd getScreenDelegate() {
        return this.z;
    }

    public final Long h0() {
        return 1000L;
    }

    public final boolean handleBack() {
        n0();
        z3a z3a = this.G0;
        if (z3a != null) {
            z3a.o();
        }
        return super.handleBack();
    }

    public final Integer i0() {
        return Integer.valueOf(l2b.d.h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = defpackage.y7e.r(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k0() {
        /*
            r3 = this;
            android.view.View r0 = r3.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r0 = defpackage.y7e.r(r0)
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            hf7 r2 = r3.o0()
            int r2 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x0031
            hf7 r3 = r3.o0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x002c
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x0031
            int r1 = r3.bottomMargin
        L_0x0031:
            int r2 = r2 + r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.k0():int");
    }

    public final void l0(boolean z2) {
        if (z2) {
            log log = this.y0;
            if (log != null) {
                log.a.z0(1);
                return;
            }
            return;
        }
        log log2 = this.y0;
        if (log2 != null) {
            log2.a.Q(1);
        }
    }

    public final void m0(boolean z2) {
        Window window;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            String name = fu4.k.f(window.getDecorView()).getName();
            m2b m2b = m2b.a;
            boolean z3 = Intrinsics.areEqual((Object) name, (Object) "one.me.sdk.design.OneMeThemeLight") && !z2;
            log log = this.y0;
            if (log != null) {
                log.b(z3);
            }
            log log2 = this.y0;
            if (log2 != null) {
                log2.a(z3);
            }
        }
    }

    public final void n0() {
        Window window;
        Window window2;
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            l2b l2b = l2b.a;
            l2b.d.getClass();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            l2b l2b2 = l2b.a;
            l2b.d.getClass();
            window.setNavigationBarColor(0);
        }
        m0(false);
        l0(true);
    }

    public final hf7 o0() {
        return (hf7) this.w0.getValue(this, H0[7]);
    }

    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() != null && o0().getVisibility() == 0) {
            Window window = activity.getWindow();
            df0 df0 = l2b.d;
            window.setStatusBarColor(df0.h);
            activity.getWindow().setNavigationBarColor(df0.h);
            m0(true);
        }
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        if (!fy3.b) {
            n0();
        }
        if (fy3 == fy3.POP_EXIT && this.C0.isInitialized()) {
            aj2 r0 = r0();
            long F02 = p0().F0();
            r0.getClass();
            caa caa = caa.a;
            f14 f14 = f14.a;
            si2 si2 = new si2(r0, F02, (Continuation) null);
            ev0.u(r0.a, caa, f14.c, si2);
            p0().x = null;
            q3d q3d = ((mce) this.B0.getValue()).f;
            if (q3d.isInitialized()) {
                n7g n7g = (n7g) q3d.getValue();
                z68.c(n7g.c, "Player. Release", new Object[0]);
                tc5 tc5 = n7g.v;
                tc5.release();
                tc5.K1();
                tc5.A0.w.l(n7g);
                tc5.f0(n7g);
                n7g.w.u();
                n7g.L0((Surface) null);
                q3d.a();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [n09, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w5f w5f = new w5f(getContext());
        w5f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(w5f.getContext());
        viewPager2.setId(cra.e);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.A0);
        hsg.m(viewPager2);
        w5f.addView(viewPager2);
        h3b d = o54.d(w5f.getContext(), (AttributeSet) null);
        d.setId(cra.i);
        d.setLayoutParams(new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density)));
        d.setForm(z2b.a);
        d.setCustomTheme(l2b.a);
        d.setLeftActions(new p2b(new jh2(this, 0)));
        b3b b3b = new b3b(cad.v0, 0, new f(13, (Object) this), 14);
        KProperty kProperty = H0[4];
        if (((Boolean) this.x.a(this)).booleanValue()) {
            d.setRightActions(new u2b((d3b) null, b3b));
        } else {
            d.setRightActions(new u2b(new b3b(lya.f, 0, new jh2(this, 1), 14), b3b));
        }
        df0 df0 = l2b.d;
        d.setBackgroundColor(df0.h);
        h88.f(d, I0, (Function1) null);
        w5f.addView(d);
        w5f.setClipChildren(false);
        w5f.setClipToPadding(false);
        hf7 hf7 = new hf7(w5f.getContext());
        hf7.setId(cra.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        hf7.setLayoutParams(layoutParams);
        hf7.setClipChildren(false);
        hf7.setClipToPadding(false);
        float f = (float) 9;
        hf7.setPadding(hf7.getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), hf7.getPaddingRight(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        int i = df0.h;
        hf7.setBackgroundColor(i);
        h88.f(hf7, J0, (Function1) null);
        w5f.addView(hf7);
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setStatusBarColor(i);
            activity.getWindow().setNavigationBarColor(i);
            log log = new log(activity.getWindow(), activity.getWindow().getDecorView());
            log.a.u0();
            this.y0 = log;
        }
        m0(true);
        w5f.setBackgroundColor(i);
        b8d b8d = new b8d((Object) this);
        ? obj = new Object();
        obj.b = w5f;
        obj.c = b8d;
        obj.a = n09.class.getName();
        te7 te7 = new te7();
        te7.b = new int[]{0, m2b.e.f.a};
        obj.o = te7;
        l09 l09 = new l09(obj, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        obj.v = LazyKt.lazy(lazyThreadSafetyMode, l09);
        obj.w = LazyKt.lazy(lazyThreadSafetyMode, new l09(obj, 1));
        obj.x = LazyKt.lazy(lazyThreadSafetyMode, new l09(obj, 2));
        obj.z = m09.a;
        obj.y = LazyKt.lazy(lazyThreadSafetyMode, new l09(obj, 3));
        this.x0 = obj;
        return w5f;
    }

    public final void onDestroy() {
        super.onDestroy();
        Lazy lazy = this.C0;
        if (lazy.isInitialized()) {
            ((mce) this.B0.getValue()).a((n7g) lazy.getValue());
            ((n7g) lazy.getValue()).M0();
        }
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.y0 = null;
        this.x0 = null;
    }

    public final void onViewCreated(View view) {
        etc etc = r0().O0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new kh2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().S0, getViewLifecycleOwner().getLifecycle(), iu7), new lh2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().Q0, getViewLifecycleOwner().getLifecycle(), iu7), new mh2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().L0, getViewLifecycleOwner().getLifecycle(), iu7), new nh2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().M0, getViewLifecycleOwner().getLifecycle(), iu7), new oh2((Continuation) null, this), 5), getViewLifecycleScope());
        ((ViewPager2) this.Z.getValue(this, H0[5])).b(new gi0(3, this));
        bs0.K(new ps5(ct.k(o0().getEvents(), getViewLifecycleOwner().getLifecycle(), iu7), new ph2((Continuation) null, this), 5), getViewLifecycleScope());
        aj2 r0 = r0();
        xag.g(r0, ((osa) r0.z).b(), (f14) null, new qi2(r0, (Continuation) null), 2);
        bs0.K(new ps5(ct.k(r0().W0, getViewLifecycleOwner().getLifecycle(), iu7), new qh2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final n7g p0() {
        return (n7g) this.C0.getValue();
    }

    public final h3b q0() {
        return (h3b) this.v0.getValue(this, H0[6]);
    }

    public final aj2 r0() {
        return (aj2) this.Y.getValue();
    }

    public final void s(int i, Bundle bundle) {
        r0().z(i);
    }

    public final void s0(boolean z2) {
        z3a z3a = this.G0;
        if (z3a != null) {
            z3a.o();
        }
        String string = getContext().getString(z2 ? zkc.oneme_chatmedia_viewer_load_video_fail : zkc.oneme_chatmedia_viewer_load_photo_fail);
        e0b e0b = new e0b((Widget) this);
        e0b.i(string);
        e0b.c(new n0b(0, k0(), 3));
        e0b.f(new o0b(cad.K));
        this.G0 = e0b.j();
    }

    public final void u0() {
        n7g p0 = p0();
        Duration.Companion companion = Duration.Companion;
        this.F0 = bs0.K(ct.k(new ps5(bs0.w(new sbd(new o7g(p0, DurationKt.toDuration(50, DurationUnit.MILLISECONDS), (Continuation) null))), new sh2((Continuation) null, this), 5), getViewLifecycleOwner().getLifecycle(), iu7.o), getViewLifecycleScope());
    }

    public final void v0(boolean z2) {
        AnimatorSet animatorSet = this.z0;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = (q0().getVisibility() == 0 || o0().getVisibility() == 0) ? c44.DEFAULT_ASPECT_RATIO : 1.0f;
            List createListBuilder = CollectionsKt.createListBuilder();
            h3b q0 = q0();
            Property property = View.ALPHA;
            createListBuilder.add(ObjectAnimator.ofFloat(q0, property, new float[]{q0().getAlpha(), f}));
            createListBuilder.add(ObjectAnimator.ofFloat(o0(), property, new float[]{o0().getAlpha(), f}));
            n09 n09 = this.x0;
            ObjectAnimator ofFloat = n09 != null ? ObjectAnimator.ofFloat(n09.g(), property, new float[]{n09.g().getAlpha(), f}) : null;
            if (z2 && ofFloat != null) {
                createListBuilder.add(ofFloat);
            }
            List build = CollectionsKt.build(createListBuilder);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(build);
            animatorSet2.setDuration(200);
            animatorSet2.addListener(new th2(this, z2, f));
            animatorSet2.addListener(new th2(f, this, z2));
            animatorSet2.start();
            this.z0 = animatorSet2;
        }
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z2, boolean z3) {
        this(o54.f(TuplesKt.to("chat.media.viewer.chat_id", Long.valueOf(j)), TuplesKt.to("chat.media.viewer.attach_id", str), TuplesKt.to("chat.media.viewer.message_id", Long.valueOf(j2)), TuplesKt.to("chat.media.viewer.single_mode", Boolean.valueOf(z2)), TuplesKt.to("chat.media.viewer.desc_order", Boolean.valueOf(z3))));
    }
}
