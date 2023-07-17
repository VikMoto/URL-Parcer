package com.parser.client;


import com.parser.domain.URL;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.Set;

public interface URLFeederService {

    @POST("/batch")
    Call<Void> batchPublish(@Body Set<URL> urls);
}
