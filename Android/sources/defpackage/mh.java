package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;

/* renamed from: mh  reason: default package */
public final class mh extends fbf {
    public static final mh v = new fbf(1, eh.REPEAT_MODE, 1);

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
    }
}
