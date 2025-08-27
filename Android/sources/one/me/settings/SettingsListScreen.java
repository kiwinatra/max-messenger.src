package one.me.settings;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.sections.SectionRecyclerWidget;
import ru.ok.messages.gallery.GalleryResultViewModel;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lqc6;", "Lj1e;", "Len;", "Lqg3;", "Lmd0;", "<init>", "()V", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingsListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsListScreen.kt\none/me/settings/SettingsListScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 8 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 9 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 10 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 11 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 12 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 13 Tag.kt\nru/ok/tamtam/logger/TagKt\n*L\n1#1,444:1\n235#2,10:445\n8#3:455\n24#4:456\n142#5,8:457\n1#6:465\n131#7,10:466\n49#8:476\n51#8:480\n46#9:477\n51#9:479\n105#10:478\n135#11,3:481\n138#11,8:498\n33#12,14:484\n5#13:506\n*S KotlinDebug\n*F\n+ 1 SettingsListScreen.kt\none/me/settings/SettingsListScreen\n*L\n83#1:445,10\n102#1:455\n143#1:456\n143#1:457,8\n334#1:466,10\n334#1:476\n334#1:480\n334#1:477\n334#1:479\n334#1:478\n383#1:481,3\n383#1:498,8\n383#1:484,14\n409#1:506\n*E\n"})
public final class SettingsListScreen extends SectionRecyclerWidget implements qc6, j1e, en, qg3, md0 {
    public static final /* synthetic */ KProperty[] y0;
    public final Lazy X;
    public final Lazy Y;
    public final ExecutorService Z;
    public final yh7 o = yh7.d;
    public final Lazy v = createViewModelLazy(wyd.class, new zfa(25, new red(21)));
    public AppBarLayout v0;
    public final ReadOnlyProperty w = viewBinding(wza.j);
    public final k1e w0;
    public final ReadOnlyProperty x = viewBinding(wza.i);
    public final t56 x0;
    public final Lazy y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new b2e(this, 0));
    public final Lazy z = LazyKt.lazy(new b2e(this, 1));

    static {
        Class<SettingsListScreen> cls = SettingsListScreen.class;
        y0 = new KProperty[]{wj6.p(cls, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), wj6.p(cls, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public SettingsListScreen() {
        v1e v1e = v1e.a;
        this.X = v1e.getAccessor().h(edb.class);
        this.Y = v1e.getAccessor().h(z5a.class);
        ExecutorService a = ((aua) v1e.getAccessor().g(aua.class)).a();
        this.Z = a;
        this.w0 = new k1e(this, a);
        this.x0 = new t56(a, (Object) new wm4(1), 25);
        etc etc = g0().y0;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, lifecycle, iu7), new c2e(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(g0().A0, this.lifecycleOwner.getLifecycle(), iu7), new d2e(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final void N(long j, boolean z2) {
    }

    public final void a(String str, RectF rectF, Rect rect) {
        g0().n(str, rectF);
    }

    public final t56 c0() {
        return this.x0;
    }

    public final k1e d0() {
        return this.w0;
    }

    public final void e(long j) {
        Object obj;
        pa4 pa4;
        wyd g0 = g0();
        g0.getClass();
        gyd.b.getClass();
        Iterator it = gyd.y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((long) ((gyd) obj).ordinal()) == j) {
                break;
            }
        }
        gyd gyd = (gyd) obj;
        switch (gyd == null ? -1 : oyd.$EnumSwitchMapping$0[gyd.ordinal()]) {
            case -1:
                return;
            case 1:
                z1e.b.getClass();
                pa4 = new pa4(":settings/folder-list");
                break;
            case 2:
                z1e.b.getClass();
                pa4 = new pa4(":settings/appearance");
                break;
            case 3:
                z1e.b.getClass();
                pa4 = new pa4(":settings/notifications");
                break;
            case 4:
                z1e.b.getClass();
                pa4 = new pa4(":settings/privacy");
                break;
            case 5:
                z1e.b.getClass();
                pa4 = new pa4(":settings/messages");
                break;
            case 6:
                z1e.b.getClass();
                pa4 = new pa4(":webview/faq");
                break;
            case 7:
                z1e.b.getClass();
                pa4 = new pa4(":settings/dev");
                break;
            case 8:
                z1e.b.getClass();
                pa4 = new pa4(":settings/media");
                break;
            case 9:
                z1e.b.getClass();
                pa4 = new pa4(":settings/caching");
                break;
            case 10:
                z1e.b.getClass();
                pa4 = new pa4(":settings/aboutapp");
                break;
            case 11:
                z1e z1e = z1e.b;
                cud cud = ((ltb) g0.l()).b;
                cud.getClass();
                long r = cud.r(zjd.b, -1);
                nfd nfd = kfg.c;
                z1e.getClass();
                pa4 = new pa4(":webapp:root?bot_id=" + r + "&entry_point=settings");
                break;
            case 12:
                xag.g(g0, ((osa) g0.k()).a(), (f14) null, new uyd(g0, (Continuation) null), 2);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        xag.h(g0.v0, pa4);
    }

    public final a4e f0() {
        return (a4e) this.w.getValue(this, y0[0]);
    }

    public final void g(int i, Bundle bundle) {
        wyd g0 = g0();
        g0.getClass();
        int i2 = wza.d;
        s85 s85 = g0.v0;
        if (i == i2) {
            Long m = g0.m();
            if (m != null) {
                long longValue = m.longValue();
                z1e.b.getClass();
                a81.r(":neuro-avatars?id=" + longValue, s85);
            }
        } else if (i == wza.c) {
            xag.h(s85, y2e.b);
        } else if (i == wza.b) {
            g0.o();
        }
    }

    public final wyd g0() {
        return (wyd) this.v.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.o;
    }

    public final void i(AppBarLayout appBarLayout, int i) {
        if (appBarLayout != null) {
            float abs = ((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange());
            ((h3b) this.x.getValue(this, y0[1])).setTitleAlpha(abs);
            f0().setAlpha(1.0f - abs);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                z68.f(SettingsListScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                g0().r();
                return;
            }
            wyd g0 = g0();
            ev0.v(g0.a, ((osa) g0.k()).b(), (f14) null, new tyd(intent, g0, (Continuation) null), 2);
        } else if (i2 == -1) {
            wyd g02 = g0();
            ev0.v(g02.a, ((osa) g02.k()).b(), (f14) null, new pyd(g02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        g0().j();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a2e a2e = new a2e(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(wza.f);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b0h.H(coordinatorLayout, new s0c(3, (Continuation) null, 1));
        a2e.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((edb) this.X.getValue()).b(strArr)) {
            g0().o();
        }
        g0().j();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AppBarLayout appBarLayout = this.v0;
        if (appBarLayout != null) {
            appBarLayout.a(h88.d0(this, appBarLayout, getViewLifecycleOwner()));
        }
        f0().setAvatarClickedListener(new rh9(g0(), 11));
        f0().setNicknameClickListener(new rh9(g0(), 12));
        f0().setUserPhoneClickListener(new rh9(g0(), 13));
        s85 s85 = g0().v0;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.v;
        bs0.K(new ps5(ct.k(s85, lifecycle, iu7), new h2e(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().w0, this.lifecycleOwner.getLifecycle(), iu7.o), new e2e(this, (Continuation) null), 5), getLifecycleScope());
        co1 k = ct.k(kv0.i(((GalleryResultViewModel) ((ul6) ((Lazy) this.z.getValue()).getValue())).d), this.lifecycleOwner.getLifecycle(), iu7);
        bs0.K(new kyd(new ps5(new on2(k, 28), new f2e(k, (Continuation) null, this), 5), 1), getViewLifecycleScope());
    }
}
