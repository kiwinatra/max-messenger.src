package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;

/* renamed from: nh  reason: default package */
public final class nh extends fbf {
    public static final nh v = new fbf(1, eh.START_OFFSET, 0L);

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i)));
    }
}
