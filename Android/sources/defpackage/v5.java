package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: v5  reason: default package */
public final class v5 extends CoordinatorLayout implements phf {
    public final /* synthetic */ ActChatPickerCompat J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5(ActChatPickerCompat actChatPickerCompat) {
        super(actChatPickerCompat, (AttributeSet) null);
        this.J0 = actChatPickerCompat;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(k2b.c().i);
        fu4.e(fu4.k.e(this.J0), this);
    }
}
