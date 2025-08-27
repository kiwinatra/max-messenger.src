package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltyc;", "adapter", "", "setAdapter", "(Ltyc;)V", "Landroid/view/View;", "emptyView", "setEmptyView", "(Landroid/view/View;)V", "<set-?>", "T1", "Lkotlin/properties/ReadWriteProperty;", "getMEmptyView", "()Landroid/view/View;", "setMEmptyView", "mEmptyView", "lists_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmptyRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyRecyclerView.kt\none/me/sdk/lists/widgets/EmptyRecyclerView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n33#2,3:161\n5#3:164\n5#3:165\n1863#4,2:166\n*S KotlinDebug\n*F\n+ 1 EmptyRecyclerView.kt\none/me/sdk/lists/widgets/EmptyRecyclerView\n*L\n15#1:161,3\n90#1:164\n99#1:165\n155#1:166,2\n*E\n"})
public class EmptyRecyclerView extends RecyclerView {
    public static final /* synthetic */ KProperty[] W1 = {rae.s(EmptyRecyclerView.class, "mEmptyView", "getMEmptyView()Landroid/view/View;", 0)};
    public final ObservableProperty T1 = new u45(this, 0);
    public vyc U1;
    public final LinkedHashSet V1 = new LinkedHashSet();

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
    }

    public static void M0(tyc tyc, vyc vyc) {
        if (vyc != null) {
            try {
                tyc.A(vyc);
            } catch (Exception e) {
                z68.o(tyc.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    public static void N0(tyc tyc, vyc vyc) {
        if (vyc != null) {
            try {
                tyc.D(vyc);
            } catch (Exception e) {
                z68.o(tyc.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    private final View getMEmptyView() {
        return (View) this.T1.getValue(this, W1[0]);
    }

    private final void setMEmptyView(View view) {
        this.T1.setValue(this, W1[0], view);
    }

    public final void H0() {
        if (getMEmptyView() != null && getAdapter() != null) {
            tyc adapter = getAdapter();
            int i = 0;
            boolean z = adapter != null && adapter.j() == 0;
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(z ? 0 : 8);
            }
            if (z) {
                i = 8;
            }
            setVisibility(i);
        }
    }

    public void I0(tyc tyc) {
    }

    public void J0(tyc tyc) {
    }

    public void K0() {
    }

    public void L0() {
    }

    public final void O0(tyc tyc, boolean z) {
        tyc adapter = getAdapter();
        if (adapter != null) {
            N0(adapter, this.U1);
        }
        L0();
        tyc P0 = P0(tyc);
        setLayoutFrozen(false);
        A0(P0, true, z);
        m0(true);
        requestLayout();
        if (P0 != null) {
            M0(P0, this.U1);
        }
        J0(P0);
    }

    public tyc P0(tyc tyc) {
        return tyc;
    }

    public final void setAdapter(tyc tyc) {
        vyc vyc;
        tyc adapter = getAdapter();
        if (!(adapter == null || (vyc = this.U1) == null)) {
            N0(adapter, vyc);
            this.U1 = null;
        }
        tyc P0 = P0(tyc);
        K0();
        super.setAdapter(P0);
        if (!(P0 == null || getMEmptyView() == null)) {
            t45 t45 = new t45(0, this);
            this.U1 = t45;
            M0(P0, t45);
        }
        I0(P0);
        H0();
    }

    public final void setEmptyView(View view) {
        if (!Intrinsics.areEqual((Object) view, (Object) getMEmptyView())) {
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(8);
            }
            setMEmptyView(view);
            H0();
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        Iterator it = this.V1.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Delegates delegates = Delegates.INSTANCE;
    }
}
