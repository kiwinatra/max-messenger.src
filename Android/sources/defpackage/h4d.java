package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: h4d  reason: default package */
public abstract class h4d {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, (vzg) null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, vzg vzg, boolean z, boolean z2) {
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        int i4 = i2;
        vzg vzg2 = vzg;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                Typeface typeface2 = (Typeface) iuf.b.c(iuf.d(resources, i, charSequence2, typedValue2.assetCookie, i4));
                if (typeface2 != null) {
                    if (vzg2 != null) {
                        new Handler(Looper.getMainLooper()).post(new ovb(12, vzg2, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            f96 A = hi7.A(resources.getXml(i), resources);
                            if (A != null) {
                                typeface = iuf.b(context, A, resources, i, charSequence2, typedValue2.assetCookie, i2, vzg, z);
                            } else if (vzg2 != null) {
                                vzg2.e(-3);
                            }
                        } else {
                            Typeface c2 = iuf.c(resources, i, charSequence2, typedValue2.assetCookie, i4);
                            if (vzg2 != null) {
                                if (c2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new ovb(12, vzg2, c2));
                                } else {
                                    vzg2.e(-3);
                                }
                            }
                            typeface = c2;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (vzg2 != null) {
                            vzg2.e(-3);
                        }
                    }
                }
            } else if (vzg2 != null) {
                vzg2.e(-3);
            }
            if (typeface != null || vzg2 != null || z2) {
                return typeface;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
