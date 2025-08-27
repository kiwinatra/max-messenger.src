package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.mediabar.ActLocalMedias;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lu5a;", "Lqg3;", "Lwt1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "", "chatId", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ml8", "qa", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaBarWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaBarWidget.kt\none/me/chatscreen/mediabar/MediaBarWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 5 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Color.kt\nandroidx/core/graphics/ColorKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 10 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 11 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 12 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 13 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 14 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,1224:1\n420#2:1225\n235#2,10:1226\n235#2,10:1238\n235#2,10:1248\n255#2,9:1260\n235#2,10:1269\n255#2,9:1281\n410#2,8:1292\n410#2,8:1300\n410#2,8:1308\n410#2,8:1316\n410#2,8:1324\n410#2,8:1332\n410#2,8:1408\n410#2,8:1416\n410#2,8:1450\n28#3:1236\n24#3:1386\n28#3:1395\n24#3:1396\n28#3:1397\n24#3:1398\n24#3:1399\n24#3:1431\n28#3:1440\n24#3:1441\n8#4:1237\n9#5:1258\n9#5:1279\n9#5:1369\n1#6:1259\n1#6:1280\n1#6:1291\n1#6:1370\n1#6:1378\n117#7:1290\n256#8,2:1340\n256#8,2:1342\n256#8,2:1376\n65#8,4:1379\n37#8:1383\n53#8:1384\n72#8:1385\n157#8,8:1387\n157#8,8:1400\n65#8,4:1424\n37#8:1428\n53#8:1429\n72#8:1430\n256#8,2:1458\n157#8,8:1460\n256#8,2:1468\n135#9,3:1344\n138#9,8:1361\n33#10,14:1347\n17#11:1371\n19#11:1375\n46#12:1372\n51#12:1374\n105#13:1373\n193#14,8:1432\n193#14,8:1442\n*S KotlinDebug\n*F\n+ 1 MediaBarWidget.kt\none/me/chatscreen/mediabar/MediaBarWidget\n*L\n132#1:1225\n201#1:1226,10\n410#1:1238,10\n413#1:1248,10\n414#1:1260,9\n418#1:1269,10\n436#1:1281,9\n703#1:1292,8\n731#1:1300,8\n745#1:1308,8\n804#1:1316,8\n808#1:1324,8\n820#1:1332,8\n239#1:1408,8\n249#1:1416,8\n310#1:1450,8\n335#1:1236\n1066#1:1386\n1080#1:1395\n164#1:1396\n167#1:1397\n174#1:1398\n175#1:1399\n260#1:1431\n266#1:1440\n302#1:1441\n408#1:1237\n415#1:1258\n437#1:1279\n909#1:1369\n415#1:1259\n437#1:1280\n909#1:1370\n490#1:1290\n836#1:1340,2\n837#1:1342,2\n953#1:1376,2\n1008#1:1379,4\n1008#1:1383\n1008#1:1384\n1008#1:1385\n1078#1:1387,8\n175#1:1400,8\n276#1:1424,4\n276#1:1428\n276#1:1429\n276#1:1430\n322#1:1458,2\n398#1:1460,8\n432#1:1468,2\n876#1:1344,3\n876#1:1361,8\n876#1:1347,14\n925#1:1371\n925#1:1375\n925#1:1372\n925#1:1374\n925#1:1373\n260#1:1432,8\n302#1:1442,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaBarWidget extends Widget implements u5a, qg3, wt1 {
    public static final /* synthetic */ KProperty[] c1;
    public static final yh7 d1 = new yh7((jdb) null, new nr0(jdb.c, mr0.c, true), 1);
    public final ColorDrawable A0;
    public final sn0 B0;
    public float C0;
    public float D0;
    public int E0;
    public final sn0 F0;
    public final sn0 G0;
    public final sn0 H0;
    public final sn0 I0;
    public final lr0 J0;
    public final ColorDrawable K0;
    public ValueAnimator L0;
    public final sn0 M0;
    public final sn0 N0;
    public final sn0 O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final Lazy S0;
    public final Lazy T0;
    public final ReadOnlyProperty U0;
    public final sn0 V0;
    public final Lazy W0;
    public z3a X;
    public final ReadOnlyProperty X0;
    public final sn0 Y;
    public final ReadOnlyProperty Y0;
    public final sn0 Z;
    public final fb6 Z0;
    public final String a;
    public xr8 a1;
    public final is b;
    public ml8 b1;
    public final Lazy c;
    public final z5a o;
    public final h48 v;
    public final sn0 v0;
    public final IntEvaluator w;
    public final sn0 w0;
    public final ReadOnlyProperty x;
    public final Lazy x0;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty y0;
    public final ReadOnlyProperty z;
    public final sn0 z0;

    static {
        Class<MediaBarWidget> cls = MediaBarWidget.class;
        c1 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), wj6.p(cls, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), wj6.p(cls, "selectedMediaAdapter", "getSelectedMediaAdapter()Lone/me/chatscreen/mediabar/SelectedMediaAdapter;", 0), wj6.p(cls, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "selectedMediaContent", "getSelectedMediaContent()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), wj6.p(cls, "draggableContainer", "getDraggableContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    }

    public MediaBarWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        r72.b.getClass();
        this.a = bb4.a(r72.c.a);
        this.b = new is(Long.class, "chat_id");
        this.c = fdb.a.c();
        un2 un2 = un2.a;
        this.o = (z5a) un2.getAccessor().g(z5a.class);
        this.v = (h48) un2.getAccessor().g(h48.class);
        this.w = new IntEvaluator();
        this.x = childSlotRouter(ogc.media_bar__bottom_container);
        this.y = childSlotRouter(ogc.media_bar__primary_container);
        this.z = viewBinding(ogc.media_bar__popup_layout);
        this.Y = binding(new jl8(this, 0));
        this.Z = binding(new jl8(this, 1));
        this.v0 = binding(new jl8(this, 2));
        this.w0 = binding(new jl8(this, 3));
        this.x0 = createViewModelLazy(hcc.class, new i76(15, new ck7(23)));
        this.y0 = childSlotRouter(ogc.media_bar__partial_media_access_container);
        this.z0 = binding(new jl8(this, 4));
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.A0 = colorDrawable;
        this.B0 = binding(new jl8(this, 5));
        this.F0 = binding(new jl8(this, 6));
        this.G0 = binding(new jl8(this, 7));
        this.H0 = binding(new jl8(this, 8));
        this.I0 = binding(new jl8(this, 9));
        this.J0 = new lr0(vo4.c().getDisplayMetrics().density * 12.0f, 1);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.K0 = colorDrawable2;
        this.M0 = binding(new jl8(this, 14));
        this.N0 = binding(new jl8(this, 17));
        this.O0 = binding(new jl8(this, 18));
        this.P0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new jl8(this, 19));
        this.Q0 = createViewModelLazy(om6.class, new i76(16, new jl8(this, 20)));
        this.R0 = createViewModelLazy(p19.class, new i76(17, new ck7(24)));
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "scope_id", cls);
        if (k != null) {
            this.S0 = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, il8.class, (Function0) null);
            this.T0 = createViewModelLazy(opd.class, new i76(18, new ck7(25)));
            this.U0 = childSlotRouter(lra.y);
            this.V0 = binding(new jl8(this, 21));
            Object k2 = n54.k(bundle, "scope_id", cls);
            if (k2 != null) {
                this.W0 = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k2)).a, sr8.class, (Function0) null);
                int i = lra.w;
                this.X0 = viewBinding(i);
                this.Y0 = Widget.childRouter$default(this, i, (Function1) null, 2, (Object) null);
                this.Z0 = new fb6(this, 1);
                return;
            }
            throw new IllegalArgumentException(wj6.k("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public static final void c0(MediaBarWidget mediaBarWidget, int i, int i2) {
        z3a z3a = mediaBarWidget.X;
        if (z3a != null) {
            z3a.o();
        }
        e0b e0b = new e0b((ViewGroup) mediaBarWidget.n0());
        e0b.c(new n0b(0, mediaBarWidget.h0().getHeight(), 3));
        e0b.f(new o0b(i));
        e0b.i(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.X = e0b.j();
    }

    public static final void d0(MediaBarWidget mediaBarWidget, int i) {
        z3a z3a = mediaBarWidget.X;
        if (z3a != null) {
            z3a.o();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(uya.a, i, new Object[]{Integer.valueOf(i)});
        e0b e0b = new e0b((ViewGroup) mediaBarWidget.n0());
        e0b.c(new n0b(0, mediaBarWidget.h0().getHeight(), 3));
        e0b.i(quantityString);
        mediaBarWidget.X = e0b.j();
    }

    public static final void e0(MediaBarWidget mediaBarWidget) {
        mediaBarWidget.getClass();
        KProperty[] kPropertyArr = c1;
        KProperty kProperty = kPropertyArr[5];
        int measuredHeight = mediaBarWidget.q0().getMeasuredHeight() + ((FrameLayout) mediaBarWidget.Z.getValue()).getMeasuredHeight();
        KProperty kProperty2 = kPropertyArr[9];
        float measuredHeight2 = mediaBarWidget.D0 + mediaBarWidget.C0 + ((float) (((oz1) mediaBarWidget.z0.getValue()).getMeasuredHeight() + mediaBarWidget.j0().getPaddingTop() + measuredHeight));
        LinearLayout h0 = mediaBarWidget.h0();
        Rect rect = rcg.a;
        rcg.d(rect, h0);
        int coerceAtLeast = RangesKt.coerceAtLeast((mediaBarWidget.i0().getHeight() + ((int) measuredHeight2)) - rect.top, 0);
        xt1 i0 = mediaBarWidget.i0();
        int i = (-((int) mediaBarWidget.C0)) + mediaBarWidget.E0;
        i0.y = i;
        i0.z = coerceAtLeast;
        if (!i0.x0) {
            cnf cnf = i0.v0;
            cnf.a = i;
            cnf.b = coerceAtLeast;
            i0.invalidateOutline();
        }
        mediaBarWidget.i0().setPreviewTranslationY(measuredHeight2);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [zx3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f0() {
        /*
            r4 = this;
            xt1 r0 = r4.i0()
            ecc r0 = r0.a
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            r3 = 0
            if (r2 == 0) goto L_0x0019
            if (r0 != 0) goto L_0x0012
            r0 = r3
        L_0x0012:
            at1 r0 = r0.getCameraApi()
            r0.k()
        L_0x0019:
            mz2 r0 = r4.o0()
            zx3 r0 = r0.a()
            boolean r2 = r0 instanceof one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget
            if (r2 == 0) goto L_0x0038
            one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget r0 = (one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget) r0
            sn0 r0 = r0.o
            boolean r2 = r0.isInitialized()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r0 = r0.getValue()
            at1 r0 = (defpackage.at1) r0
            r0.k()
        L_0x0038:
            kotlin.reflect.KProperty[] r0 = c1
            r2 = 18
            r0 = r0[r2]
            kotlin.properties.ReadOnlyProperty r2 = r4.U0
            java.lang.Object r0 = r2.getValue(r4, r0)
            mz2 r0 = (defpackage.mz2) r0
            zx3 r0 = r0.a()
            boolean r2 = r0 instanceof one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            if (r2 == 0) goto L_0x0051
            r3 = r0
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r3 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r3
        L_0x0051:
            if (r3 == 0) goto L_0x005a
            orb r0 = r3.d0()
            r0.j(r1)
        L_0x005a:
            h3b r4 = r4.q0()
            r0 = 0
            r4.setDropdownRotationProgress(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.mediabar.MediaBarWidget.f0():void");
    }

    public final void g(int i, Bundle bundle) {
        if (i == 1) {
            il8 r0 = r0();
            r0.getClass();
            r0.z.s(new mj8(false));
        }
    }

    public final void g0() {
        ecc ecc = i0().a;
        if (ecc != null) {
            if (ecc == null) {
                ecc = null;
            }
            ecc.getCameraApi().e();
        }
        zx3 a2 = o0().a();
        if (a2 instanceof MediaBarPermissionWidget) {
            sn0 sn0 = ((MediaBarPermissionWidget) a2).o;
            if (sn0.isInitialized()) {
                ((at1) sn0.getValue()).e();
            }
        }
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1551getScopeIdIluPPks() {
        return this.a;
    }

    public final LinearLayout h0() {
        KProperty kProperty = c1[17];
        return (LinearLayout) this.O0.getValue();
    }

    public final boolean handleBack() {
        if (i0().x0) {
            i0().a(false, true);
            z5a.g(this.o, jgd.CHAT_ATTACH_PICKER);
            return true;
        }
        lrb scrollState = n0().getScrollState();
        scrollState.getClass();
        if (scrollState == lrb.a) {
            return false;
        }
        if (l0().n()) {
            il8 r0 = r0();
            r0.Y.C(og9.a);
            return true;
        } else if (!r0().n()) {
            return true;
        } else {
            n0().j(true);
            return true;
        }
    }

    public final xt1 i0() {
        KProperty kProperty = c1[10];
        return (xt1) this.B0.getValue();
    }

    public final LinearLayout j0() {
        KProperty kProperty = c1[15];
        return (LinearLayout) this.M0.getValue();
    }

    public final om6 k0() {
        return (om6) this.Q0.getValue();
    }

    public final e9d l0() {
        return (e9d) this.Y0.getValue(this, c1[21]);
    }

    public final jgd m() {
        return i0().x0 ? jgd.CHAT_ATTACH_PICKER_CAMERA : jgd.CHAT_ATTACH_PICKER;
    }

    public final dc9 m0() {
        KProperty kProperty = c1[14];
        return (dc9) this.I0.getValue();
    }

    public final orb n0() {
        return (orb) this.z.getValue(this, c1[3]);
    }

    public final mz2 o0() {
        return (mz2) this.y.getValue(this, c1[2]);
    }

    public final void onActivityPaused(Activity activity) {
        if (getView() != null) {
            f0();
        }
        super.onActivityPaused(activity);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        il8 r0 = r0();
        int i3 = r0.k().k;
        int i4 = i3 == 0 ? -1 : xk8.$EnumSwitchMapping$2[tr1.y(i3)];
        xme xme = r0.y;
        if (i4 == 1 || i4 == 2) {
            n00 n00 = n00.a;
            xme.getClass();
            xme.m((Object) null, n00);
            r0.k().s(3);
        } else if (i4 == 3) {
            n00 n002 = n00.b;
            xme.getClass();
            xme.m((Object) null, n002);
            r0.k().s(2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (i == 39393) {
            i0().a(false, false);
            if (i2 == -1) {
                r0().m(true);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            if (n0().getScrollState() != lrb.a) {
                g0();
            }
            m0().setText(this.v.f.j);
        }
        il8 r0 = r0();
        r0.w0.h();
        r0.x0.h();
        hcc hcc = (hcc) this.x0.getValue();
        hcc.v0.h();
        hcc.w0.h();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        orb orb = new orb(getContext());
        orb.setId(ogc.media_bar__popup_layout);
        fu4.k.e(orb.getContext()).f().c().getClass();
        orb.setBackground(new ColorDrawable(-1728053248));
        orb.addView(j0());
        orb.addView(h0());
        orb.addView(i0());
        FrameLayout frameLayout = new FrameLayout(orb.getContext());
        frameLayout.setId(lra.w);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = pq7.a;
        frameLayout.setTranslationY((float) pq7.a(frameLayout.getContext()));
        h88.f(frameLayout, new yh7((jdb) null, new nr0(jdb.o, mr0.a, false), 1), (Function1) null);
        orb.addView(frameLayout);
        orb.setCallback(new qa(this, 2));
        o5a.O(new ps5(pq7.f, new ol8(this, orb, (Continuation) null), 5), getViewLifecycleScope());
        return orb;
    }

    public final void onDestroyView(View view) {
        orb n0 = n0();
        ValueAnimator valueAnimator = n0.v;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        n0.v = null;
        ecc ecc = i0().a;
        if (ecc != null) {
            if (ecc == null) {
                ecc = null;
            }
            ecc.getCameraApi().c();
        }
        xr8 xr8 = this.a1;
        if (xr8 != null) {
            xr8.a();
        }
        this.a1 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Lazy lazy = this.c;
        if (i == 159) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.l;
            int i2 = qad.O6;
            int i3 = qad.P6;
            ((edb) lazy.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        } else if (i == 171) {
            eng eng2 = new eng(this, 1);
            String[] strArr3 = edb.h;
            int i4 = qad.w6;
            int i5 = qad.u6;
            ((edb) lazy.getValue()).getClass();
            edb.k(eng2, strArr, iArr, strArr3, i4, i5);
        }
    }

    public final void onViewCreated(View view) {
        KProperty[] kPropertyArr = c1;
        mz2 mz2 = (mz2) this.x.getValue(this, kPropertyArr[1]);
        og9 og9 = null;
        if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "media_type_picker_widget")) {
            KProperty kProperty = kPropertyArr[0];
            i9d i9d = new i9d(new MediaTypePickerWidget(this.a, ((Number) this.b.a(this)).longValue(), (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("media_type_picker_widget");
            mz2.a.R(i9d);
        }
        xme xme = r0().y;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new wl8((Continuation) null, this), 5), getViewLifecycleScope());
        o5a.O(new ps5(r0().y0, new am8((Continuation) null, this), 5), getViewLifecycleScope());
        o5a.O(new ps5(bs0.Q(r0().z), new bm8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().D0, getViewLifecycleOwner().getLifecycle(), iu7), new xl8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().B0, getViewLifecycleOwner().getLifecycle(), iu7), new yl8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().z0, getViewLifecycleOwner().getLifecycle(), iu7), new zl8((Continuation) null, this), 5), getViewLifecycleScope());
        o5a.O(new ps5(k0().c, new ul8((Continuation) null, this), 5), getViewLifecycleScope());
        o5a.O(new ps5(((p19) this.R0.getValue()).b, new vl8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((hcc) this.x0.getValue()).Z, getViewLifecycleOwner().getLifecycle(), iu7), new tl8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((opd) this.T0.getValue()).o, getViewLifecycleOwner().getLifecycle(), iu7), new sl8((Continuation) null, this), 5), getViewLifecycleScope());
        e9d l0 = l0();
        oz1 oz1 = (oz1) this.X0.getValue(this, kPropertyArr[20]);
        LinearLayout h0 = h0();
        jl8 jl8 = new jl8(this, 15);
        boolean z2 = o5a.v(getContext()).b && Build.VERSION.SDK_INT >= 30;
        tu7 viewLifecycleScope = getViewLifecycleScope();
        pg9 pg9 = (pg9) ((etc) r0().Y.c).a.getValue();
        if (pg9 != null) {
            og9 = pg9.a;
        }
        this.a1 = new xr8(l0, oz1, h0, jl8, z2, viewLifecycleScope, og9 == og9.b, new jl8(this, 16));
        new qr8((sr8) this.W0.getValue(), m0()).a(getViewLifecycleScope());
        bs0.K(new ps5(new on2((etc) r0().Y.c, 28), new wq0(2, this, MediaBarWidget.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 17), 5), getViewLifecycleScope());
    }

    public final oz1 p0() {
        KProperty kProperty = c1[19];
        return (oz1) this.V0.getValue();
    }

    public final h3b q0() {
        KProperty kProperty = c1[6];
        return (h3b) this.v0.getValue();
    }

    public final il8 r0() {
        return (il8) this.S0.getValue();
    }

    public final void s0(d48 d48, int i, String str) {
        hn requireActivity = requireActivity();
        boolean l = r0().l();
        z38 a2 = a48.a();
        a2.d = str;
        a2.f = i;
        a2.e = d48.a();
        a2.j = 0;
        a2.k = 0;
        a2.a = true;
        a2.b = l;
        Pair c0 = ActLocalMedias.c0(requireActivity, d48, (o5h) null, a2, false);
        startActivityForResult((Intent) c0.first, 39393, (Bundle) c0.second);
    }

    public final void u0(prd prd) {
        int ordinal = prd.ordinal();
        if (ordinal == 0) {
            m0().setRightOuterIconActionState(xb9.a);
        } else if (ordinal == 1) {
            m0().setRightOuterIconActionState(wb9.a);
        } else if (ordinal == 2) {
            m0().setRightOuterIconActionState(yb9.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void v0(n00 n00) {
        x2b x2b;
        int i;
        h3b q0 = q0();
        if (r0().l()) {
            x2b = s2b.a;
        } else {
            int ordinal = n00.ordinal();
            if (ordinal == 0) {
                i = kra.i;
            } else if (ordinal == 1) {
                i = kra.h;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            x2b = new u2b((d3b) null, new a3b(i, new ll8(this, 0)));
        }
        q0.setRightActions(x2b);
    }

    public MediaBarWidget(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "scope_id"), TuplesKt.to("chat_id", Long.valueOf(j))));
    }
}
