package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;

@SourceDebugExtension({"SMAP\nAddParticipantsCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddParticipantsCommands.kt\nru/ok/android/externcalls/sdk/participant/AddParticipantsCommands$addParticipants$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1603#2,9:148\n1855#2:157\n1856#2:159\n1612#2:160\n1603#2,9:161\n1855#2:170\n1856#2:172\n1612#2:173\n1603#2,9:174\n1855#2:183\n1856#2:185\n1612#2:186\n1603#2,9:187\n1855#2:196\n1856#2:198\n1612#2:199\n1#3:158\n1#3:171\n1#3:184\n1#3:197\n*S KotlinDebug\n*F\n+ 1 AddParticipantsCommands.kt\nru/ok/android/externcalls/sdk/participant/AddParticipantsCommands$addParticipants$1\n*L\n90#1:148,9\n90#1:157\n90#1:159\n90#1:160\n91#1:161,9\n91#1:170\n91#1:172\n91#1:173\n92#1:174,9\n92#1:183\n92#1:185\n92#1:186\n93#1:187,9\n93#1:196\n93#1:198\n93#1:199\n90#1:158\n91#1:171\n92#1:184\n93#1:197\n*E\n"})
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo9e;", "signaling", "", "invoke", "(Lo9e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AddParticipantsCommands$addParticipants$1 extends Lambda implements Function1<o9e, Unit> {
    final /* synthetic */ boolean $isShowChatHistory;
    final /* synthetic */ Boolean $isUnban;
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function1<AddParticipantsResult, Unit> $onSuccess;
    final /* synthetic */ Collection<ue1> $participantsIds;
    final /* synthetic */ AddParticipantsCommands this$0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        static {
            /*
                r0 = 2
                int[] r1 = defpackage.tr1.A(r0)
                int r1 = r1.length
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddParticipantsCommands$addParticipants$1(Collection<ue1> collection, Boolean bool, boolean z, Function1<? super Throwable, Unit> function1, AddParticipantsCommands addParticipantsCommands, Function1<? super AddParticipantsResult, Unit> function12) {
        super(1);
        this.$participantsIds = collection;
        this.$isUnban = bool;
        this.$isShowChatHistory = z;
        this.$onError = function1;
        this.this$0 = addParticipantsCommands;
        this.$onSuccess = function12;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$4(AddParticipantsCommands addParticipantsCommands, Function1 function1, Function1 function12, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has("participants")) {
                JSONArray jSONArray = jSONObject.getJSONArray("participants");
                int length = jSONObject.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        ue1 F = tf6.F(optJSONObject);
                        int y = tr1.y(addParticipantsCommands.call.y(F, optJSONObject));
                        if (y == 0) {
                            arrayList.add(F);
                        } else if (y == 1) {
                            arrayList2.add(F);
                        }
                    }
                }
            }
            if (function1 != null) {
                Iterable<ue1> R = tf6.R(jSONObject, "rejectedParticipantIds");
                if (R == null) {
                    R = CollectionsKt.emptyList();
                }
                Iterable<ue1> R2 = tf6.R(jSONObject, "bannedParticipantIds");
                if (R2 == null) {
                    R2 = CollectionsKt.emptyList();
                }
                IdMappingWrapper access$getMappings$p = addParticipantsCommands.mappings;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ParticipantId byInternal = access$getMappings$p.getByInternal((ue1) it.next());
                    if (byInternal != null) {
                        arrayList3.add(byInternal);
                    }
                }
                IdMappingWrapper access$getMappings$p2 = addParticipantsCommands.mappings;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ParticipantId byInternal2 = access$getMappings$p2.getByInternal((ue1) it2.next());
                    if (byInternal2 != null) {
                        arrayList4.add(byInternal2);
                    }
                }
                IdMappingWrapper access$getMappings$p3 = addParticipantsCommands.mappings;
                ArrayList arrayList5 = new ArrayList();
                for (ue1 byInternal3 : R) {
                    ParticipantId byInternal4 = access$getMappings$p3.getByInternal(byInternal3);
                    if (byInternal4 != null) {
                        arrayList5.add(byInternal4);
                    }
                }
                IdMappingWrapper access$getMappings$p4 = addParticipantsCommands.mappings;
                ArrayList arrayList6 = new ArrayList();
                for (ue1 byInternal5 : R2) {
                    ParticipantId byInternal6 = access$getMappings$p4.getByInternal(byInternal5);
                    if (byInternal6 != null) {
                        arrayList6.add(byInternal6);
                    }
                }
                function1.invoke(new AddParticipantsResult(arrayList3, arrayList4, arrayList5, arrayList6));
            }
        } catch (JSONException e) {
            if (function12 != null) {
                function12.invoke(new RuntimeException("add.participant.success", e));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$5(Function1 function1, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(addParticipantsCommands.parseAddError(jSONObject));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o9e) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(o9e o9e) {
        try {
            rp6 i = tf6.i(this.$participantsIds, this.$isUnban, this.$isShowChatHistory);
            AddParticipantsCommands addParticipantsCommands = this.this$0;
            Function1<AddParticipantsResult, Unit> function1 = this.$onSuccess;
            Function1<Throwable, Unit> function12 = this.$onError;
            o9e.d(i, false, new c(addParticipantsCommands, function1, function12), new b(function12, addParticipantsCommands, 1));
        } catch (JSONException e) {
            Function1<Throwable, Unit> function13 = this.$onError;
            if (function13 != null) {
                function13.invoke(new RuntimeException("add.participant", e));
            }
        }
    }
}
