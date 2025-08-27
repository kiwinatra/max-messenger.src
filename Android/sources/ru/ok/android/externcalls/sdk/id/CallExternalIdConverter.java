package ru.ok.android.externcalls.sdk.id;

public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(e51 e51) {
        if (e51 == null) {
            return null;
        }
        return new ParticipantId(e51.a, e51.b == 3, e51.c);
    }
}
