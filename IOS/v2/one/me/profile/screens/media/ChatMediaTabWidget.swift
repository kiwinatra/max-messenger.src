package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMediaTabWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMediaTabWidget.kt\none/me/profile/screens/media/ChatMediaTabWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n235#2,10:173\n410#2,8:183\n43#3:191\n46#3:192\n1#4:193\n*S KotlinDebug\n*F\n+ 1 ChatMediaTabWidget.kt\none/me/profile/screens/media/ChatMediaTabWidget\n*L\n51#1:173,10\n123#1:183,8\n139#1:191\n140#1:192\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMediaTabWidget extends Widget {
    public static final /* synthetic */ KProperty[] Z;
    public final grg X;
    public final nf2 Y;
    public final w28 a;
    public final yh7 b;
    public final Lazy c;
    public final Lazy o;
    public final sn0 v;
    public final sn0 w;
    public final ReadOnlyProperty x;
    public final sn0 y;
    public m56 z;

    static {
        Class<ChatMediaTabWidget> cls = ChatMediaTabWidget.class;
        Z = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    }

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new s01(4, (Object) this), (Function0) null, 6);
        this.b = yh7.d;
        this.c = jxb.a.getAccessor().h(z5a.class);
        this.o = createViewModelLazy(ag2.class, new s(22, new bg2(bundle, 0)));
        this.v = binding(new cg2(this, 0));
        this.w = binding(new cg2(this, 1));
        this.x = viewBinding(jxa.n0);
        this.y = binding(new cg2(this, 2));
        this.X = new grg(9);
        this.Y = new nf2(this, bundle.getLong("chat_id"));
    }

    public static final jgd c0(ChatMediaTabWidget chatMediaTabWidget) {
        chatMediaTabWidget.getClass();
        int ordinal = ((eg2) eg2.o.get(chatMediaTabWidget.d0().getCurrentItem())).ordinal();
        if (ordinal == 0) {
            return jgd.CHAT_ATTACHMENTS_MEDIA;
        }
        if (ordinal == 1) {
            return jgd.CHAT_ATTACHMENTS_FILES;
        }
        if (ordinal == 2) {
            return jgd.CHAT_ATTACHMENTS_LINKS;
        }
        if (ordinal == 3) {
            return jgd.CHAT_ATTACHMENTS_MEDIA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ViewPager2 d0() {
        KProperty kProperty = Z[3];
        return (ViewPager2) this.y.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(jxa.l0);
        linearLayout.setOrientation(1);
        KProperty[] kPropertyArr = Z;
        KProperty kProperty = kPropertyArr[0];
        linearLayout.addView((h3b) this.v.getValue());
        KProperty kProperty2 = kPropertyArr[1];
        linearLayout.addView((c2b) this.w.getValue());
        oz1 a2 = kv0.a(linearLayout.getContext());
        a2.setId(jxa.n0);
        linearLayout.addView(a2);
        linearLayout.addView(d0());
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        m56 m56 = this.z;
        if (m56 != null) {
            m56.f();
        }
        this.z = null;
    }

    public final void onViewCreated(View view) {
        ViewPager2 d0 = d0();
        nf2 nf2 = this.Y;
        d0.setAdapter(nf2);
        KProperty[] kPropertyArr = Z;
        KProperty kProperty = kPropertyArr[1];
        c2b c2b = (c2b) this.w.getValue();
        ViewPager2 d02 = d0();
        grg grg = this.X;
        grg.getClass();
        m56 m56 = new m56(c2b, d02, true, new ba(c2b, grg));
        m56.d();
        this.z = m56;
        bs0.K(new ps5(ct.k(new on2(((ag2) this.o.getValue()).c, 28), getViewLifecycleOwner().getLifecycle(), iu7.o), new dg2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 d03 = d0();
        View childAt = d03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((yyc) null);
            recyclerView.setHasFixedSize(true);
        }
        d03.e(0, false);
        if (nf2.w0.size() > 0) {
            d03.measure(View.MeasureSpec.makeMeasureSpec(d03.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(d03.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        e9d childRouter = getChildRouter((ViewGroup) this.x.getValue(this, kPropertyArr[2]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (DefaultConstructorMarker) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(iq.n(pinBarsWidget, (ey3) null, (ey3) null));
        }
    }

    public ChatMediaTabWidget(long j) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j))));
    }
}
