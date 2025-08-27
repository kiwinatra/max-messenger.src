package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: x5  reason: default package */
public final class x5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ActChatPickerCompat a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x5(ActChatPickerCompat actChatPickerCompat, ArrayList arrayList, String str, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.a = actChatPickerCompat;
        this.b = arrayList;
        this.c = str;
        this.o = arrayList2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x5(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = ActChatPickerCompat.y;
        ActChatPickerCompat actChatPickerCompat = this.a;
        actChatPickerCompat.getClass();
        ArrayList arrayList = this.b;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("ru.ok.tamtam.extra.CHAT_IDS", CollectionsKt.toLongArray(arrayList));
            intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_IDS", CollectionsKt.toLongArray(this.o));
            if (actChatPickerCompat.getIntent().hasExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE")) {
                intent.putExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE", actChatPickerCompat.getIntent().getBundleExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE"));
            }
            String str = this.c;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                intent.putExtra("ru.ok.tamtam.extra.DESCRIPTION", str);
            }
            if (actChatPickerCompat.getIntent().hasExtra("ru.ok.tamtam.extra_FOLDER_ID")) {
                intent.putExtra("ru.ok.tamtam.extra_FOLDER_ID", actChatPickerCompat.getIntent().getStringExtra("ru.ok.tamtam.extra_FOLDER_ID"));
            }
            intent.putExtra("act:chat_picker:serial", actChatPickerCompat.getIntent().getSerializableExtra("act:chat_picker:serial"));
            actChatPickerCompat.setResult(-1, intent);
        } else {
            actChatPickerCompat.setResult(0);
        }
        actChatPickerCompat.finish();
        return Unit.INSTANCE;
    }
}
