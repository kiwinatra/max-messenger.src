package defpackage;

/* renamed from: l5c  reason: default package */
public enum l5c {
    ADD_TO_CONTACT_LIST(lic.add_to_contact_list),
    CREATE_MULTICHAT(lic.create_multichat),
    UNBLOCK_CONTACT(lic.unblock_contact),
    SHARE_CONTACT(lic.share_contact),
    SHARE_CHANNEL(lic.share_channel),
    SUSPEND_BOT(lic.suspend_bot),
    REQUEST_LOCATION(lic.request_location),
    ALL_CHAT_PARTICIPANTS(lic.all_chat_participants),
    INVITE_TO_TT(lic.invite_to_tt);
    
    public final int a;

    /* access modifiers changed from: public */
    l5c(int i) {
        this.a = i;
    }
}
