package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.TamAlertDialogLayout;
import com.google.android.material.chip.Chip;
import ru.ok.messages.suggests.SuggestsView;

/* renamed from: a42  reason: default package */
public final class a42 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a42(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                if (outline != null) {
                    b42 b42 = (b42) this.b;
                    outline.setRoundRect(0, 0, b42.getWidth(), b42.getHeight(), vo4.c().getDisplayMetrics().density * 12.0f);
                    return;
                }
                return;
            case 1:
                rz2 rz2 = ((Chip) this.b).v;
                if (rz2 != null) {
                    rz2.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
            case 2:
                r53 r53 = (r53) this.b;
                outline.setOval(0, 0, r53.getWidth(), r53.getHeight());
                return;
            case 3:
                if (outline != null) {
                    ex3 ex3 = (ex3) this.b;
                    outline.setRoundRect(ex3.getLeft(), ex3.getTop(), ex3.getRight(), ex3.getBottom(), ex3.a);
                    return;
                }
                return;
            case 4:
                if (outline != null) {
                    ImageView imageView = (ImageView) this.b;
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                    return;
                }
                return;
            case 5:
                if (outline != null) {
                    SuggestsView suggestsView = (SuggestsView) this.b;
                    int left = suggestsView.getLeft();
                    int top = suggestsView.getTop();
                    int right = suggestsView.getRight();
                    int bottom = suggestsView.getBottom();
                    int i = suggestsView.E0;
                    outline.setRoundRect(left, top, right, bottom + i, (float) i);
                    return;
                }
                return;
            default:
                if (outline != null) {
                    TamAlertDialogLayout tamAlertDialogLayout = (TamAlertDialogLayout) this.b;
                    outline.setRoundRect(tamAlertDialogLayout.getLeft(), tamAlertDialogLayout.getTop(), tamAlertDialogLayout.getRight(), tamAlertDialogLayout.getBottom(), vo4.c().getDisplayMetrics().density * 16.0f);
                    return;
                }
                return;
        }
    }
}
