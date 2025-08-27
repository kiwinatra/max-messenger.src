package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import org.webrtc.MediaStreamTrack;

/* renamed from: loe  reason: default package */
public final /* synthetic */ class loe implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ moe b;

    public /* synthetic */ loe(moe moe, int i) {
        this.a = i;
        this.b = moe;
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [h20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [poe, java.lang.Object] */
    public final void run() {
        d7d d7d;
        String str;
        int i;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            default:
                moe moe = this.b;
                kse kse = (kse) ((Lazy) ((a74) ((s74) moe.d.get())).h.c).getValue();
                kse.getClass();
                d7d a2 = d7d.a(0, "SELECT * FROM stickers");
                i6d i6d = kse.a;
                i6d.b();
                Cursor o = i6d.o(a2, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "id");
                    int u2 = kne.u(o, "sticker_id");
                    int u3 = kne.u(o, "width");
                    int u4 = kne.u(o, "height");
                    int u5 = kne.u(o, "url");
                    int u6 = kne.u(o, "update_time");
                    int u7 = kne.u(o, "mp4_url");
                    int u8 = kne.u(o, "first_url");
                    int u9 = kne.u(o, "preview_url");
                    int u10 = kne.u(o, "tags");
                    int u11 = kne.u(o, "sticker_type");
                    int u12 = kne.u(o, "set_id");
                    int u13 = kne.u(o, "lottie_url");
                    d7d = a2;
                    try {
                        int u14 = kne.u(o, MediaStreamTrack.AUDIO_TRACK_KIND);
                        int u15 = kne.u(o, "author_type");
                        int i2 = u13;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            long j = o.getLong(u);
                            long j2 = o.getLong(u2);
                            int i3 = o.getInt(u3);
                            int i4 = o.getInt(u4);
                            String string = o.isNull(u5) ? null : o.getString(u5);
                            long j3 = o.getLong(u6);
                            String string2 = o.isNull(u7) ? null : o.getString(u7);
                            String string3 = o.isNull(u8) ? null : o.getString(u8);
                            String string4 = o.isNull(u9) ? null : o.getString(u9);
                            int i5 = u;
                            int i6 = u2;
                            int i7 = u3;
                            List y = StringsKt__StringsKt.split$default((CharSequence) o.isNull(u10) ? null : o.getString(u10), new String[]{","}, false, 0, 6, (Object) null);
                            int c = rae.c(o.getInt(u11));
                            long j4 = o.getLong(u12);
                            int i8 = i2;
                            if (o.isNull(i8)) {
                                i = u14;
                                str = null;
                            } else {
                                str = o.getString(i8);
                                i = u14;
                            }
                            int i9 = u15;
                            arrayList.add(new soe(j, j2, i3, i4, string, j3, string2, string3, string4, y, c, j4, str, o.getInt(i) != 0, rae.b(o.getInt(i9))));
                            i2 = i8;
                            u14 = i;
                            u15 = i9;
                            u = i5;
                            u2 = i6;
                            u3 = i7;
                        }
                        o.close();
                        d7d.o();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            soe soe = (soe) it.next();
                            ? obj = new Object();
                            obj.a = soe.a;
                            obj.b = soe.b;
                            obj.c = soe.c;
                            obj.d = soe.d;
                            obj.e = soe.e;
                            obj.f = soe.f;
                            obj.g = soe.g;
                            obj.h = soe.h;
                            obj.i = soe.i;
                            obj.j = soe.j;
                            obj.k = soe.k;
                            obj.l = soe.l;
                            obj.m = soe.m;
                            obj.n = soe.n;
                            obj.o = soe.o;
                            arrayList2.add(new qoe(obj));
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            qoe qoe = (qoe) it2.next();
                            ? obj2 = new Object();
                            obj2.a = qoe.c;
                            obj2.b = qoe.o;
                            obj2.c = qoe.v;
                            obj2.d = qoe.w;
                            obj2.e = qoe.x;
                            obj2.f = qoe.y;
                            obj2.g = qoe.z;
                            obj2.h = qoe.X;
                            obj2.n = qoe.Y;
                            obj2.i = qoe.Z;
                            obj2.k = qoe.v0;
                            obj2.o = qoe.w0;
                            obj2.l = qoe.x0;
                            obj2.m = qoe.y0;
                            boe b2 = obj2.b();
                            moe.a.put(Long.valueOf(b2.a), b2);
                        }
                        ConcurrentHashMap concurrentHashMap = moe.b;
                        synchronized (moe) {
                            try {
                                Object D = cjf.D(((po5) ((ln5) moe.f.get())).q());
                                if (D != null) {
                                    Map map = (Map) D;
                                    if (!map.isEmpty()) {
                                        concurrentHashMap.putAll(map);
                                    }
                                }
                            } catch (Exception e) {
                                z68.f("moe", "Failed to load initial showcase", e);
                                ((ltb) moe.e).a.k("user.stickersLastSync", 0L);
                            }
                        }
                        moe.m.d(moe.b.values());
                        return;
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        d7d.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d7d = a2;
                    o.close();
                    d7d.o();
                    throw th;
                }
        }
    }
}
