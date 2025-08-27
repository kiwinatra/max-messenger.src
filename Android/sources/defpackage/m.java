package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.AppearanceSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m  reason: default package */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Object obj;
        Object obj2;
        pof pof = null;
        switch (this.a) {
            case 0:
                int i = AboutAppSettingsScreen.c;
                return new v();
            case 1:
                KProperty[] kPropertyArr = AddChatAdminsScreen.w0;
                return jgd.CHAT_INFO_ADD_ADMINISTRATOR;
            case 2:
                KProperty[] kPropertyArr2 = AddChatMembersScreen.Z;
                return jgd.CHAT_INFO_ADD_PARTICIPANTS;
            case 3:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 4:
                return new moc();
            case 5:
                return new Picture();
            case 6:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                return paint;
            case 7:
                try {
                    Result.Companion companion = Result.Companion;
                    kof kof = kof.a;
                    if (kof.b) {
                        kof = null;
                    }
                    obj = Result.m23constructorimpl(kof);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m29isFailureimpl(obj)) {
                    pof = obj;
                }
                return pof;
            case 8:
                lq lqVar = lq.a;
                try {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.m23constructorimpl(((kof) lq.d.getValue()) != null ? pof.a : null);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    obj2 = Result.m23constructorimpl(ResultKt.createFailure(th2));
                }
                if (!Result.m29isFailureimpl(obj2)) {
                    pof = obj2;
                }
                return pof;
            case 9:
                KProperty[] kPropertyArr3 = AppearanceSettingsScreen.y;
                return jgd.SETTINGS_CHAT_DECORATION;
            case 10:
                KProperty[] kPropertyArr4 = AppearanceSettingsScreen.y;
                er erVar = er.a;
                return new as(erVar.getAccessor().h(jtb.class), (ltb) erVar.getAccessor().g(ltb.class), erVar.getAccessor().h(Context.class), erVar.getAccessor().h(tcf.class), erVar.getAccessor().h(o82.class), erVar.getAccessor().h(gb9.class), erVar.getAccessor().h(km3.class), erVar.getAccessor().h(vj9.class), erVar.getAccessor().h(gaf.class));
            case 11:
                int i2 = AudioAttachView.I0;
                return ((qra) ym.e()).i();
            case 12:
                int i3 = AudioListenView.B0;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 12.0f);
                return gradientDrawable;
            case 13:
                return new te7();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new Path();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                float f = (float) 54;
                return new v3d(c44.DEFAULT_ASPECT_RATIO, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 12);
            case 16:
                return new Path();
            case LangUtils.HASH_SEED /*17*/:
                return new Path();
            case 18:
                KProperty[] kPropertyArr5 = wh0.X;
                return Boolean.FALSE;
            case 19:
                return new xqb(12);
            case 20:
                return new nxb();
            case 21:
                return new byte[17408];
            case 22:
                float f2 = vo4.c().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 23:
                return new Object();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return l2b.a;
            case 25:
                int i4 = v01.Q0;
                return -231920335;
            case 26:
                int i5 = z01.x0;
                return -231920335;
            case 27:
                float f3 = vo4.c().getDisplayMetrics().density * 40.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            case 28:
                return Boolean.valueOf(((vj5) ((uj5) oh1.a.getAccessor().h(uj5.class).getValue())).o());
            default:
                float f4 = vo4.c().getDisplayMetrics().density * 32.0f;
                return new float[]{f4, f4, f4, f4, f4, f4, f4, f4};
        }
    }
}
