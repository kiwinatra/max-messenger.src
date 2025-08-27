package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import kotlin.text.StringsKt;

/* renamed from: fh  reason: default package */
public final class fh extends fbf {
    public static final fh v = new fbf(1, eh.DURATION, 300L);

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        Long longOrNull = StringsKt.toLongOrNull(xmlResourceParser.getAttributeValue(i));
        return Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0);
    }
}
