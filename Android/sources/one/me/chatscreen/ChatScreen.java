package one.me.chatscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/ChatScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lcx3;", "Lqg3;", "Lpd6;", "Ldlb;", "Lml8;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatScreen.kt\none/me/chatscreen/ChatScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 9 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 10 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 11 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 12 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 13 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 14 IntentExt.kt\none/me/sdk/uikit/common/IntentExtKt\n*L\n1#1,1555:1\n420#2:1556\n420#2:1557\n419#2:1558\n235#2,10:1559\n235#2,10:1569\n235#2,10:1579\n235#2,10:1589\n235#2,10:1599\n235#2,10:1609\n235#2,10:1619\n235#2,10:1629\n235#2,10:1639\n235#2,10:1649\n410#2,8:1668\n410#2,8:1676\n414#2,4:1684\n410#2,8:1688\n410#2,8:1712\n410#2,8:1720\n410#2,8:1728\n410#2,8:1736\n410#2,8:1744\n410#2,8:1752\n410#2,8:1760\n410#2,8:1768\n410#2,8:1807\n5#3:1659\n5#3:1870\n5#3:1871\n1#4:1660\n24#5:1661\n24#5:1663\n24#5:1878\n17#6:1662\n17#6:1778\n17#6:1779\n256#7,2:1664\n256#7,2:1666\n256#7,2:1776\n256#7,2:1780\n254#7:1847\n65#7,4:1859\n37#7:1863\n53#7:1864\n72#7:1865\n365#7:1877\n157#7,8:1879\n20#8:1696\n33#8,14:1785\n20#8:1815\n20#8:1831\n50#8:1848\n42#8,5:1849\n131#9,10:1697\n131#9,10:1816\n131#9,10:1832\n49#10:1707\n51#10:1711\n49#10:1826\n51#10:1830\n49#10:1842\n51#10:1846\n17#10:1854\n19#10:1858\n49#10:1872\n51#10:1876\n46#11:1708\n51#11:1710\n46#11:1827\n51#11:1829\n46#11:1843\n51#11:1845\n46#11:1855\n51#11:1857\n46#11:1873\n51#11:1875\n105#12:1709\n105#12:1828\n105#12:1844\n105#12:1856\n105#12:1874\n135#13,3:1782\n138#13,8:1799\n9#14,2:1866\n9#14,2:1868\n*S KotlinDebug\n*F\n+ 1 ChatScreen.kt\none/me/chatscreen/ChatScreen\n*L\n224#1:1556\n225#1:1557\n226#1:1558\n235#1:1559,10\n242#1:1569,10\n256#1:1579,10\n267#1:1589,10\n269#1:1599,10\n291#1:1609,10\n293#1:1619,10\n300#1:1629,10\n320#1:1639,10\n331#1:1649,10\n737#1:1668,8\n741#1:1676,8\n745#1:1684,4\n778#1:1688,8\n790#1:1712,8\n795#1:1720,8\n834#1:1728,8\n847#1:1736,8\n864#1:1744,8\n877#1:1752,8\n885#1:1760,8\n919#1:1768,8\n1069#1:1807,8\n373#1:1659\n249#1:1870\n251#1:1871\n554#1:1661\n598#1:1663\n529#1:1878\n589#1:1662\n953#1:1778\n954#1:1779\n617#1:1664,2\n643#1:1666,2\n927#1:1776,2\n982#1:1780,2\n1207#1:1847\n1379#1:1859,4\n1379#1:1863\n1379#1:1864\n1379#1:1865\n526#1:1877\n541#1:1879,8\n786#1:1696\n1042#1:1785,14\n1182#1:1815\n1194#1:1831\n1281#1:1848\n1281#1:1849,5\n786#1:1697,10\n1182#1:1816,10\n1194#1:1832,10\n786#1:1707\n786#1:1711\n1182#1:1826\n1182#1:1830\n1194#1:1842\n1194#1:1846\n1329#1:1854\n1329#1:1858\n307#1:1872\n307#1:1876\n786#1:1708\n786#1:1710\n1182#1:1827\n1182#1:1829\n1194#1:1843\n1194#1:1845\n1329#1:1855\n1329#1:1857\n307#1:1873\n307#1:1875\n786#1:1709\n1182#1:1828\n1194#1:1844\n1329#1:1856\n307#1:1874\n1042#1:1782,3\n1042#1:1799,8\n1499#1:1866,2\n1508#1:1868,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatScreen extends SwipeWidget implements cx3, qg3, pd6, dlb, ml8 {
    public static final /* synthetic */ KProperty[] d1;
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final Lazy E0;
    public final String F0;
    public final ReadOnlyProperty G0;
    public final ReadOnlyProperty H0;
    public final ReadOnlyProperty I0;
    public final ReadOnlyProperty J0;
    public final ReadOnlyProperty K0;
    public final ReadOnlyProperty L0;
    public final ReadOnlyProperty M0;
    public final ReadOnlyProperty N0;
    public xr8 O0;
    public final ReadOnlyProperty P0;
    public final ReadOnlyProperty Q0;
    public final ReadOnlyProperty R0;
    public final Lazy S0;
    public final hb8 T0;
    public final ReadOnlyProperty U0;
    public final ReadOnlyProperty V0;
    public final ReadOnlyProperty W0;
    public final is X;
    public final ReadOnlyProperty X0;
    public boolean Y;
    public final ReadOnlyProperty Y0;
    public final Lazy Z;
    public final ReadOnlyProperty Z0;
    public final Lazy a1;
    public z3a b1;
    public final w28 c = new w28(new gm2(this, 0), new gm2(this, 12), 4);
    public Bundle c1;
    public final z5a o;
    public final tq1 v;
    public final Lazy v0;
    public final Lazy w;
    public final Lazy w0;
    public final w5 x;
    public final Lazy x0;
    public final is y;
    public final gm2 y0;
    public final is z;
    public final Lazy z0;

    static {
        Class<ChatScreen> cls = ChatScreen.class;
        d1 = new KProperty[]{wj6.p(cls, "unspecifiedChatId", "getUnspecifiedChatId()J", 0), wj6.p(cls, "type", "getType()Lone/me/chatscreen/deeplink/ChatDeepLinkRoutes$Type;", 0), wj6.p(cls, "openSearchField", "getOpenSearchField()Z", 0), wj6.p(cls, "messagesContainer", "getMessagesContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "messagesRouter", "getMessagesRouter()Lcom/bluelinelabs/conductor/Router;", 0), wj6.p(cls, "bottomContainer", "getBottomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "mediaBarContainer", "getMediaBarContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "mediaBarRouter", "getMediaBarRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), wj6.p(cls, "chatMainContainer", "getChatMainContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "videoMsgContainer", "getVideoMsgContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "videoMsgRouter", "getVideoMsgRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0), wj6.p(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "chatBackground", "getChatBackground()Landroid/view/View;", 0), wj6.p(cls, "suggestionsContainer", "getSuggestionsContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Object, hb8] */
    public ChatScreen(Bundle bundle) {
        super(bundle);
        un2 un2 = un2.a;
        this.o = (z5a) un2.getAccessor().g(z5a.class);
        this.v = (tq1) un2.getAccessor().g(tq1.class);
        Lazy lazy = tn2.a;
        this.w = un2.getAccessor().h(uj5.class);
        this.x = new w5(1, this);
        this.y = new is(Long.class, "id");
        this.z = new is(q72.class, "type");
        this.X = new is(Boolean.class, Boolean.FALSE, "open_search_field");
        this.Y = true;
        this.Z = createViewModelLazy(lp2.class, new rn2(0, new gm2(this, 13)));
        this.v0 = createViewModelLazy(mh9.class, new rn2(1, new gm2(this, 14)));
        this.w0 = createViewModelLazy(il8.class, new rn2(2, new gm2(this, 15)));
        this.x0 = createViewModelLazy(rk9.class, new rn2(3, new r52(28)));
        this.y0 = new gm2(this, 1);
        this.z0 = createViewModelLazy(v0f.class, new rn2(4, new gm2(this, 2)));
        this.A0 = createViewModelLazy(kf8.class, new rn2(5, new r52(23)));
        this.B0 = createViewModelLazy(sr8.class, new rn2(6, new r52(24)));
        this.C0 = createViewModelLazy(wkd.class, new rn2(7, new gm2(this, 4)));
        this.D0 = createViewModelLazy(alb.class, new rn2(8, new gm2(this, 9)));
        this.E0 = createViewModelLazy(yvc.class, new s(29, new r52(27)));
        this.F0 = "ChatScreen";
        int i = lra.k;
        this.G0 = viewBinding(i);
        this.H0 = Widget.childRouter$default(this, i, (Function1) null, 2, (Object) null);
        int i2 = lra.b;
        this.I0 = viewBinding(i2);
        this.J0 = childSlotRouter(i2);
        int i3 = lra.i;
        this.K0 = viewBinding(i3);
        this.L0 = childSlotRouter(i3);
        int i4 = lra.j;
        this.M0 = viewBinding(i4);
        this.N0 = Widget.childRouter$default(this, i4, (Function1) null, 2, (Object) null);
        this.P0 = viewBinding(lra.h);
        int i5 = lra.p;
        this.Q0 = viewBinding(i5);
        this.R0 = childSlotRouter(i5);
        this.S0 = un2.getAccessor().h(jb8.class);
        this.T0 = new Object();
        this.U0 = viewBinding(lra.o);
        this.V0 = viewBinding(lra.m);
        this.W0 = viewBinding(lra.l);
        this.X0 = viewBinding(lra.a);
        int i6 = lra.n;
        this.Y0 = viewBinding(i6);
        this.Z0 = childSlotRouter(i6);
        this.a1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new gm2(this, 11));
    }

    public static void G0(ChatScreen chatScreen, Integer num, String str, Integer num2, Integer num3, int i) {
        String str2 = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        chatScreen.getClass();
        if (r4 == null) {
            r4 = num != null ? q8.p(num.intValue(), chatScreen.getContext()) : null;
            if (r4 == null) {
                return;
            }
        }
        if (num2 != null) {
            str2 = q8.p(num2.intValue(), chatScreen.getContext());
        }
        z3a z3a = chatScreen.b1;
        if (z3a != null) {
            z3a.o();
        }
        e0b e0b = new e0b((Widget) chatScreen);
        e0b.i(r4);
        e0b.b(str2);
        e0b.c(new n0b(0, chatScreen.n0().getMeasuredHeight(), 3));
        if (num3 != null) {
            e0b.f(new o0b(num3.intValue()));
        }
        chatScreen.b1 = e0b.j();
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v15, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j0(one.me.chatscreen.ChatScreen r11, defpackage.mg9 r12) {
        /*
            r0 = 20
            r1 = 2
            r2 = 1
            r3 = 0
            r11.getClass()
            boolean r4 = r12.a
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r6 = 200(0xc8, double:9.9E-322)
            r8 = 0
            if (r4 == 0) goto L_0x00ec
            xr8 r12 = r11.O0
            if (r12 == 0) goto L_0x01c8
            r0 = r11
        L_0x0016:
            zx3 r4 = r0.getParentController()
            if (r4 == 0) goto L_0x0021
            zx3 r0 = r0.getParentController()
            goto L_0x0016
        L_0x0021:
            boolean r4 = r0 instanceof defpackage.l9d
            if (r4 == 0) goto L_0x0028
            l9d r0 = (defpackage.l9d) r0
            goto L_0x0029
        L_0x0028:
            r0 = r8
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            int r0 = r0.p()
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            h3b r11 = r11.z0()
            int r11 = r11.getBottom()
            int r11 = r11 + r0
            boolean r0 = r12.e
            android.view.View r4 = r12.b
            int r9 = r12.k
            if (r0 == 0) goto L_0x009b
            int r9 = r9 + r11
            android.content.Context r11 = r4.getContext()
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.heightPixels
            int r11 = r11 - r9
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r4 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x005d
            r8 = r0
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
        L_0x005d:
            if (r8 == 0) goto L_0x0062
            int r0 = r8.bottomMargin
            goto L_0x0063
        L_0x0062:
            r0 = r3
        L_0x0063:
            int r0 = r0 + r11
            android.animation.AnimatorSet r4 = r12.i
            if (r4 == 0) goto L_0x006b
            r4.cancel()
        L_0x006b:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.ValueAnimator r0 = r12.b(r0)
            int r5 = r12.c()
            int[] r11 = new int[]{r5, r11}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            ur8 r5 = new ur8
            r5.<init>(r12, r2)
            r11.addUpdateListener(r5)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r3] = r0
            r1[r2] = r11
            r4.playTogether(r1)
            r4.setDuration(r6)
            r4.start()
            r12.i = r4
            goto L_0x01c8
        L_0x009b:
            int r9 = r9 + r11
            android.content.Context r11 = r4.getContext()
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.heightPixels
            int r11 = r11 - r9
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r12.d()
            if (r0 == 0) goto L_0x00c9
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00c9
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00c3
            r1.height = r11
            r0.setLayoutParams(r1)
            goto L_0x00c9
        L_0x00c3:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x00c9:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x00d4
            r8 = r0
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
        L_0x00d4:
            if (r8 == 0) goto L_0x00d8
            int r3 = r8.bottomMargin
        L_0x00d8:
            int r11 = r11 + r3
            android.view.View r12 = r12.c
            int r0 = r12.getPaddingLeft()
            int r1 = r12.getPaddingTop()
            int r2 = r12.getPaddingRight()
            r12.setPadding(r0, r1, r2, r11)
            goto L_0x01c8
        L_0x00ec:
            xr8 r4 = r11.O0
            if (r4 == 0) goto L_0x01c8
            one.me.keyboardmedia.MediaKeyboardWidget r9 = r4.d()
            if (r9 == 0) goto L_0x0101
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x0101
            int r9 = r9.getHeight()
            goto L_0x0102
        L_0x0101:
            r9 = r3
        L_0x0102:
            int r4 = r4.c()
            if (r9 <= r4) goto L_0x01c8
            xr8 r4 = r11.O0
            if (r4 == 0) goto L_0x01c8
            s2 r9 = new s2
            r9.<init>((int) r0, (java.lang.Object) r12, (java.lang.Object) r11)
            boolean r11 = r4.e
            android.view.View r12 = r4.b
            if (r11 == 0) goto L_0x0182
            int r11 = r4.c()
            int r5 = r4.c()
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r10 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x012a
            r8 = r12
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
        L_0x012a:
            if (r8 == 0) goto L_0x012f
            int r12 = r8.bottomMargin
            goto L_0x0130
        L_0x012f:
            r12 = r3
        L_0x0130:
            int r5 = r5 + r12
            android.animation.AnimatorSet r12 = r4.i
            if (r12 == 0) goto L_0x0138
            r12.cancel()
        L_0x0138:
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            android.animation.ValueAnimator r5 = r4.b(r5)
            one.me.keyboardmedia.MediaKeyboardWidget r8 = r4.d()
            if (r8 == 0) goto L_0x0152
            android.view.View r8 = r8.getView()
            if (r8 == 0) goto L_0x0152
            int r8 = r8.getHeight()
            goto L_0x0153
        L_0x0152:
            r8 = r3
        L_0x0153:
            int[] r11 = new int[]{r8, r11}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            ur8 r8 = new ur8
            r8.<init>(r4, r2)
            r11.addUpdateListener(r8)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r3] = r5
            r1[r2] = r11
            r12.playTogether(r1)
            r12.setDuration(r6)
            j35 r11 = new j35
            r11.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r9)
            xh r0 = new xh
            r0.<init>(r12, r11, r3)
            r12.addListener(r0)
            r12.start()
            r4.i = r12
            goto L_0x01c8
        L_0x0182:
            int r11 = r4.c()
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r4.d()
            if (r0 == 0) goto L_0x01a4
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x01a4
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x019e
            r1.height = r11
            r0.setLayoutParams(r1)
            goto L_0x01a4
        L_0x019e:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x01a4:
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r0 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01af
            r8 = r12
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
        L_0x01af:
            if (r8 == 0) goto L_0x01b3
            int r3 = r8.bottomMargin
        L_0x01b3:
            int r11 = r11 + r3
            android.view.View r12 = r4.c
            int r0 = r12.getPaddingLeft()
            int r1 = r12.getPaddingTop()
            int r2 = r12.getPaddingRight()
            r12.setPadding(r0, r1, r2, r11)
            r9.invoke()
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.j0(one.me.chatscreen.ChatScreen, mg9):void");
    }

    public static final void k0(ChatScreen chatScreen, h3b h3b, boolean z2) {
        chatScreen.getClass();
        m2g S = m5a.S(wgf.f(h3b.getTitle()));
        l2g l2g = null;
        if (z2) {
            l2g b = wgf.b(h3b.getTitle());
            if ((b != null ? b.a : null) == S) {
                return;
            }
        }
        if (z2) {
            l2g b2 = wgf.b(h3b.getTitle());
            if ((b2 != null ? b2.a : null) != S) {
                l2g = new l2g(h3b.getContext(), S, new gl1(18));
            }
        }
        wgf.e(h3b.getTitle(), l2g);
    }

    public static final void l0(ChatScreen chatScreen, as0 as0) {
        chatScreen.getClass();
        int ordinal = as0.ordinal();
        String str = chatScreen.F0;
        if (ordinal == 0) {
            mz2 o0 = chatScreen.o0();
            if (!Intrinsics.areEqual((Object) o0.b(), (Object) "write_controller")) {
                i9d i9d = new i9d(new MessageWriteWidget(str, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("write_controller");
                o0.a.R(i9d);
            }
        } else if (ordinal == 1) {
            mz2 o02 = chatScreen.o0();
            if (!Intrinsics.areEqual((Object) o02.b(), (Object) "search_bar_controller")) {
                i9d i9d2 = new i9d(new SearchMessageBottomWidget(str, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d2.d("search_bar_controller");
                o02.a.R(i9d2);
            }
        } else if (ordinal == 2) {
            sp2 sp2 = (sp2) chatScreen.B0().V0.a.getValue();
            if (sp2 != null) {
                if (sp2 == sp2.w) {
                    mz2 o03 = chatScreen.o0();
                    o03.getClass();
                    o03.a.P(CollectionsKt.emptyList(), (ey3) null);
                    return;
                }
                mz2 o04 = chatScreen.o0();
                if (!Intrinsics.areEqual((Object) o04.b(), (Object) "unblock_contact_controller_tag")) {
                    i9d i9d3 = new i9d(new ChatStatusBottomWidget(str, sp2, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                    i9d3.d("unblock_contact_controller_tag");
                    o04.a.R(i9d3);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final oz1 A0() {
        return (oz1) this.Q0.getValue(this, d1[12]);
    }

    public final lp2 B0() {
        return (lp2) this.Z.getValue();
    }

    public final void C0() {
        q0().u((Long) null);
        s0().j((Pair) null);
        qc7 qc7 = (qc7) un2.a.getAccessor().j(qc7.class);
        if (qc7 != null) {
            qc7.f(SetsKt.setOf(new pc7(nc7.SEND_5_MESSAGES, 1)), jgd.CHAT);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Float} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r14.isInstance(r13) != false) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r0 = 372(0x174, float:5.21E-43)
            r1 = 34
            r2 = 0
            if (r13 == r0) goto L_0x0076
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r13 == r0) goto L_0x002d
            r15 = 1010(0x3f2, float:1.415E-42)
            if (r13 == r15) goto L_0x0011
            goto L_0x010b
        L_0x0011:
            r13 = -1
            if (r14 == r13) goto L_0x0015
            return
        L_0x0015:
            kotlin.Lazy r12 = r12.w0
            java.lang.Object r12 = r12.getValue()
            il8 r12 = (defpackage.il8) r12
            r12.getClass()
            mj8 r13 = new mj8
            r14 = 0
            r13.<init>(r14)
            ru0 r12 = r12.z
            r12.s(r13)
            goto L_0x010b
        L_0x002d:
            if (r15 != 0) goto L_0x0031
        L_0x002f:
            r13 = r2
            goto L_0x0048
        L_0x0031:
            int r13 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<s58> r14 = defpackage.s58.class
            java.lang.String r0 = "location_data"
            if (r13 < r1) goto L_0x003e
            java.io.Serializable r13 = defpackage.ti7.d(r15, r0, r14)
            goto L_0x0048
        L_0x003e:
            java.io.Serializable r13 = r15.getSerializableExtra(r0)
            boolean r14 = r14.isInstance(r13)
            if (r14 == 0) goto L_0x002f
        L_0x0048:
            r4 = r13
            s58 r4 = (defpackage.s58) r4
            if (r15 == 0) goto L_0x0058
            java.lang.String r13 = "zoom"
            r14 = 0
            float r13 = r15.getFloatExtra(r13, r14)
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
        L_0x0058:
            if (r4 == 0) goto L_0x010b
            if (r2 == 0) goto L_0x010b
            lp2 r3 = r12.B0()
            float r5 = r2.floatValue()
            mh9 r13 = r12.q0()
            java.lang.Long r8 = r13.l()
            r6 = 0
            r3.t(r4, r5, r6, r8)
            r12.C0()
            goto L_0x010b
        L_0x0076:
            if (r15 == 0) goto L_0x0094
            int r13 = android.os.Build.VERSION.SDK_INT
            java.lang.String r14 = "contacts.picker.result.key"
            java.lang.Class<gr3> r0 = defpackage.gr3.class
            if (r13 < r1) goto L_0x0085
            java.io.Serializable r13 = defpackage.ti7.d(r15, r14, r0)
            goto L_0x0091
        L_0x0085:
            java.io.Serializable r13 = r15.getSerializableExtra(r14)
            boolean r14 = r0.isInstance(r13)
            if (r14 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r13 = r2
        L_0x0091:
            gr3 r13 = (defpackage.gr3) r13
            goto L_0x0095
        L_0x0094:
            r13 = r2
        L_0x0095:
            if (r13 == 0) goto L_0x010b
            lp2 r14 = r12.B0()
            mh9 r15 = r12.q0()
            java.lang.Long r7 = r15.l()
            etc r15 = r14.Q0
            ome r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            a32 r15 = (defpackage.a32) r15
            if (r15 == 0) goto L_0x00df
            gaf r0 = r14.l()
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.b()
            f14 r1 = defpackage.f14.b
            to2 r11 = new to2
            java.util.List r3 = r13.a
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.List r13 = r13.b
            r9 = r13
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            long r5 = r15.a
            r10 = 0
            r3 = r11
            r4 = r14
            r3.<init>(r4, r5, r7, r8, r9, r10)
            jx3 r13 = r14.a
            aje r13 = defpackage.ev0.u(r13, r0, r1, r11)
            kotlin.reflect.KProperty[] r15 = defpackage.lp2.X0
            r0 = 3
            r15 = r15[r0]
            wie r0 = r14.G0
            r0.setValue(r14, r15, r13)
        L_0x00df:
            kotlin.reflect.KProperty[] r13 = d1
            r14 = 8
            r13 = r13[r14]
            kotlin.properties.ReadOnlyProperty r14 = r12.L0
            java.lang.Object r13 = r14.getValue(r12, r13)
            mz2 r13 = (defpackage.mz2) r13
            zx3 r13 = r13.a()
            boolean r14 = r13 instanceof one.me.chatscreen.mediabar.MediaBarWidget
            if (r14 == 0) goto L_0x00f8
            r2 = r13
            one.me.chatscreen.mediabar.MediaBarWidget r2 = (one.me.chatscreen.mediabar.MediaBarWidget) r2
        L_0x00f8:
            if (r2 == 0) goto L_0x0108
            android.view.View r13 = r2.getView()
            if (r13 == 0) goto L_0x0108
            orb r13 = r2.n0()
            r14 = 1
            r13.j(r14)
        L_0x0108:
            r12.C0()
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.D0(int, int, android.content.Intent):void");
    }

    public final boolean E0() {
        return o5a.v(getContext()).b && Build.VERSION.SDK_INT >= 30;
    }

    public final void F0() {
        a32 a32 = (a32) B0().Q0.a.getValue();
        if (a32 != null) {
            MessageWriteWidget r0 = r0();
            if (r0 != null) {
                r0.k();
            }
            KProperty[] kPropertyArr = d1;
            ((oz1) this.K0.getValue(this, kPropertyArr[7])).setVisibility(0);
            mz2 mz2 = (mz2) this.L0.getValue(this, kPropertyArr[8]);
            if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "media_bar_controller")) {
                MediaBarWidget mediaBarWidget = new MediaBarWidget(this.F0, a32.a, (DefaultConstructorMarker) null);
                mediaBarWidget.b1 = this;
                i9d i9d = new i9d(mediaBarWidget, (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("media_bar_controller");
                mz2.a.R(i9d);
            }
            il8 il8 = (il8) this.w0.getValue();
            Long l = (Long) il8.b.invoke();
            if (l == null) {
                il8.z.s(pj8.a);
                return;
            }
            aje u = ev0.u(il8.a, ((osa) ((gaf) il8.w.getValue())).b(), f14.b, new zk8(il8, l, (Continuation) null));
            il8.E0.setValue(il8, il8.G0[0], u);
        }
    }

    public final boolean J() {
        vj5 vj5 = (vj5) ((uj5) this.w.getValue());
        vj5.getClass();
        return vj5.m(PmsKey.f18chatanim, false) && this.Y;
    }

    public final void f0() {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
    }

    public final void g(int i, Bundle bundle) {
        if (!((lf1) this.a1.getValue()).g(i)) {
            lp2 B02 = B0();
            B02.getClass();
            if (i == lra.r || i == lra.s) {
                a32 a32 = (a32) B02.Q0.a.getValue();
                if (a32 != null) {
                    xag.g(B02, ((osa) B02.l()).b(), (f14) null, new ko2(B02, a32.a, (Continuation) null), 2);
                }
            } else if (i == dad.l0 || i == dad.m0 || i == dad.k0 || i == dad.n0) {
                ev0.v(B02.a, (CoroutineContext) null, (f14) null, new ho2(B02, i, (Continuation) null), 3);
            }
        }
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1550getScopeIdIluPPks() {
        return this.F0;
    }

    public final pgd getScreenDelegate() {
        return this.c;
    }

    public final boolean handleBack() {
        if (z0().c()) {
            xag.h(s0().y, hk9.a);
            return true;
        }
        yvc yvc = (yvc) this.E0.getValue();
        if (((Boolean) yvc.w.getValue()).booleanValue()) {
            xag.h(yvc.c, rvc.a);
            return true;
        }
        MessageWriteWidget r0 = r0();
        CharSequence text = r0 != null ? r0.d0().getText() : null;
        boolean handleBack = super.handleBack();
        View view = getView();
        if (view != null) {
            view.requestApplyInsets();
        }
        if (!handleBack) {
            B0().r(text, q0().l(), q0().k());
        }
        return handleBack;
    }

    public final void m0() {
        ViewGroup x02 = x0();
        if (E0()) {
            h88.f(x02, new yh7((jdb) null, new nr0(jdb.c, mr0.b, true), 1), (Function1) null);
        }
        oz1 n0 = n0();
        if (E0()) {
            h88.f(n0, new yh7((jdb) null, new nr0(jdb.c, mr0.b, true), 1), (Function1) null);
        }
        oz1 oz1 = (oz1) this.G0.getValue(this, d1[3]);
        if (E0()) {
            h88.f(oz1, new yh7((jdb) null, new nr0(jdb.a, mr0.b, true), 1), (Function1) null);
        }
        oz1 A02 = A0();
        if (E0()) {
            h88.f(A02, new yh7((jdb) null, new nr0(jdb.c, mr0.b, true), 1), (Function1) null);
        }
    }

    public final oz1 n0() {
        return (oz1) this.I0.getValue(this, d1[5]);
    }

    public final mz2 o0() {
        return (mz2) this.J0.getValue(this, d1[6]);
    }

    public final void onActivityPaused(Activity activity) {
        ((jb8) this.S0.getValue()).a(this.T0);
    }

    public final void onActivityResumed(Activity activity) {
        ((jb8) this.S0.getValue()).b(this.T0);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new dr0(4, this));
        } else if (wgf.d(z0().getTitle())) {
            k0(this, z0(), true);
        }
        getRouter().a(this.x);
        Bundle bundle = this.c1;
        if (bundle != null) {
            this.c1 = null;
            onUpdateArgs(getArgs().deepCopy(), bundle);
        }
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        fy3 fy32 = fy3.POP_ENTER;
        Lazy lazy = this.S0;
        hb8 hb8 = this.T0;
        if (fy3 == fy32 || fy3 == fy3.PUSH_ENTER) {
            ((jb8) lazy.getValue()).b(hb8);
        } else if (fy3 == fy3.PUSH_EXIT) {
            if (getView() != null) {
                int i = pq7.a;
                if (pq7.b(pq7.c)) {
                    kr7.A(requireActivity());
                }
            }
            v0().j();
            ((jb8) lazy.getValue()).a(hb8);
        }
    }

    public final void onContextAvailable(Context context) {
        bs0.K(new ps5(B0().W0, new um2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hm2 hm2 = new hm2(this, 0);
        w5f w5f = new w5f(getContext());
        w5f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hm2.invoke(w5f);
        return w5f;
    }

    public final void onDestroy() {
        ((h48) un2.a.getAccessor().g(h48.class)).f.j = null;
        super.onDestroy();
    }

    public final void onDestroyView(View view) {
        Drawable background = ((View) this.X0.getValue(this, d1[17])).getBackground();
        if (background != null) {
            background.setCallback((Drawable.Callback) null);
        }
        this.b1 = null;
        xr8 xr8 = this.O0;
        if (xr8 != null) {
            xr8.a();
        }
        this.O0 = null;
        this.T0.a();
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        getRouter().K(this.x);
        if (getView() != null) {
            MessageWriteWidget r0 = r0();
            CharSequence charSequence = null;
            if ((r0 != null ? r0.getView() : null) != null) {
                lp2 B02 = B0();
                MessageWriteWidget r02 = r0();
                if (r02 != null) {
                    charSequence = r02.d0().getText();
                }
                B02.r(charSequence, q0().l(), q0().k());
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((lf1) this.a1.getValue()).b(i, strArr, iArr);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        if (isAttached()) {
            i9d i9d = (i9d) CollectionsKt.lastOrNull(u0().e());
            String str = null;
            zx3 zx3 = i9d != null ? i9d.a : null;
            MessagesListWidget messagesListWidget = zx3 instanceof MessagesListWidget ? (MessagesListWidget) zx3 : null;
            if (messagesListWidget != null) {
                Bundle deepCopy = messagesListWidget.getArgs().deepCopy();
                if (bundle2.containsKey("message_id")) {
                    Bundle args = messagesListWidget.getArgs();
                    Object obj = bundle2.get("message_id");
                    if (obj != null) {
                        str = obj.toString();
                    }
                    args.putString("ARG_LOAD_MESSAGE_ID", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                } else if (bundle2.containsKey("load_mark")) {
                    Bundle args2 = messagesListWidget.getArgs();
                    Object obj2 = bundle2.get("load_mark");
                    if (obj2 != null) {
                        str = obj2.toString();
                    }
                    args2.putString("ARG_LOAD_MARK", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                }
            }
        } else if (!Intrinsics.areEqual((Object) bundle, (Object) bundle2)) {
            this.c1 = bundle2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0050, code lost:
        r1 = (defpackage.pg9) r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r23) {
        /*
            r22 = this;
            r8 = r22
            tu7 r0 = r22.getViewLifecycleScope()
            rm2 r1 = new rm2
            r9 = 0
            r1.<init>(r9, r8)
            r10 = 3
            defpackage.ev0.v(r0, r9, r9, r1, r10)
            xr8 r0 = new xr8
            kotlin.reflect.KProperty[] r20 = d1
            r21 = 10
            r1 = r20[r21]
            kotlin.properties.ReadOnlyProperty r2 = r8.N0
            java.lang.Object r1 = r2.getValue(r8, r1)
            r12 = r1
            e9d r12 = (defpackage.e9d) r12
            r1 = 9
            r1 = r20[r1]
            kotlin.properties.ReadOnlyProperty r2 = r8.M0
            java.lang.Object r1 = r2.getValue(r8, r1)
            r13 = r1
            oz1 r13 = (defpackage.oz1) r13
            oz1 r14 = r22.n0()
            gm2 r15 = new gm2
            r1 = 5
            r15.<init>(r8, r1)
            boolean r16 = r22.E0()
            tu7 r17 = r22.getViewLifecycleScope()
            mh9 r1 = r22.q0()
            etc r1 = r1.w0
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            o85 r1 = (defpackage.o85) r1
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r1.a
            pg9 r1 = (defpackage.pg9) r1
            if (r1 == 0) goto L_0x0059
            og9 r1 = r1.a
            goto L_0x005a
        L_0x0059:
            r1 = r9
        L_0x005a:
            og9 r2 = defpackage.og9.b
            r7 = 1
            r6 = 0
            if (r1 != r2) goto L_0x0063
            r18 = r7
            goto L_0x0065
        L_0x0063:
            r18 = r6
        L_0x0065:
            gm2 r1 = new gm2
            r2 = 6
            r1.<init>(r8, r2)
            r11 = r0
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.O0 = r0
            kotlin.Lazy r0 = r8.B0
            java.lang.Object r1 = r0.getValue()
            sr8 r1 = (defpackage.sr8) r1
            etc r1 = r1.x
            on2 r2 = new on2
            r3 = 28
            r2.<init>(r1, r3)
            lm2 r3 = new lm2
            r3.<init>(r1, r9, r8)
            ps5 r1 = new ps5
            r4 = 5
            r1.<init>(r2, r3, r4)
            pc r2 = new pc
            r3 = 26
            r2.<init>(r1, r3)
            tu7 r1 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r1)
            java.lang.Object r0 = r0.getValue()
            sr8 r0 = (defpackage.sr8) r0
            s85 r11 = r0.v
            wq0 r12 = new wq0
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "handleMediaKeyboardEvents"
            r1 = 2
            java.lang.String r5 = "handleMediaKeyboardEvents(Lone/me/sdk/arch/event/Event;)V"
            r13 = 4
            r14 = 7
            r0 = r12
            r2 = r22
            r15 = r6
            r6 = r13
            r13 = r7
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            ps5 r0 = new ps5
            r1 = 5
            r0.<init>(r11, r12, r1)
            tu7 r1 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r0, r1)
            mh9 r0 = r22.q0()
            etc r0 = r0.y0
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            nm2 r2 = new nm2
            r2.<init>(r0, r9, r8)
            ps5 r0 = new ps5
            r3 = 5
            r0.<init>(r1, r2, r3)
            pc r1 = new pc
            r2 = 27
            r1.<init>(r0, r2)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r1, r0)
            mh9 r0 = r22.q0()
            etc r0 = r0.w0
            jv7 r1 = r8.lifecycleOwner
            ju7 r1 = r1.getLifecycle()
            iu7 r11 = defpackage.iu7.o
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            qm2 r0 = new qm2
            r0.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r1, r0, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            wkd r0 = r22.v0()
            etc r0 = r0.x
            im2 r1 = new im2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            tu7 r0 = r22.getViewLifecycleScope()
            km2 r1 = new km2
            r1.<init>(r9, r8)
            defpackage.ev0.v(r0, r9, r9, r1, r10)
            r0 = 2
            r1 = r20[r0]
            is r1 = r8.X
            java.lang.Object r2 = r1.a(r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0169
            wkd r2 = r22.v0()
            r0 = r20[r0]
            java.lang.Object r0 = r1.a(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.k(r0)
            android.os.Bundle r0 = r22.getArgs()
            java.lang.String r1 = "open_search_field"
            r0.remove(r1)
        L_0x0169:
            lp2 r0 = r22.B0()
            wb r0 = r0.U0
            wkd r1 = r22.v0()
            etc r1 = r1.w
            sa r2 = new sa
            r3 = 2
            r2.<init>((int) r10, (kotlin.coroutines.Continuation) r9, (int) r3)
            i21 r3 = new i21
            r4 = 4
            r3.<init>(r0, r1, r2, r4)
            jv7 r0 = r22.getViewLifecycleOwner()
            ju7 r0 = r0.getLifecycle()
            co1 r0 = defpackage.ct.k(r3, r0, r11)
            tm2 r1 = new tm2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            java.lang.String r0 = defpackage.ev0.y(r22)
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            lv7 r1 = (defpackage.lv7) r1
            iu7 r1 = r1.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onViewCreated: viewstate="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            lp2 r0 = r22.B0()
            etc r0 = r0.P0
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            an2 r1 = new an2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            lp2 r0 = r22.B0()
            etc r0 = r0.R0
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            bn2 r1 = new bn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            lp2 r0 = r22.B0()
            s85 r0 = r0.T0
            iu7 r1 = defpackage.iu7.c
            jv7 r2 = r22.getViewLifecycleOwner()
            ju7 r2 = r2.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r2, r1)
            xm2 r1 = new xm2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            lp2 r0 = r22.B0()
            n6e r0 = r0.S0
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            cn2 r1 = new cn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            mh9 r0 = r22.q0()
            etc r0 = r0.C0
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            jn2 r2 = new jn2
            r2.<init>(r0, r9, r8)
            ps5 r0 = new ps5
            r3 = 5
            r0.<init>(r1, r2, r3)
            pc r1 = new pc
            r2 = 29
            r1.<init>(r0, r2)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r1, r0)
            mh9 r0 = r22.q0()
            s85 r0 = r0.I0
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            dn2 r1 = new dn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            kotlin.Lazy r0 = r8.w0
            java.lang.Object r0 = r0.getValue()
            il8 r0 = (defpackage.il8) r0
            s85 r0 = r0.Z
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            en2 r1 = new en2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            lp2 r0 = r22.B0()
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x02f2
            mh9 r0 = r22.q0()
            etc r0 = r0.G0
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            fn2 r1 = new fn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
        L_0x02f2:
            rk9 r0 = r22.s0()
            s85 r0 = r0.z
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            gn2 r1 = new gn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            mh9 r0 = r22.q0()
            s85 r0 = r0.Z
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            hn2 r1 = new hn2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            r0 = 16
            r0 = r20[r0]
            kotlin.properties.ReadOnlyProperty r1 = r8.W0
            java.lang.Object r0 = r1.getValue(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            e9d r0 = r8.getChildRouter(r0)
            r0.e = r13
            r0.Q(r15)
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0363
            one.me.pinbars.PinBarsWidget r1 = new one.me.pinbars.PinBarsWidget
            java.lang.String r2 = r8.F0
            r1.<init>(r2, r9)
            i9d r1 = defpackage.iq.n(r1, r9, r9)
            r0.R(r1)
        L_0x0363:
            rk9 r0 = r22.s0()
            etc r0 = r0.x
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            jv7 r0 = r22.getViewLifecycleOwner()
            ju7 r0 = r0.getLifecycle()
            co1 r0 = defpackage.ct.k(r1, r0, r11)
            in2 r1 = new in2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            kotlin.Lazy r0 = r8.A0
            java.lang.Object r0 = r0.getValue()
            kf8 r0 = (defpackage.kf8) r0
            s85 r0 = r0.c
            on2 r10 = new on2
            r1 = 28
            r10.<init>(r0, r1)
            wq0 r12 = new wq0
            java.lang.String r5 = "showAddLinkBottomsheet(Lone/me/sdk/messagewrite/markdown/AddLinkState;)V"
            r6 = 4
            r1 = 2
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "showAddLinkBottomsheet"
            r7 = 8
            r0 = r12
            r2 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            ps5 r0 = new ps5
            r1 = 5
            r0.<init>(r10, r12, r1)
            tu7 r1 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r0, r1)
            kotlin.Lazy r0 = r8.E0
            java.lang.Object r1 = r0.getValue()
            yvc r1 = (defpackage.yvc) r1
            s85 r1 = r1.b
            jv7 r2 = r22.getViewLifecycleOwner()
            ju7 r2 = r2.getLifecycle()
            co1 r1 = defpackage.ct.k(r1, r2, r11)
            ym2 r2 = new ym2
            r2.<init>(r9, r8)
            ps5 r3 = new ps5
            r4 = 5
            r3.<init>(r1, r2, r4)
            tu7 r1 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r3, r1)
            java.lang.Object r0 = r0.getValue()
            yvc r0 = (defpackage.yvc) r0
            etc r0 = r0.y
            jv7 r1 = r22.getViewLifecycleOwner()
            ju7 r1 = r1.getLifecycle()
            co1 r0 = defpackage.ct.k(r0, r1, r11)
            zm2 r1 = new zm2
            r1.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r0, r1, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            kotlin.Lazy r0 = r8.z0
            java.lang.Object r0 = r0.getValue()
            v0f r0 = (defpackage.v0f) r0
            etc r0 = r0.D0
            on2 r1 = new on2
            r2 = 28
            r1.<init>(r0, r2)
            sm2 r0 = new sm2
            r0.<init>(r9, r8)
            ps5 r2 = new ps5
            r3 = 5
            r2.<init>(r1, r0, r3)
            tu7 r0 = r22.getViewLifecycleScope()
            defpackage.bs0.K(r2, r0)
            lp2 r0 = r22.B0()
            r0.getClass()
            java.lang.Class<lp2> r1 = defpackage.lp2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "restore draft"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            gaf r1 = r0.l()
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            f14 r2 = defpackage.f14.b
            qo2 r3 = new qo2
            r3.<init>(r0, r9)
            jx3 r4 = r0.a
            aje r1 = defpackage.ev0.u(r4, r1, r2, r3)
            kotlin.reflect.KProperty[] r2 = defpackage.lp2.X0
            r2 = r2[r21]
            wie r3 = r0.N0
            r3.setValue(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.onViewCreated(android.view.View):void");
    }

    public final jgd p0() {
        i9d i9d = (i9d) CollectionsKt.lastOrNull(getRouter().e());
        zx3 zx3 = i9d != null ? i9d.a : null;
        zx3 a = ((mz2) this.L0.getValue(this, d1[8])).a();
        if (!Intrinsics.areEqual((Object) zx3, (Object) this) && (zx3 instanceof u5a)) {
            return ((u5a) zx3).m();
        }
        if (a instanceof MediaBarWidget) {
            MediaBarWidget mediaBarWidget = (MediaBarWidget) a;
            if (mediaBarWidget.n0().getScrollState() != lrb.a) {
                return mediaBarWidget.m();
            }
        }
        return jgd.CHAT;
    }

    public final mh9 q0() {
        return (mh9) this.v0.getValue();
    }

    public final MessageWriteWidget r0() {
        zx3 a = o0().a();
        if (a instanceof MessageWriteWidget) {
            return (MessageWriteWidget) a;
        }
        return null;
    }

    public final void s(int i, Bundle bundle) {
        if (i == dad.E0) {
            if (bundle != null) {
                long j = bundle.getLong("contact_id");
                ((lf1) this.a1.getValue()).j(j, true, new w11(j, 3));
            }
        } else if (i == dad.D0) {
            w0().d();
        } else if (i == dad.C0) {
            B0().o();
        } else if (i == dad.B0) {
            lp2 B02 = B0();
            B02.getClass();
            xag.g(B02, (CoroutineContext) null, (f14) null, new kp2(B02, (Continuation) null), 3);
        } else if (i == dad.A0 && bundle != null) {
            long j2 = bundle.getLong("chat_server_id");
            ta4 W02 = wn2.b.W0();
            W02.b(":settings/folder/by-chat?id=" + j2, (Bundle) null);
        }
    }

    public final rk9 s0() {
        return (rk9) this.x0.getValue();
    }

    public final e9d u0() {
        return (e9d) this.H0.getValue(this, d1[4]);
    }

    public final wkd v0() {
        return (wkd) this.C0.getValue();
    }

    public final pza w0() {
        return (pza) this.V0.getValue(this, d1[15]);
    }

    public final ViewGroup x0() {
        return (ViewGroup) this.Y0.getValue(this, d1[18]);
    }

    public final mz2 y0() {
        return (mz2) this.Z0.getValue(this, d1[19]);
    }

    public final h3b z0() {
        return (h3b) this.U0.getValue(this, d1[14]);
    }
}
