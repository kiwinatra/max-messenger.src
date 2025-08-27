package one.me.chats.list;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lqg3;", "Lys3;", "Lug5;", "Lak7;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatsListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatsListWidget.kt\none/me/chats/list/ChatsListWidget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 5 Log.kt\nru/ok/tamtam/logger/Log\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 10 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 11 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 12 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 15 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,747:1\n5#2:748\n419#3:749\n419#3:750\n235#3,10:751\n235#3,10:761\n235#3,10:771\n410#3,8:790\n410#3,8:804\n410#3,8:812\n410#3,8:820\n410#3,8:834\n410#3,8:842\n8#4:781\n32#5,4:782\n32#5,4:786\n32#5,4:850\n32#5,4:910\n32#6:798\n17#6:799\n19#6:803\n32#6:828\n17#6:829\n19#6:833\n46#7:800\n51#7:802\n46#7:830\n51#7:832\n105#8:801\n105#8:831\n43#9:854\n46#9:855\n135#10,3:856\n138#10,8:873\n135#10,3:883\n138#10,8:900\n33#11,14:859\n33#11,14:886\n24#12:881\n1#13:882\n1251#14,2:908\n81#15:914\n*S KotlinDebug\n*F\n+ 1 ChatsListWidget.kt\none/me/chats/list/ChatsListWidget\n*L\n113#1:748\n116#1:749\n117#1:750\n127#1:751,10\n146#1:761,10\n153#1:771,10\n289#1:790,8\n302#1:804,8\n356#1:812,8\n361#1:820,8\n376#1:834,8\n392#1:842,8\n213#1:781\n237#1:782,4\n284#1:786,4\n396#1:850,4\n733#1:910,4\n301#1:798\n301#1:799\n301#1:803\n375#1:828\n375#1:829\n375#1:833\n301#1:800\n301#1:802\n375#1:830\n375#1:832\n301#1:801\n375#1:831\n464#1:854\n465#1:855\n513#1:856,3\n513#1:873,8\n684#1:883,3\n684#1:900,8\n513#1:859,14\n684#1:886,14\n528#1:881\n732#1:908,2\n171#1:914\n*E\n"})
public final class ChatsListWidget extends Widget implements cx3, qg3, ys3, ug5, ak7 {
    public static final /* synthetic */ KProperty[] I0;
    public final t56 A0;
    public final kx2 B0;
    public final b66 C0;
    public final rd3 D0;
    public final wie E0;
    public final Lazy F0;
    public final sn0 G0;
    public final ec8 H0;
    public bnf X;
    public final ExecutorService Y;
    public final ReadOnlyProperty Z;
    public final String a;
    public final String b;
    public final is c;
    public final is o;
    public final Lazy v;
    public final sn0 v0;
    public final Lazy w;
    public final Lazy w0;
    public final Lazy x;
    public final r35 x0;
    public final Lazy y;
    public final t56 y0;
    public final Lazy z;
    public final t56 z0;

    static {
        Class<ChatsListWidget> cls = ChatsListWidget.class;
        I0 = new KProperty[]{rae.s(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;", 0), rae.s(cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0), wj6.p(cls, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChatsListWidget(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = 6
            r5 = 5
            r6 = 4
            r7 = 0
            r8 = 2
            r9 = 0
            r0.<init>(r1, r7, r8, r9)
            java.lang.Class<one.me.chats.list.ChatsListWidget> r10 = one.me.chats.list.ChatsListWidget.class
            java.lang.String r10 = r10.getName()
            r0.a = r10
            java.lang.String r11 = "folder.id.key"
            java.lang.String r1 = r1.getString(r11)
            if (r1 == 0) goto L_0x01b5
            r0.b = r1
            is r1 = new is
            java.lang.String r11 = "selected.chatId.Action"
            java.lang.Class<java.lang.Long> r12 = java.lang.Long.class
            r1.<init>(r12, r9, r11)
            r0.c = r1
            is r1 = new is
            java.lang.String r11 = "selected.contactId.Action"
            r1.<init>(r12, r9, r11)
            r0.o = r1
            uw2 r1 = new uw2
            r1.<init>(r0, r7)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            r0.v = r1
            oq2 r1 = new oq2
            r1.<init>(r6)
            rn2 r11 = new rn2
            r12 = 12
            r11.<init>(r12, r1)
            java.lang.Class<yp3> r1 = defpackage.yp3.class
            kotlin.Lazy r1 = r0.createViewModelLazy(r1, r11)
            r0.w = r1
            uw2 r1 = new uw2
            r1.<init>(r0, r6)
            rn2 r11 = new rn2
            r12 = 13
            r11.<init>(r12, r1)
            java.lang.Class<tw2> r1 = defpackage.tw2.class
            kotlin.Lazy r1 = r0.createViewModelLazy(r1, r11)
            r0.x = r1
            uw2 r1 = new uw2
            r1.<init>(r0, r5)
            rn2 r11 = new rn2
            r12 = 14
            r11.<init>(r12, r1)
            java.lang.Class<wh0> r1 = defpackage.wh0.class
            kotlin.Lazy r1 = r0.createViewModelLazy(r1, r11)
            r0.y = r1
            yh0 r11 = defpackage.yh0.a
            q4 r11 = r11.getAccessor()
            java.lang.Class<edb> r12 = defpackage.edb.class
            kotlin.Lazy r11 = r11.h(r12)
            r0.z = r11
            cs2 r11 = defpackage.cs2.a
            aua r12 = r11.d()
            java.util.concurrent.ExecutorService r12 = r12.a()
            r0.Y = r12
            int r13 = defpackage.hra.k
            kotlin.properties.ReadOnlyProperty r13 = r0.viewBinding(r13)
            r0.Z = r13
            uw2 r13 = new uw2
            r13.<init>(r0, r3)
            sn0 r13 = r0.binding(r13)
            r0.v0 = r13
            oq2 r13 = new oq2
            r13.<init>(r5)
            kotlin.Lazy r13 = kotlin.LazyKt.lazy(r13)
            r0.w0 = r13
            r35 r13 = new r35
            yw2 r14 = new yw2
            r14.<init>(r0)
            r13.<init>((defpackage.yw2) r14, (java.util.concurrent.ExecutorService) r12)
            r0.x0 = r13
            t56 r14 = new t56
            r14.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r6)
            r0.y0 = r14
            t56 r15 = new t56
            r9 = 11
            r15.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r9)
            r0.z0 = r15
            t56 r9 = new t56
            r5 = 15
            r9.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r5)
            r0.A0 = r9
            kx2 r5 = new kx2
            r5.<init>(r12, r7)
            r0.B0 = r5
            b66 r6 = new b66
            ms1 r4 = new ms1
            r2 = 19
            r4.<init>(r2, r0)
            uw2 r2 = new uw2
            r3 = 7
            r2.<init>(r0, r3)
            r6.<init>(r12, r4, r2)
            r0.C0 = r6
            rd3 r2 = new rd3
            qd3 r3 = new qd3
            r3.<init>((boolean) r7, (int) r8)
            r4 = 6
            tyc[] r4 = new defpackage.tyc[r4]
            r4[r7] = r14
            r12 = 1
            r4[r12] = r6
            r4[r8] = r13
            r6 = 3
            r4[r6] = r5
            r5 = 4
            r4[r5] = r15
            r5 = 5
            r4[r5] = r9
            r2.<init>(r3, r4)
            r0.D0 = r2
            wie r2 = defpackage.o5a.U()
            r0.E0 = r2
            uw2 r2 = new uw2
            r3 = 8
            r2.<init>(r0, r3)
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r2 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r2)
            r0.F0 = r2
            uw2 r2 = new uw2
            r3 = 9
            r2.<init>(r0, r3)
            sn0 r2 = r0.binding(r2)
            r0.G0 = r2
            ec8 r2 = r11.c()
            r0.H0 = r2
            r2.getClass()
            xbb r3 = new xbb
            ybb r4 = defpackage.ybb.CHATS_INIT_TO_RENDER
            long r5 = android.os.SystemClock.elapsedRealtime()
            r3.<init>(r4, r5)
            qz9 r2 = r2.e
            r2.k(r4, r3)
            tw2 r2 = r16.f0()
            dt2 r2 = r2.v
            wt2 r2 = (defpackage.wt2) r2
            r2.e()
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x015c
            goto L_0x0176
        L_0x015c:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0176
            w78 r3 = defpackage.w78.o
            tu7 r4 = r16.getLifecycleScope()
            boolean r4 = defpackage.e14.f(r4)
            java.lang.String r5 = "ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: "
            java.lang.String r4 = defpackage.i2a.i(r5, r4)
            r5 = 0
            r2.d(r3, r10, r4, r5)
        L_0x0176:
            tw2 r2 = r16.f0()
            etc r2 = r2.E0
            java.lang.Object r1 = r1.getValue()
            wh0 r1 = (defpackage.wh0) r1
            etc r1 = r1.y
            tw2 r3 = r16.f0()
            etc r3 = r3.H0
            java.util.List r4 = defpackage.vzg.s()
            fs5 r5 = new fs5
            r6 = 3
            r5.<init>(r6, r4)
            ww2 r4 = new ww2
            r9 = 0
            r4.<init>(r9, r0)
            r9 = 4
            bs5[] r9 = new defpackage.bs5[r9]
            r9[r7] = r2
            r2 = 1
            r9[r2] = r1
            r9[r8] = r3
            r9[r6] = r5
            wb r1 = new wb
            r2 = 18
            r1.<init>(r2, r9, r4)
            tu7 r0 = r16.getLifecycleScope()
            defpackage.bs0.K(r1, r0)
            return
        L_0x01b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.list.ChatsListWidget.<init>(android.os.Bundle):void");
    }

    public static final void c0(ChatsListWidget chatsListWidget, lw3 lw3) {
        chatsListWidget.getClass();
        float f = (float) -6;
        lw3.e(new Rect(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0), c44.DEFAULT_ASPECT_RATIO);
    }

    public final OneMeEmptyView d0() {
        KProperty kProperty = I0[3];
        return (OneMeEmptyView) this.v0.getValue();
    }

    public final EndlessRecyclerView2 e0() {
        return (EndlessRecyclerView2) this.Z.getValue(this, I0[2]);
    }

    public final void f(xs3 xs3) {
        if (xw2.$EnumSwitchMapping$0[xs3.ordinal()] != 1) {
            q();
        } else if (Build.VERSION.SDK_INT >= 33) {
            eng eng = new eng(this, 1);
            Lazy lazy = this.z;
            String[] strArr = edb.k;
            ((edb) lazy.getValue()).getClass();
            if (edb.i(eng, strArr)) {
                ((edb) lazy.getValue()).f(eng, strArr, 177);
            } else {
                startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getContext().getPackageName(), (String) null)));
            }
        }
    }

    public final tw2 f0() {
        return (tw2) this.x.getValue();
    }

    public final void g(int i, Bundle bundle) {
        boolean z2 = false;
        if (i == ngc.oneme_saved_messages_clear_history) {
            tw2 f0 = f0();
            r62 m = f0.m();
            m.getClass();
            a32 a32 = (a32) m.o0((String) null, new b62(m, 2));
            if (a32 != null) {
                ((jqg) f0.C0.getValue()).a(new jud(a32.a, false));
            }
        } else if (i != oad.a) {
            Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
            boolean z3 = (valueOf == null || valueOf.longValue() != 0) && valueOf != null;
            Long valueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
            if ((valueOf2 == null || valueOf2.longValue() != 0) && valueOf2 != null) {
                z2 = true;
            }
            if (z3) {
                tw2 f02 = f0();
                if (valueOf != null) {
                    xag.g(f02, ((osa) f02.w).a(), (f14) null, new uv2(i, f02, valueOf.longValue(), (Continuation) null), 2);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (z2) {
                yp3 yp3 = (yp3) this.w.getValue();
                if (valueOf2 != null) {
                    yp3.j(i, valueOf2.longValue());
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final void g0() {
        tw2 f0 = f0();
        aje aje = f0.S0;
        if (aje == null || !aje.isActive()) {
            f0.S0 = xag.g(f0, ((osa) f0.w).c(), (f14) null, new wv2(f0, (Continuation) null), 2);
        }
    }

    public final void h0(long j, View view) {
        KProperty[] kPropertyArr = I0;
        KProperty kProperty = kPropertyArr[1];
        if (((Long) this.o.a(this)) == null) {
            KProperty kProperty2 = kPropertyArr[4];
            wie wie = this.E0;
            pm7 pm7 = (pm7) wie.getValue(this, kProperty2);
            if (pm7 == null || !pm7.isActive()) {
                wie.setValue(this, kPropertyArr[4], ev0.v(getViewLifecycleScope(), (CoroutineContext) null, f14.b, new zw2(this, j, view, (Continuation) null), 1));
            }
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        f0().n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(hra.k);
        endlessRecyclerView2.setTag(ngc.oneme_folder_tag, this.b);
        endlessRecyclerView2.setHasFixedSize(true);
        frameLayout.addView(endlessRecyclerView2);
        frameLayout.addView(d0(), -1, -1);
        b0h.H(frameLayout, new sn2(3, (Continuation) null, 2));
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", e14.f(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 e0 = e0();
        KProperty kProperty = I0[5];
        e0.s0((eu2) this.G0.getValue());
        bnf bnf = this.X;
        if (bnf != null) {
            bnf.B(e0);
        }
        e0.setDelegate((w65) null);
        e0.setPager((u65) null);
        e0.setAdapter((tyc) null);
    }

    public final void onDismiss() {
        KProperty[] kPropertyArr = I0;
        KProperty kProperty = kPropertyArr[0];
        this.c.b(this, (Object) null);
        KProperty kProperty2 = kPropertyArr[1];
        this.o.b(this, (Object) null);
        pm7 pm7 = (pm7) this.E0.getValue(this, kPropertyArr[4]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.e;
            int i2 = qad.t6;
            int i3 = qad.U6;
            ((edb) this.z.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        String str = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", e14.f(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 e0 = e0();
        rd3 rd3 = this.D0;
        KProperty kProperty = I0[5];
        e0.k((eu2) this.G0.getValue());
        e0.getContext();
        e0.setLayoutManager(new LinearLayoutManager());
        e0.setAdapter(rd3);
        this.X = y7e.n(e0);
        e0.setHasFixedSize(true);
        e0.setPager(new k71(2, this));
        if (Intrinsics.areEqual((Object) this.b, (Object) "all.chat.folder")) {
            e0.setDelegate(this.B0);
        }
        e0.setEmptyView(d0());
        e0.setClipToPadding(false);
        e0.setClipChildren(false);
        e0.setClipToOutline(false);
        e0.setThreshold(10);
        e0.setIgnoreRefreshingFlagsForScrollEvent(true);
        yyc itemAnimator = e0.getItemAnimator();
        bbe bbe = itemAnimator instanceof bbe ? (bbe) itemAnimator : null;
        if (bbe != null) {
            bbe.g = false;
        }
        e0.j(new fr(2));
        js9 js9 = fu4.k;
        e0.j(new j39(js9.e(e0.getContext()).f(), 1));
        e0.j(new m66(new d19(false, this, getContext().getString(qad.P1), e0)));
        e0.j(new vo3(new fl2(4, new wk(8, this, new zo3(0, (CharSequence) "", (String) null, (List) null, (CharSequence) null, (CharSequence) null, (Uri) null, false, false, (CharSequence) "", false, (qdb) null, (Boolean) null, 0, false, 31744))), js9.e(e0.getContext()).f(), (uo3) null));
        if (rd3.j() > 0) {
            e0.measure(View.MeasureSpec.makeMeasureSpec(e0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(e0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        e0().setRefreshingNext(((ss2) f0().E0.a.getValue()).b);
        s85 s85 = f0().K0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new ax2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(f0().L0, 9), getViewLifecycleOwner().getLifecycle(), iu7), new bx2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(f0().J0, getViewLifecycleOwner().getLifecycle(), iu7), new cx2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((yp3) this.w.getValue()).x0, getViewLifecycleOwner().getLifecycle(), iu7), new dx2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(((yp3) this.w.getValue()).y0, 10), getViewLifecycleOwner().getLifecycle(), iu7), new ex2((Continuation) null, this), 5), getViewLifecycleScope());
        this.x0.w = new zmg(1, this);
        bs0.K(new ps5(ct.k(f0().R0, getViewLifecycleOwner().getLifecycle(), iu7), new fx2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void q() {
        ((edb) this.z.getValue()).f(new eng(this, 1), edb.e, 156);
    }

    public final void s(int i, Bundle bundle) {
        KProperty[] kPropertyArr = I0;
        KProperty kProperty = kPropertyArr[0];
        is isVar = this.c;
        Long l = (Long) isVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            KProperty kProperty2 = kPropertyArr[0];
            isVar.b(this, (Object) null);
            tw2 f0 = f0();
            xag.g(f0, ((osa) f0.w).a(), (f14) null, new uv2(i, f0, longValue, (Continuation) null), 2);
            return;
        }
        KProperty kProperty3 = kPropertyArr[1];
        Long l2 = (Long) this.o.a(this);
        if (l2 != null) {
            ((yp3) this.w.getValue()).j(i, l2.longValue());
        }
    }

    public final void u(wj7 wj7) {
        int ordinal = wj7.ordinal();
        if (ordinal == 0) {
            ox2.b.W0().b(":invite/phone", (Bundle) null);
        } else if (ordinal == 1) {
            ox2.b.W0().b(":invite/qr", (Bundle) null);
        } else if (ordinal == 2) {
            ((oo3) this.w0.getValue()).a(requireActivity());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public ChatsListWidget(String str) {
        this(o54.f(TuplesKt.to("folder.id.key", str)));
    }
}
