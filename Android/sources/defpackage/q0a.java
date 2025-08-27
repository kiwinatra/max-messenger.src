package defpackage;

import android.media.MediaCodecInfo;
import android.net.Uri;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import one.me.android.OneMeApplication;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.webrtc.Predicate;
import ru.ok.tamtam.nano.Protos;

/* renamed from: q0a  reason: default package */
public final /* synthetic */ class q0a implements zi6, sm0, qk3, nsb, MyTrackerConfig.OkHttpClientProvider, wv9, Predicate, yf5, zf5, bmf, Provider, knd {
    public final /* synthetic */ int a;

    public /* synthetic */ q0a(int i) {
        this.a = i;
    }

    public String a() {
        return null;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                Throwable th = (Throwable) obj;
                z68.e("b1a", "Can't hide controls");
                return;
            case 4:
                Throwable th2 = (Throwable) obj;
                z68.e("b1a", "Can't update seek");
                return;
            case 5:
                z68.f("g1a", "Can't setupUpdateAddress", (Throwable) obj);
                return;
            case 6:
                z68.f("g1a", "Can't setupLiveLocationUpdate", (Throwable) obj);
                return;
            case 9:
                z68.f("g1a", "Error in timer", (Throwable) obj);
                return;
            case 10:
                Throwable th3 = (Throwable) obj;
                z68.e("g1a", "Can't load initial live switch state");
                return;
            case 12:
                z68.f("k1a", "updateConstructosEnabled: exception", (Throwable) obj);
                return;
            case 13:
                z68.f("c2a", "Error in extractThumbnail", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z68.b("s3a", "onAudioButtonTouchEvent error", (Throwable) obj);
                return;
            default:
                Long l = (Long) obj;
                ConcurrentHashMap concurrentHashMap = d6b.b;
                return;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new u7b((Uri) obj, (Uri) obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: sf5[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.sf5[] c() {
        /*
            r2 = this;
            gla r2 = new gla
            r2.<init>()
            r0 = 1
            sf5[] r0 = new defpackage.sf5[r0]
            r1 = 0
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0a.c():sf5[]");
    }

    public Object get() {
        return null;
    }

    public rla getOkHttpClient() {
        return ((xpc) qra.a.getAccessor().g(xpc.class)).a;
    }

    public jnd j(int i) {
        KProperty[] kPropertyArr = OtherNotificationsSettingsScreen.w;
        return jnd.o;
    }

    public Object m(pf9 pf9) {
        int i;
        String str;
        T t;
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            Throwable th2 = th;
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th2);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        boolean z = false;
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th4);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 == 0) {
                    str = null;
                } else if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 99333) {
                        if (hashCode == 116079 && str.equals("url")) {
                            try {
                                t = ryg.g0(pf9);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = ytd.a.iterator();
                                while (it3.hasNext()) {
                                    ((xm) it3.next()).a(th6);
                                }
                                xtd.a.getClass();
                                int ordinal3 = xtd.b.ordinal();
                                if (ordinal3 == 0) {
                                    t = null;
                                } else if (ordinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                            if (t == null) {
                                return null;
                            }
                            objectRef.element = t;
                        }
                    } else if (str.equals("def")) {
                        try {
                            z = ryg.Y(pf9);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = ytd.a.iterator();
                            while (it4.hasNext()) {
                                ((xm) it4.next()).a(th8);
                            }
                            xtd.a.getClass();
                            int ordinal4 = xtd.b.ordinal();
                            if (ordinal4 == 0) {
                                z = false;
                            } else if (ordinal4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th8;
                            }
                        }
                    }
                } else if (str.equals("id")) {
                    try {
                        j = ryg.d0(pf9, 0);
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                        Iterator it5 = ytd.a.iterator();
                        while (it5.hasNext()) {
                            ((xm) it5.next()).a(th10);
                        }
                        xtd.a.getClass();
                        int ordinal5 = xtd.b.ordinal();
                        if (ordinal5 == 0) {
                            j = 0;
                        } else if (ordinal5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th10;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                try {
                    pf9.A();
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it6 = ytd.a.iterator();
                    while (it6.hasNext()) {
                        ((xm) it6.next()).a(th12);
                    }
                    xtd.a.getClass();
                    int ordinal6 = xtd.b.ordinal();
                    if (ordinal6 != 0) {
                        if (ordinal6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                }
            }
            pf9 pf92 = pf9;
        }
        return new p7a(j, (String) objectRef.element, Boolean.valueOf(z));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 11:
                return ((pf8) obj).a.a();
            case 16:
                i1a i1a = ((p1a) obj).c;
                if (i1a.f.W()) {
                    return true;
                }
                i1a.a.getClass();
                return false;
            default:
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                int i = yga.a;
                return true;
        }
    }

    public /* synthetic */ q0a(OneMeApplication oneMeApplication) {
        this.a = 27;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return jha.n((List) obj);
            case 1:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return uh8.a;
                }
                return nh8.e(list);
            case 7:
                return (List) obj;
            case 8:
                return Long.valueOf(((uc9) obj).b);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((rgf) obj).a.getText();
            case 19:
                Throwable th = (Throwable) obj;
                return CollectionsKt.emptyList();
            case 20:
                Throwable th2 = (Throwable) obj;
                mz4 mz4 = hga.d;
                return 0;
            default:
                Throwable th3 = (Throwable) obj;
                return CollectionsKt.emptyList();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: tf5[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tf5[] m1576c() {
        /*
            r2 = this;
            hla r2 = new hla
            r2.<init>()
            r0 = 1
            tf5[] r0 = new defpackage.tf5[r0]
            r1 = 0
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0a.m1576c():tf5[]");
    }
}
