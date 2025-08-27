package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ExternalIdsResponse {
    public static final op7 INSTANCE = new op7() {
        private void parseIds(Map<ue1, ParticipantId> map, sp7 sp7, boolean z) throws IOException, JsonTypeMismatchException {
            sp7.t();
            while (sp7.hasNext()) {
                String name = sp7.name();
                try {
                    map.put(ue1.a(name), ParticipantId.withoutDeviceId(sp7.I(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + name + "'");
                }
            }
            sp7.r();
        }

        public ExternalIdsResponse parse(sp7 sp7) throws IOException, JsonParseException {
            HashMap hashMap = new HashMap();
            sp7.t();
            while (sp7.hasNext()) {
                String name = sp7.name();
                name.getClass();
                if (name.equals("external_ids")) {
                    parseIds(hashMap, sp7, false);
                } else if (!name.equals("anonym_ids")) {
                    sp7.A();
                } else {
                    parseIds(hashMap, sp7, true);
                }
            }
            sp7.r();
            return new ExternalIdsResponse(hashMap);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<ue1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<ue1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<ue1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
