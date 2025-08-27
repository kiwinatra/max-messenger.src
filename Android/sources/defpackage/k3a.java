package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.widget.ImageView;
import kotlin.math.MathKt;

/* renamed from: k3a  reason: default package */
public final /* synthetic */ class k3a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3a b;

    public /* synthetic */ k3a(s3a s3a, int i) {
        this.a = i;
        this.b = s3a;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.N(new l3a(3));
                return;
            case 1:
                this.b.N(new l3a(2));
                return;
            case 2:
                s3a s3a = this.b;
                ce ceVar = s3a.M0;
                ceVar.j();
                ceVar.a(MathKt.roundToInt(((float) 62) * vo4.c().getDisplayMetrics().density), 0);
                ImageView imageView = s3a.x0;
                ImageView imageView2 = s3a.w0;
                imageView.setVisibility(4);
                imageView2.setVisibility(0);
                return;
            case 3:
                s3a s3a2 = this.b;
                int selectionStart = s3a2.X.getSelectionStart();
                int selectionEnd = s3a2.X.getSelectionEnd();
                Editable text = s3a2.X.getText();
                if ((selectionStart < 0 || selectionEnd < 0) && text != null) {
                    Selection.setSelection(text, text.length());
                }
                s3a2.X.setCursorVisible(true);
                return;
            case 4:
                this.b.N(new l3a(4));
                return;
            case 5:
                this.b.N(new k2a(28));
                return;
            case 6:
                this.b.N(new k2a(28));
                return;
            case 7:
                this.b.N(new k2a(25));
                return;
            case 8:
                this.b.N(new l3a(0));
                return;
            case 9:
                this.b.N(new l3a(1));
                return;
            default:
                this.b.N(new k2a(27));
                return;
        }
    }
}
