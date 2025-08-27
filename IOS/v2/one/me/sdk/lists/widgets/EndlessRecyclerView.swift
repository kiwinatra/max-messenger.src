package one.me.sdk.lists.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004456\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b&\u0010%R\"\u0010,\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010%R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltyc;", "getAdapter", "()Ltyc;", "Lfzc;", "listener", "", "setOnScrollListener", "(Lfzc;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "Lu65;", "pager", "setPager", "(Lu65;)V", "", "threshold", "setThreshold", "(I)V", "viewResId", "setProgressView", "", "value", "setRefreshingNext", "(Z)V", "setRefreshingPrev", "g2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "Lvzc;", "refreshingNextDelegate", "Lvzc;", "getRefreshingNextDelegate", "()Lvzc;", "setRefreshingNextDelegate", "(Lvzc;)V", "k61", "t65", "r65", "lists_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEndlessRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndlessRecyclerView.kt\none/me/sdk/lists/widgets/EndlessRecyclerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,544:1\n1863#2,2:545\n*S KotlinDebug\n*F\n+ 1 EndlessRecyclerView.kt\none/me/sdk/lists/widgets/EndlessRecyclerView\n*L\n124#1:545,2\n*E\n"})
public class EndlessRecyclerView extends EmptyRecyclerView {
    public static final /* synthetic */ int h2 = 0;
    public final LinkedHashSet X1 = new LinkedHashSet();
    public final LinkedHashSet Y1 = new LinkedHashSet();
    public t65 Z1;
    public r65 a2;
    public boolean b2;
    public boolean c2;
    public int d2 = 1;
    public Integer e2;
    public tk3 f2;
    public boolean g2;

    public EndlessRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setOnScrollListener(new k61(3, this));
    }

    /* access modifiers changed from: private */
    public static final void setRefreshingNext$lambda$3(EndlessRecyclerView endlessRecyclerView) {
        r65 r65 = endlessRecyclerView.a2;
        if (r65 != null) {
            if (endlessRecyclerView.b2) {
                r65.a.e(r65.j() - 1, 1);
                return;
            }
            r65.m();
        }
    }

    public final void I0(tyc tyc) {
        this.a2 = tyc instanceof r65 ? (r65) tyc : null;
        H0();
    }

    public final tyc P0(tyc tyc) {
        if (tyc instanceof r65) {
            return tyc;
        }
        if (tyc != null) {
            return new r65(this, tyc);
        }
        return null;
    }

    public final int R0() {
        a layoutManager = getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i = staggeredGridLayoutManager.p;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < staggeredGridLayoutManager.p; i2++) {
                vie vie = staggeredGridLayoutManager.q[i2];
                boolean z = vie.f.w;
                ArrayList arrayList = vie.a;
                iArr[i2] = z ? vie.e(0, arrayList.size(), true, false) : vie.e(arrayList.size() - 1, -1, true, false);
            }
            return iArr[i - 1];
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).X0();
        } else {
            return 0;
        }
    }

    public final void S0(int i) {
        if (b0()) {
            if (i <= 5) {
                post(new l40(this, i, 9));
            }
        } else if (this.c2) {
            r65 r65 = this.a2;
            if (r65 != null) {
                r65.a.e(0, 1);
            }
        } else {
            r65 r652 = this.a2;
            if (r652 != null) {
                r652.a.f(0, 1);
            }
        }
    }

    public tyc getAdapter() {
        return this.a2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.g2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        a layoutManager = super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final vzc getRefreshingNextDelegate() {
        return null;
    }

    public final void j0() {
        Iterator it = this.Y1.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public final void m(fzc fzc) {
        this.X1.add(fzc);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            z68.f("EndlessRecyclerView", "onLayout", e);
        }
        t65 t65 = this.Z1;
        if (t65 != null) {
            t65.b(this, 0, 0);
        }
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.g2 = z;
    }

    public void setLayoutManager(a aVar) {
        if ((aVar instanceof LinearLayoutManager) || (aVar instanceof StaggeredGridLayoutManager)) {
            super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public void setOnScrollListener(fzc fzc) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(u65 u65) {
        if (u65 != null) {
            t65 t65 = new t65(this, u65);
            int i = this.d2;
            if (i > 0) {
                t65.b = i;
                m(t65);
                this.Z1 = t65;
                return;
            }
            throw new IllegalArgumentException(wj6.h(i, "illegal threshold: ").toString());
        }
        t65 t652 = this.Z1;
        if (t652 != null) {
            u0(t652);
            this.Z1 = null;
        }
    }

    public final void setProgressView(int i) {
        this.e2 = Integer.valueOf(i);
        this.f2 = null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRefreshingNext(boolean z) {
        if (this.b2 != z) {
            if (z && this.e2 == null) {
                z = false;
            }
            this.b2 = z;
            kne.K(this, new ne4(19, this));
        }
    }

    public final void setRefreshingNextDelegate(vzc vzc) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.c2 != z) {
            if (!z || this.e2 != null) {
                this.c2 = z;
            } else {
                this.c2 = false;
            }
            S0(0);
        }
    }

    public final void setThreshold(int i) {
        this.d2 = i;
        t65 t65 = this.Z1;
        if (t65 == null) {
            return;
        }
        if (i > 0) {
            t65.b = i;
            return;
        }
        throw new IllegalArgumentException(wj6.h(i, "illegal threshold: ").toString());
    }

    public final void u0(fzc fzc) {
        this.X1.remove(fzc);
    }
}
