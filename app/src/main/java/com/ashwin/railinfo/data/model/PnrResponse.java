package com.ashwin.railinfo.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ashwin on 13/3/18.
 */

public class PnrResponse {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("result")
    @Expose
    private PnrResult pnrResult;

    private static class PnrResult {

        @SerializedName("pnr")
        @Expose
        private String pnr;

        @SerializedName("journey")
        @Expose
        private String journeyDate;

        @SerializedName("trainno")
        @Expose
        private String trainNumber;

        @SerializedName("name")
        @Expose
        private String trainName;

        @SerializedName("chart")
        @Expose
        private String chartResult;

        @SerializedName("error")
        @Expose
        private String error;

        @SerializedName("from")
        @Expose
        private String fromStationCode;

        @SerializedName("to")
        @Expose
        private String toStationCode;

        @SerializedName("brdg")
        @Expose
        private String boardingStationCode;

        @SerializedName("passengers")
        @Expose
        private List<Passenger> passengers;
    }

    private static class Passenger {

        @SerializedName("bookingstatus")
        @Expose
        private String bookingStatus;

        @SerializedName("currentstatus")
        @Expose
        private String currentStatus;

        @SerializedName("coach")
        @Expose
        private String coach;
    }
}
