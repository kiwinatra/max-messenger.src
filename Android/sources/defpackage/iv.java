package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: iv  reason: default package */
public final class iv extends LayoutInflater {
    public static final String[] a = {"android.widget.", "android.webkit.", "android.app."};

    public iv(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new LayoutInflater(context);
    }

    public final View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = a;
        int i = 0;
        while (i < 3) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
