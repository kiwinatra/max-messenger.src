package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonTypeMismatchException;

public class InternalIdResponse {
    public static final op7 PARSER = new n77(3);
    public final String error;
    public final String name;
    public final long okId;

    public InternalIdResponse(long j, String str, String str2) {
        this.okId = j;
        this.name = str;
        this.error = str2;
    }

    public static InternalIdResponse parse(sp7 sp7) throws IOException, JsonTypeMismatchException {
        sp7.t();
        long j = 0;
        String str = null;
        String str2 = null;
        while (sp7.hasNext()) {
            String name2 = sp7.name();
            name2.getClass();
            char c = 65535;
            switch (name2.hashCode()) {
                case 3373707:
                    if (name2.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96784904:
                    if (name2.equals("error")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105793118:
                    if (name2.equals("ok_id")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = sp7.I();
                    break;
                case 1:
                    str2 = sp7.I();
                    break;
                case 2:
                    j = sp7.x();
                    break;
                default:
                    sp7.A();
                    break;
            }
        }
        sp7.r();
        return new InternalIdResponse(j, str, str2);
    }
}
