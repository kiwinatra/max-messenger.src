package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.LogFactory;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.contacts.ContactController$ContactNotFoundException;

/* renamed from: dr1  reason: default package */
public final /* synthetic */ class dr1 implements eo1, zi6, ice, h08, lp8, gz8, mja, ri8, lbd, za3, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr1(long j, tc0 tc0) {
        this.a = 9;
        this.b = j;
        this.c = tc0;
    }

    public void accept(Object obj) {
        int i = VideoPlayerSeekBarPreview.C0;
        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) this.c;
        videoPlayerSeekBarPreview.getClass();
        Locale locale = Locale.ENGLISH;
        z68.f("ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview", "Can't extract frame millis = " + this.b, (Throwable) obj);
        jbd.c(videoPlayerSeekBarPreview.x);
        videoPlayerSeekBarPreview.c.a(false);
    }

    public Object apply(Object obj) {
        long j = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 1:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM chat_location WHERE end_time>? AND message_id IN (");
                List<Long> list = (List) obj2;
                int size = list == null ? 1 : list.size();
                n79.c(sb, size);
                sb.append(") ORDER BY message_time DESC");
                d7d a2 = d7d.a(size + 1, sb.toString());
                a2.k(1, j);
                int i = 2;
                if (list == null) {
                    a2.X(2);
                } else {
                    for (Long l : list) {
                        if (l == null) {
                            a2.X(i);
                        } else {
                            a2.k(i, l.longValue());
                        }
                        i++;
                    }
                }
                return new bi8(new gc2(jc2, a2, 3));
            case 3:
                Throwable th = (Throwable) obj;
                ir3 ir3 = (ir3) obj2;
                ir3.getClass();
                if (!(th instanceof ContactController$ContactNotFoundException)) {
                    return lbe.g(th);
                }
                long j2 = this.b;
                long[] jArr = {j2};
                fce U = ((jna) ir3.c).U(new np2(jArr), ir3.d);
                gcf gcf = ir3.e;
                gcf.getClass();
                return new wbe(new tbe(U.k(new ecf(gcf, 3, 0)).i(new ch2(12, jo3.class)), new ba(25, ir3, jArr), 1), new u52((Object) ir3, (Object) jArr, j2, 4), 0);
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                tc0 tc0 = (tc0) obj2;
                String str = tc0.a;
                tub tub = tc0.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(wub.a(tub))}) < 1) {
                    contentValues.put("backend_name", tc0.a);
                    contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(wub.a(tub)));
                    sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                return null;
        }
    }

    public void b(pa3 pa3) {
        izf izf = (izf) this.c;
        long j = this.b;
        izf.getClass();
        z68.c("izf", "removeUploadWithAttachId: attachId=" + j, new Object[0]);
        synchronized (izf) {
            izf.a.b(j).f(((fzf) izf.b.getValue()).b(j)).a();
        }
        if (!pa3.f()) {
            pa3.b();
        }
    }

    public void c(yha yha) {
        Bitmap bitmap;
        int i = 0;
        while (true) {
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.c;
            if (((float) i) >= rangeSeekBarView.K0 + 2.0f || yha.f()) {
                yha.b();
            } else {
                long j = (((long) i) * rangeSeekBarView.L0) + this.b;
                if (rangeSeekBarView.E0.get(j) == null) {
                    FrgTrimVideo frgTrimVideo = rangeSeekBarView.G0;
                    int i2 = rangeSeekBarView.J0;
                    if (frgTrimVideo.B1 == null) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        frgTrimVideo.B1 = mediaMetadataRetriever;
                        mediaMetadataRetriever.setDataSource(frgTrimVideo.O1(), frgTrimVideo.D1);
                    }
                    Bitmap frameAtTime = frgTrimVideo.B1.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j), 2);
                    if (frameAtTime == null) {
                        bitmap = null;
                    } else {
                        int min = Math.min(frameAtTime.getWidth(), frameAtTime.getHeight());
                        int width = (frameAtTime.getWidth() - min) / 2;
                        int height = (frameAtTime.getHeight() - min) / 2;
                        Rect rect = new Rect(width, height, width + min, min + height);
                        bitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(frameAtTime, rect.left, rect.top, rect.width(), rect.height()), i2, i2, true);
                    }
                    if (bitmap != null) {
                        yha.d(new v7b(Long.valueOf(j), bitmap));
                    }
                }
                i++;
            }
        }
        yha.b();
    }

    public void d(i67 i67, int i) {
        i67.X(((np8) this.c).c, i, this.b);
    }

    public void e(rh8 rh8) {
        zy zyVar;
        w0d w0d = (w0d) this.c;
        f4g f4g = w0d.e;
        if (f4g != null && (zyVar = ((ol0) f4g).f) != null) {
            ra7 d = ra7.d(Uri.parse((String) zyVar.w));
            d.l = new me6(w0d.e, this.b);
            i0 a2 = w0d.f.a(d.a(), (Object) null);
            w0d.h = a2;
            a2.m(new v0d(rh8), io1.a);
        } else if (!rh8.f()) {
            rh8.onError(new IllegalStateException("Video content or collage is null"));
        }
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        return yx8.q(cx8, tb7.t((ir8) this.c), 0, this.b);
    }

    public void h(pbe pbe) {
        ye2 ye2 = (ye2) this.c;
        ha9 r = ye2.r.r(this.b);
        if (r != null) {
            ye2.t.e(r);
            gb9 gb9 = ye2.u;
            gb9.getClass();
            pbe.a(gb9.a(gb9, r));
        }
    }

    public void invoke(Object obj) {
        iu8 iu8;
        sb5 sb5 = (sb5) obj;
        sb5.getClass();
        sb5.u();
        Object obj2 = this.c;
        z68.c("sb5", "videoDebugListener.onRenderedFirstFrame: output = %s renderTimeMs = %d", obj2 != null ? obj2.toString() : "", Long.valueOf(this.b));
        m48 m48 = sb5.w;
        if (m48 != null && (iu8 = m48.e) != null) {
            iu8.r();
        }
    }

    public Object r(do1 do1) {
        lr1 lr1 = (lr1) this.c;
        lr1.getClass();
        long j = this.b;
        lr1.p(new er1(j, do1));
        return "waitForSessionUpdateId:" + j;
    }

    public /* synthetic */ dr1(sd sdVar, Object obj, long j) {
        this.a = 4;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ dr1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
