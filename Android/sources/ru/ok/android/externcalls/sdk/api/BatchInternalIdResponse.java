package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public class BatchInternalIdResponse {
    public static final op7 PARSER = new fm0(0);
    public final Map<ParticipantId, ue1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, ue1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(sp7 sp7) throws IOException, JsonTypeMismatchException {
        HashMap hashMap = new HashMap();
        sp7.t();
        while (sp7.hasNext()) {
            if (sp7.name().equals("ids")) {
                readIdsArray(sp7, hashMap);
            } else {
                sp7.A();
            }
        }
        sp7.r();
        return new BatchInternalIdResponse(hashMap);
    }

    private static ParticipantId readExternalId(sp7 sp7) throws IOException, JsonTypeMismatchException {
        sp7.t();
        String str = null;
        Boolean bool = null;
        while (sp7.hasNext()) {
            String name = sp7.name();
            name.getClass();
            if (name.equals("id")) {
                str = sp7.I();
            } else if (!name.equals("ok_anonym")) {
                sp7.A();
            } else {
                bool = Boolean.valueOf(sp7.b0());
            }
        }
        sp7.r();
        if (str == null || bool == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(str, bool.booleanValue());
    }

    private static void readIdMapping(sp7 sp7, Map<ParticipantId, ue1> map) throws IOException, JsonTypeMismatchException {
        sp7.t();
        ue1 ue1 = null;
        ParticipantId participantId = null;
        while (sp7.hasNext()) {
            String name = sp7.name();
            name.getClass();
            if (name.equals("external_user_id")) {
                participantId = readExternalId(sp7);
            } else if (!name.equals("ok_user_id")) {
                sp7.A();
            } else {
                ue1 = ue1.a(sp7.I());
            }
        }
        sp7.r();
        if (ue1 != null && participantId != null) {
            map.put(participantId, ue1);
        }
    }

    private static void readIdsArray(sp7 sp7, Map<ParticipantId, ue1> map) throws IOException, JsonTypeMismatchException {
        sp7.v();
        while (sp7.hasNext()) {
            readIdMapping(sp7, map);
        }
        sp7.u();
    }
}
