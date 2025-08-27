package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: py6  reason: default package */
public final class py6 {
    public static final Rect b = new Rect(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE);
    public final bs6 a;

    public py6(bs6 bs6) {
        this.a = bs6;
    }

    public final void a(View view, Rect rect, Float f, Integer num) {
        View view2 = view;
        Path path = new Path();
        Path path2 = new Path();
        Rect rect2 = new Rect();
        RectF rectF = new RectF();
        Rect rect3 = new Rect();
        RectF rectF2 = new RectF();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (rect != null) {
            view.setBackground(new ny6(booleanRef, path2, fu4.k.f(view).c().d));
            float[] fArr = new float[8];
            float[] fArr2 = new float[8];
            float[] fArr3 = new float[8];
            if (f != null) {
                for (int i = 0; i < 8; i++) {
                    fArr[i] = f.floatValue();
                    if (i < 4) {
                        fArr2[i] = f.floatValue();
                    } else {
                        fArr3[i] = f.floatValue();
                    }
                }
            }
            ((ArrayList) this.a.c).add(new oy6(booleanRef, path2, path, rect2, rect, num, rect3, rectF, f, fArr, rectF2, view));
        }
    }
}
