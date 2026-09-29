package org.createcode.mcp.server.csdn;

import org.createcode.mcp.server.csdn.infrastructure.gateway.ICSDNService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@SpringBootApplication
public class McpServerApplication {

    @Bean
    public ICSDNService icsdnService() {
        return new Retrofit.Builder()
                .baseUrl(ICSDNService.BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ICSDNService.class);
    }
}
