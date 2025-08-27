package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;

/* renamed from: lh  reason: default package */
public final class lh extends fbf {
    public static final lh v = new fbf(1, eh.REPEAT_COUNT, 0);

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
    }
}
