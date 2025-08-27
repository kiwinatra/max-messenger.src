package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: kpc  reason: default package */
public enum kpc {
    AUDIO_FREEZES("AUDIO_FREEZES"),
    AUDIO_CALL_INTERRUPTION("AUDIO_CALL_INTERRUPTION"),
    VOICE_COMMUNICATION_PROBLEM("VOICE_COMMUNICATION_PROBLEM"),
    AUDIO_QUALITY("AUDIO_QUALITY"),
    AUDIO_ECHO("AUDIO_ECHO"),
    VIDEO_FREEZES("VIDEO_FREEZES"),
    VIDEO_QUALITY("VIDEO_QUALITY"),
    VIDEO_SYNC("VIDEO_SYNC"),
    VIDEO_CALL_INTERRUPTION("VIDEO_CALL_INTERRUPTION"),
    USERS_FREEZES("USERS_FREEZES"),
    OTHER((String) null);
    
    public static final dbe b = null;
    public final String a;

    static {
        kpc[] kpcArr;
        x0 = EnumEntriesKt.enumEntries((E[]) kpcArr);
        b = new dbe(17);
    }

    /* access modifiers changed from: public */
    kpc(String str) {
        this.a = str;
    }
}
