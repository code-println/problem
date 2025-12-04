package org.zalando.problem.jackson;

import org.zalando.problem.StatusType;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

final class StatusTypeSerializer extends ValueSerializer<StatusType> {

    @Override
    public void serialize(final StatusType status, final JsonGenerator json, final SerializationContext serializers) {
        json.writeNumber(status.getStatusCode());
    }

}
