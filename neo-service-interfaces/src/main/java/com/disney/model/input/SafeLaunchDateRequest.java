package com.disney.model.input;

import com.disney.util.LauchDateTimeSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.joda.time.DateTime;

/**
 * Created by muralinavaneethan on 1/15/18.
 */
public class SafeLaunchDateRequest {

    @JsonSerialize(using = LauchDateTimeSerializer.class)
    private DateTime startDate;
    @JsonSerialize(using = LauchDateTimeSerializer.class)
    private DateTime endDate;

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
