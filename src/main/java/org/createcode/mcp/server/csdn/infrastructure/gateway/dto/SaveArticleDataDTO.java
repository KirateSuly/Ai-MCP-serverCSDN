package org.createcode.mcp.server.csdn.infrastructure.gateway.dto;

import lombok.Data;

/**
 * @description 保存文章响应数据
 * @author KirateSuly
 * @create 2026-09-29
 */
@Data
public class SaveArticleDataDTO {

    private String url;

    private Long article_id;

    private String title;

    private String description;
}
