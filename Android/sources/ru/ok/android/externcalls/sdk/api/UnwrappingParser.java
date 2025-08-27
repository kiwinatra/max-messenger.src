package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

public final class UnwrappingParser<T> implements op7 {
    private final String fieldName;
    private final op7 valueParser;

    public UnwrappingParser(String str, op7 op7) {
        this.fieldName = str;
        this.valueParser = op7;
    }

    public T parse(sp7 sp7) throws IOException, JsonParseException {
        sp7.t();
        T t = null;
        while (sp7.hasNext()) {
            if (this.fieldName.equals(sp7.name())) {
                t = this.valueParser.parse(sp7);
            }
        }
        sp7.r();
        if (t != null) {
            return t;
        }
        throw new Exception(wj6.n(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
