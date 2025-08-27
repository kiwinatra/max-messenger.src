package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.strictmode.Violation;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.g;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.transfer.exceptions.TamHttpErrorException;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFrame;
import ru.ok.messages.calls.views.IncomingCallControlsView;
import ru.ok.messages.channels.FrgChatMembers;
import ru.ok.messages.settings.FrgAppearanceSettings;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.ThemePreviewView;
import ru.ok.messages.views.dev.FrgPrefs;
import ru.ok.messages.views.fragments.FrgChatProfile;
import ru.ok.messages.views.fragments.FrgContactProfile;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y86  reason: default package */
public final /* synthetic */ class y86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y86(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [zp9, t8f] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r6.c();
        r2 = r1.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2 != 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r3 = r6.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        if (r2 != 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r0 = r6.c;
        r2 = r6.a;
        r0.getClass();
        r0 = defpackage.iuf.a(r2, new defpackage.k96[]{r1}, 0);
        r1 = defpackage.q8.v(r6.a, r1.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r1 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r0 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r1 = r1.duplicate();
        r1.position((int) defpackage.tf6.H(new defpackage.wie(r1)).b);
        r3 = new defpackage.t8f();
        r1.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r5 = r1.position() + r1.getInt(r1.position());
        r3.d = r1;
        r3.a = r5;
        r5 = r5 - r1.getInt(r5);
        r3.b = r5;
        r3.c = ((java.nio.ByteBuffer) r3.d).getShort(r5);
        r2 = new defpackage.gq9(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.os.Trace.endSection();
        r0 = r6.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = r6.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r1.V(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ba, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r2 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        monitor-enter(r6.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1 = r6.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dc, code lost:
        if (r1 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r1.U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ea, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r6 = r6.b
            z86 r6 = (defpackage.z86) r6
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r1 = r6.o
            monitor-enter(r1)
            kv0 r2 = r6.y     // Catch:{ all -> 0x0010 }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            goto L_0x00e8
        L_0x0010:
            r6 = move-exception
            goto L_0x00eb
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            k96 r1 = r6.c()     // Catch:{ all -> 0x0025 }
            int r2 = r1.e     // Catch:{ all -> 0x0025 }
            r3 = 2
            if (r2 != r3) goto L_0x0028
            java.lang.Object r3 = r6.o     // Catch:{ all -> 0x0025 }
            monitor-enter(r3)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            goto L_0x00d7
        L_0x0028:
            if (r2 != 0) goto L_0x00c0
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00bb }
            o9a r0 = r6.c     // Catch:{ all -> 0x00bb }
            android.content.Context r2 = r6.a     // Catch:{ all -> 0x00bb }
            r0.getClass()     // Catch:{ all -> 0x00bb }
            k96[] r0 = new defpackage.k96[]{r1}     // Catch:{ all -> 0x00bb }
            r3 = 0
            android.graphics.Typeface r0 = defpackage.iuf.a(r2, r0, r3)     // Catch:{ all -> 0x00bb }
            android.content.Context r2 = r6.a     // Catch:{ all -> 0x00bb }
            android.net.Uri r1 = r1.a     // Catch:{ all -> 0x00bb }
            java.nio.MappedByteBuffer r1 = defpackage.q8.v(r2, r1)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x00ae }
            gq9 r2 = new gq9     // Catch:{ all -> 0x00ae }
            java.nio.ByteBuffer r1 = r1.duplicate()     // Catch:{ all -> 0x00ae }
            wie r3 = new wie     // Catch:{ all -> 0x00ae }
            r3.<init>((java.nio.ByteBuffer) r1)     // Catch:{ all -> 0x00ae }
            ap0 r3 = defpackage.tf6.H(r3)     // Catch:{ all -> 0x00ae }
            long r3 = r3.b     // Catch:{ all -> 0x00ae }
            int r3 = (int) r3     // Catch:{ all -> 0x00ae }
            r1.position(r3)     // Catch:{ all -> 0x00ae }
            zp9 r3 = new zp9     // Catch:{ all -> 0x00ae }
            r3.<init>()     // Catch:{ all -> 0x00ae }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x00ae }
            r1.order(r4)     // Catch:{ all -> 0x00ae }
            int r4 = r1.position()     // Catch:{ all -> 0x00ae }
            int r4 = r1.getInt(r4)     // Catch:{ all -> 0x00ae }
            int r5 = r1.position()     // Catch:{ all -> 0x00ae }
            int r5 = r5 + r4
            r3.d = r1     // Catch:{ all -> 0x00ae }
            r3.a = r5     // Catch:{ all -> 0x00ae }
            int r1 = r1.getInt(r5)     // Catch:{ all -> 0x00ae }
            int r5 = r5 - r1
            r3.b = r5     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r3.d     // Catch:{ all -> 0x00ae }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x00ae }
            short r1 = r1.getShort(r5)     // Catch:{ all -> 0x00ae }
            r3.c = r1     // Catch:{ all -> 0x00ae }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00ae }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00bb }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r6.o     // Catch:{ all -> 0x0025 }
            monitor-enter(r0)     // Catch:{ all -> 0x0025 }
            kv0 r1 = r6.y     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a7
            r1.V(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a7
        L_0x00a5:
            r1 = move-exception
            goto L_0x00ac
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r6.a()     // Catch:{ all -> 0x0025 }
            goto L_0x00e8
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x00ae:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00b3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0025 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x00c0:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r3.<init>(r0)     // Catch:{ all -> 0x0025 }
            r3.append(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0025 }
            r1.<init>(r0)     // Catch:{ all -> 0x0025 }
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x00d7:
            java.lang.Object r2 = r6.o
            monitor-enter(r2)
            kv0 r1 = r6.y     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00e4
            r1.U(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e4
        L_0x00e2:
            r6 = move-exception
            goto L_0x00e9
        L_0x00e4:
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            r6.a()
        L_0x00e8:
            return
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            throw r6
        L_0x00eb:
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.a():void");
    }

    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                a aVar = (a) this.b;
                aVar.c1.w.b(aVar.o);
                aVar.o = null;
                return;
            case 2:
                Iterator it = ((c) this.b).n.iterator();
                if (it.hasNext()) {
                    rae.w(it.next());
                    throw null;
                }
                return;
            case 3:
                throw ((Violation) this.b);
            case 4:
                ThemePreviewView themePreviewView = ((FrgAppearanceSettings) this.b).C1;
                themePreviewView.w = themePreviewView.getMeasuredWidth();
                themePreviewView.invalidate();
                return;
            case 5:
                ((FrgBaseSettings) this.b).C1.m();
                return;
            case 6:
                FrgChatMembers frgChatMembers = (FrgChatMembers) this.b;
                if (!frgChatMembers.W1.h) {
                    frgChatMembers.F1.setRefreshingNext(true);
                    return;
                } else {
                    frgChatMembers.F1.setRefreshingNext(false);
                    return;
                }
            case 7:
                FrgChatProfile frgChatProfile = (FrgChatProfile) this.b;
                frgChatProfile.f2.f();
                frgChatProfile.j();
                return;
            case 8:
                FrgContactProfile frgContactProfile = (FrgContactProfile) this.b;
                frgContactProfile.b2.f();
                frgContactProfile.j();
                return;
            case 9:
                a2a a2a = (a2a) this.b;
                if (a2a != null) {
                    z68.a("a2a", "onGifsLoaded");
                    a2a.V(new a0(6, a2a));
                    return;
                }
                return;
            case 10:
                Context O1 = ((FrgPrefs) this.b).O1();
                if (O1 != null) {
                    ProcessPhoenix.b(O1);
                    return;
                }
                return;
            case 11:
                ((q07) this.b).h();
                return;
            case 12:
                ((b8d) this.b).u();
                return;
            case 13:
                k57 k57 = (k57) this.b;
                if (!k57.y.get()) {
                    z68.f("l57", "onUrlExpired", (Throwable) null);
                    k57.x.onError(new TamHttpErrorException("onUrlExpired", (u47) null));
                    k57.a(false);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                m87 m87 = (m87) this.b;
                synchronized (m87.x0) {
                    try {
                        m87.z0 = null;
                        ha7 ha7 = m87.y0;
                        if (ha7 != null) {
                            m87.y0 = null;
                            m87.e(ha7);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                b97 b97 = (b97) this.b;
                b97.getClass();
                z68.c("b97", "Clear fresco. BitmapMemoryCache size: %d bytes", Integer.valueOf(ld9.B().f.getSizeInBytes()));
                ArrayList arrayList = new ArrayList();
                List q = ((km3) b97.c.getValue()).q(km3.s, km3.u);
                for (int i = 0; i < q.size(); i++) {
                    String u = ((vk3) q.get(i)).u(b97.a.a.p(), kl0.c);
                    if (!TextUtils.isEmpty(u)) {
                        arrayList.add(b97.a(Uri.parse(u)));
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(((r62) b97.b.getValue()).H(r62.K, false, (osb) null));
                for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                    String d = ((a32) unmodifiableList.get(i2)).b.d();
                    if (!TextUtils.isEmpty(d)) {
                        arrayList.add(b97.a(Uri.parse(d)));
                    }
                }
                ld9.B().f.n(new ib4(23, b97, arrayList));
                return;
            case 16:
                int i3 = IncomingCallControlsView.D0;
                ((IncomingCallControlsView) this.b).getClass();
                return;
            case LangUtils.HASH_SEED /*17*/:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.b;
                inviteByPhoneScreen.getRouter().B(inviteByPhoneScreen);
                return;
            case 18:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 19:
                yt7 yt7 = (yt7) this.b;
                yt7.getClass();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yt7, "translationY", new float[]{-8.0f, 8.0f});
                ofFloat.setDuration(2500);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new z00(12, (Object) yt7));
                ofFloat.start();
                return;
            case 20:
                e98 e98 = (e98) this.b;
                try {
                    ((v13) e98.D.getValue()).a();
                    return;
                } catch (Throwable th2) {
                    z68.f("e98", "Can't clearCache", th2);
                    ((uta) ((m95) e98.x.getValue())).c(new IllegalStateException("Can't clearCache"), false);
                    return;
                }
            case 21:
                ((kd8) this.b).a();
                return;
            case 22:
                mjf mjf = ((MaterialTimePicker) this.b).J1;
                if (mjf instanceof g) {
                    ((g) mjf).d();
                    return;
                }
                return;
            case 23:
                ok8 ok8 = (ok8) ((tg) this.b).b;
                ok8.J0.setTranslationY((float) (-ok8.getKeyboardHeight()));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((qo8) this.b).release();
                return;
            case 25:
                np8 np8 = (np8) this.b;
                mp8 mp8 = np8.l;
                if (mp8 != null) {
                    np8.d.unbindService(mp8);
                    np8.l = null;
                }
                np8.c.c.clear();
                return;
            case 26:
                KProperty[] kPropertyArr = MediaKeyboardWidget.A0;
                ((MediaKeyboardWidget) this.b).c0();
                return;
            case 27:
                ((uu8) this.b).n = -1;
                return;
            case 28:
                ((pw8) this.b).a();
                return;
            default:
                synchronized (((ry8) this.b).a) {
                }
                return;
        }
    }

    public /* synthetic */ y86(String str, Violation violation) {
        this.a = 3;
        this.b = violation;
    }
}
