package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: rde  reason: default package */
public final class rde extends te8 {
    public final /* synthetic */ int i;

    public final float a(View view, ViewGroup viewGroup) {
        switch (this.i) {
            case 0:
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
            case 2:
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }
}
