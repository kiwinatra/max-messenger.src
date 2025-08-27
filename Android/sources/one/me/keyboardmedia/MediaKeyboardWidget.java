package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Lphf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "", "chatId", "", "onlyEmoji", "(Ljava/lang/String;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "as8", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaKeyboardWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaKeyboardWidget.kt\none/me/keyboardmedia/MediaKeyboardWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,462:1\n419#2:463\n419#2:464\n255#2,9:467\n9#3:465\n9#3:498\n1#4:466\n1#4:476\n1#4:499\n1#4:507\n24#5:477\n32#5:478\n24#5:479\n24#5:480\n24#5:483\n24#5:486\n24#5:489\n172#6,2:481\n172#6,2:484\n172#6,2:487\n157#6,8:490\n256#6,2:501\n256#6,2:503\n256#6,2:505\n256#6,2:509\n256#6,2:513\n43#7:500\n13346#8:508\n13347#8:511\n13346#8:512\n13347#8:515\n13346#8,2:516\n*S KotlinDebug\n*F\n+ 1 MediaKeyboardWidget.kt\none/me/keyboardmedia/MediaKeyboardWidget\n*L\n67#1:463\n68#1:464\n70#1:467,9\n71#1:465\n239#1:498\n71#1:466\n239#1:499\n121#1:477\n133#1:478\n142#1:479\n150#1:480\n169#1:483\n195#1:486\n222#1:489\n152#1:481,2\n171#1:484,2\n197#1:487,2\n223#1:490,8\n280#1:501,2\n281#1:503,2\n282#1:505,2\n382#1:509,2\n387#1:513,2\n271#1:500\n381#1:508\n381#1:511\n386#1:512\n386#1:515\n399#1:516,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaKeyboardWidget extends Widget implements phf {
    public static final /* synthetic */ KProperty[] A0;
    public final ReadOnlyProperty X;
    public m56 Y;
    public final er7 Z;
    public final is a;
    public final is b;
    public final Lazy c;
    public hb8 o;
    public final ReadOnlyProperty v;
    public nf2 v0;
    public final ReadOnlyProperty w;
    public gi0 w0;
    public final ReadOnlyProperty x;
    public final EnumMap x0;
    public final ReadOnlyProperty y;
    public ObjectAnimator y0;
    public final ReadOnlyProperty z;
    public AnimatorSet z0;

    static {
        Class<MediaKeyboardWidget> cls = MediaKeyboardWidget.class;
        A0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "onlyEmoji", "getOnlyEmoji()Z", 0), wj6.p(cls, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0), wj6.p(cls, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0), wj6.p(cls, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wj6.p(cls, "settingsButton", "getSettingsButton()Landroid/view/View;", 0), wj6.p(cls, "removeButton", "getRemoveButton()Landroid/view/View;", 0), wj6.p(cls, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0)};
    }

    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, 0L, "arg_key_chat_id");
        this.b = new is(Boolean.class, Boolean.FALSE, "arg_key_only_emoji");
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.c = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, sr8.class, (Function0) null);
            this.v = viewBinding(zua.a);
            this.w = viewBinding(zua.p);
            this.x = viewBinding(zua.f);
            this.y = viewBinding(zua.j);
            this.z = viewBinding(zua.i);
            this.X = viewBinding(zua.k);
            er7 er7 = new er7(0);
            er7.b = CollectionsKt.emptyList();
            this.Z = er7;
            this.x0 = new EnumMap(ar7.class);
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final void c0() {
        if (getView() != null) {
            List list = (List) this.Z.b;
            int currentItem = e0().getCurrentItem();
            if (currentItem >= 0 && currentItem <= CollectionsKt.getLastIndex(list)) {
                ar7 ar7 = (ar7) list.get(currentItem);
                int ordinal = ar7.ordinal();
                if (ordinal == 0) {
                    g0(ar7, (RecyclerView) e0().findViewById(zua.n));
                } else if (ordinal == 1) {
                    g0(ar7, (RecyclerView) e0().findViewById(zua.c));
                }
            }
        }
    }

    public final View d0() {
        return (View) this.v.getValue(this, A0[2]);
    }

    public final ViewPager2 e0() {
        return (ViewPager2) this.x.getValue(this, A0[4]);
    }

    public final boolean f0() {
        KProperty kProperty = A0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final void g0(ar7 ar7, RecyclerView recyclerView) {
        EnumMap enumMap = this.x0;
        if (!enumMap.containsKey(ar7) && recyclerView != null) {
            as8 as8 = new as8(getContext(), new s01(27, (Object) this), new s01(28, (Object) this));
            recyclerView.m(as8);
            enumMap.put(ar7, as8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        b0h.H(frameLayout, new bs8(3, (Continuation) null, 1));
        int i = pq7.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, pq7.a(frameLayout.getContext())));
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setId(zua.f);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOverScrollMode(2);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hsg.m(viewPager2);
        frameLayout.addView(viewPager2);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(zua.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        b0h.H(frameLayout2, new bs8(3, (Continuation) null, 0));
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        b0h.H(view, new zt3(3, (Continuation) null, 1));
        frameLayout2.addView(view);
        int roundToInt = MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView.setId(zua.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams3.gravity = 8388627;
        float f = (float) 12;
        layoutParams3.leftMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setPadding(4, 4, 4, 4);
        b0h.H(appCompatImageView, new sx1(3, (Continuation) null, 1));
        ct.G(appCompatImageView, 300, new p71(3));
        frameLayout2.addView(appCompatImageView);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView2.setId(zua.k);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setPadding(4, 4, 4, 4);
        b0h.H(appCompatImageView2, new sx1(3, (Continuation) null, 2));
        ct.G(appCompatImageView2, 300, new yr8(this, 0));
        frameLayout2.addView(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView3.setId(zua.i);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams5.gravity = 8388629;
        layoutParams5.rightMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setPadding(4, 4, 4, 4);
        b0h.H(appCompatImageView3, new sx1(3, (Continuation) null, 3));
        appCompatImageView3.setOnClickListener(new yr8(this, 1));
        frameLayout2.addView(appCompatImageView3);
        dr7 dr7 = new dr7(frameLayout2.getContext(), (AttributeSet) null);
        dr7.setId(zua.p);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        int roundToInt2 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        dr7.setPadding(dr7.getPaddingLeft(), roundToInt2, dr7.getPaddingRight(), roundToInt2);
        dr7.setLayoutParams(layoutParams6);
        dr7.setTabMode(0);
        frameLayout2.addView(dr7);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        sr8 sr8 = (sr8) this.c.getValue();
        int currentItem = e0().getCurrentItem();
        List list = (List) this.Z.b;
        sr8.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            ((pid) ((fq) sr8.c.getValue())).k("app.last.media_keyboard.page.id", Long.valueOf(((ar7) list.get(currentItem)).b.a));
        }
        ObjectAnimator objectAnimator = this.y0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.y0 = null;
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.z0 = null;
        m56 m56 = this.Y;
        if (m56 != null) {
            m56.f();
        }
        this.Y = null;
        gi0 gi0 = this.w0;
        if (gi0 != null) {
            e0().g(gi0);
        }
        this.w0 = null;
        this.x0.clear();
    }

    public final void onThemeChanged(k2b k2b) {
        ((dr7) this.w.getValue(this, A0[3])).onThemeChanged(k2b);
    }

    public final void onViewCreated(View view) {
        List list;
        int i = 8;
        hb8 hb8 = this.o;
        KProperty[] kPropertyArr = A0;
        KProperty kProperty = kPropertyArr[0];
        long longValue = ((Number) this.a.a(this)).longValue();
        Class<egd> cls = egd.class;
        Object k = n54.k(getArgs(), Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.v0 = new nf2(this, hb8, longValue, ((egd) ((Parcelable) k)).a);
            e0().setAdapter(this.v0);
            ViewPager2 e0 = e0();
            gi0 gi0 = new gi0(8, this);
            this.w0 = gi0;
            e0.b(gi0);
            dr7 dr7 = (dr7) this.w.getValue(this, kPropertyArr[3]);
            ViewPager2 e02 = e0();
            er7 er7 = this.Z;
            er7.getClass();
            m56 m56 = new m56(dr7, e02, true, new u00((Object) dr7, (Object) er7, (Object) e02, 12));
            m56.d();
            this.Y = m56;
            fma onBackPressedDispatcher = getOnBackPressedDispatcher();
            if (onBackPressedDispatcher != null) {
                jv7 jv7 = this.lifecycleOwner;
                wx3 wx3 = new wx3(!f0(), (Function1) new vq7(9, (Object) this));
                if (jv7 != null) {
                    onBackPressedDispatcher.a(jv7, wx3);
                } else {
                    onBackPressedDispatcher.b(wx3);
                }
            }
            if (f0()) {
                list = CollectionsKt.listOf(ar7.EMOJI);
            } else {
                ar7.o.getClass();
                list = ar7.v;
            }
            er7.b = list;
            nf2 nf2 = this.v0;
            if (nf2 != null) {
                if (!nf2.w0.isEmpty() || !(!list.isEmpty())) {
                    mo4 h = h88.h(new c71(4, nf2.w0, list));
                    nf2.w0 = list;
                    h.a(new y35(2, (Object) nf2));
                } else {
                    nf2.w0 = list;
                    nf2.o(0, list.size());
                }
            }
            ViewPager2 e03 = e0();
            View childAt = e03.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setItemAnimator((yyc) null);
                recyclerView.setHasFixedSize(true);
            }
            nf2 nf22 = this.v0;
            if ((nf22 != null ? nf22.w0.size() : 0) > 0) {
                ((View) this.z.getValue(this, kPropertyArr[6])).setVisibility(f0() ? 0 : 8);
                ((View) this.y.getValue(this, kPropertyArr[5])).setVisibility(f0() ^ true ? 0 : 8);
                View view2 = (View) this.X.getValue(this, kPropertyArr[7]);
                if (!f0()) {
                    i = 0;
                }
                view2.setVisibility(i);
                sr8 sr8 = (sr8) this.c.getValue();
                sr8.getClass();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((ar7) it.next()).b.a == ((pid) ((fq) sr8.c.getValue())).g.getLong("app.last.media_keyboard.page.id", 0)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                e03.e(RangesKt.coerceAtLeast(i2, 0), true);
                int i3 = pq7.a;
                e03.measure(View.MeasureSpec.makeMeasureSpec(e03.getContext().getResources().getDisplayMetrics().widthPixels, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(pq7.a(e03.getContext()), 1073741824));
                c0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaKeyboardWidget(String str, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }

    public MediaKeyboardWidget(String str, long j, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("arg_key_chat_id", Long.valueOf(j)), TuplesKt.to("arg_key_only_emoji", Boolean.valueOf(z2))));
    }
}
