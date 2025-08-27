package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;

/* renamed from: e46  reason: default package */
public final /* synthetic */ class e46 implements Runnable {
    public final /* synthetic */ FolderSettingsFragment a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ e46(FolderSettingsFragment folderSettingsFragment, int i, int i2, int i3) {
        this.a = folderSettingsFragment;
        this.b = i;
        this.c = i2;
        this.o = i3;
    }

    public final void run() {
        pzc M;
        FolderSettingsFragment folderSettingsFragment = this.a;
        Integer num = folderSettingsFragment.i3().n;
        if (num != null && (M = folderSettingsFragment.C1.d().M(num.intValue())) != null) {
            int size = (folderSettingsFragment.i3().p.size() * this.b) + this.c + this.o;
            m56 m56 = folderSettingsFragment.F1;
            if (m56 != null) {
                m56.b = true;
                View view = M.a;
                FolderTutorLayout folderTutorLayout = (FolderTutorLayout) m56.c;
                Rect c2 = rcg.c(view, folderTutorLayout);
                int a2 = vo4.a(view.getContext());
                int height = (folderTutorLayout.getHeight() - a2) - size;
                int i = c2.bottom;
                NestedScrollView nestedScrollView = (NestedScrollView) m56.e;
                if (i > height) {
                    nestedScrollView.setScrollY(((c2.bottom - height) - a2) + nestedScrollView.getScrollY());
                } else if (c2.top < a2) {
                    nestedScrollView.setScrollY((nestedScrollView.getScrollY() - (a2 - c2.top)) - MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
                }
                folderTutorLayout.x = true;
                folderTutorLayout.c.addRect(new RectF(rcg.c(view, folderTutorLayout)), Path.Direction.CCW);
                folderTutorLayout.invalidate();
            }
        }
    }
}
