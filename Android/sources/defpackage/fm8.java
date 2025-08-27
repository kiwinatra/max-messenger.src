package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fm8  reason: default package */
public final class fm8 extends c5d {
    public final /* synthetic */ int b;

    public /* synthetic */ fm8(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r9v21, types: [uy7, java.lang.Object] */
    public final Object b(q4 q4Var) {
        switch (this.b) {
            case 0:
                return new xf4();
            case 1:
                return new et4((Context) q4Var.g(Context.class), (u74) q4Var.g(bje.class), (bx0) q4Var.g(tae.class), (g74) q4Var.g(xf4.class), ((aua) q4Var.g(aua.class)).b());
            case 2:
                return new tae(new File(tr1.j(((Context) q4Var.g(Context.class)).getCacheDir().getAbsolutePath(), "/media")), new qs7(MapsKt.mapOf(TuplesKt.to(jr8.w, 524288000L), TuplesKt.to(jr8.c, 52428800L))), (u74) q4Var.g(bje.class), false);
            case 3:
                return new SQLiteOpenHelper(((Context) q4Var.g(Context.class)).getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
            case 4:
                return new t39((sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class));
            case 5:
                return new gh4(q4Var.h(ptb.class), q4Var.h(x23.class), q4Var.h(ttb.class));
            case 6:
                return new ak9(q4Var);
            case 7:
                return new sq6(0);
            case 8:
                return new ap9(q4Var.h(gaf.class), q4Var.h(jqg.class), q4Var.h(ej9.class), q4Var.h(ar6.class));
            case 9:
                return (np9) q4Var.g(bbf.class);
            case 10:
                return new ara((gaf) q4Var.g(gaf.class), q4Var.h(gk.class));
            case 11:
                return new uqa(q4Var.h(cjd.class));
            case 12:
                return new utc((Context) q4Var.g(Context.class));
            case 13:
                return new jwa((Context) q4Var.g(Context.class), q4Var.h(jtb.class), q4Var.h(po5.class), q4Var.h(eta.class), q4Var.h(jca.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new Object();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new eta((Context) q4Var.g(Context.class), (ed4) q4Var.g(ed4.class));
            case 16:
                return new gj(new aj(), (Context) q4Var.g(Context.class));
            case LangUtils.HASH_SEED /*17*/:
                ? obj = new Object();
                obj.a = "https";
                obj.b = "max";
                obj.c = "api.oneme.ru";
                obj.d = "443";
                obj.e = "max.ru";
                obj.f = "api-test.oneme.ru";
                obj.g = "api-tg.oneme.ru";
                obj.h = "api";
                obj.i = "chat";
                obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.l = "joincall";
                obj.m = "u";
                obj.n = "stickerset";
                obj.o = "startapp";
                obj.p = ":folder";
                return new fz7(obj);
            case 18:
                return new bva((Context) q4Var.g(Context.class), q4Var.h(cm.class));
            case 19:
                return new mpa(q4Var);
            case 20:
                return new bmb((sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class));
            case 21:
                return new cdd(q4Var.h(to9.class), q4Var.h(i4g.class), q4Var.h(gaf.class));
            case 22:
                return new k73((sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class), q4Var.h(c48.class));
            case 23:
                return new r1c((sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new qwb(q4Var);
            case 25:
                return new lb((gaf) q4Var.g(gaf.class), q4Var.h(eu3.class), q4Var.h(ns3.class), q4Var.h(x23.class), q4Var.h(rtb.class), q4Var.h(tld.class));
            case 26:
                return new rwb(q4Var);
            case 27:
                return new szb((sv0) q4Var.g(sv0.class), q4Var.h(gaf.class));
            case 28:
                return new yd9((Context) q4Var.g(Context.class), q4Var.h(u25.class), q4Var.h(gk.class), (fn4) q4Var.g(fn4.class), xdc.onechat_react_text_size_small);
            default:
                return new zqc((Context) q4Var.g(Context.class));
        }
    }
}
