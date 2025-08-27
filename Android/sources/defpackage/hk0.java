package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: hk0  reason: default package */
public abstract class hk0 implements bsb {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    public y33 a(Bitmap bitmap, ynb ynb) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        y33 c = ynb.c(width, height, config);
        try {
            d((Bitmap) c.e0(), bitmap);
            return c.m();
        } finally {
            y33.U(c);
        }
    }

    public void c(Bitmap bitmap) {
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) {
        Class<Bitmap> cls = Bitmap.class;
        if (!j4b.B || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
        } else {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", new Class[]{cls, cls});
                }
                b.invoke((Object) null, new Object[]{bitmap, bitmap2});
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        }
        c(bitmap);
    }

    public String getName() {
        return "Unknown postprocessor";
    }
}
