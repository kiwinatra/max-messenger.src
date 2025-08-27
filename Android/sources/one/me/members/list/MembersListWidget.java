package one.me.members.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lv39;", "Lv29;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lw39;", "(Ljava/lang/String;Lw39;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "members-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMembersListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembersListWidget.kt\none/me/members/list/MembersListWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 4 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n420#2:291\n255#2,9:294\n419#2:303\n235#2,10:304\n410#2,8:316\n410#2,8:324\n10#3,2:292\n43#4:314\n46#4:315\n1#5:332\n*S KotlinDebug\n*F\n+ 1 MembersListWidget.kt\none/me/members/list/MembersListWidget\n*L\n56#1:291\n61#1:294,9\n64#1:303\n93#1:304,10\n166#1:316,8\n183#1:324,8\n62#1:292,2\n135#1:314\n136#1:315\n*E\n"})
@SuppressLint({"ValidController"})
public final class MembersListWidget extends Widget implements v39, v29, cx3 {
    public static final /* synthetic */ KProperty[] B0;
    public ia4 A0;
    public final t56 X;
    public final t56 Y;
    public final kx2 Z;
    public final is a;
    public final long b;
    public final ij2 c;
    public final Integer o;
    public final wie v;
    public final kx2 v0;
    public final Lazy w;
    public final Lazy w0;
    public final is x;
    public final rd3 x0;
    public final yh7 y;
    public final ReadOnlyProperty y0;
    public final t56 z;
    public fz2 z0;

    static {
        Class<MembersListWidget> cls = MembersListWidget.class;
        B0 = new KProperty[]{wj6.p(cls, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public MembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(w39.class, "memberslist:args");
        this.b = c0().a;
        this.c = c0().b;
        this.o = c0().o;
        this.v = o5a.U();
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "arg_scope_id", cls);
        if (k != null) {
            this.w = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, i49.class, (Function0) null);
            this.x = new is(Long.class, (Object) null, "selected_member_id_for_action");
            this.y = yh7.c;
            a49 a49 = a49.a;
            t56 t56 = new t56((Object) this, a49.c(), 17);
            this.z = t56;
            t56 t562 = new t56((Object) this, a49.c(), 16);
            this.X = t562;
            t56 t563 = new t56((Object) this, a49.c(), 16);
            this.Y = t563;
            kx2 kx2 = new kx2(a49.c(), 4);
            this.Z = kx2;
            kx2 kx22 = new kx2(a49.c(), 1);
            this.v0 = kx22;
            this.w0 = createViewModelLazy(r49.class, new i76(24, new s49(this, 1)));
            this.x0 = new rd3(new qd3(false, 1), t562, t56, t563, kx2, kx22);
            this.y0 = viewBinding(uva.c);
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final w39 c0() {
        KProperty kProperty = B0[0];
        return (w39) this.a.a(this);
    }

    public final EndlessRecyclerView2 d0() {
        return (EndlessRecyclerView2) this.y0.getValue(this, B0[3]);
    }

    public final i49 e0() {
        return (i49) this.w.getValue();
    }

    public final r49 f0() {
        return (r49) this.w0.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.y;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onAttach(View view) {
        ((z49) f0().z.getValue()).d();
        bs0.K(new ps5(e0().y, new SuspendLambda(2, (Continuation<Object>) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().w, new w49((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().X, new wq0(2, f0(), r49.class, "searchMembers", "searchMembers(Ljava/lang/String;)V", 4, 19), 5), getViewLifecycleScope());
        wb wbVar = f0().x0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(wbVar, getViewLifecycleOwner().getLifecycle(), iu7), new t49((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(e0().y, getViewLifecycleOwner().getLifecycle(), iu7), new u49((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setId(uva.c);
        endlessRecyclerView2.setItemAnimator((yyc) null);
        rd3 rd3 = this.x0;
        endlessRecyclerView2.setAdapter(rd3);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        y7e.n(endlessRecyclerView2);
        endlessRecyclerView2.setPager(new k71(6, this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.setDelegate(new qr0((Object) this.Z));
        if (rd3.j() > 0) {
            endlessRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().widthPixels, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().heightPixels, IntCompanionObject.MIN_VALUE));
        }
        return endlessRecyclerView2;
    }

    public final void onDismiss() {
        KProperty[] kPropertyArr = B0;
        KProperty kProperty = kPropertyArr[2];
        this.x.b(this, (Object) null);
        pm7 pm7 = (pm7) this.v.getValue(this, kPropertyArr[1]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
    }

    public final void s(int i, Bundle bundle) {
        KProperty[] kPropertyArr = B0;
        KProperty kProperty = kPropertyArr[2];
        is isVar = this.x;
        Long l = (Long) isVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            i49 e0 = e0();
            e0.getClass();
            xag.h(e0.v, new b49(i, longValue));
        }
        KProperty kProperty2 = kPropertyArr[2];
        isVar.b(this, (Object) null);
    }

    public MembersListWidget(String str, w39 w39, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "arg_scope_id"), TuplesKt.to("memberslist:args", w39)));
    }
}
