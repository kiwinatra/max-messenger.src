package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: nj3  reason: default package */
public final class nj3 {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.PropertySet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == doc.PropertySet_android_alpha) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == doc.PropertySet_android_visibility) {
                int i2 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i2;
                this.a = pj3.d[i2];
            } else if (index == doc.PropertySet_visibilityMode) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == doc.PropertySet_motionProgress) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
