package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;

/* renamed from: z2a  reason: default package */
public final class z2a extends q2 implements bif, f2a {
    public final yva o;
    public RecyclerView v;
    public ProgressBar w;
    public TextView x;
    public lf0 y;

    public z2a(Context context, ViewGroup viewGroup, yva yva) {
        super(context);
        this.o = yva;
        L(viewGroup, ujc.frg_live_location_settings);
    }

    public final void M() {
        this.v = (RecyclerView) ((View) this.c).findViewById(lic.frg_live_location_settings__rv_chats);
        this.w = (ProgressBar) ((View) this.c).findViewById(lic.frg_live_location_settings__pb_loading);
        this.x = (TextView) ((View) this.c).findViewById(lic.frg_live_location_settings__tv_empty);
        lf0 lf0 = new lf0(this.o, Collections.emptyList());
        this.y = lf0;
        lf0.x = this;
        this.v.setAdapter(lf0);
        this.v.setLayoutManager(new LinearLayoutManager(1, false));
        this.v.setHasFixedSize(true);
    }

    public final void Z(boolean z) {
        if (z) {
            this.w.setVisibility(0);
        } else {
            this.w.setVisibility(8);
        }
    }

    public final void a0(List list) {
        if (list.isEmpty()) {
            this.x.setVisibility(0);
            this.v.setVisibility(8);
            return;
        }
        lf0 lf0 = this.y;
        lf0.v = list;
        lf0.m();
        this.x.setVisibility(8);
        this.v.setVisibility(0);
    }

    public final void c() {
        Context context = ((View) this.c).getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        ((View) this.c).setBackgroundColor(k0.n);
        iq.b0(this.w, k0.l);
        this.x.setTextColor(k0.G);
    }
}
