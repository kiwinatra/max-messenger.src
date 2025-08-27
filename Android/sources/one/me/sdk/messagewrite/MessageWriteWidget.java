package one.me.sdk.messagewrite;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Loq7;", "Lcx3;", "Lob9;", "Lc33;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessageWriteWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageWriteWidget.kt\none/me/sdk/messagewrite/MessageWriteWidget\n+ 2 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 10 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n+ 11 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n+ 12 View.kt\nandroidx/core/view/ViewKt\n+ 13 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 14 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,778:1\n10#2,2:779\n10#2,2:790\n10#2,2:801\n10#2,2:812\n10#2,2:936\n255#3,9:781\n255#3,9:792\n255#3,9:803\n255#3,9:814\n410#3,8:825\n410#3,8:833\n410#3,8:841\n410#3,8:849\n410#3,8:857\n410#3,8:865\n410#3,8:878\n410#3,8:891\n410#3,8:899\n410#3,8:907\n410#3,8:917\n423#3,2:934\n5#4:823\n1#5:824\n17#6:873\n19#6:877\n17#6:886\n19#6:890\n46#7:874\n51#7:876\n46#7:887\n51#7:889\n105#8:875\n105#8:888\n24#9:915\n24#9:916\n24#9:938\n4#10:925\n4#10:969\n65#11,4:926\n256#12,2:930\n256#12,2:932\n65#12,4:940\n37#12:944\n53#12:945\n72#12:946\n26#13:939\n80#14,22:947\n*S KotlinDebug\n*F\n+ 1 MessageWriteWidget.kt\none/me/sdk/messagewrite/MessageWriteWidget\n*L\n90#1:779,2\n94#1:790,2\n98#1:801,2\n102#1:812,2\n682#1:936,2\n89#1:781,9\n93#1:792,9\n97#1:803,9\n101#1:814,9\n249#1:825,8\n264#1:833,8\n278#1:841,8\n295#1:849,8\n314#1:857,8\n319#1:865,8\n336#1:878,8\n342#1:891,8\n347#1:899,8\n349#1:907,8\n396#1:917,8\n669#1:934,2\n111#1:823\n335#1:873\n335#1:877\n341#1:886\n341#1:890\n335#1:874\n335#1:876\n341#1:887\n341#1:889\n335#1:875\n341#1:888\n360#1:915\n369#1:916\n121#1:938\n588#1:925\n198#1:969\n596#1:926,4\n616#1:930,2\n622#1:932,2\n125#1:940,4\n125#1:944\n125#1:945\n125#1:946\n122#1:939\n198#1:947,22\n*E\n"})
public final class MessageWriteWidget extends Widget implements oq7, cx3, ob9, c33 {
    public static final /* synthetic */ KProperty[] C0;
    public final xme A0;
    public ymf B0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final h48 v;
    public final sn0 v0;
    public final Lazy w;
    public final ReadOnlyProperty w0;
    public final Lazy x;
    public final ReadOnlyProperty x0;
    public final Lazy y;
    public hf8 y0;
    public final Lazy z;
    public mw3 z0;

    static {
        Class<MessageWriteWidget> cls = MessageWriteWidget.class;
        C0 = new KProperty[]{wj6.p(cls, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "container", "getContainer()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), wj6.p(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0), wj6.p(cls, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public MessageWriteWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "arg_scope_id", cls);
        if (k != null) {
            this.a = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, mh9.class, (Function0) null);
            Object k2 = n54.k(bundle, "arg_scope_id", cls);
            if (k2 != null) {
                this.b = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k2)).a, v0f.class, (Function0) null);
                Object k3 = n54.k(bundle, "arg_scope_id", cls);
                if (k3 != null) {
                    this.c = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k3)).a, kf8.class, (Function0) null);
                    Object k4 = n54.k(bundle, "arg_scope_id", cls);
                    if (k4 != null) {
                        this.o = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k4)).a, yvc.class, (Function0) null);
                        wqg wqg = wqg.a;
                        this.v = (h48) wqg.getAccessor().g(h48.class);
                        this.w = wqg.getAccessor().h(fq.class);
                        this.x = wqg.getAccessor().h(uj5.class);
                        this.y = wqg.getAccessor().h(edb.class);
                        this.z = LazyKt.lazy(LazyThreadSafetyMode.NONE, new nh9(this, 0));
                        this.X = viewBinding(xya.y);
                        this.Y = viewBinding(xya.w);
                        this.Z = viewBinding(dad.V);
                        this.v0 = binding(new nh9(this, 3));
                        int i = xya.x;
                        this.w0 = viewBinding(i);
                        this.x0 = childSlotRouter(i);
                        this.A0 = f6e.a(Boolean.FALSE);
                        return;
                    }
                    throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
                }
                throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
            throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public static void m0(occ occ, boolean z2) {
        m2g S = m5a.S(wgf.f(occ.getTitleView()));
        l2g l2g = null;
        if (z2) {
            l2g b2 = wgf.b(occ.getTitleView());
            if ((b2 != null ? b2.a : null) == S) {
                return;
            }
        }
        if (z2) {
            l2g b3 = wgf.b(occ.getTitleView());
            if ((b3 != null ? b3.a : null) != S) {
                l2g = new l2g(occ.getContext(), S, new wg7(23));
            }
        }
        wgf.e(occ.getTitleView(), l2g);
    }

    public static void n0(occ occ, vg9 vg9) {
        m0(occ, vg9.b);
        CharSequence a2 = vg9.a.a(occ.getContext());
        if (a2 != null) {
            occ.setTitle(a2);
            ngf ngf = vg9.c;
            occ.setBody(ngf != null ? ngf.a(occ.getContext()) : null);
            occ.a(vg9.d, vg9.e);
            occ.setCounter(vg9.f);
            occ.setDrawOverlay(false);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void F() {
        bc9 bc9 = d0().c;
        bc9.setShowSoftInputOnFocus(true);
        bc9.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isAttached()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            kotlin.reflect.KProperty[] r0 = C0
            r1 = 4
            r2 = r0[r1]
            kotlin.properties.ReadOnlyProperty r3 = r4.w0
            java.lang.Object r2 = r3.getValue(r4, r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipChildren(r5)
            r1 = r0[r1]
            java.lang.Object r1 = r3.getValue(r4, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setClipToPadding(r5)
            r1 = 1
            r2 = r0[r1]
            kotlin.properties.ReadOnlyProperty r3 = r4.Y
            java.lang.Object r2 = r3.getValue(r4, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setClipChildren(r5)
            r0 = r0[r1]
            java.lang.Object r0 = r3.getValue(r4, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.g0()
            r0.setClipChildren(r5)
            android.widget.LinearLayout r0 = r4.g0()
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.g0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L_0x0059
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.setClipChildren(r5)
        L_0x005f:
            android.widget.LinearLayout r0 = r4.g0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x006e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x006f
        L_0x006e:
            r0 = r2
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.setClipToPadding(r5)
        L_0x0074:
            android.widget.LinearLayout r0 = r4.g0()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0087
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.setClipChildren(r5)
        L_0x008d:
            android.widget.LinearLayout r4 = r4.g0()
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewParent r4 = r4.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a0
            r2 = r4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.setClipToPadding(r5)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.c0(boolean):void");
    }

    public final dc9 d0() {
        return (dc9) this.Z.getValue(this, C0[2]);
    }

    public final occ e0() {
        KProperty kProperty = C0[3];
        return (occ) this.v0.getValue();
    }

    public final mz2 f0() {
        return (mz2) this.x0.getValue(this, C0[5]);
    }

    public final LinearLayout g0() {
        return (LinearLayout) this.X.getValue(this, C0[0]);
    }

    public final mh9 h0() {
        return (mh9) this.a.getValue();
    }

    public final v0f i0() {
        return (v0f) this.b.getValue();
    }

    public final void j0() {
        mh9 h0 = h0();
        CharSequence text = d0().getText();
        h0.getClass();
        xag.h(h0.Z, new xg9(text));
        d0().setText((CharSequence) null);
    }

    public final void k() {
        d0().e(false);
    }

    public final void k0(vg9 vg9) {
        sn0 sn0 = this.v0;
        if (vg9 == null && y7e.L(sn0)) {
            e0().setVisibility(8);
        } else if (vg9 != null && !y7e.L(sn0)) {
            View requireView = requireView();
            LinearLayout linearLayout = requireView instanceof LinearLayout ? (LinearLayout) requireView : null;
            if (linearLayout != null) {
                y7e.c(linearLayout, e0(), 0);
            }
            n0(e0(), vg9);
            e0().setVisibility(0);
            d0().requestFocus();
            d0().e(true);
        } else if (vg9 != null) {
            n0(e0(), vg9);
            d0().requestFocus();
        }
    }

    public final void l0() {
        CharSequence text = d0().getText();
        if (text != null && !StringsKt.isBlank(text)) {
            mh9 h0 = h0();
            KProperty[] kPropertyArr = mh9.K0;
            h0.r(text, false);
            d0().setText((CharSequence) null);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ph9 ph9 = new ph9(this, 2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(xya.y);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        ph9.invoke(linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ymf ymf = this.B0;
        if (ymf != null) {
            ymf.dismiss();
        }
        this.B0 = null;
        k();
        this.y0 = null;
    }

    public final void onViewCreated(View view) {
        boolean z2;
        ql8 ql8 = h0().H0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(ql8, getViewLifecycleOwner().getLifecycle(), iu7), new uh9((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new i21(pq7.f, this.A0, new c11(3, (Continuation) null, 2), 4), getViewLifecycleOwner().getLifecycle(), iu7), new li9((Continuation) null, this), 5), getViewLifecycleScope());
        dc9 d0 = d0();
        ph9 ph9 = new ph9(this, 4);
        d0.getClass();
        String[] strArr = {"image/jpeg", "image/gif"};
        rb9 rb9 = new rb9(ph9);
        WeakHashMap weakHashMap = gag.a;
        int i = Build.VERSION.SDK_INT;
        bc9 bc9 = d0.c;
        if (i >= 31) {
            dag.c(bc9, strArr, rb9);
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z2 = false;
                    break;
                } else if (strArr[i2].startsWith("*")) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            bs0.m("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z2);
            bc9.setTag(ahc.tag_on_receive_content_mime_types, strArr);
            bc9.setTag(ahc.tag_on_receive_content_listener, rb9);
        }
        v0f i0 = i0();
        i0.R0 = new qo3(2, i0, this);
        bs0.K(new ps5(ct.k(d0().getMessageState(), getViewLifecycleOwner().getLifecycle(), iu7), new vh9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().getMessagePosition(), new ii9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(i0().F0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new wh9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(i0().L0, new ji9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(i0().J0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new xh9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(new on2(((kf8) this.c.getValue()).b, 28), new ki9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().A0, getViewLifecycleOwner().getLifecycle(), iu7), new yh9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new zh9((Continuation) null, this), 5), getViewLifecycleScope());
        o5a.O(new ps5(h0().J0, new hi9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new fi9(h0().E0, this, 0), getViewLifecycleOwner().getLifecycle(), iu7), new ai9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new fi9(h0().G0, this, 1), getViewLifecycleOwner().getLifecycle(), iu7), new bi9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().I0, getViewLifecycleOwner().getLifecycle(), iu7), new ci9((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((yvc) this.o.getValue()).v, getViewLifecycleOwner().getLifecycle(), iu7), new th9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        o0f o0f;
        xme xme;
        Object value;
        i0f i0f = (i0f) CollectionsKt.firstOrNull(i0().L0.l());
        if (i0f != null && (o0f = i0f.b) != null) {
            String str = (String) CollectionsKt.getOrNull(o0f.w, i);
            if (str != null) {
                v0f i0 = i0();
                o0f o0f2 = new o0f(o0f.a, o0f.b, o0f.c, str, o0f.v, o0f.w, o0f.x);
                do {
                    xme = i0.I0;
                    value = xme.getValue();
                    o0f o0f3 = (o0f) value;
                } while (!xme.b(value, o0f2));
            }
            i0().K0.setValue((Object) null);
        }
    }

    public MessageWriteWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "arg_scope_id")));
    }
}
