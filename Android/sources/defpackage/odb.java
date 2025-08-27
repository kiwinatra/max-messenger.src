package defpackage;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: odb  reason: default package */
public final class odb implements i6g {
    public final Object a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Object i;

    public odb(int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.b = z;
        this.a = new Matrix();
    }

    public SurfaceTextureHelper.FrameGeometry a(Matrix matrix, int i2, int i3) {
        Matrix matrix2;
        SurfaceTextureHelper.FrameGeometry frameGeometry = (SurfaceTextureHelper.FrameGeometry) this.i;
        Matrix matrix3 = (Matrix) this.a;
        if (frameGeometry != null && frameGeometry.width == i2 && frameGeometry.height == i3 && Intrinsics.areEqual((Object) matrix3, (Object) matrix)) {
            return frameGeometry;
        }
        boolean z = this.b;
        int i4 = this.e;
        int i5 = this.c;
        int i6 = this.d;
        int i7 = this.f;
        if (z) {
            Matrix matrix4 = new Matrix(matrix);
            float f2 = (float) i2;
            float f3 = (float) i3;
            matrix4.postTranslate(((float) i5) / f2, ((float) (i3 - (i6 + i7))) / f3);
            matrix4.postScale(((float) i4) / f2, ((float) i7) / f3);
            matrix2 = matrix4;
        } else {
            Matrix matrix5 = new Matrix();
            float f4 = (float) i2;
            float f5 = (float) i3;
            matrix5.preTranslate(((float) i5) / f4, ((float) (i3 - (i6 + i7))) / f5);
            matrix5.preScale(((float) i4) / f4, ((float) i7) / f5);
            Matrix matrix6 = new Matrix(matrix);
            matrix6.preConcat(matrix5);
            matrix2 = matrix6;
        }
        SurfaceTextureHelper.FrameGeometry frameGeometry2 = new SurfaceTextureHelper.FrameGeometry(i2, i3, this.g, this.h, matrix2);
        matrix3.set(matrix);
        this.i = frameGeometry2;
        return frameGeometry2;
    }

    public odb(int i2) {
        switch (i2) {
            case 1:
                this.i = new l8b();
                this.a = new int[256];
                return;
            default:
                this.i = new g1g(3, false);
                this.a = new int[256];
                return;
        }
    }
}
