package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.view.VelocityTracker;
import java.lang.annotation.Annotation;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dle  reason: default package */
public final /* synthetic */ class dle implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dle(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<gaf> cls = gaf.class;
        Class<Context> cls2 = Context.class;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                return wke.a.c();
            case 1:
                KProperty[] kPropertyArr2 = StartConversationScreen.E0;
                return new oo3(LazyKt.lazy(new dle(0)));
            case 2:
                KProperty[] kPropertyArr3 = StartConversationScreen.E0;
                wke wke = wke.a;
                return new rle(wke.getAccessor().h(cls), wke.getAccessor().h(cls2), wke.getAccessor().h(tld.class), (cp3) wke.getAccessor().g(cp3.class), wke.getAccessor().h(fd8.class), wke.getAccessor().h(qx2.class), wke.getAccessor().h(eu3.class), wke.c());
            case 3:
                KProperty[] kPropertyArr4 = StartConversationScreen.E0;
                return new wh0(yh0.a.getAccessor().h(wu3.class), true, (zp3) null, 46);
            case 4:
                return h8b.e;
            case 5:
                return new jbe(false);
            case 6:
                return new jbe(true);
            case 7:
                KProperty[] kPropertyArr5 = StickersSettingsScreen.w;
                return jgd.SETTINGS_STICKERS;
            case 8:
                KProperty[] kPropertyArr6 = StickersSettingsScreen.w;
                mue mue = mue.a;
                return new zue((Context) mue.getAccessor().g(cls2), (gaf) mue.getAccessor().g(cls), mue.getAccessor().h(moe.class), mue.getAccessor().h(gvc.class), mue.getAccessor().h(vi5.class), mue.getAccessor().h(ai5.class));
            case 9:
                return new g51();
            case 10:
                Map createMapBuilder = MapsKt.createMapBuilder();
                duc duc = new duc(12);
                qde qde = new qde();
                duc.invoke(qde);
                createMapBuilder.put(DiskReadViolation.class, new sxe(qde.a));
                duc duc2 = new duc(13);
                qde qde2 = new qde();
                duc2.invoke(qde2);
                createMapBuilder.put(UntaggedSocketViolation.class, new sxe(qde2.a));
                ArrayList arrayList = new ArrayList();
                arrayList.add(CollectionsKt.listOf("com.google.android.gms"));
                Unit unit = Unit.INSTANCE;
                createMapBuilder.put(CustomViolation.class, new sxe(arrayList));
                return MapsKt.build(createMapBuilder);
            case 11:
                qze[] values = qze.values();
                String[] strArr = {"updated", "removed", "cleared"};
                Annotation[][] annotationArr = {null, null, null};
                t75 t75 = new t75(values.length);
                int length = values.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    qze qze = values[i];
                    int i3 = i2 + 1;
                    String str = (String) ArraysKt.getOrNull((T[]) strArr, i2);
                    if (str == null) {
                        str = qze.name();
                    }
                    t75.j(str, false);
                    Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull((T[]) annotationArr, i2);
                    if (annotationArr2 != null) {
                        for (Annotation annotation : annotationArr2) {
                            int i4 = t75.d;
                            List[] listArr = t75.f;
                            List list = listArr[i4];
                            if (list == null) {
                                list = new ArrayList(1);
                                listArr[t75.d] = list;
                            }
                            list.add(annotation);
                        }
                    }
                    i++;
                    i2 = i3;
                }
                return new v75(values, t75);
            case 12:
                return VelocityTracker.obtain();
            case 13:
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Unit.INSTANCE;
            case 16:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable.setSize(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 31) * vo4.c().getDisplayMetrics().density));
                return gradientDrawable;
            case LangUtils.HASH_SEED /*17*/:
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable2.setSize(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 31) * vo4.c().getDisplayMetrics().density));
                return gradientDrawable2;
            case 18:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable3.setSize(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 31) * vo4.c().getDisplayMetrics().density));
                return gradientDrawable3;
            case 19:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable4.setSize(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 31) * vo4.c().getDisplayMetrics().density));
                return gradientDrawable4;
            case 20:
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setShape(1);
                float f = (float) 20;
                gradientDrawable5.setSize(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                return gradientDrawable5;
            case 21:
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setShape(1);
                float f2 = (float) 24;
                gradientDrawable6.setSize(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                return gradientDrawable6;
            case 22:
                return new sj5();
            case 23:
                return SetsKt.hashSetOf(o84.f0, vi4.f0, l9a.f0, hu6.f0, q09.f0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Looper.getMainLooper();
            case 25:
                return Looper.getMainLooper();
            case 26:
                return AsynchronousSocketChannel.open();
            case 27:
                return ym.e();
            case 28:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                return paint;
            default:
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setFilterBitmap(true);
                return paint2;
        }
    }
}
