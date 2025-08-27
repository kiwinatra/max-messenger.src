package defpackage;

import android.view.View;
import ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl;

/* renamed from: kr2  reason: default package */
public final /* synthetic */ class kr2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mqf b;
    public final /* synthetic */ View c;

    public /* synthetic */ kr2(mqf mqf, View view, int i) {
        this.a = i;
        this.b = mqf;
        this.c = view;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                mqf mqf = this.b;
                mqf.getClass();
                this.c.setVisibility(0);
                ((ChatTopPanelViewImpl) mqf.o).setVisibility(0);
                return;
            case 1:
                mqf mqf2 = this.b;
                mqf2.getClass();
                View view = this.c;
                view.setVisibility(8);
                view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                ((ChatTopPanelViewImpl) mqf2.o).setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                return;
            case 2:
                mqf mqf3 = this.b;
                mqf3.getClass();
                View view2 = this.c;
                view2.setVisibility(8);
                view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                ((ChatTopPanelViewImpl) mqf3.o).setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                return;
            default:
                mqf mqf4 = this.b;
                mqf4.getClass();
                this.c.setVisibility(0);
                ((ChatTopPanelViewImpl) mqf4.o).setVisibility(0);
                return;
        }
    }
}
