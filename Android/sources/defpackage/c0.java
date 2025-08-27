package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.RecyclerAutofitGridView;

/* renamed from: c0  reason: default package */
public abstract class c0 extends FrameLayout implements u65, bif {
    public final RecyclerAutofitGridView a;
    public final View b = findViewById(lic.fl_empty_search);
    public final View c;
    public final View o = findViewById(lic.view_stickers__ll_search_hint);
    public final TextView v = ((TextView) findViewById(lic.view_stickers__tv_search_hint));
    public final ose w;
    public b0 x;
    public ise y;

    public c0(Context context, ose ose) {
        super(context);
        this.w = ose;
        View.inflate(getContext(), ujc.view_stickers_grid, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerAutofitGridView recyclerAutofitGridView = (RecyclerAutofitGridView) findViewById(lic.view_stickers__rv_showcase);
        this.a = recyclerAutofitGridView;
        recyclerAutofitGridView.setThreshold(10);
        this.a.setPager(this);
        this.a.setClipToPadding(false);
        this.a.setHasFixedSize(true);
        View findViewById = findViewById(lic.view_stickers__fl_empty_view);
        this.c = findViewById;
        findViewById.setVisibility(4);
    }

    public final boolean B() {
        return false;
    }

    public final void E0() {
    }

    public abstract void a();

    public final void c() {
        RecyclerAutofitGridView recyclerAutofitGridView = this.a;
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        f6e.C(recyclerAutofitGridView);
        int i = ujc.ll_stickers_progress;
        a0 a0Var = new a0(0, k0);
        recyclerAutofitGridView.e2 = Integer.valueOf(i);
        recyclerAutofitGridView.f2 = a0Var;
        this.o.setBackgroundColor(k0.n);
        this.v.setTextColor(k0.G);
        TextView textView = (TextView) findViewById(lic.fl_empty_search__tv);
        if (textView != null) {
            textView.setTextColor(k0.N);
        }
        findViewById(lic.view_stickers__fl_grid).setBackgroundColor(k0.n);
        ProgressBar progressBar = (ProgressBar) findViewById(lic.view_stickers__fl_empty_progress);
        if (progressBar != null) {
            iq.b0(progressBar, k0.l);
        }
    }

    public abstract int getCellHeight();

    public ose getType() {
        return this.w;
    }

    public int getVerticalOffset() {
        return this.a.computeVerticalScrollOffset();
    }

    public void setListener(b0 b0Var) {
        this.x = b0Var;
    }

    public void setSearchHintVisible(boolean z) {
        this.o.setVisibility(z ? 0 : 4);
    }

    public void setStickers(ise ise) {
        if (this.y != ise) {
            this.y = ise;
        }
    }
}
