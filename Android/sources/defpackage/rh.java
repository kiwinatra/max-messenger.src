package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: rh  reason: default package */
public final class rh extends fbf {
    public static final rh v = new fbf(1, eh.VALUE_TYPE, new ai(c44.DEFAULT_ASPECT_RATIO));

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        String str;
        Integer num;
        Iterator it = CollectionsKt.listOf(eh.VALUE_FROM, eh.VALUE_TO).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = (Integer) kr7.h(xmlResourceParser).get(((eh) it.next()).a);
            if (num != null) {
                break;
            }
        }
        if (num != null) {
            str = xmlResourceParser.getAttributeValue(num.intValue());
        }
        int parseInt = (str == null || !StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) ? Integer.parseInt(xmlResourceParser.getAttributeValue(i)) : 3;
        if (parseInt == 0) {
            return new ai(c44.DEFAULT_ASPECT_RATIO);
        }
        if (parseInt == 1) {
            return new bi(0);
        }
        if (parseInt == 2) {
            return new ci("");
        }
        if (parseInt == 3) {
            return new zh(0);
        }
        if (parseInt == 4) {
            return di.a;
        }
        throw new IllegalStateException(a81.m("unknown value type ", xmlResourceParser.getAttributeValue(i)));
    }
}
