package one.me.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.bottombar.OneMeBottomBarView;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\n"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "route", "Landroid/os/Bundle;", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "pc8", "main-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\none/me/main/MainScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 Log.kt\nru/ok/tamtam/logger/Log\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n235#2,10:305\n5#3:315\n5#3:327\n28#4:316\n32#5,4:317\n32#5,4:336\n1863#6,2:321\n1863#6,2:323\n295#6,2:325\n381#7,3:328\n384#7,4:332\n1#8:331\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\none/me/main/MainScreen\n*L\n57#1:305,10\n81#1:315\n220#1:327\n99#1:316\n141#1:317,4\n161#1:336,4\n157#1:321,2\n179#1:323,2\n218#1:325,2\n233#1:328,3\n233#1:332,4\n*E\n"})
public final class MainScreen extends Widget {
    public static final /* synthetic */ KProperty[] x;
    public final Lazy a;
    public final w28 b;
    public final LinkedHashMap c;
    public final ReadOnlyProperty o;
    public final ReadOnlyProperty v;
    public final String w;

    static {
        Class<MainScreen> cls = MainScreen.class;
        x = new KProperty[]{wj6.p(cls, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0)};
    }

    public MainScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        this.a = createViewModelLazy(uc8.class, new i76(13, new c28(3, this)));
        this.b = new w28(new s01(25, (Object) this), new s01(26, (Object) this), 4);
        this.c = new LinkedHashMap();
        this.o = viewBinding(mva.h);
        this.v = viewBinding(mva.a);
        this.w = MainScreen.class.getName();
        setRetainViewMode(yx3.b);
    }

    public final void c0(spa spa) {
        jgd jgd;
        ChatsTabWidget chatsTabWidget;
        zx3 settingsListScreen;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(spa);
        oz1 oz1 = obj;
        if (obj == null) {
            oz1 a2 = kv0.a(getContext());
            a2.setId(spa.c);
            linkedHashMap.put(spa, a2);
            oz1 = a2;
        }
        ViewGroup viewGroup = (ViewGroup) oz1;
        ((FrameLayout) this.o.getValue(this, x[0])).addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
        String str = spa.d;
        if (str.length() <= 0) {
            str = null;
        }
        e9d childRouter = getChildRouter(viewGroup, str);
        childRouter.e = 1;
        if (!childRouter.n()) {
            ic8.b.getClass();
            String a3 = bb4.a(ic8.c.a);
            String str2 = spa.d;
            if (Intrinsics.areEqual((Object) str2, (Object) a3)) {
                settingsListScreen = new ContactListWidget((Bundle) null, 1, (DefaultConstructorMarker) null);
                jgd = jgd.CONTACTS_TAB;
            } else if (Intrinsics.areEqual((Object) str2, (Object) bb4.a(ic8.d.a))) {
                settingsListScreen = new CallHistoryScreen();
                jgd = jgd.CALL_HISTORY_TAB;
            } else if (Intrinsics.areEqual((Object) str2, (Object) bb4.a(ic8.e.a))) {
                chatsTabWidget = new ChatsTabWidget(getArgs().getString("folder_id"));
                jgd = jgd.CHATS_LIST_TAB;
                chatsTabWidget.addLifecycleListener(new fa3(3, jgd));
                chatsTabWidget.setRetainViewMode(yx3.b);
                i9d i9d = new i9d(chatsTabWidget, (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d(str);
                childRouter.R(i9d);
            } else if (Intrinsics.areEqual((Object) str2, (Object) bb4.a(ic8.f.a))) {
                settingsListScreen = new SettingsListScreen();
                jgd = jgd.SETTINGS_TAB;
            } else {
                throw new IllegalStateException(("invalid screen! " + str2).toString());
            }
            chatsTabWidget = settingsListScreen;
            chatsTabWidget.addLifecycleListener(new fa3(3, jgd));
            chatsTabWidget.setRetainViewMode(yx3.b);
            i9d i9d2 = new i9d(chatsTabWidget, (String) null, (ey3) null, (ey3) null, false, -1);
            i9d2.d(str);
            childRouter.R(i9d2);
        }
        childRouter.I();
    }

    public final void d0(spa spa) {
        ViewGroup viewGroup = (ViewGroup) this.c.get(spa);
        if (viewGroup != null) {
            e9d childRouter = getChildRouter(viewGroup, spa.d, false);
            if (childRouter != null) {
                childRouter.F();
            }
            ((FrameLayout) this.o.getValue(this, x[0])).removeView(viewGroup);
        }
    }

    public final OneMeBottomBarView e0() {
        return (OneMeBottomBarView) this.v.getValue(this, x[1]);
    }

    public final e9d f0() {
        spa spa = h0().o;
        ViewGroup viewGroup = (ViewGroup) this.c.get(spa);
        if (viewGroup == null) {
            return null;
        }
        return getChildRouter(viewGroup, spa.d);
    }

    public final jgd g0() {
        int i = h0().o.c;
        return i == mva.g ? jgd.CONTACTS_TAB : i == mva.c ? jgd.CALL_HISTORY_TAB : i == mva.j ? jgd.SETTINGS_TAB : jgd.CHATS_LIST_TAB;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final uc8 h0() {
        return (uc8) this.a.getValue();
    }

    public final void i0(spa spa) {
        String str = this.w;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "handleClick, selected item=" + spa, (Throwable) null);
        }
        if (!Intrinsics.areEqual((Object) h0().o, (Object) spa)) {
            d0(h0().o);
            h0().o = spa;
            OneMeBottomBarView e0 = e0();
            e0.getClass();
            int i = 0;
            while (i < e0.getChildCount()) {
                int i2 = i + 1;
                View childAt = e0.getChildAt(i);
                if (childAt != null) {
                    ((kr0) childAt).setSelected(vzg.w(childAt, jic.tag_tab_item) == spa);
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            c0(spa);
            this.b.f();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pc8 pc8 = new pc8(this, getContext());
        pc8.setId(mva.h);
        pc8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        OneMeBottomBarView oneMeBottomBarView = new OneMeBottomBarView(pc8.getContext(), (AttributeSet) null);
        oneMeBottomBarView.setId(mva.a);
        oneMeBottomBarView.setElevation(vo4.c().getDisplayMetrics().density * 8.0f);
        o5a.v(oneMeBottomBarView.getContext().getApplicationContext());
        oneMeBottomBarView.setBlurEnabled(Boolean.FALSE);
        h88.f(oneMeBottomBarView, new yh7((jdb) null, new nr0(jdb.b, mr0.a, false), 1), (Function1) null);
        fu4 e = fu4.k.e(pc8.getContext());
        bs0.K(new ps5((etc) e.j, new qc8(this, pc8, e, (Continuation) null), 5), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        Unit unit = Unit.INSTANCE;
        pc8.addView(oneMeBottomBarView, layoutParams);
        return pc8;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        LinkedHashMap linkedHashMap = this.c;
        for (spa d0 : linkedHashMap.keySet()) {
            d0(d0);
        }
        linkedHashMap.clear();
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Object obj;
        String string = bundle.getString("main:selected_tag");
        if (string != null) {
            uc8 h0 = h0();
            Iterator it = h0.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((spa) obj).d, (Object) string)) {
                    break;
                }
            }
            spa spa = (spa) obj;
            if (spa != null) {
                h0.o = spa;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("main:selected_tag", h0().o.d);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        spa spa = h0().o;
        e9d f0 = f0();
        Widget widget = null;
        zx3 g = f0 != null ? f0.g(spa.d) : null;
        if (g instanceof Widget) {
            widget = (Widget) g;
        }
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    public final void onViewCreated(View view) {
        for (spa spa : h0().c) {
            OneMeBottomBarView e0 = e0();
            boolean areEqual = Intrinsics.areEqual((Object) spa, (Object) h0().o);
            h24 h24 = new h24(15, (Object) this, (Object) spa);
            kr0 kr0 = new kr0(e0.getContext(), (AttributeSet) null);
            kr0.setId(spa.e);
            vzg.H(jic.tag_tab_item, kr0, spa);
            kr0.setText(spa.a);
            rpa rpa = spa.b;
            if (rpa instanceof ppa) {
                ppa ppa = (ppa) rpa;
                kr0.F0.setImageDrawable((Drawable) ppa.a.invoke(kr0.getContext()));
                Function3 function3 = ppa.b;
                if (function3 == null) {
                    function3 = kr0.I0;
                }
                kr0.J0 = function3;
                kr0.L();
            } else if (rpa instanceof qpa) {
                kr0.setIcon(((qpa) rpa).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            kr0.setSelected(areEqual);
            ct.G(kr0, 300, h24);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            float f = (float) 4;
            layoutParams.leftMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
            layoutParams.rightMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
            Unit unit = Unit.INSTANCE;
            e0.addView(kr0, layoutParams);
            e0.setWeightSum((float) e0.getChildCount());
        }
        bs0.K(new ps5(h0().w, new rc8(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(h0().y, new sc8(this, (Continuation) null), 5), getViewLifecycleScope());
        c0(h0().o);
    }

    public MainScreen(String str, Bundle bundle) {
        this();
        getArgs().putString("main:arg:deep_link", str);
        getArgs().putAll(bundle);
    }
}
