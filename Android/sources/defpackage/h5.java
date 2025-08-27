package defpackage;

import java.util.concurrent.Callable;

/* renamed from: h5  reason: default package */
public final /* synthetic */ class h5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r14v0, types: [ezf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v35, types: [o5h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v67, types: [java.lang.Object, axf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r20 = this;
            r0 = r20
            r1 = 4
            r2 = 2
            r3 = 0
            r5 = 3
            r7 = 1
            r8 = 0
            java.lang.Object r9 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x05eb;
                case 1: goto L_0x059f;
                case 2: goto L_0x058f;
                case 3: goto L_0x02fb;
                case 4: goto L_0x0288;
                case 5: goto L_0x027f;
                case 6: goto L_0x026b;
                case 7: goto L_0x0242;
                case 8: goto L_0x020a;
                case 9: goto L_0x0203;
                case 10: goto L_0x01fa;
                case 11: goto L_0x01e4;
                case 12: goto L_0x0180;
                case 13: goto L_0x0179;
                case 14: goto L_0x014e;
                case 15: goto L_0x0143;
                case 16: goto L_0x0138;
                case 17: goto L_0x0125;
                case 18: goto L_0x011e;
                case 19: goto L_0x00e4;
                case 20: goto L_0x0068;
                case 21: goto L_0x0061;
                default: goto L_0x0010;
            }
        L_0x0010:
            axf r1 = new axf
            r1.<init>()
            wyf r0 = defpackage.wyf.UNKNOWN
            r1.g = r0
            kxf r9 = (defpackage.kxf) r9
            r1.a = r9
            wyf r0 = defpackage.wyf.UPLOADING
            r1.g = r0
            java.lang.String r0 = r9.a
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0037 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0037 }
            r2.<init>(r0)     // Catch:{ all -> 0x0037 }
            long r5 = r2.length()     // Catch:{ all -> 0x0037 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0042
        L_0x0037:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            boolean r3 = kotlin.Result.m29isFailureimpl(r0)
            if (r3 == 0) goto L_0x004d
            r0 = r2
        L_0x004d:
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.f = r2
            long r2 = java.lang.System.currentTimeMillis()
            r1.i = r2
            bxf r0 = new bxf
            r0.<init>(r1)
            return r0
        L_0x0061:
            org.webrtc.TextureBufferImpl r9 = (org.webrtc.TextureBufferImpl) r9
            org.webrtc.VideoFrame$I420Buffer r0 = r9.lambda$toI420$1()
            return r0
        L_0x0068:
            paf r9 = (defpackage.paf) r9
            kotlin.Lazy r0 = r9.d
            java.lang.Object r0 = r0.getValue()
            ln5 r0 = (defpackage.ln5) r0
            po5 r0 = (defpackage.po5) r0
            r0.getClass()
            android.content.Context r0 = r0.c
            java.io.File r1 = r0.getExternalFilesDir(r8)
            if (r1 != 0) goto L_0x0083
            java.io.File r1 = r0.getExternalCacheDir()
        L_0x0083:
            if (r1 != 0) goto L_0x0089
            java.io.File r1 = r0.getFilesDir()
        L_0x0089:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r1.getAbsolutePath()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x009b
            r0.mkdirs()
        L_0x009b:
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "font"
            java.io.File r0 = defpackage.po5.g(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "TamNotoColorEmojiCompat.ttf"
            r1.<init>(r0, r2)
            boolean r0 = defpackage.cjf.o(r1)
            if (r0 == 0) goto L_0x00dd
            kotlin.Lazy r0 = r9.c
            java.lang.Object r2 = r0.getValue()
            jtb r2 = (defpackage.jtb) r2
            ltb r2 = (defpackage.ltb) r2
            hq r2 = r2.c
            ls7 r2 = r2.g
            java.lang.String r3 = "app.extra.downloaded.emoji.font.url"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.Object r0 = r0.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            cud r0 = r0.b
            r0.getClass()
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x00dd
            r6 = r7
            goto L_0x00de
        L_0x00dd:
            r6 = 0
        L_0x00de:
            oaf r0 = new oaf
            r0.<init>(r1, r6)
            return r0
        L_0x00e4:
            srd r9 = (defpackage.srd) r9
            r9.getClass()
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.lang.Object r0 = r9.a
            java.io.File r0 = (java.io.File) r0
            r1.<init>(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x010b }
            gq9 r2 = new gq9     // Catch:{ all -> 0x010b }
            zp9 r3 = defpackage.tf6.e0(r1)     // Catch:{ all -> 0x010b }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x010b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0112 }
            r1.close()
            return r2
        L_0x010b:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0110:
            r2 = r0
            goto L_0x0114
        L_0x0112:
            r0 = move-exception
            goto L_0x0110
        L_0x0114:
            r1.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L_0x011d:
            throw r2
        L_0x011e:
            j6d r9 = (defpackage.j6d) r9
            i6d r0 = r9.m()
            return r0
        L_0x0125:
            n09 r9 = (defpackage.n09) r9
            java.lang.Object r0 = r9.b
            po5 r0 = (defpackage.po5) r0
            java.lang.Object r1 = r9.a
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = r0.r(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
        L_0x0138:
            g7a r9 = (defpackage.g7a) r9
            java.lang.Object r0 = r9.b
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r0 = defpackage.m5a.A(r0)
            return r0
        L_0x0143:
            t6e r9 = (defpackage.t6e) r9
            org.webrtc.EglBase r0 = r9.h
            if (r0 == 0) goto L_0x014d
            org.webrtc.EglBase$Context r8 = r0.getEglBaseContext()
        L_0x014d:
            return r8
        L_0x014e:
            jk3 r9 = (defpackage.jk3) r9
            java.lang.Object r0 = r9.b
            st3 r0 = (defpackage.st3) r0
            java.util.List r0 = r0.a()
            if (r0 != 0) goto L_0x015b
            goto L_0x0176
        L_0x015b:
            java.util.Iterator r0 = r0.iterator()
        L_0x015f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0176
            java.lang.Object r1 = r0.next()
            vk3 r1 = (defpackage.vk3) r1     // Catch:{ all -> 0x016f }
            r1.getClass()     // Catch:{ all -> 0x016f }
            goto L_0x015f
        L_0x016f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0176:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0179:
            one.me.rlottie.network.LottieDownload r9 = (one.me.rlottie.network.LottieDownload) r9
            lb8 r0 = one.me.rlottie.network.LottieDownload.start$lambda$3(r9)
            return r0
        L_0x0180:
            f58 r9 = (defpackage.f58) r9
            java.lang.String r1 = "Can't get video params for path "
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            android.content.Context r0 = r9.b     // Catch:{ all -> 0x01a3 }
            java.lang.String r5 = r9.a     // Catch:{ all -> 0x01a3 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x01a3 }
            r2.setDataSource(r0, r5)     // Catch:{ all -> 0x01a3 }
            android.graphics.Point r5 = defpackage.o5a.D(r2)     // Catch:{ all -> 0x01a3 }
            int r0 = defpackage.o5a.A(r2)     // Catch:{ all -> 0x01a1 }
            long r3 = (long) r0
        L_0x019d:
            defpackage.o5a.T(r2)
            goto L_0x01bd
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a3:
            r0 = move-exception
            r5 = r8
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            r2 = r8
            r5 = r2
        L_0x01a9:
            java.lang.String r7 = "f58"
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r11.<init>(r1)     // Catch:{ all -> 0x01df }
            r11.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x01df }
            defpackage.z68.f(r7, r1, r0)     // Catch:{ all -> 0x01df }
            goto L_0x019d
        L_0x01bd:
            hk5 r0 = new hk5
            java.lang.String r15 = r9.a
            if (r5 == 0) goto L_0x01c7
            int r1 = r5.x
            r12 = r1
            goto L_0x01c8
        L_0x01c7:
            r12 = 0
        L_0x01c8:
            if (r5 == 0) goto L_0x01ce
            int r6 = r5.y
            r13 = r6
            goto L_0x01cf
        L_0x01ce:
            r13 = 0
        L_0x01cf:
            int r14 = (int) r3
            r11 = 3
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            jk5 r1 = new jk5
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r1.<init>(r8, r0)
            return r1
        L_0x01df:
            r0 = move-exception
            defpackage.o5a.T(r2)
            throw r0
        L_0x01e4:
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01f4
            boolean r0 = defpackage.cjf.p(r9)
            if (r0 == 0) goto L_0x01f4
            r6 = r7
            goto L_0x01f5
        L_0x01f4:
            r6 = 0
        L_0x01f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x01fa:
            v00 r0 = defpackage.r62.I
            r62 r9 = (defpackage.r62) r9
            java.util.List r0 = r9.I(r0)
            return r0
        L_0x0203:
            ru.ok.android.externcalls.sdk.id.InternalIdsResolver r9 = (ru.ok.android.externcalls.sdk.id.InternalIdsResolver) r9
            java.util.Set r0 = r9.lambda$resolveIdsAndGetFailed$0()
            return r0
        L_0x020a:
            rt6 r9 = (defpackage.rt6) r9
            java.lang.Object r0 = r9.b
            androidx.work.impl.WorkDatabase r0 = (androidx.work.impl.WorkDatabase) r0
            wsb r1 = r0.u()
            java.lang.String r2 = "next_alarm_manager_id"
            java.lang.Long r1 = r1.Z(r2)
            if (r1 == 0) goto L_0x0222
            long r3 = r1.longValue()
            int r1 = (int) r3
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L_0x022a
            r6 = 0
            goto L_0x022c
        L_0x022a:
            int r6 = r1 + 1
        L_0x022c:
            wsb r0 = r0.u()
            vsb r3 = new vsb
            long r4 = (long) r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.<init>(r2, r4)
            r0.b0(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0242:
            ru.ok.messages.views.fragments.FrgContactProfile r9 = (ru.ok.messages.views.fragments.FrgContactProfile) r9
            sjd r0 = r9.q1
            q4 r0 = r0.getAccessor()
            java.lang.Class<s74> r1 = defpackage.s74.class
            java.lang.Object r0 = r0.g(r1)
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            c7d r0 = r0.e
            vk3 r1 = r9.W1
            long r1 = r1.s()
            xdb r0 = r0.f(r1)
            if (r0 == 0) goto L_0x0265
            int r6 = r0.o
            goto L_0x0266
        L_0x0265:
            r6 = 0
        L_0x0266:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            return r0
        L_0x026b:
            java.util.concurrent.Callable r9 = (java.util.concurrent.Callable) r9
            java.lang.Object r8 = r9.call()     // Catch:{ InterruptedException -> 0x027c, IllegalStateException -> 0x0272 }
            goto L_0x027b
        L_0x0272:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "Fresco"
            java.lang.String r2 = "failed to execute fresco task"
            defpackage.z68.f(r0, r2, r1)
        L_0x027b:
            return r8
        L_0x027c:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x027f:
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r0 = r9.getValue()
            fi5 r0 = (defpackage.fi5) r0
            return r0
        L_0x0288:
            java.lang.String r1 = "OKRTCCall"
            w28 r9 = (defpackage.w28) r9
            java.lang.Object r0 = r9.b
            r2 = r0
            voc r2 = (defpackage.voc) r2
            int r3 = android.media.MediaCodecList.getCodecCount()
            r4 = 0
        L_0x0296:
            if (r4 >= r3) goto L_0x02f8
            android.media.MediaCodecInfo r0 = android.media.MediaCodecList.getCodecInfoAt(r4)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r5 = r0.getName()     // Catch:{ Exception -> 0x02ed }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02ed }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ Exception -> 0x02ed }
            java.lang.String[] r10 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x02ed }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r11.<init>()     // Catch:{ Exception -> 0x02ed }
            java.lang.String r12 = "codec="
            r11.append(r12)     // Catch:{ Exception -> 0x02ed }
            r11.append(r0)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x02ed }
            r2.log(r1, r0)     // Catch:{ Exception -> 0x02ed }
            int r0 = r10.length     // Catch:{ Exception -> 0x02ed }
            r11 = 0
        L_0x02c6:
            if (r11 >= r0) goto L_0x02f6
            r12 = r10[r11]     // Catch:{ Exception -> 0x02ed }
            java.lang.String r13 = "avc"
            boolean r12 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r12, (java.lang.CharSequence) r13, false, 2, (java.lang.Object) null)     // Catch:{ Exception -> 0x02ed }
            if (r12 == 0) goto L_0x02ef
            java.lang.Object r12 = r9.c     // Catch:{ Exception -> 0x02ed }
            yoc r12 = (defpackage.yoc) r12     // Catch:{ Exception -> 0x02ed }
            jme r13 = defpackage.jme.app_event     // Catch:{ Exception -> 0x02ed }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ed }
            r14.<init>()     // Catch:{ Exception -> 0x02ed }
            java.lang.String r15 = "rtc.enc.hw."
            r14.append(r15)     // Catch:{ Exception -> 0x02ed }
            r14.append(r5)     // Catch:{ Exception -> 0x02ed }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x02ed }
            r12.log((defpackage.jme) r13, (java.lang.String) r14, (java.lang.String) r8)     // Catch:{ Exception -> 0x02ed }
            goto L_0x02ef
        L_0x02ed:
            r0 = move-exception
            goto L_0x02f1
        L_0x02ef:
            int r11 = r11 + r7
            goto L_0x02c6
        L_0x02f1:
            java.lang.String r5 = "codec.log"
            r2.reportException(r1, r5, r0)
        L_0x02f6:
            int r4 = r4 + r7
            goto L_0x0296
        L_0x02f8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02fb:
            wx0 r9 = (defpackage.wx0) r9
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.LinkedHashSet r11 = defpackage.wx0.l
            int r0 = r11.size()
            r10.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.i
            boolean r0 = r0.get()
            zx0 r12 = defpackage.zx0.a
            if (r0 == 0) goto L_0x0318
            r0 = r8
            goto L_0x049f
        L_0x0318:
            pl5 r13 = r9.a
            r13.getClass()
            ezf r14 = new ezf
            fzf r0 = r13.e
            yf9 r15 = r13.f
            java.lang.String r6 = "ezf"
            r14.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r14.a = r3
            wyf r4 = defpackage.wyf.UNKNOWN     // Catch:{ all -> 0x0340 }
            nh8 r0 = r0.f()     // Catch:{ all -> 0x0340 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0340 }
            java.lang.Object r0 = r0.c(r4)     // Catch:{ all -> 0x0340 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0340 }
            goto L_0x034a
        L_0x0340:
            r0 = move-exception
            java.lang.String r4 = "getUploadsFromRepository: failed"
            defpackage.z68.f(r6, r4, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x034a:
            java.util.Iterator r0 = r0.iterator()
        L_0x034e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0368
            java.lang.Object r4 = r0.next()
            bxf r4 = (defpackage.bxf) r4
            kxf r8 = r4.a
            java.lang.String r8 = r8.a
            defpackage.ezf.a(r3, r8)
            java.lang.String r4 = r4.b
            defpackage.ezf.a(r3, r4)
            r8 = 0
            goto L_0x034e
        L_0x0368:
            java.util.HashSet r3 = r14.a
            wh8 r0 = r15.a()     // Catch:{ all -> 0x0379 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0379 }
            java.lang.Object r0 = r0.c(r4)     // Catch:{ all -> 0x0379 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0379 }
            goto L_0x0383
        L_0x0379:
            r0 = move-exception
            java.lang.String r4 = "getMessageUploads: failed"
            defpackage.z68.f(r6, r4, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0383:
            java.util.Iterator r0 = r0.iterator()
        L_0x0387:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0399
            java.lang.Object r4 = r0.next()
            qf9 r4 = (defpackage.qf9) r4
            java.lang.String r4 = r4.b
            defpackage.ezf.a(r3, r4)
            goto L_0x0387
        L_0x0399:
            java.util.HashSet r0 = r14.a
            v00 r3 = defpackage.r62.I
            r62 r4 = r13.c
            java.util.List r3 = r4.I(r3)
            gb3 r3 = defpackage.jha.n(r3)
            hxf r4 = new hxf
            r4.<init>(r2)
            mha r6 = new mha
            r6.<init>(r3, r4, r7)
            hxf r3 = new hxf
            r3.<init>(r5)
            yia r4 = new yia
            r4.<init>(r6, r3, r2)
            hxf r3 = new hxf
            r3.<init>(r1)
            yia r6 = new yia
            r6.<init>(r4, r3, r5)
            oha r3 = r6.B()
            java.lang.Object r3 = r3.f()
            java.util.List r3 = (java.util.List) r3
            r0.addAll(r3)
            java.util.HashSet r0 = r14.a
            cd4 r3 = defpackage.oa9.b
            fa9 r3 = r13.d
            java.util.ArrayList r3 = r3.t()
            java.util.Iterator r3 = r3.iterator()
        L_0x03e0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0411
            java.lang.Object r4 = r3.next()
            ha9 r4 = (defpackage.ha9) r4
            boolean r6 = r4.o()
            if (r6 != 0) goto L_0x03f3
            goto L_0x03e0
        L_0x03f3:
            r6 = 0
        L_0x03f4:
            int r8 = r4.b()
            if (r6 >= r8) goto L_0x03e0
            w28 r8 = r4.x0
            if (r8 == 0) goto L_0x0403
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            goto L_0x0404
        L_0x0403:
            r8 = 0
        L_0x0404:
            java.lang.Object r8 = r8.get(r6)
            l20 r8 = (defpackage.l20) r8
            java.lang.String r8 = r8.r
            defpackage.ezf.a(r0, r8)
            int r6 = r6 + r7
            goto L_0x03f4
        L_0x0411:
            java.util.HashSet r0 = r14.a
            t4g r3 = r13.g
            java.util.HashMap r3 = r3.i
            java.util.Set r3 = r3.keySet()
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0423:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0435
            java.lang.Object r4 = r3.next()
            k4g r4 = (defpackage.k4g) r4
            java.lang.String r4 = r4.a
            defpackage.ezf.a(r0, r4)
            goto L_0x0423
        L_0x0435:
            ata r0 = new ata
            ol5 r3 = r13.j
            java.util.List r3 = r3.a
            r4 = 12
            r0.<init>(r4, r14, r3)
            rl5 r3 = r13.h
            java.io.File r4 = r3.a(r12)
            r6 = 0
            java.util.List r4 = r13.a(r4, r6, r0)
            java.util.List r6 = r3.j
            if (r6 != 0) goto L_0x0467
            ln5 r6 = r3.a
            po5 r6 = (defpackage.po5) r6
            android.content.Context r6 = r6.c
            java.io.File r8 = r6.getExternalCacheDir()
            java.io.File r6 = r6.getFilesDir()
            java.io.File[] r6 = new java.io.File[]{r8, r6}
            java.util.List r6 = java.util.Arrays.asList(r6)
            r3.j = r6
        L_0x0467:
            java.util.List r6 = r3.j
            if (r6 == 0) goto L_0x048a
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x048a
            java.util.Iterator r6 = r6.iterator()
        L_0x0475:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x048a
            java.lang.Object r8 = r6.next()
            java.io.File r8 = (java.io.File) r8
            r14 = 0
            java.util.List r8 = r13.a(r8, r14, r0)
            r4.addAll(r8)
            goto L_0x0475
        L_0x048a:
            oj4 r0 = r13.a
            java.util.Collections.sort(r4, r0)
            o5h r0 = new o5h
            ql5 r6 = r13.i
            r0.<init>()
            r0.a = r4
            r0.b = r6
            r0.c = r3
            java.lang.System.currentTimeMillis()
        L_0x049f:
            java.util.Iterator r3 = r11.iterator()
            r13 = 0
        L_0x04a5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x057a
            java.lang.Object r4 = r3.next()
            zx0 r4 = (defpackage.zx0) r4
            zx0 r6 = defpackage.zx0.w
            if (r4 != r6) goto L_0x04b6
            goto L_0x04a5
        L_0x04b6:
            if (r0 != 0) goto L_0x04bb
            r16 = 0
            goto L_0x04de
        L_0x04bb:
            java.lang.Object r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r16 = 0
        L_0x04c5:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x04de
            java.lang.Object r11 = r8.next()
            kx0 r11 = (defpackage.kx0) r11
            if (r4 == r12) goto L_0x04d7
            zx0 r15 = r11.d     // Catch:{ all -> 0x04c5 }
            if (r15 != r4) goto L_0x04c5
        L_0x04d7:
            long r1 = r11.b
            long r16 = r16 + r1
            r1 = 4
            r2 = 2
            goto L_0x04c5
        L_0x04de:
            zx0 r1 = defpackage.zx0.z
            if (r4 != r1) goto L_0x0510
            if (r0 != 0) goto L_0x04e7
            r18 = 0
            goto L_0x050e
        L_0x04e7:
            java.lang.Object r1 = r0.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r18 = 0
        L_0x04f1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x050e
            java.lang.Object r2 = r1.next()
            kx0 r2 = (defpackage.kx0) r2
            zx0 r8 = r2.d     // Catch:{ all -> 0x050b }
            if (r8 != r6) goto L_0x050b
            r20 = r6
            long r5 = r2.b
            long r18 = r18 + r5
        L_0x0507:
            r6 = r20
            r5 = 3
            goto L_0x04f1
        L_0x050b:
            r20 = r6
            goto L_0x0507
        L_0x050e:
            long r16 = r18 + r16
        L_0x0510:
            r1 = r16
            r5 = 0
            java.lang.String r6 = defpackage.ghf.x(r1, r7, r5)
            dx0 r5 = new dx0
            int r11 = r4.ordinal()
            u13 r8 = r9.d
            if (r11 == r7) goto L_0x0566
            r15 = 2
            if (r11 == r15) goto L_0x055d
            r15 = 3
            if (r11 == r15) goto L_0x0554
            r15 = 4
            if (r11 == r15) goto L_0x054b
            r15 = 6
            if (r11 == r15) goto L_0x0542
            r15 = 7
            if (r11 == r15) goto L_0x0539
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.t4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x0539:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.v4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x0542:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.s4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x054b:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.u4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x0554:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.q4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x055d:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.p4
            java.lang.String r8 = r8.getString(r11)
            goto L_0x056e
        L_0x0566:
            android.content.Context r8 = r8.a
            int r11 = defpackage.qad.r4
            java.lang.String r8 = r8.getString(r11)
        L_0x056e:
            r5.<init>(r8, r4, r6, r7)
            r10.add(r5)
            long r13 = r13 + r1
            r1 = 4
            r2 = 2
            r5 = 3
            goto L_0x04a5
        L_0x057a:
            ux0 r1 = new ux0
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0589
            r2 = 0
            r3 = 0
            java.lang.String r2 = defpackage.ghf.x(r13, r3, r2)
            goto L_0x058b
        L_0x0589:
            java.lang.String r2 = "0 KB"
        L_0x058b:
            r1.<init>(r0, r2, r10)
            return r1
        L_0x058f:
            vu0 r9 = (defpackage.vu0) r9
            wie r0 = r9.g
            r0.b0()
            nl5 r0 = r9.a
            up4 r0 = (defpackage.up4) r0
            r0.a()
            r1 = 0
            return r1
        L_0x059f:
            s60 r9 = (defpackage.s60) r9
            java.lang.String r0 = r9.i()
            r1 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 90000(0x15f90, float:1.26117E-40)
            f40 r3 = r9.c
            r4 = 3
            boolean r1 = r3.A(r4, r2, r1, r0)
            if (r1 != 0) goto L_0x05e2
            r1 = 30000(0x7530, float:4.2039E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 45000(0xafc8, float:6.3058E-41)
            boolean r1 = r3.A(r4, r2, r1, r0)
            if (r1 != 0) goto L_0x05e2
            r1 = 16000(0x3e80, float:2.2421E-41)
            r2 = 0
            boolean r4 = r3.A(r4, r1, r2, r0)
            if (r4 != 0) goto L_0x05e2
            r4 = 0
            boolean r0 = r3.A(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x05d8
            goto L_0x05e2
        L_0x05d8:
            android.content.Context r0 = r9.b
            int r1 = defpackage.qad.t
            defpackage.hi7.a0(r1, r0)
            r9.c()
        L_0x05e2:
            long r0 = java.lang.System.nanoTime()
            r9.v = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x05eb:
            int r0 = ru.ok.messages.views.ActAvatarCrop.I0
            ru.ok.messages.views.ActAvatarCrop r9 = (ru.ok.messages.views.ActAvatarCrop) r9
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "ru.ok.tamtam.extra.URI"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r0 = defpackage.m5a.A(r0)
            boolean r1 = r9.H0
            if (r1 == 0) goto L_0x0608
            int r1 = r0.getHeight()
            goto L_0x060c
        L_0x0608:
            int r1 = r0.getWidth()
        L_0x060c:
            boolean r2 = r9.H0
            if (r2 == 0) goto L_0x0615
            int r2 = r0.getWidth()
            goto L_0x0619
        L_0x0615:
            int r2 = r0.getHeight()
        L_0x0619:
            android.graphics.Bitmap$Config r3 = r0.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            boolean r4 = r9.H0
            android.graphics.Matrix r5 = r9.G0
            if (r4 == 0) goto L_0x063c
            float r4 = (float) r1
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
            float r2 = (float) r2
            int r8 = r0.getHeight()
            float r8 = (float) r8
            float r2 = r2 - r8
            float r2 = r2 / r6
            r5.postTranslate(r4, r2)
        L_0x063c:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r3)
            r4 = 0
            r2.drawBitmap(r0, r5, r4)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r5 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r2 = r2.getStringExtra(r5)
            dm4 r5 = r9.x
            java.lang.Object r5 = r5.b
            id3 r5 = (defpackage.id3) r5
            qra r5 = (defpackage.qra) r5
            ltb r5 = r5.y()
            cud r5 = r5.b
            defpackage.o5a.d0(r2, r3, r5)
            r0.recycle()
            r3.recycle()
            ru.ok.messages.views.widgets.AvatarCropView r0 = r9.z0
            bsg r0 = r0.getZoomableController()
            e44 r0 = (defpackage.e44) r0
            android.graphics.Rect r0 = r0.c(r1)
            android.graphics.Point r1 = r9.F0
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r0.toString()
            int r3 = r0.width()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r0.height()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r5}
            java.lang.String r2 = "ru.ok.messages.views.ActAvatarCrop"
            java.lang.String r3 = "image crop finished, image size: %s, cropped bounds: %s, cropped width: %d, cropped height: %d"
            defpackage.z68.c(r2, r3, r1)
            dm4 r1 = r9.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            ltb r1 = r1.y()
            cud r1 = r1.b
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f79minimagesidesize
            r3 = 64
            long r5 = (long) r3
            long r1 = r1.r(r2, r5)
            int r1 = (int) r1
            int r2 = r0.width()
            if (r2 < r1) goto L_0x06c1
            int r2 = r0.height()
            if (r2 >= r1) goto L_0x06bf
            goto L_0x06c1
        L_0x06bf:
            r8 = r0
            goto L_0x06cb
        L_0x06c1:
            int r0 = defpackage.qad.y5
            java.lang.String r0 = r9.getString(r0)
            defpackage.hi7.b0(r7, r9, r0)
            r8 = r4
        L_0x06cb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5.call():java.lang.Object");
    }
}
