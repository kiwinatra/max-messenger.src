package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: uv8  reason: default package */
public final class uv8 extends go {
    public ArrayList X;
    public tv8 Y;
    public RecyclerView Z;
    public boolean v0;
    public final sw8 w;
    public rw8 w0;
    public final av8 x;
    public final long x0;
    public final Context y;
    public long y0;
    public kw8 z = kw8.c;
    public final hy z0 = new hy(9, (Object) this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uv8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.zw8.a(r3, r0)
            int r0 = defpackage.zw8.b(r3)
            r2.<init>(r3, r0)
            kw8 r3 = defpackage.kw8.c
            r2.z = r3
            hy r3 = new hy
            r0 = 9
            r3.<init>((int) r0, (java.lang.Object) r2)
            r2.z0 = r3
            android.content.Context r3 = r2.getContext()
            sw8 r0 = defpackage.sw8.d(r3)
            r2.w = r0
            av8 r0 = new av8
            r1 = 3
            r0.<init>(r2, r1)
            r2.x = r0
            r2.y = r3
            android.content.res.Resources r3 = r3.getResources()
            int r0 = defpackage.yic.mr_update_routes_delay_ms
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.x0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.w0 == null && this.v0) {
            this.w.getClass();
            sw8.b();
            ow8 c = sw8.c();
            ArrayList arrayList = new ArrayList(c == null ? Collections.emptyList() : c.g);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                rw8 rw8 = (rw8) arrayList.get(i);
                if (rw8.d() || !rw8.g || !rw8.h(this.z)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, cx4.o);
            long uptimeMillis = SystemClock.uptimeMillis() - this.y0;
            long j = this.x0;
            if (uptimeMillis >= j) {
                this.y0 = SystemClock.uptimeMillis();
                this.X.clear();
                this.X.addAll(arrayList);
                this.Y.E();
                return;
            }
            hy hyVar = this.z0;
            hyVar.removeMessages(1);
            hyVar.sendMessageAtTime(hyVar.obtainMessage(1, arrayList), this.y0 + j);
        }
    }

    public final void h(kw8 kw8) {
        if (kw8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.z.equals(kw8)) {
            this.z = kw8;
            if (this.v0) {
                sw8 sw8 = this.w;
                av8 av8 = this.x;
                sw8.f(av8);
                sw8.a(kw8, av8, 1);
            }
            g();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0 = true;
        this.w.a(this.z, this.x, 1);
        g();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(njc.mr_picker_dialog);
        Context context = this.y;
        int i = zw8.a;
        getWindow().getDecorView().setBackgroundColor(fw3.a(context, zw8.i(context) ? qdc.mr_dynamic_dialog_background_light : qdc.mr_dynamic_dialog_background_dark));
        this.X = new ArrayList();
        ((ImageButton) findViewById(ufc.mr_picker_close_button)).setOnClickListener(new wld(6, this));
        this.Y = new tv8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(ufc.mr_picker_list);
        this.Z = recyclerView;
        recyclerView.setAdapter(this.Y);
        this.Z.setLayoutManager(new LinearLayoutManager());
        int i2 = -1;
        int t = !context.getResources().getBoolean(idc.is_tablet) ? -1 : b0h.t(context);
        if (context.getResources().getBoolean(idc.is_tablet)) {
            i2 = -2;
        }
        getWindow().setLayout(t, i2);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0 = false;
        this.w.f(this.x);
        this.z0.removeMessages(1);
    }
}
