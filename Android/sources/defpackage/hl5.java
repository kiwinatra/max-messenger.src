package defpackage;

import android.graphics.Typeface;
import android.view.View;
import ru.ok.messages.media.attaches.FileAttachView;

/* renamed from: hl5  reason: default package */
public final /* synthetic */ class hl5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileAttachView b;

    public /* synthetic */ hl5(FileAttachView fileAttachView, int i) {
        this.a = i;
        this.b = fileAttachView;
    }

    public final void onClick(View view) {
        FileAttachView fileAttachView = this.b;
        switch (this.a) {
            case 0:
                FileAttachView.L(fileAttachView);
                return;
            default:
                Typeface typeface = FileAttachView.h1;
                fileAttachView.P(false, false);
                return;
        }
    }
}
