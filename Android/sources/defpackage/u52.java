package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: u52  reason: default package */
public final /* synthetic */ class u52 implements qk3, u2f, zi6, i08, eo1, ice, lp8, lbd, p6f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u52(wx5 wx5, u05 u05) {
        this.a = 6;
        this.b = wx5;
        this.o = u05;
        this.c = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
    }

    public Object a() {
        zyf zyf = (zyf) this.b;
        nbd nbd = (nbd) zyf.c;
        nbd.getClass();
        nbd.o(new dr1(zyf.g.a() + this.c, (tc0) this.o));
        return null;
    }

    public void accept(Object obj) {
        pf8 pf8;
        Object obj2 = this.o;
        long j = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                w62 w62 = (w62) obj;
                r62 r62 = (r62) obj3;
                r62.getClass();
                ha9 ha9 = (ha9) obj2;
                if (ha9 == null) {
                    w62.k0 = 0;
                    return;
                }
                ha9 k = ((fa9) r62.s.get()).k(j, w62.k0);
                if (k == null || ha9.o > k.o) {
                    w62.k0 = ha9.c;
                    return;
                }
                return;
            case 1:
                w62 w622 = (w62) obj;
                r62 r622 = (r62) obj3;
                r622.getClass();
                w622.f0 = (pt4) obj2;
                w622.g0 = j;
                w622.h0 = ((ltb) r622.n).a.m();
                return;
            case 3:
                nm3 nm3 = (nm3) obj;
                nm3.b = (String) obj3;
                nm3.c = (String) obj2;
                nm3.e = j;
                return;
            case 9:
                a32 a32 = (a32) obj2;
                ec2 ec2 = (ec2) obj;
                j18 j18 = (j18) obj3;
                j18.getClass();
                try {
                    j18.a();
                    pwe pwe = j18.B0;
                    long j2 = ec2.c;
                    pwe.getClass();
                    dc2 a2 = ec2.a();
                    a2.g = ((ltb) j18.X).a.m();
                    ec2 ec22 = new ec2(a2);
                    j18.z.e(ec22).a();
                    ha9 r = j18.Y.r(ec22.c);
                    j18.o.d(Long.valueOf(ec22.b));
                    if (r != null) {
                        z68.c("j18", "stopMyLocation chatId = %d", Long.valueOf(j));
                        ((jna) j18.v0).G(a32.b.a, r.c);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    z68.f("j18", "stopMyLocationSync: iterate failure!", th);
                    return;
                }
            case 10:
                ibf ibf = (ibf) obj;
                j18 j182 = (j18) obj3;
                j182.getClass();
                z68.c("j18", "Success send location", new Object[0]);
                qq3 qq3 = qq3.e;
                vy vyVar = new vy((s58) obj2);
                vyVar.b = ((ltb) j182.X).a.s();
                vyVar.c = j;
                vyVar.o = j182.C0.a();
                j182.c.d(vyVar.d());
                return;
            default:
                List list = (List) obj;
                g1a g1a = (g1a) obj3;
                g1a.getClass();
                z68.c("g1a", "Update track for message %d: track length = %d", Long.valueOf(j), Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    pf8 pf82 = (pf8) obj2;
                    if (it.hasNext()) {
                        qq3 qq32 = (qq3) it.next();
                        of8 of8 = new of8(qq32.c);
                        of8.b = qq32.a;
                        of8.j = qq32.b;
                        of8.k = pf82.k;
                        of8.c = j;
                        of8.l = qq32.d;
                        arrayList.add(new pf8(of8));
                    } else {
                        g1a.c.put(Long.valueOf(j), arrayList);
                        ((f3a) g1a.a).c0(arrayList, pf82.k);
                        w58 w58 = g1a.A0;
                        if (w58.o != -1 && (pf8 = (pf8) g1a.b.get(Long.valueOf(w58.h))) != null) {
                            g1a.F0.d(pf8);
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                ir3 ir3 = (ir3) this.b;
                ir3.b.b((jo3) obj, (long[]) this.o, 0);
                km3 km3 = ir3.a;
                km3.getClass();
                return new mka(1, new rj0(km3, this.c)).n(xfd.b());
            case 13:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                t78 t78 = (t78) this.o;
                String num = Integer.toString(t78.a);
                String str = (String) this.b;
                boolean booleanValue = ((Boolean) nbd.m0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num}), new qbb(23))).booleanValue();
                long j = this.c;
                int i = t78.a;
                if (!booleanValue) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j));
                    sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
                } else {
                    sQLiteDatabase.execSQL(wj6.j(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                }
                return null;
            default:
                List list = (List) obj;
                List list2 = (List) this.b;
                ArrayList arrayList = new ArrayList(list.size() + list2.size());
                arrayList.addAll(list2);
                arrayList.addAll(list);
                return new bre(this.c, (String) this.o, arrayList);
        }
    }

    public void d(i67 i67, int i) {
        np8 np8 = (np8) this.b;
        np8.getClass();
        i67 i672 = i67;
        int i2 = i;
        i672.j(np8.c, i2, ((ir8) this.o).d(true), this.c);
    }

    public Object get() {
        r62 r62 = (r62) this.b;
        long j = this.c;
        a32 G = r62.G(j);
        if (G == null) {
            z68.c("r62", "changeChatField: chat with id = " + j + " not found", new Object[0]);
            return null;
        }
        ((sk3) this.o).accept(G);
        n72 E = r62.E(j);
        m72 m72 = G.b;
        r62.c0(j, E != null ? new n72(E.b, m72) : new n72(j, m72));
        r62.p0((String) null, new w52(r62, j, G, false));
        ((a74) ((s74) r62.l.get())).b.g(G.a, m72);
        return G;
    }

    public void h(pbe pbe) {
        int i;
        boolean z;
        Bitmap bitmap;
        FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.b;
        id3 id3 = (id3) frgTrimVideo.p1.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(ym.v, Uri.parse((String) this.o));
        try {
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            z = true;
        } catch (Exception e) {
            z68.f("ru.ok.messages.media.trim.FrgTrimVideo", "Can't extract video rotation", e);
            z = false;
            i = 0;
        }
        long j = this.c;
        if (z) {
            hn4 n = ((qra) id3).n();
            Context O1 = frgTrimVideo.O1();
            n.getClass();
            Size k = hn4.k(O1);
            if (i == 0 || i == 180) {
                k = new Size(k.getHeight(), k.getWidth());
            }
            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j * 1000, 1, k.getWidth(), k.getHeight());
        } else {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
        }
        po5 p = ((qra) id3).p();
        p.getClass();
        String path = p.o((String) null, (String) null).getPath();
        o5a.b0(path, bitmap, 90);
        pbe.a(path);
    }

    public void invoke(Object obj) {
        ((ud) obj).e0((td) this.b, this.o, this.c);
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 6:
                wx5 wx5 = (wx5) this.b;
                wx5.getClass();
                wx5.b.execute(new sx5(wx5, do1, (u05) this.o, this.c, 0));
                return "startFocusAndMetering";
            default:
                zz7 zz7 = (zz7) this.b;
                hd8.N(zz7, do1);
                if (!zz7.isDone()) {
                    long j = this.c;
                    zz7.d(new rj6(((ScheduledExecutorService) this.o).schedule(new qj6(do1, zz7, j), j, TimeUnit.MILLISECONDS), 0), ryg.j());
                }
                return "TimeoutFuture[" + zz7 + "]";
        }
    }

    public /* synthetic */ u52(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.o = obj2;
    }

    public /* synthetic */ u52(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = j;
    }
}
