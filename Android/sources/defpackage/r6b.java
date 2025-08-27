package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: r6b  reason: default package */
public final class r6b extends EdgeEffect {
    public ohe a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s6b c;
    public final /* synthetic */ RecyclerView d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r6b(int i, s6b s6b, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = s6b;
        this.d = recyclerView;
    }

    public final ohe a() {
        ohe ohe = new ohe(this.d, ohe.q);
        phe phe = new phe();
        phe.i = (double) c44.DEFAULT_ASPECT_RATIO;
        phe.a(1.0f);
        phe.b(200.0f);
        ohe.m = phe;
        return ohe;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        s6b s6b = this.c;
        float f2 = ((float) (i * s6b.a)) * f * s6b.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        ohe ohe = this.a;
        if (ohe != null) {
            ohe.b();
        }
    }

    public final boolean draw(Canvas canvas) {
        return false;
    }

    public final boolean isFinished() {
        ohe ohe = this.a;
        return ohe == null || !ohe.f;
    }

    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = ((float) ((this.b == 3 ? -1 : 1) * i)) * this.c.c;
        ohe ohe = this.a;
        if (ohe != null) {
            ohe.b();
        }
        ohe a2 = a();
        a2.a = f;
        a2.g();
        this.a = a2;
    }

    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() != c44.DEFAULT_ASPECT_RATIO) {
            ohe a2 = a();
            a2.g();
            this.a = a2;
        }
    }

    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
