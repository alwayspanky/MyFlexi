package com.example.myflexistay.Api;

import com.example.myflexistay.Model.Amenities;
import com.example.myflexistay.Model.Apartment_BHK;
import com.example.myflexistay.Model.Apartment_Type;
import com.example.myflexistay.Model.Availability;
import com.example.myflexistay.Model.CountryModel;
import com.example.myflexistay.Model.Facing;
import com.example.myflexistay.Model.Furnishing;
import com.example.myflexistay.Model.Furnishing_Status;
import com.example.myflexistay.Model.ListingTypeModel;
import com.example.myflexistay.Model.LoginModel;
import com.example.myflexistay.Model.Parking;
import com.example.myflexistay.Model.PropertyClassesModel;
import com.example.myflexistay.Model.Property_Age;
import com.example.myflexistay.Model.RegisterModel;
import com.example.myflexistay.Model.SendOtpModel;
import com.example.myflexistay.Model.Tenant;
import com.example.myflexistay.Model.UserTypeModel;
import com.example.myflexistay.Model.ValidateOtpModel;
import com.example.myflexistay.Model.WaterSupply;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    public static String BaseUrl = "https://acabc9536i.execute-api.ap-south-1.amazonaws.com/development/";


    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("login")
    Call<JsonObject> LoginMethodPost(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("registerUser")
    Call<JsonObject> RegisterMethodPost(@Body JsonObject data);



    @GET("getAllContries")
    Call<List<CountryModel>> getAllContries();

    @GET("getCountry")
    Call<CountryModel> getAllCountries();

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("getSalt")
    Call<JsonObject> SaltMethodPost (@Body JsonObject data);

    @GET("getUserTypes")
    Call<UserTypeModel> getAllUserType();


    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("sendOtp")
    Call<JsonObject> sendOtpMethodPost(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("validateOtp")
    Call<JsonObject> validateMethodPost(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("getProfile")
    Call<JsonObject> profileMethodPost(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @GET("getPropertyTypes")
    Call<Apartment_Type> getAllApartment();

    @GET("getAllBHKTypes")
    Call<Apartment_BHK> getAllBHK();

    @GET("getPropertyAgeTypes")
    Call<Property_Age> getAllPropertyAges();

    @GET("getFacingTypes")
    Call<Facing> getAllFacing();

    @GET("getTenantTypes")
    Call<Tenant> getTenantTypes();

    @GET("getParkingFacilityTypes")
    Call<Parking> getParking();

    @GET("getAvailabilityTypes")
    Call<Availability> getAvailability();

    @GET("getAmenities")
    Call<Amenities> getAmenities();


    // Post Property Details Api request

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createOrUpdatePropertyDetails")
    Call<JsonObject> postPropertyDetails(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createOrUpdateLocalityDetails")
    Call<JsonObject> postLocalityDetails(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createOrUpdateRentailDetails")
    Call<JsonObject> postRentalDetails(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createOrUpdateAmenitiesDetails")
    Call<JsonObject> postAmenityDetails(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("addMedia")
    Call<JsonObject> postAddMedia(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createOrUpdateSchedule")
    Call<JsonObject> postScheduleDetails(@Body JsonObject data);


    //Post Property Details Api request

    @GET("getListingTypes")
    Call<ListingTypeModel> getListingType();

    @GET("getLiPropertyClasses")
    Call<PropertyClassesModel> getPropertyClasses();

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("createListing")
    Call<JsonObject> createListing(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("getCities")
    Call<JsonObject> postCities(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("getLocalities")
    Call<JsonObject> postLocalities(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("addAmenity")
    Call<JsonObject> addAmenities(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("updateFurnishing")
    Call<JsonObject> postUpdateFurnishing(@Body JsonObject data);

    @GET("getFurnishingStatus")
    Call<Furnishing_Status> getFurnishingStatus();

    @GET("getWaterSupplyType")
    Call<WaterSupply> getWaterSupply();

    @GET("getFurnishings")
    Call<Furnishing> getFurnishing();

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("unlistListing")
    Call<JsonObject> postunlistting(@Body JsonObject data);

    @Headers({"Content-type: application/json","Accept: */*"})
    @POST("publishListing")
    Call<JsonObject> postPublishListing(@Body JsonObject data);

}
