package org.createcode.mcp.server.csdn.infrastructure.gateway.dto;

import lombok.Data;

import java.util.List;

/**
 * @description 保存文章请求参数
 * @author KirateSuly
 * @create 2026-09-29
 */
@Data
public class SaveArticleRequestDTO {

    private String article_id;

    private String title;

    private String description;

    private String content;

    private String tags;

    private String categories;

    private String type;

    private Integer status;

    private String read_type;

    private Integer creation_statement;

    private String reason;

    private String original_link;

    private Boolean authorized_status;

    private Boolean check_original;

    private String source;

    private Integer not_auto_saved;

    private String creator_activity_id;

    private List<String> cover_images;

    private Integer cover_type;

    private Integer vote_id;

    private String resource_id;

    private Long scheduled_time;

    private Integer template_id;

    private Integer is_new;

    private Integer sync_git_code;
}
