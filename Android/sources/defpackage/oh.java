package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oh  reason: default package */
public abstract class oh extends fbf {
    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        float f;
        Object obj = (ei) rh.v.C(context, xmlResourceParser);
        if (!(obj instanceof zh) && StringsKt__StringsKt.startsWith$default((CharSequence) xmlResourceParser.getAttributeValue(i), '#', false, 2, (Object) null)) {
            obj = new zh(0);
        }
        if (obj instanceof zh) {
            return new zh(kr7.H(xmlResourceParser.getAttributeValue(i)));
        }
        if (obj instanceof ai) {
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            try {
                f = to4.a(context, attributeValue);
            } catch (NumberFormatException unused) {
                f = Float.parseFloat(attributeValue);
            }
            return new ai(f);
        } else if (obj instanceof bi) {
            return new bi(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        } else {
            if (obj instanceof ci) {
                return new ci(xmlResourceParser.getAttributeValue(i));
            }
            if (Intrinsics.areEqual(obj, (Object) di.a)) {
                throw new IllegalStateException(wj6.k("Undefined ", ((eh) this.b).a, " type"));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
