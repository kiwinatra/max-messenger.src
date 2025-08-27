package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import ru.ok.messages.settings.view.ThemePreviewView;

/* renamed from: whf  reason: default package */
public final class whf extends bj0 {
    public final /* synthetic */ scf b;
    public final /* synthetic */ ef9 c;
    public final /* synthetic */ ThemePreviewView d;

    public whf(ThemePreviewView themePreviewView, scf scf, ef9 ef9) {
        this.d = themePreviewView;
        this.b = scf;
        this.c = ef9;
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        Bitmap underlyingBitmap;
        if ((k97 instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) k97).getUnderlyingBitmap()) != null) {
            int[] iArr = nf0.a;
            boolean z = false;
            y7b y7b = (y7b) new x7b(underlyingBitmap).a().v;
            int i = y7b != null ? y7b.d : 0;
            float[] fArr = new float[3];
            ThreadLocal threadLocal = w53.a;
            w53.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
            if (fArr[2] < 0.6f) {
                z = true;
            }
            int i2 = ThemePreviewView.z;
            this.d.d(this.b, z, this.c);
        }
    }
}
