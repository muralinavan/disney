package com.disney.service.proxy;

import com.disney.service.proxy.impl.NasaApiResult;
import jxl.write.DateTime;

/**
 * Created by muralinavaneethan on 1/15/18.
 */
public interface NasaService {

    NasaApiResult getNeoFeed(DateTime startDate, DateTime endDate) throws Exception;

}
