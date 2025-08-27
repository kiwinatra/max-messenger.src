package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "gga", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallScreen.kt\none/me/calls/ui/ui/call/CallScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 9 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 10 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 11 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 12 View.kt\nandroidx/core/view/ViewKt\n+ 13 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,979:1\n235#2,10:980\n410#2,8:1007\n410#2,8:1015\n410#2,8:1023\n5#3:990\n5#3:991\n5#3:992\n5#3:993\n5#3:994\n5#3:995\n1#4:996\n17#5:997\n19#5:1001\n49#5:1002\n51#5:1006\n46#6:998\n51#6:1000\n46#6:1003\n51#6:1005\n105#7:999\n105#7:1004\n43#8:1031\n135#9,3:1032\n138#9,8:1049\n135#9,3:1057\n138#9,8:1074\n135#9,3:1082\n138#9,8:1099\n135#9,3:1107\n138#9,8:1124\n135#9,3:1132\n138#9,8:1149\n33#10,14:1035\n33#10,14:1060\n33#10,14:1085\n33#10,14:1110\n33#10,14:1135\n5#11:1157\n256#12,2:1158\n254#12:1160\n256#12,2:1161\n256#12,2:1163\n65#12,4:1165\n37#12:1169\n53#12:1170\n72#12:1171\n256#12,2:1172\n28#13:1174\n*S KotlinDebug\n*F\n+ 1 CallScreen.kt\none/me/calls/ui/ui/call/CallScreen\n*L\n127#1:980,10\n588#1:1007,8\n596#1:1015,8\n601#1:1023,8\n156#1:990\n188#1:991\n226#1:992\n273#1:993\n285#1:994\n298#1:995\n567#1:997\n567#1:1001\n568#1:1002\n568#1:1006\n567#1:998\n567#1:1000\n568#1:1003\n568#1:1005\n567#1:999\n568#1:1004\n610#1:1031\n697#1:1032,3\n697#1:1049,8\n700#1:1057,3\n700#1:1074,8\n703#1:1082,3\n703#1:1099,8\n706#1:1107,3\n706#1:1124,8\n709#1:1132,3\n709#1:1149,8\n697#1:1035,14\n700#1:1060,14\n703#1:1085,14\n706#1:1110,14\n709#1:1135,14\n715#1:1157\n799#1:1158,2\n801#1:1160\n184#1:1161,2\n335#1:1163,2\n336#1:1165,4\n336#1:1169\n336#1:1170\n336#1:1171\n355#1:1172,2\n356#1:1174\n*E\n"})
public final class CallScreen extends Widget implements cx3 {
    public static final gga J0 = new gga(8);
    public static final /* synthetic */ KProperty[] K0;
    public final Lazy A0;
    public final Lazy B0;
    public final sn0 C0;
    public final sn0 D0;
    public final sn0 E0;
    public final sn0 F0;
    public final sn0 G0;
    public pc1 H0;
    public final w28 I0;
    public final ReadOnlyProperty X = childSlotRouter(qqa.d);
    public final mmb Y = new mmb();
    public final Lazy Z;
    public final Lazy a = oh1.a.getAccessor().h(tq1.class);
    public final Lazy b = LazyKt.lazy(new v11(19));
    public final Lazy c = LazyKt.lazy(new yg1(this, 0));
    public final Lazy o = LazyKt.lazy(new v11(20));
    public final Lazy v = LazyKt.lazy(new v11(21));
    public final sn0 v0;
    public final Lazy w = createViewModelLazy(jj1.class, new s(15, new yg1(this, 1)));
    public final sn0 w0;
    public final String x = "CALL_SCREEN_SCOPE_ID";
    public final Lazy x0;
    public boolean y;
    public final Lazy y0;
    public final ReadOnlyProperty z = childSlotRouter(qqa.P0);
    public final Lazy z0;

    static {
        Class<CallScreen> cls = CallScreen.class;
        K0 = new KProperty[]{wj6.p(cls, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "stubCallBottomUnavailablePanel", "getStubCallBottomUnavailablePanel()Landroid/view/ViewStub;", 0), wj6.p(cls, "callBottomUnavailablePanel", "getCallBottomUnavailablePanel()Lone/me/calls/ui/view/controls/CallBottomUnavailableView;", 0), wj6.p(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wj6.p(cls, "stubCallSpeakerLabel", "getStubCallSpeakerLabel()Landroid/view/ViewStub;", 0), wj6.p(cls, "callSpeakerLabel", "getCallSpeakerLabel()Lone/me/calls/ui/view/CallSpeakerLabel;", 0), wj6.p(cls, "stubCallChangeModeHint", "getStubCallChangeModeHint()Landroid/view/ViewStub;", 0), wj6.p(cls, "callChangeModeHint", "getCallChangeModeHint()Lone/me/calls/ui/view/CallChangeModeHintView;", 0)};
    }

    public CallScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        yg1 yg1 = new yg1(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Z = LazyKt.lazy(lazyThreadSafetyMode, yg1);
        this.v0 = binding(new yg1(this, 3));
        this.w0 = binding(new yg1(this, 4));
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new yg1(this, 5));
        this.y0 = LazyKt.lazy(lazyThreadSafetyMode, new yg1(this, 6));
        this.z0 = LazyKt.lazy(lazyThreadSafetyMode, new yg1(this, 7));
        this.A0 = LazyKt.lazy(lazyThreadSafetyMode, new yg1(this, 9));
        this.B0 = LazyKt.lazy(lazyThreadSafetyMode, new yg1(this, 10));
        this.C0 = binding(new yg1(this, 11));
        this.D0 = binding(new yg1(this, 12));
        this.E0 = binding(new yg1(this, 13));
        this.F0 = binding(new yg1(this, 14));
        this.G0 = binding(new yg1(this, 15));
        this.I0 = new w28(new v11(22), (Function0) null, 6);
    }

    public static final boolean c0(CallScreen callScreen, int i, String str) {
        pc1 pc1 = callScreen.H0;
        if (pc1 == null || !pc1.g || callScreen.q0().getCurrentItem() == i || callScreen.q0().getChildCount() == 0) {
            int currentItem = callScreen.q0().getCurrentItem();
            boolean z2 = callScreen.q0().D0;
            z68.c("CallModeScrollTag", "skip changeViewPagerPosition from=" + str + " currentPos=" + currentItem + " newPos=" + i + " isUserInputEnabled=" + z2, new Object[0]);
            return false;
        }
        callScreen.q0().setUserInputEnabled(false);
        callScreen.q0().e(i, false);
        z68.c("CallModeScrollTag", "changeViewPagerPosition from=" + str + " newPos=" + i, new Object[0]);
        return true;
    }

    public static final rk1 d0(CallScreen callScreen) {
        View childAt = callScreen.q0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        pzc M = recyclerView.M(callScreen.q0().getCurrentItem());
        KeyEvent.Callback callback = M != null ? M.a : null;
        if (callback instanceof rk1) {
            return (rk1) callback;
        }
        return null;
    }

    public static void f0(CallScreen callScreen) {
        callScreen.e0(!callScreen.l0().g);
    }

    public final void e0(boolean z2) {
        l0().a(z2);
    }

    public final void g0(boolean z2) {
        if (z2) {
            ((mp1) p0().c.a).u((nw6) null);
        }
        View requireView = requireView();
        if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
            requireView().post(new b(24, (Object) this));
        } else {
            getRouter().B(this);
        }
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1546getScopeIdIluPPks() {
        return this.x;
    }

    public final pgd getScreenDelegate() {
        return this.I0;
    }

    public final p11 h0() {
        KProperty kProperty = K0[3];
        return (p11) this.w0.getValue();
    }

    public final jk1 i0() {
        KProperty kProperty = K0[6];
        return (jk1) this.E0.getValue();
    }

    public final xl1 j0() {
        zx3 a2 = ((mz2) this.z.getValue(this, K0[0])).a();
        if (a2 instanceof xl1) {
            return (xl1) a2;
        }
        return null;
    }

    public final tq1 k0() {
        return (tq1) this.a.getValue();
    }

    public final zy3 l0() {
        return (zy3) this.Z.getValue();
    }

    public final ViewStub m0() {
        KProperty kProperty = K0[2];
        return (ViewStub) this.v0.getValue();
    }

    public final ViewStub n0() {
        KProperty kProperty = K0[7];
        return (ViewStub) this.F0.getValue();
    }

    public final ViewStub o0() {
        KProperty kProperty = K0[5];
        return (ViewStub) this.D0.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        p0().c.j.b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            p0().q(true, intent);
            hn requireActivity = requireActivity();
            ((nj1) this.b.getValue()).getClass();
            Intent intent2 = new Intent(requireActivity, CallServiceImpl.class);
            mj1 mj1 = mj1.a;
            nj1.b(requireActivity, intent2.putExtra("ACTION", 5));
        }
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        p0().c.j.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: e31} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: g31} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: g31} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: g31} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: g31} */
    /* JADX WARNING: type inference failed for: r6v16, types: [f31] */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18, types: [h31] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            jj1 r0 = r17.p0()
            k91 r0 = r0.l()
            me5 r0 = r0.e
            boolean r0 = r0 instanceof defpackage.ie5
            e31 r1 = defpackage.e31.a
            if (r0 != 0) goto L_0x0012
            goto L_0x0289
        L_0x0012:
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.getString(r2)
            kotlin.enums.EnumEntries r3 = defpackage.ah1.b
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.next()
            r5 = r4
            ah1 r5 = (defpackage.ah1) r5
            java.lang.String r5 = r5.name()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0022
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            ah1 r4 = (defpackage.ah1) r4
            if (r4 == 0) goto L_0x02a7
            int r0 = r4.ordinal()
            r3 = 1
            java.lang.String r4 = "microphone_enabled"
            java.lang.String r5 = "video_enabled"
            if (r0 == 0) goto L_0x009d
            r6 = -1
            if (r0 == r3) goto L_0x007d
            r8 = 2
            if (r0 == r8) goto L_0x005c
            r4 = 3
            if (r0 != r4) goto L_0x0056
            goto L_0x00d3
        L_0x0056:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x005c:
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r1 = "opponent_id"
            long r0 = r0.getLong(r1, r6)
            h31 r6 = new h31
            android.os.Bundle r7 = r17.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r17.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
        L_0x007b:
            r1 = r6
            goto L_0x00d3
        L_0x007d:
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r1 = "chat_id"
            long r0 = r0.getLong(r1, r6)
            f31 r6 = new f31
            android.os.Bundle r7 = r17.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r17.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
            goto L_0x007b
        L_0x009d:
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r1 = "link"
            java.lang.String r7 = r0.getString(r1)
            if (r7 == 0) goto L_0x029b
            g31 r1 = new g31
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r6 = "is_new"
            boolean r8 = r0.getBoolean(r6)
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r6 = "front_camera_enabled"
            boolean r9 = r0.getBoolean(r6)
            android.os.Bundle r0 = r17.getArgs()
            boolean r10 = r0.getBoolean(r5)
            android.os.Bundle r0 = r17.getArgs()
            boolean r11 = r0.getBoolean(r4)
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00d3:
            android.os.Bundle r0 = r17.getArgs()
            java.lang.String r4 = "ACTIVE"
            r0.putString(r2, r4)
            jj1 r0 = r17.p0()
            r0.getClass()
            boolean r2 = r1.c()
            qcb r4 = r0.b
            edb r5 = r4.a()
            java.lang.String[] r6 = defpackage.edb.h
            boolean r5 = r5.b(r6)
            if (r5 != 0) goto L_0x00f8
            aj8 r2 = defpackage.aj8.v
            goto L_0x00ff
        L_0x00f8:
            if (r2 == 0) goto L_0x00fd
            aj8 r2 = defpackage.aj8.c
            goto L_0x00ff
        L_0x00fd:
            aj8 r2 = defpackage.aj8.b
        L_0x00ff:
            boolean r5 = r1.b()
            edb r4 = r4.a()
            java.lang.String[] r6 = defpackage.edb.l
            boolean r4 = r4.b(r6)
            if (r4 != 0) goto L_0x0112
            aj8 r4 = defpackage.aj8.v
            goto L_0x0119
        L_0x0112:
            if (r5 == 0) goto L_0x0117
            aj8 r4 = defpackage.aj8.c
            goto L_0x0119
        L_0x0117:
            aj8 r4 = defpackage.aj8.b
        L_0x0119:
            boolean r5 = r1 instanceof defpackage.h31
            xme r14 = r0.x0
            ap1 r15 = r0.c
            if (r5 == 0) goto L_0x0182
            fl1 r3 = new fl1
            h31 r1 = (defpackage.h31) r1
            nfd r5 = defpackage.aj8.a
            r5.getClass()
            boolean r5 = defpackage.nfd.r(r4)
            long r6 = r1.a
            r3.<init>(r6, r5)
            vag r1 = defpackage.vag.b
            r15.a(r1)
        L_0x0138:
            java.lang.Object r1 = r14.getValue()
            r5 = r1
            k91 r5 = (defpackage.k91) r5
            nfd r6 = defpackage.aj8.a
            r6.getClass()
            boolean r12 = defpackage.nfd.r(r4)
            r9 = 0
            r13 = 655295(0x9ffbf, float:9.18264E-40)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r4
            r11 = r2
            k91 r5 = defpackage.k91.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r14.b(r1, r5)
            if (r1 == 0) goto L_0x0138
            boolean r1 = defpackage.nfd.r(r4)
            boolean r5 = defpackage.nfd.r(r2)
            qi1 r6 = new qi1
            r7 = 0
            r6.<init>(r0, r2, r4, r7)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            wje r0 = new wje
            tje r2 = new tje
            r2.<init>(r3)
            r0.<init>(r2, r1, r5, r6)
            dp1 r1 = r15.a
            mp1 r1 = (defpackage.mp1) r1
            r1.y(r0)
            goto L_0x0289
        L_0x0182:
            boolean r5 = r1 instanceof defpackage.f31
            if (r5 == 0) goto L_0x01e4
            dl1 r3 = new dl1
            f31 r1 = (defpackage.f31) r1
            nfd r5 = defpackage.aj8.a
            r5.getClass()
            boolean r5 = defpackage.nfd.r(r4)
            long r6 = r1.a
            r3.<init>(r6, r5)
            vag r1 = defpackage.vag.o
            r15.a(r1)
        L_0x019d:
            java.lang.Object r1 = r14.getValue()
            r5 = r1
            k91 r5 = (defpackage.k91) r5
            r9 = 1
            r13 = 1703871(0x19ffbf, float:2.387632E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 0
            r10 = r4
            r11 = r2
            k91 r5 = defpackage.k91.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r14.b(r1, r5)
            if (r1 == 0) goto L_0x019d
            nfd r1 = defpackage.aj8.a
            r1.getClass()
            boolean r1 = defpackage.nfd.r(r4)
            boolean r5 = defpackage.nfd.r(r2)
            qi1 r6 = new qi1
            r7 = 1
            r6.<init>(r0, r2, r4, r7)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            wje r0 = new wje
            rje r2 = new rje
            r2.<init>(r3)
            r0.<init>(r2, r1, r5, r6)
            dp1 r1 = r15.a
            mp1 r1 = (defpackage.mp1) r1
            r1.y(r0)
            goto L_0x0289
        L_0x01e4:
            boolean r5 = r1 instanceof defpackage.g31
            if (r5 == 0) goto L_0x0251
            g31 r1 = (defpackage.g31) r1
            vag r5 = defpackage.vag.o
            r15.a(r5)
        L_0x01ef:
            java.lang.Object r13 = r14.getValue()
            r5 = r13
            k91 r5 = (defpackage.k91) r5
            r9 = 1
            r16 = 1703871(0x19ffbf, float:2.387632E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 0
            r10 = r4
            r11 = r2
            r3 = r13
            r13 = r16
            k91 r5 = defpackage.k91.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = r14.b(r3, r5)
            if (r3 == 0) goto L_0x024f
            nfd r3 = defpackage.aj8.a
            r3.getClass()
            boolean r3 = defpackage.nfd.r(r4)
            boolean r5 = defpackage.nfd.r(r2)
            ri1 r6 = new ri1
            boolean r7 = r1.c
            r6.<init>(r0, r2, r4, r7)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r1.b
            r7 = 1
            r0 = r0 ^ r7
            wje r2 = new wje
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x0247
            int r4 = r1.length()
            if (r4 == 0) goto L_0x0247
            sje r4 = new sje
            r4.<init>(r1, r0)
            r2.<init>(r4, r3, r5, r6)
            dp1 r0 = r15.a
            mp1 r0 = (defpackage.mp1) r0
            r0.y(r2)
            goto L_0x0289
        L_0x0247:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown target to call"
            r0.<init>(r1)
            throw r0
        L_0x024f:
            r3 = 1
            goto L_0x01ef
        L_0x0251:
            boolean r0 = r1 instanceof defpackage.e31
            if (r0 == 0) goto L_0x0295
            s44 r0 = r15.b()
            ld9 r0 = r0.a
            if (r0 != 0) goto L_0x0289
            s44 r0 = r15.b()
            oub r0 = r0.i
            if (r0 != 0) goto L_0x0267
            oub r0 = defpackage.oub.e
        L_0x0267:
            java.lang.Object r1 = r14.getValue()
            r2 = r1
            k91 r2 = (defpackage.k91) r2
            me5 r4 = r0.c
            y11 r3 = r0.d
            l21 r5 = defpackage.hd8.a0(r3)
            r8 = 0
            r10 = 2097099(0x1fffcb, float:2.938662E-39)
            ld9 r3 = r0.b
            r6 = 0
            r7 = 0
            r9 = 0
            k91 r2 = defpackage.k91.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r14.b(r1, r2)
            if (r1 == 0) goto L_0x0267
        L_0x0289:
            android.content.Context r0 = r17.getContext()
            eh1 r1 = new eh1
            r2 = r17
            r1.<init>(r2, r0)
            return r1
        L_0x0295:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x029b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown open type="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        kne.B(requireActivity(), false);
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            zy3 l0 = l0();
            l0.a.clear();
            View view2 = l0.c;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) l0.e.getValue());
            }
            View view3 = l0.d;
            if (view3 != null) {
                view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) l0.f.getValue());
            }
            l0.c = null;
            l0.d = null;
            ((mk1) ((lk1) this.v.getValue())).a.clear();
            jj1 p0 = p0();
            ap1 ap1 = p0.c;
            ((sz9) ap1.p.getValue()).d(Boolean.FALSE);
            p9c p9c = ap1.j;
            p9c.b();
            o01 o01 = (o01) ap1.b;
            CallsAudioManager callsAudioManager = (CallsAudioManager) o01.c.get();
            if (callsAudioManager != null) {
                callsAudioManager.setOnAudioDeviceChangeListener((CallsAudioManager.OnAudioDeviceInfoChangeListener) null);
            }
            AudioLevelListener audioLevelListener = (AudioLevelListener) ap1.s.getValue();
            try {
                MicrophoneManager c2 = o01.c();
                if (c2 != null) {
                    c2.removeAudioSampleCallback(audioLevelListener);
                }
            } catch (Exception e) {
                String message = e.getMessage();
                z68.o("CallAudioController", "CallAudioController can't unregister mic audio listener due to: " + message + ".", e);
            }
            p9c.h.remove((yo1) ap1.t.getValue());
            p9c.g = null;
            ((p6g) p0.J0.getValue()).b();
            ((ll1) p0.N0.getValue()).a.clear();
        }
        mmb mmb = this.Y;
        mmb.b.clear();
        mmb.a.clear();
        l0().a(true);
        pc1 pc1 = this.H0;
        if (pc1 != null) {
            q0().g(pc1);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        kne.B(requireActivity(), true);
        ap1 ap1 = p0().c;
        ap1.j();
        ap1.i();
        p9c p9c = ap1.j;
        p9c.a();
        p9c.h.add((yo1) ap1.t.getValue());
        p9c.g = new u6h(7, ap1);
        KProperty[] kPropertyArr = K0;
        mz2 mz2 = (mz2) this.X.getValue(this, kPropertyArr[1]);
        boolean areEqual = Intrinsics.areEqual((Object) mz2.b(), (Object) "call_bottom_panel_widget_tag");
        String str = this.x;
        if (!areEqual) {
            i9d i9d = new i9d(new CallBottomPanelWidget(str, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("call_bottom_panel_widget_tag");
            mz2.a.R(i9d);
        }
        mz2 mz22 = (mz2) this.z.getValue(this, kPropertyArr[0]);
        if (!Intrinsics.areEqual((Object) mz22.b(), (Object) "call_top_panel_widget_tag")) {
            i9d i9d2 = new i9d(new CallTopPanelWidget(str, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d2.d("call_top_panel_widget_tag");
            mz22.a.R(i9d2);
        }
        Unit unit = Unit.INSTANCE;
        xl1 j0 = j0();
        if (j0 != null) {
            ll1 ll1 = (ll1) p0().N0.getValue();
            ll1.a.add(j0);
            ((CallTopPanelWidget) j0).r(ll1.b);
        }
        fma h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new wx3(3, (Object) this));
        }
        ViewPager2 q0 = q0();
        ViewStub n0 = n0();
        KProperty kProperty = kPropertyArr[8];
        pc1 pc1 = new pc1(q0, n0, (t11) this.G0.getValue(), (xc1) this.B0.getValue(), new zg1(this, 0), new yg1(this, 8));
        q0().b(pc1);
        this.H0 = pc1;
        i0().setListener(new vs6(7, (Object) this));
        h0().setClickListener(new rt6(8, (Object) this));
        bs0.K(new i21(p0().L0, new pc(new pc(p0().F0, 13), 14), new lh1((Continuation) null, this), 4), getViewLifecycleScope());
        xme xme = p0().F0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new fh1((Continuation) null, this), 5), getViewLifecycleScope());
        if (!p0().n()) {
            bs0.K(new ps5(ct.k(p0().I0, getViewLifecycleOwner().getLifecycle(), iu7), new gh1((Continuation) null, this), 5), getViewLifecycleScope());
        }
        bs0.K(new ps5(ct.k(p0().K0, getViewLifecycleOwner().getLifecycle(), iu7), new hh1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final jj1 p0() {
        return (jj1) this.w.getValue();
    }

    public final ViewPager2 q0() {
        KProperty kProperty = K0[4];
        return (ViewPager2) this.C0.getValue();
    }

    public final void s(int i, Bundle bundle) {
        ze1 ze1;
        ze1 ze12;
        ze1 ze13;
        if (i == qqa.p) {
            jj1 p0 = p0();
            p0.getClass();
            if (bundle != null && (ze13 = (ze1) bundle.getParcelable("call_participant_id")) != null) {
                p0.o(ze13);
            }
        } else if (i == qqa.q) {
            jj1 p02 = p0();
            p02.getClass();
            if (bundle != null && (ze12 = (ze1) bundle.getParcelable("call_participant_id")) != null) {
                p02.o(ze12);
            }
        } else if (i == qqa.r) {
            jj1 p03 = p0();
            p03.getClass();
            if (bundle != null && (ze1 = (ze1) bundle.getParcelable("call_participant_id")) != null) {
                aje u = ev0.u(p03.a, ((osa) ((gaf) p03.o.getValue())).b(), f14.b, new aj1(p03, ze1.a, (Continuation) null));
                p03.v0.setValue(p03, jj1.O0[0], u);
            }
        } else if (i == qqa.o) {
            p0().c.g();
        }
    }
}
