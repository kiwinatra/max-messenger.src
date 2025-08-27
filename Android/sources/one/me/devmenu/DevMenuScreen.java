package one.me.devmenu;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lj1e;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDevMenuScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevMenuScreen.kt\none/me/devmenu/DevMenuScreen\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,191:1\n24#2:192\n193#3,8:193\n774#4:201\n865#4,2:202\n1611#4,9:204\n1863#4:213\n1864#4:215\n1620#4:216\n1557#4:217\n1628#4,3:218\n827#4:221\n855#4,2:222\n1567#4:224\n1598#4,3:225\n1601#4:233\n1755#4,2:239\n1757#4:242\n1755#4,3:243\n1863#4,2:246\n1#5:214\n1#5:241\n49#6:228\n51#6:232\n46#7:229\n51#7:231\n105#8:230\n105#8:238\n283#9:234\n284#9:237\n37#10,2:235\n*S KotlinDebug\n*F\n+ 1 DevMenuScreen.kt\none/me/devmenu/DevMenuScreen\n*L\n90#1:192\n90#1:193,8\n102#1:201\n102#1:202,2\n103#1:204,9\n103#1:213\n103#1:215\n103#1:216\n109#1:217\n109#1:218,3\n122#1:221\n122#1:222,2\n123#1:224\n123#1:225,3\n123#1:233\n143#1:239,2\n143#1:242\n152#1:243,3\n162#1:246,2\n103#1:214\n124#1:228\n124#1:232\n124#1:229\n124#1:231\n124#1:230\n132#1:238\n132#1:234\n132#1:237\n132#1:235,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class DevMenuScreen extends SectionRecyclerWidget implements j1e {
    public static final /* synthetic */ int z = 0;
    public final yh7 o = yh7.d;
    public final k1e v;
    public final t56 w;
    public final List x;
    public final iz9 y;

    public DevMenuScreen() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        this.v = new k1e(this, commonPool);
        this.w = new t56((ExecutorService) commonPool, (Object) new wm4(0), 25);
        this.x = tm4.a.getAccessor().d(dn4.class, false);
        this.y = new iz9();
    }

    public static s1e f0(DevMenuScreen devMenuScreen, o94 o94, int i, int i2, int i3) {
        o94 o942 = o94;
        int i4 = (i3 & 8) != 0 ? o942.c : i2;
        devMenuScreen.getClass();
        f1e f1e = null;
        Integer valueOf = i4 != 0 ? Integer.valueOf(i4) : null;
        l94 l94 = l94.m;
        ev0 ev0 = o942.e;
        if (!Intrinsics.areEqual((Object) ev0, (Object) l94)) {
            if (Intrinsics.areEqual((Object) ev0, (Object) m94.m)) {
                f1e = a1e.a;
            } else if (ev0 instanceof n94) {
                f1e = new d1e(((n94) ev0).m, true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new s1e(o942.a, i, o942.b, (h1e) null, (ngf) null, valueOf, f1e, (y0e) null, o942.d, 0, 664);
    }

    public final void N(long j, boolean z2) {
        Object obj;
        Iterable<dn4> iterable = this.x;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (dn4 dn4 : iterable) {
                Iterator it = ((Iterable) dn4.a().getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((o94) obj).a == j) {
                        break;
                    }
                }
                o94 o94 = (o94) obj;
                if (o94 != null) {
                    dn4.b(o94);
                    return;
                }
            }
        }
    }

    public final t56 c0() {
        return this.w;
    }

    public final k1e d0() {
        return this.v;
    }

    public final void e(long j) {
        Object obj;
        Iterable<dn4> iterable = this.x;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (dn4 dn4 : iterable) {
                Iterator it = ((Iterable) dn4.a().getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((o94) obj).a == j) {
                        break;
                    }
                }
                o94 o94 = (o94) obj;
                if (o94 != null) {
                    dn4.b(o94);
                    return;
                }
            }
        }
    }

    public final yh7 getInsetsConfig() {
        return this.o;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(rgc.oneme_devmenu_screen_view);
        AppBarLayout appBarLayout = new AppBarLayout(coordinatorLayout.getContext(), (AttributeSet) null);
        appBarLayout.setId(rgc.oneme_devmenu_screen_view_appbar);
        appBarLayout.setElevation(c44.DEFAULT_ASPECT_RATIO);
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setOutlineProvider((ViewOutlineProvider) null);
        Toolbar toolbar = new Toolbar(appBarLayout.getContext(), (AttributeSet) null);
        toolbar.setElevation(c44.DEFAULT_ASPECT_RATIO);
        toolbar.setId(rgc.oneme_devmenu_screen_view_toolbar);
        toolbar.setLayoutParams(new f53(-1, -2));
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.u(0, 0);
        h3b d = o54.d(toolbar.getContext(), (AttributeSet) null);
        d.setForm(z2b.a);
        d.setTextShimmerEnabled(false);
        d.setId(rgc.oneme_devmenu_screen_view_oneme_toolbar);
        d.setTitle((CharSequence) "Dev menu");
        d.setLeftActions(new p2b(new of3(8)));
        toolbar.addView(d, new gmf(-1, -2));
        appBarLayout.addView(toolbar, new dn(-1, -2));
        coordinatorLayout.addView(appBarLayout, new wz3(-1, -2));
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView e0 = e0(16);
        wz3 wz3 = new wz3(-1, -1);
        wz3.setMargins(wz3.leftMargin, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), wz3.rightMargin, MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density));
        wz3.b(new AppBarLayout.ScrollingViewBehavior(coordinatorLayout.getContext(), (AttributeSet) null));
        Unit unit = Unit.INSTANCE;
        coordinatorLayout.addView(e0, wz3);
        b0h.H(coordinatorLayout, new mh0(3, (Continuation) null, 4));
        return coordinatorLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        for (dn4 c : this.x) {
            c.c();
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Iterable iterable = this.x;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            dn4 dn4 = (dn4) next;
            if ((dn4 instanceof q38) || (dn4 instanceof rtd)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o94 o94 = (o94) CollectionsKt.firstOrNull((List) ((dn4) it.next()).a().getValue());
            if (o94 != null) {
                arrayList2.add(o94);
            }
        }
        Iterable<o94> sortedWith = CollectionsKt.sortedWith(arrayList2, new xm4(new r6(10, this), 0));
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        for (o94 o942 : sortedWith) {
            this.y.e(o942.a, o942);
            int i = o942.c;
            if (i == 0) {
                i = lya.u;
            }
            arrayList3.add(f0(this, o942, 0, i, 6));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : iterable) {
            dn4 dn42 = (dn4) next2;
            if (!(dn42 instanceof q38) && !(dn42 instanceof rtd)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next3 = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList5.add(new cn4(((dn4) next3).a(), this, i2));
            i2 = i3;
        }
        bs0.K(new ps5(new zm4((bs5[]) CollectionsKt.toList(arrayList5).toArray(new bs5[0]), 0), new an4(this, arrayList3, (Continuation) null), 5), getLifecycleScope());
    }
}
