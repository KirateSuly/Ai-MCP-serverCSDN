package org.createcode.mcp.server.csdn.infrastructure.gateway;

import org.createcode.mcp.server.csdn.infrastructure.gateway.dto.SaveArticleRequestDTO;
import org.createcode.mcp.server.csdn.infrastructure.gateway.dto.SaveArticleResponseDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @description CSDN 博客控制台接口
 * @author KirateSuly
 * @create 2026-09-29
 */
public interface ICSDNService {

    /**
     * 网关地址
     */
    String BASE_URL = "https://bizapi.csdn.net/";

    /**
     * 保存/发布文章
     *
     * @param cookie  登录态 Cookie
     * @param request 文章信息
     * @return 保存结果
     */
    @POST("blog-console-api/v1/postedit/saveArticle")
    @Headers({
            "Content-Type: application/json",
            "x-ca-key: 203803574",
            "x-ca-signature-headers: x-ca-key,x-ca-nonce"
    })
    Call<SaveArticleResponseDTO> saveArticle(@Header("Cookie") String cookie,
                                             @Body SaveArticleRequestDTO request);
}
