package org.createcode.mcp.server.csdn.infrastructure.gateway.dto;

import lombok.Data;

/**
 * @description 保存文章响应结果
 * @author KirateSuly
 * @create 2026-09-29
 */
@Data
public class SaveArticleResponseDTO {

    private Integer code;

    private String traceId;

    private SaveArticleDataDTO data;

    private String msg;
}
