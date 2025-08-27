package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a46  reason: default package */
public final /* synthetic */ class a46 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a46(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<qx2> cls = qx2.class;
        Class<gaf> cls2 = gaf.class;
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr = FoldersListScreen.x;
                return jgd.SETTINGS_FOLDERS;
            case 2:
                KProperty[] kPropertyArr2 = FoldersListScreen.x;
                return new w66();
            case 3:
                KProperty[] kPropertyArr3 = ForwardPickerScreen.I0;
                return l2b.a;
            case 4:
                KProperty[] kPropertyArr4 = ForwardPickerScreen.I0;
                ia6 ia6 = ia6.a;
                return new qa6(ia6.getAccessor().h(c48.class), ia6.getAccessor().h(jqg.class), ia6.getAccessor().h(cls), ia6.getAccessor().h(ar6.class));
            case 5:
                KProperty[] kPropertyArr5 = ForwardPickerScreen.I0;
                return jgd.CHAT_FORWARD;
            case 6:
                KProperty[] kPropertyArr6 = ForwardPickerScreen.I0;
                return Unit.INSTANCE;
            case 7:
                KProperty[] kPropertyArr7 = ForwardPickerScreen.I0;
                return new sr8((uq7) null, 15);
            case 8:
                return Unit.INSTANCE;
            case 9:
                ia6 ia62 = ia6.a;
                return new oz(ia62.getAccessor().h(fq.class), ia62.getAccessor().h(ghf.class), ia62.getAccessor().h(x23.class), ia62.getAccessor().h(cls2), ia62.getAccessor().h(Context.class), ia62.getAccessor().h(gb9.class), ia62.getAccessor().h(cls), ia62.getAccessor().h(bl3.class), ia62.getAccessor().h(yva.class));
            case 10:
                return Looper.getMainLooper().getThread();
            case 11:
                return new Regex("width=\"(\\d+)", RegexOption.MULTILINE);
            case 12:
                return new Regex("height=\"(\\d+)", RegexOption.MULTILINE);
            case 13:
                return new rta(f6e.a(uy4.b));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new rta(f6e.a(uy4.b));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED /*17*/:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return b0h.B();
            case 20:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 21:
                return new TextPaint();
            case 22:
                return Unit.INSTANCE;
            case 23:
                return new i97();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new jbe(false);
            case 25:
                return new jbe(true);
            case 26:
                KProperty[] kPropertyArr8 = InputNameScreen.z0;
                return jgd.AUTH_EMPTY_PROFILE;
            case 27:
                KProperty[] kPropertyArr9 = InputPhoneScreen.D0;
                return jgd.AUTH_PHONE_LOGIN;
            case 28:
                KProperty[] kPropertyArr10 = InputPhoneScreen.D0;
                n88 n88 = n88.a;
                n88.getClass();
                return new rh7(LazyKt.lazy(new ck7(15)), n88.getAccessor().h(cls2), n88.getAccessor().h(rh3.class));
            default:
                return new jbe(false);
        }
    }
}
