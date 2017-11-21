package nova.sampleretrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017-11-21.
 */

public interface ApiService {
    public static final String API_URL = "http://jsonplaceholder.typicode.com/";


    //int Version
    @GET("comments")
    Call<ResponseBody> getComment(@Query("postId") int postId);

    @POST("comments")
    Call<ResponseBody> getPostComment(@Query("postId") int postId);


    //스트링 버전
    @GET("comments")
    Call<ResponseBody> getCommentStr(@Query("postId") String postId);

    @FormUrlEncoded
    @POST("comments")
    Call<ResponseBody> getPostCommentStr(@Field("postId") String postId);



}
