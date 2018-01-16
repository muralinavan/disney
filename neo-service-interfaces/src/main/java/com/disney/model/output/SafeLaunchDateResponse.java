package com.disney.model.output;

import com.disney.util.LauchDateTimeSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.joda.time.DateTime;

/**
 * Created by muralinavaneethan on 1/15/18.
 */
public class SafeLaunchDateResponse {

    @JsonSerialize(using = LauchDateTimeSerializer.class)
    private DateTime safestLaunchDate;

    public DateTime getSafestLaunchDate() {
        return safestLaunchDate;
    }

    public void setSafestLaunchDate(DateTime safestLaunchDate) {
        this.safestLaunchDate = safestLaunchDate;
    }
}
