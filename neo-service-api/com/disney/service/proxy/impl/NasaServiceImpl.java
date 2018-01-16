package com.disney.service.proxy.impl;

import com.disney.service.proxy.NasaService;
import jxl.write.DateTime;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jettison.json.JSONObject;

import java.util.Properties;

/**
 * Created by muralinavaneethan on 1/15/18.
 */
public class NasaServiceImpl implements NasaService {

    private final String NASA_API_URL = "https://api.nasa.gov/neo/rest/v1/feed?api_key=H7V98iNStSoR1hRBQJgIMHWee0W6Pf5qvfyVLk4X";

    public NasaApiResult getNeoFeed(DateTime startDate, DateTime endDate) throws Exception {
        BuildRestRequest buildRestRequest = new BuildRestRequest();
        HttpPost post;
        HttpResponse response;
        BuildRestResponse buildRestResponse = new BuildRestResponse();
        HttpClient httpClient = new DefaultHttpClient();
        String payload = createGetPostingSetupPayload(resalePurchaseResponse);
        String url = prop.getProperty("getPostingSetup.url");

        post = buildRestRequest.builRestRequest(url,payload);
        response = httpClient.execute(post);
        JSONObject obj = buildRestResponse.buildRestResponse(response);
    }

    private HttpPost builRestRequest(DateTime startDate, DateTime endDate) throws Exception {
        start_date=2015-09-07&end_date=2015-09-08&
        StringBuffer sb = new StringBuffer(NASA_API_URL);
        sb.append("&start_date=");
        sb.append(startDate.toString())

        post = new HttpPost(url);



        return post;



    }

}
