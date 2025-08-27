package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Map;

/* renamed from: wd8  reason: default package */
public final /* synthetic */ class wd8 implements mja {
    public final /* synthetic */ ae8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tf8 c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Context v;

    public /* synthetic */ wd8(ae8 ae8, long j, tf8 tf8, boolean z, Context context) {
        this.a = ae8;
        this.b = j;
        this.c = tf8;
        this.o = z;
        this.v = context;
    }

    public final void c(yha yha) {
        float f;
        float f2;
        yha yha2 = yha;
        ae8 ae8 = this.a;
        ae8.getClass();
        ae8.a();
        long j = this.b;
        tf8 tf8 = this.c;
        boolean z = this.o;
        yd8 yd8 = new yd8(j, tf8, z);
        Map map = ae8.d;
        xd8 xd8 = (xd8) map.get(yd8);
        if (!yha.f()) {
            if (xd8 == null) {
                Context context = this.v;
                yha2.d(ae8.b(context, tf8, true, z).b);
                ae8.a();
                yd8 yd82 = new yd8(j, tf8, z);
                xd8 xd82 = (xd8) map.get(yd82);
                if (xd82 == null) {
                    Bitmap bitmap = ae8.b(context, tf8, true, z).a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    abf abf = ae8.f;
                    vk3 p = ((km3) abf.e.getValue()).p(j, false);
                    Bitmap a2 = yd0.a(abf.a, (yva) abf.c.getValue(), (r62) abf.d.getValue(), (ce0) abf.b.getValue(), p, (a32) null, (String) null, 1000, ((qjd) ((x23) abf.f.getValue())).p(), (lfd) abf.g.getValue());
                    int ordinal = tf8.ordinal();
                    if (ordinal == 0) {
                        f2 = 0.65f;
                        f = 2.63f;
                    } else if (ordinal == 1) {
                        f2 = 0.72f;
                        f = 2.59f;
                    } else {
                        throw new IllegalStateException("Wrong marker weight");
                    }
                    float f3 = (float) width;
                    float f4 = f2 * f3;
                    int width2 = (int) ((f4 / ((float) a2.getWidth())) * ((float) a2.getHeight()));
                    Bitmap e0 = o5a.e0((int) f4, width2, a2);
                    a2.recycle();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
                    canvas.drawBitmap(e0, (f3 / 2.0f) - (f4 / 2.0f), (((float) height) / f) - (((float) width2) / 2.0f), (Paint) null);
                    e0.recycle();
                    a2.recycle();
                    ae8.g.getClass();
                    xd82 = new xd8(createBitmap, v02.g(createBitmap));
                    map.put(yd82, xd82);
                }
                yha2.d(xd82.b);
            } else {
                yha2.d(xd8.b);
            }
        }
        yha.b();
    }
}
