package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.tamtam.nano.Protos;

/* renamed from: n77  reason: default package */
public final /* synthetic */ class n77 implements p77, psb, qk3, op7, zi6, nsb {
    public final /* synthetic */ int a;

    public /* synthetic */ n77(int i) {
        this.a = i;
    }

    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                z68.f("m5a", "capturePhoto: Can't get uri for photo", (Throwable) obj);
                return;
            case 4:
                j10 j10 = (j10) obj;
                j10.i = d20.o;
                j10.k = c44.DEFAULT_ASPECT_RATIO;
                j10.p = 0;
                j10.o = 0;
                return;
            case 9:
                z68.f("j18", "Can't handle LoginEvent", (Throwable) obj);
                return;
            case 10:
                z68.f("j18", "Can't handle chat", (Throwable) obj);
                return;
            case 12:
                z68.f("j18", "Can't handle MsgDeleteEvent", (Throwable) obj);
                return;
            case 13:
                z68.f("j18", "Can't handle message", (Throwable) obj);
                return;
            case 16:
                z68.f("j18", "Can't handle MsgGetEvent", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED /*17*/:
                z68.f("j18", "Can't invalidate", (Throwable) obj);
                return;
            case 18:
                z68.f("j18", "Can't send location", (Throwable) obj);
                return;
            case 19:
                z68.f("j18", "Can't notify chat", (Throwable) obj);
                return;
            case 21:
                z68.f("j18", "Can't handle contact location", (Throwable) obj);
                return;
            case 22:
                Throwable th = (Throwable) obj;
                z68.e("q18", "Error in timer");
                return;
            default:
                z68.f("t38", "Can't load frames", (Throwable) obj);
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m1527apply(Object obj) {
        qx0 qx0 = (qx0) obj;
        CancellationException cancellationException = ba7.l;
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [g98, java.lang.Object] */
    public Object parse(sp7 sp7) {
        switch (this.a) {
            case 3:
                return InternalIdResponse.parse(sp7);
            case 5:
                return JoinByLinkResponse.lambda$static$0(sp7);
            case 6:
                return sp7.I();
            case 7:
                return Boolean.valueOf(sp7.b0());
            default:
                ? obj = new Object();
                sp7.t();
                while (sp7.hasNext()) {
                    String name = sp7.name();
                    name.getClass();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1956766558:
                            if (name.equals("auth_token")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -22145738:
                            if (name.equals("session_key")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 115792:
                            if (name.equals("uid")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 438353305:
                            if (name.equals("session_secret_key")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1460528453:
                            if (name.equals("auth_hash")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1955725576:
                            if (name.equals("api_server")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            obj.d = sp7.I();
                            break;
                        case 1:
                            obj.b = sp7.I();
                            break;
                        case 2:
                            obj.a = sp7.I();
                            break;
                        case 3:
                            obj.c = sp7.I();
                            break;
                        case 4:
                            obj.f = sp7.I();
                            break;
                        case 5:
                            obj.e = sp7.I();
                            break;
                        default:
                            sp7.A();
                            break;
                    }
                }
                sp7.r();
                return obj;
        }
    }

    public boolean test(Object obj) {
        return !((Locale) obj).getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 11:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((a68) obj).c.entrySet();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return jha.n((Set) obj);
            case 20:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return uh8.a;
                }
                return nh8.e(list);
            case 23:
                Throwable th = (Throwable) obj;
                return CollectionsKt.emptyList();
            case 26:
                return obj.toString();
            case 28:
                return ((aac) obj).c;
            default:
                z68.f("fd8", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
        }
    }
}
