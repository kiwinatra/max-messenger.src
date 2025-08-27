package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: ni3  reason: default package */
public final class ni3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ni3(Lazy lazy, bud bud) {
        this.a = bud;
        this.b = lazy;
        this.e = new AtomicInteger(0);
        this.f = new AtomicReference(mi3.a);
        this.c = LazyKt.lazy(new oq2(24));
        this.d = LazyKt.lazy(new nm1(13, this));
    }

    public x90 a() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((xjf) this.c) == null) {
            str = tr1.j(str, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            str = tr1.j(str, " bitrate");
        }
        if (((Integer) this.e) == null) {
            str = tr1.j(str, " sampleRate");
        }
        if (((Integer) this.f) == null) {
            str = tr1.j(str, " channelCount");
        }
        if (str.isEmpty()) {
            String str2 = (String) this.a;
            int intValue = ((Integer) this.b).intValue();
            x90 x90 = new x90(str2, intValue, (xjf) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue());
            if (!Objects.equals(str2, "audio/mp4a-latm") || intValue != -1) {
                return x90;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b() {
        z68.c("ni3", "capturePhoto", new Object[0]);
        me meVar = (me) ((ggd) this.d);
        meVar.getClass();
        Uri insert = ((ContentResolver) meVar.f.getValue()).insert(MediaStore.Images.Media.getContentUri("external_primary"), meVar.c(Environment.DIRECTORY_PICTURES, meVar.b(false), sq9.IMAGE_JPEG));
        this.f = insert;
        FrgBase frgBase = (FrgBase) this.a;
        if (insert == null) {
            z68.f("ni3", "capturePhoto: failed to capture photo", (Throwable) null);
            hi7.a0(qad.n0, frgBase.O1());
            return;
        }
        try {
            m5a.k(frgBase, ((sjd) ((z9f) this.c)).z(), (Uri) this.f, ((qra) ((id3) frgBase.p1.b)).p());
        } catch (ActivityNotFoundException e2) {
            z68.f("ni3", "capturePhoto: failed to capture photo", e2);
            hi7.a0(qad.n0, frgBase.O1());
        }
    }

    public void c() {
        z68.c("ni3", "captureVideo", new Object[0]);
        me meVar = (me) ((ggd) this.d);
        meVar.getClass();
        Uri insert = ((ContentResolver) meVar.f.getValue()).insert(MediaStore.Video.Media.getContentUri("external_primary"), meVar.c(Environment.DIRECTORY_MOVIES, meVar.a(), sq9.VIDEO_MP4));
        this.f = insert;
        FrgBase frgBase = (FrgBase) this.a;
        if (insert == null) {
            z68.f("ni3", "aptureVideo: failed to capture video", (Throwable) null);
            hi7.a0(qad.n0, frgBase.O1());
            return;
        }
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("output", insert);
            if (!ym.v.c().c.u()) {
                intent.addFlags(65536);
            }
            frgBase.S2(intent, 99, (Bundle) null);
        } catch (ActivityNotFoundException e2) {
            z68.f("ni3", "captureVideo: failed to capture video, e: " + e2.toString(), (Throwable) null);
            hi7.a0(qad.n0, frgBase.O1());
        }
    }

    public void d(Uri uri, boolean z) {
        i7g i7g;
        Uri uri2 = uri == null ? (Uri) this.f : uri;
        uk2 uk2 = (uk2) this.e;
        FrgBase frgBase = (FrgBase) this.a;
        h48 h48 = (h48) this.b;
        if (z) {
            try {
                i7g = ((wj0) ((ou8) ((sjd) ((z9f) this.c)).getAccessor().g(ou8.class))).d(uri2.toString());
            } catch (Exception e2) {
                z68.f("ni3", "onVideoSelected: failed to get video thumbnail", e2);
                i7g = null;
            }
            uri2.getPath();
            String uri3 = i7g != null ? i7g.a : uri2.toString();
            String uri4 = uri2.toString();
            o9a o9a = sq9.b;
            d48 d48 = new d48(3, (long) uri2.toString().hashCode(), uri4, uri3, 0, 0, "video/mp4", 0, (Uri) null);
            h48.f.u(d48);
            z38 a2 = a48.a();
            a2.d = "SELECTED_MEDIA_ALBUM";
            a2.f = h48.f.c() - 1;
            a2.e = uri2.toString();
            a2.i = true;
            ActLocalMedias.g0(frgBase.X2(), d48, (o5h) null, a2, uk2);
            return;
        }
        uri2.getPath();
        String uri5 = uri2.toString();
        String path = uri2.getPath();
        long hashCode = (long) uri2.hashCode();
        o9a o9a2 = sq9.b;
        d48 d482 = new d48(1, hashCode, uri5, path, 0, 0, "image/jpeg", 0, (Uri) null);
        int u = h48.f.u(d482);
        z38 a3 = a48.a();
        a3.d = "SELECTED_MEDIA_ALBUM";
        a3.f = u;
        a3.e = uri2.getPath();
        a3.i = true;
        ActLocalMedias.g0(frgBase.X2(), d482, (o5h) null, a3, uk2);
    }

    public synchronized void e(hrf hrf) {
        try {
            n79.n(((AtomicInteger) this.e).getAndDecrement() > 0);
            yy a2 = ((hrf) this.f).a();
            if (!v0g.a(hrf.b, ((hrf) this.d).b)) {
                a2.b(hrf.b);
            }
            if (!v0g.a(hrf.c, ((hrf) this.d).c)) {
                a2.c(hrf.c);
            }
            int i = hrf.a;
            hrf hrf2 = (hrf) this.d;
            if (i != hrf2.a) {
                a2.a = i;
            }
            int i2 = hrf.d;
            if (i2 != hrf2.d) {
                a2.b = i2;
            }
            hrf a3 = a2.a();
            this.f = a3;
            if (((AtomicInteger) this.e).get() == 0 && !((hrf) this.d).equals((hrf) this.f)) {
                ((k7f) ((iw6) this.c)).d(new bk4(27, this, a3));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public ni3(ppb ppb, zvd zvd, pob pob, tb7 tb7, Bundle bundle, iwd iwd) {
        this.a = ppb;
        this.b = zvd;
        this.c = pob;
        this.d = tb7;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = iwd;
    }
}
