package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.SurfaceTexture;
import android.util.SparseArray;
import android.view.Display;
import androidx.media3.transformer.ExportException;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.i0;
import com.my.tracker.obfuscated.l2;
import com.my.tracker.obfuscated.m0;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.q2;
import com.my.tracker.obfuscated.z2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jrf  reason: default package */
public final /* synthetic */ class jrf implements i08, pk3, p6f, za3, qk3, zi6, pcf, ice, ima, ia7, z2, SkuDetailsResponseListener, e0.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jrf() {
        this.a = 8;
        this.b = wyf.UPLOADING;
    }

    public void a(Object obj, Object obj2, Object obj3) {
        ((l2) this.b).b((q2) obj, (Boolean) obj2, (b3) obj3);
    }

    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((orf) obj2).d((ExportException) obj);
                return;
            default:
                ((fzf) obj2).a((bxf) obj);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r6v11, types: [wu9] */
    /* JADX WARNING: type inference failed for: r6v12, types: [k27] */
    /* JADX WARNING: type inference failed for: r6v13, types: [r64] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.a
            switch(r1) {
                case 8: goto L_0x012d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r23
            jk5 r1 = (defpackage.jk5) r1
            r2 = 0
            if (r1 == 0) goto L_0x0121
            java.util.List r3 = r1.b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0018
            goto L_0x0121
        L_0x0018:
            java.lang.Object r0 = r0.b
            k20 r0 = (defpackage.k20) r0
            j20 r4 = r0.k
            r5 = 1
            if (r4 == 0) goto L_0x0027
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            java.util.Iterator r6 = r3.iterator()
        L_0x002c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r6.next()
            hk5 r7 = (defpackage.hk5) r7
            int r8 = r7.a
            r9 = 2
            if (r8 != r9) goto L_0x002c
            goto L_0x003f
        L_0x003e:
            r7 = r2
        L_0x003f:
            if (r7 == 0) goto L_0x006c
            r64 r2 = new r64
            int r3 = r0.o
            int r5 = r0.p
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.j
            long r11 = r0.b
            long r13 = r0.a
            boolean r15 = r0.f
            zy r7 = r0.m
            int r6 = r0.d
            int r0 = r0.e
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x006c:
            java.util.Iterator r6 = r3.iterator()
        L_0x0070:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0081
            java.lang.Object r7 = r6.next()
            hk5 r7 = (defpackage.hk5) r7
            int r8 = r7.a
            if (r8 != r5) goto L_0x0070
            goto L_0x0082
        L_0x0081:
            r7 = r2
        L_0x0082:
            if (r7 == 0) goto L_0x00af
            k27 r2 = new k27
            int r3 = r0.o
            int r5 = r0.p
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.j
            long r11 = r0.b
            long r13 = r0.a
            boolean r15 = r0.f
            zy r7 = r0.m
            int r6 = r0.d
            int r0 = r0.e
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x00af:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00cd
            java.lang.Object r6 = r3.next()
            hk5 r6 = (defpackage.hk5) r6
            int r7 = r6.a
            r8 = 3
            if (r7 != r8) goto L_0x00b8
            r5.add(r6)
            goto L_0x00b8
        L_0x00cd:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00d4
            r5 = r2
        L_0x00d4:
            if (r5 == 0) goto L_0x0121
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = r5.size()
            r8.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r2.next()
            hk5 r3 = (defpackage.hk5) r3     // Catch:{ all -> 0x0100 }
            uu9 r5 = new uu9     // Catch:{ all -> 0x0100 }
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0100 }
            int r7 = r3.c     // Catch:{ all -> 0x0100 }
            int r9 = r3.d     // Catch:{ all -> 0x0100 }
            int r3 = r3.e     // Catch:{ all -> 0x0100 }
            r5.<init>(r6, r7, r9, r3)     // Catch:{ all -> 0x0100 }
            r8.add(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x0100:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0107:
            wu9 r2 = new wu9
            long r13 = r0.a
            zy r15 = r0.m
            java.lang.String r7 = r1.a
            long r9 = r0.j
            long r11 = r0.b
            int r1 = r0.o
            int r0 = r0.p
            r6 = r2
            r16 = r4
            r17 = r1
            r18 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18)
        L_0x0121:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r1 = "VideoRipper"
            java.lang.String r3 = "getVideoContent: processFetchResult for videoContent %s"
            defpackage.z68.c(r1, r3, r0)
            return r2
        L_0x012d:
            r1 = r23
            dzf r1 = (defpackage.dzf) r1
            r1.getClass()
            java.lang.String r2 = "SELECT * FROM uploads WHERE upload_status=?"
            r3 = 1
            d7d r2 = defpackage.d7d.a(r3, r2)
            java.lang.Object r0 = r0.b
            wyf r0 = (defpackage.wyf) r0
            int r0 = r0.a
            long r4 = (long) r0
            r2.k(r3, r4)
            azf r0 = new azf
            r3 = 1
            r0.<init>(r1, r2, r3)
            bi8 r1 = new bi8
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.apply(java.lang.Object):java.lang.Object");
    }

    public void b(pa3 pa3) {
        switch (this.a) {
            case 5:
                izf izf = (izf) this.b;
                izf.getClass();
                z68.c("izf", "clear: ", new Object[0]);
                synchronized (izf) {
                    izf.a.clear().f(((fzf) izf.b.getValue()).clear()).a();
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
            default:
                ((Map) ((kzf) this.b).b).clear();
                pa3.b();
                return;
        }
    }

    public void c(Display display) {
        f6g f6g = (f6g) this.b;
        if (display != null) {
            f6g.getClass();
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            f6g.i = refreshRate;
            f6g.j = (refreshRate * 80) / 100;
            return;
        }
        f6g.i = -9223372036854775807L;
        f6g.j = -9223372036854775807L;
    }

    public void h(pbe pbe) {
        int i;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 12:
                gdg gdg = (gdg) this.b;
                gdg.getClass();
                if (s9a.y == null) {
                    s9a.y = new s9a(21, (byte) 0);
                }
                s9a s9a = s9a.y;
                npg npg = new npg(gdg, pbe, false, 28);
                s9a.getClass();
                String str = gdg.a;
                if (str.length() == 0) {
                    new IllegalArgumentException("Video identifier cannot be empty");
                    npg.N();
                    return;
                }
                try {
                    p9a.h(str).f(new fdg(0, npg, new p9a(21)));
                    return;
                } catch (IOException e) {
                    npg.N();
                    e.printStackTrace();
                    return;
                }
            default:
                prg prg = (prg) this.b;
                prg.b.execute(new String[]{prg.a});
                SparseArray sparseArray = (SparseArray) prg.b.get();
                if (sparseArray != null && sparseArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray.keyAt(i2);
                        qrg qrg = (qrg) sparseArray.valueAt(i2);
                        da6 da6 = qrg.a;
                        if (da6 != null && (i = da6.e) > 0 && !(z = da6.f) && !(z2 = da6.g)) {
                            arrayList.add(new hk5(z ? 2 : z2 ? 1 : 3, -1, da6.c, i, qrg.b));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        pbe.onError(new FetcherException(4, "Can't find any link"));
                        return;
                    } else if (!pbe.f()) {
                        pbe.a(new jk5("YouTube", arrayList));
                        return;
                    } else {
                        return;
                    }
                } else if (!pbe.f()) {
                    pbe.onError(new FetcherException(4, "Can't get video link"));
                    return;
                } else {
                    return;
                }
        }
    }

    public void i(ja7 ja7) {
        esg esg = (esg) this.b;
        esg.getClass();
        try {
            ha7 e = ja7.e();
            if (e != null) {
                esg.b.g(e);
            }
        } catch (IllegalStateException e2) {
            e2.getMessage();
        }
    }

    public void invoke(Object obj) {
        lrf lrf = (lrf) this.b;
        c19 c19 = (c19) obj;
        lrf.t.getClass();
        yd5 a2 = lrf.q.a();
        String str = c19.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "onCompleted", (Throwable) null);
        }
        a19 a19 = c19.a;
        a19.f.set(a2);
        a19.g.set((Object) null);
        c19.a();
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        ((m0) this.b).c(billingResult, list);
    }

    public void q(Task task) {
        switch (this.a) {
            case 13:
                seg.b((Intent) this.b);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((nog) this.b).b.d((Object) null);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((ScheduledFuture) this.b).cancel(false);
                return;
            default:
                i0.b.a((i0.c) this.b, task);
                return;
        }
    }

    public /* synthetic */ jrf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(List list) {
        ((n0) this.b).b(list);
    }

    public /* synthetic */ jrf(VideoView videoView, SurfaceTexture surfaceTexture) {
        this.a = 11;
        this.b = videoView;
    }

    /* JADX INFO: finally extract failed */
    public Object a() {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                nbd nbd = (nbd) ((s23) obj);
                nbd.getClass();
                int i = w23.e;
                tgg tgg = new tgg(4);
                HashMap hashMap = new HashMap();
                SQLiteDatabase m = nbd.m();
                m.beginTransaction();
                try {
                    w23 w23 = (w23) nbd.m0(m.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new u00((Object) nbd, (Object) hashMap, (Object) tgg, 29));
                    m.setTransactionSuccessful();
                    return w23;
                } finally {
                    m.endTransaction();
                }
            case 3:
                nbd nbd2 = (nbd) ((g95) obj);
                long a2 = nbd2.b.a() - nbd2.o.d;
                SQLiteDatabase m2 = nbd2.m();
                m2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a2)};
                    nbd.m0(m2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new y3a(25, (Object) nbd2));
                    int delete = m2.delete("events", "timestamp_ms < ?", strArr);
                    m2.setTransactionSuccessful();
                    m2.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    m2.endTransaction();
                    throw th;
                }
            case 4:
                nbd nbd3 = (nbd) ((zyf) obj).i;
                SQLiteDatabase m3 = nbd3.m();
                m3.beginTransaction();
                try {
                    m3.compileStatement("DELETE FROM log_event_dropped").execute();
                    m3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + nbd3.b.a()).execute();
                    m3.setTransactionSuccessful();
                    return null;
                } finally {
                    m3.endTransaction();
                }
            default:
                zog zog = (zog) obj;
                for (tc0 a3 : (Iterable) ((nbd) zog.b).o(new qbb(22))) {
                    zog.c.a(a3, 1, false);
                }
                return null;
        }
    }
}
