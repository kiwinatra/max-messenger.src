package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* renamed from: f25  reason: default package */
public final class f25 extends InputConnectionWrapper {
    public final TextView a;
    public final p9a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f25(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        p9a p9a = new p9a(11);
        int i = 0;
        this.a = textView;
        this.b = p9a;
        if (s15.p != null) {
            s15 a2 = s15.a();
            if (a2.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                o15 o15 = a2.e;
                o15.getClass();
                Bundle bundle = editorInfo.extras;
                zp9 zp9 = ((gq9) o15.c).a;
                int a3 = zp9.a(4);
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) zp9.d).getInt(a3 + zp9.a) : i);
                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((s15) o15.a).h);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return p9a.j(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return p9a.j(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
