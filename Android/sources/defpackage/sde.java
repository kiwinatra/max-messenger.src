package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: sde  reason: default package */
public final class sde extends b59 {
    public final /* synthetic */ int w = 1;

    public final float b(View view, ViewGroup viewGroup) {
        switch (this.w) {
            case 0:
                return view.getTranslationY() - ((float) viewGroup.getHeight());
            default:
                return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }
}
