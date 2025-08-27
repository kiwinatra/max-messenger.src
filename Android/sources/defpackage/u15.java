package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: u15  reason: default package */
public final class u15 implements ng4 {
    public final /* synthetic */ ju7 a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public u15(EmojiCompatInitializer emojiCompatInitializer, ju7 ju7) {
        this.b = emojiCompatInitializer;
        this.a = ju7;
    }

    public final void onResume(jv7 jv7) {
        this.b.getClass();
        ud3.a(Looper.getMainLooper()).postDelayed(new xvg(3), 500);
        this.a.b(this);
    }
}
