package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l4e  reason: default package */
public final class l4e extends r4e {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public l4e(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    public final void a(Matrix matrix, h4e h4e, int i, Canvas canvas) {
        for (r4e a : this.c) {
            a.a(this.d, h4e, i, canvas);
        }
    }
}
