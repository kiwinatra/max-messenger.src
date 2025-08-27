package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: n3b  reason: default package */
public class n3b extends WebView {
    public ValueCallback a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n3b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(new kx3(context, 0), (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
        b();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void b() {
        int i;
        int ordinal = fu4.k.e(getContext()).f().g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = fad.a;
                getContext().setTheme(i);
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        i = fad.b;
        getContext().setTheme(i);
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        return this.a;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        b();
        super.onConfigurationChanged(configuration);
    }

    public final void setFilePathCallback(ValueCallback<Uri[]> valueCallback) {
        this.a = valueCallback;
    }
}
