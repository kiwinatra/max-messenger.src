package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lqg3;", "<init>", "()V", "Lx71;", "type", "(Lx71;)V", "s9a", "call-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallHistoryPageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallHistoryPageScreen.kt\none/me/calllist/ui/page/CallHistoryPageScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n255#2,9:276\n235#2,10:285\n420#2:297\n8#3:295\n8#3:296\n28#4:298\n24#4:302\n256#5,2:299\n1#6:301\n*S KotlinDebug\n*F\n+ 1 CallHistoryPageScreen.kt\none/me/calllist/ui/page/CallHistoryPageScreen\n*L\n47#1:276,9\n54#1:285,10\n165#1:297\n61#1:295\n145#1:296\n255#1:298\n95#1:302\n73#1:299,2\n*E\n"})
public final class CallHistoryPageScreen extends Widget implements cx3, qg3 {
    public static final s9a X = new s9a(8, (byte) 0);
    public static final /* synthetic */ KProperty[] Y;
    public static final int Z = 1;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public bnf o;
    public final q3d v;
    public final sn0 w;
    public final Lazy x;
    public final Lazy y;
    public final is z;

    static {
        Class<CallHistoryPageScreen> cls = CallHistoryPageScreen.class;
        Y = new KProperty[]{wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), rae.s(cls, "typeArg", "getTypeArg()Ljava/lang/String;", 0)};
    }

    public CallHistoryPageScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        this.a = m1571getSharedViewModelcp94BC8("call_history_scope_id", v71.class, (Function0) null);
        this.b = createViewModelLazy(n71.class, new s(6, new h71(this, 0)));
        h71 h71 = new h71(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = LazyKt.lazy(lazyThreadSafetyMode, h71);
        this.v = new q3d(new h71(this, 2));
        this.w = binding(new h71(this, 3));
        this.x = LazyKt.lazy(new h71(this, 4));
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new v11(6));
        this.z = new is(String.class, "type_arg");
    }

    public final x71 c0() {
        Object obj;
        t9a t9a = x71.b;
        KProperty kProperty = Y[1];
        String str = (String) this.z.a(this);
        t9a.getClass();
        Iterator it = x71.w.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((x71) obj).name(), (Object) str)) {
                break;
            }
        }
        x71 x71 = (x71) obj;
        return x71 == null ? x71.ALL : x71;
    }

    public final EndlessRecyclerView2 d0() {
        KProperty kProperty = Y[0];
        return (EndlessRecyclerView2) this.w.getValue();
    }

    public final v71 e0() {
        return (v71) this.a.getValue();
    }

    public final n71 f0() {
        return (n71) this.b.getValue();
    }

    public final void g(int i, Bundle bundle) {
        ((lf1) this.c.getValue()).g(i);
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        n71 f0 = f0();
        z68.c("CallHistoryPageViewModel", "unregister load history callbacks for type=" + f0.b, new Object[0]);
        zp1 zp1 = f0.v;
        zp1.getClass();
        zp1.x0.c(new xp1(zp1, 4));
        zp1.w.remove(f0);
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        f0().l();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) this.v.getValue();
        if (oneMeEmptyView != null) {
            frameLayout.addView(oneMeEmptyView, -1, -1);
        }
        frameLayout.addView(d0(), -1, -1);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.v.a();
        bnf bnf = this.o;
        if (bnf != null) {
            bnf.B(d0());
        }
    }

    public final void onDismiss() {
        f0().w0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((lf1) this.c.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        o5a.O(new ps5(f0().Y, new i71(this, (Continuation) null), 5), getViewLifecycleScope());
        t9a t9a = x71.b;
        x71 x71 = f0().b;
        t9a.getClass();
        if (x71 == x71.ALL) {
            o5a.O(new ps5(f0().v0, new j71(this, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r8.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            n71 r8 = r6.f0()
            java.lang.Long r8 = r8.w0
            if (r8 == 0) goto L_0x005a
            long r0 = r8.longValue()
            n71 r8 = r6.f0()
            mz6 r8 = r8.j(r0)
            if (r8 != 0) goto L_0x0017
            return
        L_0x0017:
            int r2 = Z
            if (r7 != r2) goto L_0x0041
            v71 r7 = r6.e0()
            xme r2 = r7.w
        L_0x0021:
            java.lang.Object r7 = r2.getValue()
            r3 = r7
            t71 r3 = (defpackage.t71) r3
            java.util.Map r4 = r3.b
            r3.getClass()
            t71 r3 = new t71
            r5 = 1
            r3.<init>(r4, r5)
            boolean r7 = r2.b(r7, r3)
            if (r7 == 0) goto L_0x0021
            v71 r6 = r6.e0()
            r6.j(r0, r8)
            goto L_0x005a
        L_0x0041:
            if (r7 != 0) goto L_0x005a
            v71 r6 = r6.e0()
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r8)
            r6.getClass()
            u71 r8 = new u71
            r0 = 0
            r8.<init>(r6, r7, r0)
            r7 = 3
            jx3 r6 = r6.a
            defpackage.ev0.v(r6, r0, r0, r8, r7)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calllist.ui.page.CallHistoryPageScreen.s(int, android.os.Bundle):void");
    }

    public CallHistoryPageScreen(x71 x71) {
        this();
        String name = x71.name();
        KProperty kProperty = Y[1];
        this.z.b(this, name);
    }
}
