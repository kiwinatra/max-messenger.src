package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: fe  reason: default package */
public final class fe implements ha7 {
    public final Image a;
    public final wie[] b;
    public final cb0 c;

    public fe(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new wie[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new wie(2, (Object) planes[i]);
            }
        } else {
            this.b = new wie[0];
        }
        this.c = new cb0(a9f.b, image.getTimestamp(), 0, new Matrix());
    }

    public final Image a0() {
        return this.a;
    }

    public final void close() {
        this.a.close();
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final l97 getImageInfo() {
        return this.c;
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int n0() {
        return this.a.getFormat();
    }

    public final wie[] w() {
        return this.b;
    }
}
