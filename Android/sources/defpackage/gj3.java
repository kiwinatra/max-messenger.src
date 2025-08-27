package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: gj3  reason: default package */
public final class gj3 {
    public final float a = Float.NaN;
    public final float b = Float.NaN;
    public final float c = Float.NaN;
    public final float d = Float.NaN;
    public final int e = -1;

    public gj3(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), doc.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == doc.Variant_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new pj3().d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == doc.Variant_region_heightLessThan) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == doc.Variant_region_heightMoreThan) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            } else if (index == doc.Variant_region_widthLessThan) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == doc.Variant_region_widthMoreThan) {
                this.a = obtainStyledAttributes.getDimension(index, this.a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
