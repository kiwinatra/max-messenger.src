package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f  reason: default package */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i, Object obj) {
        super(1, obj, n.class, "onVersionClick", "onVersionClick(Ljava/lang/String;)V", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(1, obj, jr.class, "onAppearanceModeSelected", "onAppearanceModeSelected(Lone/me/appearancesettings/model/AppearanceMode;)V", 0);
                return;
            case 2:
                super(1, obj, lw0.class, "bindLoading", "bindLoading(Lru/ok/tamtam/models/bots/Keyboard;)V", 0);
                return;
            case 4:
                super(1, obj, mp1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0);
                return;
            case 7:
                super(1, obj, s32.class, "onBackgroundSelected", "onBackgroundSelected(Lone/me/appearancesettings/model/ChatBackground;)V", 0);
                return;
            case 8:
                super(1, obj, le2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0);
                return;
            case 9:
                super(1, obj, le2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0);
                return;
            case 10:
                super(1, obj, le2.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0);
                return;
            case 11:
                super(1, obj, le2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0);
                return;
            case 12:
                super(1, obj, le2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0);
                return;
            case 13:
                super(1, obj, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                super(1, obj, yw2.class, "onChatItemClick", "onChatItemClick(J)V", 0);
                return;
            case 18:
                super(1, obj, ug5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0);
                return;
            case 19:
                super(1, obj, ug5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0);
                return;
            case 20:
                super(1, obj, ug5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0);
                return;
            case 21:
                super(1, obj, ug5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0);
                return;
            case 22:
                super(1, obj, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0);
                return;
            case 25:
                super(1, obj, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0);
                return;
            case 26:
                super(1, obj, ps6.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0);
                return;
            case 27:
                super(1, obj, std.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0);
                return;
            case 28:
                super(1, obj, ak7.class, "onInviteActionClick", "onInviteActionClick(Lone/me/inviteactions/list/InviteActionListItem$Type;)V", 0);
                return;
            case 29:
                super(1, obj, dn7.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v15, types: [e9d] */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0435, code lost:
        if (r4.longValue() != ((defpackage.qjd) ((defpackage.x23) r0.y.getValue())).s()) goto L_0x0437;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x05b1;
                case 1: goto L_0x0517;
                case 2: goto L_0x04a6;
                case 3: goto L_0x0490;
                case 4: goto L_0x0482;
                case 5: goto L_0x0474;
                case 6: goto L_0x0409;
                case 7: goto L_0x03d9;
                case 8: goto L_0x03c9;
                case 9: goto L_0x03b9;
                case 10: goto L_0x0308;
                case 11: goto L_0x02f8;
                case 12: goto L_0x02e8;
                case 13: goto L_0x0235;
                case 14: goto L_0x0216;
                case 15: goto L_0x0200;
                case 16: goto L_0x01ea;
                case 17: goto L_0x01d4;
                case 18: goto L_0x01ad;
                case 19: goto L_0x019a;
                case 20: goto L_0x0173;
                case 21: goto L_0x0160;
                case 22: goto L_0x00dd;
                case 23: goto L_0x00c3;
                case 24: goto L_0x00a9;
                case 25: goto L_0x0046;
                case 26: goto L_0x0038;
                case 27: goto L_0x0028;
                case 28: goto L_0x001a;
                default: goto L_0x000c;
            }
        L_0x000c:
            r1 = r20
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            dn7 r0 = (defpackage.dn7) r0
            r0.i(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x001a:
            r1 = r20
            wj7 r1 = (defpackage.wj7) r1
            java.lang.Object r0 = r0.receiver
            ak7 r0 = (defpackage.ak7) r0
            r0.u(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0028:
            r1 = r20
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            std r0 = (defpackage.std) r0
            c37 r0 = r0.a
            r0.l(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0038:
            r1 = r20
            qs6 r1 = (defpackage.qs6) r1
            java.lang.Object r0 = r0.receiver
            ps6 r0 = (defpackage.ps6) r0
            r0.B(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0046:
            r1 = r20
            g0g r1 = (defpackage.g0g) r1
            java.lang.Object r0 = r0.receiver
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = (one.me.folders.pickerfolders.FoldersPickerScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.folders.pickerfolders.FoldersPickerScreen.z
            r0.getClass()
            f0g r2 = r1.b
            int[] r6 = defpackage.n76.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r6[r2]
            if (r2 != r5) goto L_0x00a6
            l86 r0 = r0.c0()
            r0.getClass()
            zx5 r1 = r1.a
            if (r1 != 0) goto L_0x006b
            goto L_0x00a6
        L_0x006b:
            xme r2 = r0.v0
            java.lang.Object r6 = r2.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = kotlin.collections.CollectionsKt.toMutableSet(r6)
            java.lang.String r1 = r1.a
            boolean r7 = r6.remove(r1)
            if (r7 != 0) goto L_0x0082
            r6.add(r1)
        L_0x0082:
            r2.m(r4, r6)
            java.util.concurrent.atomic.AtomicReference r1 = r0.Z
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            java.lang.Object r2 = r2.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r3 = r1 ^ 1
        L_0x009a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            xme r0 = r0.X
            r0.getClass()
            r0.m(r4, r1)
        L_0x00a6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a9:
            r2 = r20
            iqd r2 = (defpackage.iqd) r2
            java.lang.Object r0 = r0.receiver
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r0 = (ru.ok.messages.settings.folders.picker.FoldersPickerViewModel) r0
            r0.getClass()
            u33 r3 = defpackage.b0h.C(r0)
            d86 r5 = new d86
            r5.<init>(r0, r2, r4)
            defpackage.ev0.v(r3, r4, r4, r5, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c3:
            r2 = r20
            w16 r2 = (defpackage.w16) r2
            java.lang.Object r0 = r0.receiver
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r0 = (ru.ok.messages.settings.folders.picker.FoldersPickerViewModel) r0
            r0.getClass()
            u33 r3 = defpackage.b0h.C(r0)
            b86 r5 = new b86
            r5.<init>(r0, r2, r4)
            defpackage.ev0.v(r3, r4, r4, r5, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00dd:
            r3 = r20
            g0g r3 = (defpackage.g0g) r3
            java.lang.Object r0 = r0.receiver
            one.me.folders.list.FoldersListScreen r0 = (one.me.folders.list.FoldersListScreen) r0
            kotlin.reflect.KProperty[] r6 = one.me.folders.list.FoldersListScreen.x
            r0.getClass()
            f0g r6 = r3.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x015d
            zx5 r3 = r3.a
            if (r6 == r5) goto L_0x0149
            if (r6 == r2) goto L_0x013d
            if (r6 != r1) goto L_0x0137
            w66 r0 = r0.c0()
            r0.getClass()
            if (r3 != 0) goto L_0x0104
            goto L_0x0116
        L_0x0104:
            gaf r1 = r0.c
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.a()
            u66 r6 = new u66
            r6.<init>(r3, r0, r4)
            jx3 r0 = r0.a
            defpackage.ev0.v(r0, r1, r4, r6, r2)
        L_0x0116:
            i66 r0 = defpackage.i66.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<qc7> r1 = defpackage.qc7.class
            java.lang.Object r0 = r0.j(r1)
            qc7 r0 = (defpackage.qc7) r0
            if (r0 == 0) goto L_0x015d
            pc7 r1 = new pc7
            nc7 r2 = defpackage.nc7.CREATE_FOLDER
            r1.<init>(r2, r5)
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            jgd r2 = defpackage.jgd.SETTINGS_FOLDERS
            r0.f(r1, r2)
            goto L_0x015d
        L_0x0137:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x013d:
            w66 r0 = r0.c0()
            s85 r0 = r0.x
            n66 r1 = defpackage.n66.b
            defpackage.xag.h(r0, r1)
            goto L_0x015d
        L_0x0149:
            w66 r0 = r0.c0()
            r0.getClass()
            if (r3 != 0) goto L_0x0153
            goto L_0x015d
        L_0x0153:
            t66 r2 = new t66
            r2.<init>(r3, r0, r4)
            jx3 r0 = r0.a
            defpackage.ev0.v(r0, r4, r4, r2, r1)
        L_0x015d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0160:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            ug5 r0 = (defpackage.ug5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            r0.g0()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0173:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            ug5 r0 = (defpackage.ug5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            tw2 r0 = r0.f0()
            jx3 r1 = r0.a
            gaf r3 = r0.w
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            xv2 r7 = new xv2
            r7.<init>(r0, r5, r4)
            defpackage.ev0.v(r1, r3, r4, r7, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x019a:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            ug5 r0 = (defpackage.ug5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            r0.g0()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01ad:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            ug5 r0 = (defpackage.ug5) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            tw2 r0 = r0.f0()
            jx3 r1 = r0.a
            gaf r3 = r0.w
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            xv2 r7 = new xv2
            r7.<init>(r0, r5, r4)
            defpackage.ev0.v(r1, r3, r4, r7, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01d4:
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "web_app:ssl_check"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01ea:
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.enable_in_app_review_not_from_market_build"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0200:
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.disable_in_app_review_time_condition"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0216:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            yw2 r0 = (defpackage.yw2) r0
            r0.getClass()
            ox2 r2 = defpackage.ox2.b
            r8 = 0
            r9 = 0
            java.lang.String r5 = "local"
            r6 = 0
            r7 = 0
            r10 = 124(0x7c, float:1.74E-43)
            defpackage.ox2.p1(r2, r3, r5, r6, r7, r8, r9, r10)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0235:
            r1 = r20
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.chatmedia.viewer.ChatMediaViewerScreen.H0
            aj2 r2 = r0.r0()
            hr8 r3 = r2.r()
            boolean r4 = r3 instanceof defpackage.yq8
            if (r4 == 0) goto L_0x024e
            int r4 = defpackage.dra.d
            goto L_0x0254
        L_0x024e:
            boolean r4 = r3 instanceof defpackage.fr8
            if (r4 == 0) goto L_0x02bb
            int r4 = defpackage.dra.e
        L_0x0254:
            java.util.List r5 = kotlin.collections.CollectionsKt.createListBuilder()
            ow3 r12 = new ow3
            int r7 = defpackage.cra.m
            int r6 = defpackage.dra.g
            igf r8 = new igf
            r8.<init>(r6)
            int r6 = defpackage.lya.A
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r11 = 20
            r10 = 0
            r6 = r12
            r6.<init>((int) r7, (defpackage.ngf) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            r5.add(r12)
            ow3 r6 = new ow3
            int r14 = defpackage.cra.k
            int r7 = defpackage.dra.f
            igf r15 = new igf
            r15.<init>(r7)
            int r7 = defpackage.cad.n1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r18 = 20
            r17 = 0
            r13 = r6
            r13.<init>((int) r14, (defpackage.ngf) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (int) r18)
            r5.add(r6)
            long r6 = r3.j()
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b6
            boolean r2 = r2.w
            if (r2 != 0) goto L_0x02b6
            ow3 r2 = new ow3
            int r7 = defpackage.cra.j
            igf r8 = new igf
            r8.<init>(r4)
            int r3 = defpackage.bra.c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r11 = 20
            r10 = 0
            r6 = r2
            r6.<init>((int) r7, (defpackage.ngf) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            r5.add(r2)
        L_0x02b6:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r5)
            goto L_0x02bf
        L_0x02bb:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x02bf:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x02c6
            goto L_0x02e5
        L_0x02c6:
            ix3 r3 = defpackage.ix3.a
            lw3 r3 = defpackage.m58.b(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            lw3 r2 = r3.h(r2)
            lw3 r1 = r2.o(r1)
            lw3 r1 = r1.d()
            lw3 r1 = r1.f()
            mw3 r1 = r1.build()
            r1.o(r0)
        L_0x02e5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02e8:
            r1 = r20
            m29 r1 = (defpackage.m29) r1
            java.lang.Object r0 = r0.receiver
            le2 r0 = (defpackage.le2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.e0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02f8:
            r1 = r20
            m29 r1 = (defpackage.m29) r1
            java.lang.Object r0 = r0.receiver
            le2 r0 = (defpackage.le2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.e0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0308:
            r1 = r20
            j29 r1 = (defpackage.j29) r1
            java.lang.Object r0 = r0.receiver
            le2 r0 = (defpackage.le2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            java.lang.String r2 = r1.v
            mgf r6 = new mgf
            r6.<init>(r2)
            long r7 = r1.b
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "selected_message_id"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r7, r2)
            long r7 = r1.c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "selected_attach_id"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r8, r7)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r2, r7}
            android.os.Bundle r2 = defpackage.o54.f(r2)
            r7 = 4
            ng3 r2 = defpackage.b0h.a(r6, r2, r7)
            java.lang.CharSequence r1 = r1.x
            java.lang.String r1 = java.lang.String.valueOf(r1)
            mgf r6 = new mgf
            r6.<init>(r1)
            r2.f(r6)
            pg3 r1 = new pg3
            int r6 = defpackage.jxa.a0
            int r7 = defpackage.lxa.x1
            igf r8 = new igf
            r8.<init>(r7)
            og3 r7 = defpackage.og3.b
            r1.<init>(r6, r8, r7)
            pg3[] r1 = new defpackage.pg3[]{r1}
            r2.a(r1)
            pg3 r1 = new pg3
            int r6 = defpackage.jxa.V
            int r8 = defpackage.lxa.p1
            igf r9 = new igf
            r9.<init>(r8)
            r1.<init>(r6, r9, r7)
            pg3[] r1 = new defpackage.pg3[]{r1}
            r2.a(r1)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r7 = r2.e()
            r7.setTargetController(r0)
            r1 = r0
        L_0x0385:
            zx3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0390
            zx3 r1 = r1.getParentController()
            goto L_0x0385
        L_0x0390:
            boolean r2 = r1 instanceof defpackage.l9d
            if (r2 == 0) goto L_0x0397
            l9d r1 = (defpackage.l9d) r1
            goto L_0x0398
        L_0x0397:
            r1 = r4
        L_0x0398:
            if (r1 == 0) goto L_0x039e
            e9d r4 = r1.K()
        L_0x039e:
            r7.p0(r0)
            if (r4 == 0) goto L_0x03b6
            i9d r0 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = "BottomSheetWidget"
            defpackage.a81.t(r3, r0, r5, r1)
            r4.G(r0)
        L_0x03b6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03b9:
            r1 = r20
            m29 r1 = (defpackage.m29) r1
            java.lang.Object r0 = r0.receiver
            le2 r0 = (defpackage.le2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.e0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03c9:
            r1 = r20
            m29 r1 = (defpackage.m29) r1
            java.lang.Object r0 = r0.receiver
            le2 r0 = (defpackage.le2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.e0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03d9:
            r1 = r20
            y32 r1 = (defpackage.y32) r1
            java.lang.Object r0 = r0.receiver
            s32 r0 = (defpackage.s32) r0
            u32 r0 = r0.a
            t32 r0 = r0.c
            if (r0 == 0) goto L_0x0406
            nr r0 = (defpackage.nr) r0
            as r0 = r0.a
            boolean r2 = r0.o()
            if (r2 == 0) goto L_0x03fc
            kf0 r2 = r0.x0
            vr r4 = new vr
            r4.<init>(r0, r1, r3)
            r0.t(r5, r2, r1, r4)
            goto L_0x0406
        L_0x03fc:
            kf0 r2 = r0.w0
            vr r4 = new vr
            r4.<init>(r0, r1, r5)
            r0.t(r3, r2, r1, r4)
        L_0x0406:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0409:
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            q32 r0 = (defpackage.q32) r0
            a32 r6 = r0.j()
            if (r6 == 0) goto L_0x041f
            java.lang.Long r4 = r6.e(r1)
        L_0x041f:
            if (r4 == 0) goto L_0x0437
            kotlin.Lazy r1 = r0.y
            java.lang.Object r1 = r1.getValue()
            x23 r1 = (defpackage.x23) r1
            qjd r1 = (defpackage.qjd) r1
            long r1 = r1.s()
            long r6 = r4.longValue()
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0443
        L_0x0437:
            a32 r1 = r0.j()
            if (r1 == 0) goto L_0x0445
            boolean r1 = r1.e0()
            if (r1 != r5) goto L_0x0445
        L_0x0443:
            r1 = r5
            goto L_0x0446
        L_0x0445:
            r1 = r3
        L_0x0446:
            kotlin.Lazy r2 = r0.x
            java.lang.Object r2 = r2.getValue()
            uj5 r2 = (defpackage.uj5) r2
            vj5 r2 = (defpackage.vj5) r2
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x0458
            if (r1 == 0) goto L_0x0459
        L_0x0458:
            r3 = r5
        L_0x0459:
            m7f r0 = r0.z
            if (r3 == 0) goto L_0x046c
            java.lang.Object r0 = r0.o
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            ow3 r0 = (defpackage.ow3) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x0473
        L_0x046c:
            r0.getClass()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0473:
            return r0
        L_0x0474:
            r1 = r20
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            mp1 r0 = (defpackage.mp1) r0
            defpackage.mp1.a(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0482:
            r1 = r20
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            mp1 r0 = (defpackage.mp1) r0
            defpackage.mp1.a(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0490:
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.calls_sdk.logging.webrtc"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04a6:
            r1 = r20
            eq7 r1 = (defpackage.eq7) r1
            java.lang.Object r0 = r0.receiver
            lw0 r0 = (defpackage.lw0) r0
            r0.y = r1
            java.util.List r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L_0x04b8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0508
            java.lang.Object r2 = r1.next()
            ew0 r2 = (defpackage.ew0) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x04c8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04b8
            java.lang.Object r4 = r2.next()
            r7 = r4
            xv0 r7 = (defpackage.xv0) r7
            java.util.ArrayList r4 = r0.x
            int r4 = r4.size()
            int r4 = r4 - r5
            if (r3 <= r4) goto L_0x04df
            goto L_0x0508
        L_0x04df:
            java.util.ArrayList r4 = r0.x
            java.lang.Object r4 = r4.get(r3)
            uq0 r4 = (defpackage.uq0) r4
            xv0 r6 = r4.a
            if (r7 == r6) goto L_0x0506
            java.util.ArrayList r14 = r0.x
            uq0 r15 = new uq0
            boolean r10 = r4.d
            boolean r11 = r4.e
            a20 r8 = r4.b
            int r9 = r4.c
            boolean r12 = r4.f
            float[] r13 = r4.g
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r4 = r4.h
            r15.h = r4
            r14.set(r3, r15)
        L_0x0506:
            int r3 = r3 + r5
            goto L_0x04c8
        L_0x0508:
            b r1 = new b
            r2 = 19
            r1.<init>((int) r2, (java.lang.Object) r0)
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0517:
            r1 = r20
            yq r1 = (defpackage.yq) r1
            java.lang.Object r0 = r0.receiver
            jr r0 = (defpackage.jr) r0
            as r0 = r0.a
            yq r6 = r0.B0
            if (r6 != r1) goto L_0x0527
            goto L_0x05ae
        L_0x0527:
            r0.B0 = r1
            kotlin.enums.EnumEntries r6 = defpackage.yq.v
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x053e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x055c
            java.lang.Object r8 = r6.next()
            yq r8 = (defpackage.yq) r8
            ar r9 = new ar
            if (r8 != r1) goto L_0x0550
            r10 = r5
            goto L_0x0551
        L_0x0550:
            r10 = r3
        L_0x0551:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r8, r10)
            r7.add(r9)
            goto L_0x053e
        L_0x055c:
            xme r3 = r0.C0
            r3.getClass()
            r3.m(r4, r7)
            int r1 = r1.ordinal()
            fu4 r3 = r0.Y
            hq r4 = r0.c
            if (r1 == 0) goto L_0x0594
            if (r1 == r5) goto L_0x0586
            if (r1 != r2) goto L_0x0580
            java.lang.String r1 = "app.night.mode.enabled"
            r4.F(r1)
            h9a r1 = defpackage.h9a.b
            r3.j(r1)
            r0.q()
            goto L_0x05ab
        L_0x0580:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0586:
            java.lang.String r1 = "app.night.mode"
            r4.F(r1)
            g9a r1 = defpackage.g9a.b
            r3.j(r1)
            r0.r()
            goto L_0x05ab
        L_0x0594:
            java.lang.String r1 = "app.night.mode.system"
            r4.F(r1)
            j9a r1 = defpackage.j9a.b
            r3.j(r1)
            boolean r1 = r0.o()
            if (r1 == 0) goto L_0x05a8
            r0.q()
            goto L_0x05ab
        L_0x05a8:
            r0.r()
        L_0x05ab:
            r0.u()
        L_0x05ae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05b1:
            r1 = r20
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            n r0 = (defpackage.n) r0
            r0.getClass()
            int r2 = one.me.aboutappsettings.AboutAppSettingsScreen.c
            one.me.aboutappsettings.AboutAppSettingsScreen r0 = r0.a
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            v r0 = (defpackage.v) r0
            r0.getClass()
            u r2 = new u
            r2.<init>(r1)
            s85 r0 = r0.b
            defpackage.xag.h(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(mp1 mp1) {
        super(1, mp1, mp1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0);
        this.a = 5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(q32 q32) {
        super(1, q32, q32.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0);
        this.a = 6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(x23 x23, int i) {
        super(1, x23, x23.class, "setWebRtcLoggingEnabled", "setWebRtcLoggingEnabled(Z)V", 0);
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                super(1, x23, x23.class, "setDisableInAppReviewTimeCondition", "setDisableInAppReviewTimeCondition(Z)V", 0);
                return;
            case 16:
                super(1, x23, x23.class, "setEnableInAppReviewNotFromMarketBuild", "setEnableInAppReviewNotFromMarketBuild(Z)V", 0);
                return;
            case LangUtils.HASH_SEED /*17*/:
                super(1, x23, x23.class, "setDisableWebAppSsl", "setDisableWebAppSsl(Z)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(FoldersPickerViewModel foldersPickerViewModel, int i) {
        super(1, foldersPickerViewModel, FoldersPickerViewModel.class, "onFolderClick", "onFolderClick(Lru/ok/messages/settings/folders/picker/FolderModel;)V", 0);
        this.a = i;
        switch (i) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                super(1, foldersPickerViewModel, FoldersPickerViewModel.class, "onRemoveSelectionFolder", "onRemoveSelectionFolder(Lru/ok/messages/settings/folders/picker/SelectedFolderModel;)V", 0);
                return;
            default:
                return;
        }
    }
}
