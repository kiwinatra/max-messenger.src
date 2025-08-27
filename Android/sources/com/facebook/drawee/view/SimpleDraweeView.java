package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

@Deprecated
public class SimpleDraweeView extends up6 {
    public static r2f z;
    public p0 y;

    public SimpleDraweeView(Context context) {
        super(context);
        l(context, (AttributeSet) null);
    }

    public p0 getControllerBuilder() {
        return this.y;
    }

    public final void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        int resourceId;
        try {
            tf6.P();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                cvg.p(z, "SimpleDraweeView was not initialized!");
                this.y = (p0) z.get();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qnc.SimpleDraweeView);
                if (obtainStyledAttributes.hasValue(qnc.SimpleDraweeView_actualImageUri)) {
                    m(Uri.parse(obtainStyledAttributes.getString(qnc.SimpleDraweeView_actualImageUri)));
                } else if (obtainStyledAttributes.hasValue(qnc.SimpleDraweeView_actualImageResource) && (resourceId = obtainStyledAttributes.getResourceId(qnc.SimpleDraweeView_actualImageResource, -1)) != -1) {
                    if (isInEditMode()) {
                        setImageResource(resourceId);
                    } else {
                        setActualImageResource(resourceId);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            tf6.P();
        } catch (Throwable th) {
            tf6.P();
            throw th;
        }
    }

    public final void m(Uri uri) {
        p0 p0Var = this.y;
        p0Var.d = null;
        knb knb = (knb) p0Var;
        knb.c(uri);
        knb.l = getController();
        setController(knb.a());
    }

    public void setActualImageResource(int i) {
        m(mzf.c(i));
    }

    public void setImageRequest(qa7 qa7) {
        p0 p0Var = this.y;
        p0Var.e = qa7;
        p0Var.l = getController();
        setController(p0Var.a());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        m(uri);
    }

    public void setImageURI(String str) {
        m(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(context, attributeSet);
    }
}
