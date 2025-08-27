package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;

/* renamed from: gh  reason: default package */
public final class gh extends fbf {
    public static final gh v = new fbf(1, eh.INTERPOLATOR, new AccelerateDecelerateInterpolator());

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return AnimationUtils.loadInterpolator(context, attributeResourceValue);
        }
        throw new IllegalStateException("Can't parse interpolator");
    }
}
