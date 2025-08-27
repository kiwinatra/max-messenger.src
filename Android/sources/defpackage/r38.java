package defpackage;

import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: r38  reason: default package */
public final class r38 extends cne {
    public final /* synthetic */ xvb X;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ bwb x;
    public final /* synthetic */ yvb y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r38(zi0 zi0, bwb bwb, yvb yvb, hif hif) {
        super(zi0, bwb, yvb, "BackgroundThreadHandoffProducer");
        this.z = zi0;
        this.x = bwb;
        this.y = yvb;
        this.X = hif;
    }

    private final void h(Object obj) {
    }

    public final void b(Object obj) {
        switch (this.w) {
            case 0:
                j55.b((j55) obj);
                return;
            case 1:
                y33.U((y33) obj);
                return;
            default:
                return;
        }
    }

    public Map c(Object obj) {
        switch (this.w) {
            case 1:
                return xb7.a("createdThumbnail", String.valueOf(((y33) obj) != null));
            default:
                return super.c(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[SYNTHETIC, Splitter:B:44:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r8 = this;
            int r0 = r8.w
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r8 = 0
            return r8
        L_0x0007:
            xvb r0 = r8.X
            e58 r0 = (defpackage.e58) r0
            java.lang.Object r1 = r8.z
            qa7 r1 = (defpackage.qa7) r1
            r2 = 0
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x001c }
            android.net.Uri r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x001c }
            android.content.ContentResolver r4 = r0.c     // Catch:{ IllegalArgumentException -> 0x001c }
            java.lang.String r3 = defpackage.mzf.a(r4, r3)     // Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x003c
            v3d r4 = r1.i
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0028
            int r6 = r4.a
            goto L_0x0029
        L_0x0028:
            r6 = r5
        L_0x0029:
            r7 = 96
            if (r6 > r7) goto L_0x0036
            if (r4 == 0) goto L_0x0031
            int r5 = r4.b
        L_0x0031:
            if (r5 <= r7) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r4 = 3
            goto L_0x0037
        L_0x0036:
            r4 = 1
        L_0x0037:
            android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r4)
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r3 != 0) goto L_0x0076
            android.content.ContentResolver r0 = r0.c
            android.net.Uri r1 = r1.b
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r0.getClass()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.setDataSource(r0)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r3 = -1
            android.graphics.Bitmap r0 = r1.getFrameAtTime(r3)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.release()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r3 = r0
            goto L_0x0076
        L_0x0063:
            r8 = move-exception
            r2 = r1
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            goto L_0x006a
        L_0x0068:
            r1 = r2
            goto L_0x0070
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.release()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r8
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r1.release()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            r3 = r2
        L_0x0076:
            if (r3 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            pf6 r0 = defpackage.pf6.j()
            bc7 r1 = defpackage.bc7.d
            r2 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of((android.graphics.Bitmap) r3, (defpackage.b4d) r0, (defpackage.tac) r1, (int) r2)
            yvb r8 = r8.y
            ik0 r8 = (defpackage.ik0) r8
            java.lang.String r1 = "image_format"
            java.lang.String r2 = "thumbnail"
            r8.putExtra(r1, r2)
            java.util.HashMap r8 = r8.w
            r0.putExtras(r8)
            jd4 r2 = defpackage.y33.p0(r0)
        L_0x0098:
            return r2
        L_0x0099:
            java.lang.Object r0 = r8.z
            qa7 r0 = (defpackage.qa7) r0
            xvb r1 = r8.X
            s38 r1 = (defpackage.s38) r1
            j55 r0 = r1.d(r0)
            java.lang.String r2 = "fetch"
            java.lang.String r3 = "local"
            bwb r4 = r8.x
            yvb r8 = r8.y
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = r1.e()
            r1 = 0
            r4.e(r8, r0, r1)
            ik0 r8 = (defpackage.ik0) r8
            r8.h(r3, r2)
            r0 = 0
            goto L_0x00d8
        L_0x00be:
            r0.U()
            java.lang.String r1 = r1.e()
            r5 = 1
            r4.e(r8, r1, r5)
            ik0 r8 = (defpackage.ik0) r8
            r8.h(r3, r2)
            r0.m0()
            android.graphics.ColorSpace r1 = r0.X
            java.lang.String r2 = "image_color_space"
            r8.putExtra(r2, r1)
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r38.d():java.lang.Object");
    }

    public void f(Exception exc) {
        switch (this.w) {
            case 1:
                super.f(exc);
                bwb bwb = this.x;
                yvb yvb = this.y;
                bwb.e(yvb, "VideoThumbnailProducer", false);
                ((ik0) yvb).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                return;
            default:
                super.f(exc);
                return;
        }
    }

    public void g(Object obj) {
        switch (this.w) {
            case 1:
                y33 y33 = (y33) obj;
                super.g(y33);
                boolean z2 = y33 != null;
                bwb bwb = this.x;
                yvb yvb = this.y;
                bwb.e(yvb, "VideoThumbnailProducer", z2);
                ((ik0) yvb).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                return;
            case 2:
                bwb bwb2 = this.x;
                yvb yvb2 = this.y;
                bwb2.a(yvb2, "BackgroundThreadHandoffProducer", (Map) null);
                ((hif) this.X).b.a((zi0) this.z, yvb2);
                return;
            default:
                super.g(obj);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r38(s38 s38, zi0 zi0, bwb bwb, yvb yvb, String str, qa7 qa7, bwb bwb2, yvb yvb2) {
        super(zi0, bwb, yvb, str);
        this.X = s38;
        this.z = qa7;
        this.x = bwb2;
        this.y = yvb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r38(e58 e58, zi0 zi0, bwb bwb, yvb yvb, bwb bwb2, yvb yvb2, qa7 qa7) {
        super(zi0, bwb, yvb, "VideoThumbnailProducer");
        this.X = e58;
        this.x = bwb2;
        this.y = yvb2;
        this.z = qa7;
    }
}
