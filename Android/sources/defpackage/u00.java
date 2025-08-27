package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.video.widgets.FloatingVideoView;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* renamed from: u00  reason: default package */
public final /* synthetic */ class u00 implements ice, s21, vu, qk3, p6f, eo1, StatsObserver, spc, mze, dsg, r8f, u2f, mja, lp8, i08, hy8, uu, xr5, y3f, lbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u00(iy8 iy8, yvd yvd, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 17;
        this.b = iy8;
        this.c = bundle;
        this.o = resultReceiver;
    }

    public Object a() {
        ci4 ci4 = (ci4) this.b;
        nbd nbd = (nbd) ci4.d;
        nbd.getClass();
        tc0 tc0 = (tc0) this.c;
        tub tub = tc0.c;
        ua0 ua0 = (ua0) this.o;
        String str = ua0.a;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(tub);
        }
        ((Long) nbd.o(new u00((Object) nbd, (Object) ua0, (Object) tc0, 27))).getClass();
        ci4.a.a(tc0, 1, false);
        return null;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                w62 w62 = (w62) obj;
                ((r62) this.b).getClass();
                Set set = (Set) this.c;
                y62 a2 = r62.M(w62, set).a();
                a2.o = (f72) this.o;
                r62.l0(w62, set, a2.a());
                return;
            default:
                u7b u7b = (u7b) obj;
                z0a z0a = (z0a) this.b;
                z0a.getClass();
                Uri uri = (Uri) u7b.a;
                Uri uri2 = (Uri) u7b.b;
                if (uri2.equals(Uri.EMPTY)) {
                    uri2 = null;
                }
                ((ActLocalMedias) z0a.b).f0(uri, (File) this.c, uri2, (File) this.o, (d44) null);
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v3, types: [kq9, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0078 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r2 = "bytes"
            java.lang.String r3 = "PRAGMA page_size"
            java.lang.String r4 = "PRAGMA page_count"
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            t78 r9 = defpackage.t78.CACHE_FULL
            r10 = 2
            java.lang.Object r11 = r0.o
            java.lang.Object r12 = r0.c
            r13 = 0
            java.lang.Object r14 = r0.b
            r15 = 1
            int r0 = r0.a
            switch(r0) {
                case 27: goto L_0x025a;
                case 28: goto L_0x0142;
                default: goto L_0x001c;
            }
        L_0x001c:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            nbd r14 = (defpackage.nbd) r14
            r14.getClass()
        L_0x0025:
            boolean r1 = r0.moveToNext()
            r2 = r12
            java.util.Map r2 = (java.util.Map) r2
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = r0.getString(r13)
            int r13 = r0.getInt(r15)
            t78 r16 = defpackage.t78.REASON_UNKNOWN
            if (r13 != 0) goto L_0x003d
        L_0x003a:
            r5 = r16
            goto L_0x0066
        L_0x003d:
            if (r13 != r15) goto L_0x0042
            t78 r16 = defpackage.t78.MESSAGE_TOO_OLD
            goto L_0x003a
        L_0x0042:
            if (r13 != r10) goto L_0x0046
            r5 = r9
            goto L_0x0066
        L_0x0046:
            if (r13 != r8) goto L_0x004b
            t78 r16 = defpackage.t78.PAYLOAD_TOO_BIG
            goto L_0x003a
        L_0x004b:
            if (r13 != r7) goto L_0x0050
            t78 r16 = defpackage.t78.MAX_RETRIES_REACHED
            goto L_0x003a
        L_0x0050:
            if (r13 != r6) goto L_0x0055
            t78 r16 = defpackage.t78.INVALID_PAYLOD
            goto L_0x003a
        L_0x0055:
            if (r13 != r5) goto L_0x005a
            t78 r16 = defpackage.t78.SERVER_ERROR
            goto L_0x003a
        L_0x005a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "SQLiteEventStore"
            java.lang.String r6 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            defpackage.y64.q(r13, r5, r6)
            goto L_0x003a
        L_0x0066:
            long r7 = r0.getLong(r10)
            boolean r16 = r2.containsKey(r1)
            if (r16 != 0) goto L_0x0078
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.put(r1, r6)
        L_0x0078:
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            u78 r2 = new u78
            r2.<init>(r7, r5)
            r1.add(r2)
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r13 = 0
            goto L_0x0025
        L_0x008c:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0094:
            boolean r1 = r0.hasNext()
            r2 = r11
            tgg r2 = (defpackage.tgg) r2
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r5 = defpackage.z78.c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            z78 r6 = new z78
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r6.<init>(r5, r1)
            java.lang.Object r1 = r2.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r6)
            goto L_0x0094
        L_0x00c7:
            lzf r0 = r14.b
            long r0 = r0.a()
            android.database.sqlite.SQLiteDatabase r5 = r14.m()
            r5.beginTransaction()
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x013d }
            java.lang.String r7 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r6 = r5.rawQuery(r7, r6)     // Catch:{ all -> 0x013d }
            f1a r7 = new f1a     // Catch:{ all -> 0x013d }
            r7.<init>(r0, r15)     // Catch:{ all -> 0x013d }
            java.lang.Object r0 = defpackage.nbd.m0(r6, r7)     // Catch:{ all -> 0x013d }
            wjf r0 = (defpackage.wjf) r0     // Catch:{ all -> 0x013d }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x013d }
            r5.endTransaction()
            r2.b = r0
            android.database.sqlite.SQLiteDatabase r0 = r14.m()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r4)
            long r0 = r0.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r4 = r14.m()
            android.database.sqlite.SQLiteStatement r3 = r4.compileStatement(r3)
            long r3 = r3.simpleQueryForLong()
            long r3 = r3 * r0
            va0 r0 = defpackage.va0.f
            zwe r1 = new zwe
            long r5 = r0.a
            r1.<init>(r3, r5)
            ws6 r0 = new ws6
            r0.<init>(r1)
            r2.o = r0
            javax.inject.Provider r0 = r14.v
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r2.a = r0
            w23 r0 = new w23
            java.lang.Object r1 = r2.b
            wjf r1 = (defpackage.wjf) r1
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r4 = r2.o
            ws6 r4 = (defpackage.ws6) r4
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r1, r3, r4, r2)
            return r0
        L_0x013d:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x0142:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            nbd r14 = (defpackage.nbd) r14
            r14.getClass()
        L_0x014b:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x0258
            r3 = 0
            long r4 = r0.getLong(r3)
            r3 = 7
            int r3 = r0.getInt(r3)
            if (r3 == 0) goto L_0x015f
            r3 = r15
            goto L_0x0160
        L_0x015f:
            r3 = 0
        L_0x0160:
            kq9 r7 = new kq9
            r7.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7.w = r6
            java.lang.String r6 = r0.getString(r15)
            if (r6 == 0) goto L_0x0250
            r7.a = r6
            long r8 = r0.getLong(r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7.o = r6
            r8 = 3
            long r18 = r0.getLong(r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r18)
            r7.v = r6
            if (r3 == 0) goto L_0x01ad
            l55 r3 = new l55
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x0198
            l65 r9 = defpackage.nbd.w
        L_0x0196:
            r13 = 5
            goto L_0x019f
        L_0x0198:
            l65 r13 = new l65
            r13.<init>(r9)
            r9 = r13
            goto L_0x0196
        L_0x019f:
            byte[] r6 = r0.getBlob(r13)
            r3.<init>(r9, r6)
            r7.c = r3
            r21 = r14
        L_0x01aa:
            r1 = 6
            goto L_0x0223
        L_0x01ad:
            r13 = 5
            l55 r3 = new l55
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x01ba
            l65 r9 = defpackage.nbd.w
            goto L_0x01c0
        L_0x01ba:
            l65 r6 = new l65
            r6.<init>(r9)
            r9 = r6
        L_0x01c0:
            android.database.sqlite.SQLiteDatabase r17 = r14.m()
            java.lang.String[] r19 = new java.lang.String[]{r2}
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String[] r21 = new java.lang.String[]{r6}
            r23 = 0
            java.lang.String r24 = "sequence_num"
            java.lang.String r18 = "event_payloads"
            java.lang.String r20 = "event_id = ?"
            r22 = 0
            android.database.Cursor r6 = r17.query(r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x024b }
            r8.<init>()     // Catch:{ all -> 0x024b }
            r10 = 0
        L_0x01e4:
            boolean r18 = r6.moveToNext()     // Catch:{ all -> 0x024b }
            if (r18 == 0) goto L_0x01f6
            r13 = 0
            byte[] r1 = r6.getBlob(r13)     // Catch:{ all -> 0x024b }
            r8.add(r1)     // Catch:{ all -> 0x024b }
            int r1 = r1.length     // Catch:{ all -> 0x024b }
            int r10 = r10 + r1
            r13 = 5
            goto L_0x01e4
        L_0x01f6:
            byte[] r1 = new byte[r10]     // Catch:{ all -> 0x024b }
            r10 = 0
            r13 = 0
        L_0x01fa:
            int r15 = r8.size()     // Catch:{ all -> 0x024b }
            if (r10 >= r15) goto L_0x0218
            java.lang.Object r15 = r8.get(r10)     // Catch:{ all -> 0x024b }
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x024b }
            r26 = r8
            int r8 = r15.length     // Catch:{ all -> 0x024b }
            r21 = r14
            r14 = 0
            java.lang.System.arraycopy(r15, r14, r1, r13, r8)     // Catch:{ all -> 0x024b }
            int r8 = r15.length     // Catch:{ all -> 0x024b }
            int r13 = r13 + r8
            r8 = 1
            int r10 = r10 + r8
            r8 = r26
            r14 = r21
            goto L_0x01fa
        L_0x0218:
            r21 = r14
            r6.close()
            r3.<init>(r9, r1)
            r7.c = r3
            goto L_0x01aa
        L_0x0223:
            boolean r3 = r0.isNull(r1)
            if (r3 != 0) goto L_0x0233
            int r3 = r0.getInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.b = r3
        L_0x0233:
            ua0 r3 = r7.b()
            rb0 r6 = new rb0
            r7 = r11
            tc0 r7 = (defpackage.tc0) r7
            r6.<init>(r4, r7, r3)
            r3 = r12
            java.util.List r3 = (java.util.List) r3
            r3.add(r6)
            r14 = r21
            r10 = 2
            r15 = 1
            goto L_0x014b
        L_0x024b:
            r0 = move-exception
            r6.close()
            throw r0
        L_0x0250:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null transportName"
            r0.<init>(r1)
            throw r0
        L_0x0258:
            r0 = 0
            return r0
        L_0x025a:
            r0 = r26
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            nbd r14 = (defpackage.nbd) r14
            android.database.sqlite.SQLiteDatabase r1 = r14.m()
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r4)
            long r4 = r1.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r1 = r14.m()
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r3)
            long r6 = r1.simpleQueryForLong()
            long r6 = r6 * r4
            va0 r1 = r14.o
            long r3 = r1.a
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            ua0 r12 = (defpackage.ua0) r12
            if (r3 < 0) goto L_0x0292
            java.lang.String r0 = r12.a
            r1 = 1
            r14.V(r1, r9, r0)
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x03cd
        L_0x0292:
            tc0 r11 = (defpackage.tc0) r11
            java.lang.Long r3 = defpackage.nbd.n(r0, r11)
            if (r3 == 0) goto L_0x029f
            long r3 = r3.longValue()
            goto L_0x02d8
        L_0x029f:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = "backend_name"
            java.lang.String r5 = r11.a
            r3.put(r4, r5)
            tub r4 = r11.c
            int r4 = defpackage.wub.a(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "priority"
            r3.put(r5, r4)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "next_request_ms"
            r3.put(r6, r5)
            byte[] r5 = r11.b
            if (r5 == 0) goto L_0x02d1
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r4)
            java.lang.String r4 = "extras"
            r3.put(r4, r5)
        L_0x02d1:
            java.lang.String r4 = "transport_contexts"
            r5 = 0
            long r3 = r0.insert(r4, r5, r3)
        L_0x02d8:
            l55 r5 = r12.c
            byte[] r5 = r5.b
            int r6 = r5.length
            int r1 = r1.e
            if (r6 > r1) goto L_0x02e3
            r6 = 1
            goto L_0x02e4
        L_0x02e3:
            r6 = 0
        L_0x02e4:
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "context_id"
            r7.put(r4, r3)
            java.lang.String r3 = "transport_name"
            java.lang.String r4 = r12.a
            r7.put(r3, r4)
            long r3 = r12.d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "timestamp_ms"
            r7.put(r4, r3)
            long r3 = r12.e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "uptime_ms"
            r7.put(r4, r3)
            l55 r3 = r12.c
            l65 r3 = r3.a
            java.lang.String r3 = r3.a
            java.lang.String r4 = "payload_encoding"
            r7.put(r4, r3)
            java.lang.String r3 = "code"
            java.lang.Integer r4 = r12.b
            r7.put(r3, r4)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r8 = "num_attempts"
            r7.put(r8, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            java.lang.String r8 = "inline"
            r7.put(r8, r4)
            if (r6 == 0) goto L_0x0338
            r3 = r5
            goto L_0x033a
        L_0x0338:
            byte[] r3 = new byte[r3]
        L_0x033a:
            java.lang.String r4 = "payload"
            r7.put(r4, r3)
            java.lang.String r3 = "events"
            r4 = 0
            long r7 = r0.insert(r3, r4, r7)
            java.lang.String r3 = "event_id"
            if (r6 != 0) goto L_0x0386
            int r4 = r5.length
            double r9 = (double) r4
            double r13 = (double) r1
            double r9 = r9 / r13
            double r9 = java.lang.Math.ceil(r9)
            int r4 = (int) r9
            r6 = 1
        L_0x0354:
            if (r6 > r4) goto L_0x0386
            r9 = 1
            int r10 = r6 + -1
            int r10 = r10 * r1
            int r9 = r6 * r1
            int r11 = r5.length
            int r9 = java.lang.Math.min(r9, r11)
            byte[] r9 = java.util.Arrays.copyOfRange(r5, r10, r9)
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            r10.put(r3, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.String r13 = "sequence_num"
            r10.put(r13, r11)
            r10.put(r2, r9)
            java.lang.String r9 = "event_payloads"
            r11 = 0
            r0.insert(r9, r11, r10)
            r9 = 1
            int r6 = r6 + r9
            goto L_0x0354
        L_0x0386:
            java.util.Map r1 = r12.f
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0394:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03c9
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r4.put(r3, r5)
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "name"
            r4.put(r6, r5)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "value"
            r4.put(r5, r2)
            java.lang.String r2 = "event_metadata"
            r5 = 0
            r0.insert(r2, r5, r4)
            goto L_0x0394
        L_0x03c9:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
        L_0x03cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.apply(java.lang.Object):java.lang.Object");
    }

    public void b(cx8 cx8) {
        Bundle bundle = (Bundle) this.c;
        iy8 iy8 = (iy8) this.b;
        if (bundle == null) {
            iy8.getClass();
            Bundle bundle2 = Bundle.EMPTY;
        }
        ya7 m = iy8.w.m(cx8);
        ResultReceiver resultReceiver = (ResultReceiver) this.o;
        if (resultReceiver != null) {
            m.d(new sx8(1, m, resultReceiver), dp4.a);
        }
    }

    public void c(yha yha) {
        ae8 ae8 = (ae8) this.b;
        ae8.getClass();
        ae8.a();
        if (!yha.f()) {
            Map map = ae8.a;
            tf8 tf8 = (tf8) this.c;
            xd8 xd8 = (xd8) map.get(tf8);
            if (xd8 == null) {
                xd8 = ae8.b((Context) this.o, tf8, false, false);
            }
            yha.d(xd8.b);
        }
        yha.b();
    }

    public void d(i67 i67, int i) {
        np8 np8 = (np8) this.b;
        np8.getClass();
        i67.q0(np8.c, i, ((yvd) this.c).b(), (Bundle) this.o);
    }

    public s7h e(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str2 = (String) this.c;
        bxe bxe = (bxe) this.o;
        String str3 = (String) obj;
        xga c2 = FirebaseMessaging.c(firebaseMessaging.b);
        String d = firebaseMessaging.d();
        String d2 = firebaseMessaging.h.d();
        synchronized (c2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = bxe.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.KEY_TOKEN, (Object) str3);
                jSONObject.put("appVersion", (Object) d2);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                edit.putString(xga.e(d, str2), str);
                edit.commit();
            }
        }
        if (bxe == null || !str3.equals(bxe.a)) {
            hp5 hp5 = firebaseMessaging.a;
            hp5.a();
            if ("[DEFAULT]".equals(hp5.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    hp5.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str3);
                new ata(firebaseMessaging.b, 1).A(intent);
            }
        }
        return hsg.o(str3);
    }

    public void f(oc0 oc0) {
        sda sda;
        yu9 yu9 = (yu9) this.b;
        yu9.getClass();
        Objects.toString(oc0);
        boolean z = ((su1) this.c).n().h() == 0;
        kub kub = (kub) yu9.b;
        fub fub = kub.o;
        Size size = ((z3f) this.o).b;
        fub.getClass();
        Objects.toString(oc0);
        Objects.toString(size);
        fub.b = oc0.a;
        fub.c = oc0.b;
        int i = oc0.c;
        fub.e = i;
        fub.a = size;
        fub.f = z;
        fub.g = oc0.d;
        fub.d = oc0.e;
        if (i == -1 || ((sda = kub.b) != null && (sda instanceof d4f))) {
            kub.v = true;
        } else {
            kub.v = false;
        }
        kub.b();
    }

    public void g(Throwable th) {
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.b;
        frgContactAvatar.getClass();
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
        zoomableDraweeView.setZoomEnabled(false);
        frgContactAvatar.I1 = true;
        if (th != null && th.getMessage() != null && th.getMessage().contains("404")) {
            zoomableDraweeView.setVisibility(8);
            ((SlideOutLayout) this.o).findViewById(lic.frg_unknown_attach__deleted_view).setVisibility(0);
        } else if (((udg) ((xq) ((qra) ym.e()).getAccessor().g(xq.class))).c()) {
            ym ymVar = ym.v;
            hi7.b0(1, ymVar, ymVar.getString(qad.w1));
        }
    }

    public Object get() {
        g68 g68 = (g68) this.b;
        g68.getClass();
        return new e68((lt6) ((Lazy) this.c).getValue(), g68, (Context) this.o);
    }

    public void h(pbe pbe) {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                y00 y00 = (y00) obj3;
                y00.getClass();
                Locale locale = Locale.ENGLISH;
                String k = wj6.k("preview_", ((l20) obj2).q, "_.png");
                po5 po5 = (po5) y00.c;
                po5.getClass();
                File g = po5.g(po5.b(), "previewVideoCache");
                if (cjf.o(g)) {
                    File file = new File(g, k);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        Uri fromFile = Uri.fromFile(file);
                        ba7 B = ld9.B();
                        B.getClass();
                        lc5 lc5 = new lc5(21, (Object) fromFile);
                        B.f.n(lc5);
                        B.g.n(lc5);
                        B.f(qa7.a(fromFile), (f0) null);
                        if (!pbe.f()) {
                            pbe.a(file);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                } else if (!pbe.f()) {
                    pbe.onError(new IllegalStateException("Preview cache directory not exist or can't read"));
                    return;
                } else {
                    return;
                }
            default:
                Context context = (Context) ((z3a) obj3).b;
                int d = vzg.d(context);
                Bitmap bitmap2 = new a(context, (Uri) obj2, (Uri) null, d, d, (BitmapLoadCallback) null).d().bitmapResult;
                if (bitmap2 != null) {
                    Bitmap bitmap3 = new a(context, (Uri) obj, (Uri) null, d, d, (BitmapLoadCallback) null).d().bitmapResult;
                    if (bitmap3 != null) {
                        int i = m5a.e;
                        Canvas canvas = new Canvas(bitmap2);
                        float width = ((float) bitmap2.getWidth()) / ((float) bitmap3.getWidth());
                        canvas.scale(width, width);
                        canvas.drawBitmap(bitmap3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
                        po5 p = ((qra) ym.e()).p();
                        p.getClass();
                        File o2 = p.o((String) null, "jpg");
                        o5a.b0(o2.getAbsolutePath(), bitmap2, 100);
                        String absolutePath = o2.getAbsolutePath();
                        bitmap2.recycle();
                        if (!pbe.f()) {
                            pbe.a(Uri.fromFile(new File(absolutePath)));
                            return;
                        }
                        return;
                    } else if (!pbe.f()) {
                        pbe.onError(new IllegalStateException("overlayBitmap not decoded"));
                        return;
                    } else {
                        return;
                    }
                } else if (!pbe.f()) {
                    pbe.onError(new IllegalStateException("bitmap not decoded"));
                    return;
                } else {
                    return;
                }
        }
        throw th;
    }

    public void i(d8 d8Var) {
        ArrayList arrayList = (ArrayList) ((List) this.o);
        t21 t21 = (t21) this.b;
        t21.getClass();
        y01 y01 = ((v01) this.c).K0;
        if (y01 != null) {
            KProperty[] kPropertyArr = CallBottomPanelWidget.y;
            ((CallBottomPanelWidget) ((grg) y01).b).e0().k().h(((u41) arrayList.get(d8Var.getId())).b());
        }
        Unit unit = Unit.INSTANCE;
        hx3 hx3 = t21.a;
        if (hx3 != null) {
            hx3.dismiss();
        }
        t21.a = null;
    }

    public void invoke(Object obj) {
        ((sob) obj).q(((ppb) ((ni3) this.b).a).c.a, ((ppb) ((ni3) this.c).a).c.a, ((Integer) this.o).intValue());
    }

    public void j() {
        eub eub;
        AtomicReference atomicReference = ((kub) ((yu9) this.b).b).x;
        while (true) {
            eub = (eub) this.c;
            if (!atomicReference.compareAndSet(eub, (Object) null)) {
                if (atomicReference.get() != eub) {
                    break;
                }
            } else {
                eub.b(jub.a);
                break;
            }
        }
        oj6 oj6 = eub.e;
        if (oj6 != null) {
            oj6.cancel(false);
            eub.e = null;
        }
        ((su1) this.o).a().i(eub);
    }

    public void k(o8f o8f, int i) {
        dr7 dr7 = (dr7) this.b;
        int selectedTabPosition = dr7.getSelectedTabPosition();
        View view = o8f.f;
        cr7 cr7 = view instanceof cr7 ? (cr7) view : null;
        er7 er7 = (er7) this.c;
        if (i > CollectionsKt.getLastIndex((List) er7.b)) {
            String name = er7.class.getName();
            int size = ((List) er7.b).size();
            z68.p(name, "Keyboard media tabs position wrong, pos:" + i + "|size:" + size);
            return;
        }
        ar7 ar7 = (ar7) ((List) er7.b).get(i);
        woa woa = new woa(String.valueOf(ar7.c), ((ViewPager2) this.o).getContext().getString(ar7.a), i == selectedTabPosition ? voa.a : voa.b, 56);
        if (cr7 != null) {
            cr7.setTabItem(woa);
            return;
        }
        cr7 cr72 = new cr7(dr7.getContext());
        cr72.setTabItem(woa);
        o8f.a(cr72);
    }

    public void l() {
        smb smb = (smb) this.b;
        FloatingVideoView floatingVideoView = smb.A0;
        if (floatingVideoView != null) {
            smb.l(floatingVideoView.getContext(), (a89) this.o, (l20) this.c);
        }
    }

    public void onComplete(StatsReport[] statsReportArr) {
        ap4 ap4 = (ap4) this.b;
        ap4.getClass();
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        ap4.a.post(new po1(ap4, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), (ue1) this.c, (xne) this.o, 4));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, nj6, qr0] */
    public Object r(do1 do1) {
        switch (this.a) {
            case 5:
                ti4 ti4 = (ti4) this.b;
                ti4.getClass();
                ti4.e(new jh3(2, ti4, (vy4) this.c, (Map) this.o, do1), new gc(5));
                return "Init GlRenderer";
            case 6:
                zz7 zz7 = (zz7) this.b;
                ne4 ne4 = new ne4(6, (go1) zz7);
                Executor executor = (Executor) this.c;
                do1.a(ne4, executor);
                ? obj = new Object();
                obj.a = false;
                obj.b = do1;
                hd8.a(zz7, obj, executor);
                return "surfaceList[" + ((Collection) this.o) + "]";
            case 8:
                px4 px4 = (px4) this.b;
                px4.getClass();
                px4.e(new jh3(3, px4, (vy4) this.c, (Map) this.o, do1), new gc(5));
                return "Init GlRenderer";
            default:
                ((eub) this.b).getClass();
                qu1 qu1 = (qu1) this.c;
                hr1 hr1 = new hr1(do1, qu1);
                ((List) this.o).add(hr1);
                qu1.o(ryg.j(), hr1);
                return "waitForCaptureResult";
        }
    }

    public /* synthetic */ u00(smb smb, a89 a89, l20 l20) {
        this.a = 23;
        this.b = smb;
        this.o = a89;
        this.c = l20;
    }

    public /* synthetic */ u00(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [zz7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v26, types: [zz7, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b7 A[Catch:{ CameraAccessException -> 0x02ba, all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01de A[Catch:{ CameraAccessException -> 0x02ba, all -> 0x00b5 }] */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zz7 m1625apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r2 = 13
            r3 = 29
            r4 = 2
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 2: goto L_0x0078;
                case 18: goto L_0x0045;
                default: goto L_0x000e;
            }
        L_0x000e:
            r13 = r23
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r0.b
            yx8 r1 = (defpackage.yx8) r1
            android.os.Handler r4 = r1.l
            jh3 r6 = new jh3
            java.lang.Object r7 = r0.o
            r11 = r7
            fz8 r11 = (defpackage.fz8) r11
            java.lang.Object r0 = r0.c
            cx8 r0 = (defpackage.cx8) r0
            r9 = 11
            r8 = r6
            r10 = r1
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            uo5 r7 = new uo5
            r7.<init>(r1, r0, r6, r3)
            swd r0 = new swd
            r0.<init>(r5)
            int r1 = defpackage.v0g.a
            byd r1 = new byd
            r1.<init>()
            o6d r3 = new o6d
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r7, (java.lang.Object) r0, (int) r2)
            defpackage.v0g.W(r4, r3)
            return r1
        L_0x0045:
            r1 = r23
            dx8 r1 = (defpackage.dx8) r1
            java.lang.Object r4 = r0.b
            yx8 r4 = (defpackage.yx8) r4
            android.os.Handler r6 = r4.l
            x55 r7 = new x55
            java.lang.Object r8 = r0.o
            vx8 r8 = (defpackage.vx8) r8
            r9 = 18
            r7.<init>((java.lang.Object) r4, (java.lang.Object) r8, (java.lang.Object) r1, (int) r9)
            uo5 r1 = new uo5
            java.lang.Object r0 = r0.c
            cx8 r0 = (defpackage.cx8) r0
            r1.<init>(r4, r0, r7, r3)
            swd r0 = new swd
            r0.<init>(r5)
            int r3 = defpackage.v0g.a
            byd r3 = new byd
            r3.<init>()
            o6d r4 = new o6d
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r1, (java.lang.Object) r0, (int) r2)
            defpackage.v0g.W(r6, r4)
            return r3
        L_0x0078:
            java.lang.String r2 = "openCaptureSession() should not be possible in state: "
            java.lang.String r3 = "openCaptureSession() not execute in state: "
            java.lang.Object r7 = r0.b
            jx1 r7 = (defpackage.jx1) r7
            java.lang.Object r8 = r0.c
            fwd r8 = (defpackage.fwd) r8
            java.lang.Object r0 = r0.o
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r9 = r23
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r7.a
            monitor-enter(r10)
            int r11 = r7.i     // Catch:{ all -> 0x00b5 }
            int r11 = defpackage.tr1.y(r11)     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x02c3
            if (r11 == r6) goto L_0x02c3
            r12 = 4
            if (r11 == r4) goto L_0x00b8
            if (r11 == r12) goto L_0x02c3
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.a81.A(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            xa7 r1 = new xa7     // Catch:{ all -> 0x00b5 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x00b5:
            r0 = move-exception
            goto L_0x02da
        L_0x00b8:
            java.util.HashMap r2 = r7.g     // Catch:{ all -> 0x00b5 }
            r2.clear()     // Catch:{ all -> 0x00b5 }
            r2 = r5
        L_0x00be:
            int r3 = r9.size()     // Catch:{ all -> 0x00b5 }
            if (r2 >= r3) goto L_0x00d9
            java.util.HashMap r3 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r7.h     // Catch:{ all -> 0x00b5 }
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x00b5 }
            lk4 r11 = (defpackage.lk4) r11     // Catch:{ all -> 0x00b5 }
            java.lang.Object r13 = r9.get(r2)     // Catch:{ all -> 0x00b5 }
            android.view.Surface r13 = (android.view.Surface) r13     // Catch:{ all -> 0x00b5 }
            r3.put(r11, r13)     // Catch:{ all -> 0x00b5 }
            int r2 = r2 + r6
            goto L_0x00be
        L_0x00d9:
            r7.i = r12     // Catch:{ all -> 0x00b5 }
            ix1 r2 = r7.c     // Catch:{ all -> 0x00b5 }
            ix1 r3 = new ix1     // Catch:{ all -> 0x00b5 }
            java.util.List r9 = r8.d     // Catch:{ all -> 0x00b5 }
            r3.<init>(r6, r9)     // Catch:{ all -> 0x00b5 }
            r6f[] r9 = new defpackage.r6f[r4]     // Catch:{ all -> 0x00b5 }
            r9[r5] = r2     // Catch:{ all -> 0x00b5 }
            r9[r6] = r3     // Catch:{ all -> 0x00b5 }
            ix1 r2 = new ix1     // Catch:{ all -> 0x00b5 }
            java.util.List r3 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x00b5 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00b5 }
            vs1 r3 = new vs1     // Catch:{ all -> 0x00b5 }
            bx1 r4 = r8.g     // Catch:{ all -> 0x00b5 }
            je3 r5 = r4.b     // Catch:{ all -> 0x00b5 }
            r9 = 9
            r3.<init>((int) r9, (java.lang.Object) r5)     // Catch:{ all -> 0x00b5 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00b5 }
            r5.<init>()     // Catch:{ all -> 0x00b5 }
            defpackage.pz9.c()     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r9.<init>()     // Catch:{ all -> 0x00b5 }
            defpackage.uz9.a()     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r4.a     // Catch:{ all -> 0x00b5 }
            r5.addAll(r11)     // Catch:{ all -> 0x00b5 }
            je3 r11 = r4.b     // Catch:{ all -> 0x00b5 }
            pz9 r11 = defpackage.pz9.d(r11)     // Catch:{ all -> 0x00b5 }
            int r15 = r4.c     // Catch:{ all -> 0x00b5 }
            java.util.List r12 = r4.e     // Catch:{ all -> 0x00b5 }
            r9.addAll(r12)     // Catch:{ all -> 0x00b5 }
            boolean r14 = r4.f     // Catch:{ all -> 0x00b5 }
            android.util.ArrayMap r12 = new android.util.ArrayMap     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            a9f r13 = r4.g     // Catch:{ all -> 0x00b5 }
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0133:
            boolean r16 = r6.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x014f
            java.lang.Object r16 = r6.next()     // Catch:{ all -> 0x00b5 }
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b5 }
            r22 = r6
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x00b5 }
            r12.put(r1, r6)     // Catch:{ all -> 0x00b5 }
            r6 = r22
            goto L_0x0133
        L_0x014f:
            uz9 r1 = new uz9     // Catch:{ all -> 0x00b5 }
            r1.<init>(r12)     // Catch:{ all -> 0x00b5 }
            boolean r4 = r4.d     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            boolean r12 = r7.r     // Catch:{ all -> 0x00b5 }
            r13 = 35
            if (r12 == 0) goto L_0x0173
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            if (r12 < r13) goto L_0x0173
            java.util.List r6 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = defpackage.jx1.g(r6)     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r12 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = defpackage.jx1.c(r6, r12)     // Catch:{ all -> 0x00b5 }
        L_0x0173:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            la0 r13 = defpackage.vs1.y     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x00b5 }
            je3 r3 = (defpackage.je3) r3     // Catch:{ all -> 0x00b5 }
            r21 = r0
            r0 = 0
            java.lang.Object r3 = r3.k(r13, r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b5 }
            java.util.List r13 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x018d:
            boolean r16 = r13.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x01ed
            java.lang.Object r16 = r13.next()     // Catch:{ all -> 0x00b5 }
            r0 = r16
            dc0 r0 = (defpackage.dc0) r0     // Catch:{ all -> 0x00b5 }
            r23 = r13
            boolean r13 = r7.r     // Catch:{ all -> 0x00b5 }
            if (r13 == 0) goto L_0x01b0
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r16 = r14
            r14 = 35
            if (r13 < r14) goto L_0x01b4
            java.lang.Object r13 = r6.get(r0)     // Catch:{ all -> 0x00b5 }
            e6b r13 = (defpackage.e6b) r13     // Catch:{ all -> 0x00b5 }
            goto L_0x01b5
        L_0x01b0:
            r16 = r14
            r14 = 35
        L_0x01b4:
            r13 = 0
        L_0x01b5:
            if (r13 != 0) goto L_0x01de
            java.util.HashMap r13 = r7.g     // Catch:{ all -> 0x00b5 }
            e6b r13 = r7.e(r0, r13, r3)     // Catch:{ all -> 0x00b5 }
            java.util.Map r14 = r7.l     // Catch:{ all -> 0x00b5 }
            r17 = r3
            lk4 r3 = r0.a     // Catch:{ all -> 0x00b5 }
            boolean r3 = r14.containsKey(r3)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x01e0
            java.util.Map r3 = r7.l     // Catch:{ all -> 0x00b5 }
            lk4 r0 = r0.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00b5 }
            r3 = r15
            long r14 = r0.longValue()     // Catch:{ all -> 0x00b5 }
            g6b r0 = r13.a     // Catch:{ all -> 0x00b5 }
            r0.h(r14)     // Catch:{ all -> 0x00b5 }
            goto L_0x01e1
        L_0x01de:
            r17 = r3
        L_0x01e0:
            r3 = r15
        L_0x01e1:
            r12.add(r13)     // Catch:{ all -> 0x00b5 }
            r13 = r23
            r15 = r3
            r14 = r16
            r3 = r17
            r0 = 0
            goto L_0x018d
        L_0x01ed:
            r16 = r14
            r3 = r15
            java.util.ArrayList r0 = defpackage.jx1.f(r12)     // Catch:{ all -> 0x00b5 }
            t6f r6 = r7.d     // Catch:{ all -> 0x00b5 }
            int r12 = r8.h     // Catch:{ all -> 0x00b5 }
            r6.e = r2     // Catch:{ all -> 0x00b5 }
            hwd r2 = new hwd     // Catch:{ all -> 0x00b5 }
            kt1 r13 = new kt1     // Catch:{ all -> 0x00b5 }
            r14 = r6
            u6f r14 = (defpackage.u6f) r14     // Catch:{ all -> 0x00b5 }
            r15 = 1
            r13.<init>(r15, r14)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.Executor r6 = r6.c     // Catch:{ all -> 0x00b5 }
            r2.<init>(r12, r0, r6, r13)     // Catch:{ all -> 0x00b5 }
            bx1 r0 = r8.g     // Catch:{ all -> 0x00b5 }
            int r0 = r0.c     // Catch:{ all -> 0x00b5 }
            r6 = 5
            if (r0 != r6) goto L_0x0242
            android.hardware.camera2.params.InputConfiguration r0 = r8.i     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0242
            if (r0 != 0) goto L_0x0219
            r6 = 0
            goto L_0x0234
        L_0x0219:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r8 = 31
            if (r6 < r8) goto L_0x022a
            ig7 r6 = new ig7     // Catch:{ all -> 0x00b5 }
            hg7 r8 = new hg7     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x0234
        L_0x022a:
            ig7 r6 = new ig7     // Catch:{ all -> 0x00b5 }
            gg7 r8 = new gg7     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
        L_0x0234:
            gwd r0 = r2.a     // Catch:{ all -> 0x00b5 }
            r0.getClass()     // Catch:{ all -> 0x00b5 }
            gg7 r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.InputConfiguration r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ all -> 0x00b5 }
            r0.setInputConfiguration(r6)     // Catch:{ all -> 0x00b5 }
        L_0x0242:
            bx1 r12 = new bx1     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02ba }
            r13.<init>(r5)     // Catch:{ CameraAccessException -> 0x02ba }
            c5b r0 = defpackage.c5b.a(r11)     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02ba }
            r5.<init>(r9)     // Catch:{ CameraAccessException -> 0x02ba }
            a9f r6 = defpackage.a9f.b     // Catch:{ CameraAccessException -> 0x02ba }
            android.util.ArrayMap r6 = new android.util.ArrayMap     // Catch:{ CameraAccessException -> 0x02ba }
            r6.<init>()     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Map r8 = r1.a     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Set r8 = r8.keySet()     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x0263:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x02ba }
            if (r9 == 0) goto L_0x0279
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x02ba }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Map r11 = r1.a     // Catch:{ CameraAccessException -> 0x02ba }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ CameraAccessException -> 0x02ba }
            r6.put(r9, r11)     // Catch:{ CameraAccessException -> 0x02ba }
            goto L_0x0263
        L_0x0279:
            a9f r1 = new a9f     // Catch:{ CameraAccessException -> 0x02ba }
            r1.<init>(r6)     // Catch:{ CameraAccessException -> 0x02ba }
            r20 = 0
            r6 = r16
            r14 = r0
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ CameraAccessException -> 0x02ba }
            zq0 r1 = r7.q     // Catch:{ CameraAccessException -> 0x02ba }
            if (r21 != 0) goto L_0x0297
            r4 = r21
            r1 = 0
            goto L_0x02a7
        L_0x0297:
            r4 = r21
            android.hardware.camera2.CaptureRequest$Builder r5 = r4.createCaptureRequest(r3)     // Catch:{ CameraAccessException -> 0x02ba }
            defpackage.j4b.d(r5, r3, r1)     // Catch:{ CameraAccessException -> 0x02ba }
            defpackage.j4b.c(r5, r0)     // Catch:{ CameraAccessException -> 0x02ba }
            android.hardware.camera2.CaptureRequest r1 = r5.build()     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x02a7:
            if (r1 == 0) goto L_0x02b0
            gwd r0 = r2.a     // Catch:{ CameraAccessException -> 0x02ba }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ CameraAccessException -> 0x02ba }
            r0.setSessionParameters(r1)     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x02b0:
            t6f r0 = r7.d     // Catch:{ all -> 0x00b5 }
            java.util.List r1 = r7.h     // Catch:{ all -> 0x00b5 }
            zz7 r1 = r0.m(r4, r2, r1)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x02ba:
            r0 = move-exception
            xa7 r1 = new xa7     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x02c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.a81.A(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            xa7 r1 = new xa7     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
        L_0x02d9:
            return r1
        L_0x02da:
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.m1625apply(java.lang.Object):zz7");
    }
}
