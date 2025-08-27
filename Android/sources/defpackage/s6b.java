package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: s6b  reason: default package */
public final class s6b extends xyc {
    public final int a;
    public final float b = 0.5f;
    public final float c = 0.5f;

    public s6b(int i) {
        this.a = i;
    }

    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        return new r6b(i, this, recyclerView, recyclerView.getContext());
    }
}
