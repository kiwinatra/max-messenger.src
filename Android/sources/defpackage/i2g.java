package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.BoringLayout;
import java.security.KeyStore;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.login.welcome.WelcomeScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: i2g  reason: default package */
public final /* synthetic */ class i2g implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ i2g(int i) {
        this.a = i;
    }

    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    z = cvg.D((String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.miui.ui.version.code"}));
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(z);
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 2:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                m3g.C0.getFontMetricsInt(metrics);
                return metrics;
            case 3:
                KProperty[] kPropertyArr = VideoMessageWidget.X;
                int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(roundToInt, roundToInt);
                return new InsetDrawable(gradientDrawable, roundToInt);
            case 4:
                return Unit.INSTANCE;
            case 5:
                return new jbe(false);
            case 6:
                return new jbe(true);
            case 7:
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                return instance;
            case 8:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case 9:
                KProperty[] kPropertyArr2 = WebAppRootScreen.D0;
                return jgd.MINIAPP;
            case 10:
                KProperty[] kPropertyArr3 = WelcomeScreen.X;
                return jgd.AUTH_SIGN_METHOD;
            default:
                KProperty[] kPropertyArr4 = WelcomeScreen.X;
                return h2g.a.c();
        }
    }
}
