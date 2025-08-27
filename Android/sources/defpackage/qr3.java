package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Looper;
import android.text.BoringLayout;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.utils.context_actions.dialog.ContextActionsDialog;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qr3  reason: default package */
public final /* synthetic */ class qr3 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ qr3(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Object obj;
        MessageDigest messageDigest = null;
        switch (this.a) {
            case 0:
                return new nxb();
            case 1:
                return new swb();
            case 2:
                return Boolean.FALSE;
            case 3:
                String str = ContextActionsDialog.G1;
                return new cw3();
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return new igf(ewa.g);
            case 7:
                return new igf(ewa.h);
            case 8:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 9:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                z74.C0.getFontMetricsInt(metrics);
                return metrics;
            case 10:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get((Object) null);
                } catch (Throwable unused) {
                    return null;
                }
            case 11:
                return new Object();
            case 12:
                return Unit.INSTANCE;
            case 13:
                KProperty[] kPropertyArr = DialogNotificationsSettingsScreen.w;
                return new fo4();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Resources.getSystem();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return m5a.a(1, 1, cu0.b);
            case 16:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case LangUtils.HASH_SEED:
                return new qz4();
            case 18:
                return new Object();
            case 19:
                return Unit.INSTANCE;
            case 20:
                return ym.e();
            case 21:
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.m23constructorimpl(MessageDigest.getInstance("SHA-256"));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m29isFailureimpl(obj)) {
                    messageDigest = obj;
                }
                return messageDigest;
            case 22:
                KProperty[] kPropertyArr2 = EnterPinCodeScreen.v;
                return new o75();
            case 23:
                Duration.Companion companion3 = Duration.Companion;
                return Duration.m1351boximpl(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                int i = ExternalCallbackWidget.z0;
                return new ye5();
            case 25:
                int i2 = ExternalCallbackWidget.z0;
                te7 te7 = new te7();
                int roundToInt = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
                te7.setBounds(0, 0, roundToInt, roundToInt);
                return te7;
            case 26:
                KProperty[] kPropertyArr3 = hm5.f;
                return ys6.a;
            case 27:
                return new Paint(1);
            case 28:
                return new n04(vo4.c().getDisplayMetrics().density * 12.0f);
            default:
                return new WeakHashMap(1);
        }
    }
}
