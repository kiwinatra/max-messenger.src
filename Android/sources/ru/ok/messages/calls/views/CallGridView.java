package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator;

public class CallGridView extends FrameLayout implements h61, j61 {
    public static final /* synthetic */ int w0 = 0;
    public final ro4 a;
    public final i61 b;
    public u51 c;
    public int o = 4;
    public final dac v;
    public volatile List v0;
    public r61 w;
    public ScrollingPagerIndicator x;
    public int y;
    public sb0 z;

    /* JADX WARNING: type inference failed for: r7v3, types: [i61, android.view.View, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    public CallGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dac dac = new dac();
        this.v = dac;
        this.v0 = Collections.emptyList();
        getContext();
        this.a = ro4.b();
        ? recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.getContext();
        ro4 b2 = ro4.b();
        recyclerView.T1 = b2;
        recyclerView.U1 = b2.b;
        recyclerView.V1 = vo4.b((int) 150.0f);
        recyclerView.setClipToPadding(false);
        if (recyclerView.X1) {
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            int i = recyclerView.U1;
            recyclerView.setPadding(i, i, i, i);
        }
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 0);
        recyclerView.W1 = gridLayoutManager;
        gridLayoutManager.K = new d61(recyclerView, 1);
        recyclerView.setLayoutManager(recyclerView.W1);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setOverScrollMode(2);
        this.b = recyclerView;
        recyclerView.setBottomListener(new fm0(8));
        this.b.l(new q61(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.b, layoutParams);
        new l61(this).a(this.b);
        new yia(dac.i(100, TimeUnit.MILLISECONDS).s(xfd.a()), new p61(this), 3).s(qe.a()).a(new or7(new p61(this), new fm0(9), m58.e));
    }

    private List<ye1> getSortedParticipants() {
        this.b.getAdapterController();
        throw null;
    }

    public final void a() {
        u51 u51 = this.c;
        if (u51 != null) {
            u51.a();
        }
    }

    public int getCount() {
        return this.b.getCount();
    }

    public int getParticipantsCount() {
        return this.b.getCount();
    }

    public int getSpanCount() {
        return this.b.getSpanCount();
    }

    public void setAdapterListener(u51 u51) {
        this.c = u51;
    }

    public void setCallParticipants(List<ye1> list) {
        if (((LinearLayoutManager) this.b.getLayoutManager()) != null) {
            this.b.setCallParticipants(list);
            post(new b(22, (Object) this));
        }
    }

    public void setDebugMode(boolean z2) {
        this.b.setDebugMode(z2);
    }

    public void setFocusedItemsCount(int i) {
        this.o = i;
        sb0 sb0 = this.z;
        if (sb0 != null) {
            sb0.a = i;
        }
    }

    public void setListener(r61 r61) {
        this.w = r61;
    }

    public void setScrollingIndicatorMargin(int i) {
        this.y = i;
        ScrollingPagerIndicator scrollingPagerIndicator = this.x;
        if (scrollingPagerIndicator != null) {
            iq.O(scrollingPagerIndicator, i);
        }
    }

    public void setShowStatusView(boolean z2) {
        this.b.getAdapterController();
        throw null;
    }
}
