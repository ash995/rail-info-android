package com.ashwin.railinfo.data;

import com.ashwin.railinfo.data.model.PnrResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ashwin on 7/3/18.
 */

public interface ApiService {

    @GET("pnr")
    Observable<PnrResponse> getPnrResponse(
            @Query("key") String apiKey,
            @Query("pnr") String pnr
    );
}
