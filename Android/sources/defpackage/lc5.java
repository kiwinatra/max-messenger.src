package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.b;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.folders.edit.FolderEditScreen;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.settings.FrgMediaSettings;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: lc5  reason: default package */
public final /* synthetic */ class lc5 implements i08, h08, dz, ln0, mn0, eo1, knd, v8, yi6, nf5, n7c, qk3, vla, mx3, psb, ice, mja, nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public long a(long j) {
        switch (this.a) {
            case 8:
                uq5 uq5 = (uq5) this.b;
                return t0g.k((j * ((long) uq5.f)) / 1000000, 0, uq5.k - 1);
            default:
                uq5 uq52 = (uq5) this.b;
                return v0g.k((j * ((long) uq52.f)) / 1000000, 0, uq52.k - 1);
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                JSONObject jSONObject = (JSONObject) obj;
                FrgGifsLoader frgGifsLoader = (FrgGifsLoader) obj2;
                frgGifsLoader.getClass();
                try {
                    frgGifsLoader.i3(jSONObject.getString("next"), FrgGifsLoader.m3(jSONObject));
                    return;
                } catch (JSONException e) {
                    z68.f("ru.ok.messages.stickers.FrgGifsLoader", "JSON parse failed", e);
                    return;
                }
            case 19:
                ((FrgMediaSettings) obj2).T2((mq4) obj);
                return;
            default:
                z68.h("o48", (Throwable) obj, "loadThumbnail: %d, thumbnailUri validate error", Long.valueOf(((o48) obj2).v.b));
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 13:
                kpf kpf = (kpf) obj;
                ((ud6) this.b).getClass();
                return kpf;
            default:
                lpf lpf = (lpf) obj;
                ((vd6) this.b).getClass();
                return lpf;
        }
    }

    public void b() {
        srd srd = ((FrgAttachPhoto) this.b).M1;
        if (srd != null) {
            jbd.c((or7) srd.o);
            for (pz a2 : (List) srd.b) {
                a2.a();
            }
        }
    }

    public void c(yha yha) {
        t38 t38 = (t38) this.b;
        f4g f4g = t38.e;
        if (f4g != null) {
            t38.h.setDataSource(f4g.h().getPath());
            try {
                t38.j = Long.parseLong(t38.h.extractMetadata(9));
            } catch (Exception e) {
                z68.f("t38", "Can'e extract duration", e);
                t38.j = ((ol0) t38.e).a;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < t38.i && !yha.f(); i++) {
                Bitmap scaledFrameAtTime = t38.h.getScaledFrameAtTime((t38.j / ((long) t38.i)) * ((long) i) * 1000, 2, t38.c, t38.d);
                if (!yha.f()) {
                    arrayList.add(scaledFrameAtTime);
                    yha.d(arrayList);
                }
            }
        } else if (!yha.f()) {
            yha.onError(new IllegalStateException("Video content can't be null"));
        }
    }

    public void d(String str, Throwable th) {
        z68.f(((y2) ((dn5) this.b).b.b).e, str, th);
    }

    public void h(pbe pbe) {
        ei7 ei7 = (ei7) this.b;
        ei7.getClass();
        ArrayList arrayList = new ArrayList();
        hk5 c = ei7.c("https://www.instagram.com/p/%s/", pbe);
        if (c == null) {
            c = ei7.c("https://www.instagram.com/p/%s/embed/", pbe);
        }
        if (c != null) {
            arrayList.add(c);
        }
        if (pbe.f()) {
            return;
        }
        if (arrayList.isEmpty()) {
            pbe.onError(new FetcherException(4, "Failed to fetch instagram video"));
        } else {
            pbe.a(new jk5("Instagram", arrayList));
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((sob) obj).b0(((nc5) this.b).a.V0);
                return;
            case 1:
                ((rob) obj).s((rp9) this.b);
                return;
            case 2:
                ((sob) obj).r0((sp9) this.b);
                return;
            case 3:
                ((rob) obj).o((gn4) this.b);
                return;
            case 4:
                ((sob) obj).x((v8g) this.b);
                return;
            default:
                ((c19) obj).getClass();
                ir8 ir8 = ((e05) ((f05) ((gd3) ((ni3) this.b).a).a.get(0)).a.get(0)).a;
                return;
        }
    }

    public jnd j(int i) {
        int i2 = ((lz7) ((FolderEditScreen) this.b).v.E(i)).i();
        if ((536870911 & i2) == 8) {
            return null;
        }
        return (536870912 & i2) != 0 ? jnd.a : (1073741824 & i2) != 0 ? jnd.b : (i2 & IntCompanionObject.MIN_VALUE) != 0 ? jnd.c : jnd.o;
    }

    public Object n(Task task) {
        Object obj;
        ((kwd) this.b).getClass();
        Class<IOException> cls = IOException.class;
        s7h s7h = (s7h) task;
        synchronized (s7h.a) {
            vzg.o("Task is not yet complete", s7h.c);
            if (s7h.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(s7h.f)) {
                Exception exc = s7h.f;
                if (exc == null) {
                    obj = s7h.e;
                } else {
                    throw new RuntimeException(exc);
                }
            } else {
                throw cls.cast(s7h.f);
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public void onActivityResult(Object obj) {
        FolderPageFragment folderPageFragment = (FolderPageFragment) this.b;
        v9f v9f = (v9f) obj;
        if (v9f instanceof u9f) {
            FolderPageViewModel i3 = folderPageFragment.i3();
            List list = ((u9f) v9f).a;
            z26 z26 = i3.p;
            if (!list.isEmpty() && (z26 instanceof z26)) {
                ev0.v(b0h.C(i3), ((osa) i3.j).b(), (f14) null, new k36(i3, z26, list, (Continuation) null), 2);
            }
        }
    }

    public Object r(do1 do1) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 10:
                wx5 wx5 = (wx5) obj;
                wx5.getClass();
                wx5.b.execute(new uo5(4, (Object) wx5, (Object) do1));
                return "triggerAePrecapture";
            default:
                fj fjVar = (fj) obj;
                fjVar.getClass();
                ryg.G().execute(new uo5(20, (Object) fjVar, (Object) do1));
                return fjVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    public boolean test(Object obj) {
        return ((Locale) obj).getLanguage().equals(((Locale) this.b).getLanguage());
    }

    public iog z(View view, iog iog) {
        int i;
        FrgLocalVideo frgLocalVideo = (FrgLocalVideo) this.b;
        b M1 = frgLocalVideo.M1();
        if (M1 == null) {
            i = 0;
        } else {
            int a2 = vo4.a(M1);
            if (M1 instanceof ActLocalMedias) {
                ActLocalMedias actLocalMedias = (ActLocalMedias) M1;
                e3a e3a = actLocalMedias.N0;
                if (e3a != null) {
                    i = actLocalMedias.J0.getContentHeight() + ((View) e3a.c).getHeight();
                } else {
                    i = actLocalMedias.J0.getContentHeight();
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(iog.b(), iog.d(), iog.c(), i);
        x2a x2a = frgLocalVideo.J1;
        if (x2a != null) {
            x2a.Z(rect);
        }
        return iog;
    }

    public /* synthetic */ lc5(ni3 ni3, hrf hrf) {
        this.a = 6;
        this.b = ni3;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m1526apply(Object obj) {
        return ((qx0) obj).a((Uri) this.b);
    }
}
