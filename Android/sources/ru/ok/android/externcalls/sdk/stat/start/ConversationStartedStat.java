package ru.ok.android.externcalls.sdk.stat.start;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "", "Lkotlin/Function0;", "Lc51;", "getEventualStatSender", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lrjf;", "timeProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ok/android/externcalls/sdk/Conversation$CallType;Lrjf;)V", "", "report", "()V", "", "asString", "(Lru/ok/android/externcalls/sdk/Conversation$CallType;)Ljava/lang/String;", "getWarmupStatusString", "()Ljava/lang/String;", "onConversationStarted", "Lkotlin/jvm/functions/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "Lrjf;", "", "isReported", "Z", "", "startTimeMs", "J", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nConversationStartedStat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationStartedStat.kt\nru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n766#2:81\n857#2,2:82\n1549#2:84\n1620#2,3:85\n1855#2,2:88\n*S KotlinDebug\n*F\n+ 1 ConversationStartedStat.kt\nru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat\n*L\n38#1:81\n38#1:82,2\n39#1:84\n39#1:85,3\n43#1:88,2\n*E\n"})
public final class ConversationStartedStat {
    @Deprecated
    public static final String CALL_TYPE_INCOMING = "incoming";
    @Deprecated
    public static final String CALL_TYPE_JOIN = "join";
    @Deprecated
    public static final String CALL_TYPE_OUTGOING = "outgoing";
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String STATUS_FINISHED = "warmup_finished";
    @Deprecated
    public static final String STATUS_IN_PROGRESS = "warmup_inprogress";
    @Deprecated
    public static final String STATUS_STARTED = "warmup_start";
    private final Conversation.CallType callType;
    private final Function0<c51> getEventualStatSender;
    private boolean isReported;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final rjf timeProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat$Companion;", "", "()V", "CALL_TYPE_INCOMING", "", "CALL_TYPE_JOIN", "CALL_TYPE_OUTGOING", "STATUS_FINISHED", "STATUS_IN_PROGRESS", "STATUS_STARTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ru.ok.android.externcalls.sdk.Conversation$CallType[] r0 = ru.ok.android.externcalls.sdk.Conversation.CallType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.sdk.Conversation$CallType r1 = ru.ok.android.externcalls.sdk.Conversation.CallType.Incoming     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.sdk.Conversation$CallType r1 = ru.ok.android.externcalls.sdk.Conversation.CallType.Outgoing     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.ok.android.externcalls.sdk.Conversation$CallType r1 = ru.ok.android.externcalls.sdk.Conversation.CallType.Join     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat.WhenMappings.<clinit>():void");
        }
    }

    public ConversationStartedStat(Function0<? extends c51> function0, Conversation.CallType callType2, rjf rjf) {
        this.getEventualStatSender = function0;
        this.callType = callType2;
        this.timeProvider = rjf;
        ((sjf) rjf).getClass();
    }

    private final String asString(Conversation.CallType callType2) {
        int i = WhenMappings.$EnumSwitchMapping$0[callType2.ordinal()];
        if (i == 1) {
            return CALL_TYPE_INCOMING;
        }
        if (i == 2) {
            return CALL_TYPE_OUTGOING;
        }
        if (i == 3) {
            return CALL_TYPE_JOIN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getWarmupStatusString() {
        return STATUS_STARTED;
    }

    private final void report() {
        ((sjf) this.timeProvider).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTimeMs;
        c51 invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(elapsedRealtime);
            EventItemsMap eventItemsMap = new EventItemsMap();
            ArrayList arrayList = new ArrayList();
            for (Object next : CollectionsKt.listOf(asString(this.callType), getWarmupStatusString())) {
                if (!StringsKt.isBlank((String) next)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(EventItemValue.StringValue.m1598boximpl(EventItemValue.StringValue.m1599constructorimpl((String) it.next())));
            }
            if (!arrayList2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                Unit unit = Unit.INSTANCE;
                eventItemsMap.set("string_value", jSONObject.put("labels", (Object) jSONArray).toString());
            }
            Unit unit2 = Unit.INSTANCE;
            ((d51) invoke).c("call_start", eventItemValue, eventItemsMap);
        }
    }

    public final void onConversationStarted() {
        if (!this.isReported) {
            this.isReported = true;
            report();
        }
    }
}
