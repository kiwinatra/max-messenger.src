package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

@SourceDebugExtension({"SMAP\nPickerChatController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerChatController.kt\none/me/chats/picker/PickerChatController\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 8 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 9 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 10 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 11 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,554:1\n420#2:555\n419#2:556\n419#2:557\n235#2,10:558\n235#2,10:568\n32#3:578\n17#3:579\n19#3:583\n17#3:612\n19#3:616\n46#4:580\n51#4:582\n46#4:613\n51#4:615\n105#5:581\n105#5:614\n1#6:584\n135#7,3:585\n138#7,8:602\n33#8,14:588\n24#9:610\n32#9:611\n24#9:617\n24#9:618\n24#9:621\n184#10,2:619\n184#10,2:622\n49#11:624\n65#11,16:625\n93#11,3:641\n*S KotlinDebug\n*F\n+ 1 PickerChatController.kt\none/me/chats/picker/PickerChatController\n*L\n87#1:555\n88#1:556\n95#1:557\n97#1:558,10\n189#1:568,10\n208#1:578\n208#1:579\n208#1:583\n420#1:612\n420#1:616\n208#1:580\n208#1:582\n420#1:613\n420#1:615\n208#1:581\n420#1:614\n237#1:585,3\n237#1:602,8\n237#1:588,14\n266#1:610\n281#1:611\n443#1:617\n495#1:618\n520#1:621\n495#1:619,2\n520#1:622,2\n152#1:624\n152#1:625,16\n152#1:641,3\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/picker/PickerChatController;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ltkb;", "purpose", "(Ltkb;Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@Deprecated(message = "Create own picker screen with AbstractPickerScreen")
public final class PickerChatController extends Widget implements qg3 {
    public static final yh7 A0;
    public static final /* synthetic */ KProperty[] z0;
    public final sn0 X;
    public final u90 Y;
    public final Lazy Z;
    public final String a;
    public final is b;
    public final is c;
    public final yh7 o;
    public final is v;
    public oz1 v0;
    public final Lazy w;
    public e9d w0;
    public final sn0 x;
    public final fb6 x0;
    public final sn0 y;
    public xr8 y0;
    public final ReadOnlyProperty z;

    static {
        Class<PickerChatController> cls = PickerChatController.class;
        z0 = new KProperty[]{wj6.p(cls, "purpose", "getPurpose()Lone/me/chats/picker/PickerPurpose;", 0), wj6.p(cls, "preselectedChats", "getPreselectedChats()[J", 0), rae.s(cls, "message", "getMessage()Ljava/lang/String;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), wj6.p(cls, "mainContainer", "getMainContainer()Landroid/view/View;", 0)};
        jdb jdb = jdb.c;
        jdb jdb2 = anf.a;
        A0 = new yh7(jdb, new nr0(jdb, mr0.c, false));
    }

    public PickerChatController(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        yh7 yh7;
        this.a = "PickerChatsController";
        this.b = new is(tkb.class, "picker_chat_controller_purpose");
        this.c = new is(long[].class, new long[0], "picker_chat_controller_preselected_chats");
        if (d0()) {
            yh7 = yh7.c;
        } else {
            yh7 = yh7.d;
        }
        this.o = yh7;
        this.v = new is(String.class, (Object) null, "picker_chat_controller_message");
        this.w = createViewModelLazy(whb.class, new zfa(3, new vra(5, this, bundle)));
        this.x = binding(new sgb(this, 1));
        this.y = binding(new sgb(this, 2));
        this.z = viewBinding(hra.f0);
        this.X = binding(new sgb(this, 3));
        u90 u90 = new u90();
        u90.b(hra.i0);
        u90.b(hra.d0);
        u90.b(hra.e0);
        u90.V(0);
        u90.I(100);
        this.Y = u90;
        this.Z = createViewModelLazy(sr8.class, new zfa(4, new lgb(1)));
        this.x0 = new fb6(this, 2);
        bs0.K(new ps5(new ql8(ct.k(f0().B0, this.lifecycleOwner.getLifecycle(), iu7.o), 22), new ugb(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final OneMeContactsChipGroup c0() {
        KProperty kProperty = z0[4];
        return (OneMeContactsChipGroup) this.y.getValue();
    }

    public final boolean d0() {
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[0];
        is isVar = this.b;
        if (((tkb) isVar.a(this)) != tkb.EXTERNAL_SHARE) {
            KProperty kProperty2 = kPropertyArr[0];
            return ((tkb) isVar.a(this)) == tkb.FORWARD;
        }
    }

    public final View e0() {
        return (View) this.z.getValue(this, z0[5]);
    }

    public final whb f0() {
        return (whb) this.w.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == hra.c0) {
            getRouter().B(this);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.o;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1549getScopeIdIluPPks() {
        return this.a;
    }

    public final boolean handleBack() {
        e9d e9d = this.w0;
        if (e9d == null || !e9d.n()) {
            if (!((Collection) f0().v0.a.getValue()).isEmpty()) {
                Object value = f0().v0.a.getValue();
                KProperty kProperty = z0[1];
                if (!Intrinsics.areEqual(value, (Object) ArraysKt.toSet((long[]) this.c.a(this)))) {
                    KProperty[] kPropertyArr = BottomSheetWidget.v0;
                    e9d e9d2 = null;
                    ng3 a2 = b0h.a(new igf(jra.T), (Bundle) null, 6);
                    a2.b(hra.c0, new igf(jra.S));
                    a2.c(hra.b0, new igf(jra.R));
                    ConfirmationBottomSheet e = a2.e();
                    e.setTargetController(this);
                    zx3 zx3 = this;
                    while (zx3.getParentController() != null) {
                        zx3 = zx3.getParentController();
                    }
                    l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                    if (l9d != null) {
                        e9d2 = l9d.K();
                    }
                    e.p0(this);
                    if (e9d2 == null) {
                        return true;
                    }
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d2.G(i9d);
                    return true;
                }
            }
            return super.handleBack();
        }
        f0().A0.C(og9.a);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [oz1, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 0
            r2 = 5
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r22.getContext()
            r3.<init>(r4)
            r4 = 1
            r3.setOrientation(r4)
            int r5 = defpackage.hra.f0
            r3.setId(r5)
            kotlin.reflect.KProperty[] r5 = z0
            r6 = 3
            r7 = r5[r6]
            sn0 r7 = r0.x
            java.lang.Object r7 = r7.getValue()
            h3b r7 = (defpackage.h3b) r7
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r10 = -2
            r8.<init>(r9, r10)
            r3.addView(r7, r8)
            one.me.sdk.uikit.common.views.MaxHeightScrollView r7 = new one.me.sdk.uikit.common.views.MaxHeightScrollView
            android.content.Context r8 = r3.getContext()
            r11 = 0
            r7.<init>(r8, r11)
            r8 = 100
            float r8 = (float) r8
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            r7.setMaxHeight(r8)
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r8 = r21.c0()
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r9, r10)
            r7.addView(r8, r12)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r9, r10)
            r3.addView(r7, r8)
            android.view.View r7 = new android.view.View
            android.content.Context r8 = r3.getContext()
            r7.<init>(r8)
            js9 r8 = defpackage.fu4.k
            android.content.Context r12 = r7.getContext()
            fu4 r12 = r8.e(r12)
            k2b r12 = r12.f()
            fye r12 = r12.h()
            int r12 = r12.j
            r7.setBackgroundColor(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            double r13 = (double) r13
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 * r15
            int r13 = kotlin.math.MathKt.roundToInt((double) r13)
            r12.<init>(r9, r13)
            r3.addView(r7, r12)
            oz1 r7 = new oz1
            android.content.Context r12 = r3.getContext()
            r7.<init>(r12)
            int r12 = defpackage.hra.d0
            r7.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r9, r1)
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.weight = r13
            r13 = 112(0x70, float:1.57E-43)
            r12.gravity = r13
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            r3.addView(r7, r12)
            e9d r7 = r0.getChildRouter(r7)
            r5 = r5[r1]
            is r5 = r0.b
            java.lang.Object r5 = r5.a(r0)
            tkb r5 = (defpackage.tkb) r5
            int r5 = r5.ordinal()
            java.lang.String r12 = r0.a
            if (r5 == 0) goto L_0x01db
            r13 = 12
            if (r5 == r4) goto L_0x0162
            r14 = 2
            if (r5 == r14) goto L_0x01db
            if (r5 != r6) goto L_0x015c
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x0103
            one.me.chats.picker.members.PickerMembersListWidget r5 = new one.me.chats.picker.members.PickerMembersListWidget
            r16 = 0
            r18 = 0
            java.lang.String r15 = r0.a
            r19 = 6
            r20 = 0
            r14 = r5
            r14.<init>(r15, r16, r18, r19, r20)
            i9d r6 = new i9d
            r17 = 0
            r20 = -1
            r16 = 0
            r18 = 0
            r19 = 0
            r14 = r6
            r15 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.R(r6)
        L_0x0103:
            one.me.sdk.uikit.common.button.OneMeButton r5 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6, r11)
            aqa r6 = defpackage.aqa.c
            r5.setSize(r6)
            xpa r6 = defpackage.xpa.o
            r5.setAppearance(r6)
            zpa r6 = defpackage.zpa.a
            r5.setMode(r6)
            int r6 = defpackage.jra.Q
            r5.setText((int) r6)
            tgb r6 = new tgb
            r6.<init>(r0, r4)
            defpackage.ct.G(r5, 300, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r9, r10)
            float r7 = (float) r13
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r6.setMargins(r7, r7, r7, r7)
            r3.addView(r5, r6)
            whb r6 = r21.f0()
            etc r6 = r6.v0
            ygb r7 = new ygb
            r7.<init>(r5, r11)
            ps5 r5 = new ps5
            r5.<init>(r6, r7, r2)
            tu7 r2 = r21.getViewLifecycleScope()
            defpackage.bs0.K(r5, r2)
            goto L_0x0279
        L_0x015c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0162:
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x0182
            one.me.chats.picker.PickerChatsListWidget r15 = new one.me.chats.picker.PickerChatsListWidget
            java.lang.String r5 = "all.chat.folder"
            r15.<init>(r5, r12, r11)
            i9d r5 = new i9d
            r17 = 0
            r20 = -1
            r16 = 0
            r18 = 0
            r19 = 0
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.R(r5)
        L_0x0182:
            one.me.sdk.uikit.common.button.OneMeButton r5 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6, r11)
            aqa r6 = defpackage.aqa.c
            r5.setSize(r6)
            xpa r6 = defpackage.xpa.o
            r5.setAppearance(r6)
            zpa r6 = defpackage.zpa.a
            r5.setMode(r6)
            int r6 = defpackage.jra.Q
            r5.setText((int) r6)
            tgb r6 = new tgb
            r6.<init>(r0, r1)
            defpackage.ct.G(r5, 300, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r9, r10)
            float r7 = (float) r13
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r6.setMargins(r7, r7, r7, r7)
            r3.addView(r5, r6)
            whb r6 = r21.f0()
            etc r6 = r6.v0
            vgb r7 = new vgb
            r7.<init>(r5, r11)
            ps5 r5 = new ps5
            r5.<init>(r6, r7, r2)
            tu7 r2 = r21.getViewLifecycleScope()
            defpackage.bs0.K(r5, r2)
            goto L_0x0279
        L_0x01db:
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x01f8
            one.me.chats.picker.PickerChatsTabWidget r14 = new one.me.chats.picker.PickerChatsTabWidget
            r14.<init>(r12, r11)
            i9d r5 = new i9d
            r16 = 0
            r19 = -1
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.R(r5)
        L_0x01f8:
            occ r5 = new occ
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6)
            int r6 = defpackage.hra.i0
            r5.setId(r6)
            android.content.Context r6 = r5.getContext()
            fu4 r6 = r8.e(r6)
            k2b r6 = r6.f()
            hq2 r6 = r6.a()
            zqg r6 = r6.f()
            yqg r6 = r6.a
            int r6 = r6.a
            r5.setBackgroundColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = 52
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r6.<init>(r9, r7)
            r3.addView(r5, r6)
            sn0 r6 = r0.X
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r9, r10)
            r3.addView(r6, r7)
            whb r6 = r21.f0()
            etc r6 = r6.x0
            wgb r7 = new wgb
            r7.<init>(r5, r11)
            ps5 r5 = new ps5
            r5.<init>(r6, r7, r2)
            tu7 r6 = r21.getViewLifecycleScope()
            defpackage.bs0.K(r5, r6)
            whb r5 = r21.f0()
            etc r5 = r5.v0
            xgb r6 = new xgb
            r6.<init>(r0, r3, r11)
            ps5 r7 = new ps5
            r7.<init>(r5, r6, r2)
            tu7 r2 = r21.getViewLifecycleScope()
            defpackage.bs0.K(r7, r2)
        L_0x0279:
            boolean r2 = r21.d0()
            if (r2 == 0) goto L_0x02d5
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r5 = r21.getContext()
            r2.<init>(r5)
            r2.addView(r3)
            yh7 r5 = A0
            defpackage.h88.f(r3, r5, r11)
            oz1 r3 = new oz1
            android.content.Context r5 = r2.getContext()
            r3.<init>(r5)
            int r5 = defpackage.hra.g0
            r3.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r9, r10)
            r6 = 80
            r5.gravity = r6
            r3.setLayoutParams(r5)
            int r5 = defpackage.pq7.a
            android.content.Context r5 = r3.getContext()
            int r5 = defpackage.pq7.a(r5)
            float r5 = (float) r5
            r3.setTranslationY(r5)
            yh7 r5 = new yh7
            nr0 r6 = new nr0
            jdb r7 = defpackage.jdb.o
            mr0 r8 = defpackage.mr0.a
            r6.<init>(r7, r8, r1)
            r5.<init>(r11, r6, r4)
            defpackage.h88.f(r3, r5, r11)
            r0.v0 = r3
            e9d r1 = r0.getChildRouter(r3)
            r0.w0 = r1
            r2.addView(r3)
            r3 = r2
        L_0x02d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.PickerChatController.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        this.v0 = null;
        this.w0 = null;
        xr8 xr8 = this.y0;
        if (xr8 != null) {
            xr8.a();
        }
        this.y0 = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        og9 og9 = null;
        bs0.K(new i21(MapsKt.emptyMap(), f0().Y, new ce1((Object) view, (Object) this, (Continuation) null, 5)), getViewLifecycleScope());
        if (d0()) {
            e9d e9d = this.w0;
            oz1 oz1 = this.v0;
            if (e9d != null && oz1 != null) {
                View e0 = e0();
                sgb sgb = new sgb(this, 4);
                boolean z2 = o5a.v(getContext()).b && Build.VERSION.SDK_INT >= 30;
                tu7 viewLifecycleScope = getViewLifecycleScope();
                pg9 pg9 = (pg9) ((etc) f0().A0.c).a.getValue();
                if (pg9 != null) {
                    og9 = pg9.a;
                }
                this.y0 = new xr8(e9d, oz1, e0, sgb, z2, viewLifecycleScope, og9 == og9.b, new sgb(this, 5));
                new qr8((sr8) this.Z.getValue(), (dc9) this.X.getValue()).a(getViewLifecycleScope());
                bs0.K(new ps5(new on2((etc) f0().A0.c, 28), new wq0(2, this, PickerChatController.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 24), 5), getViewLifecycleScope());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PickerChatController(tkb tkb, Bundle bundle) {
        this(bundle);
        bundle.putSerializable("picker_chat_controller_purpose", tkb);
    }
}
