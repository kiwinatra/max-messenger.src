package one.me.sdk.transfer.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/exceptions/TamHttpErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transfer_release"}, k = 1, mv = {2, 0, 0})
public class TamHttpErrorException extends Exception {
    public final u47 a;

    public TamHttpErrorException() {
        this((String) null, (u47) null);
    }

    public final String toString() {
        String message = getMessage();
        return "TamHttpErrorException(msg='" + message + "', error=" + this.a + ")";
    }

    public TamHttpErrorException(String str, u47 u47) {
        super(str);
        this.a = u47;
    }
}
