package ru.ok.messages.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.Lazy;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

public class ConstructorsListView extends RelativeLayout {
    public final ro4 a = ro4.b();
    public final View b;
    public final EmptyRecyclerView c;
    public final lf0 o;
    public final ProgressBar v;
    public final ArrayList w;
    public zj3 x;

    public ConstructorsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        getContext();
        View.inflate(getContext(), ujc.view_constructors_list, this);
        this.b = findViewById(lic.view_constructor_list__rl_root);
        this.c = (EmptyRecyclerView) findViewById(lic.view_constructors_list__rv_constructors);
        ProgressBar progressBar = (ProgressBar) findViewById(lic.view_constructors_list__progress);
        this.v = progressBar;
        this.c.setEmptyView(progressBar);
        EmptyRecyclerView emptyRecyclerView = this.c;
        getContext();
        emptyRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        lf0 lf0 = new lf0(getContext(), arrayList, new ms1(22, this));
        this.o = lf0;
        this.c.setAdapter(lf0);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        f6e.C(this.c);
        iq.h(k0, this.v);
        float f = (float) this.a.d;
        this.b.setBackground(i8b.P(Integer.valueOf(k0.O), (Integer) null, (Integer) null, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}));
        ((ImageView) findViewById(lic.view_constructor_list__iv_toolbar_puller)).setColorFilter(j4b.l0(0.7f, k0.x));
        int i = k0.G;
        ((ImageView) findViewById(lic.view_constructor_list__iv_toolbar_image)).setColorFilter(i);
        ((TextView) findViewById(lic.view_constructor_list__tv_toolbar_title)).setTextColor(i);
    }

    public void setConstructorClickListener(zj3 zj3) {
        this.x = zj3;
    }
}
