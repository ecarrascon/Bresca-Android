package dev.carrascon.bresca;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BackendApi {
    @POST("/api/auth/google")
    Call<User> authenticateWithGoogle(@Body RequestBody idToken);
}
