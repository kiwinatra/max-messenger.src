package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.logout.LogoutScreen;
import one.me.appearancesettings.AppearanceSettingsScreen;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.DevMenuScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.folders.list.FoldersListScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.nano.Protos;

/* renamed from: i  reason: default package */
public final /* synthetic */ class i implements ya4 {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new AboutAppSettingsScreen();
            case 1:
                return new ForceUpdateScreen();
            case 2:
                return new AppearanceSettingsScreen();
            case 3:
                return new PipScreen();
            case 4:
                return new CallHistoryScreen();
            case 5:
                return new ChatsListSearchScreen();
            case 6:
                return new kt3(0);
            case 7:
                return new ContactListWidget(eq3.a);
            case 8:
                return new DevMenuScreen();
            case 9:
                return new LogsViewerScreen();
            case 10:
                return new kt3(1);
            case 11:
                return new ServerHostBottomSheet();
            case 12:
                return new ServerPortBottomSheet();
            case 13:
                return new FoldersListScreen();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new FakeInAppReviewBottomSheet();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new InviteByPhoneScreen();
            case 16:
                return new InviteByQrBottomSheet();
            case LangUtils.HASH_SEED /*17*/:
                return new FragmentWrapperWidget(-1045510686, FrgContactMultiPicker.class, "ru.ok.messages.contacts.picker.FrgContactMultiPicker", FrgContactMultiPicker.i3((long[]) null, 2, 1, 0, true));
            case 18:
                return new LoginScreen();
            case 19:
                return new LogoutScreen();
            case 20:
                return new MediaPickerScreen(new ql6(false, false, false, false, CollectionsKt.emptyList(), false, false));
            case 21:
                return new MessagesSettingsScreen();
            case 22:
                return new NotificationsSettingsScreen();
            case 23:
                return new ChatNotificationsSettingsScreen();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new DialogNotificationsSettingsScreen();
            case 25:
                return new OtherNotificationsSettingsScreen();
            case 26:
                String simpleName = Reflection.getOrCreateKotlinClass(ActSettings.class).getSimpleName();
                if (simpleName != null) {
                    return new ActivityWrapperWidget(simpleName, new duc(7));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 27:
                return new SettingMediaScreen();
            case 28:
                return new StartConversationScreen();
            default:
                return new PickChatMembers();
        }
    }
}
