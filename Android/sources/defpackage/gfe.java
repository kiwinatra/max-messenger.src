package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gfe  reason: default package */
public final class gfe extends fzc {
    public boolean a = false;
    public final /* synthetic */ hfe b;

    public gfe(hfe hfe) {
        this.b = hfe;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
