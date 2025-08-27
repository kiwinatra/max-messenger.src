package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.Ref;

/* renamed from: ny6  reason: default package */
public final class ny6 extends ColorDrawable {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ Path b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ny6(Ref.BooleanRef booleanRef, Path path, int i) {
        super(i);
        this.a = booleanRef;
        this.b = path;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        if (this.a.element) {
            canvas.clipOutPath(this.b);
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
