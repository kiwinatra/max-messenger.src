package one.me.messages.list.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0015\u0016\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014¨\u0006\u0018"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "parentScope", "", "chatId", "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "(Ljava/lang/String;JJLjava/util/List;JZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "as8", "jn9", "t65", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessagesListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesListWidget.kt\none/me/messages/list/ui/MessagesListWidget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Log.kt\nru/ok/tamtam/logger/Log\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 13 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 14 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 15 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 16 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 17 TextSource.kt\none/me/sdk/uikit/common/TextSourceKt\n*L\n1#1,1400:1\n5#2:1401\n420#3:1402\n419#3:1403\n255#3,9:1404\n235#3,10:1413\n410#3,8:1431\n410#3,8:1439\n410#3,8:1447\n410#3,8:1460\n410#3,8:1468\n410#3,8:1476\n414#3,4:1484\n410#3,8:1508\n235#3,10:1573\n5#4:1423\n5#4:1424\n81#5:1425\n17#6:1426\n19#6:1430\n17#6:1455\n19#6:1459\n46#7:1427\n51#7:1429\n46#7:1456\n51#7:1458\n105#8:1428\n105#8:1457\n32#9,4:1488\n32#9,4:1516\n1557#10:1492\n1628#10,3:1493\n1#11:1496\n20#12:1497\n20#12:1498\n24#13:1499\n193#14,8:1500\n135#15,3:1520\n138#15,8:1537\n135#15,3:1545\n138#15,8:1562\n33#16,14:1523\n33#16,14:1548\n167#17:1570\n167#17:1571\n167#17:1572\n*S KotlinDebug\n*F\n+ 1 MessagesListWidget.kt\none/me/messages/list/ui/MessagesListWidget\n*L\n190#1:1401\n194#1:1402\n195#1:1403\n197#1:1404,9\n200#1:1413,10\n482#1:1431,8\n492#1:1439,8\n523#1:1447,8\n528#1:1460,8\n552#1:1468,8\n565#1:1476,8\n590#1:1484,4\n973#1:1508,8\n227#1:1573,10\n230#1:1423\n329#1:1424\n450#1:1425\n470#1:1426\n470#1:1430\n527#1:1455\n527#1:1459\n470#1:1427\n470#1:1429\n527#1:1456\n527#1:1458\n470#1:1428\n527#1:1457\n662#1:1488,4\n1098#1:1516,4\n705#1:1492\n705#1:1493,3\n802#1:1497\n803#1:1498\n883#1:1499\n883#1:1500,8\n1168#1:1520,3\n1168#1:1537,8\n1186#1:1545,3\n1186#1:1562,8\n1168#1:1523,14\n1186#1:1548,14\n1288#1:1570\n1289#1:1571\n1290#1:1572\n*E\n"})
@SuppressLint({"ValidController"})
public final class MessagesListWidget extends Widget implements qg3, cx3 {
    public static final /* synthetic */ KProperty[] R0;
    public bwf A0;
    public v74 B0;
    public nwe C0;
    public hb8 D0;
    public final wie E0;
    public final sn0 F0;
    public final sn0 G0;
    public final as8 H0;
    public final jn9 I0;
    public final t65 J0;
    public final h3g K0;
    public final sn0 L0;
    public final sn0 M0;
    public final sn0 N0;
    public final sn0 O0;
    public e55 P0;
    public yrc Q0;
    public final xy6 X;
    public g6f Y;
    public eo9 Z;
    public final String a;
    public final String b;
    public final is c;
    public final Lazy o;
    public final cpb v;
    public final xj9 v0;
    public final Lazy w;
    public final Lazy w0;
    public final Lazy x;
    public or0 x0;
    public final Lazy y;
    public final ReadOnlyProperty y0;
    public final Lazy z;
    public final ReadOnlyProperty z0;

    static {
        Class<MessagesListWidget> cls = MessagesListWidget.class;
        R0 = new KProperty[]{wj6.p(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), rae.s(cls, "selectedMessageIdsForAction", "getSelectedMessageIdsForAction()[J", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "scrollButtonsContainer", "getScrollButtonsContainer()Lone/me/messages/list/ui/view/scroll/ScrollButtonsContainer;", 0), rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0), wj6.p(cls, "messagesListRecyclerViewAnalyticsListener", "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;", 0), wj6.p(cls, "prefetchReactionsScrollListener", "getPrefetchReactionsScrollListener()Lru/ok/onechat/reactions/PrefetchReactionsScrollListener;", 0), wj6.p(cls, "messagesLayoutManager", "getMessagesLayoutManager()Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", 0), wj6.p(cls, "messagesScroller", "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;", 0), wj6.p(cls, "emptyStateContainer", "getEmptyStateContainer()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "reactionEffectsView", "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0)};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessagesListWidget(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 2
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r3 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r3 = r3.getName()
            r0.a = r3
            java.lang.String r3 = "MessagesList"
            r0.b = r3
            is r3 = new is
            java.lang.String r5 = "arg_key_scope_id"
            java.lang.Class<egd> r6 = defpackage.egd.class
            r3.<init>(r6, r5)
            is r5 = new is
            java.lang.Class<long[]> r6 = long[].class
            java.lang.String r7 = "selected.messageIds.Action"
            r5.<init>(r6, r4, r7)
            r0.c = r5
            kotlin.reflect.KProperty[] r5 = R0
            r2 = r5[r2]
            java.lang.Object r2 = r3.a(r0)
            egd r2 = (defpackage.egd) r2
            java.lang.String r2 = r2.a
            java.lang.Class<rk9> r3 = defpackage.rk9.class
            kotlin.Lazy r2 = r0.m1571getSharedViewModelcp94BC8(r2, r3, r4)
            r0.o = r2
            vi9 r2 = defpackage.vi9.a
            q4 r3 = r2.getAccessor()
            java.lang.Class<cpb> r5 = defpackage.cpb.class
            java.lang.Object r3 = r3.g(r5)
            cpb r3 = (defpackage.cpb) r3
            r0.v = r3
            fn9 r3 = new fn9
            r5 = 0
            r3.<init>(r1, r0, r5)
            i76 r5 = new i76
            r6 = 27
            r5.<init>(r6, r3)
            java.lang.Class<en9> r3 = defpackage.en9.class
            kotlin.Lazy r3 = r0.createViewModelLazy(r3, r5)
            r0.w = r3
            fn9 r3 = new fn9
            r5 = 1
            r3.<init>(r1, r0, r5)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r3)
            r0.x = r1
            gn9 r1 = new gn9
            r3 = 9
            r1.<init>(r0, r3)
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r1)
            r0.y = r1
            q4 r1 = r2.getAccessor()
            java.lang.Class<g99> r5 = defpackage.g99.class
            kotlin.Lazy r1 = r1.h(r5)
            r0.z = r1
            xy6 r9 = new xy6
            q4 r1 = r2.getAccessor()
            java.lang.Class<tld> r5 = defpackage.tld.class
            kotlin.Lazy r1 = r1.h(r5)
            r9.<init>(r1)
            r0.X = r9
            q4 r1 = r2.getAccessor()
            java.lang.Class<aua> r5 = defpackage.aua.class
            java.lang.Object r1 = r1.g(r5)
            aua r1 = (defpackage.aua) r1
            java.util.concurrent.ExecutorService r6 = r1.a()
            hq7 r8 = new hq7
            en9 r1 = r20.k0()
            r8.<init>((defpackage.en9) r1)
            rt6 r10 = new rt6
            r1 = 28
            r10.<init>((int) r1, (java.lang.Object) r0)
            pn9 r7 = new pn9
            r7.<init>(r0)
            td8 r12 = new td8
            r1 = 21
            r12.<init>(r1, r0)
            xj9 r1 = new xj9
            ir0 r11 = new ir0
            r5 = 4
            r11.<init>(r5, r0)
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.v0 = r1
            gn9 r5 = new gn9
            r6 = 10
            r5.<init>(r0, r6)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r5)
            r0.w0 = r3
            int r3 = defpackage.chc.messages_list_recycler_view
            kotlin.properties.ReadOnlyProperty r3 = r0.viewBinding(r3)
            r0.y0 = r3
            int r3 = defpackage.chc.messages_list_scroll_btn
            kotlin.properties.ReadOnlyProperty r3 = r0.viewBinding(r3)
            r0.z0 = r3
            wie r3 = defpackage.o5a.U()
            r0.E0 = r3
            gn9 r3 = new gn9
            r5 = 11
            r3.<init>(r0, r5)
            sn0 r3 = r0.binding(r3)
            r0.F0 = r3
            gn9 r3 = new gn9
            r5 = 0
            r3.<init>(r0, r5)
            sn0 r3 = r0.binding(r3)
            r0.G0 = r3
            as8 r3 = new as8
            r3.<init>(r0)
            r0.H0 = r3
            jn9 r3 = new jn9
            r3.<init>(r0)
            r0.I0 = r3
            t65 r3 = new t65
            r3.<init>((one.me.messages.list.ui.MessagesListWidget) r0)
            r0.J0 = r3
            h3g r3 = new h3g
            q4 r5 = r2.getAccessor()
            java.lang.Class<ipb> r6 = defpackage.ipb.class
            kotlin.Lazy r14 = r5.h(r6)
            q4 r5 = r2.getAccessor()
            java.lang.Class<n5g> r6 = defpackage.n5g.class
            kotlin.Lazy r15 = r5.h(r6)
            q4 r5 = r2.getAccessor()
            java.lang.Class<h90> r6 = defpackage.h90.class
            java.lang.Object r5 = r5.g(r6)
            r16 = r5
            h90 r16 = (defpackage.h90) r16
            hn9 r5 = new hn9
            r6 = 0
            r5.<init>(r0, r6)
            zw r6 = new zw
            r7 = 28
            r6.<init>((int) r7, (java.lang.Object) r0)
            r13 = r3
            r17 = r1
            r18 = r5
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.K0 = r3
            gn9 r1 = new gn9
            r3 = 1
            r1.<init>(r0, r3)
            sn0 r1 = r0.binding(r1)
            r0.L0 = r1
            gn9 r1 = new gn9
            r3 = 3
            r1.<init>(r0, r3)
            sn0 r1 = r0.binding(r1)
            r0.M0 = r1
            gn9 r1 = new gn9
            r3 = 7
            r1.<init>(r0, r3)
            sn0 r1 = r0.binding(r1)
            r0.N0 = r1
            gn9 r1 = new gn9
            r3 = 8
            r1.<init>(r0, r3)
            sn0 r1 = r0.binding(r1)
            r0.O0 = r1
            q4 r1 = r2.getAccessor()
            java.lang.Class<ec8> r2 = defpackage.ec8.class
            java.lang.Object r1 = r1.g(r2)
            ec8 r1 = (defpackage.ec8) r1
            kotlin.Lazy r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            x23 r2 = (defpackage.x23) r2
            a33 r2 = (defpackage.a33) r2
            long r2 = r2.B()
            long r5 = r1.g
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x01b9
            boolean r2 = r1.i
            if (r2 != 0) goto L_0x01b9
            goto L_0x01dc
        L_0x01b9:
            xbb r2 = new xbb
            ybb r3 = defpackage.ybb.CHAT_INIT_TO_RENDER
            long r5 = android.os.SystemClock.elapsedRealtime()
            r2.<init>(r3, r5)
            qz9 r5 = r1.e
            r5.k(r3, r2)
            bc8 r2 = new bc8
            r2.<init>(r1, r4)
            r3 = 3
            jx3 r5 = r1.d
            aje r2 = defpackage.ev0.v(r5, r4, r4, r2, r3)
            java.util.LinkedHashMap r1 = r1.f
            tbb r3 = defpackage.tbb.EVENT_OPEN_CHAT
            r1.put(r3, r2)
        L_0x01dc:
            en9 r1 = r20.k0()
            etc r1 = r1.n1
            in9 r2 = new in9
            r2.<init>(r4, r0)
            ps5 r3 = new ps5
            r4 = 5
            r3.<init>(r1, r2, r4)
            tu7 r0 = r20.getLifecycleScope()
            defpackage.bs0.K(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.<init>(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c0(one.me.messages.list.ui.MessagesListWidget r5, defpackage.hid r6) {
        /*
            java.lang.String r0 = r5.a
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0007
            goto L_0x0021
        L_0x0007:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0021
            w78 r2 = defpackage.w78.o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Got new scrollState="
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x0021:
            t65 r0 = r5.J0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r5.h0()
            r2 = 0
            r0.b(r1, r2, r2)
            xhd r0 = r5.j0()
            rhd r1 = defpackage.rhd.a
            int r3 = r6.a
            ohd r0 = r0.d(r1)
            r0.setCounter(r3)
            boolean r0 = r6.b
            if (r0 == 0) goto L_0x0046
            xhd r0 = r5.j0()
            r0.c(r1)
            goto L_0x004d
        L_0x0046:
            xhd r0 = r5.j0()
            r0.b(r1)
        L_0x004d:
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x007f
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r5.h0()
            androidx.recyclerview.widget.LinearLayoutManager r1 = defpackage.y7e.v(r0)
            r3 = 1
            if (r1 == 0) goto L_0x0071
            int r1 = r1.X0()
            tyc r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x006b
            int r0 = r0.j()
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            int r0 = r0 - r3
            if (r1 != r0) goto L_0x0071
            r0 = r3
            goto L_0x0072
        L_0x0071:
            r0 = r2
        L_0x0072:
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x007f
            xhd r0 = r5.j0()
            rhd r1 = defpackage.rhd.b
            r0.c(r1)
            goto L_0x0088
        L_0x007f:
            xhd r0 = r5.j0()
            rhd r1 = defpackage.rhd.b
            r0.b(r1)
        L_0x0088:
            gid r0 = r6.d
            if (r0 != 0) goto L_0x0096
            xhd r5 = r5.j0()
            rhd r6 = defpackage.rhd.c
            r5.b(r6)
            goto L_0x00bb
        L_0x0096:
            jn9 r0 = r5.I0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r5.h0()
            r3 = -1
            r0.a = r3
            r0.b = r3
            r0.b(r1, r2, r2)
            gid r6 = r6.d
            long r0 = r6.b
            xo9 r6 = r5.f0()
            boolean r6 = r6.a(r0)
            if (r6 != 0) goto L_0x00bb
            xhd r5 = r5.j0()
            rhd r6 = defpackage.rhd.c
            r5.c(r6)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.c0(one.me.messages.list.ui.MessagesListWidget, hid):void");
    }

    public final FrameLayout d0() {
        KProperty kProperty = R0[9];
        return (FrameLayout) this.N0.getValue();
    }

    public final MessagesLayoutManager e0() {
        KProperty kProperty = R0[7];
        return (MessagesLayoutManager) this.L0.getValue();
    }

    public final xo9 f0() {
        KProperty kProperty = R0[8];
        return (xo9) this.M0.getValue();
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            kotlin.Lazy r0 = r9.y
            java.lang.Object r0 = r0.getValue()
            lf1 r0 = (defpackage.lf1) r0
            boolean r0 = r0.g(r10)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            if (r11 == 0) goto L_0x00a0
            java.lang.String r0 = "selected.messageIds.Action"
            long[] r0 = r11.getLongArray(r0)
            if (r0 != 0) goto L_0x001b
            goto L_0x00a0
        L_0x001b:
            int r1 = defpackage.cwa.V
            if (r10 != r1) goto L_0x0095
            java.lang.Long r4 = kotlin.collections.ArraysKt.firstOrNull((long[]) r0)
            java.lang.String r10 = "bot.shareContact.confirm.keyboardId"
            java.lang.String r5 = r11.getString(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 34
            java.lang.String r2 = "bot.shareContact.confirm.button"
            java.lang.Class<xv0> r3 = defpackage.xv0.class
            if (r10 < r1) goto L_0x0039
            java.io.Serializable r2 = defpackage.fv0.d(r11, r2, r3)
            goto L_0x0045
        L_0x0039:
            java.io.Serializable r2 = r11.getSerializable(r2)
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r2 = r0
        L_0x0045:
            r7 = r2
            xv0 r7 = (defpackage.xv0) r7
            java.lang.String r2 = "bot.shareContact.confirm.buttonPosition"
            java.lang.Class<dw0> r3 = defpackage.dw0.class
            if (r10 < r1) goto L_0x0053
            java.io.Serializable r10 = defpackage.fv0.d(r11, r2, r3)
            goto L_0x005f
        L_0x0053:
            java.io.Serializable r10 = r11.getSerializable(r2)
            boolean r11 = r3.isInstance(r10)
            if (r11 == 0) goto L_0x005e
            r0 = r10
        L_0x005e:
            r10 = r0
        L_0x005f:
            r6 = r10
            dw0 r6 = (defpackage.dw0) r6
            en9 r9 = r9.k0()
            r9.getClass()
            if (r4 == 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            if (r7 == 0) goto L_0x00a0
            if (r6 != 0) goto L_0x0072
            goto L_0x00a0
        L_0x0072:
            gaf r10 = r9.w
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.b()
            f14 r11 = defpackage.f14.b
            pl9 r0 = new pl9
            r8 = 0
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            jx3 r1 = r9.a
            aje r10 = defpackage.ev0.u(r1, r10, r11, r0)
            kotlin.reflect.KProperty[] r11 = defpackage.en9.A1
            r0 = 5
            r11 = r11[r0]
            wie r0 = r9.i1
            r0.setValue(r9, r11, r10)
            goto L_0x00a0
        L_0x0095:
            en9 r9 = r9.k0()
            java.util.List r11 = kotlin.collections.ArraysKt.toList((long[]) r0)
            r9.E(r10, r11)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.g(int, android.os.Bundle):void");
    }

    public final vsc g0() {
        return (vsc) this.x.getValue();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1556getScopeIdIluPPks() {
        return this.b;
    }

    public final EndlessRecyclerView2 h0() {
        return (EndlessRecyclerView2) this.y0.getValue(this, R0[2]);
    }

    public final rk9 i0() {
        return (rk9) this.o.getValue();
    }

    public final xhd j0() {
        return (xhd) this.z0.getValue(this, R0[3]);
    }

    public final en9 k0() {
        return (en9) this.w.getValue();
    }

    public final void l0() {
        if (((Boolean) i0().c.a.getValue()).booleanValue()) {
            rk9 i0 = i0();
            xag.h(i0.z, mk9.a);
        }
    }

    public final void m0(long j, View view) {
        pm7 pm7;
        long j2 = j;
        en9 k0 = k0();
        xme xme = k0.l1;
        MessageModel d = ((wj9) xme.getValue()).d(j2);
        if (k0.v().e()) {
            k0.v().f(j2);
            return;
        }
        if ((d != null ? d.x : null) == hcg.Error) {
            int size = ((wj9) xme.getValue()).c().size();
            pg3 pg3 = d89.a;
            List listOf = CollectionsKt.listOf(Long.valueOf(j));
            igf igf = new igf(ewa.h0);
            List createListBuilder = CollectionsKt.createListBuilder();
            int i = cwa.c;
            igf igf2 = new igf(ewa.g0);
            og3 og3 = og3.c;
            createListBuilder.add(new pg3(i, igf2, og3));
            if (size > 1) {
                createListBuilder.add(new pg3(cwa.b, new kgf(ewa.f0, ArraysKt.toList((T[]) new Object[]{Integer.valueOf(size)})), og3));
            }
            createListBuilder.add(new pg3(cwa.a, new igf(ewa.e0), og3.a));
            Unit unit = Unit.INSTANCE;
            xag.h(k0.q1, new h8e(listOf, igf, (igf) null, CollectionsKt.build(createListBuilder)));
            return;
        }
        KProperty[] kPropertyArr = R0;
        KProperty kProperty = kPropertyArr[1];
        long[] jArr = (long[]) this.c.a(this);
        wie wie = this.E0;
        if (jArr == null || ((pm7 = (pm7) wie.getValue(this, kPropertyArr[4])) != null && !pm7.isActive())) {
            View view2 = view;
            b0h.K(view2, rw6.LONG_PRESS);
            wie.setValue(this, kPropertyArr[4], ev0.v(getViewLifecycleScope(), (CoroutineContext) null, f14.b, new fo9(this, j, view2, (Continuation) null), 1));
        }
    }

    public final void onAttach(View view) {
        z68.c(ev0.y(this), "lifecycle: onAttach", new Object[0]);
        EndlessRecyclerView2 h0 = h0();
        or0 or0 = new or0();
        or0.v(h0);
        this.x0 = or0;
        ReactionsViewModel j = g0().j();
        j.getClass();
        z68.c("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving", new Object[0]);
        ev0.v(b0h.C(j), ((ce4) j.m.getValue()).a, (f14) null, new qsc(j, (Continuation) null), 2);
        KProperty kProperty = R0[6];
        htb htb = (htb) this.G0.getValue();
        List b2 = this.v0.b();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b2, 10));
        Iterator it = ((ArrayList) b2).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((MessageModel) it.next()).b));
        }
        htb.getClass();
        String str = htb.n;
        z68.c(str, "setIdsForInvalidate %s", String.valueOf(arrayList.size()));
        z68.c(str, "clear", new Object[0]);
        htb.k.clear();
        htb.f.g();
        jz9 jz9 = htb.e;
        jz9.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jz9.e(((Number) it2.next()).longValue());
        }
        htb.g = true;
        RecyclerView recyclerView = (RecyclerView) htb.l.getValue(htb, htb.m[0]);
        if (recyclerView != null) {
            recyclerView.post(new sx8(24, htb, recyclerView));
        }
        u50 u50 = this.v.b;
        u50.x = true;
        u50.e();
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        MessageModel N;
        super.onChangeStarted(ey3, fy3);
        if (!fy3.a && !fy3.b && getView() != null) {
            EndlessRecyclerView2 h0 = h0();
            LinearLayoutManager v2 = y7e.v(h0);
            if (v2 != null) {
                int X0 = v2.X0();
                View r = v2.r(X0);
                if (r == null || ((float) (h0.getMeasuredHeight() - r.getTop())) < ((float) r.getMeasuredHeight()) * 0.3f) {
                    X0 = v2.W0();
                }
                Integer valueOf = Integer.valueOf(X0);
                if (X0 == -1) {
                    valueOf = null;
                }
                if (valueOf != null && (N = this.v0.N(valueOf.intValue())) != null) {
                    k0().D(N);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hn9 hn9 = new hn9(this, 1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hn9.invoke(frameLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        yrc yrc = this.Q0;
        if (yrc != null) {
            yrc.f.clear();
            yrc.e.clear();
            yrc.b.b();
        }
        this.Q0 = null;
        this.P0 = null;
        xy6 xy6 = this.X;
        xy6.c = false;
        xy6.d = null;
        xy6.b.clear();
        g0().j().k();
        g6f g6f = this.Y;
        if (g6f == null) {
            g6f = null;
        }
        Lazy lazy = g6f.z0;
        if (lazy.isInitialized()) {
            ((lo0) g6f.X.getValue()).b(lazy.getValue());
        }
        eo9 eo9 = this.Z;
        if (eo9 == null) {
            eo9 = null;
        }
        eo9.i((RecyclerView) null);
        EndlessRecyclerView2 h0 = h0();
        KProperty kProperty = R0[5];
        h0.s0((gk9) this.F0.getValue());
        e0().I.b();
        ur5 ur5 = (ur5) this.w0.getValue();
        ur5.y = false;
        try {
            h0.r0(ur5);
        } catch (Throwable th) {
            z68.o(ur5.class.getName(), "fail to detach", th);
        }
        ur5.z = null;
        h0.setPager((u65) null);
        bwf bwf = this.A0;
        if (bwf != null) {
            h0.r0(bwf);
        }
        this.A0 = null;
        nwe nwe = this.C0;
        if (nwe != null) {
            ay2 ay2 = nwe.o;
            jwe jwe = (jwe) ay2.y;
            if (jwe != null) {
                ((tyc) ay2.c).D(jwe);
            }
            ay2.y = null;
            lwe lwe = nwe.X;
            if (lwe != null) {
                nwe.b.D(lwe);
            }
            nwe.X = null;
        }
        nwe nwe2 = this.C0;
        if (nwe2 != null) {
            h0.r0(nwe2);
        }
        this.C0 = null;
        this.B0 = null;
        h0.setAdapter((tyc) null);
        h0.setDelegate((w65) null);
    }

    public final void onDetach(View view) {
        or0 or0 = this.x0;
        if (or0 != null) {
            or0.B(h0());
        }
        this.K0.l.i(-1);
        u50 u50 = this.v.b;
        u50.x = false;
        if (u50.w) {
            u50.w = false;
            p9c p9c = u50.b;
            p9c.b();
            p9c.h.remove(u50.y);
        }
    }

    public final void onDismiss() {
        KProperty[] kPropertyArr = R0;
        pm7 pm7 = (pm7) this.E0.getValue(this, kPropertyArr[4]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        KProperty kProperty = kPropertyArr[1];
        this.c.b(this, (Object) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((lf1) this.y.getValue()).b(i, strArr, iArr);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long longOrNull;
        super.onUpdateArgs(bundle, bundle2);
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        if (obj2 == null || Intrinsics.areEqual(obj2, obj)) {
            Object obj3 = bundle.get("ARG_LOAD_MARK");
            Object obj4 = bundle2.get("ARG_LOAD_MARK");
            if (obj4 != null && !Intrinsics.areEqual(obj3, obj4) && (longOrNull = StringsKt.toLongOrNull(obj4.toString())) != null) {
                long longValue = longOrNull.longValue();
                bundle2.remove("ARG_LOAD_MARK");
                en9 k0 = k0();
                k0.H(ev0.u(k0.a, k0.A0, f14.b, new mm9(k0, longValue, (Continuation) null)));
                return;
            }
            return;
        }
        Long longOrNull2 = StringsKt.toLongOrNull(obj2.toString());
        if (longOrNull2 != null) {
            long longValue2 = longOrNull2.longValue();
            bundle2.remove("ARG_LOAD_MESSAGE_ID");
            en9 k02 = k0();
            k02.getClass();
            f14 f14 = f14.b;
            lm9 lm9 = new lm9(k02, longValue2, (Continuation) null);
            k02.H(ev0.u(k02.a, k02.A0, f14, lm9));
            View view = getView();
            if (view != null) {
                view.post(new z60(this, longValue2, 8));
            }
        }
    }

    public final void onViewCreated(View view) {
        EndlessRecyclerView2 h0 = h0();
        KProperty[] kPropertyArr = R0;
        KProperty kProperty = kPropertyArr[10];
        this.Q0 = new yrc(h0, (vqc) this.O0.getValue(), new c28(10, view));
        etc etc = k0().z1;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new do9((Continuation) null, this), 5), getViewLifecycleScope());
        xj9 xj9 = this.v0;
        if (xj9.j() > 0) {
            f0().b();
        }
        EndlessRecyclerView2 h02 = h0();
        KProperty kProperty2 = kPropertyArr[5];
        h02.k((gk9) this.F0.getValue());
        KProperty kProperty3 = kPropertyArr[6];
        sn0 sn0 = this.G0;
        htb htb = (htb) sn0.getValue();
        EndlessRecyclerView2 h03 = h0();
        htb.getClass();
        htb.l.setValue(htb, htb.m[0], h03);
        EndlessRecyclerView2 h04 = h0();
        KProperty kProperty4 = kPropertyArr[6];
        h04.m((htb) sn0.getValue());
        EndlessRecyclerView2 h05 = h0();
        u3b.a(h05, new wn9(h05, this, 0));
        h0().m(this.K0);
        e0().s1(new ao9(this));
        ps5 ps5 = new ps5(new ql8(k0().x1, 7), new bo9((Continuation) null, this), 5);
        vi9 vi9 = vi9.a;
        o5a.O(bs0.F(ps5, ((osa) vi9.getDispatchers()).c()), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(k0().s1, 28), getViewLifecycleOwner().getLifecycle(), iu7), new qn9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(k0().t1, new wq0(2, this, MessagesListWidget.class, "handleNavigationEvents", "handleNavigationEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 20), 5), getViewLifecycleScope());
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        bs0.K(new ps5(ct.k(k0().p1, getViewLifecycleOwner().getLifecycle(), iu7.v), new ln9((Continuation) null, atomicInteger, this, objectRef), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(i0().c, getViewLifecycleOwner().getLifecycle(), iu7), new rn9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(i0().v, new co9((Continuation) null, this), 5), getViewLifecycleScope());
        ps5 ps52 = new ps5(i0().y, new zn9((Continuation) null, this), 5);
        tu7 viewLifecycleScope = getViewLifecycleScope();
        pu7 pu7 = new pu7(ps52, (Continuation) null);
        viewLifecycleScope.getClass();
        ev0.v(viewLifecycleScope, (CoroutineContext) null, (f14) null, new ru7(viewLifecycleScope, pu7, (Continuation) null), 3);
        bs0.K(new ps5(ct.k(k0().q1, getViewLifecycleOwner().getLifecycle(), iu7), new sn9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new ql8(new on2(k0().r1, 28), 8), getViewLifecycleOwner().getLifecycle(), iu7), new tn9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().j().A, getViewLifecycleOwner().getLifecycle(), iu7), new un9((Continuation) null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 h06 = h0();
        cx9 v2 = k0().v();
        ix9 ix9 = new ix9(h06, xj9, v2, i0());
        bs0.K(new ps5(v2.g, new wq0(2, ix9, ix9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 23), 5), getViewLifecycleScope());
        e0().s1(new on9(this, 1));
        bs0.K(new ps5(ct.k(((rta) vi9.getAccessor().g(rta.class)).a, getViewLifecycleOwner().getLifecycle(), iu7), new vn9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        igf igf;
        Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("messages:context_menu:message_id")) : null;
        if (valueOf != null) {
            String string = bundle.getString("messages:context_menu:link_url");
            if (string != null) {
                int i2 = chc.messages_list_link_context_menu_action_copy_link;
                Lazy lazy = this.z;
                if (i == i2) {
                    b59.k(getContext(), StringsKt__StringsJVMKt.startsWith$default(string, "mailto:", false, 2, (Object) null) ? StringsKt__StringsKt.removePrefix(string, (CharSequence) "mailto:") : StringsKt__StringsJVMKt.startsWith$default(string, "tel:", false, 2, (Object) null) ? StringsKt__StringsKt.removePrefix(string, (CharSequence) "tel:") : string);
                    if (b59.C()) {
                        szf.a.getClass();
                        int ordinal = cd4.d(string).ordinal();
                        if (ordinal == 0) {
                            igf = new igf(qlc.messages_list_link_copied);
                        } else if (ordinal == 1) {
                            igf = new igf(qlc.messages_list_phone_copied);
                        } else if (ordinal == 2) {
                            igf = new igf(qlc.messages_list_mail_copied);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        e0b e0b = new e0b((Widget) this);
                        e0b.h(igf);
                        e0b.f(new o0b(cad.o));
                        e0b.j();
                    }
                    ne9 o2 = k0().o();
                    long longValue = valueOf.longValue();
                    if (o2 != null) {
                        g99 g99 = (g99) lazy.getValue();
                        szf.a.getClass();
                        e99 O = kr7.O(cd4.d(string));
                        g99.getClass();
                        g99.a(longValue, O, o2, f99.COPY);
                    }
                } else if (i == chc.messages_list_link_context_menu_action_open_link) {
                    k0().x(string);
                    ne9 o3 = k0().o();
                    long longValue2 = valueOf.longValue();
                    if (o3 != null) {
                        szf.a.getClass();
                        int ordinal2 = cd4.d(string).ordinal();
                        if (ordinal2 == 0) {
                            g99 g992 = (g99) lazy.getValue();
                            g992.getClass();
                            g992.a(longValue2, e99.LINK, o3, f99.OPEN_LINK);
                        } else if (ordinal2 == 1) {
                            g99 g993 = (g99) lazy.getValue();
                            g993.getClass();
                            g993.a(longValue2, e99.PHONE_NUMBER, o3, f99.CALL);
                        } else if (ordinal2 == 2) {
                            g99 g994 = (g99) lazy.getValue();
                            g994.getClass();
                            g994.a(longValue2, e99.EMAIL, o3, f99.OPEN_MAIL);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else if (i == chc.messages_list_link_context_menu_action_open_profile) {
                    k0().y(string);
                }
            }
        } else {
            KProperty[] kPropertyArr = R0;
            KProperty kProperty = kPropertyArr[1];
            is isVar = this.c;
            long[] jArr = (long[]) isVar.a(this);
            if (jArr != null) {
                KProperty kProperty2 = kPropertyArr[1];
                isVar.b(this, (Object) null);
                if (i == cwa.y) {
                    l0();
                    rk9 i0 = i0();
                    long first = ArraysKt.first(jArr);
                    i0.getClass();
                    xag.h(i0.z, new pk9(first));
                    return;
                }
                if (i == cwa.B || i == cwa.u) {
                    l0();
                }
                en9 k0 = k0();
                long first2 = ArraysKt.first(jArr);
                k0.getClass();
                k0.E(i, CollectionsKt.listOf(Long.valueOf(first2)));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? 0 : j3, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (DefaultConstructorMarker) null);
    }

    public MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("ARG_CHAT_ID", Long.valueOf(j)), TuplesKt.to("ARG_LOAD_MARK", Long.valueOf(j2)), TuplesKt.to("ARG_LOAD_MESSAGE_ID", Long.valueOf(j3)), TuplesKt.to("ARG_HIGHLIGHTS", list), TuplesKt.to("ARG_HIGHLIGHT_MESSAGE", Boolean.valueOf(z2)), TuplesKt.to("ARG_SKIP_UNREAD_DECOR", Boolean.valueOf(z3))));
    }
}
