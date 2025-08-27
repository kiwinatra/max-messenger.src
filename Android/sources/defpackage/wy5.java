package defpackage;

import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: wy5  reason: default package */
public final /* synthetic */ class wy5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditFragment b;

    public /* synthetic */ wy5(FolderEditFragment folderEditFragment, int i) {
        this.a = i;
        this.b = folderEditFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                FolderEditFragment folderEditFragment = this.b;
                return new hr7(1, folderEditFragment.E2().getWindow().getDecorView(), folderEditFragment);
            case 1:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setStroke(MathKt.roundToInt(((float) 2) * this.b.R1().getDisplayMetrics().density), -16776961);
                gradientDrawable.setColor(0);
                return gradientDrawable;
            default:
                return ew3.b(this.b.G2(), nad.o0);
        }
    }
}
