package defpackage;

import android.os.Bundle;

/* renamed from: o1a  reason: default package */
public final /* synthetic */ class o1a implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ o1a(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "ru.ok.tamtam.extra.EXTRA_TOOLBAR_VISIBLE"
            java.lang.String r3 = "j4a"
            java.lang.String r4 = "ru.ok.tamtam.extra.SLIDE_STATE"
            java.lang.String r5 = "ru.ok.tamtam.extra.GRID_STATE"
            ose r6 = defpackage.ose.STICKERS
            android.os.Bundle r7 = r8.b
            int r8 = r8.a
            switch(r8) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x0051;
                default: goto L_0x0013;
            }
        L_0x0013:
            j4a r9 = (defpackage.j4a) r9
            ru.ok.messages.stickers.widgets.StickersView r8 = r9.x0
            rse r8 = r8.v
            c0 r8 = r8.E(r6)
            boolean r6 = r8 instanceof defpackage.nse
            if (r6 == 0) goto L_0x0028
            nse r8 = (defpackage.nse) r8
            int r8 = r8.y0
            r7.putInt(r5, r8)
        L_0x0028:
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r8 = r9.w0
            rre r8 = r8.o
            int r8 = r8.ordinal()
            r7.putInt(r4, r8)
            jkd r8 = r9.z0
            if (r8 == 0) goto L_0x003a
            r8.g(r3, r7)
        L_0x003a:
            b33 r8 = r9.y0
            if (r8 == 0) goto L_0x0050
            java.lang.String r9 = r3.concat(r2)
            java.lang.Object r8 = r8.c
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x004d
            r0 = r1
        L_0x004d:
            r7.putBoolean(r9, r0)
        L_0x0050:
            return
        L_0x0051:
            j4a r9 = (defpackage.j4a) r9
            ru.ok.messages.stickers.widgets.StickersView r8 = r9.x0
            rse r8 = r8.v
            c0 r8 = r8.E(r6)
            boolean r6 = r8 instanceof defpackage.nse
            if (r6 == 0) goto L_0x006a
            nse r8 = (defpackage.nse) r8
            r8.getClass()
            int r5 = r7.getInt(r5, r1)
            r8.y0 = r5
        L_0x006a:
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r8 = r9.w0
            r8.getClass()
            rre[] r5 = defpackage.rre.values()
            rre r6 = defpackage.rre.a
            int r4 = r7.getInt(r4, r0)
            r4 = r5[r4]
            r8.o = r4
            android.content.Context r4 = r8.getContext()
            boolean r4 = defpackage.ld9.I(r4)
            if (r4 != 0) goto L_0x008f
            rre r4 = r8.o
            rre r5 = defpackage.rre.b
            if (r4 != r5) goto L_0x008f
            r8.o = r6
        L_0x008f:
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r8 = r9.w0
            rre r8 = r8.getState()
            rre r4 = defpackage.rre.c
            if (r8 != r4) goto L_0x00a8
            r8 = 4
            android.view.View r4 = r9.w
            if (r4 == 0) goto L_0x00a1
            r4.setVisibility(r8)
        L_0x00a1:
            android.view.View r4 = r9.v
            if (r4 == 0) goto L_0x00a8
            r4.setVisibility(r8)
        L_0x00a8:
            jkd r8 = r9.z0
            if (r8 == 0) goto L_0x00af
            r8.f(r3, r7)
        L_0x00af:
            b33 r8 = r9.y0
            if (r8 == 0) goto L_0x00c3
            java.lang.String r9 = r3.concat(r2)
            boolean r9 = r7.getBoolean(r9, r1)
            if (r9 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r0 = 8
        L_0x00c0:
            r8.m(r0)
        L_0x00c3:
            return
        L_0x00c4:
            s3a r9 = (defpackage.s3a) r9
            s60 r8 = r9.v
            r60 r9 = r8.m
            java.lang.String r0 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_STATE"
            r7.putSerializable(r0, r9)
            r60 r9 = r8.m
            r60 r0 = defpackage.r60.c
            if (r9 == r0) goto L_0x0100
            java.lang.String r9 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_ID"
            long r0 = r8.w
            r7.putLong(r9, r0)
            java.lang.String r9 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_DURATION"
            long r0 = r8.x
            r7.putLong(r9, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r0 = r8.l
            r9.<init>(r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.AUDIO_VIEW_WAVE_DATA"
            r7.putIntegerArrayList(r0, r9)
            l20 r8 = r8.n
            if (r8 == 0) goto L_0x0100
            ru.ok.tamtam.nano.Protos$Attaches$Attach r8 = ru.ok.tamtam.nano.b.d(r8)
            byte[] r8 = defpackage.ad9.toByteArray(r8)
            java.lang.String r9 = "ru.ok.tamtam.extra.SERVER_ATTACH"
            r7.putByteArray(r9, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1a.accept(java.lang.Object):void");
    }
}
