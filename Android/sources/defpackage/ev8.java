package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ev8  reason: default package */
public final class ev8 extends go {
    public ArrayList X;
    public dv8 Y;
    public ListView Z;
    public boolean v0;
    public final sw8 w = sw8.d(getContext());
    public long w0;
    public final av8 x = new av8(this, 1);
    public final hy x0 = new hy(8, (Object) this);
    public TextView y;
    public kw8 z = kw8.c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ev8(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = defpackage.zw8.a(r2, r0)
            int r0 = defpackage.zw8.b(r2)
            r1.<init>(r2, r0)
            kw8 r2 = defpackage.kw8.c
            r1.z = r2
            hy r2 = new hy
            r0 = 8
            r2.<init>((int) r0, (java.lang.Object) r1)
            r1.x0 = r2
            android.content.Context r2 = r1.getContext()
            sw8 r2 = defpackage.sw8.d(r2)
            r1.w = r2
            av8 r2 = new av8
            r0 = 1
            r2.<init>(r1, r0)
            r1.x = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.v0) {
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
            Collections.sort(arrayList, cx4.c);
            if (SystemClock.uptimeMillis() - this.w0 >= 300) {
                this.w0 = SystemClock.uptimeMillis();
                this.X.clear();
                this.X.addAll(arrayList);
                this.Y.notifyDataSetChanged();
                return;
            }
            hy hyVar = this.x0;
            hyVar.removeMessages(1);
            hyVar.sendMessageAtTime(hyVar.obtainMessage(1, arrayList), this.w0 + 300);
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
        setContentView(njc.mr_chooser_dialog);
        this.X = new ArrayList();
        this.Y = new dv8(getContext(), this.X);
        ListView listView = (ListView) findViewById(ufc.mr_chooser_list);
        this.Z = listView;
        listView.setAdapter(this.Y);
        this.Z.setOnItemClickListener(this.Y);
        this.Z.setEmptyView(findViewById(16908292));
        this.y = (TextView) findViewById(ufc.mr_chooser_title);
        getWindow().setLayout(b0h.t(getContext()), -2);
    }

    public final void onDetachedFromWindow() {
        this.v0 = false;
        this.w.f(this.x);
        this.x0.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void setTitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }

    public final void setTitle(int i) {
        this.y.setText(i);
    }
}
