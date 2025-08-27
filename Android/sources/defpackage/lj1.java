package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lj1  reason: default package */
public final /* synthetic */ class lj1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ lj1(int i) {
        this.a = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                nj1 nj1 = CallServiceImpl.y;
                return (s61) m21.a.getAccessor().g(s61.class);
            case 1:
                float f = vo4.c().getDisplayMetrics().density * 40.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 2:
                return new Object();
            case 3:
                return new Object();
            case 4:
                return new xxc();
            case 5:
                int i = tl1.P0;
                return -231920335;
            case 6:
                return Boolean.valueOf(((vj5) ((uj5) oh1.a.getAccessor().h(uj5.class).getValue())).o());
            case 7:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(l2b.d.i);
                return shapeDrawable;
            case 8:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(l2b.d.d);
                return shapeDrawable2;
            case 9:
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-869546428);
                shapeDrawable3.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable3.getPaint().setStrokeWidth(vo4.c().getDisplayMetrics().density * 4.0f);
                shapeDrawable3.getPaint().setAntiAlias(true);
                return new InsetDrawable(shapeDrawable3, MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
            case 10:
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{l2b.d.d, 0, 0});
            case 11:
                float f2 = vo4.c().getDisplayMetrics().density * 20.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 12:
                return (x9b) m21.a.getAccessor().g(x9b.class);
            case 13:
                return new Object();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return m5a.a(1, 1, cu0.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new CopyOnWriteArraySet();
            case 16:
                return new CopyOnWriteArraySet();
            case LangUtils.HASH_SEED /*17*/:
                return CollectionsKt.listOf(":call-active", ":call-answer", ":call-user", ":call-chat", ":call-join-link");
            case 18:
                return Integer.valueOf(hfc.ic_call_16);
            case 19:
                return Integer.valueOf(hfc.ic_video_16);
            case 20:
                return new xz1();
            case 21:
                KProperty[] kPropertyArr = ChangeOwnerScreen.X;
                return jgd.CHAT_INFO_CHANGE_OWNER;
            case 22:
                KProperty[] kPropertyArr2 = ChangeOwnerScreen.X;
                return new i49((Function1) new gl1(2), (z9) null, 6);
            case 23:
                return new pg3(hra.R, new igf(jra.n), og3.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                KProperty[] kPropertyArr3 = ChatAdminsScreen.Z;
                return jgd.CHAT_INFO_ADMINISTRATORS;
            case 25:
                KProperty[] kPropertyArr4 = ChatAdminsScreen.Z;
                return Boolean.valueOf(((vj5) ((uj5) jxb.a.g().getValue())).p());
            case 26:
                KProperty[] kPropertyArr5 = ChatAdminsScreen.Z;
                return Long.valueOf(((qjd) ((x23) jxb.a.d().getValue())).s());
            case 27:
                return new sl4(jxb.a.getAccessor().h(rl.class));
            case 28:
                bzb bzb = bzb.a;
                return new dz2(bzb.getAccessor().h(dxa.class), bzb.getAccessor().h(m95.class));
            default:
                return (szb) bzb.a.getAccessor().g(szb.class);
        }
    }
}
