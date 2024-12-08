package com.jovan.blog.common.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * HTML模板工具类
 */
@Slf4j
public class TemplateUtils {
    
    /**
     * 生成文章HTML
     */
/*    public static String generateArticleHtml(String title, String content, String authorName, String createTime) {
        return String.format("""
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>%s</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        line-height: 1.6;
                        max-width: 800px;
                        margin: 0 auto;
                        padding: 20px;
                    }
                    .article-title {
                        font-size: 24px;
                        font-weight: bold;
                        margin-bottom: 10px;
                    }
                    .article-meta {
                        color: #666;
                        font-size: 14px;
                        margin-bottom: 20px;
                    }
                    .article-content {
                        font-size: 16px;
                    }
                    pre {
                        background-color: #f5f5f5;
                        padding: 10px;
                        border-radius: 4px;
                        overflow-x: auto;
                    }
                    code {
                        font-family: Consolas, monospace;
                    }
                    img {
                        max-width: 100%%;
                        height: auto;
                    }
                    table {
                        border-collapse: collapse;
                        width: 100%%;
                        margin: 10px 0;
                    }
                    th, td {
                        border: 1px solid #ddd;
                        padding: 8px;
                        text-align: left;
                    }
                    th {
                        background-color: #f5f5f5;
                    }
                </style>
            </head>
            <body>
                <div class="article-title">%s</div>
                <div class="article-meta">
                    作者：%s | 发布时间：%s
                </div>
                <div class="article-content">
                    %s
                </div>
            </body>
            </html>
            """, title, title, authorName, createTime, content);
    }*/
} 