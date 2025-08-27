package defpackage;

import java.io.Serializable;
import ru.ok.messages.contacts.profile.ActContactAvatars;

/* renamed from: a6  reason: default package */
public final /* synthetic */ class a6 implements x6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ a6(mq0 mq0, long j, nq0 nq0) {
        this.c = mq0;
        this.b = j;
        this.d = nq0;
    }

    public final void run() {
        Serializable serializable = this.d;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                int i = ActContactAvatars.L0;
                String str = (String) serializable;
                ((qra) ((id3) ((ActContactAvatars) obj).x.b)).m().f((String) null, this.b, str, str);
                return;
            default:
                mq0 mq0 = (mq0) obj;
                mq0.getClass();
                nq0 nq0 = (nq0) serializable;
                boolean B = cjf.B(nq0.a);
                long j = this.b;
                ln5 ln5 = mq0.a;
                if (B) {
                    try {
                        ((po5) ln5).e(j).delete();
                        return;
                    } catch (Exception unused) {
                        z68.c("mq0", "deleteBotCommandsForChat: exception when delete botCommands for, chatId = %d", Long.valueOf(j));
                        return;
                    }
                } else if (!cjf.R(((po5) ln5).e(j), nq0)) {
                    z68.c("mq0", "Failed to store botCommands, chatId = %d", Long.valueOf(j));
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ a6(ActContactAvatars actContactAvatars, String str, long j) {
        this.c = actContactAvatars;
        this.d = str;
        this.b = j;
    }
}
