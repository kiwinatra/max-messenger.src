package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/views/widgets/SecondScrollExpandBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSecondScrollExpandBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecondScrollExpandBehavior.kt\nru/ok/messages/views/widgets/SecondScrollExpandBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class SecondScrollExpandBehavior extends AppBarLayout.Behavior {
    public boolean o = true;
    public int p;

    @JvmOverloads
    public SecondScrollExpandBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.o(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        Unit unit = Unit.INSTANCE;
        M(i2, appBarLayout, view, i3);
    }

    /* renamed from: G */
    public final void p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.p(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        Unit unit = Unit.INSTANCE;
        M(i2, appBarLayout, view, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (((androidx.recyclerview.widget.LinearLayoutManager) r2).S0() != 0) goto L_0x0033;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, android.view.View r7, android.view.View r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r9 != r1) goto L_0x0005
            return r0
        L_0x0005:
            if (r10 != r1) goto L_0x0016
            int r2 = r4.p
            int r3 = r4.w()
            if (r2 != r3) goto L_0x0016
            int r2 = r4.w()
            if (r2 == 0) goto L_0x0016
            goto L_0x0033
        L_0x0016:
            boolean r2 = r8 instanceof defpackage.nid
            if (r2 != 0) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            boolean r2 = r8 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x0032
            r2 = r8
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.a r2 = r2.getLayoutManager()
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0032
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r2 = r2.S0()
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            r4.o = r0
            int r0 = r4.w()
            r4.p = r0
            boolean r4 = super.t(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.SecondScrollExpandBehavior.t(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
    }

    public final void M(int i, AppBarLayout appBarLayout, View view, int i2) {
        if (i2 == 1) {
            int w = w();
            if ((i < 0 && w == this.p) || ((i > 0 && w == (-appBarLayout.getTotalScrollRange())) || (i < 0 && w == 0))) {
                WeakHashMap weakHashMap = gag.a;
                if (view instanceof g6a) {
                    ((g6a) view).a(1);
                }
            }
        }
    }

    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        super.o(coordinatorLayout, appBarLayout, view2, i, i2, iArr, i3);
        Unit unit = Unit.INSTANCE;
        M(i2, appBarLayout, view2, i3);
    }

    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        super.u(coordinatorLayout, (AppBarLayout) view, view2, i);
    }

    public final boolean y(int i) {
        if (!this.o) {
            return false;
        }
        return super.y(i);
    }
}
