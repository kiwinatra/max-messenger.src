package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u00070J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Lvzc;", "delegate", "", "setRefreshingNextDelegate", "(Lvzc;)V", "Lw65;", "setDelegate", "(Lw65;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "", "value", "setRefreshingNext", "(Z)V", "setRefreshingPrev", "Lu65;", "pager", "setPager", "(Lu65;)V", "", "threshold", "setThreshold", "(I)V", "b2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "", "e2", "Lkotlin/Lazy;", "getFrameIntervalNanos", "()J", "frameIntervalNanos", "", "f2", "getTag", "()Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "y65", "lists_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEndlessRecyclerView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndlessRecyclerView2.kt\none/me/sdk/lists/widgets/EndlessRecyclerView2\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n31#2:362\n5#3:363\n1#4:364\n*S KotlinDebug\n*F\n+ 1 EndlessRecyclerView2.kt\none/me/sdk/lists/widgets/EndlessRecyclerView2\n*L\n250#1:362\n263#1:363\n*E\n"})
public final class EndlessRecyclerView2 extends EmptyRecyclerView {
    public static final /* synthetic */ int g2 = 0;
    public y65 X1;
    public int Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public w65 c2;
    public final z65 d2;
    public final Lazy e2;
    public final Lazy f2;

    @JvmOverloads
    public EndlessRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final long getFrameIntervalNanos() {
        return ((Number) this.e2.getValue()).longValue();
    }

    private final String getTag() {
        return (String) this.f2.getValue();
    }

    public final void I0(tyc tyc) {
        if (tyc != null) {
            EmptyRecyclerView.M0(tyc, this.d2);
        }
    }

    public final void J0(tyc tyc) {
        if (tyc != null) {
            EmptyRecyclerView.M0(tyc, this.d2);
        }
    }

    public final void K0() {
        tyc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.N0(adapter, this.d2);
        }
    }

    public final void L0() {
        tyc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.N0(adapter, this.d2);
        }
    }

    public final boolean Q0() {
        return getChildCount() != 0 && getChildAt(0).getTop() <= getTop() && getChildAt(getChildCount() - 1).getBottom() >= getBottom();
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.b2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) getLayoutManager();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            z68.f("EndlessRecyclerView2", "onLayout", e);
        }
        y65 y65 = this.X1;
        if (y65 != null) {
            y65.b(this, 0, 0);
        }
    }

    public final void setDelegate(w65 w65) {
        this.c2 = w65;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.b2 = z;
    }

    public void setLayoutManager(a aVar) {
        if (aVar instanceof LinearLayoutManager) {
            super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public final void setPager(u65 u65) {
        if (u65 != null) {
            y65 y65 = new y65(this, u65);
            int i = this.Y1;
            if (i > 0) {
                y65.b = i;
            }
            m(y65);
            this.X1 = y65;
            return;
        }
        y65 y652 = this.X1;
        if (y652 != null) {
            u0(y652);
            this.X1 = null;
        }
    }

    public final void setRefreshingNext(boolean z) {
        if (this.Z1 != z) {
            if (z) {
                w65 w65 = this.c2;
                if (w65 != null) {
                    w65.e();
                }
            } else {
                w65 w652 = this.c2;
                if (w652 != null) {
                    w652.f();
                }
            }
            this.Z1 = z;
        }
    }

    public final void setRefreshingNextDelegate(vzc vzc) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.a2 != z) {
            this.a2 = z;
        }
    }

    public final void setThreshold(int i) {
        this.Y1 = i;
        y65 y65 = this.X1;
        if (y65 != null && i > 0) {
            y65.b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EndlessRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.Y1 = 1;
        this.d2 = new z65(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e2 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 1));
        this.f2 = LazyKt.lazy(lazyThreadSafetyMode, new v65(this, 0));
    }
}
