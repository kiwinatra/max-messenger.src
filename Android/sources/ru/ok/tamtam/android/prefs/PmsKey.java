package ru.ok.tamtam.android.prefs;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension({"SMAP\nPmsKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PmsKey.kt\nru/ok/tamtam/android/prefs/PmsKey\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1202#2,2:238\n1230#2,4:240\n*S KotlinDebug\n*F\n+ 1 PmsKey.kt\nru/ok/tamtam/android/prefs/PmsKey\n*L\n231#1:238,2\n231#1:240,4\n*E\n"})
@Keep
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u0001\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\bj\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001¨\u0006\u0001"}, d2 = {"Lru/ok/tamtam/android/prefs/PmsKey;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "fullContentString$prefs_release", "fullContentString", "Companion", "fqb", "set-unread-timeout", "proxy", "video-preview", "debug-mode", "proxy-domains", "image-width", "image-height", "image-quality", "image-size", "max-msg-length", "max-participants", "max-audio-length", "max-theme-length", "max-description-length", "edit-timeout", "chats-page-size", "keep-connection", "sticker-sections", "stickers-suggestion", "invite-link", "invite-short", "invite-long", "invite-header", "max-cname-length", "v-size-grp", "t-ice-reconnect", "file-upload-max-size", "file-upload-unsupported-types", "music-files-enabled", "chats-preload-period", "max-favorite-chats", "disconnect-timeout", "max-attach-count", "push-alert-timeout", "live-location-enabled", "live-location-release-date", "live-location-send-timeout", "support-account", "support-email", "wakelock-on-push", "mentions_entity_names_limit", "max-readmarks", "max-video-duration-download", "talking-on-muted-mic-trigger-diff", "max-favorite-stickers", "max-favorite-sticker-sets", "min-sticker-size", "max-sticker-size", "default-sticker-size", "min-image-side-size", "min-duration-save-audio-start-time", "valid-interval-audio-start-time", "min-duration-playback-speed", "drafts-sync-enabled", "audio-transcription-locales", "scheduled-messages-enabled", "tracer-non-fatal-crashed-enabled", "subscription-timeout-seconds", "double-tap-reaction", "reactions-max", "react-errors", "msg-get-reactions-page-size", "wm-workers-limit", "wm-check-workers-count-interval-sec", "wm-backlog-worker-check-delay-sec", "wm-backlog-worker-backoff-delay-sec", "wm-workers-offset", "wm-analytics-enabled", "progress-diff-for-notify", "worker-progress-time-diff-for-notify-ms", "max-downloaded-size-for-notify-kb", "fb-exec-replace", "fb-exec-modifiers-names", "log-full", "log-sensitive", "anr-config", "debug-profile-info", "calls-endpoint", "fake-chats", "channels-enabled", "available-complaints", "in-app-review-triggers", "fake-in-app-review", "welcome-sticker-ids", "money-transfer-botid", "non-contact-sync-time", "non-contact-max-chunk-size", "non-contact-collection-interval", "edit-chat-type-screen-enabled", "gce", "lgce", "sse", "gsse", "grse", "account-nickname-enabled", "send-location-enabled", "reconnect-call-ringtone", "new-toolbar-enabled", "new-media-viewer-enabled", "media-viewer-video-collage-enabled", "new-uploader-enabled", "mytracker-enabled", "chat-video-autoplay-parallel-count", "chat-complaint-enabled", "bot-complaint-enabled", "calls-sdk-audio-dynamic-redundancy", "ext-file-sharing", "conn-timeouts", "safe-mode-enabled", "media-transform", "max-rate-call-threshold", "call-minimum-duration-to-rate", "call-rate", "send-queue-size", "webapp-ds-keys-count", "webapp-ss-keys-count", "ext-sharing-video", "chat-invite-link-permissions-enabled", "chat-animoji-enabled", "edit-channel-type-screen-enabled", "chat-anim", "send-logs-interval-sec", "saved-messages-enabled", "saved-messages-aliases", "video-msg-enabled", "analytics-permissions", "stat-session-background-threshold", "bot-start-param", "js-download-delegate", "esia-enabled", "new-admin-permissions", "prefs_release"}, k = 1, mv = {2, 0, 0})
public enum PmsKey {
    f105setunreadtimeout,
    proxy,
    f118videopreview,
    f26debugmode,
    f93proxydomains,
    f47imagewidth,
    f44imageheight,
    f45imagequality,
    f46imagesize,
    f68maxmsglength,
    f69maxparticipants,
    f61maxaudiolength,
    f73maxthemelength,
    f63maxdescriptionlength,
    f34edittimeout,
    f23chatspagesize,
    f54keepconnection,
    f107stickersections,
    f108stickerssuggestion,
    f50invitelink,
    f52inviteshort,
    f51invitelong,
    f49inviteheader,
    f62maxcnamelength,
    f115vsizegrp,
    f112ticereconnect,
    f42fileuploadmaxsize,
    f43fileuploadunsupportedtypes,
    f83musicfilesenabled,
    f24chatspreloadperiod,
    f65maxfavoritechats,
    f29disconnecttimeout,
    f60maxattachcount,
    f94pushalerttimeout,
    f55livelocationenabled,
    f56livelocationreleasedate,
    f57livelocationsendtimeout,
    f110supportaccount,
    f111supportemail,
    f119wakelockonpush,
    mentions_entity_names_limit,
    f71maxreadmarks,
    f74maxvideodurationdownload,
    f113talkingonmutedmictriggerdiff,
    f67maxfavoritestickers,
    f66maxfavoritestickersets,
    f80minstickersize,
    f72maxstickersize,
    f28defaultstickersize,
    f79minimagesidesize,
    f78mindurationsaveaudiostarttime,
    f116validintervalaudiostarttime,
    f77mindurationplaybackspeed,
    f31draftssyncenabled,
    f9audiotranscriptionlocales,
    f101scheduledmessagesenabled,
    f114tracernonfatalcrashedenabled,
    f109subscriptiontimeoutseconds,
    f30doubletapreaction,
    f96reactionsmax,
    f95reacterrors,
    f82msggetreactionspagesize,
    f127wmworkerslimit,
    f126wmcheckworkerscountintervalsec,
    f125wmbacklogworkercheckdelaysec,
    f124wmbacklogworkerbackoffdelaysec,
    f128wmworkersoffset,
    f123wmanalyticsenabled,
    f92progressdifffornotify,
    f129workerprogresstimedifffornotifyms,
    f64maxdownloadedsizefornotifykb,
    f41fbexecreplace,
    f40fbexecmodifiersnames,
    f58logfull,
    f59logsensitive,
    f8anrconfig,
    f27debugprofileinfo,
    f15callsendpoint,
    f38fakechats,
    f17channelsenabled,
    f10availablecomplaints,
    f48inappreviewtriggers,
    f39fakeinappreview,
    f122welcomestickerids,
    f81moneytransferbotid,
    f91noncontactsynctime,
    f90noncontactmaxchunksize,
    f89noncontactcollectioninterval,
    f33editchattypescreenenabled,
    gce,
    lgce,
    sse,
    gsse,
    grse,
    f6accountnicknameenabled,
    f102sendlocationenabled,
    f97reconnectcallringtone,
    f87newtoolbarenabled,
    f86newmediaviewerenabled,
    f76mediaviewervideocollageenabled,
    f88newuploaderenabled,
    f84mytrackerenabled,
    f22chatvideoautoplayparallelcount,
    f20chatcomplaintenabled,
    f11botcomplaintenabled,
    f16callssdkaudiodynamicredundancy,
    f36extfilesharing,
    f25conntimeouts,
    f98safemodeenabled,
    f75mediatransform,
    f70maxratecallthreshold,
    f13callminimumdurationtorate,
    f14callrate,
    f104sendqueuesize,
    f120webappdskeyscount,
    f121webappsskeyscount,
    f37extsharingvideo,
    f21chatinvitelinkpermissionsenabled,
    f19chatanimojienabled,
    f32editchanneltypescreenenabled,
    f18chatanim,
    f103sendlogsintervalsec,
    f100savedmessagesenabled,
    f99savedmessagesaliases,
    f117videomsgenabled,
    f7analyticspermissions,
    f106statsessionbackgroundthreshold,
    f12botstartparam,
    f53jsdownloaddelegate,
    f35esiaenabled,
    f85newadminpermissions;
    
    public static final fqb Companion = null;
    /* access modifiers changed from: private */
    public static final Lazy<Map<String, PmsKey>> keys$delegate = null;

    /* JADX WARNING: type inference failed for: r0v133, types: [fqb, java.lang.Object] */
    static {
        PmsKey[] $values;
        $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        Companion = new Object();
        keys$delegate = LazyKt.lazy(new lgb(19));
    }

    public static EnumEntries<PmsKey> getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: private */
    public static final Map keys_delegate$lambda$1() {
        EnumEntries<PmsKey> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10)), 16));
        for (T next : entries) {
            linkedHashMap.put(((PmsKey) next).name(), next);
        }
        return linkedHashMap;
    }

    public final String fullContentString$prefs_release() {
        return wj6.k("\"", name(), "\"");
    }

    public String toString() {
        return name();
    }
}
