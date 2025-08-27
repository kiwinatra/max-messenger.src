package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

@SourceDebugExtension({"SMAP\nPrepare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Prepare.kt\nru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$executeSimple$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llbe;", "Lz4b;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Llbe;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$executeSimple$1 extends Lambda implements Function0<lbe> {
    final /* synthetic */ Prepare this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Prepare$executeSimple$1(Prepare prepare) {
        super(0);
        this.this$0 = prepare;
    }

    public final lbe invoke() {
        z4b z4b = null;
        if (this.this$0.providedParams != null || this.this$0.isCaller) {
            ConversationParams access$getProvidedParams$p = this.this$0.providedParams;
            if (access$getProvidedParams$p != null) {
                z4b = new z4b(access$getProvidedParams$p);
            }
            if (z4b == null) {
                z4b = z4b.b;
            }
            return lbe.h(z4b);
        }
        Prepare prepare = this.this$0;
        return prepare.retryForApiCall(prepare.okApiService.getConversationParams((String) null, this.this$0.isAnswer ? ((lz3) this.this$0.cidProvider).a : null)).i(AnonymousClass2.INSTANCE);
    }
}
