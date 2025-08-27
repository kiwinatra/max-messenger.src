package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import java.lang.Thread;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.SettingsListScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: duc  reason: default package */
public final /* synthetic */ class duc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ duc(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj;
                k2b.getIcon().getClass();
                k2b.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 1:
                return n79.C(((TamErrorException) obj).a);
            case 2:
                ((w62) obj).h = null;
                return Unit.INSTANCE;
            case 3:
                return Integer.valueOf(((k2b) obj).getText().f);
            case 4:
                return Integer.valueOf(((k2b) obj).c().f);
            case 5:
                View view = new View((Context) obj);
                view.setId(cwa.J);
                view.setWillNotDraw(false);
                return view;
            case 6:
                return new k2g(0, ((k2b) obj).a().a(true).b.g);
            case 7:
                ActSettings.T(lic.setting_media_caching, (Context) obj, false);
                return Unit.INSTANCE;
            case 8:
                View view2 = (View) obj;
                KProperty[] kPropertyArr = SettingsListScreen.y0;
                z1e.b.W0().b(":invite/qr", (Bundle) null);
                return Unit.INSTANCE;
            case 9:
                return Boolean.valueOf(((vk3) obj).B());
            case 10:
                View view3 = (View) obj;
                KProperty[] kPropertyArr2 = StickersShowcaseScreen.Y;
                bve.b.W0().b(":stickers/settings", (Bundle) null);
                return Unit.INSTANCE;
            case 11:
                return Boolean.valueOf(!((boe) obj).Y);
            case 12:
                qde qde = (qde) obj;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ls7.class);
                qde.getClass();
                qde.b(JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getCanonicalName());
                qde.b("leakcanary.internal.LeakCanaryFileProvider");
                qde.a(Reflection.getOrCreateKotlinClass(m58.class), Reflection.getOrCreateKotlinClass(q8.class));
                qde.a(Reflection.getOrCreateKotlinClass(OneMeApplication.class), Reflection.getOrCreateKotlinClass(Typeface.class));
                return Unit.INSTANCE;
            case 13:
                qde qde2 = (qde) obj;
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(w28.class);
                qde2.getClass();
                qde2.b(JvmClassMappingKt.getJavaClass(orCreateKotlinClass2).getCanonicalName());
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                CharSequence charSequence = ((tze) obj).e;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((ald) obj).v;
            case 16:
                return ((er3) obj).a();
            case LangUtils.HASH_SEED /*17*/:
                CharSequence charSequence2 = ((tze) obj).e;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 18:
                ((k2b) obj).getText().getClass();
                return -16745729;
            case 19:
                z68.f("zc4", "error", (Throwable) obj);
                return Unit.INSTANCE;
            case 20:
                sdf sdf = (sdf) obj;
                return "t=" + sdf.a + ", c=" + sdf.b;
            case 21:
                return Integer.valueOf(((k2b) obj).getText().d);
            case 22:
                Thread.State state = (Thread.State) obj;
                return Long.valueOf(System.nanoTime());
            case 23:
                return Long.valueOf(((ha9) obj).m());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Long.valueOf(((ha9) obj).b);
            case 25:
                return ((ha9) obj).Y;
            case 26:
                return Long.valueOf(((b89) obj).a);
            case 27:
                return ((bj2) obj).a.toString();
            case 28:
                h9g h9g = new h9g((Context) obj);
                h9g.setVisibility(8);
                h9g.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                return h9g;
            default:
                k2b k2b2 = (k2b) obj;
                KProperty[] kPropertyArr3 = WebAppRootScreen.D0;
                k2b2.getIcon().getClass();
                k2b2.getIcon().getClass();
                return new k2g(-1, -16745729);
        }
    }
}
