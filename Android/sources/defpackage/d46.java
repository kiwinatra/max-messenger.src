package defpackage;

import kotlin.jvm.functions.Function1;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: d46  reason: default package */
public final /* synthetic */ class d46 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderSettingsFragment b;

    public /* synthetic */ d46(FolderSettingsFragment folderSettingsFragment, int i) {
        this.a = i;
        this.b = folderSettingsFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        r7 = r6.i3();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x0146;
                case 1: goto L_0x0122;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            bw3 r7 = (defpackage.bw3) r7
            boolean r0 = r7 instanceof defpackage.aw3
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r6 = r6.b
            if (r0 == 0) goto L_0x003b
            int r7 = defpackage.ydc.context_dialog_item_height
            android.content.res.Resources r0 = r6.R1()
            int r7 = r0.getDimensionPixelSize(r7)
            int r0 = defpackage.ydc.folder_grabberview_height
            android.content.res.Resources r1 = r6.R1()
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = defpackage.ydc.folder_context_menu_margin
            android.content.res.Resources r2 = r6.R1()
            int r1 = r2.getDimensionPixelSize(r1)
            f46 r2 = r6.C1
            androidx.recyclerview.widget.RecyclerView r2 = r2.d()
            e46 r3 = new e46
            r3.<init>(r6, r7, r0, r1)
            r2.post(r3)
            goto L_0x00cc
        L_0x003b:
            boolean r0 = r7 instanceof defpackage.zv3
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005f
            f46 r7 = r6.C1
            ru.ok.messages.settings.folders.view.LockableNestedScrollView r7 = r7.f()
            r7.setScrollEnabled(r3)
            m56 r7 = r6.F1
            if (r7 == 0) goto L_0x0052
            r7.g(r1)
        L_0x0052:
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r7 = r6.i3()
            r7.n = r2
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.o = r2
            goto L_0x00cc
        L_0x005f:
            boolean r0 = r7 instanceof defpackage.yv3
            if (r0 == 0) goto L_0x00cf
            f46 r0 = r6.C1
            ru.ok.messages.settings.folders.view.LockableNestedScrollView r0 = r0.f()
            r0.setScrollEnabled(r3)
            yv3 r7 = (defpackage.yv3) r7
            xv3 r7 = r7.a
            int r7 = r7.a
            int r0 = defpackage.lic.change_folder_action
            if (r7 != r0) goto L_0x009b
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r7 = r6.i3()
            x16 r0 = r7.o
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r0.a
            if (r0 != 0) goto L_0x0083
            goto L_0x00c0
        L_0x0083:
            o85 r3 = new o85
            w46 r4 = new w46
            z26 r5 = new z26
            r5.<init>(r0, r1)
            r4.<init>(r5)
            r3.<init>(r4)
            xme r7 = r7.k
            r7.getClass()
            r7.m(r2, r3)
            goto L_0x00c0
        L_0x009b:
            int r0 = defpackage.lic.disable_folder_action
            if (r7 != r0) goto L_0x00c0
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r7 = r6.i3()
            x16 r0 = r7.o
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r0.a
            if (r0 != 0) goto L_0x00ac
            goto L_0x00c0
        L_0x00ac:
            nd r1 = r7.g
            java.lang.String r3 = "FOLDER_DELETE"
            r1.e(r3)
            u33 r1 = defpackage.b0h.C(r7)
            b56 r3 = new b56
            r3.<init>(r7, r0, r2)
            r7 = 3
            defpackage.ev0.v(r1, r2, r2, r3, r7)
        L_0x00c0:
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r7 = r6.i3()
            r7.n = r2
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.o = r2
        L_0x00cc:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00d5:
            xla r7 = (defpackage.xla) r7
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r6 = r6.b
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.k()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x00e3:
            x16 r7 = (defpackage.x16) r7
            boolean r0 = r7.e
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r6 = r6.b
            if (r0 != 0) goto L_0x0101
            android.content.Context r0 = r6.G2()
            android.content.Context r1 = r6.G2()
            int r2 = defpackage.qad.D2
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L_0x0101:
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.getClass()
            boolean r0 = r7.e
            if (r0 != 0) goto L_0x0111
            r0 = 1
            r6.j(r7, r0)
            goto L_0x011f
        L_0x0111:
            u33 r0 = defpackage.b0h.C(r6)
            d56 r1 = new d56
            r2 = 0
            r1.<init>(r7, r2, r6)
            r6 = 3
            defpackage.ev0.v(r0, r2, r2, r1, r6)
        L_0x011f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0122:
            x16 r7 = (defpackage.x16) r7
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r6 = r6.b
            android.content.Context r0 = r6.G2()
            android.content.Context r1 = r6.G2()
            int r2 = defpackage.qad.D2
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.j(r7, r2)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0146:
            x16 r7 = (defpackage.x16) r7
            boolean r0 = r7.e
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r6 = r6.b
            if (r0 != 0) goto L_0x0164
            android.content.Context r0 = r6.G2()
            android.content.Context r1 = r6.G2()
            int r2 = defpackage.qad.D2
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L_0x0164:
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r6 = r6.i3()
            r6.getClass()
            boolean r0 = r7.e
            if (r0 != 0) goto L_0x0174
            r0 = 1
            r6.j(r7, r0)
            goto L_0x0182
        L_0x0174:
            u33 r0 = defpackage.b0h.C(r6)
            d56 r1 = new d56
            r2 = 0
            r1.<init>(r7, r2, r6)
            r6 = 3
            defpackage.ev0.v(r0, r2, r2, r1, r6)
        L_0x0182:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d46.invoke(java.lang.Object):java.lang.Object");
    }
}
